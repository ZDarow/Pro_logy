package p161m0;

/* renamed from: m0.n */
/* loaded from: classes.dex */
public final class C1857n {

    /* renamed from: a */
    public final p129f2.C1394J f7538a;

    static {
        new p129f2.C1408Y(15).m3201v();
    }

    public C1857n(p129f2.C1408Y c1408y) {
        p129f2.C1394J c1394j;
        java.util.Collection entrySet = ((p129f2.C1449v) ((p043K2.C0339o) c1408y.f5729m).f1048m).entrySet();
        if (((java.util.AbstractCollection) entrySet).isEmpty()) {
            c1394j = p129f2.C1386B.f5691p;
        } else {
            p129f2.C1447t c1447t = (p129f2.C1447t) entrySet;
            p063P2.C0528a c0528a = new p063P2.C0528a(c1447t.f5810m.size(), 5);
            java.util.Iterator it = c1447t.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.Object key = entry.getKey();
                p129f2.AbstractC1393I m3162j = p129f2.AbstractC1393I.m3162j((java.util.Collection) entry.getValue());
                if (!m3162j.isEmpty()) {
                    c0528a.m1028i(key, m3162j);
                    i4 = m3162j.size() + i4;
                }
            }
            c1394j = new p129f2.C1394J(c0528a.m1024e(), i4);
        }
        this.f7538a = c1394j;
    }

    /* renamed from: b */
    public static java.lang.String m3820b(java.lang.String str) {
        return p080U1.AbstractC0748a.m1380o(str, "Accept") ? "Accept" : p080U1.AbstractC0748a.m1380o(str, "Allow") ? "Allow" : p080U1.AbstractC0748a.m1380o(str, "Authorization") ? "Authorization" : p080U1.AbstractC0748a.m1380o(str, "Bandwidth") ? "Bandwidth" : p080U1.AbstractC0748a.m1380o(str, "Blocksize") ? "Blocksize" : p080U1.AbstractC0748a.m1380o(str, "Cache-Control") ? "Cache-Control" : p080U1.AbstractC0748a.m1380o(str, "Connection") ? "Connection" : p080U1.AbstractC0748a.m1380o(str, "Content-Base") ? "Content-Base" : p080U1.AbstractC0748a.m1380o(str, "Content-Encoding") ? "Content-Encoding" : p080U1.AbstractC0748a.m1380o(str, "Content-Language") ? "Content-Language" : p080U1.AbstractC0748a.m1380o(str, "Content-Length") ? "Content-Length" : p080U1.AbstractC0748a.m1380o(str, "Content-Location") ? "Content-Location" : p080U1.AbstractC0748a.m1380o(str, "Content-Type") ? "Content-Type" : p080U1.AbstractC0748a.m1380o(str, "CSeq") ? "CSeq" : p080U1.AbstractC0748a.m1380o(str, "Date") ? "Date" : p080U1.AbstractC0748a.m1380o(str, "Expires") ? "Expires" : p080U1.AbstractC0748a.m1380o(str, "Location") ? "Location" : p080U1.AbstractC0748a.m1380o(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : p080U1.AbstractC0748a.m1380o(str, "Proxy-Require") ? "Proxy-Require" : p080U1.AbstractC0748a.m1380o(str, "Public") ? "Public" : p080U1.AbstractC0748a.m1380o(str, "Range") ? "Range" : p080U1.AbstractC0748a.m1380o(str, "RTP-Info") ? "RTP-Info" : p080U1.AbstractC0748a.m1380o(str, "RTCP-Interval") ? "RTCP-Interval" : p080U1.AbstractC0748a.m1380o(str, "Scale") ? "Scale" : p080U1.AbstractC0748a.m1380o(str, "Session") ? "Session" : p080U1.AbstractC0748a.m1380o(str, "Speed") ? "Speed" : p080U1.AbstractC0748a.m1380o(str, "Supported") ? "Supported" : p080U1.AbstractC0748a.m1380o(str, "Timestamp") ? "Timestamp" : p080U1.AbstractC0748a.m1380o(str, "Transport") ? "Transport" : p080U1.AbstractC0748a.m1380o(str, "User-Agent") ? "User-Agent" : p080U1.AbstractC0748a.m1380o(str, "Via") ? "Via" : p080U1.AbstractC0748a.m1380o(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    /* renamed from: a */
    public final p129f2.C1394J m3821a() {
        return this.f7538a;
    }

    /* renamed from: c */
    public final java.lang.String m3822c(java.lang.String str) {
        p129f2.AbstractC1393I m3172d = this.f7538a.m3172d(m3820b(str));
        if (m3172d.isEmpty()) {
            return null;
        }
        return (java.lang.String) p129f2.AbstractC1444r.m3232l(m3172d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p161m0.C1857n) {
            return this.f7538a.equals(((p161m0.C1857n) obj).f7538a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7538a.hashCode();
    }
}
