package p076T;

/* renamed from: T.p */
/* loaded from: classes.dex */
public final class C0702p {

    /* renamed from: A */
    public final int f2385A;

    /* renamed from: B */
    public final int f2386B;

    /* renamed from: C */
    public final int f2387C;

    /* renamed from: D */
    public final int f2388D;

    /* renamed from: E */
    public final int f2389E;

    /* renamed from: F */
    public final int f2390F;

    /* renamed from: G */
    public final int f2391G;

    /* renamed from: H */
    public final int f2392H;

    /* renamed from: I */
    public final int f2393I;

    /* renamed from: J */
    public final int f2394J;

    /* renamed from: K */
    public int f2395K;

    /* renamed from: a */
    public final java.lang.String f2396a;

    /* renamed from: b */
    public final java.lang.String f2397b;

    /* renamed from: c */
    public final p129f2.AbstractC1393I f2398c;

    /* renamed from: d */
    public final java.lang.String f2399d;

    /* renamed from: e */
    public final int f2400e;

    /* renamed from: f */
    public final int f2401f;

    /* renamed from: g */
    public final int f2402g;

    /* renamed from: h */
    public final int f2403h;

    /* renamed from: i */
    public final int f2404i;

    /* renamed from: j */
    public final java.lang.String f2405j;

    /* renamed from: k */
    public final p076T.C0664G f2406k;

    /* renamed from: l */
    public final java.lang.String f2407l;

    /* renamed from: m */
    public final java.lang.String f2408m;

    /* renamed from: n */
    public final int f2409n;

    /* renamed from: o */
    public final int f2410o;

    /* renamed from: p */
    public final java.util.List f2411p;

    /* renamed from: q */
    public final p076T.C0699m f2412q;

    /* renamed from: r */
    public final long f2413r;

    /* renamed from: s */
    public final int f2414s;

    /* renamed from: t */
    public final int f2415t;

    /* renamed from: u */
    public final float f2416u;

    /* renamed from: v */
    public final int f2417v;

    /* renamed from: w */
    public final float f2418w;

    /* renamed from: x */
    public final byte[] f2419x;

    /* renamed from: y */
    public final int f2420y;

    /* renamed from: z */
    public final p076T.C0695i f2421z;

    static {
        new p076T.C0701o().m1287a();
        p086W.AbstractC0805y.m1587H(0);
        p086W.AbstractC0805y.m1587H(1);
        p086W.AbstractC0805y.m1587H(2);
        p086W.AbstractC0805y.m1587H(3);
        p086W.AbstractC0805y.m1587H(4);
        p009B2.AbstractC0051h.m155n(5, 6, 7, 8, 9);
        p009B2.AbstractC0051h.m155n(10, 11, 12, 13, 14);
        p009B2.AbstractC0051h.m155n(15, 16, 17, 18, 19);
        p009B2.AbstractC0051h.m155n(20, 21, 22, 23, 24);
        p009B2.AbstractC0051h.m155n(25, 26, 27, 28, 29);
        p086W.AbstractC0805y.m1587H(30);
        p086W.AbstractC0805y.m1587H(31);
        p086W.AbstractC0805y.m1587H(32);
    }

