package p132g0;

/* renamed from: g0.f */
/* loaded from: classes.dex */
public final class C1461f extends p184r0.AbstractC2044b {

    /* renamed from: o */
    public final java.util.List f5847o;

    /* renamed from: p */
    public final long f5848p;

    public C1461f(long j4, java.util.List list) {
        super(0L, list.size() - 1);
        this.f5848p = j4;
        this.f5847o = list;
    }

    @Override // p184r0.InterfaceC2056n
    /* renamed from: b */
    public final long mo2992b() {
        m4101a();
        p136h0.AbstractC1490g abstractC1490g = (p136h0.AbstractC1490g) this.f5847o.get((int) this.f8313n);
        return this.f5848p + abstractC1490g.f6100p + abstractC1490g.f6098n;
    }

    @Override // p184r0.InterfaceC2056n
    /* renamed from: c */
    public final long mo2993c() {
        m4101a();
        return this.f5848p + ((p136h0.AbstractC1490g) this.f5847o.get((int) this.f8313n)).f6100p;
    }
}
