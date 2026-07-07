package p198u1;

/* renamed from: u1.b */
/* loaded from: classes.dex */
public final class C2234b implements p198u1.InterfaceC2240h {

    /* renamed from: n */
    public static final p198u1.C2234b f8907n;

    /* renamed from: o */
    public static final p198u1.C2234b f8908o;

    /* renamed from: p */
    public static final p198u1.C2234b f8909p;

    /* renamed from: q */
    public static final p198u1.C2234b f8910q;

    /* renamed from: r */
    public static final p198u1.C2234b f8911r;

    /* renamed from: s */
    public static final p198u1.C2234b f8912s;

    /* renamed from: l */
    public final /* synthetic */ int f8913l;

    /* renamed from: m */
    public final java.lang.Object f8914m;

    static {
        int i4 = 0;
        f8907n = new p198u1.C2234b("NONE", i4);
        f8908o = new p198u1.C2234b("FULL", i4);
        int i5 = 1;
        f8909p = new p198u1.C2234b("FLAT", i5);
        f8910q = new p198u1.C2234b("HALF_OPENED", i5);
        int i6 = 2;
        f8911r = new p198u1.C2234b("FOLD", i6);
        f8912s = new p198u1.C2234b("HINGE", i6);
    }

    public /* synthetic */ C2234b(java.lang.String str, int i4) {
        this.f8913l = i4;
        this.f8914m = str;
    }

    public java.lang.String toString() {
        switch (this.f8913l) {
            case 0:
                return (java.lang.String) this.f8914m;
            case 1:
                return (java.lang.String) this.f8914m;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return (java.lang.String) this.f8914m;
            default:
                return super.toString();
        }
    }

    public C2234b(p203v1.InterfaceC2270a interfaceC2270a) {
        this.f8913l = 3;
        int i4 = p198u1.C2245m.f8936b;
        this.f8914m = interfaceC2270a;
    }
}
