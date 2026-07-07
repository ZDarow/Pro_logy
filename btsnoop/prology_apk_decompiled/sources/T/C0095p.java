package T;

import B2.AbstractC0007h;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: T.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095p {

    /* renamed from: A, reason: collision with root package name */
    public final int f2303A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2304B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2305C;

    /* renamed from: D, reason: collision with root package name */
    public final int f2306D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2307E;

    /* renamed from: F, reason: collision with root package name */
    public final int f2308F;

    /* renamed from: G, reason: collision with root package name */
    public final int f2309G;

    /* renamed from: H, reason: collision with root package name */
    public final int f2310H;

    /* renamed from: I, reason: collision with root package name */
    public final int f2311I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public int f2312K;

    /* renamed from: a, reason: collision with root package name */
    public final String f2313a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2314b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.I f2315c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2316d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2317e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2318f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2319g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2320h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2321i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2322j;

    /* renamed from: k, reason: collision with root package name */
    public final G f2323k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2324l;

    /* renamed from: m, reason: collision with root package name */
    public final String f2325m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2326n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2327o;

    /* renamed from: p, reason: collision with root package name */
    public final List f2328p;

    /* renamed from: q, reason: collision with root package name */
    public final C0092m f2329q;

    /* renamed from: r, reason: collision with root package name */
    public final long f2330r;
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2331t;

    /* renamed from: u, reason: collision with root package name */
    public final float f2332u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2333v;
    public final float w;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f2334x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2335y;

    /* renamed from: z, reason: collision with root package name */
    public final C0088i f2336z;

    static {
        new C0094o().a();
        W.y.H(0);
        W.y.H(1);
        W.y.H(2);
        W.y.H(3);
        W.y.H(4);
        AbstractC0007h.n(5, 6, 7, 8, 9);
        AbstractC0007h.n(10, 11, 12, 13, 14);
        AbstractC0007h.n(15, 16, 17, 18, 19);
        AbstractC0007h.n(20, 21, 22, 23, 24);
        AbstractC0007h.n(25, 26, 27, 28, 29);
        W.y.H(30);
        W.y.H(31);
        W.y.H(32);
    }

    public C0095p(C0094o c0094o) {
        boolean z4;
        String str;
        this.f2313a = c0094o.f2279a;
        String N3 = W.y.N(c0094o.f2282d);
        this.f2316d = N3;
        if (c0094o.f2281c.isEmpty() && c0094o.f2280b != null) {
            this.f2315c = f2.I.o(new r(N3, c0094o.f2280b));
            this.f2314b = c0094o.f2280b;
        } else if (c0094o.f2281c.isEmpty() || c0094o.f2280b != null) {
            if (!c0094o.f2281c.isEmpty() || c0094o.f2280b != null) {
                for (int i4 = 0; i4 < c0094o.f2281c.size(); i4++) {
                    if (!((r) c0094o.f2281c.get(i4)).f2339b.equals(c0094o.f2280b)) {
                    }
                }
                z4 = false;
                W.a.j(z4);
                this.f2315c = c0094o.f2281c;
                this.f2314b = c0094o.f2280b;
            }
            z4 = true;
            W.a.j(z4);
            this.f2315c = c0094o.f2281c;
            this.f2314b = c0094o.f2280b;
        } else {
            f2.I i5 = c0094o.f2281c;
            this.f2315c = i5;
            Iterator it = i5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((r) i5.get(0)).f2339b;
                    break;
                }
                r rVar = (r) it.next();
                if (TextUtils.equals(rVar.f2338a, N3)) {
                    str = rVar.f2339b;
                    break;
                }
            }
            this.f2314b = str;
        }
        this.f2317e = c0094o.f2283e;
        this.f2318f = c0094o.f2284f;
        int i6 = c0094o.f2285g;
        this.f2319g = i6;
        int i7 = c0094o.f2286h;
        this.f2320h = i7;
        this.f2321i = i7 != -1 ? i7 : i6;
        this.f2322j = c0094o.f2287i;
        this.f2323k = c0094o.f2288j;
        this.f2324l = c0094o.f2289k;
        this.f2325m = c0094o.f2290l;
        this.f2326n = c0094o.f2291m;
        this.f2327o = c0094o.f2292n;
        List list = c0094o.f2293o;
        this.f2328p = list == null ? Collections.emptyList() : list;
        C0092m c0092m = c0094o.f2294p;
        this.f2329q = c0092m;
        this.f2330r = c0094o.f2295q;
        this.s = c0094o.f2296r;
        this.f2331t = c0094o.s;
        this.f2332u = c0094o.f2297t;
        int i8 = c0094o.f2298u;
        this.f2333v = i8 == -1 ? 0 : i8;
        float f4 = c0094o.f2299v;
        this.w = f4 == -1.0f ? 1.0f : f4;
        this.f2334x = c0094o.w;
        this.f2335y = c0094o.f2300x;
        this.f2336z = c0094o.f2301y;
        this.f2303A = c0094o.f2302z;
        this.f2304B = c0094o.f2270A;
        this.f2305C = c0094o.f2271B;
        int i9 = c0094o.f2272C;
        this.f2306D = i9 == -1 ? 0 : i9;
        int i10 = c0094o.f2273D;
        this.f2307E = i10 != -1 ? i10 : 0;
        this.f2308F = c0094o.f2274E;
        this.f2309G = c0094o.f2275F;
        this.f2310H = c0094o.f2276G;
        this.f2311I = c0094o.f2277H;
        int i11 = c0094o.f2278I;
        if (i11 != 0 || c0092m == null) {
            this.J = i11;
        } else {
            this.J = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.o, java.lang.Object] */
    public final C0094o a() {
        ?? obj = new Object();
        obj.f2279a = this.f2313a;
        obj.f2280b = this.f2314b;
        obj.f2281c = this.f2315c;
        obj.f2282d = this.f2316d;
        obj.f2283e = this.f2317e;
        obj.f2284f = this.f2318f;
        obj.f2285g = this.f2319g;
        obj.f2286h = this.f2320h;
        obj.f2287i = this.f2322j;
        obj.f2288j = this.f2323k;
        obj.f2289k = this.f2324l;
        obj.f2290l = this.f2325m;
        obj.f2291m = this.f2326n;
        obj.f2292n = this.f2327o;
        obj.f2293o = this.f2328p;
        obj.f2294p = this.f2329q;
        obj.f2295q = this.f2330r;
        obj.f2296r = this.s;
        obj.s = this.f2331t;
        obj.f2297t = this.f2332u;
        obj.f2298u = this.f2333v;
        obj.f2299v = this.w;
        obj.w = this.f2334x;
        obj.f2300x = this.f2335y;
        obj.f2301y = this.f2336z;
        obj.f2302z = this.f2303A;
        obj.f2270A = this.f2304B;
        obj.f2271B = this.f2305C;
        obj.f2272C = this.f2306D;
        obj.f2273D = this.f2307E;
        obj.f2274E = this.f2308F;
        obj.f2275F = this.f2309G;
        obj.f2276G = this.f2310H;
        obj.f2277H = this.f2311I;
        obj.f2278I = this.J;
        return obj;
    }

    public final int b() {
        int i4;
        int i5 = this.s;
        if (i5 == -1 || (i4 = this.f2331t) == -1) {
            return -1;
        }
        return i5 * i4;
    }

    public final boolean c(C0095p c0095p) {
        List list = this.f2328p;
        if (list.size() != c0095p.f2328p.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals((byte[]) list.get(i4), (byte[]) c0095p.f2328p.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final C0095p d(C0095p c0095p) {
        String str;
        float f4;
        String str2;
        int i4;
        int i5;
        if (this == c0095p) {
            return this;
        }
        int g4 = H.g(this.f2325m);
        String str3 = c0095p.f2313a;
        String str4 = c0095p.f2314b;
        if (str4 == null) {
            str4 = this.f2314b;
        }
        f2.I i6 = c0095p.f2315c;
        if (i6.isEmpty()) {
            i6 = this.f2315c;
        }
        if ((g4 != 3 && g4 != 1) || (str = c0095p.f2316d) == null) {
            str = this.f2316d;
        }
        int i7 = this.f2319g;
        if (i7 == -1) {
            i7 = c0095p.f2319g;
        }
        int i8 = this.f2320h;
        if (i8 == -1) {
            i8 = c0095p.f2320h;
        }
        String str5 = this.f2322j;
        if (str5 == null) {
            String v4 = W.y.v(c0095p.f2322j, g4);
            if (W.y.X(v4).length == 1) {
                str5 = v4;
            }
        }
        G g5 = c0095p.f2323k;
        G g6 = this.f2323k;
        if (g6 != null) {
            g5 = g6.e(g5);
        }
        float f5 = this.f2332u;
        if (f5 == -1.0f && g4 == 2) {
            f5 = c0095p.f2332u;
        }
        int i9 = this.f2317e | c0095p.f2317e;
        int i10 = this.f2318f | c0095p.f2318f;
        ArrayList arrayList = new ArrayList();
        C0092m c0092m = c0095p.f2329q;
        if (c0092m != null) {
            C0091l[] c0091lArr = c0092m.f2265l;
            int length = c0091lArr.length;
            f4 = f5;
            int i11 = 0;
            while (i11 < length) {
                int i12 = length;
                C0091l c0091l = c0091lArr[i11];
                C0091l[] c0091lArr2 = c0091lArr;
                if (c0091l.f2264p != null) {
                    arrayList.add(c0091l);
                }
                i11++;
                length = i12;
                c0091lArr = c0091lArr2;
            }
            str2 = c0092m.f2267n;
        } else {
            f4 = f5;
            str2 = null;
        }
        C0092m c0092m2 = this.f2329q;
        if (c0092m2 != null) {
            if (str2 == null) {
                str2 = c0092m2.f2267n;
            }
            int size = arrayList.size();
            C0091l[] c0091lArr3 = c0092m2.f2265l;
            int length2 = c0091lArr3.length;
            int i13 = 0;
            while (true) {
                String str6 = str2;
                if (i13 >= length2) {
                    break;
                }
                C0091l c0091l2 = c0091lArr3[i13];
                C0091l[] c0091lArr4 = c0091lArr3;
                if (c0091l2.f2264p != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            i4 = size;
                            i5 = length2;
                            arrayList.add(c0091l2);
                            break;
                        }
                        i4 = size;
                        i5 = length2;
                        if (((C0091l) arrayList.get(i14)).f2261m.equals(c0091l2.f2261m)) {
                            break;
                        }
                        i14++;
                        length2 = i5;
                        size = i4;
                    }
                } else {
                    i4 = size;
                    i5 = length2;
                }
                i13++;
                str2 = str6;
                c0091lArr3 = c0091lArr4;
                length2 = i5;
                size = i4;
            }
        }
        C0092m c0092m3 = arrayList.isEmpty() ? null : new C0092m(str2, arrayList);
        C0094o a4 = a();
        a4.f2279a = str3;
        a4.f2280b = str4;
        a4.f2281c = f2.I.j(i6);
        a4.f2282d = str;
        a4.f2283e = i9;
        a4.f2284f = i10;
        a4.f2285g = i7;
        a4.f2286h = i8;
        a4.f2287i = str5;
        a4.f2288j = g5;
        a4.f2294p = c0092m3;
        a4.f2297t = f4;
        a4.f2276G = c0095p.f2310H;
        a4.f2277H = c0095p.f2311I;
        return new C0095p(a4);
    }

    public final boolean equals(Object obj) {
        int i4;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0095p.class != obj.getClass()) {
            return false;
        }
        C0095p c0095p = (C0095p) obj;
        int i5 = this.f2312K;
        if (i5 == 0 || (i4 = c0095p.f2312K) == 0 || i5 == i4) {
            return this.f2317e == c0095p.f2317e && this.f2318f == c0095p.f2318f && this.f2319g == c0095p.f2319g && this.f2320h == c0095p.f2320h && this.f2326n == c0095p.f2326n && this.f2330r == c0095p.f2330r && this.s == c0095p.s && this.f2331t == c0095p.f2331t && this.f2333v == c0095p.f2333v && this.f2335y == c0095p.f2335y && this.f2303A == c0095p.f2303A && this.f2304B == c0095p.f2304B && this.f2305C == c0095p.f2305C && this.f2306D == c0095p.f2306D && this.f2307E == c0095p.f2307E && this.f2308F == c0095p.f2308F && this.f2310H == c0095p.f2310H && this.f2311I == c0095p.f2311I && this.J == c0095p.J && Float.compare(this.f2332u, c0095p.f2332u) == 0 && Float.compare(this.w, c0095p.w) == 0 && Objects.equals(this.f2313a, c0095p.f2313a) && Objects.equals(this.f2314b, c0095p.f2314b) && this.f2315c.equals(c0095p.f2315c) && Objects.equals(this.f2322j, c0095p.f2322j) && Objects.equals(this.f2324l, c0095p.f2324l) && Objects.equals(this.f2325m, c0095p.f2325m) && Objects.equals(this.f2316d, c0095p.f2316d) && Arrays.equals(this.f2334x, c0095p.f2334x) && Objects.equals(this.f2323k, c0095p.f2323k) && Objects.equals(this.f2336z, c0095p.f2336z) && Objects.equals(this.f2329q, c0095p.f2329q) && c(c0095p);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2312K == 0) {
            String str = this.f2313a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f2314b;
            int hashCode2 = (this.f2315c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f2316d;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f2317e) * 31) + this.f2318f) * 31) + this.f2319g) * 31) + this.f2320h) * 31;
            String str4 = this.f2322j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            G g4 = this.f2323k;
            int hashCode5 = (hashCode4 + (g4 == null ? 0 : g4.hashCode())) * 961;
            String str5 = this.f2324l;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f2325m;
            this.f2312K = ((((((((((((((((((((Float.floatToIntBits(this.w) + ((((Float.floatToIntBits(this.f2332u) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f2326n) * 31) + ((int) this.f2330r)) * 31) + this.s) * 31) + this.f2331t) * 31)) * 31) + this.f2333v) * 31)) * 31) + this.f2335y) * 31) + this.f2303A) * 31) + this.f2304B) * 31) + this.f2305C) * 31) + this.f2306D) * 31) + this.f2307E) * 31) + this.f2308F) * 31) + this.f2310H) * 31) + this.f2311I) * 31) + this.J;
        }
        return this.f2312K;
    }

    public final String toString() {
        return "Format(" + this.f2313a + ", " + this.f2314b + ", " + this.f2324l + ", " + this.f2325m + ", " + this.f2322j + ", " + this.f2321i + ", " + this.f2316d + ", [" + this.s + ", " + this.f2331t + ", " + this.f2332u + ", " + this.f2336z + "], [" + this.f2303A + ", " + this.f2304B + "])";
    }
}
