package c0;

import C.C0016c;
import T.C0095p;
import a0.C0118H;
import a0.C0127g;

/* renamed from: c0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0214m implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0215n f4630m;

    public /* synthetic */ RunnableC0214m(C0215n c0215n, int i4, long j4, long j5) {
        this.f4629l = 9;
        this.f4630m = c0215n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0215n c0215n = this.f4630m;
        int i4 = this.f4629l;
        c0215n.getClass();
        switch (i4) {
            case 0:
                int i5 = W.y.f2709a;
                C0118H c0118h = c0215n.f4632b.f3204a;
                c0118h.getClass();
                b0.e eVar = c0118h.f3257r;
                eVar.K(eVar.J(), 1007, new b0.d(1));
                return;
            case 1:
                int i6 = W.y.f2709a;
                b0.e eVar2 = c0215n.f4632b.f3204a.f3257r;
                eVar2.K(eVar2.J(), 1031, new b0.c(28));
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                int i7 = W.y.f2709a;
                b0.e eVar3 = c0215n.f4632b.f3204a.f3257r;
                eVar3.K(eVar3.J(), 1032, new b0.c(29));
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                int i8 = W.y.f2709a;
                b0.e eVar4 = c0215n.f4632b.f3204a.f3257r;
                eVar4.K(eVar4.J(), 1029, new b0.c(17));
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                int i9 = W.y.f2709a;
                b0.e eVar5 = c0215n.f4632b.f3204a.f3257r;
                eVar5.K(eVar5.J(), 1014, new b0.c(19));
                return;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                int i10 = W.y.f2709a;
                C0118H c0118h2 = c0215n.f4632b.f3204a;
                c0118h2.getClass();
                b0.e eVar6 = c0118h2.f3257r;
                eVar6.K(eVar6.J(), 1009, new b0.c(13));
                return;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                int i11 = W.y.f2709a;
                b0.e eVar7 = c0215n.f4632b.f3204a.f3257r;
                eVar7.K(eVar7.J(), 1008, new b0.c(0));
                return;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                int i12 = W.y.f2709a;
                b0.e eVar8 = c0215n.f4632b.f3204a.f3257r;
                eVar8.K(eVar8.J(), 1012, new b0.d(3));
                return;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                int i13 = W.y.f2709a;
                b0.e eVar9 = c0215n.f4632b.f3204a.f3257r;
                eVar9.K(eVar9.J(), 1010, new C0016c(28));
                return;
            default:
                int i14 = W.y.f2709a;
                b0.e eVar10 = c0215n.f4632b.f3204a.f3257r;
                eVar10.K(eVar10.J(), 1011, new b0.c(23));
                return;
        }
    }

    public /* synthetic */ RunnableC0214m(C0215n c0215n, long j4) {
        this.f4629l = 8;
        this.f4630m = c0215n;
    }

    public /* synthetic */ RunnableC0214m(C0215n c0215n, C0095p c0095p, C0127g c0127g) {
        this.f4629l = 5;
        this.f4630m = c0215n;
    }

    public /* synthetic */ RunnableC0214m(C0215n c0215n, Object obj, int i4) {
        this.f4629l = i4;
        this.f4630m = c0215n;
    }

    public /* synthetic */ RunnableC0214m(C0215n c0215n, String str, long j4, long j5) {
        this.f4629l = 6;
        this.f4630m = c0215n;
    }
}
