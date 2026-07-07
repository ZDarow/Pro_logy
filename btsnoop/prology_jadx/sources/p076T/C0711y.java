package p076T;

/* renamed from: T.y */
/* loaded from: classes.dex */
public final class C0711y {

    /* renamed from: a */
    public final android.net.Uri f2449a;

    /* renamed from: b */
    public final java.lang.String f2450b;

    /* renamed from: c */
    public final java.util.List f2451c;

    /* renamed from: d */
    public final p129f2.AbstractC1393I f2452d;

    /* renamed from: e */
    public final java.lang.String f2453e;

    /* renamed from: f */
    public final long f2454f;

    static {
        p009B2.AbstractC0051h.m155n(0, 1, 2, 3, 4);
        p086W.AbstractC0805y.m1587H(5);
        p086W.AbstractC0805y.m1587H(6);
        p086W.AbstractC0805y.m1587H(7);
    }

    public C0711y(android.net.Uri uri, java.lang.String str, p080U1.AbstractC0748a abstractC0748a, java.util.List list, p129f2.AbstractC1393I abstractC1393I, java.lang.String str2, long j4) {
        this.f2449a = uri;
        this.f2450b = p076T.AbstractC0665H.m1201l(str);
        this.f2451c = list;
        this.f2452d = abstractC1393I;
        p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
        for (int i4 = 0; i4 < abstractC1393I.size(); i4++) {
            ((p076T.C0658A) abstractC1393I.get(i4)).getClass();
            new p046L1.C0363g(13, false);
            m3161i.m3147c(new java.lang.Object());
        }
        m3161i.m3157g();
        this.f2453e = str2;
        this.f2454f = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p076T.C0711y)) {
            return false;
        }
        p076T.C0711y c0711y = (p076T.C0711y) obj;
        return this.f2449a.equals(c0711y.f2449a) && p086W.AbstractC0805y.m1606a(this.f2450b, c0711y.f2450b) && p086W.AbstractC0805y.m1606a(null, null) && p086W.AbstractC0805y.m1606a(null, null) && this.f2451c.equals(c0711y.f2451c) && p086W.AbstractC0805y.m1606a(null, null) && this.f2452d.equals(c0711y.f2452d) && p086W.AbstractC0805y.m1606a(this.f2453e, c0711y.f2453e) && java.lang.Long.valueOf(this.f2454f).equals(java.lang.Long.valueOf(c0711y.f2454f));
    }

    public final int hashCode() {
        int hashCode = this.f2449a.hashCode() * 31;
        java.lang.String str = this.f2450b;
        int hashCode2 = (this.f2452d.hashCode() + ((this.f2451c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31;
        return (int) (((hashCode2 + (this.f2453e != null ? r2.hashCode() : 0)) * 31) + this.f2454f);
    }
}
