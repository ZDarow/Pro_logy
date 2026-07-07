package p040K;

/* renamed from: K.e */
/* loaded from: classes.dex */
public final class C0315e extends p154k3.AbstractC1804i implements p149j3.InterfaceC1726a {

    /* renamed from: m */
    public final /* synthetic */ int f941m;

    /* renamed from: n */
    public final /* synthetic */ p040K.C0316f f942n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0315e(p040K.C0316f c0316f, int i4) {
        super(0);
        this.f941m = i4;
        this.f942n = c0316f;
    }

    @Override // p149j3.InterfaceC1726a
    /* renamed from: c */
    public final java.lang.Object mo501c() {
        switch (this.f941m) {
            case 0:
                p040K.C0316f c0316f = this.f942n;
                p010B3.C0081l c0081l = (p010B3.C0081l) c0316f.f947c.mo501c();
                if (p014C3.AbstractC0145b.m495a(c0081l) != -1) {
                    return p025F1.C0215g.m584u(c0081l.f256l.m319n(), true);
                }
                throw new java.lang.IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + c0316f.f947c + ", instead got " + c0081l).toString());
            default:
                p025F1.C0215g c0215g = p040K.C0316f.f944f;
                p040K.C0316f c0316f2 = this.f942n;
                synchronized (c0215g) {
                    p040K.C0316f.f943e.remove(((p010B3.C0081l) c0316f2.f948d.m1762a()).f256l.m319n());
                }
                return p100Z2.C0934g.f3298a;
        }
    }
}
