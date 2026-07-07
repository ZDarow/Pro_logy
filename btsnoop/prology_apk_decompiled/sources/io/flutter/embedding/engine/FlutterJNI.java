package io.flutter.embedding.engine;

import B2.AbstractC0007h;
import B2.C0009j;
import B2.t;
import B2.u;
import C.C0016c;
import C2.b;
import C2.g;
import C2.h;
import D2.f;
import D2.j;
import D2.k;
import E2.a;
import F2.c;
import I.C0044m;
import L2.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import b0.i;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.n;
import io.flutter.plugin.platform.o;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.d;
import io.flutter.view.q;
import io.flutter.view.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static h asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private g accessibilityDelegate;
    private a deferredComponentManager;
    private M2.a localizationPlugin;
    private Long nativeShellHolderId;
    private k platformMessageHandler;
    private o platformViewsController;
    private n platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.k> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j4) {
        h hVar = asyncWaitForVsyncDelegate;
        if (hVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.a aVar = (io.flutter.view.a) hVar;
        aVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        r rVar = (r) aVar.f6423a;
        q qVar = rVar.f6551c;
        if (qVar != null) {
            qVar.f6545l = j4;
            rVar.f6551c = null;
        } else {
            qVar = new q(rVar, j4);
        }
        choreographer.postFrameCallback(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [C2.f] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j4) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: C2.f
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$1(j4, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
            } catch (IOException e4) {
                Log.e(TAG, "Failed to decode image", e4);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i4, ByteBuffer byteBuffer) {
        e eVar;
        k kVar = this.platformMessageHandler;
        if (kVar == null || (eVar = (e) ((j) kVar).f498q.remove(Integer.valueOf(i4))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e4) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e4;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e4);
        } catch (Exception e5) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$1(long j4, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
        nativeImageHeaderCallback(j4, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j4);

    private native void nativeDeferredComponentInstallFailure(int i4, String str, boolean z4);

    private native void nativeDestroy(long j4);

    private native void nativeDispatchEmptyPlatformMessage(long j4, String str, int i4);

    private native void nativeDispatchPlatformMessage(long j4, String str, ByteBuffer byteBuffer, int i4, int i5);

    private native void nativeDispatchPointerDataPacket(long j4, ByteBuffer byteBuffer, int i4);

    private native void nativeDispatchSemanticsAction(long j4, int i4, int i5, ByteBuffer byteBuffer, int i6);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i4);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i4);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i4);

    private native Bitmap nativeGetBitmap(long j4);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j4, int i4, int i5);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j4, int i4);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j4, int i4);

    private native void nativeInvokePlatformMessageResponseCallback(long j4, int i4, ByteBuffer byteBuffer, int i5);

    private native boolean nativeIsSurfaceControlEnabled(long j4);

    private native void nativeLoadDartDeferredLibrary(long j4, int i4, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j4);

    private native void nativeMarkTextureFrameAvailable(long j4, long j5);

    private native void nativeNotifyLowMemoryWarning(long j4);

    private native void nativeOnVsync(long j4, long j5, long j6);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j4, long j5, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z4);

    private native void nativeRegisterTexture(long j4, long j5, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j4, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j5);

    private native void nativeScheduleFrame(long j4);

    private native void nativeSetAccessibilityFeatures(long j4, int i4);

    private native void nativeSetSemanticsEnabled(long j4, boolean z4);

    private native void nativeSetViewportMetrics(long j4, float f4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j4, String str, String str2, String str3, List<String> list, long j5);

    private native void nativeSurfaceChanged(long j4, int i4, int i5);

    private native void nativeSurfaceCreated(long j4, Surface surface);

    private native void nativeSurfaceDestroyed(long j4);

    private native void nativeSurfaceWindowChanged(long j4, Surface surface);

    private native void nativeUnregisterTexture(long j4, long j5);

    private native void nativeUpdateDisplayMetrics(long j4);

    private native void nativeUpdateJavaAssetManager(long j4, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f4);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        g gVar = this.accessibilityDelegate;
        if (gVar != null) {
            ((io.flutter.view.g) ((io.flutter.view.a) gVar).f6423a).f6519m = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        g gVar = this.accessibilityDelegate;
        if (gVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.g gVar2 = (io.flutter.view.g) ((io.flutter.view.a) gVar).f6423a;
            gVar2.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.e b4 = gVar2.b(byteBuffer.getInt());
                b4.f6452c = byteBuffer.getInt();
                b4.f6453d = io.flutter.view.g.d(byteBuffer, strArr);
                b4.f6454e = io.flutter.view.g.d(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        g gVar = this.accessibilityDelegate;
        if (gVar != null) {
            ((io.flutter.view.a) gVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(kVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        n nVar = this.platformViewsController2;
        if (nVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction g4 = io.flutter.plugin.editing.a.g();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = nVar.w;
            if (i4 >= arrayList.size()) {
                g4.apply();
                arrayList.clear();
                return;
            } else {
                g4 = g4.merge(io.flutter.plugin.editing.a.i(arrayList.get(i4)));
                i4++;
            }
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j4) {
        nativeCleanupMessageData(j4);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale lookup;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < strArr.length; i4 += 3) {
            String str = strArr[i4];
            String str2 = strArr[i4 + 1];
            String str3 = strArr[i4 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        M2.a aVar = this.localizationPlugin;
        aVar.getClass();
        if (arrayList.isEmpty()) {
            lookup = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            LocaleList locales = aVar.f1172b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i5 = 0; i5 < size; i5++) {
                Locale locale = locales.get(i5);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList2.add(new Locale.LanguageRange(language));
                arrayList2.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList2.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            lookup = Locale.lookup(arrayList2, arrayList);
            if (lookup == null) {
                lookup = (Locale) arrayList.get(0);
            }
        }
        return lookup == null ? new String[0] : new String[]{lookup.getLanguage(), lookup.getCountry(), lookup.getScript()};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [B2.j, java.lang.Object, io.flutter.plugin.platform.d] */
    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        ?? c0009j = new C0009j(oVar.f6383o.getContext(), oVar.f6383o.getWidth(), oVar.f6383o.getHeight(), 2);
        c0009j.f6335r = oVar.f6387t;
        int i4 = oVar.f6372A;
        oVar.f6372A = i4 + 1;
        oVar.f6391y.put(i4, c0009j);
        return new FlutterOverlaySurface(i4, c0009j.getSurface());
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        n nVar = this.platformViewsController2;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (nVar.f6369y == null) {
            SurfaceControl.Builder f4 = io.flutter.plugin.editing.a.f();
            f4.setBufferSize(nVar.f6361o.getWidth(), nVar.f6361o.getHeight());
            f4.setFormat(1);
            f4.setName("Flutter Overlay Surface");
            f4.setOpaque(false);
            f4.setHidden(false);
            build = f4.build();
            SurfaceControl.Transaction k4 = i.k(i.j(nVar.f6361o), build);
            k4.setLayer(build, 1000);
            k4.apply();
            nVar.f6369y = io.flutter.plugin.editing.a.e(build);
            nVar.f6370z = build;
        }
        return new FlutterOverlaySurface(0, nVar.f6369y);
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        n nVar = this.platformViewsController2;
        if (nVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction g4 = io.flutter.plugin.editing.a.g();
        nVar.w.add(g4);
        return g4;
    }

    public void deferredComponentInstallFailure(int i4, String str, boolean z4) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i4, str, z4);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController2;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = nVar.f6369y;
        if (surface != null) {
            surface.release();
            nVar.f6369y = null;
            nVar.f6370z = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        oVar.c();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i4, int i5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i4, i5);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i5);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i4, d dVar) {
        dispatchSemanticsAction(i4, dVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        n nVar = this.platformViewsController2;
        if (nVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction g4 = io.flutter.plugin.editing.a.g();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = nVar.f6368x;
            if (i4 >= arrayList.size()) {
                arrayList.clear();
                nVar.f6361o.invalidate();
                i.s(i.j(nVar.f6361o), g4);
                return;
            }
            g4 = g4.merge(io.flutter.plugin.editing.a.i(arrayList.get(i4)));
            i4++;
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            android.support.v4.media.session.t r0 = K2.n.f1006b
            java.lang.Object r1 = r0.f3735n
            K2.m r1 = (K2.m) r1
            java.lang.Object r2 = r0.f3734m
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            if (r1 != 0) goto L14
            java.lang.Object r1 = r2.poll()
            K2.m r1 = (K2.m) r1
            r0.f3735n = r1
        L14:
            java.lang.Object r1 = r0.f3735n
            K2.m r1 = (K2.m) r1
            if (r1 == 0) goto L27
            int r3 = r1.f1004a
            if (r3 >= r8) goto L27
            java.lang.Object r1 = r2.poll()
            K2.m r1 = (K2.m) r1
            r0.f3735n = r1
            goto L14
        L27:
            r2 = 0
            java.lang.String r3 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r1 != 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.append(r1)
            java.lang.String r1 = ", after exhausting the queue."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L46:
            r1 = r2
            goto L72
        L48:
            int r5 = r1.f1004a
            if (r5 == r8) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            java.lang.String r3 = ", the oldest config is now: "
            r1.append(r3)
            java.lang.Object r0 = r0.f3735n
            K2.m r0 = (K2.m) r0
            int r0 = r0.f1004a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L46
        L72:
            if (r1 != 0) goto L75
            goto L77
        L75:
            android.util.DisplayMetrics r2 = r1.f1005b
        L77:
            if (r2 != 0) goto L98
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L98:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            float r8 = r2.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i4, long j4) {
        f fVar;
        boolean z4;
        k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j4);
            return;
        }
        j jVar = (j) kVar;
        synchronized (jVar.f496o) {
            try {
                fVar = (f) jVar.f494m.get(str);
                z4 = jVar.f497p.get() && fVar == null;
                if (z4) {
                    if (!jVar.f495n.containsKey(str)) {
                        jVar.f495n.put(str, new LinkedList());
                    }
                    ((List) jVar.f495n.get(str)).add(new D2.d(j4, byteBuffer, i4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            return;
        }
        jVar.e(str, fVar, byteBuffer, i4, j4);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        n nVar = this.platformViewsController2;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (nVar.f6370z == null) {
            return;
        }
        SurfaceControl.Transaction g4 = io.flutter.plugin.editing.a.g();
        g4.setVisibility(nVar.f6370z, false);
        g4.apply();
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j4, int i4) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j4, i4);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i4) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i4);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i4, ByteBuffer byteBuffer, int i5) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i4, byteBuffer, i5);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i4) {
        return nativeFlutterTextUtilsIsEmoji(i4);
    }

    public boolean isCodePointEmojiModifier(int i4) {
        return nativeFlutterTextUtilsIsEmojiModifier(i4);
    }

    public boolean isCodePointEmojiModifierBase(int i4) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i4);
    }

    public boolean isCodePointRegionalIndicator(int i4) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i4);
    }

    public boolean isCodePointVariantSelector(int i4) {
        return nativeFlutterTextUtilsIsVariationSelector(i4);
    }

    public void loadDartDeferredLibrary(int i4, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i4, strArr);
    }

    public void loadLibrary(Context context) {
        B1.d dVar;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C0016c c0016c = new C0016c(2);
        C0044m c0044m = new C0044m(2);
        c0044m.f850o = c0016c;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        c0044m.k("Beginning load of %s...", "flutter");
        F1.g gVar = (F1.g) c0044m.f848m;
        HashSet hashSet = (HashSet) c0044m.f847l;
        if (hashSet.contains("flutter")) {
            c0044m.k("%s already loaded previously!", "flutter");
        } else {
            try {
                gVar.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                c0044m.k("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e4) {
                c0044m.k("Loading the library normally failed: %s", Log.getStackTraceString(e4));
                c0044m.k("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File i4 = c0044m.i(context);
                if (!i4.exists()) {
                    File dir = context.getDir("lib", 0);
                    File i5 = c0044m.i(context);
                    gVar.getClass();
                    File[] listFiles = dir.listFiles(new I1.b(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(i5.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    ((L1.g) c0044m.f849n).getClass();
                    try {
                        B1.d p2 = L1.g.p(context, strArr2, mapLibraryName, c0044m);
                        try {
                            if (p2 == null) {
                                try {
                                    strArr = L1.g.q(context, mapLibraryName);
                                } catch (Exception e5) {
                                    strArr = new String[]{e5.toString()};
                                }
                                StringBuilder sb = new StringBuilder("Could not find '");
                                sb.append(mapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(Arrays.toString(strArr2));
                                sb.append(", but only found: ");
                                throw new RuntimeException(AbstractC0007h.m(sb, Arrays.toString(strArr), "."));
                            }
                            int i6 = 0;
                            while (true) {
                                int i7 = i6 + 1;
                                zipFile = (ZipFile) p2.f96m;
                                if (i6 < 5) {
                                    c0044m.k("Found %s! Extracting...", mapLibraryName);
                                    try {
                                        if (i4.exists() || i4.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((ZipEntry) p2.f97n);
                                            } catch (FileNotFoundException unused) {
                                                inputStream2 = null;
                                            } catch (IOException unused2) {
                                                inputStream2 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                fileOutputStream2 = new FileOutputStream(i4);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    long j4 = 0;
                                                    while (true) {
                                                        int read = inputStream2.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, read);
                                                        j4 += read;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                    if (j4 == i4.length()) {
                                                        L1.g.j(inputStream2);
                                                        L1.g.j(fileOutputStream2);
                                                        i4.setReadable(true, false);
                                                        i4.setExecutable(true, false);
                                                        i4.setWritable(true);
                                                        break;
                                                    }
                                                    L1.g.j(inputStream2);
                                                    L1.g.j(fileOutputStream2);
                                                } catch (FileNotFoundException unused3) {
                                                    L1.g.j(inputStream2);
                                                    L1.g.j(fileOutputStream2);
                                                    i6 = i7;
                                                } catch (IOException unused4) {
                                                    L1.g.j(inputStream2);
                                                    L1.g.j(fileOutputStream2);
                                                    i6 = i7;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    L1.g.j(inputStream);
                                                    L1.g.j(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                fileOutputStream2 = null;
                                                L1.g.j(inputStream2);
                                                L1.g.j(fileOutputStream2);
                                                i6 = i7;
                                            } catch (IOException unused6) {
                                                fileOutputStream2 = null;
                                                L1.g.j(inputStream2);
                                                L1.g.j(fileOutputStream2);
                                                i6 = i7;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                L1.g.j(inputStream);
                                                L1.g.j(fileOutputStream);
                                                throw th;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i6 = i7;
                                } else if (((C0016c) c0044m.f850o) != null) {
                                    lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                                String absolutePath = i4.getAbsolutePath();
                                gVar.getClass();
                                System.load(absolutePath);
                                hashSet.add("flutter");
                                c0044m.k("%s (%s) was re-linked!", "flutter", null);
                                loadLibraryCalled = true;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            dVar = p2;
                            if (dVar != null) {
                                try {
                                    ((ZipFile) dVar.f96m).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        dVar = null;
                    }
                }
                String absolutePath2 = i4.getAbsolutePath();
                gVar.getClass();
                System.load(absolutePath2);
                hashSet.add("flutter");
                c0044m.k("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j4);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        oVar.f6375D.clear();
        oVar.f6376E.clear();
    }

    public void onDisplayOverlaySurface(int i4, int i5, int i6, int i7, int i8) {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = oVar.f6391y;
        if (sparseArray.get(i4) == null) {
            throw new IllegalStateException(AbstractC0007h.j(i4, "The overlay surface (id:", ") doesn't exist"));
        }
        oVar.h();
        View view = (io.flutter.plugin.platform.d) sparseArray.get(i4);
        if (view.getParent() == null) {
            oVar.f6383o.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        oVar.f6375D.add(Integer.valueOf(i4));
    }

    public void onDisplayPlatformView(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        oVar.h();
        SparseArray sparseArray = oVar.w;
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) sparseArray.get(i4);
        if (fVar == null) {
            return;
        }
        SparseArray sparseArray2 = oVar.f6390x;
        if (sparseArray2.get(i4) == null) {
            SurfaceView surfaceView = ((U2.a) fVar).f2523a;
            if (surfaceView == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (surfaceView.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = oVar.f6382n;
            G2.b bVar = new G2.b(activity, activity.getResources().getDisplayMetrics().density, oVar.f6381m);
            bVar.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.j(oVar, i4, 0));
            sparseArray2.put(i4, bVar);
            surfaceView.setImportantForAccessibility(4);
            bVar.addView(surfaceView);
            oVar.f6383o.addView(bVar);
        }
        G2.b bVar2 = (G2.b) sparseArray2.get(i4);
        bVar2.f688l = flutterMutatorsStack;
        bVar2.f690n = i5;
        bVar2.f691o = i6;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        bVar2.setLayoutParams(layoutParams);
        bVar2.setWillNotDraw(false);
        bVar2.setVisibility(0);
        bVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i9, i10);
        SurfaceView surfaceView2 = ((U2.a) ((io.flutter.plugin.platform.f) sparseArray.get(i4))).f2523a;
        if (surfaceView2 != null) {
            surfaceView2.setLayoutParams(layoutParams2);
            surfaceView2.bringToFront();
        }
        oVar.f6376E.add(Integer.valueOf(i4));
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController2;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        SparseArray sparseArray = nVar.f6365t;
        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) sparseArray.get(i4);
        if (fVar == null) {
            return;
        }
        SparseArray sparseArray2 = nVar.f6366u;
        if (sparseArray2.get(i4) == null) {
            SurfaceView surfaceView = ((U2.a) fVar).f2523a;
            if (surfaceView == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (surfaceView.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = nVar.f6360n;
            G2.b bVar = new G2.b(activity, activity.getResources().getDisplayMetrics().density, nVar.f6359m);
            bVar.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.j(nVar, i4, 1));
            sparseArray2.put(i4, bVar);
            surfaceView.setImportantForAccessibility(4);
            bVar.addView(surfaceView);
            nVar.f6361o.addView(bVar);
        }
        G2.b bVar2 = (G2.b) sparseArray2.get(i4);
        bVar2.f688l = flutterMutatorsStack;
        bVar2.f690n = i5;
        bVar2.f691o = i6;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        bVar2.setLayoutParams(layoutParams);
        bVar2.setWillNotDraw(false);
        bVar2.setVisibility(0);
        bVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i9, i10);
        SurfaceView surfaceView2 = ((U2.a) ((io.flutter.plugin.platform.f) sparseArray.get(i4))).f2523a;
        if (surfaceView2 != null) {
            surfaceView2.setLayoutParams(layoutParams2);
            surfaceView2.bringToFront();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public void onEndFrame() {
        ?? r32;
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z4 = false;
        if (!oVar.f6373B || !oVar.f6376E.isEmpty()) {
            if (oVar.f6373B) {
                C0009j c0009j = oVar.f6383o.f202n;
                if (c0009j != null ? c0009j.e() : false) {
                    z4 = true;
                }
            }
            oVar.e(z4);
            return;
        }
        oVar.f6373B = false;
        u uVar = oVar.f6383o;
        c cVar = new c(6, oVar);
        C0009j c0009j2 = uVar.f202n;
        if (c0009j2 == null || (r32 = uVar.f204p) == 0) {
            return;
        }
        uVar.f203o = r32;
        uVar.f204p = null;
        io.flutter.embedding.engine.renderer.j jVar = uVar.s.f346b;
        if (jVar != null) {
            r32.d();
            t tVar = new t(uVar, jVar, cVar);
            jVar.f6245a.addIsDisplayingFlutterUiListener(tVar);
            if (jVar.f6248d) {
                tVar.b();
                return;
            }
            return;
        }
        c0009j2.c();
        C0009j c0009j3 = uVar.f202n;
        if (c0009j3 != null) {
            c0009j3.f164l.close();
            uVar.removeView(uVar.f202n);
            uVar.f202n = null;
        }
        cVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i4, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i4, i5);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j4, long j5, long j6) {
        nativeOnVsync(j4, j5, j6);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j4, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference<>(textureRegistry$ImageConsumer), z4);
    }

    public void registerTexture(long j4, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.k kVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(kVar);
    }

    public void requestDartDeferredLibrary(int i4) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j4);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(g gVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = gVar;
    }

    public void setAccessibilityFeatures(int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i4);
        }
    }

    public void setAccessibilityFeaturesInNative(int i4) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i4);
    }

    public void setAsyncWaitForVsyncDelegate(h hVar) {
        asyncWaitForVsyncDelegate = hVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(M2.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(o oVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = oVar;
    }

    public void setPlatformViewsController2(n nVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = nVar;
    }

    public void setRefreshRateFPS(float f4) {
        refreshRateFPS = f4;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z4);
        }
    }

    public void setSemanticsEnabledInNative(boolean z4) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z4);
    }

    public void setViewportMetrics(float f4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f4, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, iArr, iArr2, iArr3);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        n nVar = this.platformViewsController2;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (nVar.f6370z == null) {
            return;
        }
        SurfaceControl.Transaction g4 = io.flutter.plugin.editing.a.g();
        g4.setVisibility(nVar.f6370z, true);
        g4.apply();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j4);
        Long l4 = nativeSpawn.nativeShellHolderId;
        if ((l4 == null || l4.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        n nVar = this.platformViewsController2;
        if (nVar == null) {
            throw new RuntimeException("");
        }
        synchronized (nVar) {
            try {
                nVar.f6368x.clear();
                for (int i4 = 0; i4 < nVar.w.size(); i4++) {
                    nVar.f6368x.add(io.flutter.plugin.editing.a.i(nVar.w.get(i4)));
                }
                nVar.w.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterTexture(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j4);
    }

    public void updateDisplayMetrics(int i4, float f4, float f5, float f6) {
        displayWidth = f4;
        displayHeight = f5;
        displayDensity = f6;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i4, d dVar, Object obj) {
        ByteBuffer byteBuffer;
        int i5;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = L2.u.f1096a.b(obj);
            i5 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i5 = 0;
        }
        dispatchSemanticsAction(i4, dVar.f6449l, byteBuffer, i5);
    }

    public void dispatchSemanticsAction(int i4, int i5, ByteBuffer byteBuffer, int i6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i4, i5, byteBuffer, i6);
    }
}
