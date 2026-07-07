package p122e0;

/* renamed from: e0.k */
/* loaded from: classes.dex */
public final class C1310k extends p122e0.AbstractC1312m implements p117d0.InterfaceC1264h {

    /* renamed from: q */
    public final p122e0.AbstractC1313n f5262q;

    public C1310k(long j4, p076T.C0702p c0702p, p129f2.AbstractC1393I abstractC1393I, p122e0.AbstractC1313n abstractC1313n, java.util.ArrayList arrayList) {
        super(c0702p, abstractC1393I, abstractC1313n, arrayList);
        this.f5262q = abstractC1313n;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: D */
    public final long mo620D(long j4, long j5) {
        p122e0.AbstractC1313n abstractC1313n = this.f5262q;
        if (abstractC1313n.f5272f != null) {
            return -9223372036854775807L;
        }
        long m3070b = abstractC1313n.m3070b(j4, j5) + abstractC1313n.m3071c(j4, j5);
        return (abstractC1313n.m3073e(m3070b, j4) + abstractC1313n.m3075g(m3070b)) - abstractC1313n.f5275i;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: E */
    public final p122e0.C1309j mo621E(long j4) {
        return this.f5262q.mo3076h(this, j4);
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: a */
    public final long mo625a(long j4) {
        return this.f5262q.m3075g(j4);
    }

    @Override // p122e0.AbstractC1312m
    /* renamed from: b */
    public final java.lang.String mo3067b() {
        return null;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: c */
    public final long mo626c(long j4, long j5) {
        return this.f5262q.m3074f(j4, j5);
    }

    @Override // p122e0.AbstractC1312m
    /* renamed from: d */
    public final p117d0.InterfaceC1264h mo3068d() {
        return this;
    }

    @Override // p122e0.AbstractC1312m
    /* renamed from: e */
    public final p122e0.C1309j mo3069e() {
        return null;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: f */
    public final boolean mo629f() {
        return this.f5262q.mo3077i();
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: i */
    public final long mo630i(long j4, long j5) {
        return this.f5262q.m3073e(j4, j5);
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: l */
    public final long mo632l() {
        return this.f5262q.f5270d;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: q */
    public final long mo635q(long j4) {
        return this.f5262q.mo3072d(j4);
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: r */
    public final long mo636r(long j4, long j5) {
        return this.f5262q.m3070b(j4, j5);
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: u */
    public final long mo639u(long j4, long j5) {
        return this.f5262q.m3071c(j4, j5);
    }
}
