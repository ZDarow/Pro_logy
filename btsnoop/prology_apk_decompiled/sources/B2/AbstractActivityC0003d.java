package B2;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import s2.C0547d;

/* renamed from: B2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0003d extends Activity implements androidx.lifecycle.k {

    /* renamed from: p, reason: collision with root package name */
    public static final int f143p = View.generateViewId();

    /* renamed from: l, reason: collision with root package name */
    public boolean f144l = false;

    /* renamed from: m, reason: collision with root package name */
    public C0006g f145m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.m f146n;

    /* renamed from: o, reason: collision with root package name */
    public final OnBackInvokedCallback f147o;

    public AbstractActivityC0003d() {
        int i4 = Build.VERSION.SDK_INT;
        this.f147o = i4 < 33 ? null : i4 >= 34 ? new C0002c(this) : new OnBackInvokedCallback() { // from class: B2.b
            public final void onBackInvoked() {
                AbstractActivityC0003d.this.onBackPressed();
            }
        };
        this.f146n = new androidx.lifecycle.m(this);
    }

    @Override // androidx.lifecycle.k
    public final androidx.lifecycle.m b() {
        return this.f146n;
    }

    public final int c() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    public final String d() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String e() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle g4 = g();
            String string = g4 != null ? g4.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String f() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle g4 = g();
            if (g4 != null) {
                return g4.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle g() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void h(boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z4 && !this.f144l) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f147o);
                this.f144l = true;
                return;
            }
            return;
        }
        if (z4 || !this.f144l || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f147o);
        this.f144l = false;
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (d() != null || this.f145m.f158g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j(String str) {
        C0006g c0006g = this.f145m;
        if (c0006g == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0006g.f161j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        if (j("onActivityResult")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            if (c0006g.f153b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            C2.e eVar = c0006g.f153b.f348d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            W2.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                C2.d dVar = eVar.f378f;
                dVar.getClass();
                Iterator it = new HashSet((HashSet) dVar.f369c).iterator();
                while (true) {
                    boolean z4 = false;
                    while (it.hasNext()) {
                        if (((L2.r) it.next()).a(i4, i5, intent) || z4) {
                            z4 = true;
                        }
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (j("onBackPressed")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            C2.c cVar = c0006g.f153b;
            if (cVar != null) {
                cVar.f353i.f949a.j("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
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
        throw new UnsupportedOperationException("Method not decompiled: B2.AbstractActivityC0003d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (j("onDestroy")) {
            this.f145m.d();
            this.f145m.e();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f147o);
            this.f144l = false;
        }
        C0006g c0006g = this.f145m;
        if (c0006g != null) {
            c0006g.f152a = null;
            c0006g.f153b = null;
            c0006g.f154c = null;
            c0006g.f155d = null;
            c0006g.f156e = null;
            this.f145m = null;
        }
        this.f146n.d(androidx.lifecycle.e.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (j("onNewIntent")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            C2.c cVar = c0006g.f153b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C2.e eVar = cVar.f348d;
            if (eVar.f()) {
                W2.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) eVar.f378f.f370d).iterator();
                    while (it.hasNext()) {
                        s2.k kVar = ((C0547d) it.next()).f8233a;
                        kVar.f8263p.f8245m.setIntent(intent);
                        kVar.u();
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            String c4 = c0006g.c(intent);
            if (c4 == null || c4.isEmpty()) {
                return;
            }
            K2.a aVar = c0006g.f153b.f353i;
            aVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", c4);
            aVar.f949a.j("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (j("onPause")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            c0006g.f152a.getClass();
            C2.c cVar = c0006g.f153b;
            if (cVar != null) {
                K2.c cVar2 = cVar.f351g;
                cVar2.e(3, cVar2.f953c);
            }
        }
        this.f146n.d(androidx.lifecycle.e.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (j("onPostResume")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            if (c0006g.f153b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            T0.j jVar = c0006g.f155d;
            if (jVar != null) {
                jVar.c();
            }
            c0006g.f153b.s.j();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (j("onRequestPermissionsResult")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            if (c0006g.f153b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            C2.e eVar = c0006g.f153b.f348d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            W2.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) eVar.f378f.f368b).iterator();
                while (true) {
                    boolean z4 = false;
                    while (it.hasNext()) {
                        if (((L2.s) it.next()).c(i4, strArr, iArr) || z4) {
                            z4 = true;
                        }
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f146n.d(androidx.lifecycle.e.ON_RESUME);
        if (j("onResume")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            c0006g.f153b.f346b.g();
            c0006g.f152a.getClass();
            C2.c cVar = c0006g.f153b;
            if (cVar != null) {
                K2.c cVar2 = cVar.f351g;
                cVar2.e(2, cVar2.f953c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (j("onSaveInstanceState")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            AbstractActivityC0003d abstractActivityC0003d = c0006g.f152a;
            boolean z4 = false;
            if (abstractActivityC0003d.getIntent().hasExtra("enable_state_restoration")) {
                z4 = abstractActivityC0003d.getIntent().getBooleanExtra("enable_state_restoration", false);
            } else if (abstractActivityC0003d.d() == null) {
                z4 = true;
            }
            if (z4) {
                bundle.putByteArray("framework", (byte[]) c0006g.f153b.f355k.f1000b);
            }
            c0006g.f152a.getClass();
            Bundle bundle2 = new Bundle();
            C2.e eVar = c0006g.f153b.f348d;
            if (eVar.f()) {
                W2.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) eVar.f378f.f372f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0006g.f152a.d() == null || c0006g.f152a.i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0006g.f152a.f144l);
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
            androidx.lifecycle.m r0 = r6.f146n
            androidx.lifecycle.e r1 = androidx.lifecycle.e.ON_START
            r0.d(r1)
            java.lang.String r0 = "onStart"
            boolean r0 = r6.j(r0)
            if (r0 == 0) goto Lde
            B2.g r0 = r6.f145m
            r0.b()
            B2.d r1 = r0.f152a
            java.lang.String r1 = r1.d()
            if (r1 == 0) goto L21
            goto Ld1
        L21:
            C2.c r1 = r0.f153b
            D2.b r1 = r1.f347c
            boolean r1 = r1.f473q
            if (r1 == 0) goto L2b
            goto Ld1
        L2b:
            B2.d r1 = r0.f152a
            java.lang.String r1 = r1.f()
            if (r1 != 0) goto L44
            B2.d r1 = r0.f152a
            r1.getClass()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r0.c(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "/"
        L44:
            B2.d r2 = r0.f152a
            r2.getClass()
            r3 = 0
            android.os.Bundle r2 = r2.g()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            if (r2 == 0) goto L57
            java.lang.String r4 = "io.flutter.EntrypointUri"
            java.lang.String r2 = r2.getString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            goto L58
        L57:
            r2 = r3
        L58:
            B2.d r4 = r0.f152a
            r4.e()
            C2.c r4 = r0.f153b
            K2.a r4 = r4.f353i
            I.m r4 = r4.f949a
            java.lang.String r5 = "setInitialRoute"
            r4.j(r5, r1, r3)
            B2.d r1 = r0.f152a
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
            android.support.v4.media.session.t r1 = android.support.v4.media.session.t.n0()
            java.lang.Object r1 = r1.f3734m
            F2.f r1 = (F2.f) r1
            F2.b r1 = r1.f646d
            java.lang.String r3 = r1.f633b
        La3:
            if (r2 != 0) goto Lb1
            D2.a r1 = new D2.a
            B2.d r2 = r0.f152a
            java.lang.String r2 = r2.e()
            r1.<init>(r3, r2)
            goto Lbc
        Lb1:
            D2.a r1 = new D2.a
            B2.d r4 = r0.f152a
            java.lang.String r4 = r4.e()
            r1.<init>(r3, r2, r4)
        Lbc:
            C2.c r2 = r0.f153b
            D2.b r2 = r2.f347c
            B2.d r3 = r0.f152a
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "dart_entrypoint_args"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.List r3 = (java.util.List) r3
            r2.e(r1, r3)
        Ld1:
            java.lang.Integer r1 = r0.f162k
            if (r1 == 0) goto Lde
            B2.u r0 = r0.f154c
            int r1 = r1.intValue()
            r0.setVisibility(r1)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.AbstractActivityC0003d.onStart():void");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (j("onStop")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            c0006g.f152a.getClass();
            C2.c cVar = c0006g.f153b;
            if (cVar != null) {
                K2.c cVar2 = cVar.f351g;
                cVar2.e(5, cVar2.f953c);
            }
            c0006g.f162k = Integer.valueOf(c0006g.f154c.getVisibility());
            c0006g.f154c.setVisibility(8);
            C2.c cVar3 = c0006g.f153b;
            if (cVar3 != null) {
                cVar3.f346b.e(40);
            }
        }
        this.f146n.d(androidx.lifecycle.e.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        if (j("onTrimMemory")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            C2.c cVar = c0006g.f153b;
            if (cVar != null) {
                if (c0006g.f160i && i4 >= 10) {
                    FlutterJNI flutterJNI = cVar.f347c.f468l;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    K2.b bVar = c0006g.f153b.f361q;
                    bVar.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    bVar.f950a.q(hashMap, null);
                }
                c0006g.f153b.f346b.e(i4);
                io.flutter.plugin.platform.o oVar = c0006g.f153b.s;
                if (i4 < 40) {
                    oVar.getClass();
                    return;
                }
                Iterator it = oVar.f6388u.values().iterator();
                while (it.hasNext()) {
                    ((io.flutter.plugin.platform.A) it.next()).f6324h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (j("onUserLeaveHint")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            C2.c cVar = c0006g.f153b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C2.e eVar = cVar.f348d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            W2.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) eVar.f378f.f371e).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (j("onWindowFocusChanged")) {
            C0006g c0006g = this.f145m;
            c0006g.b();
            c0006g.f152a.getClass();
            C2.c cVar = c0006g.f153b;
            if (cVar != null) {
                K2.c cVar2 = cVar.f351g;
                if (z4) {
                    cVar2.e(cVar2.f951a, true);
                } else {
                    cVar2.e(cVar2.f951a, false);
                }
            }
        }
    }
}
