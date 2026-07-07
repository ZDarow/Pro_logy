package a0;

import I.C0044m;
import f2.C0278F;
import java.util.HashMap;
import k2.C0395h;
import m0.C0418G;
import m0.C0425f;
import m0.C0432m;
import m0.InterfaceC0424e;

/* loaded from: classes.dex */
public final /* synthetic */ class V implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3359l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3360m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3361n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f3362o;

    public /* synthetic */ V(Object obj, Object obj2, Object obj3, int i4) {
        this.f3359l = i4;
        this.f3360m = obj;
        this.f3361n = obj2;
        this.f3362o = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, q0.J] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3359l) {
            case 0:
                W w = (W) this.f3360m;
                w.getClass();
                f2.c0 g4 = ((C0278F) this.f3361n).g();
                b0.e eVar = w.f3365c;
                T.O o2 = eVar.f4347r;
                o2.getClass();
                C2.d dVar = eVar.f4344o;
                dVar.getClass();
                dVar.f368b = f2.I.j(g4);
                if (!g4.isEmpty()) {
                    dVar.f371e = (q0.F) g4.get(0);
                    q0.F f4 = (q0.F) this.f3362o;
                    f4.getClass();
                    dVar.f372f = f4;
                }
                if (((q0.F) dVar.f370d) == null) {
                    dVar.f370d = C2.d.e(o2, (f2.I) dVar.f368b, (q0.F) dVar.f371e, (T.S) dVar.f367a);
                }
                dVar.j(((C0118H) o2).t());
                return;
            case 1:
                C0395h c0395h = (C0395h) this.f3360m;
                C0044m c0044m = c0395h.f7073m;
                String str = (String) this.f3361n;
                if (c0044m != null) {
                    c0044m.j(str, (HashMap) this.f3362o, null);
                    return;
                } else {
                    c0395h.C("invokeMethodUIThread: tried to call method on closed channel: ".concat(str), 3);
                    return;
                }
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                B2.x xVar = ((C0425f) this.f3360m).f7201n;
                String str2 = (String) this.f3361n;
                m0.p pVar = (m0.p) xVar.f214m;
                pVar.f7268c = str2;
                InterfaceC0424e interfaceC0424e = (InterfaceC0424e) this.f3362o;
                C0418G x3 = interfaceC0424e.x();
                m0.r rVar = pVar.f7269d;
                if (x3 != null) {
                    C0432m c0432m = rVar.f7286o;
                    int m4 = interfaceC0424e.m();
                    m0.y yVar = c0432m.f7257t;
                    yVar.f7317n.put(Integer.valueOf(m4), x3);
                    rVar.f7282G = true;
                }
                rVar.z();
                return;
            default:
                f0.e eVar2 = (f0.e) this.f3360m;
                int i4 = eVar2.f5454a;
                this.f3361n.z(i4, eVar2.f5455b, (n0.g) this.f3362o);
                return;
        }
    }
}
