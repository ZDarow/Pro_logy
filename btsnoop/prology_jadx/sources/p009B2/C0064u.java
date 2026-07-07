package p009B2;

/* renamed from: B2.u */
/* loaded from: classes.dex */
public final class C0064u extends android.widget.FrameLayout implements p055N2.InterfaceC0472a, p009B2.InterfaceC0036G {

    /* renamed from: A */
    public io.flutter.view.C1610g f194A;

    /* renamed from: B */
    public android.view.textservice.TextServicesManager f195B;

    /* renamed from: C */
    public p009B2.C0061r f196C;

    /* renamed from: D */
    public final io.flutter.embedding.engine.renderer.C1560i f197D;

    /* renamed from: E */
    public final p009B2.C0061r f198E;

    /* renamed from: F */
    public final p009B2.C0062s f199F;

    /* renamed from: G */
    public final p009B2.C0048e f200G;

    /* renamed from: H */
    public p009B2.C0060q f201H;

    /* renamed from: I */
    public p009B2.C0066w f202I;

    /* renamed from: l */
    public final p009B2.C0055l f203l;

    /* renamed from: m */
    public final p009B2.C0057n f204m;

    /* renamed from: n */
    public p009B2.C0053j f205n;

    /* renamed from: o */
    public android.view.View f206o;

    /* renamed from: p */
    public android.view.View f207p;

    /* renamed from: q */
    public final java.util.HashSet f208q;

    /* renamed from: r */
    public boolean f209r;

    /* renamed from: s */
    public p013C2.C0138c f210s;

    /* renamed from: t */
    public final java.util.HashSet f211t;

    /* renamed from: u */
    public p008B1.C0026d f212u;

    /* renamed from: v */
    public io.flutter.plugin.editing.C1575k f213v;

    /* renamed from: w */
    public io.flutter.plugin.editing.SpellCheckerSessionSpellCheckerSessionListenerC1572h f214w;

    /* renamed from: x */
    public p051M2.C0428a f215x;

    /* renamed from: y */
    public android.support.v4.media.session.C1061t f216y;

    /* renamed from: z */
    public p009B2.C0044a f217z;

