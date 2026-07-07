package p117d0;

/* renamed from: d0.j */
/* loaded from: classes.dex */
public final class C1266j extends p184r0.AbstractC2044b {

    /* renamed from: o */
    public final /* synthetic */ int f5072o = 0;

    /* renamed from: p */
    public final java.lang.Object f5073p;

    public C1266j(p175p0.C1943b c1943b, int i4) {
        super(i4, c1943b.f7895k - 1);
        this.f5073p = c1943b;
    }

    @Override // p184r0.InterfaceC2056n
    /* renamed from: b */
    public final long mo2992b() {
        switch (this.f5072o) {
            case 0:
                m4101a();
                return ((p117d0.C1265i) this.f5073p).m2989e(this.f8313n);
            default:
                return ((p175p0.C1943b) this.f5073p).m3898b((int) this.f8313n) + mo2993c();
        }
    }

    @Override // p184r0.InterfaceC2056n
    /* renamed from: c */
    public final long mo2993c() {
        switch (this.f5072o) {
            case 0:
                m4101a();
                return ((p117d0.C1265i) this.f5073p).m2990f(this.f8313n);
            default:
                m4101a();
                return ((p175p0.C1943b) this.f5073p).f7899o[(int) this.f8313n];
        }
    }

    public C1266j(p117d0.C1265i c1265i, long j4, long j5) {
        super(j4, j5);
        this.f5073p = c1265i;
    }
}
