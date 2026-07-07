package B2;

import C.AbstractC0018e;
import I.C0044m;
import a.AbstractC0110a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import b3.C0191e;
import b3.C0196j;
import b3.InterfaceC0195i;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import r3.AbstractC0514a;
import r3.AbstractC0534v;
import r3.C0532t;
import r3.P;
import r3.T;
import s1.C0543a;
import u1.C0582b;
import u1.C0583c;
import y.ExecutorC0614a;

/* loaded from: classes.dex */
public final class u extends FrameLayout implements N2.a, G {

    /* renamed from: A, reason: collision with root package name */
    public io.flutter.view.g f191A;

    /* renamed from: B, reason: collision with root package name */
    public TextServicesManager f192B;

    /* renamed from: C, reason: collision with root package name */
    public r f193C;

    /* renamed from: D, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f194D;

    /* renamed from: E, reason: collision with root package name */
    public final r f195E;

    /* renamed from: F, reason: collision with root package name */
    public final s f196F;

    /* renamed from: G, reason: collision with root package name */
    public final C0004e f197G;

    /* renamed from: H, reason: collision with root package name */
    public q f198H;

    /* renamed from: I, reason: collision with root package name */
    public w f199I;

    /* renamed from: l, reason: collision with root package name */
    public final C0011l f200l;

    /* renamed from: m, reason: collision with root package name */
    public final C0013n f201m;

    /* renamed from: n, reason: collision with root package name */
    public C0009j f202n;

    /* renamed from: o, reason: collision with root package name */
    public View f203o;

    /* renamed from: p, reason: collision with root package name */
    public View f204p;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f205q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f206r;
    public C2.c s;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f207t;

    /* renamed from: u, reason: collision with root package name */
    public B1.d f208u;

    /* renamed from: v, reason: collision with root package name */
    public io.flutter.plugin.editing.k f209v;
    public io.flutter.plugin.editing.h w;

    /* renamed from: x, reason: collision with root package name */
    public M2.a f210x;

    /* renamed from: y, reason: collision with root package name */
    public android.support.v4.media.session.t f211y;

    /* renamed from: z, reason: collision with root package name */
    public C0000a f212z;

