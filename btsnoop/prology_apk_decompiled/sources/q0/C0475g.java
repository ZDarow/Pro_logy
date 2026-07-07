package q0;

import java.util.ArrayList;

/* renamed from: q0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475g extends l0 {

    /* renamed from: A, reason: collision with root package name */
    public final T.T f7838A;

    /* renamed from: B, reason: collision with root package name */
    public C0473e f7839B;

    /* renamed from: C, reason: collision with root package name */
    public C0474f f7840C;

    /* renamed from: D, reason: collision with root package name */
    public long f7841D;

    /* renamed from: E, reason: collision with root package name */
    public long f7842E;
    public final long w;

    /* renamed from: x, reason: collision with root package name */
    public final long f7843x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f7844y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f7845z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0475g(AbstractC0469a abstractC0469a, long j4, long j5, boolean z4) {
        super(abstractC0469a);
        abstractC0469a.getClass();
        W.a.e(j4 >= 0);
        this.w = j4;
        this.f7843x = j5;
        this.f7844y = z4;
        this.f7845z = new ArrayList();
        this.f7838A = new T.T();
    }

    @Override // q0.l0
    public final void C(T.U u4) {
        if (this.f7840C != null) {
            return;
        }
        E(u4);
    }

    public final void E(T.U u4) {
        long j4;
        T.T t4 = this.f7838A;
        u4.n(0, t4);
        long j5 = t4.f2167p;
        C0473e c0473e = this.f7839B;
        ArrayList arrayList = this.f7845z;
        long j6 = this.f7843x;
        if (c0473e == null || arrayList.isEmpty()) {
            j4 = this.w;
            this.f7841D = j5 + j4;
            this.f7842E = j6 != Long.MIN_VALUE ? j5 + j6 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0472d c0472d = (C0472d) arrayList.get(i4);
                long j7 = this.f7841D;
                long j8 = this.f7842E;
                c0472d.f7822p = j7;
                c0472d.f7823q = j8;
            }
        } else {
            j4 = this.f7841D - j5;
            j6 = j6 != Long.MIN_VALUE ? this.f7842E - j5 : Long.MIN_VALUE;
        }
        try {
            C0473e c0473e2 = new C0473e(u4, j4, j6);
            this.f7839B = c0473e2;
            n(c0473e2);
        } catch (C0474f e4) {
            this.f7840C = e4;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C0472d) arrayList.get(i5)).f7824r = this.f7840C;
            }
        }
    }

    @Override // q0.AbstractC0469a
    public final InterfaceC0467D b(F f4, u0.e eVar, long j4) {
        C0472d c0472d = new C0472d(this.f7882v.b(f4, eVar, j4), this.f7844y, this.f7841D, this.f7842E);
        this.f7845z.add(c0472d);
        return c0472d;
    }

    @Override // q0.AbstractC0478j, q0.AbstractC0469a
    public final void j() {
        C0474f c0474f = this.f7840C;
        if (c0474f != null) {
            throw c0474f;
        }
        super.j();
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
        ArrayList arrayList = this.f7845z;
        W.a.j(arrayList.remove(interfaceC0467D));
        this.f7882v.o(((C0472d) interfaceC0467D).f7818l);
        if (arrayList.isEmpty()) {
            C0473e c0473e = this.f7839B;
            c0473e.getClass();
            E(c0473e.f7923b);
        }
    }

    @Override // q0.AbstractC0478j, q0.AbstractC0469a
    public final void r() {
        super.r();
        this.f7840C = null;
        this.f7839B = null;
    }
}
