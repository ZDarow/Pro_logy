package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.M */
/* loaded from: classes.dex */
public final class C1080M implements androidx.datastore.preferences.protobuf.InterfaceC1088V {

    /* renamed from: n */
    public static final int[] f4162n = new int[0];

    /* renamed from: o */
    public static final sun.misc.Unsafe f4163o = androidx.datastore.preferences.protobuf.AbstractC1110i0.m2571i();

    /* renamed from: a */
    public final int[] f4164a;

    /* renamed from: b */
    public final java.lang.Object[] f4165b;

    /* renamed from: c */
    public final int f4166c;

    /* renamed from: d */
    public final int f4167d;

    /* renamed from: e */
    public final androidx.datastore.preferences.protobuf.AbstractC1093a f4168e;

    /* renamed from: f */
    public final boolean f4169f;

    /* renamed from: g */
    public final int[] f4170g;

    /* renamed from: h */
    public final int f4171h;

    /* renamed from: i */
    public final int f4172i;

    /* renamed from: j */
    public final androidx.datastore.preferences.protobuf.C1082O f4173j;

    /* renamed from: k */
    public final androidx.datastore.preferences.protobuf.C1069B f4174k;

    /* renamed from: l */
    public final androidx.datastore.preferences.protobuf.C1100d0 f4175l;

    /* renamed from: m */
    public final androidx.datastore.preferences.protobuf.C1076I f4176m;

    public C1080M(int[] iArr, java.lang.Object[] objArr, int i4, int i5, androidx.datastore.preferences.protobuf.AbstractC1093a abstractC1093a, int[] iArr2, int i6, int i7, androidx.datastore.preferences.protobuf.C1082O c1082o, androidx.datastore.preferences.protobuf.C1069B c1069b, androidx.datastore.preferences.protobuf.C1100d0 c1100d0, androidx.datastore.preferences.protobuf.C1121o c1121o, androidx.datastore.preferences.protobuf.C1076I c1076i) {
        this.f4164a = iArr;
        this.f4165b = objArr;
        this.f4166c = i4;
        this.f4167d = i5;
        this.f4169f = abstractC1093a instanceof androidx.datastore.preferences.protobuf.AbstractC1132v;
        this.f4170g = iArr2;
        this.f4171h = i6;
        this.f4172i = i7;
        this.f4173j = c1082o;
        this.f4174k = c1069b;
        this.f4175l = c1100d0;
        this.f4168e = abstractC1093a;
        this.f4176m = c1076i;
    }

