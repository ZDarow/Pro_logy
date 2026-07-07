package r0;

import Y.x;
import q0.Z;
import q0.a0;

/* renamed from: r0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505g implements a0 {

    /* renamed from: l, reason: collision with root package name */
    public final C0506h f8028l;

    /* renamed from: m, reason: collision with root package name */
    public final Z f8029m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8030n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8031o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0506h f8032p;

    public C0505g(C0506h c0506h, C0506h c0506h2, Z z4, int i4) {
        this.f8032p = c0506h;
        this.f8028l = c0506h2;
        this.f8029m = z4;
        this.f8030n = i4;
    }

    @Override // q0.a0
    public final void a() {
    }

    public final void b() {
        if (this.f8031o) {
            return;
        }
        C0506h c0506h = this.f8032p;
        f0.e eVar = c0506h.f8047r;
        int[] iArr = c0506h.f8042m;
        int i4 = this.f8030n;
        eVar.a(iArr[i4], c0506h.f8043n[i4], 0, null, c0506h.f8037E);
        this.f8031o = true;
    }

    public final void c() {
        C0506h c0506h = this.f8032p;
        boolean[] zArr = c0506h.f8044o;
        int i4 = this.f8030n;
        W.a.j(zArr[i4]);
        c0506h.f8044o[i4] = false;
    }

    @Override // q0.a0
    public final boolean d() {
        C0506h c0506h = this.f8032p;
        return !c0506h.y() && this.f8029m.s(c0506h.f8040H);
    }

    @Override // q0.a0
    public final int n(long j4) {
        C0506h c0506h = this.f8032p;
        if (c0506h.y()) {
            return 0;
        }
        boolean z4 = c0506h.f8040H;
        Z z5 = this.f8029m;
        int p2 = z5.p(j4, z4);
        AbstractC0499a abstractC0499a = c0506h.f8039G;
        if (abstractC0499a != null) {
            p2 = Math.min(p2, abstractC0499a.e(this.f8030n + 1) - z5.n());
        }
        z5.C(p2);
        if (p2 > 0) {
            b();
        }
        return p2;
    }

    @Override // q0.a0
    public final int o(x xVar, Z.f fVar, int i4) {
        C0506h c0506h = this.f8032p;
        if (c0506h.y()) {
            return -3;
        }
        AbstractC0499a abstractC0499a = c0506h.f8039G;
        Z z4 = this.f8029m;
        if (abstractC0499a != null && abstractC0499a.e(this.f8030n + 1) <= z4.n()) {
            return -3;
        }
        b();
        return z4.x(xVar, fVar, i4, c0506h.f8040H);
    }
}
