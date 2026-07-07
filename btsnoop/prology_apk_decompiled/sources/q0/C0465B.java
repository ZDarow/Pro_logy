package q0;

/* renamed from: q0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465B extends l0 {

    /* renamed from: A, reason: collision with root package name */
    public C0492y f7661A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f7662B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f7663C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f7664D;
    public final boolean w;

    /* renamed from: x, reason: collision with root package name */
    public final T.T f7665x;

    /* renamed from: y, reason: collision with root package name */
    public final T.S f7666y;

    /* renamed from: z, reason: collision with root package name */
    public C0493z f7667z;

    public C0465B(AbstractC0469a abstractC0469a, boolean z4) {
        super(abstractC0469a);
        this.w = z4 && abstractC0469a.i();
        this.f7665x = new T.T();
        this.f7666y = new T.S();
        T.U g4 = abstractC0469a.g();
        if (g4 == null) {
            this.f7667z = new C0493z(new C0464A(abstractC0469a.h()), T.T.f2150q, C0493z.f7938e);
        } else {
            this.f7667z = new C0493z(g4, null, null);
            this.f7664D = true;
        }
    }

    @Override // q0.l0
    public final F B(F f4) {
        Object obj = f4.f7668a;
        Object obj2 = this.f7667z.f7940d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0493z.f7938e;
        }
        return f4.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // q0.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(T.U r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C0465B.C(T.U):void");
    }

    @Override // q0.l0
    public final void D() {
        if (this.w) {
            return;
        }
        this.f7662B = true;
        A(null, this.f7882v);
    }

    @Override // q0.AbstractC0469a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final C0492y b(F f4, u0.e eVar, long j4) {
        C0492y c0492y = new C0492y(f4, eVar, j4);
        W.a.j(c0492y.f7934o == null);
        AbstractC0469a abstractC0469a = this.f7882v;
        c0492y.f7934o = abstractC0469a;
        if (this.f7663C) {
            Object obj = this.f7667z.f7940d;
            Object obj2 = f4.f7668a;
            if (obj != null && obj2.equals(C0493z.f7938e)) {
                obj2 = this.f7667z.f7940d;
            }
            c0492y.a(f4.a(obj2));
        } else {
            this.f7661A = c0492y;
            if (!this.f7662B) {
                this.f7662B = true;
                A(null, abstractC0469a);
            }
        }
        return c0492y;
    }

    public final boolean F(long j4) {
        C0492y c0492y = this.f7661A;
        int b4 = this.f7667z.b(c0492y.f7931l.f7668a);
        if (b4 == -1) {
            return false;
        }
        C0493z c0493z = this.f7667z;
        T.S s = this.f7666y;
        c0493z.f(b4, s, false);
        long j5 = s.f2146d;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, j5 - 1);
        }
        c0492y.f7937r = j4;
        return true;
    }

    @Override // q0.AbstractC0478j, q0.AbstractC0469a
    public final void j() {
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
        C0492y c0492y = (C0492y) interfaceC0467D;
        if (c0492y.f7935p != null) {
            AbstractC0469a abstractC0469a = c0492y.f7934o;
            abstractC0469a.getClass();
            abstractC0469a.o(c0492y.f7935p);
        }
        if (interfaceC0467D == this.f7661A) {
            this.f7661A = null;
        }
    }

    @Override // q0.AbstractC0478j, q0.AbstractC0469a
    public final void r() {
        this.f7663C = false;
        this.f7662B = false;
        super.r();
    }

    @Override // q0.l0, q0.AbstractC0469a
    public final void u(T.B b4) {
        if (this.f7664D) {
            C0493z c0493z = this.f7667z;
            this.f7667z = new C0493z(new a0.j0(this.f7667z.f7923b, b4), c0493z.f7939c, c0493z.f7940d);
        } else {
            this.f7667z = new C0493z(new C0464A(b4), T.T.f2150q, C0493z.f7938e);
        }
        this.f7882v.u(b4);
    }
}
