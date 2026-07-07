package a0;

import q0.InterfaceC0468E;

/* renamed from: a0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0134n implements e2.j {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3551l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3552m;

    public /* synthetic */ C0134n(int i4, Object obj) {
        this.f3551l = i4;
        this.f3552m = obj;
    }

    @Override // e2.j
    public final Object get() {
        switch (this.f3551l) {
            case 0:
                return (C0130j) this.f3552m;
            case 1:
                return (InterfaceC0468E) this.f3552m;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.valueOf(((N) this.f3552m).f3293K);
            default:
                try {
                    return (InterfaceC0468E) ((Class) this.f3552m).getConstructor(null).newInstance(null);
                } catch (Exception e4) {
                    throw new IllegalStateException(e4);
                }
        }
    }
}
