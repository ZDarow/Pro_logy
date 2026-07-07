package p117d0;

/* renamed from: d0.b */
/* loaded from: classes.dex */
public final class C1258b implements p179q0.InterfaceC1962D, p179q0.InterfaceC1987b0 {

    /* renamed from: I */
    public static final java.util.regex.Pattern f4991I = java.util.regex.Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: J */
    public static final java.util.regex.Pattern f4992J = java.util.regex.Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: A */
    public final p127f0.C1372e f4993A;

    /* renamed from: B */
    public p179q0.InterfaceC1961C f4994B;

    /* renamed from: E */
    public p179q0.C2006l f4997E;

    /* renamed from: F */
    public p122e0.C1302c f4998F;

    /* renamed from: G */
    public int f4999G;

    /* renamed from: H */
    public java.util.List f5000H;

    /* renamed from: l */
    public final int f5001l;

    /* renamed from: m */
    public final p063P2.C0528a f5002m;

    /* renamed from: n */
    public final p094Y.InterfaceC0860C f5003n;

    /* renamed from: o */
    public final p127f0.InterfaceC1376i f5004o;

    /* renamed from: p */
    public final p193t0.C2164b f5005p;

    /* renamed from: q */
    public final p035I.C0291m f5006q;

    /* renamed from: r */
    public final long f5007r;

    /* renamed from: s */
    public final p197u0.InterfaceC2228o f5008s;

    /* renamed from: t */
    public final p197u0.C2218e f5009t;

    /* renamed from: u */
    public final p179q0.C2005k0 f5010u;

    /* renamed from: v */
    public final p117d0.C1257a[] f5011v;

    /* renamed from: w */
    public final p046L1.C0363g f5012w;

    /* renamed from: x */
    public final p117d0.C1271o f5013x;

    /* renamed from: z */
    public final p127f0.C1372e f5015z;

    /* renamed from: C */
    public p184r0.C2050h[] f4995C = new p184r0.C2050h[0];

    /* renamed from: D */
    public p117d0.C1268l[] f4996D = new p117d0.C1268l[0];

    /* renamed from: y */
    public final java.util.IdentityHashMap f5014y = new java.util.IdentityHashMap();

