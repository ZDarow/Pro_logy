package m0;

import a.AbstractC0110a;
import a0.V;
import android.os.Handler;

/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425f implements u0.k {

    /* renamed from: l, reason: collision with root package name */
    public final int f7199l;

    /* renamed from: m, reason: collision with root package name */
    public final v f7200m;

    /* renamed from: n, reason: collision with root package name */
    public final B2.x f7201n;

    /* renamed from: o, reason: collision with root package name */
    public final Y.x f7202o;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC0423d f7204q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0424e f7205r;
    public C0426g s;

    /* renamed from: t, reason: collision with root package name */
    public y0.l f7206t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f7207u;
    public volatile long w;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f7203p = W.y.n(null);

    /* renamed from: v, reason: collision with root package name */
    public volatile long f7208v = -9223372036854775807L;

    public C0425f(int i4, v vVar, B2.x xVar, Y.x xVar2, InterfaceC0423d interfaceC0423d) {
        this.f7199l = i4;
        this.f7200m = vVar;
        this.f7201n = xVar;
        this.f7202o = xVar2;
        this.f7204q = interfaceC0423d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T.t] */
    @Override // u0.k
    public final void b() {
        if (this.f7207u) {
            this.f7207u = false;
        }
        try {
            if (this.f7205r == null) {
                InterfaceC0424e l4 = this.f7204q.l(this.f7199l);
                this.f7205r = l4;
                this.f7203p.post(new V(this, l4.g(), this.f7205r, 2));
                InterfaceC0424e interfaceC0424e = this.f7205r;
                interfaceC0424e.getClass();
                this.f7206t = new y0.l(interfaceC0424e, 0L, -1L);
                C0426g c0426g = new C0426g(this.f7200m.f7304a, this.f7199l);
                this.s = c0426g;
                c0426g.g(this.f7202o);
            }
            while (!this.f7207u) {
                if (this.f7208v != -9223372036854775807L) {
                    C0426g c0426g2 = this.s;
                    c0426g2.getClass();
                    c0426g2.b(this.w, this.f7208v);
                    this.f7208v = -9223372036854775807L;
                }
                C0426g c0426g3 = this.s;
                c0426g3.getClass();
                y0.l lVar = this.f7206t;
                lVar.getClass();
                if (c0426g3.l(lVar, new Object()) == -1) {
                    break;
                }
            }
            this.f7207u = false;
            InterfaceC0424e interfaceC0424e2 = this.f7205r;
            interfaceC0424e2.getClass();
            if (interfaceC0424e2.h()) {
                AbstractC0110a.m(this.f7205r);
                this.f7205r = null;
            }
        } catch (Throwable th) {
            InterfaceC0424e interfaceC0424e3 = this.f7205r;
            interfaceC0424e3.getClass();
            if (interfaceC0424e3.h()) {
                AbstractC0110a.m(this.f7205r);
                this.f7205r = null;
            }
            throw th;
        }
    }

    @Override // u0.k
    public final void c() {
        this.f7207u = true;
    }
}
