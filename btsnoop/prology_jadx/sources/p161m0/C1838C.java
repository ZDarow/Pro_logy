package p161m0;

/* renamed from: m0.C */
/* loaded from: classes.dex */
public final class C1838C {

    /* renamed from: a */
    public final long f7410a;

    /* renamed from: b */
    public final int f7411b;

    /* renamed from: c */
    public final android.net.Uri f7412c;

    public C1838C(int i4, long j4, android.net.Uri uri) {
        this.f7410a = j4;
        this.f7411b = i4;
        this.f7412c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: Exception -> 0x0058, TRY_LEAVE, TryCatch #0 {Exception -> 0x0058, blocks: (B:7:0x002f, B:20:0x0077, B:25:0x007f, B:26:0x0084, B:29:0x0085, B:30:0x008a, B:31:0x004e, B:34:0x005a, B:37:0x0064), top: B:6:0x002f }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p129f2.C1415c0 m3801a(java.lang.String r18, android.net.Uri r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p161m0.C1838C.m3801a(java.lang.String, android.net.Uri):f2.c0");
    }

    /* renamed from: b */
    public static android.net.Uri m3802b(java.lang.String str, android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        scheme.getClass();
        p086W.AbstractC0781a.m1416e(scheme.equals("rtsp"));
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        android.net.Uri parse2 = android.net.Uri.parse("rtsp://" + str);
        java.lang.String uri2 = uri.toString();
        java.lang.String host = parse2.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? parse2 : uri2.endsWith("/") ? p086W.AbstractC0781a.m1436y(uri2, str) : p086W.AbstractC0781a.m1436y(uri2.concat("/"), str);
    }
}
