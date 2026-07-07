package p102a0;

/* renamed from: a0.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0988n implements p124e2.InterfaceC1362j {

    /* renamed from: l */
    public final /* synthetic */ int f3674l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f3675m;

    public /* synthetic */ C0988n(int i4, java.lang.Object obj) {
        this.f3674l = i4;
        this.f3675m = obj;
    }

    @Override // p124e2.InterfaceC1362j
    public final java.lang.Object get() {
        switch (this.f3674l) {
            case 0:
                return (p102a0.C0980j) this.f3675m;
            case 1:
                return (p179q0.InterfaceC1963E) this.f3675m;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Boolean.valueOf(((p102a0.C0950N) this.f3675m).f3409K);
            default:
                try {
                    return (p179q0.InterfaceC1963E) ((java.lang.Class) this.f3675m).getConstructor(null).newInstance(null);
                } catch (java.lang.Exception e4) {
                    throw new java.lang.IllegalStateException(e4);
                }
        }
    }
}
