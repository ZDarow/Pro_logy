package p193t0;

/* renamed from: t0.q */
/* loaded from: classes.dex */
public final class C2179q extends p193t0.AbstractC2183u {

    /* renamed from: j */
    public static final p129f2.AbstractC1413b0 f8708j = new p129f2.C1450w(new p087W0.C0809d(6));

    /* renamed from: c */
    public final java.lang.Object f8709c;

    /* renamed from: d */
    public final android.content.Context f8710d;

    /* renamed from: e */
    public final p193t0.C2164b f8711e;

    /* renamed from: f */
    public final boolean f8712f;

    /* renamed from: g */
    public p193t0.C2173k f8713g;

    /* renamed from: h */
    public final p043K2.C0336l f8714h;

    /* renamed from: i */
    public p076T.C0691e f8715i;

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [K2.l, java.lang.Object] */
    public C2179q(android.content.Context context) {
        android.media.Spatializer spatializer;
        int immersiveAudioLevel;
        p043K2.C0336l c0336l;
        ?? obj = new java.lang.Object();
        int i4 = p193t0.C2173k.f8669A;
        p193t0.C2173k c2173k = new p193t0.C2173k(new p193t0.C2172j(context));
        this.f8709c = new java.lang.Object();
        this.f8710d = context.getApplicationContext();
        this.f8711e = obj;
        this.f8713g = c2173k;
        this.f8715i = p076T.C0691e.f2315e;
        boolean m1591L = p086W.AbstractC0805y.m1591L(context);
        this.f8712f = m1591L;
        if (!m1591L && p086W.AbstractC0805y.f2801a >= 32) {
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                c0336l = null;
            } else {
                spatializer = audioManager.getSpatializer();
                ?? obj2 = new java.lang.Object();
                obj2.f1039b = spatializer;
                immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
                obj2.f1038a = immersiveAudioLevel != 0;
                c0336l = obj2;
            }
            this.f8714h = c0336l;
        }
        boolean z4 = this.f8713g.f8674v;
    }

    /* renamed from: b */
    public static int m4296b(int i4, int i5) {
        if (i4 == 0 || i4 != i5) {
            return java.lang.Integer.bitCount(i4 & i5);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public static int m4297c(p076T.C0702p c0702p, java.lang.String str, boolean z4) {
        if (!android.text.TextUtils.isEmpty(str) && str.equals(c0702p.f2399d)) {
            return 4;
        }
        java.lang.String m4298f = m4298f(str);
        java.lang.String m4298f2 = m4298f(c0702p.f2399d);
        if (m4298f2 == null || m4298f == null) {
            return (z4 && m4298f2 == null) ? 1 : 0;
        }
        if (m4298f2.startsWith(m4298f) || m4298f.startsWith(m4298f2)) {
            return 3;
        }
        int i4 = p086W.AbstractC0805y.f2801a;
        return m4298f2.split("-", 2)[0].equals(m4298f.split("-", 2)[0]) ? 2 : 0;
    }

    /* renamed from: f */
    public static java.lang.String m4298f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: g */
    public static boolean m4299g(p193t0.C2173k c2173k, int i4, p076T.C0702p c0702p) {
        if ((i4 & 3584) == 0) {
            return false;
        }
        p076T.C0679W c0679w = c2173k.f2287m;
        if (c0679w.f2257c && (i4 & 2048) == 0) {
            return false;
        }
        if (c0679w.f2256b) {
            return !(c0702p.f2388D != 0 || c0702p.f2389E != 0) || ((i4 & 1024) != 0);
        }
        return true;
    }

    /* renamed from: h */
    public static android.util.Pair m4300h(int i4, p145j.C1673n c1673n, int[][][] iArr, p193t0.InterfaceC2176n interfaceC2176n, java.util.Comparator comparator) {
        java.util.RandomAccess randomAccess;
        boolean z4;
        p145j.C1673n c1673n2 = c1673n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i5 = 0;
        while (i5 < c1673n2.f6973a) {
            if (i4 == ((int[]) c1673n2.f6974b)[i5]) {
                p179q0.C2005k0 c2005k0 = ((p179q0.C2005k0[]) c1673n2.f6975c)[i5];
                for (int i6 = 0; i6 < c2005k0.f8184a; i6++) {
                    p076T.C0678V m4053a = c2005k0.m4053a(i6);
                    p129f2.C1415c0 mo1819a = interfaceC2176n.mo1819a(i5, m4053a, iArr[i5][i6]);
                    int i7 = m4053a.f2249a;
                    boolean[] zArr = new boolean[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        p193t0.AbstractC2177o abstractC2177o = (p193t0.AbstractC2177o) mo1819a.get(i8);
                        int mo4290a = abstractC2177o.mo4290a();
                        if (!zArr[i8] && mo4290a != 0) {
                            if (mo4290a == 1) {
                                randomAccess = p129f2.AbstractC1393I.m3166o(abstractC2177o);
                            } else {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(abstractC2177o);
                                for (int i9 = i8 + 1; i9 < i7; i9++) {
                                    p193t0.AbstractC2177o abstractC2177o2 = (p193t0.AbstractC2177o) mo1819a.get(i9);
                                    if (abstractC2177o2.mo4290a() == 2 && abstractC2177o.mo4291b(abstractC2177o2)) {
                                        arrayList2.add(abstractC2177o2);
                                        z4 = true;
                                        zArr[i9] = true;
                                    } else {
                                        z4 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i5++;
            c1673n2 = c1673n;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.List list = (java.util.List) java.util.Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((p193t0.AbstractC2177o) list.get(i10)).f8691n;
        }
        p193t0.AbstractC2177o abstractC2177o3 = (p193t0.AbstractC2177o) list.get(0);
        return android.util.Pair.create(new p193t0.C2180r(abstractC2177o3.f8690m, iArr2), java.lang.Integer.valueOf(abstractC2177o3.f8689l));
    }

    @Override // p193t0.AbstractC2183u
    /* renamed from: a */
    public final void mo4301a(p076T.C0691e c0691e) {
        boolean equals;
        synchronized (this.f8709c) {
            equals = this.f8715i.equals(c0691e);
            this.f8715i = c0691e;
        }
        if (equals) {
            return;
        }
        m4303e();
    }

    /* renamed from: d */
    public final p193t0.C2173k m4302d() {
        p193t0.C2173k c2173k;
        synchronized (this.f8709c) {
            c2173k = this.f8713g;
        }
        return c2173k;
    }

    /* renamed from: e */
    public final void m4303e() {
        boolean z4;
        p102a0.C0950N c0950n;
        p043K2.C0336l c0336l;
        synchronized (this.f8709c) {
            try {
                z4 = this.f8713g.f8674v && !this.f8712f && p086W.AbstractC0805y.f2801a >= 32 && (c0336l = this.f8714h) != null && c0336l.f1038a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (!z4 || (c0950n = this.f8718a) == null) {
            return;
        }
        c0950n.f3436s.m1572e(10);
    }

    /* renamed from: i */
    public final void m4304i(p193t0.C2173k c2173k) {
        boolean equals;
        synchronized (this.f8709c) {
            equals = this.f8713g.equals(c2173k);
            this.f8713g = c2173k;
        }
        if (equals) {
            return;
        }
        if (c2173k.f8674v && this.f8710d == null) {
            p086W.AbstractC0781a.m1410A("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        p102a0.C0950N c0950n = this.f8718a;
        if (c0950n != null) {
            c0950n.f3436s.m1572e(10);
        }
    }
}
