package R2;

import b3.InterfaceC0190d;
import c3.EnumC0225a;

/* renamed from: R2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079o implements u3.d {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1832l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u3.d f1833m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M.d f1834n;

    public /* synthetic */ C0079o(u3.d dVar, M.d dVar2, int i4) {
        this.f1832l = i4;
        this.f1833m = dVar;
        this.f1834n = dVar2;
    }

    @Override // u3.d
    public final Object C(u3.e eVar, InterfaceC0190d interfaceC0190d) {
        switch (this.f1832l) {
            case 0:
                Object C4 = this.f1833m.C(new C0078n(eVar, this.f1834n, 0), interfaceC0190d);
                return C4 == EnumC0225a.f4710l ? C4 : Z2.g.f3186a;
            case 1:
                Object C5 = this.f1833m.C(new C0078n(eVar, this.f1834n, 1), interfaceC0190d);
                return C5 == EnumC0225a.f4710l ? C5 : Z2.g.f3186a;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object C6 = this.f1833m.C(new C0078n(eVar, this.f1834n, 2), interfaceC0190d);
                return C6 == EnumC0225a.f4710l ? C6 : Z2.g.f3186a;
            default:
                Object C7 = this.f1833m.C(new C0078n(eVar, this.f1834n, 3), interfaceC0190d);
                return C7 == EnumC0225a.f4710l ? C7 : Z2.g.f3186a;
        }
    }
}
