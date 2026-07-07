package m0;

import B2.AbstractC0007h;
import T.I;
import f2.h0;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7177b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7178c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7179d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f7180e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f7181f = -1;

    /* renamed from: g, reason: collision with root package name */
    public String f7182g;

    /* renamed from: h, reason: collision with root package name */
    public String f7183h;

    /* renamed from: i, reason: collision with root package name */
    public String f7184i;

    public C0420a(int i4, int i5, String str, String str2) {
        this.f7176a = str;
        this.f7177b = i4;
        this.f7178c = str2;
        this.f7179d = i5;
    }

    public static String b(int i4, int i5, int i6, String str) {
        int i7 = W.y.f2709a;
        Locale locale = Locale.US;
        return i4 + " " + str + "/" + i5 + "/" + i6;
    }

    public final C0422c a() {
        String b4;
        C0421b a4;
        HashMap hashMap = this.f7180e;
        try {
            if (hashMap.containsKey("rtpmap")) {
                String str = (String) hashMap.get("rtpmap");
                int i4 = W.y.f2709a;
                a4 = C0421b.a(str);
            } else {
                int i5 = this.f7179d;
                W.a.e(i5 < 96);
                if (i5 == 0) {
                    b4 = b(0, 8000, 1, "PCMU");
                } else if (i5 == 8) {
                    b4 = b(8, 8000, 1, "PCMA");
                } else if (i5 == 10) {
                    b4 = b(10, 44100, 2, "L16");
                } else {
                    if (i5 != 11) {
                        throw new IllegalStateException(AbstractC0007h.k("Unsupported static paylod type ", i5));
                    }
                    b4 = b(11, 44100, 1, "L16");
                }
                a4 = C0421b.a(b4);
            }
            return new C0422c(this, h0.a(hashMap), a4);
        } catch (I e4) {
            throw new IllegalStateException(e4);
        }
    }
}
