package io.flutter.embedding.engine;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final java.lang.String TAG = "FlutterJNI";
    private static p013C2.InterfaceC0143h asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static java.lang.String vmServiceUri;
    private p013C2.InterfaceC0142g accessibilityDelegate;
    private p023E2.InterfaceC0197a deferredComponentManager;
    private p051M2.C0428a localizationPlugin;
    private java.lang.Long nativeShellHolderId;
    private p018D2.InterfaceC0185k platformMessageHandler;
    private io.flutter.plugin.platform.C1592o platformViewsController;
    private io.flutter.plugin.platform.C1591n platformViewsController2;
    private java.util.concurrent.locks.ReentrantReadWriteLock shellHolderLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private final java.util.Set<p013C2.InterfaceC0137b> engineLifecycleListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<io.flutter.embedding.engine.renderer.InterfaceC1562k> flutterUiDisplayListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private final android.os.Looper mainLooper = android.os.Looper.getMainLooper();

    private static void asyncWaitForVsync(long j4) {
        p013C2.InterfaceC0143h interfaceC0143h = asyncWaitForVsyncDelegate;
        if (interfaceC0143h == null) {
            throw new java.lang.IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.C1604a c1604a = (io.flutter.view.C1604a) interfaceC0143h;
        c1604a.getClass();
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        io.flutter.view.C1621r c1621r = (io.flutter.view.C1621r) c1604a.f6662a;
        io.flutter.view.ChoreographerFrameCallbackC1620q choreographerFrameCallbackC1620q = c1621r.f6798c;
        if (choreographerFrameCallbackC1620q != null) {
            choreographerFrameCallbackC1620q.f6792l = j4;
            c1621r.f6798c = null;
        } else {
            choreographerFrameCallbackC1620q = new io.flutter.view.ChoreographerFrameCallbackC1620q(c1621r, j4);
        }
        choreographer.postFrameCallback(choreographerFrameCallbackC1620q);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [C2.f] */
    public static android.graphics.Bitmap decodeImage(java.nio.ByteBuffer byteBuffer, final long j4) {
        android.graphics.ImageDecoder.Source createSource;
        android.graphics.Bitmap decodeBitmap;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            createSource = android.graphics.ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = android.graphics.ImageDecoder.decodeBitmap(createSource, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: C2.f
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
                        io.flutter.embedding.engine.FlutterJNI.lambda$decodeImage$1(j4, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
            } catch (java.io.IOException e4) {
                android.util.Log.e(TAG, "Failed to decode image", e4);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new java.lang.RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new java.lang.RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (android.os.Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new java.lang.RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + java.lang.Thread.currentThread().getName());
    }

    public static java.lang.String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i4, java.nio.ByteBuffer byteBuffer) {
        p047L2.InterfaceC0375e interfaceC0375e;
        p018D2.InterfaceC0185k interfaceC0185k = this.platformMessageHandler;
        if (interfaceC0185k == null || (interfaceC0375e = (p047L2.InterfaceC0375e) ((p018D2.C0184j) interfaceC0185k).f507q.remove(java.lang.Integer.valueOf(i4))) == null) {
            return;
        }
        try {
            interfaceC0375e.mo289a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (java.lang.Error e4) {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e4;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e4);
        } catch (java.lang.Exception e5) {
            android.util.Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$1(long j4, android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
        android.util.Size size;
        imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
        nativeImageHeaderCallback(j4, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(java.lang.String str) {
    }

    private native long nativeAttach(io.flutter.embedding.engine.FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j4);

    private native void nativeDeferredComponentInstallFailure(int i4, java.lang.String str, boolean z4);

    private native void nativeDestroy(long j4);

    private native void nativeDispatchEmptyPlatformMessage(long j4, java.lang.String str, int i4);

    private native void nativeDispatchPlatformMessage(long j4, java.lang.String str, java.nio.ByteBuffer byteBuffer, int i4, int i5);

    private native void nativeDispatchPointerDataPacket(long j4, java.nio.ByteBuffer byteBuffer, int i4);

    private native void nativeDispatchSemanticsAction(long j4, int i4, int i5, java.nio.ByteBuffer byteBuffer, int i6);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i4);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i4);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i4);

    private native android.graphics.Bitmap nativeGetBitmap(long j4);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j4, int i4, int i5);

    private static native void nativeInit(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j4, int i4);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j4, int i4);

    private native void nativeInvokePlatformMessageResponseCallback(long j4, int i4, java.nio.ByteBuffer byteBuffer, int i5);

    private native boolean nativeIsSurfaceControlEnabled(long j4);

    private native void nativeLoadDartDeferredLibrary(long j4, int i4, java.lang.String[] strArr);

    @java.lang.Deprecated
    public static native io.flutter.view.FlutterCallbackInformation nativeLookupCallbackInformation(long j4);

    private native void nativeMarkTextureFrameAvailable(long j4, long j5);

    private native void nativeNotifyLowMemoryWarning(long j4);

    private native void nativeOnVsync(long j4, long j5, long j6);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j4, long j5, java.lang.ref.WeakReference<io.flutter.view.TextureRegistry$ImageConsumer> weakReference, boolean z4);

    private native void nativeRegisterTexture(long j4, long j5, java.lang.ref.WeakReference<io.flutter.embedding.engine.renderer.SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j4, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager, java.util.List<java.lang.String> list, long j5);

    private native void nativeScheduleFrame(long j4);

    private native void nativeSetAccessibilityFeatures(long j4, int i4);

    private native void nativeSetSemanticsEnabled(long j4, boolean z4);

    private native void nativeSetViewportMetrics(long j4, float f4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3);

    private native io.flutter.embedding.engine.FlutterJNI nativeSpawn(long j4, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, long j5);

    private native void nativeSurfaceChanged(long j4, int i4, int i5);

    private native void nativeSurfaceCreated(long j4, android.view.Surface surface);

    private native void nativeSurfaceDestroyed(long j4);

    private native void nativeSurfaceWindowChanged(long j4, android.view.Surface surface);

    private native void nativeUnregisterTexture(long j4, long j5);

    private native void nativeUpdateDisplayMetrics(long j4);

    private native void nativeUpdateJavaAssetManager(long j4, android.content.res.AssetManager assetManager, java.lang.String str);

    private native void nativeUpdateRefreshRate(float f4);

    private void onPreEngineRestart() {
        java.util.Iterator<p013C2.InterfaceC0137b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().mo471a();
        }
    }

    private void setApplicationLocale(java.lang.String str) {
        ensureRunningOnMainThread();
        p013C2.InterfaceC0142g interfaceC0142g = this.accessibilityDelegate;
        if (interfaceC0142g != null) {
            ((io.flutter.view.C1610g) ((io.flutter.view.C1604a) interfaceC0142g).f6662a).f6764m = str;
        }
    }

    private void updateCustomAccessibilityActions(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
        ensureRunningOnMainThread();
        p013C2.InterfaceC0142g interfaceC0142g = this.accessibilityDelegate;
        if (interfaceC0142g != null) {
            byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.C1610g c1610g = (io.flutter.view.C1610g) ((io.flutter.view.C1604a) interfaceC0142g).f6662a;
            c1610g.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.C1608e m3560b = c1610g.m3560b(byteBuffer.getInt());
                m3560b.f6694c = byteBuffer.getInt();
                m3560b.f6695d = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
                m3560b.f6696e = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        p013C2.InterfaceC0142g interfaceC0142g = this.accessibilityDelegate;
        if (interfaceC0142g != null) {
            ((io.flutter.view.C1604a) interfaceC0142g).m3520a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(p013C2.InterfaceC0137b interfaceC0137b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC0137b);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.InterfaceC1562k interfaceC1562k) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(interfaceC1562k);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void applyTransactions() {
        io.flutter.plugin.platform.C1591n c1591n = this.platformViewsController2;
        if (c1591n == null) {
            throw new java.lang.RuntimeException("");
        }
        android.view.SurfaceControl.Transaction m3462g = io.flutter.plugin.editing.AbstractC1565a.m3462g();
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = c1591n.f6604w;
            if (i4 >= arrayList.size()) {
                m3462g.apply();
                arrayList.clear();
                return;
            } else {
                m3462g = m3462g.merge(io.flutter.plugin.editing.AbstractC1565a.m3464i(arrayList.get(i4)));
                i4++;
            }
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = java.lang.Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j4) {
        nativeCleanupMessageData(j4);
    }

    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] strArr) {
        java.util.Locale lookup;
        if (this.localizationPlugin == null) {
            return new java.lang.String[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < strArr.length; i4 += 3) {
            java.lang.String str = strArr[i4];
            java.lang.String str2 = strArr[i4 + 1];
            java.lang.String str3 = strArr[i4 + 2];
            java.util.Locale.Builder builder = new java.util.Locale.Builder();
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
        p051M2.C0428a c0428a = this.localizationPlugin;
        c0428a.getClass();
        if (arrayList.isEmpty()) {
            lookup = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.os.LocaleList locales = c0428a.f1211b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i5 = 0; i5 < size; i5++) {
                java.util.Locale locale = locales.get(i5);
                java.lang.String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList2.add(new java.util.Locale.LanguageRange(language));
                arrayList2.add(new java.util.Locale.LanguageRange(locale.getLanguage()));
                arrayList2.add(new java.util.Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            lookup = java.util.Locale.lookup(arrayList2, arrayList);
            if (lookup == null) {
                lookup = (java.util.Locale) arrayList.get(0);
            }
        }
        return lookup == null ? new java.lang.String[0] : new java.lang.String[]{lookup.getLanguage(), lookup.getCountry(), lookup.getScript()};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [B2.j, java.lang.Object, io.flutter.plugin.platform.d] */
    public io.flutter.embedding.engine.FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.C1592o c1592o = this.platformViewsController;
        if (c1592o == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        ?? c0053j = new p009B2.C0053j(c1592o.f6620o.getContext(), c1592o.f6620o.getWidth(), c1592o.f6620o.getHeight(), 2);
        c0053j.f6570r = c1592o.f6625t;
        int i4 = c1592o.f6609A;
        c1592o.f6609A = i4 + 1;
        c1592o.f6630y.put(i4, c0053j);
        return new io.flutter.embedding.engine.FlutterOverlaySurface(i4, c0053j.getSurface());
    }

    @android.annotation.SuppressLint({"NewApi"})
    public io.flutter.embedding.engine.FlutterOverlaySurface createOverlaySurface2() {
        android.view.SurfaceControl build;
        io.flutter.plugin.platform.C1591n c1591n = this.platformViewsController2;
        if (c1591n == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (c1591n.f6606y == null) {
            android.view.SurfaceControl.Builder m3461f = io.flutter.plugin.editing.AbstractC1565a.m3461f();
            m3461f.setBufferSize(c1591n.f6596o.getWidth(), c1591n.f6596o.getHeight());
            m3461f.setFormat(1);
            m3461f.setName("Flutter Overlay Surface");
            m3461f.setOpaque(false);
            m3461f.setHidden(false);
            build = m3461f.build();
            android.view.SurfaceControl.Transaction m2794k = p107b0.AbstractC1174i.m2794k(p107b0.AbstractC1174i.m2793j(c1591n.f6596o), build);
            m2794k.setLayer(build, 1000);
            m2794k.apply();
            c1591n.f6606y = io.flutter.plugin.editing.AbstractC1565a.m3460e(build);
            c1591n.f6607z = build;
        }
        return new io.flutter.embedding.engine.FlutterOverlaySurface(0, c1591n.f6606y);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public android.view.SurfaceControl.Transaction createTransaction() {
        io.flutter.plugin.platform.C1591n c1591n = this.platformViewsController2;
        if (c1591n == null) {
            throw new java.lang.RuntimeException("");
        }
        android.view.SurfaceControl.Transaction m3462g = io.flutter.plugin.editing.AbstractC1565a.m3462g();
        c1591n.f6604w.add(m3462g);
        return m3462g;
    }

    public void deferredComponentInstallFailure(int i4, java.lang.String str, boolean z4) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i4, str, z4);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.C1591n c1591n = this.platformViewsController2;
        if (c1591n == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        android.view.Surface surface = c1591n.f6606y;
        if (surface != null) {
            surface.release();
            c1591n.f6606y = null;
            c1591n.f6607z = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.C1592o c1592o = this.platformViewsController;
        if (c1592o == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c1592o.m3512c();
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

    public void dispatchEmptyPlatformMessage(java.lang.String str, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i4);
            return;
        }
        android.util.Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPlatformMessage(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i4, int i5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i4, i5);
            return;
        }
        android.util.Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i5);
    }

    public void dispatchPointerDataPacket(java.nio.ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i4, io.flutter.view.EnumC1607d enumC1607d) {
        dispatchSemanticsAction(i4, enumC1607d, null);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void endFrame2() {
        io.flutter.plugin.platform.C1591n c1591n = this.platformViewsController2;
        if (c1591n == null) {
            throw new java.lang.RuntimeException("");
        }
        android.view.SurfaceControl.Transaction m3462g = io.flutter.plugin.editing.AbstractC1565a.m3462g();
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = c1591n.f6605x;
            if (i4 >= arrayList.size()) {
                arrayList.clear();
                c1591n.f6596o.invalidate();
                p107b0.AbstractC1174i.m2802s(p107b0.AbstractC1174i.m2793j(c1591n.f6596o), m3462g);
                return;
            }
            m3462g = m3462g.merge(io.flutter.plugin.editing.AbstractC1565a.m3464i(arrayList.get(i4)));
            i4++;
        }
    }

    public android.graphics.Bitmap getBitmap() {
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
            android.support.v4.media.session.t r0 = p043K2.C0338n.f1045b
            java.lang.Object r1 = r0.f3862n
            K2.m r1 = (p043K2.C0337m) r1
            java.lang.Object r2 = r0.f3861m
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            if (r1 != 0) goto L14
            java.lang.Object r1 = r2.poll()
            K2.m r1 = (p043K2.C0337m) r1
            r0.f3862n = r1
        L14:
            java.lang.Object r1 = r0.f3862n
            K2.m r1 = (p043K2.C0337m) r1
            if (r1 == 0) goto L27
            int r3 = r1.f1043a
            if (r3 >= r8) goto L27
            java.lang.Object r1 = r2.poll()
            K2.m r1 = (p043K2.C0337m) r1
            r0.f3862n = r1
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
            int r5 = r1.f1043a
            if (r5 == r8) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            java.lang.String r3 = ", the oldest config is now: "
            r1.append(r3)
            java.lang.Object r0 = r0.f3862n
            K2.m r0 = (p043K2.C0337m) r0
            int r0 = r0.f1043a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L46
        L72:
            if (r1 != 0) goto L75
            goto L77
        L75:
            android.util.DisplayMetrics r2 = r1.f1044b
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

    public void handlePlatformMessage(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i4, long j4) {
        p018D2.C0180f c0180f;
        boolean z4;
        p018D2.InterfaceC0185k interfaceC0185k = this.platformMessageHandler;
        if (interfaceC0185k == null) {
            nativeCleanupMessageData(j4);
            return;
        }
        p018D2.C0184j c0184j = (p018D2.C0184j) interfaceC0185k;
        synchronized (c0184j.f505o) {
            try {
                c0180f = (p018D2.C0180f) c0184j.f503m.get(str);
                z4 = c0184j.f506p.get() && c0180f == null;
                if (z4) {
                    if (!c0184j.f504n.containsKey(str)) {
                        c0184j.f504n.put(str, new java.util.LinkedList());
                    }
                    ((java.util.List) c0184j.f504n.get(str)).add(new p018D2.C0178d(j4, byteBuffer, i4));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z4) {
            return;
        }
        c0184j.m541e(str, c0180f, byteBuffer, i4, j4);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        io.flutter.plugin.platform.C1591n c1591n = this.platformViewsController2;
        if (c1591n == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (c1591n.f6607z == null) {
            return;
        }
        android.view.SurfaceControl.Transaction m3462g = io.flutter.plugin.editing.AbstractC1565a.m3462g();
        m3462g.setVisibility(c1591n.f6607z, false);
        m3462g.apply();
    }

    public void init(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j4, int i4) {
        if (initCalled) {
            android.util.Log.w(TAG, "FlutterJNI.init called more than once");
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
                android.util.Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (java.lang.Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i4, java.nio.ByteBuffer byteBuffer, int i5) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i4, byteBuffer, i5);
            } else {
                android.util.Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (java.lang.Throwable th) {
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

    public void loadDartDeferredLibrary(int i4, java.lang.String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i4, strArr);
    }

    public void loadLibrary(android.content.Context context) {
        p008B1.C0026d c0026d;
        java.lang.String[] strArr;
        java.util.zip.ZipFile zipFile;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2;
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            android.util.Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        p011C.C0111c c0111c = new p011C.C0111c(2);
        p035I.C0291m c0291m = new p035I.C0291m(2);
        c0291m.f879o = c0111c;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Given context is null");
        }
        c0291m.m695k("Beginning load of %s...", "flutter");
        p025F1.C0215g c0215g = (p025F1.C0215g) c0291m.f877m;
        java.util.HashSet hashSet = (java.util.HashSet) c0291m.f876l;
        if (hashSet.contains("flutter")) {
            c0291m.m695k("%s already loaded previously!", "flutter");
        } else {
            try {
                c0215g.getClass();
                java.lang.System.loadLibrary("flutter");
                hashSet.add("flutter");
                c0291m.m695k("%s (%s) was loaded normally!", "flutter", null);
            } catch (java.lang.UnsatisfiedLinkError e4) {
                c0291m.m695k("Loading the library normally failed: %s", android.util.Log.getStackTraceString(e4));
                c0291m.m695k("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                java.io.File m693i = c0291m.m693i(context);
                if (!m693i.exists()) {
                    java.io.File dir = context.getDir("lib", 0);
                    java.io.File m693i2 = c0291m.m693i(context);
                    c0215g.getClass();
                    java.io.File[] listFiles = dir.listFiles(new p037I1.C0308b(java.lang.System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (java.io.File file : listFiles) {
                            if (!file.getAbsolutePath().equals(m693i2.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    java.lang.String[] strArr2 = android.os.Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        java.lang.String str = android.os.Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new java.lang.String[]{android.os.Build.CPU_ABI} : new java.lang.String[]{android.os.Build.CPU_ABI, str};
                    }
                    java.lang.String mapLibraryName = java.lang.System.mapLibraryName("flutter");
                    ((p046L1.C0363g) c0291m.f878n).getClass();
                    try {
                        p008B1.C0026d m815p = p046L1.C0363g.m815p(context, strArr2, mapLibraryName, c0291m);
                        try {
                            if (m815p == null) {
                                try {
                                    strArr = p046L1.C0363g.m816q(context, mapLibraryName);
                                } catch (java.lang.Exception e5) {
                                    strArr = new java.lang.String[]{e5.toString()};
                                }
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not find '");
                                sb.append(mapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(java.util.Arrays.toString(strArr2));
                                sb.append(", but only found: ");
                                throw new java.lang.RuntimeException(p009B2.AbstractC0051h.m154m(sb, java.util.Arrays.toString(strArr), "."));
                            }
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                zipFile = (java.util.zip.ZipFile) m815p.f99m;
                                if (i4 < 5) {
                                    c0291m.m695k("Found %s! Extracting...", mapLibraryName);
                                    try {
                                        if (m693i.exists() || m693i.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((java.util.zip.ZipEntry) m815p.f100n);
                                            } catch (java.io.FileNotFoundException unused) {
                                                inputStream2 = null;
                                            } catch (java.io.IOException unused2) {
                                                inputStream2 = null;
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                fileOutputStream2 = new java.io.FileOutputStream(m693i);
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
                                                    if (j4 == m693i.length()) {
                                                        p046L1.C0363g.m813j(inputStream2);
                                                        p046L1.C0363g.m813j(fileOutputStream2);
                                                        m693i.setReadable(true, false);
                                                        m693i.setExecutable(true, false);
                                                        m693i.setWritable(true);
                                                        break;
                                                    }
                                                    p046L1.C0363g.m813j(inputStream2);
                                                    p046L1.C0363g.m813j(fileOutputStream2);
                                                } catch (java.io.FileNotFoundException unused3) {
                                                    p046L1.C0363g.m813j(inputStream2);
                                                    p046L1.C0363g.m813j(fileOutputStream2);
                                                    i4 = i5;
                                                } catch (java.io.IOException unused4) {
                                                    p046L1.C0363g.m813j(inputStream2);
                                                    p046L1.C0363g.m813j(fileOutputStream2);
                                                    i4 = i5;
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    p046L1.C0363g.m813j(inputStream);
                                                    p046L1.C0363g.m813j(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (java.io.FileNotFoundException unused5) {
                                                fileOutputStream2 = null;
                                                p046L1.C0363g.m813j(inputStream2);
                                                p046L1.C0363g.m813j(fileOutputStream2);
                                                i4 = i5;
                                            } catch (java.io.IOException unused6) {
                                                fileOutputStream2 = null;
                                                p046L1.C0363g.m813j(inputStream2);
                                                p046L1.C0363g.m813j(fileOutputStream2);
                                                i4 = i5;
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                p046L1.C0363g.m813j(inputStream);
                                                p046L1.C0363g.m813j(fileOutputStream);
                                                throw th;
                                            }
                                        }
                                    } catch (java.io.IOException unused7) {
                                    }
                                    i4 = i5;
                                } else if (((p011C.C0111c) c0291m.f879o) != null) {
                                    lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (java.io.IOException unused8) {
                                java.lang.String absolutePath = m693i.getAbsolutePath();
                                c0215g.getClass();
                                java.lang.System.load(absolutePath);
                                hashSet.add("flutter");
                                c0291m.m695k("%s (%s) was re-linked!", "flutter", null);
                                loadLibraryCalled = true;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            c0026d = m815p;
                            if (c0026d != null) {
                                try {
                                    ((java.util.zip.ZipFile) c0026d.f99m).close();
                                } catch (java.io.IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        c0026d = null;
                    }
                }
                java.lang.String absolutePath2 = m693i.getAbsolutePath();
                c0215g.getClass();
                java.lang.System.load(absolutePath2);
                hashSet.add("flutter");
                c0291m.m695k("%s (%s) was re-linked!", "flutter", null);
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
        io.flutter.plugin.platform.C1592o c1592o = this.platformViewsController;
        if (c1592o == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        c1592o.f6612D.clear();
        c1592o.f6613E.clear();
    }

    public void onDisplayOverlaySurface(int i4, int i5, int i6, int i7, int i8) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.C1592o c1592o = this.platformViewsController;
        if (c1592o == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        android.util.SparseArray sparseArray = c1592o.f6630y;
        if (sparseArray.get(i4) == null) {
            throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m151j(i4, "The overlay surface (id:", ") doesn't exist"));
        }
        c1592o.m3515h();
        android.view.View view = (io.flutter.plugin.platform.C1581d) sparseArray.get(i4);
        if (view.getParent() == null) {
            c1592o.f6620o.addView(view);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        c1592o.f6612D.add(java.lang.Integer.valueOf(i4));
    }

    public void onDisplayPlatformView(int i4, int i5, int i6, int i7, int i8, int i9, int i10, io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.C1592o c1592o = this.platformViewsController;
        if (c1592o == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        c1592o.m3515h();
        android.util.SparseArray sparseArray = c1592o.f6628w;
        io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f = (io.flutter.plugin.platform.InterfaceC1583f) sparseArray.get(i4);
        if (interfaceC1583f == null) {
            return;
        }
        android.util.SparseArray sparseArray2 = c1592o.f6629x;
        if (sparseArray2.get(i4) == null) {
            android.view.SurfaceView surfaceView = ((p081U2.C0751a) interfaceC1583f).f2611a;
            if (surfaceView == null) {
                throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (surfaceView.getParent() != null) {
                throw new java.lang.IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            android.app.Activity activity = c1592o.f6619n;
            p030G2.C0240b c0240b = new p030G2.C0240b(activity, activity.getResources().getDisplayMetrics().density, c1592o.f6618m);
            c0240b.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.ViewOnFocusChangeListenerC1587j(c1592o, i4, 0));
            sparseArray2.put(i4, c0240b);
            surfaceView.setImportantForAccessibility(4);
            c0240b.addView(surfaceView);
            c1592o.f6620o.addView(c0240b);
        }
        p030G2.C0240b c0240b2 = (p030G2.C0240b) sparseArray2.get(i4);
        c0240b2.f698l = flutterMutatorsStack;
        c0240b2.f700n = i5;
        c0240b2.f701o = i6;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        c0240b2.setLayoutParams(layoutParams);
        c0240b2.setWillNotDraw(false);
        c0240b2.setVisibility(0);
        c0240b2.bringToFront();
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i9, i10);
        android.view.SurfaceView surfaceView2 = ((p081U2.C0751a) ((io.flutter.plugin.platform.InterfaceC1583f) sparseArray.get(i4))).f2611a;
        if (surfaceView2 != null) {
            surfaceView2.setLayoutParams(layoutParams2);
            surfaceView2.bringToFront();
        }
        c1592o.f6613E.add(java.lang.Integer.valueOf(i4));
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i4, int i5, int i6, int i7, int i8, int i9, int i10, io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.C1591n c1591n = this.platformViewsController2;
        if (c1591n == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        android.util.SparseArray sparseArray = c1591n.f6601t;
        io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f = (io.flutter.plugin.platform.InterfaceC1583f) sparseArray.get(i4);
        if (interfaceC1583f == null) {
            return;
        }
        android.util.SparseArray sparseArray2 = c1591n.f6602u;
        if (sparseArray2.get(i4) == null) {
            android.view.SurfaceView surfaceView = ((p081U2.C0751a) interfaceC1583f).f2611a;
            if (surfaceView == null) {
                throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (surfaceView.getParent() != null) {
                throw new java.lang.IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            android.app.Activity activity = c1591n.f6595n;
            p030G2.C0240b c0240b = new p030G2.C0240b(activity, activity.getResources().getDisplayMetrics().density, c1591n.f6594m);
            c0240b.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.ViewOnFocusChangeListenerC1587j(c1591n, i4, 1));
            sparseArray2.put(i4, c0240b);
            surfaceView.setImportantForAccessibility(4);
            c0240b.addView(surfaceView);
            c1591n.f6596o.addView(c0240b);
        }
        p030G2.C0240b c0240b2 = (p030G2.C0240b) sparseArray2.get(i4);
        c0240b2.f698l = flutterMutatorsStack;
        c0240b2.f700n = i5;
        c0240b2.f701o = i6;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        c0240b2.setLayoutParams(layoutParams);
        c0240b2.setWillNotDraw(false);
        c0240b2.setVisibility(0);
        c0240b2.bringToFront();
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i9, i10);
        android.view.SurfaceView surfaceView2 = ((p081U2.C0751a) ((io.flutter.plugin.platform.InterfaceC1583f) sparseArray.get(i4))).f2611a;
        if (surfaceView2 != null) {
            surfaceView2.setLayoutParams(layoutParams2);
            surfaceView2.bringToFront();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public void onEndFrame() {
        ?? r32;
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.C1592o c1592o = this.platformViewsController;
        if (c1592o == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z4 = false;
        if (!c1592o.f6610B || !c1592o.f6613E.isEmpty()) {
            if (c1592o.f6610B) {
                p009B2.C0053j c0053j = c1592o.f6620o.f205n;
                if (c0053j != null ? c0053j.m197e() : false) {
                    z4 = true;
                }
            }
            c1592o.m3513e(z4);
            return;
        }
        c1592o.f6610B = false;
        p009B2.C0064u c0064u = c1592o.f6620o;
        p026F2.RunnableC0226c runnableC0226c = new p026F2.RunnableC0226c(6, c1592o);
        p009B2.C0053j c0053j2 = c0064u.f205n;
        if (c0053j2 == null || (r32 = c0064u.f207p) == 0) {
            return;
        }
        c0064u.f206o = r32;
        c0064u.f207p = null;
        io.flutter.embedding.engine.renderer.C1561j c1561j = c0064u.f210s.f352b;
        if (c1561j != null) {
            r32.mo196d();
            p009B2.C0063t c0063t = new p009B2.C0063t(c0064u, c1561j, runnableC0226c);
            c1561j.f6478a.addIsDisplayingFlutterUiListener(c0063t);
            if (c1561j.f6481d) {
                c0063t.mo123b();
                return;
            }
            return;
        }
        c0053j2.mo195c();
        p009B2.C0053j c0053j3 = c0064u.f205n;
        if (c0053j3 != null) {
            c0053j3.f167l.close();
            c0064u.removeView(c0064u.f205n);
            c0064u.f205n = null;
        }
        runnableC0226c.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        java.util.Iterator<io.flutter.embedding.engine.renderer.InterfaceC1562k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().mo123b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        java.util.Iterator<io.flutter.embedding.engine.renderer.InterfaceC1562k> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().mo122a();
        }
    }

    public void onSurfaceChanged(int i4, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i4, i5);
    }

    public void onSurfaceCreated(android.view.Surface surface) {
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

    public void onSurfaceWindowChanged(android.view.Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j4, long j5, long j6) {
        nativeOnVsync(j4, j5, j6);
    }

    public long performNativeAttach(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            android.util.Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j4, io.flutter.view.TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j4, new java.lang.ref.WeakReference<>(textureRegistry$ImageConsumer), z4);
    }

    public void registerTexture(long j4, io.flutter.embedding.engine.renderer.SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j4, new java.lang.ref.WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(p013C2.InterfaceC0137b interfaceC0137b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC0137b);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.InterfaceC1562k interfaceC1562k) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(interfaceC1562k);
    }

    public void requestDartDeferredLibrary(int i4) {
        android.util.Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager, java.util.List<java.lang.String> list, long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j4);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(p013C2.InterfaceC0142g interfaceC0142g) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = interfaceC0142g;
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

    public void setAsyncWaitForVsyncDelegate(p013C2.InterfaceC0143h interfaceC0143h) {
        asyncWaitForVsyncDelegate = interfaceC0143h;
    }

    public void setDeferredComponentManager(p023E2.InterfaceC0197a interfaceC0197a) {
        ensureRunningOnMainThread();
        if (interfaceC0197a != null) {
            interfaceC0197a.m559a();
        }
    }

    public void setLocalizationPlugin(p051M2.C0428a c0428a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0428a;
    }

    public void setPlatformMessageHandler(p018D2.InterfaceC0185k interfaceC0185k) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = interfaceC0185k;
    }

    public void setPlatformViewsController(io.flutter.plugin.platform.C1592o c1592o) {
        ensureRunningOnMainThread();
        this.platformViewsController = c1592o;
    }

    public void setPlatformViewsController2(io.flutter.plugin.platform.C1591n c1591n) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = c1591n;
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

    @android.annotation.SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        io.flutter.plugin.platform.C1591n c1591n = this.platformViewsController2;
        if (c1591n == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (c1591n.f6607z == null) {
            return;
        }
        android.view.SurfaceControl.Transaction m3462g = io.flutter.plugin.editing.AbstractC1565a.m3462g();
        m3462g.setVisibility(c1591n.f6607z, true);
        m3462g.apply();
    }

    public io.flutter.embedding.engine.FlutterJNI spawn(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        io.flutter.embedding.engine.FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j4);
        java.lang.Long l4 = nativeSpawn.nativeShellHolderId;
        if ((l4 == null || l4.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new java.lang.IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void swapTransactions() {
        io.flutter.plugin.platform.C1591n c1591n = this.platformViewsController2;
        if (c1591n == null) {
            throw new java.lang.RuntimeException("");
        }
        synchronized (c1591n) {
            try {
                c1591n.f6605x.clear();
                for (int i4 = 0; i4 < c1591n.f6604w.size(); i4++) {
                    c1591n.f6605x.add(io.flutter.plugin.editing.AbstractC1565a.m3464i(c1591n.f6604w.get(i4)));
                }
                c1591n.f6604w.clear();
            } catch (java.lang.Throwable th) {
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

    public void updateJavaAssetManager(android.content.res.AssetManager assetManager, java.lang.String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i4, io.flutter.view.EnumC1607d enumC1607d, java.lang.Object obj) {
        java.nio.ByteBuffer byteBuffer;
        int i5;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = p047L2.C0391u.f1135a.mo832b(obj);
            i5 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i5 = 0;
        }
        dispatchSemanticsAction(i4, enumC1607d.f6691l, byteBuffer, i5);
    }

    public void dispatchSemanticsAction(int i4, int i5, java.nio.ByteBuffer byteBuffer, int i6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i4, i5, byteBuffer, i6);
    }
}
