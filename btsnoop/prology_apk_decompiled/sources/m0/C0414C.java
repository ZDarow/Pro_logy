package m0;

import android.net.Uri;

/* renamed from: m0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414C {

    /* renamed from: a, reason: collision with root package name */
    public final long f7140a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7141b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f7142c;

    public C0414C(int i4, long j4, Uri uri) {
        this.f7140a = j4;
        this.f7141b = i4;
        this.f7142c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: Exception -> 0x0058, TRY_LEAVE, TryCatch #0 {Exception -> 0x0058, blocks: (B:7:0x002f, B:20:0x0077, B:25:0x007f, B:26:0x0084, B:29:0x0085, B:30:0x008a, B:31:0x004e, B:34:0x005a, B:37:0x0064), top: B:6:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f2.c0 a(java.lang.String r18, android.net.Uri r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C0414C.a(java.lang.String, android.net.Uri):f2.c0");
    }

    public static Uri b(String str, Uri uri) {
        String scheme = uri.getScheme();
        scheme.getClass();
        W.a.e(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? parse2 : uri2.endsWith("/") ? W.a.y(uri2, str) : W.a.y(uri2.concat("/"), str);
    }
}
