package B2;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import java.util.Iterator;

/* renamed from: B2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0003d f152a;

    /* renamed from: b, reason: collision with root package name */
    public C2.c f153b;

    /* renamed from: c, reason: collision with root package name */
    public u f154c;

    /* renamed from: d, reason: collision with root package name */
    public T0.j f155d;

    /* renamed from: e, reason: collision with root package name */
    public P2.a f156e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0005f f157f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f158g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f159h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f161j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f162k;

    /* renamed from: l, reason: collision with root package name */
    public final C0004e f163l = new C0004e(0, this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f160i = false;

    public C0006g(AbstractActivityC0003d abstractActivityC0003d) {
        this.f152a = abstractActivityC0003d;
    }

    public final void a() {
        if (this.f152a.i()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f152a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0003d abstractActivityC0003d = this.f152a;
        abstractActivityC0003d.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0003d + " connection to the engine " + abstractActivityC0003d.f145m.f153b + " evicted by another attaching activity");
        C0006g c0006g = abstractActivityC0003d.f145m;
        if (c0006g != null) {
            c0006g.d();
            abstractActivityC0003d.f145m.e();
        }
    }

    public final void b() {
        if (this.f152a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String c(Intent intent) {
        boolean z4;
        Uri data;
        AbstractActivityC0003d abstractActivityC0003d = this.f152a;
        abstractActivityC0003d.getClass();
        try {
            Bundle g4 = abstractActivityC0003d.g();
            z4 = (g4 == null || !g4.containsKey("flutter_deeplinking_enabled")) ? true : g4.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z4 = false;
        }
        if (!z4 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void d() {
        b();
        if (this.f157f != null) {
            this.f154c.getViewTreeObserver().removeOnPreDrawListener(this.f157f);
            this.f157f = null;
        }
        u uVar = this.f154c;
        if (uVar != null) {
            uVar.a();
            u uVar2 = this.f154c;
            uVar2.f205q.remove(this.f163l);
        }
    }

    public final void e() {
        if (this.f161j) {
            b();
            this.f152a.getClass();
            this.f152a.getClass();
            AbstractActivityC0003d abstractActivityC0003d = this.f152a;
            abstractActivityC0003d.getClass();
            if (abstractActivityC0003d.isChangingConfigurations()) {
                C2.e eVar = this.f153b.f348d;
                if (eVar.f()) {
                    W2.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        eVar.f379g = true;
                        Iterator it = eVar.f376d.values().iterator();
                        while (it.hasNext()) {
                            ((I2.a) it.next()).g();
                        }
                        eVar.d();
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
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f153b.f348d.c();
            }
            T0.j jVar = this.f155d;
            if (jVar != null) {
                ((B1.d) jVar.f2417n).f97n = null;
                this.f155d = null;
            }
            P2.a aVar = this.f156e;
            if (aVar != null) {
                ((r) aVar.f1502n).f185m = null;
                aVar.f1501m = null;
                this.f156e = null;
            }
            this.f152a.getClass();
            C2.c cVar = this.f153b;
            if (cVar != null) {
                K2.c cVar2 = cVar.f351g;
                cVar2.e(1, cVar2.f953c);
            }
            if (this.f152a.i()) {
                this.f153b.a();
                if (this.f152a.d() != null) {
                    r.i().m(this.f152a.d(), null);
                }
                this.f153b = null;
            }
            this.f161j = false;
        }
    }
}
