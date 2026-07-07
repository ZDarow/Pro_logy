package C2;

import B2.AbstractActivityC0003d;
import B2.C0006g;
import Y.x;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.m;
import io.flutter.plugin.platform.n;
import io.flutter.plugin.platform.o;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public final c f374b;

    /* renamed from: c, reason: collision with root package name */
    public final H2.a f375c;

    /* renamed from: e, reason: collision with root package name */
    public C0006g f377e;

    /* renamed from: f, reason: collision with root package name */
    public d f378f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f373a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f376d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f379g = false;

    public e(Context context, c cVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f374b = cVar;
        this.f375c = new H2.a(context, cVar, cVar.f347c, cVar.f346b, cVar.s.f6380l);
    }

    public final void a(H2.b bVar) {
        W2.a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            Class<?> cls = bVar.getClass();
            HashMap hashMap = this.f373a;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + this.f374b + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.d(this.f375c);
            if (bVar instanceof I2.a) {
                I2.a aVar = (I2.a) bVar;
                this.f376d.put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.h(this.f378f);
                }
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
    }

    public final void b(AbstractActivityC0003d abstractActivityC0003d, m mVar) {
        this.f378f = new d(abstractActivityC0003d, mVar);
        boolean booleanExtra = abstractActivityC0003d.getIntent() != null ? abstractActivityC0003d.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        c cVar = this.f374b;
        cVar.s.f6378G = booleanExtra;
        x xVar = cVar.f364u;
        o oVar = (o) xVar.f3065m;
        if (oVar.f6382n != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        oVar.f6382n = abstractActivityC0003d;
        oVar.f6385q = cVar.f346b;
        D2.b bVar = cVar.f347c;
        oVar.s = new B1.d(bVar, 12);
        n nVar = (n) xVar.f3066n;
        if (nVar.f6360n != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        nVar.f6360n = abstractActivityC0003d;
        B1.d dVar = new B1.d(bVar, 11);
        nVar.f6364r = dVar;
        dVar.f97n = nVar.f6357A;
        oVar.s.f97n = xVar;
        for (I2.a aVar : this.f376d.values()) {
            if (this.f379g) {
                aVar.f(this.f378f);
            } else {
                aVar.h(this.f378f);
            }
        }
        this.f379g = false;
    }

    public final void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        W2.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f376d.values().iterator();
            while (it.hasNext()) {
                ((I2.a) it.next()).e();
            }
            d();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        c cVar = this.f374b;
        o oVar = cVar.s;
        B1.d dVar = oVar.s;
        if (dVar != null) {
            dVar.f97n = null;
        }
        oVar.c();
        oVar.s = null;
        oVar.f6382n = null;
        oVar.f6385q = null;
        n nVar = cVar.f363t;
        B1.d dVar2 = nVar.f6364r;
        if (dVar2 != null) {
            dVar2.f97n = null;
        }
        Surface surface = nVar.f6369y;
        if (surface != null) {
            surface.release();
            nVar.f6369y = null;
            nVar.f6370z = null;
        }
        nVar.f6364r = null;
        nVar.f6360n = null;
        this.f377e = null;
        this.f378f = null;
    }

    public final void e() {
        if (f()) {
            c();
        }
    }

    public final boolean f() {
        return this.f377e != null;
    }
}
