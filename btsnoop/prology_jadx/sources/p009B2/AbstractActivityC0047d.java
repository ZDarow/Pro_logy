package p009B2;

/* renamed from: B2.d */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0047d extends android.app.Activity implements androidx.lifecycle.InterfaceC1147k {

    /* renamed from: p */
    public static final int f146p = android.view.View.generateViewId();

    /* renamed from: l */
    public boolean f147l = false;

    /* renamed from: m */
    public p009B2.C0050g f148m;

    /* renamed from: n */
    public final androidx.lifecycle.C1149m f149n;

    /* renamed from: o */
    public final android.window.OnBackInvokedCallback f150o;

    public AbstractActivityC0047d() {
        int i4 = android.os.Build.VERSION.SDK_INT;
        this.f150o = i4 < 33 ? null : i4 >= 34 ? new p009B2.C0046c(this) : new android.window.OnBackInvokedCallback() { // from class: B2.b
            public final void onBackInvoked() {
                p009B2.AbstractActivityC0047d.this.onBackPressed();
            }
        };
        this.f149n = new androidx.lifecycle.C1149m(this);
    }

    @Override // androidx.lifecycle.InterfaceC1147k
    /* renamed from: b */
    public final androidx.lifecycle.C1149m mo127b() {
        return this.f149n;
    }

    /* renamed from: c */
    public final int m128c() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new java.lang.NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    /* renamed from: d */
    public final java.lang.String m129d() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    /* renamed from: e */
    public final java.lang.String m130e() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            android.os.Bundle m132g = m132g();
            java.lang.String string = m132g != null ? m132g.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    /* renamed from: f */
    public final java.lang.String m131f() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            android.os.Bundle m132g = m132g();
            if (m132g != null) {
                return m132g.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final android.os.Bundle m132g() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    /* renamed from: h */
    public final void m133h(boolean z4) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z4 && !this.f147l) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f150o);
                this.f147l = true;
                return;
            }
            return;
        }
        if (z4 || !this.f147l || android.os.Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f150o);
        this.f147l = false;
    }

    /* renamed from: i */
    public final boolean m134i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (m129d() != null || this.f148m.f161g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    /* renamed from: j */
    public final boolean m135j(java.lang.String str) {
        p009B2.C0050g c0050g = this.f148m;
        if (c0050g == null) {
            android.util.Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0050g.f164j) {
            return true;
        }
        android.util.Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, android.content.Intent intent) {
        if (m135j("onActivityResult")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            if (c0050g.f156b == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            java.util.Objects.toString(intent);
            p013C2.C0140e c0140e = c0050g.f156b.f354d;
            if (!c0140e.m489f()) {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            p089W2.AbstractC0821a.m1664b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                p013C2.C0139d c0139d = c0140e.f386f;
                c0139d.getClass();
                java.util.Iterator it = new java.util.HashSet((java.util.HashSet) c0139d.f377c).iterator();
                while (true) {
                    boolean z4 = false;
                    while (it.hasNext()) {
                        if (((p047L2.InterfaceC0388r) it.next()).mo578a(i4, i5, intent) || z4) {
                            z4 = true;
                        }
                    }
                    android.os.Trace.endSection();
                    return;
                }
            } catch (java.lang.Throwable th) {
                try {
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (m135j("onBackPressed")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c != null) {
                c0138c.f359i.f988a.m694j("popRoute", null, null);
            } else {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:23|24|(1:26)|27|28|(1:30)|31|(1:33)(1:171)|34|(1:36)(2:167|(1:169)(1:170))|(2:38|(1:40)(2:41|(1:43)(1:44)))|45|(4:47|48|49|(1:51)(2:152|(1:154)(2:155|156)))(1:166)|52|(1:54)|55|(1:57)(1:151)|(1:59)(1:150)|60|(1:62)(1:149)|(4:64|(1:66)(1:140)|(1:68)(1:139)|69)(4:141|(1:143)(1:148)|(1:145)(1:147)|146)|70|(8:72|(1:74)|75|(3:77|(1:79)|(3:81|(1:83)|84)(2:85|86))|87|(1:89)|90|91)|92|(1:94)|95|96|97|98|(2:(1:135)(1:102)|103)(1:136)|104|(2:105|(1:107)(1:108))|109|(2:110|(1:112)(1:113))|114|(2:115|(1:117)(1:118))|119|(2:120|(1:122)(1:123))|(2:124|(1:126)(1:127))|128|(8:130|(1:132)|75|(0)|87|(0)|90|91)(2:133|134)) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c5, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x045c  */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.view.TextureView, B2.n] */
    /* JADX WARN: Type inference failed for: r5v4, types: [P2.a, java.lang.Object] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009B2.AbstractActivityC0047d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (m135j("onDestroy")) {
            this.f148m.m140d();
            this.f148m.m141e();
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f150o);
            this.f147l = false;
        }
        p009B2.C0050g c0050g = this.f148m;
        if (c0050g != null) {
            c0050g.f155a = null;
            c0050g.f156b = null;
            c0050g.f157c = null;
            c0050g.f158d = null;
            c0050g.f159e = null;
            this.f148m = null;
        }
        this.f149n.m2660d(androidx.lifecycle.EnumC1141e.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (m135j("onNewIntent")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            p013C2.C0140e c0140e = c0138c.f354d;
            if (c0140e.m489f()) {
                p089W2.AbstractC0821a.m1664b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    java.util.Iterator it = ((java.util.HashSet) c0140e.f386f.f378d).iterator();
                    while (it.hasNext()) {
                        p190s2.C2151k c2151k = ((p190s2.C2144d) it.next()).f8552a;
                        c2151k.f8584p.f8564m.setIntent(intent);
                        c2151k.m4280u();
                    }
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    try {
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            java.lang.String m139c = c0050g.m139c(intent);
            if (m139c == null || m139c.isEmpty()) {
                return;
            }
            p043K2.C0325a c0325a = c0050g.f156b.f359i;
            c0325a.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("location", m139c);
            c0325a.f988a.m694j("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (m135j("onPause")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            c0050g.f155a.getClass();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c != null) {
                p043K2.C0327c c0327c = c0138c.f357g;
                c0327c.m724e(3, c0327c.f992c);
            }
        }
        this.f149n.m2660d(androidx.lifecycle.EnumC1141e.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (m135j("onPostResume")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            if (c0050g.f156b == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            p077T0.C0722j c0722j = c0050g.f158d;
            if (c0722j != null) {
                c0722j.m1316c();
            }
            c0050g.f156b.f369s.m3516j();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i4, java.lang.String[] strArr, int[] iArr) {
        if (m135j("onRequestPermissionsResult")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            if (c0050g.f156b == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            java.util.Arrays.toString(strArr);
            java.util.Arrays.toString(iArr);
            p013C2.C0140e c0140e = c0050g.f156b.f354d;
            if (!c0140e.m489f()) {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            p089W2.AbstractC0821a.m1664b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                java.util.Iterator it = ((java.util.HashSet) c0140e.f386f.f376b).iterator();
                while (true) {
                    boolean z4 = false;
                    while (it.hasNext()) {
                        if (((p047L2.InterfaceC0389s) it.next()).mo648c(i4, strArr, iArr) || z4) {
                            z4 = true;
                        }
                    }
                    android.os.Trace.endSection();
                    return;
                }
            } catch (java.lang.Throwable th) {
                try {
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f149n.m2660d(androidx.lifecycle.EnumC1141e.ON_RESUME);
        if (m135j("onResume")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            c0050g.f156b.f352b.m3450g();
            c0050g.f155a.getClass();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c != null) {
                p043K2.C0327c c0327c = c0138c.f357g;
                c0327c.m724e(2, c0327c.f992c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m135j("onSaveInstanceState")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            p009B2.AbstractActivityC0047d abstractActivityC0047d = c0050g.f155a;
            boolean z4 = false;
            if (abstractActivityC0047d.getIntent().hasExtra("enable_state_restoration")) {
                z4 = abstractActivityC0047d.getIntent().getBooleanExtra("enable_state_restoration", false);
            } else if (abstractActivityC0047d.m129d() == null) {
                z4 = true;
            }
            if (z4) {
                bundle.putByteArray("framework", (byte[]) c0050g.f156b.f361k.f1039b);
            }
            c0050g.f155a.getClass();
            android.os.Bundle bundle2 = new android.os.Bundle();
            p013C2.C0140e c0140e = c0050g.f156b.f354d;
            if (c0140e.m489f()) {
                p089W2.AbstractC0821a.m1664b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    java.util.Iterator it = ((java.util.HashSet) c0140e.f386f.f380f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        throw null;
                    }
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    try {
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0050g.f155a.m129d() == null || c0050g.f155a.m134i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0050g.f155a.f147l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r6 = this;
            super.onStart()
            androidx.lifecycle.m r0 = r6.f149n
            androidx.lifecycle.e r1 = androidx.lifecycle.EnumC1141e.ON_START
            r0.m2660d(r1)
            java.lang.String r0 = "onStart"
            boolean r0 = r6.m135j(r0)
            if (r0 == 0) goto Lde
            B2.g r0 = r6.f148m
            r0.m138b()
            B2.d r1 = r0.f155a
            java.lang.String r1 = r1.m129d()
            if (r1 == 0) goto L21
            goto Ld1
        L21:
            C2.c r1 = r0.f156b
            D2.b r1 = r1.f353c
            boolean r1 = r1.f482q
            if (r1 == 0) goto L2b
            goto Ld1
        L2b:
            B2.d r1 = r0.f155a
            java.lang.String r1 = r1.m131f()
            if (r1 != 0) goto L44
            B2.d r1 = r0.f155a
            r1.getClass()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r0.m139c(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "/"
        L44:
            B2.d r2 = r0.f155a
            r2.getClass()
            r3 = 0
            android.os.Bundle r2 = r2.m132g()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            if (r2 == 0) goto L57
            java.lang.String r4 = "io.flutter.EntrypointUri"
            java.lang.String r2 = r2.getString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            goto L58
        L57:
            r2 = r3
        L58:
            B2.d r4 = r0.f155a
            r4.m130e()
            C2.c r4 = r0.f156b
            K2.a r4 = r4.f359i
            I.m r4 = r4.f988a
            java.lang.String r5 = "setInitialRoute"
            r4.m694j(r5, r1, r3)
            B2.d r1 = r0.f155a
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo()
            int r4 = r4.flags
            r4 = r4 & 2
            if (r4 == 0) goto L8f
            android.content.Intent r4 = r1.getIntent()
            java.lang.String r4 = r4.getAction()
            java.lang.String r5 = "android.intent.action.RUN"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L8f
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r1.getDataString()
            if (r1 == 0) goto L8f
            r3 = r1
        L8f:
            if (r3 == 0) goto L97
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La3
        L97:
            android.support.v4.media.session.t r1 = android.support.v4.media.session.C1061t.m2201n0()
            java.lang.Object r1 = r1.f3861m
            F2.f r1 = (p026F2.C0229f) r1
            F2.b r1 = r1.f656d
            java.lang.String r3 = r1.f643b
        La3:
            if (r2 != 0) goto Lb1
            D2.a r1 = new D2.a
            B2.d r2 = r0.f155a
            java.lang.String r2 = r2.m130e()
            r1.<init>(r3, r2)
            goto Lbc
        Lb1:
            D2.a r1 = new D2.a
            B2.d r4 = r0.f155a
            java.lang.String r4 = r4.m130e()
            r1.<init>(r3, r2, r4)
        Lbc:
            C2.c r2 = r0.f156b
            D2.b r2 = r2.f353c
            B2.d r3 = r0.f155a
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "dart_entrypoint_args"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.List r3 = (java.util.List) r3
            r2.m538e(r1, r3)
        Ld1:
            java.lang.Integer r1 = r0.f165k
            if (r1 == 0) goto Lde
            B2.u r0 = r0.f157c
            int r1 = r1.intValue()
            r0.setVisibility(r1)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p009B2.AbstractActivityC0047d.onStart():void");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (m135j("onStop")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            c0050g.f155a.getClass();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c != null) {
                p043K2.C0327c c0327c = c0138c.f357g;
                c0327c.m724e(5, c0327c.f992c);
            }
            c0050g.f165k = java.lang.Integer.valueOf(c0050g.f157c.getVisibility());
            c0050g.f157c.setVisibility(8);
            p013C2.C0138c c0138c2 = c0050g.f156b;
            if (c0138c2 != null) {
                c0138c2.f352b.m3448e(40);
            }
        }
        this.f149n.m2660d(androidx.lifecycle.EnumC1141e.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        if (m135j("onTrimMemory")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c != null) {
                if (c0050g.f163i && i4 >= 10) {
                    io.flutter.embedding.engine.FlutterJNI flutterJNI = c0138c.f353c.f477l;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    p043K2.C0326b c0326b = c0050g.f156b.f367q;
                    c0326b.getClass();
                    java.util.HashMap hashMap = new java.util.HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    c0326b.f989a.m700q(hashMap, null);
                }
                c0050g.f156b.f352b.m3448e(i4);
                io.flutter.plugin.platform.C1592o c1592o = c0050g.f156b.f369s;
                if (i4 < 40) {
                    c1592o.getClass();
                    return;
                }
                java.util.Iterator it = c1592o.f6626u.values().iterator();
                while (it.hasNext()) {
                    ((io.flutter.plugin.platform.C1576A) it.next()).f6559h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (m135j("onUserLeaveHint")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            p013C2.C0140e c0140e = c0138c.f354d;
            if (!c0140e.m489f()) {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            p089W2.AbstractC0821a.m1664b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                java.util.Iterator it = ((java.util.HashSet) c0140e.f386f.f379e).iterator();
                if (!it.hasNext()) {
                    android.os.Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new java.lang.ClassCastException();
                    }
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                try {
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (m135j("onWindowFocusChanged")) {
            p009B2.C0050g c0050g = this.f148m;
            c0050g.m138b();
            c0050g.f155a.getClass();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c != null) {
                p043K2.C0327c c0327c = c0138c.f357g;
                if (z4) {
                    c0327c.m724e(c0327c.f990a, true);
                } else {
                    c0327c.m724e(c0327c.f990a, false);
                }
            }
        }
    }
}