    /* renamed from: A */
    public static long m2382A(long j4, java.lang.Object obj) {
        return ((java.lang.Long) androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj)).longValue();
    }

    /* renamed from: G */
    public static java.lang.reflect.Field m2383G(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields));
        }
    }

    /* renamed from: L */
    public static int m2384L(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    /* renamed from: p */
    public static boolean m2385p(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC1132v) {
            return ((androidx.datastore.preferences.protobuf.AbstractC1132v) obj).m2639i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0250  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.C1080M m2386x(androidx.datastore.preferences.protobuf.C1087U r33, androidx.datastore.preferences.protobuf.C1082O r34, androidx.datastore.preferences.protobuf.C1069B r35, androidx.datastore.preferences.protobuf.C1100d0 r36, androidx.datastore.preferences.protobuf.C1121o r37, androidx.datastore.preferences.protobuf.C1076I r38) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1080M.m2386x(androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.O, androidx.datastore.preferences.protobuf.B, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.I):androidx.datastore.preferences.protobuf.M");
    }

    /* renamed from: y */
    public static long m2387y(int i4) {
        return i4 & 1048575;
    }

    /* renamed from: z */
    public static int m2388z(long j4, java.lang.Object obj) {
        return ((java.lang.Integer) androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj)).intValue();
    }

    /* renamed from: B */
    public final int m2389B(int i4) {
        if (i4 < this.f4166c || i4 > this.f4167d) {
            return -1;
        }
        int[] iArr = this.f4164a;
        int length = (iArr.length / 3) - 1;
        int i5 = 0;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
            if (i4 == i8) {
                return i7;
            }
            if (i4 < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    /* renamed from: C */
    public final void m2390C(java.lang.Object obj, long j4, p086W.C0792l c0792l, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V, androidx.datastore.preferences.protobuf.C1119n c1119n) {
        int mo2537u;
        this.f4174k.getClass();
        androidx.datastore.preferences.protobuf.InterfaceC1133w m2353b = androidx.datastore.preferences.protobuf.C1069B.m2353b(j4, obj);
        int i4 = c0792l.f2765a;
        if ((i4 & 7) != 3) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
        }
        do {
            androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g = interfaceC1088V.mo2406g();
            c0792l.m1454d(mo2406g, interfaceC1088V, c1119n);
            interfaceC1088V.mo2407h(mo2406g);
            ((androidx.datastore.preferences.protobuf.C1086T) m2353b).add(mo2406g);
            androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) c0792l.f2768d;
            if (abstractC1111j.mo2519c() || c0792l.f2767c != 0) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == i4);
        c0792l.f2767c = mo2537u;
    }

    /* renamed from: D */
    public final void m2391D(java.lang.Object obj, int i4, p086W.C0792l c0792l, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V, androidx.datastore.preferences.protobuf.C1119n c1119n) {
        int mo2537u;
        this.f4174k.getClass();
        androidx.datastore.preferences.protobuf.InterfaceC1133w m2353b = androidx.datastore.preferences.protobuf.C1069B.m2353b(i4 & 1048575, obj);
        int i5 = c0792l.f2765a;
        if ((i5 & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
        }
        do {
            androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g = interfaceC1088V.mo2406g();
            c0792l.m1455e(mo2406g, interfaceC1088V, c1119n);
            interfaceC1088V.mo2407h(mo2406g);
            ((androidx.datastore.preferences.protobuf.C1086T) m2353b).add(mo2406g);
            androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) c0792l.f2768d;
            if (abstractC1111j.mo2519c() || c0792l.f2767c != 0) {
                return;
            } else {
                mo2537u = abstractC1111j.mo2537u();
            }
        } while (mo2537u == i5);
        c0792l.f2767c = mo2537u;
    }

    /* renamed from: E */
    public final void m2392E(int i4, p086W.C0792l c0792l, java.lang.Object obj) {
        if ((536870912 & i4) != 0) {
            c0792l.m1449B(2);
            androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, i4 & 1048575, ((androidx.datastore.preferences.protobuf.AbstractC1111j) c0792l.f2768d).mo2536t());
        } else if (!this.f4169f) {
            androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, i4 & 1048575, c0792l.m1457i());
        } else {
            c0792l.m1449B(2);
            androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, i4 & 1048575, ((androidx.datastore.preferences.protobuf.AbstractC1111j) c0792l.f2768d).mo2535s());
        }
    }

    /* renamed from: F */
    public final void m2393F(int i4, p086W.C0792l c0792l, java.lang.Object obj) {
        boolean z4 = (536870912 & i4) != 0;
        androidx.datastore.preferences.protobuf.C1069B c1069b = this.f4174k;
        if (z4) {
            c1069b.getClass();
            c0792l.m1471w(androidx.datastore.preferences.protobuf.C1069B.m2353b(i4 & 1048575, obj), true);
        } else {
            c1069b.getClass();
            c0792l.m1471w(androidx.datastore.preferences.protobuf.C1069B.m2353b(i4 & 1048575, obj), false);
        }
    }

    /* renamed from: H */
    public final void m2394H(int i4, java.lang.Object obj) {
        int i5 = this.f4164a[i4 + 2];
        long j4 = 1048575 & i5;
        if (j4 == 1048575) {
            return;
        }
        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2575m(j4, obj, (1 << (i5 >>> 20)) | androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j4, obj));
    }

    /* renamed from: I */
    public final void m2395I(int i4, int i5, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2575m(this.f4164a[i5 + 2] & 1048575, obj, i4);
    }

    /* renamed from: J */
    public final void m2396J(java.lang.Object obj, int i4, androidx.datastore.preferences.protobuf.AbstractC1093a abstractC1093a) {
        f4163o.putObject(obj, m2398M(i4) & 1048575, abstractC1093a);
        m2394H(i4, obj);
    }

    /* renamed from: K */
    public final void m2397K(java.lang.Object obj, int i4, int i5, androidx.datastore.preferences.protobuf.AbstractC1093a abstractC1093a) {
        f4163o.putObject(obj, m2398M(i5) & 1048575, abstractC1093a);
        m2395I(i4, i5, obj);
    }

    /* renamed from: M */
    public final int m2398M(int i4) {
        return this.f4164a[i4 + 1];
    }

    /* renamed from: N */
    public final void m2399N(java.lang.Object obj, androidx.datastore.preferences.protobuf.C1072E c1072e) {
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr = this.f4164a;
        int length = iArr.length;
        sun.misc.Unsafe unsafe = f4163o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int m2398M = m2398M(i11);
            int i12 = iArr[i11];
            int m2384L = m2384L(m2398M);
            if (m2384L <= 17) {
                int i13 = iArr[i11 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i10 = i14 == i8 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i4 = i9;
                i5 = i10;
                i6 = 1 << (i13 >>> 20);
            } else {
                i4 = i9;
                i5 = i10;
                i6 = 0;
            }
            long j4 = m2398M & i8;
            switch (m2384L) {
                case 0:
                    i7 = i4;
                    if (!m2414o(obj, i11, i7, i5, i6)) {
                        break;
                    } else {
                        c1072e.m2358c(i12, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.mo2501d(j4, obj));
                        continue;
                    }
                case 1:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2362g(androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.mo2502e(j4, obj), i12);
                        break;
                    } else {
                        continue;
                    }
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2365j(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2372q(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2364i(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2361f(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2360e(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2356a(i12, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.mo2500c(j4, obj));
                        break;
                    } else {
                        continue;
                    }
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        java.lang.Object object = unsafe.getObject(obj, j4);
                        if (object instanceof java.lang.String) {
                            ((androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a).m2603D0((java.lang.String) object, i12);
                            break;
                        } else {
                            c1072e.m2357b(i12, (androidx.datastore.preferences.protobuf.C1105g) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2366k(i12, unsafe.getObject(obj, j4), m2412m(i11));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2357b(i12, (androidx.datastore.preferences.protobuf.C1105g) unsafe.getObject(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2371p(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2359d(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2367l(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2368m(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2369n(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i7 = i4;
                    if (m2414o(obj, i11, i7, i5, i6)) {
                        c1072e.m2370o(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i7 = i4;
                    if (m2414o(obj, i11, i4, i5, i6)) {
                        c1072e.m2363h(i12, unsafe.getObject(obj, j4), m2412m(i11));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2433E(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 19:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2437I(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 20:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2440L(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 21:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2448T(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 22:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2439K(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 23:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2436H(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 24:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2435G(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 25:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2431C(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 26:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2446R(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e);
                    break;
                case 27:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2441M(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, m2412m(i11));
                    break;
                case 28:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2432D(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e);
                    break;
                case 29:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2447S(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 30:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2434F(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 31:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2442N(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 32:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2443O(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 33:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2444P(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 34:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2445Q(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, false);
                    break;
                case 35:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2433E(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 36:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2437I(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 37:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2440L(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 38:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2448T(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 39:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2439K(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 40:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2436H(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 41:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2435G(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 42:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2431C(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 43:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2447S(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 44:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2434F(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 45:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2442N(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 46:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2443O(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 47:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2444P(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 48:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2445Q(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, true);
                    break;
                case 49:
                    androidx.datastore.preferences.protobuf.AbstractC1089W.m2438J(iArr[i11], (java.util.List) unsafe.getObject(obj, j4), c1072e, m2412m(i11));
                    break;
                case 50:
                    java.lang.Object object2 = unsafe.getObject(obj, j4);
                    if (object2 != null) {
                        int i15 = 2;
                        java.lang.Object obj2 = this.f4165b[(i11 / 3) * 2];
                        this.f4176m.getClass();
                        androidx.datastore.preferences.protobuf.C1073F c1073f = ((androidx.datastore.preferences.protobuf.C1074G) obj2).f4156a;
                        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
                        c1115l.getClass();
                        for (java.util.Map.Entry entry : ((androidx.datastore.preferences.protobuf.C1075H) object2).entrySet()) {
                            c1115l.m2605F0(i12, i15);
                            c1115l.m2607H0(androidx.datastore.preferences.protobuf.C1074G.m2373a(c1073f, entry.getKey(), entry.getValue()));
                            java.lang.Object key = entry.getKey();
                            java.lang.Object value = entry.getValue();
                            androidx.datastore.preferences.protobuf.C1125q.m2627b(c1115l, c1073f.f4153a, 1, key);
                            androidx.datastore.preferences.protobuf.C1125q.m2627b(c1115l, c1073f.f4154b, 2, value);
                            i15 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2358c(i12, ((java.lang.Double) androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2362g(((java.lang.Float) androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj)).floatValue(), i12);
                        break;
                    }
                    break;
                case 53:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2365j(m2382A(j4, obj), i12);
                        break;
                    }
                    break;
                case 54:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2372q(m2382A(j4, obj), i12);
                        break;
                    }
                    break;
                case 55:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2364i(i12, m2388z(j4, obj));
                        break;
                    }
                    break;
                case 56:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2361f(m2382A(j4, obj), i12);
                        break;
                    }
                    break;
                case 57:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2360e(i12, m2388z(j4, obj));
                        break;
                    }
                    break;
                case 58:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2356a(i12, ((java.lang.Boolean) androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (m2415q(i12, i11, obj)) {
                        java.lang.Object object3 = unsafe.getObject(obj, j4);
                        if (object3 instanceof java.lang.String) {
                            ((androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a).m2603D0((java.lang.String) object3, i12);
                            break;
                        } else {
                            c1072e.m2357b(i12, (androidx.datastore.preferences.protobuf.C1105g) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2366k(i12, unsafe.getObject(obj, j4), m2412m(i11));
                        break;
                    }
                    break;
                case 61:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2357b(i12, (androidx.datastore.preferences.protobuf.C1105g) unsafe.getObject(obj, j4));
                        break;
                    }
                    break;
                case 62:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2371p(i12, m2388z(j4, obj));
                        break;
                    }
                    break;
                case 63:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2359d(i12, m2388z(j4, obj));
                        break;
                    }
                    break;
                case 64:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2367l(i12, m2388z(j4, obj));
                        break;
                    }
                    break;
                case 65:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2368m(m2382A(j4, obj), i12);
                        break;
                    }
                    break;
                case 66:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2369n(i12, m2388z(j4, obj));
                        break;
                    }
                    break;
                case 67:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2370o(m2382A(j4, obj), i12);
                        break;
                    }
                    break;
                case 68:
                    if (m2415q(i12, i11, obj)) {
                        c1072e.m2363h(i12, unsafe.getObject(obj, j4), m2412m(i11));
                        break;
                    }
                    break;
            }
            i7 = i4;
            i11 += 3;
            i9 = i7;
            i10 = i5;
            i8 = 1048575;
        }
        this.f4175l.getClass();
        ((androidx.datastore.preferences.protobuf.AbstractC1132v) obj).unknownFields.m2491d(c1072e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: a */
    public final boolean mo2400a(java.lang.Object obj) {
        int i4;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f4171h) {
            int i9 = this.f4170g[i8];
            int[] iArr = this.f4164a;
            int i10 = iArr[i9];
            int m2398M = m2398M(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f4163o.getInt(obj, i12);
                }
                i5 = i7;
                i4 = i12;
            } else {
                i4 = i6;
                i5 = i7;
            }
            if ((268435456 & m2398M) != 0 && !m2414o(obj, i9, i4, i5, i13)) {
                return false;
            }
            int m2384L = m2384L(m2398M);
            if (m2384L != 9 && m2384L != 17) {
                if (m2384L != 27) {
                    if (m2384L == 60 || m2384L == 68) {
                        if (m2415q(i10, i9, obj)) {
                            if (!m2412m(i9).mo2400a(androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(m2398M & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (m2384L != 49) {
                        if (m2384L != 50) {
                            continue;
                        } else {
                            java.lang.Object m2546h = androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(m2398M & 1048575, obj);
                            this.f4176m.getClass();
                            androidx.datastore.preferences.protobuf.C1075H c1075h = (androidx.datastore.preferences.protobuf.C1075H) m2546h;
                            if (c1075h.isEmpty()) {
                                continue;
                            } else {
                                if (((androidx.datastore.preferences.protobuf.C1074G) this.f4165b[(i9 / 3) * 2]).f4156a.f4154b.f4276l != androidx.datastore.preferences.protobuf.EnumC1128r0.MESSAGE) {
                                    continue;
                                } else {
                                    androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V = null;
                                    for (java.lang.Object obj2 : c1075h.values()) {
                                        if (interfaceC1088V == null) {
                                            interfaceC1088V = androidx.datastore.preferences.protobuf.C1085S.f4182c.m2422a(obj2.getClass());
                                        }
                                        if (!interfaceC1088V.mo2400a(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                java.util.List list = (java.util.List) androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(m2398M & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    androidx.datastore.preferences.protobuf.InterfaceC1088V m2412m = m2412m(i9);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!m2412m.mo2400a(list.get(i14))) {
                            return false;
                        }
                    }
                }
            } else if (m2414o(obj, i9, i4, i5, i13)) {
                if (!m2412m(i9).mo2400a(androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(m2398M & 1048575, obj))) {
                    return false;
                }
            } else {
                continue;
            }
            i8++;
            i6 = i4;
            i7 = i5;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: b */
    public final void mo2401b(java.lang.Object obj, java.lang.Object obj2) {
        if (!m2385p(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.f4164a;
            if (i4 >= iArr.length) {
                androidx.datastore.preferences.protobuf.AbstractC1089W.m2429A(this.f4175l, obj, obj2);
                return;
            }
            int m2398M = m2398M(i4);
            long j4 = 1048575 & m2398M;
            int i5 = iArr[i4];
            switch (m2384L(m2398M)) {
                case 0:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1108h0 abstractC1108h0 = androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c;
                        abstractC1108h0.mo2505l(obj, j4, abstractC1108h0.mo2501d(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case 1:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1108h0 abstractC1108h02 = androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c;
                        abstractC1108h02.mo2506m(obj, j4, abstractC1108h02.mo2502e(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2576n(obj, j4, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2576n(obj, j4, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2575m(j4, obj, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2576n(obj, j4, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2575m(j4, obj, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1108h0 abstractC1108h03 = androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c;
                        abstractC1108h03.mo2503j(obj, j4, abstractC1108h03.mo2500c(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, j4, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case 9:
                    m2418t(i4, obj, obj2);
                    break;
                case 10:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, j4, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case 11:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2575m(j4, obj, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case 12:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2575m(j4, obj, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case 13:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2575m(j4, obj, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case 14:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2576n(obj, j4, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case 15:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2575m(j4, obj, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case 16:
                    if (!m2413n(i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2576n(obj, j4, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j4, obj2));
                        m2394H(i4, obj);
                        break;
                    }
                case 17:
                    m2418t(i4, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f4174k.getClass();
                    androidx.datastore.preferences.protobuf.AbstractC1108h0 abstractC1108h04 = androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c;
                    androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w = (androidx.datastore.preferences.protobuf.InterfaceC1133w) abstractC1108h04.m2546h(j4, obj);
                    androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w2 = (androidx.datastore.preferences.protobuf.InterfaceC1133w) abstractC1108h04.m2546h(j4, obj2);
                    androidx.datastore.preferences.protobuf.C1086T c1086t = (androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w;
                    int i6 = c1086t.f4187n;
                    int i7 = ((androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w2).f4187n;
                    if (i6 > 0 && i7 > 0) {
                        if (!((androidx.datastore.preferences.protobuf.AbstractC1095b) interfaceC1133w).f4210l) {
                            interfaceC1133w = c1086t.m2424c(i7 + i6);
                        }
                        ((androidx.datastore.preferences.protobuf.AbstractC1095b) interfaceC1133w).addAll(interfaceC1133w2);
                    }
                    if (i6 > 0) {
                        interfaceC1133w2 = interfaceC1133w;
                    }
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, j4, interfaceC1133w2);
                    break;
                case 50:
                    java.lang.Class cls = androidx.datastore.preferences.protobuf.AbstractC1089W.f4192a;
                    androidx.datastore.preferences.protobuf.AbstractC1108h0 abstractC1108h05 = androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c;
                    java.lang.Object m2546h = abstractC1108h05.m2546h(j4, obj);
                    java.lang.Object m2546h2 = abstractC1108h05.m2546h(j4, obj2);
                    this.f4176m.getClass();
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, j4, androidx.datastore.preferences.protobuf.C1076I.m2377b(m2546h, m2546h2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m2415q(i5, i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, j4, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj2));
                        m2395I(i5, i4, obj);
                        break;
                    }
                case 60:
                    m2419u(i4, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m2415q(i5, i4, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(obj, j4, androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j4, obj2));
                        m2395I(i5, i4, obj);
                        break;
                    }
                case 68:
                    m2419u(i4, obj, obj2);
                    break;
            }
            i4 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: c */
    public final void mo2402c(java.lang.Object obj, p086W.C0792l c0792l, androidx.datastore.preferences.protobuf.C1119n c1119n) {
        c1119n.getClass();
        if (m2385p(obj)) {
            m2416r(this.f4175l, obj, c0792l, c1119n);
        } else {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: d */
    public final void mo2403d(java.lang.Object obj, androidx.datastore.preferences.protobuf.C1072E c1072e) {
        c1072e.getClass();
        m2399N(obj, c1072e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo2404e(androidx.datastore.preferences.protobuf.AbstractC1132v r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1080M.mo2404e(androidx.datastore.preferences.protobuf.v):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0050. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: f */
    public final int mo2405f(androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v) {
        int i4;
        int i5;
        int i6;
        int m2581X;
        int m2580W;
        int m2457i;
        int m2595l0;
        int m2597n0;
        sun.misc.Unsafe unsafe = f4163o;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f4164a;
            if (i10 >= iArr.length) {
                this.f4175l.getClass();
                return abstractC1132v.unknownFields.m2489b() + i11;
            }
            int m2398M = m2398M(i10);
            int m2384L = m2384L(m2398M);
            int i12 = iArr[i10];
            int i13 = iArr[i10 + 2];
            int i14 = i13 & i7;
            if (m2384L <= 17) {
                if (i14 != i8) {
                    i9 = i14 == i7 ? 0 : unsafe.getInt(abstractC1132v, i14);
                    i8 = i14;
                }
                i4 = i8;
                i5 = i9;
                i6 = 1 << (i13 >>> 20);
            } else {
                i4 = i8;
                i5 = i9;
                i6 = 0;
            }
            long j4 = m2398M & i7;
            if (m2384L >= androidx.datastore.preferences.protobuf.EnumC1127r.f4278m.m2629a()) {
                androidx.datastore.preferences.protobuf.EnumC1127r.f4279n.m2629a();
            }
            switch (m2384L) {
                case 0:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2581X(i12);
                        i11 += m2581X;
                        break;
                    }
                case 1:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2585b0(i12);
                        i11 += m2581X;
                        break;
                    }
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2588e0(unsafe.getLong(abstractC1132v, j4), i12);
                        i11 += m2581X;
                        break;
                    }
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2598o0(unsafe.getLong(abstractC1132v, j4), i12);
                        i11 += m2581X;
                        break;
                    }
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2587d0(i12, unsafe.getInt(abstractC1132v, j4));
                        i11 += m2581X;
                        break;
                    }
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2584a0(i12);
                        i11 += m2581X;
                        break;
                    }
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2583Z(i12);
                        i11 += m2581X;
                        break;
                    }
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2579V(i12);
                        i11 += m2581X;
                        break;
                    }
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        java.lang.Object object = unsafe.getObject(abstractC1132v, j4);
                        m2580W = object instanceof androidx.datastore.preferences.protobuf.C1105g ? androidx.datastore.preferences.protobuf.C1115l.m2580W(i12, (androidx.datastore.preferences.protobuf.C1105g) object) : androidx.datastore.preferences.protobuf.C1115l.m2593j0((java.lang.String) object, i12);
                        i11 = m2580W + i11;
                        break;
                    }
                case 9:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2463o(i12, unsafe.getObject(abstractC1132v, j4), m2412m(i10));
                        i11 += m2581X;
                        break;
                    }
                case 10:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2580W(i12, (androidx.datastore.preferences.protobuf.C1105g) unsafe.getObject(abstractC1132v, j4));
                        i11 += m2581X;
                        break;
                    }
                case 11:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2596m0(i12, unsafe.getInt(abstractC1132v, j4));
                        i11 += m2581X;
                        break;
                    }
                case 12:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2582Y(i12, unsafe.getInt(abstractC1132v, j4));
                        i11 += m2581X;
                        break;
                    }
                case 13:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2589f0(i12);
                        i11 += m2581X;
                        break;
                    }
                case 14:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2590g0(i12);
                        i11 += m2581X;
                        break;
                    }
                case 15:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2591h0(i12, unsafe.getInt(abstractC1132v, j4));
                        i11 += m2581X;
                        break;
                    }
                case 16:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2592i0(unsafe.getLong(abstractC1132v, j4), i12);
                        i11 += m2581X;
                        break;
                    }
                case 17:
                    if (!m2414o(abstractC1132v, i10, i4, i5, i6)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2586c0(i12, (androidx.datastore.preferences.protobuf.AbstractC1093a) unsafe.getObject(abstractC1132v, j4), m2412m(i10));
                        i11 += m2581X;
                        break;
                    }
                case 18:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2456h(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 19:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2454f(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 20:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2461m(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 21:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2472x(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 22:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2459k(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 23:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2456h(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 24:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2454f(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 25:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2449a(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 26:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2469u(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 27:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2464p(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4), m2412m(i10));
                    i11 += m2581X;
                    break;
                case 28:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2451c(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 29:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2470v(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 30:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2452d(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 31:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2454f(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 32:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2456h(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 33:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2465q(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 34:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2467s(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4));
                    i11 += m2581X;
                    break;
                case 35:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2457i((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 36:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2455g((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 37:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2462n((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 38:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2473y((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 39:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2460l((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 40:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2457i((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 41:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2455g((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 42:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2450b((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 43:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2471w((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 44:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2453e((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 45:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2455g((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 46:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2457i((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 47:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2466r((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 48:
                    m2457i = androidx.datastore.preferences.protobuf.AbstractC1089W.m2468t((java.util.List) unsafe.getObject(abstractC1132v, j4));
                    if (m2457i <= 0) {
                        break;
                    } else {
                        m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i12);
                        m2597n0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2457i);
                        i11 += m2597n0 + m2595l0 + m2457i;
                        break;
                    }
                case 49:
                    m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2458j(i12, (java.util.List) unsafe.getObject(abstractC1132v, j4), m2412m(i10));
                    i11 += m2581X;
                    break;
                case 50:
                    java.lang.Object object2 = unsafe.getObject(abstractC1132v, j4);
                    java.lang.Object obj = this.f4165b[(i10 / 3) * 2];
                    this.f4176m.getClass();
                    m2581X = androidx.datastore.preferences.protobuf.C1076I.m2376a(i12, object2, obj);
                    i11 += m2581X;
                    break;
                case 51:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2581X(i12);
                        i11 += m2581X;
                        break;
                    }
                case 52:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2585b0(i12);
                        i11 += m2581X;
                        break;
                    }
                case 53:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2588e0(m2382A(j4, abstractC1132v), i12);
                        i11 += m2581X;
                        break;
                    }
                case 54:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2598o0(m2382A(j4, abstractC1132v), i12);
                        i11 += m2581X;
                        break;
                    }
                case 55:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2587d0(i12, m2388z(j4, abstractC1132v));
                        i11 += m2581X;
                        break;
                    }
                case 56:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2584a0(i12);
                        i11 += m2581X;
                        break;
                    }
                case 57:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2583Z(i12);
                        i11 += m2581X;
                        break;
                    }
                case 58:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2579V(i12);
                        i11 += m2581X;
                        break;
                    }
                case 59:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        java.lang.Object object3 = unsafe.getObject(abstractC1132v, j4);
                        m2580W = object3 instanceof androidx.datastore.preferences.protobuf.C1105g ? androidx.datastore.preferences.protobuf.C1115l.m2580W(i12, (androidx.datastore.preferences.protobuf.C1105g) object3) : androidx.datastore.preferences.protobuf.C1115l.m2593j0((java.lang.String) object3, i12);
                        i11 = m2580W + i11;
                        break;
                    }
                case 60:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.AbstractC1089W.m2463o(i12, unsafe.getObject(abstractC1132v, j4), m2412m(i10));
                        i11 += m2581X;
                        break;
                    }
                case 61:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2580W(i12, (androidx.datastore.preferences.protobuf.C1105g) unsafe.getObject(abstractC1132v, j4));
                        i11 += m2581X;
                        break;
                    }
                case 62:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2596m0(i12, m2388z(j4, abstractC1132v));
                        i11 += m2581X;
                        break;
                    }
                case 63:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2582Y(i12, m2388z(j4, abstractC1132v));
                        i11 += m2581X;
                        break;
                    }
                case 64:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2589f0(i12);
                        i11 += m2581X;
                        break;
                    }
                case 65:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2590g0(i12);
                        i11 += m2581X;
                        break;
                    }
                case 66:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2591h0(i12, m2388z(j4, abstractC1132v));
                        i11 += m2581X;
                        break;
                    }
                case 67:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2592i0(m2382A(j4, abstractC1132v), i12);
                        i11 += m2581X;
                        break;
                    }
                case 68:
                    if (!m2415q(i12, i10, abstractC1132v)) {
                        break;
                    } else {
                        m2581X = androidx.datastore.preferences.protobuf.C1115l.m2586c0(i12, (androidx.datastore.preferences.protobuf.AbstractC1093a) unsafe.getObject(abstractC1132v, j4), m2412m(i10));
                        i11 += m2581X;
                        break;
                    }
            }
            i10 += 3;
            i8 = i4;
            i9 = i5;
            i7 = 1048575;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: g */
    public final androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g() {
        this.f4173j.getClass();
        return ((androidx.datastore.preferences.protobuf.AbstractC1132v) this.f4168e).m2641k();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: h */
    public final void mo2407h(java.lang.Object obj) {
        if (m2385p(obj)) {
            if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC1132v) {
                androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v = (androidx.datastore.preferences.protobuf.AbstractC1132v) obj;
                abstractC1132v.m2638d();
                abstractC1132v.m2637c();
                abstractC1132v.m2640j();
            }
            int[] iArr = this.f4164a;
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int m2398M = m2398M(i4);
                long j4 = 1048575 & m2398M;
                int m2384L = m2384L(m2398M);
                if (m2384L != 9) {
                    if (m2384L != 60 && m2384L != 68) {
                        switch (m2384L) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f4174k.getClass();
                                androidx.datastore.preferences.protobuf.C1069B.m2352a(j4, obj);
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = f4163o;
                                java.lang.Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    this.f4176m.getClass();
                                    androidx.datastore.preferences.protobuf.C1076I.m2378c(object);
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (m2415q(iArr[i4], i4, obj)) {
                        m2412m(i4).mo2407h(f4163o.getObject(obj, j4));
                    }
                }
                if (m2413n(i4, obj)) {
                    m2412m(i4).mo2407h(f4163o.getObject(obj, j4));
                }
            }
            this.f4175l.getClass();
            androidx.datastore.preferences.protobuf.C1100d0.m2493b(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC1089W.m2430B(r5.m2546h(r7, r12), r5.m2546h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.m2545g(r7, r12) == r5.m2545g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.m2544f(r7, r12) == r5.m2544f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.m2545g(r7, r12) == r5.m2545g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.m2544f(r7, r12) == r5.m2544f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.m2544f(r7, r12) == r5.m2544f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.m2544f(r7, r12) == r5.m2544f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC1089W.m2430B(r5.m2546h(r7, r12), r5.m2546h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC1089W.m2430B(r5.m2546h(r7, r12), r5.m2546h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC1089W.m2430B(r5.m2546h(r7, r12), r5.m2546h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.mo2500c(r7, r12) == r5.mo2500c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.m2544f(r7, r12) == r5.m2544f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.m2545g(r7, r12) == r5.m2545g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.m2544f(r7, r12) == r5.m2544f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.m2545g(r7, r12) == r5.m2545g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.m2545g(r7, r12) == r5.m2545g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.mo2502e(r7, r12)) == java.lang.Float.floatToIntBits(r5.mo2502e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.mo2501d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.mo2501d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC1089W.m2430B(r9.m2546h(r7, r12), r9.m2546h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1 A[LOOP:0: B:2:0x0005->B:86:0x01f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1088V
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo2408i(androidx.datastore.preferences.protobuf.AbstractC1132v r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1080M.mo2408i(androidx.datastore.preferences.protobuf.v, java.lang.Object):boolean");
    }

    /* renamed from: j */
    public final boolean m2409j(androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v, java.lang.Object obj, int i4) {
        return m2413n(i4, abstractC1132v) == m2413n(i4, obj);
    }

    /* renamed from: k */
    public final void m2410k(int i4, java.lang.Object obj, java.lang.Object obj2) {
        int i5 = this.f4164a[i4];
        if (androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(m2398M(i4) & 1048575, obj) == null) {
            return;
        }
        m2411l(i4);
    }

    /* renamed from: l */
    public final void m2411l(int i4) {
        if (this.f4165b[((i4 / 3) * 2) + 1] != null) {
            throw new java.lang.ClassCastException();
        }
    }

    /* renamed from: m */
    public final androidx.datastore.preferences.protobuf.InterfaceC1088V m2412m(int i4) {
        int i5 = (i4 / 3) * 2;
        java.lang.Object[] objArr = this.f4165b;
        androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V = (androidx.datastore.preferences.protobuf.InterfaceC1088V) objArr[i5];
        if (interfaceC1088V != null) {
            return interfaceC1088V;
        }
        androidx.datastore.preferences.protobuf.InterfaceC1088V m2422a = androidx.datastore.preferences.protobuf.C1085S.f4182c.m2422a((java.lang.Class) objArr[i5 + 1]);
        objArr[i5] = m2422a;
        return m2422a;
    }

    /* renamed from: n */
    public final boolean m2413n(int i4, java.lang.Object obj) {
        int i5 = this.f4164a[i4 + 2];
        long j4 = i5 & 1048575;
        if (j4 != 1048575) {
            return ((1 << (i5 >>> 20)) & androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j4, obj)) != 0;
        }
        int m2398M = m2398M(i4);
        long j5 = m2398M & 1048575;
        switch (m2384L(m2398M)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.mo2501d(j5, obj)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.mo2502e(j5, obj)) != 0;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j5, obj) != 0;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j5, obj) != 0;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j5, obj) != 0;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j5, obj) != 0;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j5, obj) != 0;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.mo2500c(j5, obj);
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object m2546h = androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j5, obj);
                if (m2546h instanceof java.lang.String) {
                    return !((java.lang.String) m2546h).isEmpty();
                }
                if (m2546h instanceof androidx.datastore.preferences.protobuf.C1105g) {
                    return !androidx.datastore.preferences.protobuf.C1105g.f4226n.equals(m2546h);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j5, obj) != null;
            case 10:
                return !androidx.datastore.preferences.protobuf.C1105g.f4226n.equals(androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j5, obj));
            case 11:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j5, obj) != 0;
            case 12:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j5, obj) != 0;
            case 13:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j5, obj) != 0;
            case 14:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j5, obj) != 0;
            case 15:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f(j5, obj) != 0;
            case 16:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2545g(j5, obj) != 0;
            case 17:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2546h(j5, obj) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    /* renamed from: o */
    public final boolean m2414o(java.lang.Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? m2413n(i4, obj) : (i6 & i7) != 0;
    }

    /* renamed from: q */
    public final boolean m2415q(int i4, int i5, java.lang.Object obj) {
        return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c.m2544f((long) (this.f4164a[i5 + 2] & 1048575), obj) == i4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x006d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x064b A[Catch: all -> 0x025f, TryCatch #5 {all -> 0x025f, blocks: (B:54:0x0646, B:56:0x064b, B:57:0x0650, B:50:0x025a, B:78:0x0262, B:79:0x0275, B:80:0x0288, B:81:0x029b, B:82:0x02ae, B:83:0x02c7, B:84:0x02da, B:85:0x02ed, B:86:0x0300, B:87:0x0313, B:88:0x0326, B:89:0x0339, B:90:0x034c, B:91:0x035f, B:92:0x0372, B:93:0x0385, B:94:0x0398, B:95:0x03ab, B:96:0x03be, B:97:0x03d7, B:98:0x03ea, B:99:0x03fd, B:100:0x0411, B:101:0x0419, B:102:0x042c, B:103:0x043f, B:104:0x0452, B:105:0x0465, B:106:0x0478, B:107:0x048b, B:108:0x049e, B:109:0x04b1, B:110:0x04ca, B:111:0x04e0, B:112:0x04f6, B:113:0x050d, B:114:0x0524, B:115:0x053d, B:116:0x0553, B:117:0x0566, B:118:0x057f, B:119:0x058a, B:120:0x05a2, B:121:0x05b9, B:122:0x05d0, B:123:0x05e6, B:124:0x05fc, B:125:0x0611, B:126:0x0629), top: B:53:0x0646 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0656 A[SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2416r(androidx.datastore.preferences.protobuf.C1100d0 r20, java.lang.Object r21, p086W.C0792l r22, androidx.datastore.preferences.protobuf.C1119n r23) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1080M.m2416r(androidx.datastore.preferences.protobuf.d0, java.lang.Object, W.l, androidx.datastore.preferences.protobuf.n):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.mo2520d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2417s(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C1119n r12, p086W.C0792l r13) {
        /*
            r8 = this;
            int r10 = r8.m2398M(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.h0 r10 = androidx.datastore.preferences.protobuf.AbstractC1110i0.f4248c
            java.lang.Object r10 = r10.m2546h(r0, r9)
            androidx.datastore.preferences.protobuf.I r2 = r8.f4176m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.H r10 = androidx.datastore.preferences.protobuf.C1075H.f4157m
            androidx.datastore.preferences.protobuf.H r10 = r10.m2375b()
            androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.H r3 = (androidx.datastore.preferences.protobuf.C1075H) r3
            boolean r3 = r3.f4158l
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.H r3 = androidx.datastore.preferences.protobuf.C1075H.f4157m
            androidx.datastore.preferences.protobuf.H r3 = r3.m2375b()
            androidx.datastore.preferences.protobuf.C1076I.m2377b(r3, r10)
            androidx.datastore.preferences.protobuf.AbstractC1110i0.m2577o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.H r10 = (androidx.datastore.preferences.protobuf.C1075H) r10
            androidx.datastore.preferences.protobuf.G r11 = (androidx.datastore.preferences.protobuf.C1074G) r11
            androidx.datastore.preferences.protobuf.F r9 = r11.f4156a
            r11 = 2
            r13.m1449B(r11)
            java.lang.Object r0 = r13.f2768d
            androidx.datastore.preferences.protobuf.j r0 = (androidx.datastore.preferences.protobuf.AbstractC1111j) r0
            int r1 = r0.mo2538v()
            int r1 = r0.mo2521e(r1)
            java.lang.String r2 = ""
            L.k r3 = r9.f4155c
            r4 = r3
        L55:
            int r5 = r13.m1452b()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.mo2519c()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.m1450C()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1135y -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.z r5 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1135y -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1135y -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1135y -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.o0 r5 = r9.f4154b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1135y -> L8e
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1135y -> L8e
            java.lang.Object r4 = r13.m1461m(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1135y -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.m0 r5 = r9.f4153a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1135y -> L8e
            r6 = 0
            java.lang.Object r2 = r13.m1461m(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1135y -> L8e
            goto L55
        L8e:
            boolean r5 = r13.m1450C()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.z r9 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            r0.mo2520d(r1)
            return
        La2:
            r0.mo2520d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1080M.m2417s(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.n, W.l):void");
    }

    /* renamed from: t */
    public final void m2418t(int i4, java.lang.Object obj, java.lang.Object obj2) {
        if (m2413n(i4, obj2)) {
            long m2398M = m2398M(i4) & 1048575;
            sun.misc.Unsafe unsafe = f4163o;
            java.lang.Object object = unsafe.getObject(obj2, m2398M);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.f4164a[i4] + " is present but null: " + obj2);
            }
            androidx.datastore.preferences.protobuf.InterfaceC1088V m2412m = m2412m(i4);
            if (!m2413n(i4, obj)) {
                if (m2385p(object)) {
                    androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g = m2412m.mo2406g();
                    m2412m.mo2401b(mo2406g, object);
                    unsafe.putObject(obj, m2398M, mo2406g);
                } else {
                    unsafe.putObject(obj, m2398M, object);
                }
                m2394H(i4, obj);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, m2398M);
            if (!m2385p(object2)) {
                androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g2 = m2412m.mo2406g();
                m2412m.mo2401b(mo2406g2, object2);
                unsafe.putObject(obj, m2398M, mo2406g2);
                object2 = mo2406g2;
            }
            m2412m.mo2401b(object2, object);
        }
    }

    /* renamed from: u */
    public final void m2419u(int i4, java.lang.Object obj, java.lang.Object obj2) {
        int[] iArr = this.f4164a;
        int i5 = iArr[i4];
        if (m2415q(i5, i4, obj2)) {
            long m2398M = m2398M(i4) & 1048575;
            sun.misc.Unsafe unsafe = f4163o;
            java.lang.Object object = unsafe.getObject(obj2, m2398M);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2);
            }
            androidx.datastore.preferences.protobuf.InterfaceC1088V m2412m = m2412m(i4);
            if (!m2415q(i5, i4, obj)) {
                if (m2385p(object)) {
                    androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g = m2412m.mo2406g();
                    m2412m.mo2401b(mo2406g, object);
                    unsafe.putObject(obj, m2398M, mo2406g);
                } else {
                    unsafe.putObject(obj, m2398M, object);
                }
                m2395I(i5, i4, obj);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, m2398M);
            if (!m2385p(object2)) {
                androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g2 = m2412m.mo2406g();
                m2412m.mo2401b(mo2406g2, object2);
                unsafe.putObject(obj, m2398M, mo2406g2);
                object2 = mo2406g2;
            }
            m2412m.mo2401b(object2, object);
        }
    }

    /* renamed from: v */
    public final java.lang.Object m2420v(int i4, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.InterfaceC1088V m2412m = m2412m(i4);
        long m2398M = m2398M(i4) & 1048575;
        if (!m2413n(i4, obj)) {
            return m2412m.mo2406g();
        }
        java.lang.Object object = f4163o.getObject(obj, m2398M);
        if (m2385p(object)) {
            return object;
        }
        androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g = m2412m.mo2406g();
        if (object != null) {
            m2412m.mo2401b(mo2406g, object);
        }
        return mo2406g;
    }

    /* renamed from: w */
    public final java.lang.Object m2421w(int i4, int i5, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.InterfaceC1088V m2412m = m2412m(i5);
        if (!m2415q(i4, i5, obj)) {
            return m2412m.mo2406g();
        }
        java.lang.Object object = f4163o.getObject(obj, m2398M(i5) & 1048575);
        if (m2385p(object)) {
            return object;
        }
        androidx.datastore.preferences.protobuf.AbstractC1132v mo2406g = m2412m.mo2406g();
        if (object != null) {
            m2412m.mo2401b(mo2406g, object);
        }
        return mo2406g;
    }
}
