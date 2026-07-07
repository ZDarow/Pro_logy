package w2;

import L2.n;
import L2.p;
import u.AbstractC0579g;
import w0.C0591a;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607b extends AbstractC0579g {

    /* renamed from: m, reason: collision with root package name */
    public final C0591a f8905m;

    /* renamed from: n, reason: collision with root package name */
    public final n f8906n;

    public C0607b(n nVar, p pVar) {
        super(1);
        this.f8906n = nVar;
        this.f8905m = new C0591a(pVar);
    }

    @Override // u.AbstractC0579g
    public final Object i(String str) {
        return this.f8906n.a(str);
    }

    @Override // u.AbstractC0579g
    public final String j() {
        return this.f8906n.f1094a;
    }

    @Override // u.AbstractC0579g
    public final InterfaceC0608c l() {
        return this.f8905m;
    }

    @Override // u.AbstractC0579g
    public final boolean m() {
        return this.f8906n.c("transactionId");
    }
}
