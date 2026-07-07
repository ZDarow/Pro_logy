package p071R2;

/* renamed from: R2.o */
/* loaded from: classes.dex */
public final class C0609o implements p200u3.InterfaceC2250d {

    /* renamed from: l */
    public final /* synthetic */ int f1898l;

    /* renamed from: m */
    public final /* synthetic */ p200u3.InterfaceC2250d f1899m;

    /* renamed from: n */
    public final /* synthetic */ p048M.C0397d f1900n;

    public /* synthetic */ C0609o(p200u3.InterfaceC2250d interfaceC2250d, p048M.C0397d c0397d, int i4) {
        this.f1898l = i4;
        this.f1899m = interfaceC2250d;
        this.f1900n = c0397d;
    }

    @Override // p200u3.InterfaceC2250d
    /* renamed from: C */
    public final java.lang.Object mo266C(p200u3.InterfaceC2251e interfaceC2251e, p110b3.InterfaceC1190d interfaceC1190d) {
        switch (this.f1898l) {
            case 0:
                java.lang.Object mo266C = this.f1899m.mo266C(new p071R2.C0608n(interfaceC2251e, this.f1900n, 0), interfaceC1190d);
                return mo266C == p115c3.EnumC1252a.f4880l ? mo266C : p100Z2.C0934g.f3298a;
            case 1:
                java.lang.Object mo266C2 = this.f1899m.mo266C(new p071R2.C0608n(interfaceC2251e, this.f1900n, 1), interfaceC1190d);
                return mo266C2 == p115c3.EnumC1252a.f4880l ? mo266C2 : p100Z2.C0934g.f3298a;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object mo266C3 = this.f1899m.mo266C(new p071R2.C0608n(interfaceC2251e, this.f1900n, 2), interfaceC1190d);
                return mo266C3 == p115c3.EnumC1252a.f4880l ? mo266C3 : p100Z2.C0934g.f3298a;
            default:
                java.lang.Object mo266C4 = this.f1899m.mo266C(new p071R2.C0608n(interfaceC2251e, this.f1900n, 3), interfaceC1190d);
                return mo266C4 == p115c3.EnumC1252a.f4880l ? mo266C4 : p100Z2.C0934g.f3298a;
        }
    }
}
