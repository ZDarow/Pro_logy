package p102a0;

/* renamed from: a0.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C0990o implements p124e2.InterfaceC1362j {

    /* renamed from: l */
    public final /* synthetic */ int f3681l;

    /* renamed from: m */
    public final /* synthetic */ android.content.Context f3682m;

    public /* synthetic */ C0990o(android.content.Context context, int i4) {
        this.f3681l = i4;
        this.f3682m = context;
    }

    @Override // p124e2.InterfaceC1362j
    public final java.lang.Object get() {
        p197u0.C2220g c2220g;
        switch (this.f3681l) {
            case 0:
                return new p102a0.C0984l(this.f3682m);
            case 1:
                return new p179q0.C2015t(new p008B1.C0026d(this.f3682m), new p215y0.C2401m());
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new p193t0.C2179q(this.f3682m);
            default:
                android.content.Context context = this.f3682m;
                p129f2.C1415c0 c1415c0 = p197u0.C2220g.f8847n;
                synchronized (p197u0.C2220g.class) {
                    try {
                        if (p197u0.C2220g.f8853t == null) {
                            p146j0.C1699c c1699c = new p146j0.C1699c(context);
                            p197u0.C2220g.f8853t = new p197u0.C2220g((android.content.Context) c1699c.f7053n, (java.util.HashMap) c1699c.f7054o, c1699c.f7051l, (p086W.C0800t) c1699c.f7055p, c1699c.f7052m);
                        }
                        c2220g = p197u0.C2220g.f8853t;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return c2220g;
        }
    }
}
