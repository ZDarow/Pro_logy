package p094Y;

/* renamed from: Y.l */
/* loaded from: classes.dex */
public final class C0874l {

    /* renamed from: i */
    public static final /* synthetic */ int f3134i = 0;

    /* renamed from: a */
    public final android.net.Uri f3135a;

    /* renamed from: b */
    public final int f3136b;

    /* renamed from: c */
    public final byte[] f3137c;

    /* renamed from: d */
    public final java.util.Map f3138d;

    /* renamed from: e */
    public final long f3139e;

    /* renamed from: f */
    public final long f3140f;

    /* renamed from: g */
    public final java.lang.String f3141g;

    /* renamed from: h */
    public final int f3142h;

    static {
        p076T.AbstractC0660C.m1179a("media3.datasource");
    }

    public C0874l(android.net.Uri uri, int i4, byte[] bArr, java.util.Map map, long j4, long j5, java.lang.String str, int i5) {
        p086W.AbstractC0781a.m1416e(j4 >= 0);
        p086W.AbstractC0781a.m1416e(j4 >= 0);
        p086W.AbstractC0781a.m1416e(j5 > 0 || j5 == -1);
        uri.getClass();
        this.f3135a = uri;
        this.f3136b = i4;
        this.f3137c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f3138d = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
        this.f3139e = j4;
        this.f3140f = j5;
        this.f3141g = str;
        this.f3142h = i5;
    }

    /* renamed from: a */
    public final p094Y.C0874l m1695a(long j4) {
        long j5 = this.f3140f;
        long j6 = j5 != -1 ? j5 - j4 : -1L;
        if (j4 == 0 && j5 == j6) {
            return this;
        }
        return new p094Y.C0874l(this.f3135a, this.f3136b, this.f3137c, this.f3138d, this.f3139e + j4, j6, this.f3141g, this.f3142h);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataSpec[");
        int i4 = this.f3136b;
        if (i4 == 1) {
            str = "GET";
        } else if (i4 == 2) {
            str = "POST";
        } else {
            if (i4 != 3) {
                throw new java.lang.IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f3135a);
        sb.append(", ");
        sb.append(this.f3139e);
        sb.append(", ");
        sb.append(this.f3140f);
        sb.append(", ");
        sb.append(this.f3141g);
        sb.append(", ");
        sb.append(this.f3142h);
        sb.append("]");
        return sb.toString();
    }
}
