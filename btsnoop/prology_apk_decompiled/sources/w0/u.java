package w0;

import C.C0016c;
import W.y;
import a0.C0118H;
import c0.C0215n;
import q0.F;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8881l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0215n f8882m;

    public /* synthetic */ u(C0215n c0215n, int i4, long j4) {
        this.f8881l = 1;
        this.f8882m = c0215n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0215n c0215n = this.f8882m;
        int i4 = this.f8881l;
        c0215n.getClass();
        switch (i4) {
            case 0:
                int i5 = y.f2709a;
                b0.e eVar = c0215n.f4632b.f3204a.f3257r;
                eVar.K(eVar.J(), 1016, new b0.c(18));
                return;
            case 1:
                int i6 = y.f2709a;
                b0.e eVar2 = c0215n.f4632b.f3204a.f3257r;
                eVar2.K(eVar2.G((F) eVar2.f4344o.f371e), 1018, new b0.c(3));
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                int i7 = y.f2709a;
                b0.e eVar3 = c0215n.f4632b.f3204a.f3257r;
                eVar3.K(eVar3.G((F) eVar3.f4344o.f371e), 1021, new b0.c(8));
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                int i8 = y.f2709a;
                b0.e eVar4 = c0215n.f4632b.f3204a.f3257r;
                eVar4.K(eVar4.J(), 1030, new C0016c(23));
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                int i9 = y.f2709a;
                C0118H c0118h = c0215n.f4632b.f3204a;
                c0118h.getClass();
                b0.e eVar5 = c0118h.f3257r;
                eVar5.K(eVar5.J(), 1015, new b0.c(14));
                return;
            default:
                int i10 = y.f2709a;
                b0.e eVar6 = c0215n.f4632b.f3204a.f3257r;
                eVar6.K(eVar6.J(), 1019, new b0.c(2));
                return;
        }
    }

    public /* synthetic */ u(C0215n c0215n, long j4, int i4) {
        this.f8881l = 2;
        this.f8882m = c0215n;
    }

    public /* synthetic */ u(C0215n c0215n, Object obj, int i4) {
        this.f8881l = i4;
        this.f8882m = c0215n;
    }

    public /* synthetic */ u(C0215n c0215n, String str, long j4, long j5) {
        this.f8881l = 0;
        this.f8882m = c0215n;
    }
}
