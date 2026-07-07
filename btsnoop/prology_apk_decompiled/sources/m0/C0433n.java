package m0;

import f2.C0274B;
import f2.C0297t;
import f2.C0299v;
import f2.I;
import f2.J;
import f2.Y;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: m0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433n {

    /* renamed from: a, reason: collision with root package name */
    public final J f7263a;

    static {
        new Y(15).v();
    }

    public C0433n(Y y4) {
        J j4;
        Collection entrySet = ((C0299v) ((K2.o) y4.f5535m).f1009m).entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            j4 = C0274B.f5497p;
        } else {
            C0297t c0297t = (C0297t) entrySet;
            P2.a aVar = new P2.a(c0297t.f5615m.size(), 5);
            Iterator it = c0297t.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                I j5 = I.j((Collection) entry.getValue());
                if (!j5.isEmpty()) {
                    aVar.i(key, j5);
                    i4 = j5.size() + i4;
                }
            }
            j4 = new J(aVar.e(), i4);
        }
        this.f7263a = j4;
    }

    public static String b(String str) {
        return U1.a.o(str, "Accept") ? "Accept" : U1.a.o(str, "Allow") ? "Allow" : U1.a.o(str, "Authorization") ? "Authorization" : U1.a.o(str, "Bandwidth") ? "Bandwidth" : U1.a.o(str, "Blocksize") ? "Blocksize" : U1.a.o(str, "Cache-Control") ? "Cache-Control" : U1.a.o(str, "Connection") ? "Connection" : U1.a.o(str, "Content-Base") ? "Content-Base" : U1.a.o(str, "Content-Encoding") ? "Content-Encoding" : U1.a.o(str, "Content-Language") ? "Content-Language" : U1.a.o(str, "Content-Length") ? "Content-Length" : U1.a.o(str, "Content-Location") ? "Content-Location" : U1.a.o(str, "Content-Type") ? "Content-Type" : U1.a.o(str, "CSeq") ? "CSeq" : U1.a.o(str, "Date") ? "Date" : U1.a.o(str, "Expires") ? "Expires" : U1.a.o(str, "Location") ? "Location" : U1.a.o(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : U1.a.o(str, "Proxy-Require") ? "Proxy-Require" : U1.a.o(str, "Public") ? "Public" : U1.a.o(str, "Range") ? "Range" : U1.a.o(str, "RTP-Info") ? "RTP-Info" : U1.a.o(str, "RTCP-Interval") ? "RTCP-Interval" : U1.a.o(str, "Scale") ? "Scale" : U1.a.o(str, "Session") ? "Session" : U1.a.o(str, "Speed") ? "Speed" : U1.a.o(str, "Supported") ? "Supported" : U1.a.o(str, "Timestamp") ? "Timestamp" : U1.a.o(str, "Transport") ? "Transport" : U1.a.o(str, "User-Agent") ? "User-Agent" : U1.a.o(str, "Via") ? "Via" : U1.a.o(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final J a() {
        return this.f7263a;
    }

    public final String c(String str) {
        I d4 = this.f7263a.d(b(str));
        if (d4.isEmpty()) {
            return null;
        }
        return (String) f2.r.l(d4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0433n) {
            return this.f7263a.equals(((C0433n) obj).f7263a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7263a.hashCode();
    }
}