    public C0702p(p076T.C0701o c0701o) {
        boolean z4;
        java.lang.String str;
        this.f2396a = c0701o.f2359a;
        java.lang.String m1593N = p086W.AbstractC0805y.m1593N(c0701o.f2362d);
        this.f2399d = m1593N;
        if (c0701o.f2361c.isEmpty() && c0701o.f2360b != null) {
            this.f2398c = p129f2.AbstractC1393I.m3166o(new p076T.C0704r(m1593N, c0701o.f2360b));
            this.f2397b = c0701o.f2360b;
        } else if (c0701o.f2361c.isEmpty() || c0701o.f2360b != null) {
            if (!c0701o.f2361c.isEmpty() || c0701o.f2360b != null) {
                for (int i4 = 0; i4 < c0701o.f2361c.size(); i4++) {
                    if (!((p076T.C0704r) c0701o.f2361c.get(i4)).f2424b.equals(c0701o.f2360b)) {
                    }
                }
                z4 = false;
                p086W.AbstractC0781a.m1421j(z4);
                this.f2398c = c0701o.f2361c;
                this.f2397b = c0701o.f2360b;
            }
            z4 = true;
            p086W.AbstractC0781a.m1421j(z4);
            this.f2398c = c0701o.f2361c;
            this.f2397b = c0701o.f2360b;
        } else {
            p129f2.AbstractC1393I abstractC1393I = c0701o.f2361c;
            this.f2398c = abstractC1393I;
            java.util.Iterator it = abstractC1393I.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((p076T.C0704r) abstractC1393I.get(0)).f2424b;
                    break;
                }
                p076T.C0704r c0704r = (p076T.C0704r) it.next();
                if (android.text.TextUtils.equals(c0704r.f2423a, m1593N)) {
                    str = c0704r.f2424b;
                    break;
                }
            }
            this.f2397b = str;
        }
        this.f2400e = c0701o.f2363e;
        this.f2401f = c0701o.f2364f;
        int i5 = c0701o.f2365g;
        this.f2402g = i5;
        int i6 = c0701o.f2366h;
        this.f2403h = i6;
        this.f2404i = i6 != -1 ? i6 : i5;
        this.f2405j = c0701o.f2367i;
        this.f2406k = c0701o.f2368j;
        this.f2407l = c0701o.f2369k;
        this.f2408m = c0701o.f2370l;
        this.f2409n = c0701o.f2371m;
        this.f2410o = c0701o.f2372n;
        java.util.List list = c0701o.f2373o;
        this.f2411p = list == null ? java.util.Collections.emptyList() : list;
        p076T.C0699m c0699m = c0701o.f2374p;
        this.f2412q = c0699m;
        this.f2413r = c0701o.f2375q;
        this.f2414s = c0701o.f2376r;
        this.f2415t = c0701o.f2377s;
        this.f2416u = c0701o.f2378t;
        int i7 = c0701o.f2379u;
        this.f2417v = i7 == -1 ? 0 : i7;
        float f4 = c0701o.f2380v;
        this.f2418w = f4 == -1.0f ? 1.0f : f4;
        this.f2419x = c0701o.f2381w;
        this.f2420y = c0701o.f2382x;
        this.f2421z = c0701o.f2383y;
        this.f2385A = c0701o.f2384z;
        this.f2386B = c0701o.f2350A;
        this.f2387C = c0701o.f2351B;
        int i8 = c0701o.f2352C;
        this.f2388D = i8 == -1 ? 0 : i8;
        int i9 = c0701o.f2353D;
        this.f2389E = i9 != -1 ? i9 : 0;
        this.f2390F = c0701o.f2354E;
        this.f2391G = c0701o.f2355F;
        this.f2392H = c0701o.f2356G;
        this.f2393I = c0701o.f2357H;
        int i10 = c0701o.f2358I;
        if (i10 != 0 || c0699m == null) {
            this.f2394J = i10;
        } else {
            this.f2394J = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.o, java.lang.Object] */
    /* renamed from: a */
    public final p076T.C0701o m1295a() {
        ?? obj = new java.lang.Object();
        obj.f2359a = this.f2396a;
        obj.f2360b = this.f2397b;
        obj.f2361c = this.f2398c;
        obj.f2362d = this.f2399d;
        obj.f2363e = this.f2400e;
        obj.f2364f = this.f2401f;
        obj.f2365g = this.f2402g;
        obj.f2366h = this.f2403h;
        obj.f2367i = this.f2405j;
        obj.f2368j = this.f2406k;
        obj.f2369k = this.f2407l;
        obj.f2370l = this.f2408m;
        obj.f2371m = this.f2409n;
        obj.f2372n = this.f2410o;
        obj.f2373o = this.f2411p;
        obj.f2374p = this.f2412q;
        obj.f2375q = this.f2413r;
        obj.f2376r = this.f2414s;
        obj.f2377s = this.f2415t;
        obj.f2378t = this.f2416u;
        obj.f2379u = this.f2417v;
        obj.f2380v = this.f2418w;
        obj.f2381w = this.f2419x;
        obj.f2382x = this.f2420y;
        obj.f2383y = this.f2421z;
        obj.f2384z = this.f2385A;
        obj.f2350A = this.f2386B;
        obj.f2351B = this.f2387C;
        obj.f2352C = this.f2388D;
        obj.f2353D = this.f2389E;
        obj.f2354E = this.f2390F;
        obj.f2355F = this.f2391G;
        obj.f2356G = this.f2392H;
        obj.f2357H = this.f2393I;
        obj.f2358I = this.f2394J;
        return obj;
    }

    /* renamed from: b */
    public final int m1296b() {
        int i4;
        int i5 = this.f2414s;
        if (i5 == -1 || (i4 = this.f2415t) == -1) {
            return -1;
        }
        return i5 * i4;
    }

    /* renamed from: c */
    public final boolean m1297c(p076T.C0702p c0702p) {
        java.util.List list = this.f2411p;
        if (list.size() != c0702p.f2411p.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!java.util.Arrays.equals((byte[]) list.get(i4), (byte[]) c0702p.f2411p.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final p076T.C0702p m1298d(p076T.C0702p c0702p) {
        java.lang.String str;
        float f4;
        java.lang.String str2;
        int i4;
        int i5;
        if (this == c0702p) {
            return this;
        }
        int m1196g = p076T.AbstractC0665H.m1196g(this.f2408m);
        java.lang.String str3 = c0702p.f2396a;
        java.lang.String str4 = c0702p.f2397b;
        if (str4 == null) {
            str4 = this.f2397b;
        }
        p129f2.AbstractC1393I abstractC1393I = c0702p.f2398c;
        if (abstractC1393I.isEmpty()) {
            abstractC1393I = this.f2398c;
        }
        if ((m1196g != 3 && m1196g != 1) || (str = c0702p.f2399d) == null) {
            str = this.f2399d;
        }
        int i6 = this.f2402g;
        if (i6 == -1) {
            i6 = c0702p.f2402g;
        }
        int i7 = this.f2403h;
        if (i7 == -1) {
            i7 = c0702p.f2403h;
        }
        java.lang.String str5 = this.f2405j;
        if (str5 == null) {
            java.lang.String m1627v = p086W.AbstractC0805y.m1627v(c0702p.f2405j, m1196g);
            if (p086W.AbstractC0805y.m1603X(m1627v).length == 1) {
                str5 = m1627v;
            }
        }
        p076T.C0664G c0664g = c0702p.f2406k;
        p076T.C0664G c0664g2 = this.f2406k;
        if (c0664g2 != null) {
            c0664g = c0664g2.m1187e(c0664g);
        }
        float f5 = this.f2416u;
        if (f5 == -1.0f && m1196g == 2) {
            f5 = c0702p.f2416u;
        }
        int i8 = this.f2400e | c0702p.f2400e;
        int i9 = this.f2401f | c0702p.f2401f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p076T.C0699m c0699m = c0702p.f2412q;
        if (c0699m != null) {
            p076T.C0698l[] c0698lArr = c0699m.f2345l;
            int length = c0698lArr.length;
            f4 = f5;
            int i10 = 0;
            while (i10 < length) {
                int i11 = length;
                p076T.C0698l c0698l = c0698lArr[i10];
                p076T.C0698l[] c0698lArr2 = c0698lArr;
                if (c0698l.f2344p != null) {
                    arrayList.add(c0698l);
                }
                i10++;
                length = i11;
                c0698lArr = c0698lArr2;
            }
            str2 = c0699m.f2347n;
        } else {
            f4 = f5;
            str2 = null;
        }
        p076T.C0699m c0699m2 = this.f2412q;
        if (c0699m2 != null) {
            if (str2 == null) {
                str2 = c0699m2.f2347n;
            }
            int size = arrayList.size();
            p076T.C0698l[] c0698lArr3 = c0699m2.f2345l;
            int length2 = c0698lArr3.length;
            int i12 = 0;
            while (true) {
                java.lang.String str6 = str2;
                if (i12 >= length2) {
                    break;
                }
                p076T.C0698l c0698l2 = c0698lArr3[i12];
                p076T.C0698l[] c0698lArr4 = c0698lArr3;
                if (c0698l2.f2344p != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            i4 = size;
                            i5 = length2;
                            arrayList.add(c0698l2);
                            break;
                        }
                        i4 = size;
                        i5 = length2;
                        if (((p076T.C0698l) arrayList.get(i13)).f2341m.equals(c0698l2.f2341m)) {
                            break;
                        }
                        i13++;
                        length2 = i5;
                        size = i4;
                    }
                } else {
                    i4 = size;
                    i5 = length2;
                }
                i12++;
                str2 = str6;
                c0698lArr3 = c0698lArr4;
                length2 = i5;
                size = i4;
            }
        }
        p076T.C0699m c0699m3 = arrayList.isEmpty() ? null : new p076T.C0699m(str2, arrayList);
        p076T.C0701o m1295a = m1295a();
        m1295a.f2359a = str3;
        m1295a.f2360b = str4;
        m1295a.f2361c = p129f2.AbstractC1393I.m3162j(abstractC1393I);
        m1295a.f2362d = str;
        m1295a.f2363e = i8;
        m1295a.f2364f = i9;
        m1295a.f2365g = i6;
        m1295a.f2366h = i7;
        m1295a.f2367i = str5;
        m1295a.f2368j = c0664g;
        m1295a.f2374p = c0699m3;
        m1295a.f2378t = f4;
        m1295a.f2356G = c0702p.f2392H;
        m1295a.f2357H = c0702p.f2393I;
        return new p076T.C0702p(m1295a);
    }

    public final boolean equals(java.lang.Object obj) {
        int i4;
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0702p.class != obj.getClass()) {
            return false;
        }
        p076T.C0702p c0702p = (p076T.C0702p) obj;
        int i5 = this.f2395K;
        if (i5 == 0 || (i4 = c0702p.f2395K) == 0 || i5 == i4) {
            return this.f2400e == c0702p.f2400e && this.f2401f == c0702p.f2401f && this.f2402g == c0702p.f2402g && this.f2403h == c0702p.f2403h && this.f2409n == c0702p.f2409n && this.f2413r == c0702p.f2413r && this.f2414s == c0702p.f2414s && this.f2415t == c0702p.f2415t && this.f2417v == c0702p.f2417v && this.f2420y == c0702p.f2420y && this.f2385A == c0702p.f2385A && this.f2386B == c0702p.f2386B && this.f2387C == c0702p.f2387C && this.f2388D == c0702p.f2388D && this.f2389E == c0702p.f2389E && this.f2390F == c0702p.f2390F && this.f2392H == c0702p.f2392H && this.f2393I == c0702p.f2393I && this.f2394J == c0702p.f2394J && java.lang.Float.compare(this.f2416u, c0702p.f2416u) == 0 && java.lang.Float.compare(this.f2418w, c0702p.f2418w) == 0 && java.util.Objects.equals(this.f2396a, c0702p.f2396a) && java.util.Objects.equals(this.f2397b, c0702p.f2397b) && this.f2398c.equals(c0702p.f2398c) && java.util.Objects.equals(this.f2405j, c0702p.f2405j) && java.util.Objects.equals(this.f2407l, c0702p.f2407l) && java.util.Objects.equals(this.f2408m, c0702p.f2408m) && java.util.Objects.equals(this.f2399d, c0702p.f2399d) && java.util.Arrays.equals(this.f2419x, c0702p.f2419x) && java.util.Objects.equals(this.f2406k, c0702p.f2406k) && java.util.Objects.equals(this.f2421z, c0702p.f2421z) && java.util.Objects.equals(this.f2412q, c0702p.f2412q) && m1297c(c0702p);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2395K == 0) {
            java.lang.String str = this.f2396a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.String str2 = this.f2397b;
            int hashCode2 = (this.f2398c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            java.lang.String str3 = this.f2399d;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f2400e) * 31) + this.f2401f) * 31) + this.f2402g) * 31) + this.f2403h) * 31;
            java.lang.String str4 = this.f2405j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            p076T.C0664G c0664g = this.f2406k;
            int hashCode5 = (hashCode4 + (c0664g == null ? 0 : c0664g.hashCode())) * 961;
            java.lang.String str5 = this.f2407l;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            java.lang.String str6 = this.f2408m;
            this.f2395K = ((((((((((((((((((((java.lang.Float.floatToIntBits(this.f2418w) + ((((java.lang.Float.floatToIntBits(this.f2416u) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f2409n) * 31) + ((int) this.f2413r)) * 31) + this.f2414s) * 31) + this.f2415t) * 31)) * 31) + this.f2417v) * 31)) * 31) + this.f2420y) * 31) + this.f2385A) * 31) + this.f2386B) * 31) + this.f2387C) * 31) + this.f2388D) * 31) + this.f2389E) * 31) + this.f2390F) * 31) + this.f2392H) * 31) + this.f2393I) * 31) + this.f2394J;
        }
        return this.f2395K;
    }

    public final java.lang.String toString() {
        return "Format(" + this.f2396a + ", " + this.f2397b + ", " + this.f2407l + ", " + this.f2408m + ", " + this.f2405j + ", " + this.f2404i + ", " + this.f2399d + ", [" + this.f2414s + ", " + this.f2415t + ", " + this.f2416u + ", " + this.f2421z + "], [" + this.f2385A + ", " + this.f2386B + "])";
    }
}
