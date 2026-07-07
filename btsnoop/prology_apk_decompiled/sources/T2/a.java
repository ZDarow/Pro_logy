package T2;

import T.J;
import T.M;
import T.O;
import a0.C0118H;
import a0.InterfaceC0138s;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a implements M {

    /* renamed from: l, reason: collision with root package name */
    public boolean f2425l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2426m = false;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0138s f2427n;

    /* renamed from: o, reason: collision with root package name */
    public final m f2428o;

    public a(InterfaceC0138s interfaceC0138s, m mVar) {
        this.f2427n = interfaceC0138s;
        this.f2428o = mVar;
    }

    @Override // T.M
    public final void E(boolean z4) {
        m mVar = this.f2428o;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "isPlayingStateUpdate");
        hashMap.put("isPlaying", Boolean.valueOf(z4));
        mVar.f2454l.b(hashMap);
    }

    public abstract void a();

    @Override // T.M
    public final void f(int i4) {
        m mVar = this.f2428o;
        if (i4 == 2) {
            g(true);
            mVar.a(((C0118H) this.f2427n).m());
        } else if (i4 != 3) {
            if (i4 == 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "completed");
                mVar.f2454l.b(hashMap);
            }
        } else if (!this.f2426m) {
            this.f2426m = true;
            a();
        }
        if (i4 != 2) {
            g(false);
        }
    }

    public final void g(boolean z4) {
        if (this.f2425l == z4) {
            return;
        }
        this.f2425l = z4;
        k kVar = this.f2428o.f2454l;
        if (z4) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "bufferingStart");
            kVar.b(hashMap);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event", "bufferingEnd");
            kVar.b(hashMap2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, T2.j] */
    @Override // T.M
    public final void t(J j4) {
        g(false);
        if (j4.f2124l == 1002) {
            O o2 = this.f2427n;
            E0.e eVar = (E0.e) o2;
            eVar.getClass();
            eVar.k(((C0118H) eVar).q(), -9223372036854775807L, false);
            ((C0118H) o2).D();
            return;
        }
        k kVar = this.f2428o.f2454l;
        kVar.getClass();
        ?? obj = new Object();
        obj.f2445a = "VideoError";
        obj.f2446b = "Video player had error " + j4;
        obj.f2447c = null;
        if (!kVar.f2450c) {
            kVar.f2449b.add(obj);
        }
        kVar.a();
    }
}