    /* JADX WARN: Type inference failed for: r3v7, types: [B2.w, java.lang.Object] */
    public u(AbstractActivityC0003d abstractActivityC0003d, C0011l c0011l) {
        super(abstractActivityC0003d, null);
        this.f205q = new HashSet();
        this.f207t = new HashSet();
        this.f194D = new io.flutter.embedding.engine.renderer.i();
        this.f195E = new r(0, this);
        this.f196F = new s(this, new Handler(Looper.getMainLooper()), 0);
        this.f197G = new C0004e(1, this);
        this.f199I = new Object();
        this.f200l = c0011l;
        this.f203o = c0011l;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.s);
        if (c()) {
            Iterator it = this.f207t.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f196F);
            io.flutter.plugin.platform.o oVar = this.s.s;
            int i4 = 0;
            while (true) {
                SparseArray sparseArray2 = oVar.f6392z;
                if (i4 >= sparseArray2.size()) {
                    break;
                }
                oVar.f6383o.removeView((io.flutter.plugin.platform.h) sparseArray2.valueAt(i4));
                i4++;
            }
            int i5 = 0;
            while (true) {
                SparseArray sparseArray3 = oVar.f6390x;
                if (i5 >= sparseArray3.size()) {
                    break;
                }
                oVar.f6383o.removeView((G2.b) sparseArray3.valueAt(i5));
                i5++;
            }
            oVar.c();
            if (oVar.f6383o == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i6 = 0;
                while (true) {
                    sparseArray = oVar.f6391y;
                    if (i6 >= sparseArray.size()) {
                        break;
                    }
                    oVar.f6383o.removeView((View) sparseArray.valueAt(i6));
                    i6++;
                }
                sparseArray.clear();
            }
            oVar.f6383o = null;
            oVar.f6373B = false;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray4 = oVar.w;
                if (i7 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.f) sparseArray4.valueAt(i7)).getClass();
                i7++;
            }
            io.flutter.plugin.platform.n nVar = this.s.f363t;
            int i8 = 0;
            while (true) {
                SparseArray sparseArray5 = nVar.f6366u;
                if (i8 >= sparseArray5.size()) {
                    break;
                }
                nVar.f6361o.removeView((G2.b) sparseArray5.valueAt(i8));
                i8++;
            }
            Surface surface = nVar.f6369y;
            if (surface != null) {
                surface.release();
                nVar.f6369y = null;
                nVar.f6370z = null;
            }
            nVar.f6361o = null;
            int i9 = 0;
            while (true) {
                SparseArray sparseArray6 = nVar.f6365t;
                if (i9 >= sparseArray6.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.f) sparseArray6.valueAt(i9)).getClass();
                i9++;
            }
            this.s.s.f();
            this.s.f363t.f();
            io.flutter.view.g gVar = this.f191A;
            gVar.f6526u = true;
            gVar.f6511e.f();
            gVar.s = null;
            AccessibilityManager accessibilityManager = gVar.f6509c;
            accessibilityManager.removeAccessibilityStateChangeListener(gVar.w);
            accessibilityManager.removeTouchExplorationStateChangeListener(gVar.f6528x);
            gVar.f6512f.unregisterContentObserver(gVar.f6529y);
            android.support.v4.media.session.t tVar = gVar.f6508b;
            tVar.f3736o = null;
            ((FlutterJNI) tVar.f3735n).setAccessibilityDelegate(null);
            this.f191A = null;
            this.f209v.f6301b.restartInput(this);
            this.f209v.c();
            int size = ((HashSet) this.f211y.f3735n).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.h hVar = this.w;
            if (hVar != null) {
                hVar.f6287a.f185m = null;
                SpellCheckerSession spellCheckerSession = hVar.f6289c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            B1.d dVar = this.f208u;
            if (dVar != null) {
                ((r) dVar.f97n).f185m = null;
            }
            io.flutter.embedding.engine.renderer.j jVar = this.s.f346b;
            this.f206r = false;
            jVar.f6245a.removeIsDisplayingFlutterUiListener(this.f197G);
            jVar.h();
            jVar.f6245a.setSemanticsEnabled(false);
            View view = this.f204p;
            if (view != null && this.f203o == this.f202n) {
                this.f203o = view;
            }
            this.f203o.c();
            C0009j c0009j = this.f202n;
            if (c0009j != null) {
                c0009j.f164l.close();
                removeView(this.f202n);
                this.f202n = null;
            }
            this.f204p = null;
            this.s = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C0044m c0044m;
        C0044m c0044m2;
        io.flutter.plugin.editing.k kVar = this.f209v;
        K2.p pVar = kVar.f6305f;
        if (pVar == null || kVar.f6306g == null || (c0044m = pVar.f1019j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            K2.p pVar2 = (K2.p) kVar.f6306g.get(sparseArray.keyAt(i4));
            if (pVar2 != null && (c0044m2 = pVar2.f1019j) != null) {
                String charSequence = ((AutofillValue) sparseArray.valueAt(i4)).getTextValue().toString();
                K2.r rVar = new K2.r(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) c0044m.f847l;
                String str2 = (String) c0044m2.f847l;
                if (str2.equals(str)) {
                    kVar.f6307h.f(rVar);
                } else {
                    hashMap.put(str2, rVar);
                }
            }
        }
        int i5 = kVar.f6304e.f321c;
        B1.d dVar = kVar.f6303d;
        dVar.getClass();
        String.valueOf(hashMap.size());
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            K2.r rVar2 = (K2.r) entry.getValue();
            hashMap2.put((String) entry.getKey(), B1.d.j(rVar2.f1026a, rVar2.f1027b, rVar2.f1028c, -1, -1));
        }
        ((C0044m) dVar.f96m).j("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i5), hashMap2), null);
    }

    public final void b() {
        C0011l c0011l = this.f200l;
        if (c0011l != null) {
            addView(c0011l);
        } else {
            C0013n c0013n = this.f201m;
            if (c0013n != null) {
                addView(c0013n);
            } else {
                addView(this.f202n);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAutofill(1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final boolean c() {
        C2.c cVar = this.s;
        if (cVar != null) {
            if (cVar.f346b == this.f203o.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        C2.c cVar = this.s;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.o oVar = cVar.s;
        if (view == null) {
            oVar.getClass();
            return false;
        }
        HashMap hashMap = oVar.f6389v;
        if (!hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.u.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f211y.k0(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f4 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.i iVar = this.f194D;
        iVar.f6227a = f4;
        iVar.f6242p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.j jVar = this.s.f346b;
        jVar.getClass();
        if (iVar.f6228b <= 0 || iVar.f6229c <= 0 || iVar.f6227a <= 0.0f) {
            return;
        }
        ArrayList arrayList = iVar.f6243q;
        arrayList.size();
        ArrayList arrayList2 = iVar.f6244r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i4);
            int i5 = i4 * 4;
            Rect rect = aVar.f6207a;
            iArr[i5] = rect.left;
            iArr[i5 + 1] = rect.top;
            iArr[i5 + 2] = rect.right;
            iArr[i5 + 3] = rect.bottom;
            iArr2[i4] = L.j.b(aVar.f6208b);
            iArr3[i4] = L.j.b(aVar.f6209c);
        }
        int size2 = arrayList.size() * 4;
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i6);
            int i7 = (i6 * 4) + size2;
            Rect rect2 = aVar2.f6207a;
            iArr[i7] = rect2.left;
            iArr[i7 + 1] = rect2.top;
            iArr[i7 + 2] = rect2.right;
            iArr[i7 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i6] = L.j.b(aVar2.f6208b);
            iArr3[arrayList.size() + i6] = L.j.b(aVar2.f6209c);
        }
        jVar.f6245a.setViewportMetrics(iVar.f6227a, iVar.f6228b, iVar.f6229c, iVar.f6230d, iVar.f6231e, iVar.f6232f, iVar.f6233g, iVar.f6234h, iVar.f6235i, iVar.f6236j, iVar.f6237k, iVar.f6238l, iVar.f6239m, iVar.f6240n, iVar.f6241o, iVar.f6242p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.g gVar = this.f191A;
        if (gVar == null || !gVar.f6509c.isEnabled()) {
            return null;
        }
        return this.f191A;
    }

    public C2.c getAttachedFlutterEngine() {
        return this.s;
    }

    public L2.f getBinaryMessenger() {
        return this.s.f347c;
    }

    public C0009j getCurrentImageSurface() {
        return this.f202n;
    }

    public io.flutter.embedding.engine.renderer.i getViewportMetrics() {
        return this.f194D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b0, code lost:
    
        r1 = r16.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r16) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.u.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [u3.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        r rVar;
        C0196j c0196j = C0196j.f4462l;
        int i4 = 0;
        super.onAttachedToWindow();
        try {
            u1.g gVar = u1.h.f8584i;
            Context context = getContext();
            gVar.getClass();
            rVar = new r(2, new Y.x(u1.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            rVar = null;
        }
        this.f193C = rVar;
        Activity z4 = AbstractC0110a.z(getContext());
        r rVar2 = this.f193C;
        if (rVar2 == null || z4 == null) {
            return;
        }
        this.f198H = new q(i4, this);
        Context context2 = getContext();
        Executor b4 = Build.VERSION.SDK_INT >= 28 ? AbstractC0018e.b(context2) : new ExecutorC0614a(new Handler(context2.getMainLooper()), 0);
        q qVar = this.f198H;
        Y.x xVar = (Y.x) rVar2.f185m;
        k3.h.e(b4, "executor");
        k3.h.e(qVar, "consumer");
        C0582b c0582b = (C0582b) xVar.f3065m;
        c0582b.getClass();
        u3.c cVar = new u3.c(new u1.i(c0582b, z4, null), c0196j, -2, 1);
        y3.d dVar = r3.B.f8110a;
        s3.c cVar2 = w3.o.f8942a;
        if (cVar2.j(C0532t.f8178m) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        u3.c cVar3 = cVar;
        if (!cVar2.equals(c0196j)) {
            cVar3 = v3.l.a(cVar, cVar2, 0, 0, 6);
        }
        Y.x xVar2 = (Y.x) xVar.f3066n;
        xVar2.getClass();
        k3.h.e(cVar3, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) xVar2.f3065m;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) xVar2.f3066n;
        try {
            if (linkedHashMap.get(qVar) == null) {
                InterfaceC0195i j4 = new r3.J(b4);
                if (j4.j(C0532t.f8178m) == null) {
                    j4 = j4.c(new T(null));
                }
                C0543a c0543a = new C0543a(cVar3, qVar, null);
                InterfaceC0195i a4 = AbstractC0534v.a(j4, c0196j, true);
                y3.d dVar2 = r3.B.f8110a;
                if (a4 != dVar2 && a4.j(C0191e.f4461l) == null) {
                    a4 = a4.c(dVar2);
                }
                AbstractC0514a abstractC0514a = new AbstractC0514a(a4, true);
                abstractC0514a.W(1, abstractC0514a, c0543a);
                linkedHashMap.put(qVar, abstractC0514a);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.s != null) {
            this.f210x.b(configuration);
            d();
            AbstractC0110a.g(getContext(), this.s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.u.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        q qVar;
        r rVar = this.f193C;
        if (rVar != null && (qVar = this.f198H) != null) {
            Y.x xVar = (Y.x) ((Y.x) rVar.f185m).f3066n;
            xVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) xVar.f3065m;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) xVar.f3066n;
            try {
                P p2 = (P) linkedHashMap.get(qVar);
                if (p2 != null) {
                    p2.b(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f198H = null;
        this.f193C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0000a c0000a = this.f212z;
            Context context = getContext();
            c0000a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z4 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z4) {
                int b4 = C0000a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0000a.a(motionEvent, motionEvent.getActionIndex(), b4, 0, C0000a.f136e, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0000a.f137a.f6245a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f191A.f(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i4) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i4);
        io.flutter.plugin.editing.k kVar = this.f209v;
        if (kVar.f6306g != null) {
            String str = (String) kVar.f6305f.f1019j.f847l;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i5 = 0; i5 < kVar.f6306g.size(); i5++) {
                int keyAt = kVar.f6306g.keyAt(i5);
                C0044m c0044m = ((K2.p) kVar.f6306g.valueAt(i5)).f1019j;
                if (c0044m != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i5);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) c0044m.f848m;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) c0044m.f850o;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = kVar.f6312m) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(((K2.r) c0044m.f849n).f1026a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), kVar.f6312m.height());
                        newChild.setAutofillValue(AutofillValue.forText(kVar.f6307h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        io.flutter.embedding.engine.renderer.i iVar = this.f194D;
        iVar.f6228b = i4;
        iVar.f6229c = i5;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f212z.c(motionEvent, C0000a.f136e);
        return true;
    }

    public void setDelegate(w wVar) {
        this.f199I = wVar;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        View view = this.f203o;
        if (view instanceof C0011l) {
            ((C0011l) view).setVisibility(i4);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    public void setWindowInfoListenerDisplayFeatures(u1.j jVar) {
        ?? r8 = jVar.f8588a;
        ArrayList arrayList = new ArrayList();
        for (C0583c c0583c : r8) {
            c0583c.f8572a.c().toString();
            r1.b bVar = c0583c.f8572a;
            int b4 = bVar.b();
            C0582b c0582b = C0582b.f8566o;
            int i4 = 2;
            int i5 = ((b4 == 0 || bVar.a() == 0) ? C0582b.f8565n : c0582b) == c0582b ? 3 : 2;
            C0582b c0582b2 = C0582b.f8567p;
            C0582b c0582b3 = c0583c.f8574c;
            if (c0582b3 != c0582b2) {
                i4 = c0582b3 == C0582b.f8568q ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(bVar.c(), i5, i4));
        }
        ArrayList arrayList2 = this.f194D.f6243q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [B2.w, java.lang.Object] */
    public u(AbstractActivityC0003d abstractActivityC0003d, C0013n c0013n) {
        super(abstractActivityC0003d, null);
        this.f205q = new HashSet();
        this.f207t = new HashSet();
        this.f194D = new io.flutter.embedding.engine.renderer.i();
        this.f195E = new r(0, this);
        this.f196F = new s(this, new Handler(Looper.getMainLooper()), 0);
        this.f197G = new C0004e(1, this);
        this.f199I = new Object();
        this.f201m = c0013n;
        this.f203o = c0013n;
        b();
    }
}
