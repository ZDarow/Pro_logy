package p161m0;

/* renamed from: m0.a */
/* loaded from: classes.dex */
public final class C1844a {

    /* renamed from: a */
    public final java.lang.String f7447a;

    /* renamed from: b */
    public final int f7448b;

    /* renamed from: c */
    public final java.lang.String f7449c;

    /* renamed from: d */
    public final int f7450d;

    /* renamed from: e */
    public final java.util.HashMap f7451e = new java.util.HashMap();

    /* renamed from: f */
    public int f7452f = -1;

    /* renamed from: g */
    public java.lang.String f7453g;

    /* renamed from: h */
    public java.lang.String f7454h;

    /* renamed from: i */
    public java.lang.String f7455i;

    public C1844a(int i4, int i5, java.lang.String str, java.lang.String str2) {
        this.f7447a = str;
        this.f7448b = i4;
        this.f7449c = str2;
        this.f7450d = i5;
    }

    /* renamed from: b */
    public static java.lang.String m3808b(int i4, int i5, int i6, java.lang.String str) {
        int i7 = p086W.AbstractC0805y.f2801a;
        java.util.Locale locale = java.util.Locale.US;
        return i4 + " " + str + "/" + i5 + "/" + i6;
    }

    /* renamed from: a */
    public final p161m0.C1846c m3809a() {
        java.lang.String m3808b;
        p161m0.C1845b m3810a;
        java.util.HashMap hashMap = this.f7451e;
        try {
            if (hashMap.containsKey("rtpmap")) {
                java.lang.String str = (java.lang.String) hashMap.get("rtpmap");
                int i4 = p086W.AbstractC0805y.f2801a;
                m3810a = p161m0.C1845b.m3810a(str);
            } else {
                int i5 = this.f7450d;
                p086W.AbstractC0781a.m1416e(i5 < 96);
                if (i5 == 0) {
                    m3808b = m3808b(0, 8000, 1, "PCMU");
                } else if (i5 == 8) {
                    m3808b = m3808b(8, 8000, 1, "PCMA");
                } else if (i5 == 10) {
                    m3808b = m3808b(10, 44100, 2, "L16");
                } else {
                    if (i5 != 11) {
                        throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("Unsupported static paylod type ", i5));
                    }
                    m3808b = m3808b(11, 44100, 1, "L16");
                }
                m3810a = p161m0.C1845b.m3810a(m3808b);
            }
            return new p161m0.C1846c(this, p129f2.C1425h0.m3214a(hashMap), m3810a);
        } catch (p076T.C0666I e4) {
            throw new java.lang.IllegalStateException(e4);
        }
    }
}