    /* JADX WARN: Type inference failed for: r3v7, types: [B2.w, java.lang.Object] */
    public C0064u(p009B2.AbstractActivityC0047d abstractActivityC0047d, p009B2.C0055l c0055l) {
        super(abstractActivityC0047d, null);
        this.f208q = new java.util.HashSet();
        this.f211t = new java.util.HashSet();
        this.f197D = new io.flutter.embedding.engine.renderer.C1560i();
        this.f198E = new p009B2.C0061r(0, this);
        this.f199F = new p009B2.C0062s(this, new android.os.Handler(android.os.Looper.getMainLooper()), 0);
        this.f200G = new p009B2.C0048e(1, this);
        this.f202I = new java.lang.Object();
        this.f203l = c0055l;
        this.f206o = c0055l;
        m277b();
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    /* renamed from: a */
    public final void m276a() {
        android.util.SparseArray sparseArray;
        java.util.Objects.toString(this.f210s);
        if (m278c()) {
            java.util.Iterator it = this.f211t.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new java.lang.ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f199F);
            io.flutter.plugin.platform.C1592o c1592o = this.f210s.f369s;
            int i4 = 0;
            while (true) {
                android.util.SparseArray sparseArray2 = c1592o.f6631z;
                if (i4 >= sparseArray2.size()) {
                    break;
                }
                c1592o.f6620o.removeView((io.flutter.plugin.platform.C1585h) sparseArray2.valueAt(i4));
                i4++;
            }
            int i5 = 0;
            while (true) {
                android.util.SparseArray sparseArray3 = c1592o.f6629x;
                if (i5 >= sparseArray3.size()) {
                    break;
                }
                c1592o.f6620o.removeView((p030G2.C0240b) sparseArray3.valueAt(i5));
                i5++;
            }
            c1592o.m3512c();
            if (c1592o.f6620o == null) {
                android.util.Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i6 = 0;
                while (true) {
                    sparseArray = c1592o.f6630y;
                    if (i6 >= sparseArray.size()) {
                        break;
                    }
                    c1592o.f6620o.removeView((android.view.View) sparseArray.valueAt(i6));
                    i6++;
                }
                sparseArray.clear();
            }
            c1592o.f6620o = null;
            c1592o.f6610B = false;
            int i7 = 0;
            while (true) {
                android.util.SparseArray sparseArray4 = c1592o.f6628w;
                if (i7 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.InterfaceC1583f) sparseArray4.valueAt(i7)).getClass();
                i7++;
            }
            io.flutter.plugin.platform.C1591n c1591n = this.f210s.f370t;
            int i8 = 0;
            while (true) {
                android.util.SparseArray sparseArray5 = c1591n.f6602u;
                if (i8 >= sparseArray5.size()) {
                    break;
                }
                c1591n.f6596o.removeView((p030G2.C0240b) sparseArray5.valueAt(i8));
                i8++;
            }
            android.view.Surface surface = c1591n.f6606y;
            if (surface != null) {
                surface.release();
                c1591n.f6606y = null;
                c1591n.f6607z = null;
            }
            c1591n.f6596o = null;
            int i9 = 0;
            while (true) {
                android.util.SparseArray sparseArray6 = c1591n.f6601t;
                if (i9 >= sparseArray6.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.InterfaceC1583f) sparseArray6.valueAt(i9)).getClass();
                i9++;
            }
            this.f210s.f369s.mo1724f();
            this.f210s.f370t.mo1724f();
            io.flutter.view.C1610g c1610g = this.f194A;
            c1610g.f6772u = true;
            c1610g.f6756e.mo1724f();
            c1610g.f6770s = null;
            android.view.accessibility.AccessibilityManager accessibilityManager = c1610g.f6754c;
            accessibilityManager.removeAccessibilityStateChangeListener(c1610g.f6774w);
            accessibilityManager.removeTouchExplorationStateChangeListener(c1610g.f6775x);
            c1610g.f6757f.unregisterContentObserver(c1610g.f6776y);
            android.support.v4.media.session.C1061t c1061t = c1610g.f6753b;
            c1061t.f3863o = null;
            ((io.flutter.embedding.engine.FlutterJNI) c1061t.f3862n).setAccessibilityDelegate(null);
            this.f194A = null;
            this.f213v.f6536b.restartInput(this);
            this.f213v.m3498c();
            int size = ((java.util.HashSet) this.f216y.f3862n).size();
            if (size > 0) {
                android.util.Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.SpellCheckerSessionSpellCheckerSessionListenerC1572h spellCheckerSessionSpellCheckerSessionListenerC1572h = this.f214w;
            if (spellCheckerSessionSpellCheckerSessionListenerC1572h != null) {
                spellCheckerSessionSpellCheckerSessionListenerC1572h.f6522a.f188m = null;
                android.view.textservice.SpellCheckerSession spellCheckerSession = spellCheckerSessionSpellCheckerSessionListenerC1572h.f6524c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            p008B1.C0026d c0026d = this.f212u;
            if (c0026d != null) {
                ((p009B2.C0061r) c0026d.f100n).f188m = null;
            }
            io.flutter.embedding.engine.renderer.C1561j c1561j = this.f210s.f352b;
            this.f209r = false;
            c1561j.f6478a.removeIsDisplayingFlutterUiListener(this.f200G);
            c1561j.m3451h();
            c1561j.f6478a.setSemanticsEnabled(false);
            android.view.View view = this.f207p;
            if (view != null && this.f206o == this.f205n) {
                this.f206o = view;
            }
            this.f206o.mo195c();
            p009B2.C0053j c0053j = this.f205n;
            if (c0053j != null) {
                c0053j.f167l.close();
                removeView(this.f205n);
                this.f205n = null;
            }
            this.f207p = null;
            this.f210s = null;
        }
    }

    @Override // android.view.View
    public final void autofill(android.util.SparseArray sparseArray) {
        p035I.C0291m c0291m;
        p035I.C0291m c0291m2;
        io.flutter.plugin.editing.C1575k c1575k = this.f213v;
        p043K2.C0340p c0340p = c1575k.f6540f;
        if (c0340p == null || c1575k.f6541g == null || (c0291m = c0340p.f1058j) == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            p043K2.C0340p c0340p2 = (p043K2.C0340p) c1575k.f6541g.get(sparseArray.keyAt(i4));
            if (c0340p2 != null && (c0291m2 = c0340p2.f1058j) != null) {
                java.lang.String charSequence = ((android.view.autofill.AutofillValue) sparseArray.valueAt(i4)).getTextValue().toString();
                p043K2.C0342r c0342r = new p043K2.C0342r(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                java.lang.String str = (java.lang.String) c0291m.f876l;
                java.lang.String str2 = (java.lang.String) c0291m2.f876l;
                if (str2.equals(str)) {
                    c1575k.f6542h.m3492f(c0342r);
                } else {
                    hashMap.put(str2, c0342r);
                }
            }
        }
        int i5 = c1575k.f6539e.f327c;
        p008B1.C0026d c0026d = c1575k.f6538d;
        c0026d.getClass();
        java.lang.String.valueOf(hashMap.size());
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            p043K2.C0342r c0342r2 = (p043K2.C0342r) entry.getValue();
            hashMap2.put((java.lang.String) entry.getKey(), p008B1.C0026d.m102j(c0342r2.f1065a, c0342r2.f1066b, c0342r2.f1067c, -1, -1));
        }
        ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.updateEditingStateWithTag", java.util.Arrays.asList(java.lang.Integer.valueOf(i5), hashMap2), null);
    }

