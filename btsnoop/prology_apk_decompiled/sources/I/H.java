package I;

import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class H extends d3.g implements j3.l {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f742p = 1;

    /* renamed from: q, reason: collision with root package name */
    public int f743q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Q f744r;
    public Object s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f745t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Serializable f746u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(Q q4, InterfaceC0195i interfaceC0195i, j3.p pVar, InterfaceC0190d interfaceC0190d) {
        super(1, interfaceC0190d);
        this.f744r = q4;
        this.f745t = interfaceC0195i;
        this.f746u = (d3.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [d3.g, j3.p] */
    @Override // j3.l
    public final Object b(Object obj) {
        InterfaceC0190d interfaceC0190d = (InterfaceC0190d) obj;
        switch (this.f742p) {
            case 0:
                return new H((k3.p) this.f745t, this.f744r, (k3.n) this.f746u, interfaceC0190d).k(Z2.g.f3186a);
            default:
                return new H(this.f744r, (InterfaceC0195i) this.f745t, (j3.p) this.f746u, interfaceC0190d).k(Z2.g.f3186a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r6v2, types: [d3.g, j3.p] */
    @Override // d3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I.H.k(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(k3.p pVar, Q q4, k3.n nVar, InterfaceC0190d interfaceC0190d) {
        super(1, interfaceC0190d);
        this.f745t = pVar;
        this.f744r = q4;
        this.f746u = nVar;
    }
}