    public C1258b(int i4, p122e0.C1302c c1302c, p035I.C0291m c0291m, int i5, p063P2.C0528a c0528a, p094Y.InterfaceC0860C interfaceC0860C, p127f0.InterfaceC1376i interfaceC1376i, p127f0.C1372e c1372e, p193t0.C2164b c2164b, p127f0.C1372e c1372e2, long j4, p197u0.InterfaceC2228o interfaceC2228o, p197u0.C2218e c2218e, p046L1.C0363g c0363g, p117d0.C1260d c1260d, p107b0.C1177l c1177l) {
        int i6;
        int i7;
        int i8;
        p076T.C0702p[] c0702pArr;
        p076T.C0702p[] m2952n;
        p122e0.C1305f m2950a;
        java.lang.Integer num;
        p127f0.InterfaceC1376i interfaceC1376i2 = interfaceC1376i;
        this.f5001l = i4;
        this.f4998F = c1302c;
        this.f5006q = c0291m;
        this.f4999G = i5;
        this.f5002m = c0528a;
        this.f5003n = interfaceC0860C;
        this.f5004o = interfaceC1376i2;
        this.f4993A = c1372e;
        this.f5005p = c2164b;
        this.f5015z = c1372e2;
        this.f5007r = j4;
        this.f5008s = interfaceC2228o;
        this.f5009t = c2218e;
        this.f5012w = c0363g;
        this.f5013x = new p117d0.C1271o(c1302c, c1260d, c2218e);
        int i9 = 0;
        c0363g.getClass();
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        this.f4997E = new p179q0.C2006l(c1415c0, c1415c0);
        p122e0.C1307h m3041b = c1302c.m3041b(i5);
        java.util.List list = m3041b.f5252d;
        this.f5000H = list;
        java.util.List list2 = m3041b.f5251c;
        int size = list2.size();
        java.util.HashMap hashMap = new java.util.HashMap(p129f2.AbstractC1444r.m3223b(size));
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        android.util.SparseArray sparseArray = new android.util.SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            hashMap.put(java.lang.Long.valueOf(((p122e0.C1300a) list2.get(i10)).f5207a), java.lang.Integer.valueOf(i10));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        int i11 = 0;
        while (i11 < size) {
            p122e0.C1300a c1300a = (p122e0.C1300a) list2.get(i11);
            p122e0.C1305f m2950a2 = m2950a("http://dashif.org/guidelines/trickmode", c1300a.f5211e);
            java.util.List list3 = c1300a.f5212f;
            m2950a2 = m2950a2 == null ? m2950a("http://dashif.org/guidelines/trickmode", list3) : m2950a2;
            int intValue = (m2950a2 == null || (num = (java.lang.Integer) hashMap.get(java.lang.Long.valueOf(java.lang.Long.parseLong(m2950a2.f5243b)))) == null) ? i11 : num.intValue();
            if (intValue == i11 && (m2950a = m2950a("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i12 = p086W.AbstractC0805y.f2801a;
                java.lang.String[] split = m2950a.f5243b.split(",", -1);
                int length = split.length;
                for (int i13 = i9; i13 < length; i13++) {
                    java.lang.Integer num2 = (java.lang.Integer) hashMap.get(java.lang.Long.valueOf(java.lang.Long.parseLong(split[i13])));
                    if (num2 != null) {
                        intValue = java.lang.Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i11) {
                java.util.List list4 = (java.util.List) sparseArray.get(i11);
                java.util.List list5 = (java.util.List) sparseArray.get(intValue);
                list5.addAll(list4);
                sparseArray.put(i11, list5);
                arrayList.remove(list4);
            }
            i11++;
            i9 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] m1786X = p101a.AbstractC0936a.m1786X((java.util.Collection) arrayList.get(i14));
            iArr[i14] = m1786X;
            java.util.Arrays.sort(m1786X);
        }
        boolean[] zArr = new boolean[size2];
        p076T.C0702p[][] c0702pArr2 = new p076T.C0702p[size2];
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            int[] iArr2 = iArr[i15];
            int length2 = iArr2.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length2) {
                    break;
                }
                java.util.List list6 = ((p122e0.C1300a) list2.get(iArr2[i17])).f5209c;
                int[] iArr3 = iArr2;
                for (int i18 = 0; i18 < list6.size(); i18++) {
                    if (!((p122e0.AbstractC1312m) list6.get(i18)).f5268o.isEmpty()) {
                        zArr[i15] = true;
                        i16++;
                        break;
                    }
                }
                i17++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i15];
            int length3 = iArr4.length;
            int i19 = 0;
            while (i19 < length3) {
                int i20 = iArr4[i19];
                p122e0.C1300a c1300a2 = (p122e0.C1300a) list2.get(i20);
                java.util.List list7 = ((p122e0.C1300a) list2.get(i20)).f5210d;
                int[] iArr5 = iArr4;
                int i21 = length3;
                int i22 = 0;
                while (i22 < list7.size()) {
                    p122e0.C1305f c1305f = (p122e0.C1305f) list7.get(i22);
                    java.util.List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c1305f.f5242a)) {
                        p076T.C0701o c0701o = new p076T.C0701o();
                        c0701o.f2370l = p076T.AbstractC0665H.m1201l("application/cea-608");
                        c0701o.f2359a = c1300a2.f5207a + ":cea608";
                        m2952n = m2952n(c1305f, f4991I, new p076T.C0702p(c0701o));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(c1305f.f5242a)) {
                        p076T.C0701o c0701o2 = new p076T.C0701o();
                        c0701o2.f2370l = p076T.AbstractC0665H.m1201l("application/cea-708");
                        c0701o2.f2359a = c1300a2.f5207a + ":cea708";
                        m2952n = m2952n(c1305f, f4992J, new p076T.C0702p(c0701o2));
                    } else {
                        i22++;
                        list7 = list8;
                    }
                    c0702pArr = m2952n;
                    i8 = 1;
                }
                i19++;
                iArr4 = iArr5;
                length3 = i21;
            }
            i8 = 1;
            c0702pArr = new p076T.C0702p[0];
            c0702pArr2[i15] = c0702pArr;
            if (c0702pArr.length != 0) {
                i16 += i8;
            }
            i15 += i8;
        }
        int size3 = list.size() + i16 + size2;
        p076T.C0678V[] c0678vArr = new p076T.C0678V[size3];
        p117d0.C1257a[] c1257aArr = new p117d0.C1257a[size3];
        int i23 = 0;
        int i24 = 0;
        while (i23 < size2) {
            int[] iArr6 = iArr[i23];
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int length4 = iArr6.length;
            int i25 = size2;
            int i26 = 0;
            while (i26 < length4) {
                arrayList3.addAll(((p122e0.C1300a) list2.get(iArr6[i26])).f5209c);
                i26++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            p076T.C0702p[] c0702pArr3 = new p076T.C0702p[size4];
            int i27 = 0;
            while (i27 < size4) {
                int i28 = size4;
                p076T.C0702p c0702p = ((p122e0.AbstractC1312m) arrayList3.get(i27)).f5265l;
                java.util.ArrayList arrayList4 = arrayList3;
                p076T.C0701o m1295a = c0702p.m1295a();
                m1295a.f2358I = interfaceC1376i2.mo3132d(c0702p);
                c0702pArr3[i27] = new p076T.C0702p(m1295a);
                i27++;
                size4 = i28;
                arrayList3 = arrayList4;
            }
            p122e0.C1300a c1300a3 = (p122e0.C1300a) list2.get(iArr6[0]);
            long j5 = c1300a3.f5207a;
            java.lang.String l4 = j5 != -1 ? java.lang.Long.toString(j5) : p009B2.AbstractC0051h.m152k("unset:", i23);
            int i29 = i24 + 1;
            if (zArr[i23]) {
                i6 = i29;
                i29 = i24 + 2;
            } else {
                i6 = -1;
            }
            if (c0702pArr2[i23].length != 0) {
                i7 = i29;
                i29++;
            } else {
                i7 = -1;
            }
            m2951k(c0528a, c0702pArr3);
            java.util.List list9 = list2;
            c0678vArr[i24] = new p076T.C0678V(l4, c0702pArr3);
            p129f2.C1391G c1391g2 = p129f2.AbstractC1393I.f5704m;
            p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
            c1257aArr[i24] = new p117d0.C1257a(c1300a3.f5208b, 0, iArr6, i24, i6, i7, -1, c1415c02);
            int i30 = i6;
            int i31 = -1;
            if (i30 != -1) {
                java.lang.String str = l4 + ":emsg";
                p076T.C0701o c0701o3 = new p076T.C0701o();
                c0701o3.f2359a = str;
                c0701o3.f2370l = p076T.AbstractC0665H.m1201l("application/x-emsg");
                c0678vArr[i30] = new p076T.C0678V(str, new p076T.C0702p(c0701o3));
                c1257aArr[i30] = new p117d0.C1257a(5, 1, iArr6, i24, -1, -1, -1, c1415c02);
                i31 = -1;
            }
            if (i7 != i31) {
                c1257aArr[i7] = new p117d0.C1257a(3, 1, iArr6, i24, -1, -1, -1, p129f2.AbstractC1393I.m3163k(c0702pArr2[i23]));
                m2951k(c0528a, c0702pArr2[i23]);
                c0678vArr[i7] = new p076T.C0678V(l4 + ":cc", c0702pArr2[i23]);
            }
            i23++;
            size2 = i25;
            interfaceC1376i2 = interfaceC1376i;
            iArr = iArr7;
            i24 = i29;
            list2 = list9;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            p122e0.C1306g c1306g = (p122e0.C1306g) list.get(i32);
            p076T.C0701o c0701o4 = new p076T.C0701o();
            c0701o4.f2359a = c1306g.m3065a();
            c0701o4.f2370l = p076T.AbstractC0665H.m1201l("application/x-emsg");
            c0678vArr[i24] = new p076T.C0678V(c1306g.m3065a() + ":" + i32, new p076T.C0702p(c0701o4));
            p129f2.C1391G c1391g3 = p129f2.AbstractC1393I.f5704m;
            c1257aArr[i24] = new p117d0.C1257a(5, 2, new int[0], -1, -1, -1, i32, p129f2.C1415c0.f5744p);
            i32++;
            i24++;
        }
        android.util.Pair create = android.util.Pair.create(new p179q0.C2005k0(c0678vArr), c1257aArr);
        this.f5010u = (p179q0.C2005k0) create.first;
        this.f5011v = (p117d0.C1257a[]) create.second;
    }

    /* renamed from: a */
    public static p122e0.C1305f m2950a(java.lang.String str, java.util.List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            p122e0.C1305f c1305f = (p122e0.C1305f) list.get(i4);
            if (str.equals(c1305f.f5242a)) {
                return c1305f;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static void m2951k(p063P2.C0528a c0528a, p076T.C0702p[] c0702pArr) {
        for (int i4 = 0; i4 < c0702pArr.length; i4++) {
            p076T.C0702p c0702p = c0702pArr[i4];
            p009B2.C0033D c0033d = (p009B2.C0033D) c0528a.f1553n;
            if (c0033d.f118a && ((p046L1.C0363g) c0033d.f119b).mo600o(c0702p)) {
                p076T.C0701o m1295a = c0702p.m1295a();
                m1295a.f2370l = p076T.AbstractC0665H.m1201l("application/x-media3-cues");
                m1295a.f2355F = ((p046L1.C0363g) c0033d.f119b).mo592e(c0702p);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(c0702p.f2408m);
                java.lang.String str = c0702p.f2405j;
                sb.append(str != null ? " ".concat(str) : "");
                m1295a.f2367i = sb.toString();
                m1295a.f2375q = Long.MAX_VALUE;
                c0702p = new p076T.C0702p(m1295a);
            }
            c0702pArr[i4] = c0702p;
        }
    }

    /* renamed from: n */
    public static p076T.C0702p[] m2952n(p122e0.C1305f c1305f, java.util.regex.Pattern pattern, p076T.C0702p c0702p) {
        java.lang.String str = c1305f.f5243b;
        if (str == null) {
            return new p076T.C0702p[]{c0702p};
        }
        int i4 = p086W.AbstractC0805y.f2801a;
        java.lang.String[] split = str.split(";", -1);
        p076T.C0702p[] c0702pArr = new p076T.C0702p[split.length];
        for (int i5 = 0; i5 < split.length; i5++) {
            java.util.regex.Matcher matcher = pattern.matcher(split[i5]);
            if (!matcher.matches()) {
                return new p076T.C0702p[]{c0702p};
            }
            int parseInt = java.lang.Integer.parseInt(matcher.group(1));
            p076T.C0701o m1295a = c0702p.m1295a();
            m1295a.f2359a = c0702p.f2396a + ":" + parseInt;
            m1295a.f2354E = parseInt;
            m1295a.f2362d = matcher.group(2);
            c0702pArr[i5] = new p076T.C0702p(m1295a);
        }
        return c0702pArr;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        for (p184r0.C2050h c2050h : this.f4995C) {
            if (c2050h.f8353l == 2) {
                return c2050h.f8357p.mo2995b(j4, c0987m0);
            }
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        return this.f4997E.mo2954c();
    }

    /* renamed from: d */
    public final int m2955d(int[] iArr, int i4) {
        int i5 = iArr[i4];
        if (i5 == -1) {
            return -1;
        }
        p117d0.C1257a[] c1257aArr = this.f5011v;
        int i6 = c1257aArr[i5].f4987e;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            if (i8 == i6 && c1257aArr[i8].f4985c == 0) {
                return i7;
            }
        }
        return -1;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        return this.f5010u;
    }

    @Override // p179q0.InterfaceC1987b0
    /* renamed from: f */
    public final void mo1906f(p179q0.InterfaceC1989c0 interfaceC1989c0) {
        this.f4994B.mo1906f(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    public final void mo2957g(p179q0.InterfaceC1961C interfaceC1961C, long j4) {
        this.f4994B = interfaceC1961C;
        interfaceC1961C.mo1920o(this);
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        return this.f4997E.mo2958h();
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        return this.f4997E.mo2959i(c0953q);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
        this.f5008s.mo2967a();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    public final long mo2961l(long j4) {
        for (p184r0.C2050h c2050h : this.f4995C) {
            c2050h.m4107C(j4);
        }
        for (p117d0.C1268l c1268l : this.f4996D) {
            int m1607b = p086W.AbstractC0805y.m1607b(c1268l.f5090n, j4, true);
            c1268l.f5094r = m1607b;
            c1268l.f5095s = (c1268l.f5091o && m1607b == c1268l.f5090n.length) ? j4 : -9223372036854775807L;
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
        for (p184r0.C2050h c2050h : this.f4995C) {
            c2050h.m4108m(j4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    public final long mo2963p(p193t0.InterfaceC2181s[] interfaceC2181sArr, boolean[] zArr, p179q0.InterfaceC1985a0[] interfaceC1985a0Arr, boolean[] zArr2, long j4) {
        int i4;
        boolean z4;
        int[] iArr;
        int i5;
        int i6;
        int[] iArr2;
        java.lang.Object[] objArr;
        int i7;
        p076T.C0678V c0678v;
        int i8;
        p117d0.C1270n c1270n;
        boolean z5;
        p193t0.InterfaceC2181s[] interfaceC2181sArr2 = interfaceC2181sArr;
        java.lang.Object[] objArr2 = interfaceC1985a0Arr;
        int[] iArr3 = new int[interfaceC2181sArr2.length];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i4 = -1;
            if (i10 >= interfaceC2181sArr2.length) {
                break;
            }
            p193t0.InterfaceC2181s interfaceC2181s = interfaceC2181sArr2[i10];
            if (interfaceC2181s != null) {
                iArr3[i10] = this.f5010u.m4054b(interfaceC2181s.mo3970b());
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        for (int i11 = 0; i11 < interfaceC2181sArr2.length; i11++) {
            if (interfaceC2181sArr2[i11] == null || !zArr[i11]) {
                java.lang.Object obj = objArr2[i11];
                if (obj instanceof p184r0.C2050h) {
                    ((p184r0.C2050h) obj).m4106B(this);
                } else if (obj instanceof p184r0.C2049g) {
                    ((p184r0.C2049g) obj).m4104c();
                }
                objArr2[i11] = null;
            }
        }
        int i12 = 0;
        while (true) {
            z4 = true;
            if (i12 >= interfaceC2181sArr2.length) {
                break;
            }
            java.lang.Object obj2 = objArr2[i12];
            if ((obj2 instanceof p179q0.C2016u) || (obj2 instanceof p184r0.C2049g)) {
                int m2955d = m2955d(iArr3, i12);
                if (m2955d == -1) {
                    z5 = objArr2[i12] instanceof p179q0.C2016u;
                } else {
                    java.lang.Object obj3 = objArr2[i12];
                    z5 = (obj3 instanceof p184r0.C2049g) && ((p184r0.C2049g) obj3).f8340l == objArr2[m2955d];
                }
                if (!z5) {
                    java.lang.Object obj4 = objArr2[i12];
                    if (obj4 instanceof p184r0.C2049g) {
                        ((p184r0.C2049g) obj4).m4104c();
                    }
                    objArr2[i12] = null;
                }
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < interfaceC2181sArr2.length) {
            p193t0.InterfaceC2181s interfaceC2181s2 = interfaceC2181sArr2[i13];
            if (interfaceC2181s2 == null) {
                i5 = i13;
                i6 = i9;
                iArr2 = iArr3;
                objArr = objArr2;
            } else {
                java.lang.Object obj5 = objArr2[i13];
                if (obj5 == null) {
                    zArr2[i13] = z4;
                    p117d0.C1257a c1257a = this.f5011v[iArr3[i13]];
                    int i14 = c1257a.f4985c;
                    if (i14 == 0) {
                        int i15 = c1257a.f4988f;
                        boolean z6 = i15 != i4 ? z4 ? 1 : 0 : i9;
                        if (z6 != 0) {
                            c0678v = this.f5010u.m4053a(i15);
                            i7 = z4 ? 1 : 0;
                        } else {
                            i7 = i9;
                            c0678v = null;
                        }
                        int i16 = c1257a.f4989g;
                        p129f2.C1415c0 m3164m = i16 != i4 ? this.f5011v[i16].f4990h : p129f2.AbstractC1393I.m3164m();
                        int size = m3164m.size() + i7;
                        p076T.C0702p[] c0702pArr = new p076T.C0702p[size];
                        int[] iArr4 = new int[size];
                        if (z6 != 0) {
                            c0702pArr[i9] = c0678v.m1258a(i9);
                            iArr4[i9] = 5;
                            i8 = z4 ? 1 : 0;
                        } else {
                            i8 = i9;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (i9 < m3164m.size()) {
                            p076T.C0702p c0702p = (p076T.C0702p) m3164m.get(i9);
                            c0702pArr[i8] = c0702p;
                            iArr4[i8] = 3;
                            arrayList.add(c0702p);
                            i8++;
                            i9++;
                        }
                        if (!this.f4998F.f5220d || z6 == 0) {
                            c1270n = null;
                        } else {
                            p117d0.C1271o c1271o = this.f5013x;
                            c1270n = new p117d0.C1270n(c1271o, c1271o.f5103l);
                        }
                        p063P2.C0528a c0528a = this.f5002m;
                        p197u0.InterfaceC2228o interfaceC2228o = this.f5008s;
                        p122e0.C1302c c1302c = this.f4998F;
                        i5 = i13;
                        p035I.C0291m c0291m = this.f5006q;
                        int[] iArr5 = iArr3;
                        int i17 = this.f4999G;
                        int[] iArr6 = c1257a.f4983a;
                        int i18 = c1257a.f4984b;
                        long j5 = this.f5007r;
                        p094Y.InterfaceC0860C interfaceC0860C = this.f5003n;
                        p094Y.InterfaceC0870h mo104a = ((p094Y.InterfaceC0869g) c0528a.f1552m).mo104a();
                        if (interfaceC0860C != null) {
                            mo104a.mo1688j(interfaceC0860C);
                        }
                        p117d0.C1270n c1270n2 = c1270n;
                        iArr2 = iArr5;
                        p184r0.C2050h c2050h = new p184r0.C2050h(c1257a.f4984b, iArr4, c0702pArr, new p117d0.C1267k((p009B2.C0033D) c0528a.f1553n, interfaceC2228o, c1302c, c0291m, i17, iArr6, interfaceC2181s2, i18, mo104a, j5, c0528a.f1551l, z6, arrayList, c1270n), this, this.f5009t, j4, this.f5004o, this.f4993A, this.f5005p, this.f5015z);
                        synchronized (this) {
                            this.f5014y.put(c2050h, c1270n2);
                        }
                        objArr = interfaceC1985a0Arr;
                        objArr[i5] = c2050h;
                    } else {
                        i5 = i13;
                        iArr2 = iArr3;
                        objArr = objArr2;
                        if (i14 == 2) {
                            i6 = 0;
                            objArr[i5] = new p117d0.C1268l((p122e0.C1306g) this.f5000H.get(c1257a.f4986d), interfaceC2181s2.mo3970b().m1258a(0), this.f4998F.f5220d);
                        }
                    }
                    i6 = 0;
                } else {
                    i5 = i13;
                    i6 = i9;
                    iArr2 = iArr3;
                    objArr = objArr2;
                    if (obj5 instanceof p184r0.C2050h) {
                        ((p117d0.C1267k) ((p184r0.C2050h) obj5).f8357p).f5083j = interfaceC2181s2;
                    }
                }
            }
            i13 = i5 + 1;
            interfaceC2181sArr2 = interfaceC2181sArr;
            objArr2 = objArr;
            i9 = i6;
            iArr3 = iArr2;
            i4 = -1;
            z4 = true;
        }
        int i19 = i9;
        int[] iArr7 = iArr3;
        java.lang.Object[] objArr3 = objArr2;
        while (i9 < interfaceC2181sArr.length) {
            if (objArr3[i9] != null || interfaceC2181sArr[i9] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                p117d0.C1257a c1257a2 = this.f5011v[iArr[i9]];
                if (c1257a2.f4985c == 1) {
                    int m2955d2 = m2955d(iArr, i9);
                    if (m2955d2 == -1) {
                        objArr3[i9] = new java.lang.Object();
                    } else {
                        p184r0.C2050h c2050h2 = (p184r0.C2050h) objArr3[m2955d2];
                        int i20 = c1257a2.f4984b;
                        int i21 = 0;
                        while (true) {
                            p179q0.C1983Z[] c1983zArr = c2050h2.f8366y;
                            if (i21 >= c1983zArr.length) {
                                throw new java.lang.IllegalStateException();
                            }
                            if (c2050h2.f8354m[i21] == i20) {
                                boolean[] zArr3 = c2050h2.f8356o;
                                p086W.AbstractC0781a.m1421j(!zArr3[i21]);
                                zArr3[i21] = true;
                                c1983zArr[i21].m4008B(j4, true);
                                objArr3[i9] = new p184r0.C2049g(c2050h2, c2050h2, c1983zArr[i21], i21);
                                break;
                            }
                            i21++;
                        }
                    }
                }
            }
            i9++;
            iArr7 = iArr;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int length = objArr3.length;
        for (int i22 = i19; i22 < length; i22++) {
            java.lang.Object obj6 = objArr3[i22];
            if (obj6 instanceof p184r0.C2050h) {
                arrayList2.add((p184r0.C2050h) obj6);
            } else if (obj6 instanceof p117d0.C1268l) {
                arrayList3.add((p117d0.C1268l) obj6);
            }
        }
        p184r0.C2050h[] c2050hArr = new p184r0.C2050h[arrayList2.size()];
        this.f4995C = c2050hArr;
        arrayList2.toArray(c2050hArr);
        p117d0.C1268l[] c1268lArr = new p117d0.C1268l[arrayList3.size()];
        this.f4996D = c1268lArr;
        arrayList3.toArray(c1268lArr);
        p046L1.C0363g c0363g = this.f5012w;
        java.util.AbstractList m3243w = p129f2.AbstractC1444r.m3243w(arrayList2, new p107b0.C1169d(5));
        c0363g.getClass();
        this.f4997E = new p179q0.C2006l(arrayList2, m3243w);
        return j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        return this.f4997E.mo2964r();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        return -9223372036854775807L;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
        this.f4997E.mo2966w(j4);
    }
}
