package p014C3;

/* renamed from: C3.g */
/* loaded from: classes.dex */
public final class C0150g extends p154k3.AbstractC1804i implements p149j3.InterfaceC1741p {

    /* renamed from: m */
    public final /* synthetic */ p154k3.C1808m f406m;

    /* renamed from: n */
    public final /* synthetic */ long f407n;

    /* renamed from: o */
    public final /* synthetic */ p154k3.C1810o f408o;

    /* renamed from: p */
    public final /* synthetic */ p010B3.C0085p f409p;

    /* renamed from: q */
    public final /* synthetic */ p154k3.C1810o f410q;

    /* renamed from: r */
    public final /* synthetic */ p154k3.C1810o f411r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150g(p154k3.C1808m c1808m, long j4, p154k3.C1810o c1810o, p010B3.C0085p c0085p, p154k3.C1810o c1810o2, p154k3.C1810o c1810o3) {
        super(2);
        this.f406m = c1808m;
        this.f407n = j4;
        this.f408o = c1810o;
        this.f409p = c0085p;
        this.f410q = c1810o2;
        this.f411r = c1810o3;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        if (intValue == 1) {
            p154k3.C1808m c1808m = this.f406m;
            if (c1808m.f7371l) {
                throw new java.io.IOException("bad zip: zip64 extra repeated");
            }
            c1808m.f7371l = true;
            if (longValue < this.f407n) {
                throw new java.io.IOException("bad zip: zip64 extra too short");
            }
            p154k3.C1810o c1810o = this.f408o;
            long j4 = c1810o.f7373l;
            p010B3.C0085p c0085p = this.f409p;
            if (j4 == 4294967295L) {
                j4 = c0085p.m342b();
            }
            c1810o.f7373l = j4;
            p154k3.C1810o c1810o2 = this.f410q;
            c1810o2.f7373l = c1810o2.f7373l == 4294967295L ? c0085p.m342b() : 0L;
            p154k3.C1810o c1810o3 = this.f411r;
            c1810o3.f7373l = c1810o3.f7373l == 4294967295L ? c0085p.m342b() : 0L;
        }
        return p100Z2.C0934g.f3298a;
    }
}