    /* renamed from: b */
    public final void m277b() {
        p009B2.C0055l c0055l = this.f203l;
        if (c0055l != null) {
            addView(c0055l);
        } else {
            p009B2.C0057n c0057n = this.f204m;
            if (c0057n != null) {
                addView(c0057n);
            } else {
                addView(this.f205n);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAutofill(1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    /* renamed from: c */
    public final boolean m278c() {
        p013C2.C0138c c0138c = this.f210s;
        if (c0138c != null) {
            if (c0138c.f352b == this.f206o.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(android.view.View view) {
        p013C2.C0138c c0138c = this.f210s;
        if (c0138c == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.C1592o c1592o = c0138c.f369s;
        if (view == null) {
            c1592o.getClass();
            return false;
        }
        java.util.HashMap hashMap = c1592o.f6627v;
        if (!hashMap.containsKey(view.getContext())) {
            return false;
        }
        android.view.View view2 = (android.view.View) hashMap.get(view.getContext());
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m279d() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009B2.C0064u.m279d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (m278c() && this.f216y.m2231k0(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    public final void m280e() {
        if (!m278c()) {
            android.util.Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f4 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.C1560i c1560i = this.f197D;
        c1560i.f6460a = f4;
        c1560i.f6475p = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.C1561j c1561j = this.f210s.f352b;
        c1561j.getClass();
        if (c1560i.f6461b <= 0 || c1560i.f6462c <= 0 || c1560i.f6460a <= 0.0f) {
            return;
        }
        java.util.ArrayList arrayList = c1560i.f6476q;
        arrayList.size();
        java.util.ArrayList arrayList2 = c1560i.f6477r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            io.flutter.embedding.engine.renderer.C1552a c1552a = (io.flutter.embedding.engine.renderer.C1552a) arrayList.get(i4);
            int i5 = i4 * 4;
            android.graphics.Rect rect = c1552a.f6440a;
            iArr[i5] = rect.left;
            iArr[i5 + 1] = rect.top;
            iArr[i5 + 2] = rect.right;
            iArr[i5 + 3] = rect.bottom;
            iArr2[i4] = p044L.AbstractC0352j.m781b(c1552a.f6441b);
            iArr3[i4] = p044L.AbstractC0352j.m781b(c1552a.f6442c);
        }
        int size2 = arrayList.size() * 4;
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            io.flutter.embedding.engine.renderer.C1552a c1552a2 = (io.flutter.embedding.engine.renderer.C1552a) arrayList2.get(i6);
            int i7 = (i6 * 4) + size2;
            android.graphics.Rect rect2 = c1552a2.f6440a;
            iArr[i7] = rect2.left;
            iArr[i7 + 1] = rect2.top;
            iArr[i7 + 2] = rect2.right;
            iArr[i7 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i6] = p044L.AbstractC0352j.m781b(c1552a2.f6441b);
            iArr3[arrayList.size() + i6] = p044L.AbstractC0352j.m781b(c1552a2.f6442c);
        }
        c1561j.f6478a.setViewportMetrics(c1560i.f6460a, c1560i.f6461b, c1560i.f6462c, c1560i.f6463d, c1560i.f6464e, c1560i.f6465f, c1560i.f6466g, c1560i.f6467h, c1560i.f6468i, c1560i.f6469j, c1560i.f6470k, c1560i.f6471l, c1560i.f6472m, c1560i.f6473n, c1560i.f6474o, c1560i.f6475p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.C1610g c1610g = this.f194A;
        if (c1610g == null || !c1610g.f6754c.isEnabled()) {
            return null;
        }
        return this.f194A;
    }

    public p013C2.C0138c getAttachedFlutterEngine() {
        return this.f210s;
    }

    public p047L2.InterfaceC0376f getBinaryMessenger() {
        return this.f210s.f353c;
    }

    public p009B2.C0053j getCurrentImageSurface() {
        return this.f205n;
    }

    public io.flutter.embedding.engine.renderer.C1560i getViewportMetrics() {
        return this.f197D;
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
        throw new UnsupportedOperationException("Method not decompiled: p009B2.C0064u.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [u3.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        p009B2.C0061r c0061r;
        p110b3.C1196j c1196j = p110b3.C1196j.f4623l;
        int i4 = 0;
        super.onAttachedToWindow();
        try {
            p198u1.C2239g c2239g = p198u1.InterfaceC2240h.f8927i;
            android.content.Context context = getContext();
            c2239g.getClass();
            c0061r = new p009B2.C0061r(2, new p094Y.C0886x(p198u1.C2239g.m4439a(context)));
        } catch (java.lang.NoClassDefFoundError unused) {
            c0061r = null;
        }
        this.f196C = c0061r;
        android.app.Activity m1818z = p101a.AbstractC0936a.m1818z(getContext());
        p009B2.C0061r c0061r2 = this.f196C;
        if (c0061r2 == null || m1818z == null) {
            return;
        }
        this.f201H = new p009B2.C0060q(i4, this);
        android.content.Context context2 = getContext();
        java.util.concurrent.Executor m405b = android.os.Build.VERSION.SDK_INT >= 28 ? p011C.AbstractC0113e.m405b(context2) : new p214y.ExecutorC2379a(new android.os.Handler(context2.getMainLooper()), 0);
        p009B2.C0060q c0060q = this.f201H;
        p094Y.C0886x c0886x = (p094Y.C0886x) c0061r2.f188m;
        p154k3.AbstractC1803h.m3779e(m405b, "executor");
        p154k3.AbstractC1803h.m3779e(c0060q, "consumer");
        p198u1.C2234b c2234b = (p198u1.C2234b) c0886x.f3175m;
        c2234b.getClass();
        p200u3.C2249c c2249c = new p200u3.C2249c(new p198u1.C2241i(c2234b, m1818z, null), c1196j, -2, 1);
        p218y3.C2421d c2421d = p187r3.AbstractC2074B.f8425a;
        p191s3.C2156c c2156c = p209w3.AbstractC2353o.f9301a;
        if (c2156c.mo678j(p187r3.C2129t.f8496m) != null) {
            throw new java.lang.IllegalArgumentException(("Flow context cannot contain job in it. Had " + c2156c).toString());
        }
        p200u3.C2249c c2249c2 = c2249c;
        if (!c2156c.equals(c1196j)) {
            c2249c2 = p205v3.AbstractC2296l.m4483a(c2249c, c2156c, 0, 0, 6);
        }
        p094Y.C0886x c0886x2 = (p094Y.C0886x) c0886x.f3176n;
        c0886x2.getClass();
        p154k3.AbstractC1803h.m3779e(c2249c2, "flow");
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) c0886x2.f3175m;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) c0886x2.f3176n;
        try {
            if (linkedHashMap.get(c0060q) == null) {
                p110b3.InterfaceC1195i c2082j = new p187r3.C2082J(m405b);
                if (c2082j.mo678j(p187r3.C2129t.f8496m) == null) {
                    c2082j = c2082j.mo676c(new p187r3.C2091T(null));
                }
                p189s1.C2140a c2140a = new p189s1.C2140a(c2249c2, c0060q, null);
                p110b3.InterfaceC1195i m4242a = p187r3.AbstractC2131v.m4242a(c2082j, c1196j, true);
                p218y3.C2421d c2421d2 = p187r3.AbstractC2074B.f8425a;
                if (m4242a != c2421d2 && m4242a.mo678j(p110b3.C1191e.f4622l) == null) {
                    m4242a = m4242a.mo676c(c2421d2);
                }
                p187r3.AbstractC2098a abstractC2098a = new p187r3.AbstractC2098a(m4242a, true);
                abstractC2098a.m4214W(1, abstractC2098a, c2140a);
                linkedHashMap.put(c0060q, abstractC2098a);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f210s != null) {
            this.f215x.m904b(configuration);
            m279d();
            p101a.AbstractC0936a.m1799g(getContext(), this.f210s);
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
        throw new UnsupportedOperationException("Method not decompiled: p009B2.C0064u.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p009B2.C0060q c0060q;
        p009B2.C0061r c0061r = this.f196C;
        if (c0061r != null && (c0060q = this.f201H) != null) {
            p094Y.C0886x c0886x = (p094Y.C0886x) ((p094Y.C0886x) c0061r.f188m).f3176n;
            c0886x.getClass();
            java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) c0886x.f3175m;
            reentrantLock.lock();
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) c0886x.f3176n;
            try {
                p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) linkedHashMap.get(c0060q);
                if (interfaceC2088P != null) {
                    interfaceC2088P.mo4170b(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f201H = null;
        this.f196C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if (m278c()) {
            p009B2.C0044a c0044a = this.f217z;
            android.content.Context context = getContext();
            c0044a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z4 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z4) {
                int m124b = p009B2.C0044a.m124b(motionEvent.getActionMasked());
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                c0044a.m125a(motionEvent, motionEvent.getActionIndex(), m124b, 0, p009B2.C0044a.f139e, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new java.lang.AssertionError("Packet position is not on field boundary.");
                }
                c0044a.f140a.f6478a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        return !m278c() ? super.onHoverEvent(motionEvent) : this.f194A.m3563f(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure viewStructure, int i4) {
        android.graphics.Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i4);
        io.flutter.plugin.editing.C1575k c1575k = this.f213v;
        if (c1575k.f6541g != null) {
            java.lang.String str = (java.lang.String) c1575k.f6540f.f1058j.f876l;
            android.view.autofill.AutofillId autofillId = viewStructure.getAutofillId();
            for (int i5 = 0; i5 < c1575k.f6541g.size(); i5++) {
                int keyAt = c1575k.f6541g.keyAt(i5);
                p035I.C0291m c0291m = ((p043K2.C0340p) c1575k.f6541g.valueAt(i5)).f1058j;
                if (c0291m != null) {
                    viewStructure.addChildCount(1);
                    android.view.ViewStructure newChild = viewStructure.newChild(i5);
                    newChild.setAutofillId(autofillId, keyAt);
                    java.lang.String[] strArr = (java.lang.String[]) c0291m.f877m;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    java.lang.String str2 = (java.lang.String) c0291m.f879o;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = c1575k.f6547m) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(((p043K2.C0342r) c0291m.f878n).f1065a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), c1575k.f6547m.height());
                        newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(c1575k.f6542h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        io.flutter.embedding.engine.renderer.C1560i c1560i = this.f197D;
        c1560i.f6461b = i4;
        c1560i.f6462c = i5;
        m280e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!m278c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f217z.m126c(motionEvent, p009B2.C0044a.f139e);
        return true;
    }

    public void setDelegate(p009B2.C0066w c0066w) {
        this.f202I = c0066w;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        android.view.View view = this.f206o;
        if (view instanceof p009B2.C0055l) {
            ((p009B2.C0055l) view).setVisibility(i4);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    public void setWindowInfoListenerDisplayFeatures(p198u1.C2242j c2242j) {
        ?? r8 = c2242j.f8932a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p198u1.C2235c c2235c : r8) {
            c2235c.f8915a.m4120c().toString();
            p185r1.C2059b c2059b = c2235c.f8915a;
            int m4119b = c2059b.m4119b();
            p198u1.C2234b c2234b = p198u1.C2234b.f8908o;
            int i4 = 2;
            int i5 = ((m4119b == 0 || c2059b.m4118a() == 0) ? p198u1.C2234b.f8907n : c2234b) == c2234b ? 3 : 2;
            p198u1.C2234b c2234b2 = p198u1.C2234b.f8909p;
            p198u1.C2234b c2234b3 = c2235c.f8917c;
            if (c2234b3 != c2234b2) {
                i4 = c2234b3 == p198u1.C2234b.f8910q ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.C1552a(c2059b.m4120c(), i5, i4));
        }
        java.util.ArrayList arrayList2 = this.f197D.f6476q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        m280e();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [B2.w, java.lang.Object] */
    public C0064u(p009B2.AbstractActivityC0047d abstractActivityC0047d, p009B2.C0057n c0057n) {
        super(abstractActivityC0047d, null);
        this.f208q = new java.util.HashSet();
        this.f211t = new java.util.HashSet();
        this.f197D = new io.flutter.embedding.engine.renderer.C1560i();
        this.f198E = new p009B2.C0061r(0, this);
        this.f199F = new p009B2.C0062s(this, new android.os.Handler(android.os.Looper.getMainLooper()), 0);
        this.f200G = new p009B2.C0048e(1, this);
        this.f202I = new java.lang.Object();
        this.f204m = c0057n;
        this.f206o = c0057n;
        m277b();
    }
}
