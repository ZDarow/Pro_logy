package p136h0;

/* renamed from: h0.a */
/* loaded from: classes.dex */
public final class C1484a implements p136h0.InterfaceC1500q {

    /* renamed from: l */
    public final /* synthetic */ p136h0.C1486c f6061l;

    public C1484a(p136h0.C1486c c1486c) {
        this.f6061l = c1486c;
    }

    @Override // p136h0.InterfaceC1500q
    /* renamed from: a */
    public final void mo3282a() {
        this.f6061l.f6079p.remove(this);
    }

    @Override // p136h0.InterfaceC1500q
    /* renamed from: d */
    public final boolean mo3283d(android.net.Uri uri, p006B.C0020c c0020c, boolean z4) {
        java.util.HashMap hashMap;
        p136h0.C1485b c1485b;
        p136h0.C1486c c1486c = this.f6061l;
        if (c1486c.f6086w == null) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            p136h0.C1495l c1495l = c1486c.f6084u;
            int i4 = p086W.AbstractC0805y.f2801a;
            java.util.List list = c1495l.f6142e;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int size = list.size();
                hashMap = c1486c.f6078o;
                if (i5 >= size) {
                    break;
                }
                p136h0.C1485b c1485b2 = (p136h0.C1485b) hashMap.get(((p136h0.C1494k) list.get(i5)).f6134a);
                if (c1485b2 != null && elapsedRealtime < c1485b2.f6069s) {
                    i6++;
                }
                i5++;
            }
            p197u0.C2221h c2221h = new p197u0.C2221h(1, 0, c1486c.f6084u.f6142e.size(), i6);
            c1486c.f6077n.getClass();
            p128f1.C1383e m4284d = p193t0.C2164b.m4284d(c2221h, c0020c);
            if (m4284d != null && m4284d.f5683a == 2 && (c1485b = (p136h0.C1485b) hashMap.get(uri)) != null) {
                p136h0.C1485b.m3311a(c1485b, m4284d.f5684b);
            }
        }
        return false;
    }
}
