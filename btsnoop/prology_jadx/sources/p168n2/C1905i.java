package p168n2;

/* renamed from: n2.i */
/* loaded from: classes.dex */
public final class C1905i extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f7755p;

    /* renamed from: q */
    public final /* synthetic */ p168n2.C1906j f7756q;

    /* renamed from: r */
    public final /* synthetic */ p047L2.InterfaceC0386p f7757r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1905i(p168n2.C1906j c1906j, p047L2.InterfaceC0386p interfaceC0386p, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f7756q = c1906j;
        this.f7757r = interfaceC0386p;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p168n2.C1905i(this.f7756q, this.f7757r, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p168n2.C1905i) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f7755p;
        p168n2.C1906j c1906j = this.f7756q;
        byte[] bArr = null;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            this.f7755p = 1;
            obj = p187r3.AbstractC2131v.m4255n(p187r3.AbstractC2074B.f8426b, new p168n2.C1904h(c1906j, null), this);
            if (obj == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        byte[] bArr2 = (byte[]) obj;
        if (bArr2 == null || bArr2.length != 0) {
            bArr = bArr2;
        } else {
            java.util.Objects.toString(c1906j.f7760e);
        }
        this.f7757r.mo742b(bArr);
        return p100Z2.C0934g.f3298a;
    }
}
