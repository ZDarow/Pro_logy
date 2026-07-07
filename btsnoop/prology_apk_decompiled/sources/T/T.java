package T;

import B2.AbstractC0007h;
import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f2150q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final B f2151r;

    /* renamed from: b, reason: collision with root package name */
    public Object f2153b;

    /* renamed from: d, reason: collision with root package name */
    public Object f2155d;

    /* renamed from: e, reason: collision with root package name */
    public long f2156e;

    /* renamed from: f, reason: collision with root package name */
    public long f2157f;

    /* renamed from: g, reason: collision with root package name */
    public long f2158g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2159h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2160i;

    /* renamed from: j, reason: collision with root package name */
    public C0102x f2161j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2162k;

    /* renamed from: l, reason: collision with root package name */
    public long f2163l;

    /* renamed from: m, reason: collision with root package name */
    public long f2164m;

    /* renamed from: n, reason: collision with root package name */
    public int f2165n;

    /* renamed from: o, reason: collision with root package name */
    public int f2166o;

    /* renamed from: p, reason: collision with root package name */
    public long f2167p;

    /* renamed from: a, reason: collision with root package name */
    public Object f2152a = f2150q;

    /* renamed from: c, reason: collision with root package name */
    public B f2154c = f2151r;

    /* JADX WARN: Type inference failed for: r10v0, types: [T.u, T.v] */
    static {
        C0098t c0098t = new C0098t();
        f2.G g4 = f2.I.f5510m;
        f2.c0 c0Var = f2.c0.f5550p;
        List emptyList = Collections.emptyList();
        f2.c0 c0Var2 = f2.c0.f5550p;
        C0101w c0101w = new C0101w();
        C0104z c0104z = C0104z.f2370a;
        Uri uri = Uri.EMPTY;
        f2151r = new B("androidx.media3.common.Timeline", new C0099u(c0098t), uri != null ? new C0103y(uri, null, null, emptyList, c0Var2, null, -9223372036854775807L) : null, new C0102x(c0101w), E.f2095y, c0104z);
        AbstractC0007h.n(1, 2, 3, 4, 5);
        AbstractC0007h.n(6, 7, 8, 9, 10);
        W.y.H(11);
        W.y.H(12);
        W.y.H(13);
    }

    public final boolean a() {
        return this.f2161j != null;
    }

    public final void b(B b4, Object obj, long j4, long j5, long j6, boolean z4, boolean z5, C0102x c0102x, long j7, long j8, int i4, long j9) {
        C0103y c0103y;
        this.f2152a = f2150q;
        this.f2154c = b4 != null ? b4 : f2151r;
        if (b4 != null && (c0103y = b4.f2067b) != null) {
            String str = c0103y.f2368e;
        }
        this.f2155d = obj;
        this.f2156e = j4;
        this.f2157f = j5;
        this.f2158g = j6;
        this.f2159h = z4;
        this.f2160i = z5;
        this.f2161j = c0102x;
        this.f2163l = j7;
        this.f2164m = j8;
        this.f2165n = 0;
        this.f2166o = i4;
        this.f2167p = j9;
        this.f2162k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !T.class.equals(obj.getClass())) {
            return false;
        }
        T t4 = (T) obj;
        return W.y.a(this.f2152a, t4.f2152a) && W.y.a(this.f2154c, t4.f2154c) && W.y.a(this.f2155d, t4.f2155d) && W.y.a(this.f2161j, t4.f2161j) && this.f2156e == t4.f2156e && this.f2157f == t4.f2157f && this.f2158g == t4.f2158g && this.f2159h == t4.f2159h && this.f2160i == t4.f2160i && this.f2162k == t4.f2162k && this.f2163l == t4.f2163l && this.f2164m == t4.f2164m && this.f2165n == t4.f2165n && this.f2166o == t4.f2166o && this.f2167p == t4.f2167p;
    }

    public final int hashCode() {
        int hashCode = (this.f2154c.hashCode() + ((this.f2152a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f2155d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C0102x c0102x = this.f2161j;
        int hashCode3 = (hashCode2 + (c0102x != null ? c0102x.hashCode() : 0)) * 31;
        long j4 = this.f2156e;
        int i4 = (hashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f2157f;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f2158g;
        int i6 = (((((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f2159h ? 1 : 0)) * 31) + (this.f2160i ? 1 : 0)) * 31) + (this.f2162k ? 1 : 0)) * 31;
        long j7 = this.f2163l;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f2164m;
        int i8 = (((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f2165n) * 31) + this.f2166o) * 31;
        long j9 = this.f2167p;
        return i8 + ((int) (j9 ^ (j9 >>> 32)));
    }
}
