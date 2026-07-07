package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class M implements V {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f4014n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f4015o = i0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4016a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4019d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0149a f4020e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4021f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4022g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4023h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4024i;

    /* renamed from: j, reason: collision with root package name */
    public final O f4025j;

    /* renamed from: k, reason: collision with root package name */
    public final B f4026k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f4027l;

    /* renamed from: m, reason: collision with root package name */
    public final I f4028m;

    public M(int[] iArr, Object[] objArr, int i4, int i5, AbstractC0149a abstractC0149a, int[] iArr2, int i6, int i7, O o2, B b4, d0 d0Var, C0163o c0163o, I i8) {
        this.f4016a = iArr;
        this.f4017b = objArr;
        this.f4018c = i4;
        this.f4019d = i5;
        this.f4021f = abstractC0149a instanceof AbstractC0169v;
        this.f4022g = iArr2;
        this.f4023h = i6;
        this.f4024i = i7;
        this.f4025j = o2;
        this.f4026k = b4;
        this.f4027l = d0Var;
        this.f4020e = abstractC0149a;
        this.f4028m = i8;
    }

    public static long A(long j4, Object obj) {
        return ((Long) i0.f4100c.h(j4, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int L(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0169v) {
            return ((AbstractC0169v) obj).i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.M x(androidx.datastore.preferences.protobuf.U r33, androidx.datastore.preferences.protobuf.O r34, androidx.datastore.preferences.protobuf.B r35, androidx.datastore.preferences.protobuf.d0 r36, androidx.datastore.preferences.protobuf.C0163o r37, androidx.datastore.preferences.protobuf.I r38) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.x(androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.O, androidx.datastore.preferences.protobuf.B, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.I):androidx.datastore.preferences.protobuf.M");
    }

    public static long y(int i4) {
        return i4 & 1048575;
    }

    public static int z(long j4, Object obj) {
        return ((Integer) i0.f4100c.h(j4, obj)).intValue();
    }

    public final int B(int i4) {
        if (i4 < this.f4018c || i4 > this.f4019d) {
            return -1;
        }
        int[] iArr = this.f4016a;
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

    public final void C(Object obj, long j4, W.l lVar, V v4, C0162n c0162n) {
        int u4;
        this.f4026k.getClass();
        InterfaceC0170w b4 = B.b(j4, obj);
        int i4 = lVar.f2673a;
        if ((i4 & 7) != 3) {
            throw C0173z.b();
        }
        do {
            AbstractC0169v g4 = v4.g();
            lVar.d(g4, v4, c0162n);
            v4.h(g4);
            ((T) b4).add(g4);
            AbstractC0158j abstractC0158j = (AbstractC0158j) lVar.f2676d;
            if (abstractC0158j.c() || lVar.f2675c != 0) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == i4);
        lVar.f2675c = u4;
    }

    public final void D(Object obj, int i4, W.l lVar, V v4, C0162n c0162n) {
        int u4;
        this.f4026k.getClass();
        InterfaceC0170w b4 = B.b(i4 & 1048575, obj);
        int i5 = lVar.f2673a;
        if ((i5 & 7) != 2) {
            throw C0173z.b();
        }
        do {
            AbstractC0169v g4 = v4.g();
            lVar.e(g4, v4, c0162n);
            v4.h(g4);
            ((T) b4).add(g4);
            AbstractC0158j abstractC0158j = (AbstractC0158j) lVar.f2676d;
            if (abstractC0158j.c() || lVar.f2675c != 0) {
                return;
            } else {
                u4 = abstractC0158j.u();
            }
        } while (u4 == i5);
        lVar.f2675c = u4;
    }

    public final void E(int i4, W.l lVar, Object obj) {
        if ((536870912 & i4) != 0) {
            lVar.B(2);
            i0.o(obj, i4 & 1048575, ((AbstractC0158j) lVar.f2676d).t());
        } else if (!this.f4021f) {
            i0.o(obj, i4 & 1048575, lVar.i());
        } else {
            lVar.B(2);
            i0.o(obj, i4 & 1048575, ((AbstractC0158j) lVar.f2676d).s());
        }
    }

    public final void F(int i4, W.l lVar, Object obj) {
        boolean z4 = (536870912 & i4) != 0;
        B b4 = this.f4026k;
        if (z4) {
            b4.getClass();
            lVar.w(B.b(i4 & 1048575, obj), true);
        } else {
            b4.getClass();
            lVar.w(B.b(i4 & 1048575, obj), false);
        }
    }

    public final void H(int i4, Object obj) {
        int i5 = this.f4016a[i4 + 2];
        long j4 = 1048575 & i5;
        if (j4 == 1048575) {
            return;
        }
        i0.m(j4, obj, (1 << (i5 >>> 20)) | i0.f4100c.f(j4, obj));
    }

    public final void I(int i4, int i5, Object obj) {
        i0.m(this.f4016a[i5 + 2] & 1048575, obj, i4);
    }

    public final void J(Object obj, int i4, AbstractC0149a abstractC0149a) {
        f4015o.putObject(obj, M(i4) & 1048575, abstractC0149a);
        H(i4, obj);
    }

    public final void K(Object obj, int i4, int i5, AbstractC0149a abstractC0149a) {
        f4015o.putObject(obj, M(i5) & 1048575, abstractC0149a);
        I(i4, i5, obj);
    }

    public final int M(int i4) {
        return this.f4016a[i4 + 1];
    }

    public final void N(Object obj, E e4) {
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr = this.f4016a;
        int length = iArr.length;
        Unsafe unsafe = f4015o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int M3 = M(i11);
            int i12 = iArr[i11];
            int L3 = L(M3);
            if (L3 <= 17) {
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
            long j4 = M3 & i8;
            switch (L3) {
                case 0:
                    i7 = i4;
                    if (!o(obj, i11, i7, i5, i6)) {
                        break;
                    } else {
                        e4.c(i12, i0.f4100c.d(j4, obj));
                        continue;
                    }
                case 1:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.g(i0.f4100c.e(j4, obj), i12);
                        break;
                    } else {
                        continue;
                    }
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.j(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.q(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.i(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.f(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.e(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.a(i12, i0.f4100c.c(j4, obj));
                        break;
                    } else {
                        continue;
                    }
                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof String) {
                            ((C0160l) e4.f4004a).D0((String) object, i12);
                            break;
                        } else {
                            e4.b(i12, (C0155g) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.k(i12, unsafe.getObject(obj, j4), m(i11));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.b(i12, (C0155g) unsafe.getObject(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.p(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.d(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.l(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.m(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.n(i12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i7 = i4;
                    if (o(obj, i11, i7, i5, i6)) {
                        e4.o(unsafe.getLong(obj, j4), i12);
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i7 = i4;
                    if (o(obj, i11, i4, i5, i6)) {
                        e4.h(i12, unsafe.getObject(obj, j4), m(i11));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    W.E(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 19:
                    W.I(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 20:
                    W.L(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 21:
                    W.T(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 22:
                    W.K(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 23:
                    W.H(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 24:
                    W.G(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 25:
                    W.C(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 26:
                    W.R(iArr[i11], (List) unsafe.getObject(obj, j4), e4);
                    break;
                case 27:
                    W.M(iArr[i11], (List) unsafe.getObject(obj, j4), e4, m(i11));
                    break;
                case 28:
                    W.D(iArr[i11], (List) unsafe.getObject(obj, j4), e4);
                    break;
                case 29:
                    W.S(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 30:
                    W.F(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 31:
                    W.N(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 32:
                    W.O(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 33:
                    W.P(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 34:
                    W.Q(iArr[i11], (List) unsafe.getObject(obj, j4), e4, false);
                    break;
                case 35:
                    W.E(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 36:
                    W.I(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 37:
                    W.L(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 38:
                    W.T(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 39:
                    W.K(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 40:
                    W.H(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 41:
                    W.G(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 42:
                    W.C(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 43:
                    W.S(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 44:
                    W.F(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 45:
                    W.N(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 46:
                    W.O(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 47:
                    W.P(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 48:
                    W.Q(iArr[i11], (List) unsafe.getObject(obj, j4), e4, true);
                    break;
                case 49:
                    W.J(iArr[i11], (List) unsafe.getObject(obj, j4), e4, m(i11));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j4);
                    if (object2 != null) {
                        int i15 = 2;
                        Object obj2 = this.f4017b[(i11 / 3) * 2];
                        this.f4028m.getClass();
                        F f4 = ((G) obj2).f4008a;
                        C0160l c0160l = (C0160l) e4.f4004a;
                        c0160l.getClass();
                        for (Map.Entry entry : ((H) object2).entrySet()) {
                            c0160l.F0(i12, i15);
                            c0160l.H0(G.a(f4, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0165q.b(c0160l, f4.f4005a, 1, key);
                            C0165q.b(c0160l, f4.f4006b, 2, value);
                            i15 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (q(i12, i11, obj)) {
                        e4.c(i12, ((Double) i0.f4100c.h(j4, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(i12, i11, obj)) {
                        e4.g(((Float) i0.f4100c.h(j4, obj)).floatValue(), i12);
                        break;
                    }
                    break;
                case 53:
                    if (q(i12, i11, obj)) {
                        e4.j(A(j4, obj), i12);
                        break;
                    }
                    break;
                case 54:
                    if (q(i12, i11, obj)) {
                        e4.q(A(j4, obj), i12);
                        break;
                    }
                    break;
                case 55:
                    if (q(i12, i11, obj)) {
                        e4.i(i12, z(j4, obj));
                        break;
                    }
                    break;
                case 56:
                    if (q(i12, i11, obj)) {
                        e4.f(A(j4, obj), i12);
                        break;
                    }
                    break;
                case 57:
                    if (q(i12, i11, obj)) {
                        e4.e(i12, z(j4, obj));
                        break;
                    }
                    break;
                case 58:
                    if (q(i12, i11, obj)) {
                        e4.a(i12, ((Boolean) i0.f4100c.h(j4, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(i12, i11, obj)) {
                        Object object3 = unsafe.getObject(obj, j4);
                        if (object3 instanceof String) {
                            ((C0160l) e4.f4004a).D0((String) object3, i12);
                            break;
                        } else {
                            e4.b(i12, (C0155g) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (q(i12, i11, obj)) {
                        e4.k(i12, unsafe.getObject(obj, j4), m(i11));
                        break;
                    }
                    break;
                case 61:
                    if (q(i12, i11, obj)) {
                        e4.b(i12, (C0155g) unsafe.getObject(obj, j4));
                        break;
                    }
                    break;
                case 62:
                    if (q(i12, i11, obj)) {
                        e4.p(i12, z(j4, obj));
                        break;
                    }
                    break;
                case 63:
                    if (q(i12, i11, obj)) {
                        e4.d(i12, z(j4, obj));
                        break;
                    }
                    break;
                case 64:
                    if (q(i12, i11, obj)) {
                        e4.l(i12, z(j4, obj));
                        break;
                    }
                    break;
                case 65:
                    if (q(i12, i11, obj)) {
                        e4.m(A(j4, obj), i12);
                        break;
                    }
                    break;
                case 66:
                    if (q(i12, i11, obj)) {
                        e4.n(i12, z(j4, obj));
                        break;
                    }
                    break;
                case 67:
                    if (q(i12, i11, obj)) {
                        e4.o(A(j4, obj), i12);
                        break;
                    }
                    break;
                case 68:
                    if (q(i12, i11, obj)) {
                        e4.h(i12, unsafe.getObject(obj, j4), m(i11));
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
        this.f4027l.getClass();
        ((AbstractC0169v) obj).unknownFields.d(e4);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean a(Object obj) {
        int i4;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f4023h) {
            int i9 = this.f4022g[i8];
            int[] iArr = this.f4016a;
            int i10 = iArr[i9];
            int M3 = M(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f4015o.getInt(obj, i12);
                }
                i5 = i7;
                i4 = i12;
            } else {
                i4 = i6;
                i5 = i7;
            }
            if ((268435456 & M3) != 0 && !o(obj, i9, i4, i5, i13)) {
                return false;
            }
            int L3 = L(M3);
            if (L3 != 9 && L3 != 17) {
                if (L3 != 27) {
                    if (L3 == 60 || L3 == 68) {
                        if (q(i10, i9, obj)) {
                            if (!m(i9).a(i0.f4100c.h(M3 & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (L3 != 49) {
                        if (L3 != 50) {
                            continue;
                        } else {
                            Object h4 = i0.f4100c.h(M3 & 1048575, obj);
                            this.f4028m.getClass();
                            H h5 = (H) h4;
                            if (h5.isEmpty()) {
                                continue;
                            } else {
                                if (((G) this.f4017b[(i9 / 3) * 2]).f4008a.f4006b.f4128l != r0.MESSAGE) {
                                    continue;
                                } else {
                                    V v4 = null;
                                    for (Object obj2 : h5.values()) {
                                        if (v4 == null) {
                                            v4 = S.f4034c.a(obj2.getClass());
                                        }
                                        if (!v4.a(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) i0.f4100c.h(M3 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    V m4 = m(i9);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!m4.a(list.get(i14))) {
                            return false;
                        }
                    }
                }
            } else if (o(obj, i9, i4, i5, i13)) {
                if (!m(i9).a(i0.f4100c.h(M3 & 1048575, obj))) {
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

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, Object obj2) {
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.f4016a;
            if (i4 >= iArr.length) {
                W.A(this.f4027l, obj, obj2);
                return;
            }
            int M3 = M(i4);
            long j4 = 1048575 & M3;
            int i5 = iArr[i4];
            switch (L(M3)) {
                case 0:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        h0 h0Var = i0.f4100c;
                        h0Var.l(obj, j4, h0Var.d(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case 1:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        h0 h0Var2 = i0.f4100c;
                        h0Var2.m(obj, j4, h0Var2.e(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j4, i0.f4100c.g(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j4, i0.f4100c.g(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.m(j4, obj, i0.f4100c.f(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j4, i0.f4100c.g(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.m(j4, obj, i0.f4100c.f(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        h0 h0Var3 = i0.f4100c;
                        h0Var3.j(obj, j4, h0Var3.c(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.o(obj, j4, i0.f4100c.h(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case 9:
                    t(i4, obj, obj2);
                    break;
                case 10:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.o(obj, j4, i0.f4100c.h(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case 11:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.m(j4, obj, i0.f4100c.f(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case 12:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.m(j4, obj, i0.f4100c.f(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case 13:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.m(j4, obj, i0.f4100c.f(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case 14:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j4, i0.f4100c.g(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case 15:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.m(j4, obj, i0.f4100c.f(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case 16:
                    if (!n(i4, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j4, i0.f4100c.g(j4, obj2));
                        H(i4, obj);
                        break;
                    }
                case 17:
                    t(i4, obj, obj2);
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
                    this.f4026k.getClass();
                    h0 h0Var4 = i0.f4100c;
                    InterfaceC0170w interfaceC0170w = (InterfaceC0170w) h0Var4.h(j4, obj);
                    InterfaceC0170w interfaceC0170w2 = (InterfaceC0170w) h0Var4.h(j4, obj2);
                    T t4 = (T) interfaceC0170w;
                    int i6 = t4.f4039n;
                    int i7 = ((T) interfaceC0170w2).f4039n;
                    if (i6 > 0 && i7 > 0) {
                        if (!((AbstractC0150b) interfaceC0170w).f4062l) {
                            interfaceC0170w = t4.c(i7 + i6);
                        }
                        ((AbstractC0150b) interfaceC0170w).addAll(interfaceC0170w2);
                    }
                    if (i6 > 0) {
                        interfaceC0170w2 = interfaceC0170w;
                    }
                    i0.o(obj, j4, interfaceC0170w2);
                    break;
                case 50:
                    Class cls = W.f4044a;
                    h0 h0Var5 = i0.f4100c;
                    Object h4 = h0Var5.h(j4, obj);
                    Object h5 = h0Var5.h(j4, obj2);
                    this.f4028m.getClass();
                    i0.o(obj, j4, I.b(h4, h5));
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
                    if (!q(i5, i4, obj2)) {
                        break;
                    } else {
                        i0.o(obj, j4, i0.f4100c.h(j4, obj2));
                        I(i5, i4, obj);
                        break;
                    }
                case 60:
                    u(i4, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!q(i5, i4, obj2)) {
                        break;
                    } else {
                        i0.o(obj, j4, i0.f4100c.h(j4, obj2));
                        I(i5, i4, obj);
                        break;
                    }
                case 68:
                    u(i4, obj, obj2);
                    break;
            }
            i4 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void c(Object obj, W.l lVar, C0162n c0162n) {
        c0162n.getClass();
        if (p(obj)) {
            r(this.f4027l, obj, lVar, c0162n);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj, E e4) {
        e4.getClass();
        N(obj, e4);
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
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(androidx.datastore.preferences.protobuf.AbstractC0169v r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.e(androidx.datastore.preferences.protobuf.v):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0050. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.V
    public final int f(AbstractC0169v abstractC0169v) {
        int i4;
        int i5;
        int i6;
        int X3;
        int W3;
        int i7;
        int l02;
        int n02;
        Unsafe unsafe = f4015o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f4016a;
            if (i11 >= iArr.length) {
                this.f4027l.getClass();
                return abstractC0169v.unknownFields.b() + i12;
            }
            int M3 = M(i11);
            int L3 = L(M3);
            int i13 = iArr[i11];
            int i14 = iArr[i11 + 2];
            int i15 = i14 & i8;
            if (L3 <= 17) {
                if (i15 != i9) {
                    i10 = i15 == i8 ? 0 : unsafe.getInt(abstractC0169v, i15);
                    i9 = i15;
                }
                i4 = i9;
                i5 = i10;
                i6 = 1 << (i14 >>> 20);
            } else {
                i4 = i9;
                i5 = i10;
                i6 = 0;
            }
            long j4 = M3 & i8;
            if (L3 >= r.f4130m.a()) {
                r.f4131n.a();
            }
            switch (L3) {
                case 0:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.X(i13);
                        i12 += X3;
                        break;
                    }
                case 1:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.b0(i13);
                        i12 += X3;
                        break;
                    }
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.e0(unsafe.getLong(abstractC0169v, j4), i13);
                        i12 += X3;
                        break;
                    }
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.o0(unsafe.getLong(abstractC0169v, j4), i13);
                        i12 += X3;
                        break;
                    }
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.d0(i13, unsafe.getInt(abstractC0169v, j4));
                        i12 += X3;
                        break;
                    }
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.a0(i13);
                        i12 += X3;
                        break;
                    }
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.Z(i13);
                        i12 += X3;
                        break;
                    }
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.V(i13);
                        i12 += X3;
                        break;
                    }
                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0169v, j4);
                        W3 = object instanceof C0155g ? C0160l.W(i13, (C0155g) object) : C0160l.j0((String) object, i13);
                        i12 = W3 + i12;
                        break;
                    }
                case 9:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = W.o(i13, unsafe.getObject(abstractC0169v, j4), m(i11));
                        i12 += X3;
                        break;
                    }
                case 10:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.W(i13, (C0155g) unsafe.getObject(abstractC0169v, j4));
                        i12 += X3;
                        break;
                    }
                case 11:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.m0(i13, unsafe.getInt(abstractC0169v, j4));
                        i12 += X3;
                        break;
                    }
                case 12:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.Y(i13, unsafe.getInt(abstractC0169v, j4));
                        i12 += X3;
                        break;
                    }
                case 13:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.f0(i13);
                        i12 += X3;
                        break;
                    }
                case 14:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.g0(i13);
                        i12 += X3;
                        break;
                    }
                case 15:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.h0(i13, unsafe.getInt(abstractC0169v, j4));
                        i12 += X3;
                        break;
                    }
                case 16:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.i0(unsafe.getLong(abstractC0169v, j4), i13);
                        i12 += X3;
                        break;
                    }
                case 17:
                    if (!o(abstractC0169v, i11, i4, i5, i6)) {
                        break;
                    } else {
                        X3 = C0160l.c0(i13, (AbstractC0149a) unsafe.getObject(abstractC0169v, j4), m(i11));
                        i12 += X3;
                        break;
                    }
                case 18:
                    X3 = W.h(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 19:
                    X3 = W.f(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 20:
                    X3 = W.m(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 21:
                    X3 = W.x(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 22:
                    X3 = W.k(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 23:
                    X3 = W.h(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 24:
                    X3 = W.f(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 25:
                    X3 = W.a(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 26:
                    X3 = W.u(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 27:
                    X3 = W.p(i13, (List) unsafe.getObject(abstractC0169v, j4), m(i11));
                    i12 += X3;
                    break;
                case 28:
                    X3 = W.c(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 29:
                    X3 = W.v(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 30:
                    X3 = W.d(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 31:
                    X3 = W.f(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 32:
                    X3 = W.h(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 33:
                    X3 = W.q(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 34:
                    X3 = W.s(i13, (List) unsafe.getObject(abstractC0169v, j4));
                    i12 += X3;
                    break;
                case 35:
                    i7 = W.i((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 36:
                    i7 = W.g((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 37:
                    i7 = W.n((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 38:
                    i7 = W.y((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 39:
                    i7 = W.l((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 40:
                    i7 = W.i((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 41:
                    i7 = W.g((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 42:
                    i7 = W.b((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 43:
                    i7 = W.w((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 44:
                    i7 = W.e((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 45:
                    i7 = W.g((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 46:
                    i7 = W.i((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 47:
                    i7 = W.r((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 48:
                    i7 = W.t((List) unsafe.getObject(abstractC0169v, j4));
                    if (i7 <= 0) {
                        break;
                    } else {
                        l02 = C0160l.l0(i13);
                        n02 = C0160l.n0(i7);
                        i12 += n02 + l02 + i7;
                        break;
                    }
                case 49:
                    X3 = W.j(i13, (List) unsafe.getObject(abstractC0169v, j4), m(i11));
                    i12 += X3;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0169v, j4);
                    Object obj = this.f4017b[(i11 / 3) * 2];
                    this.f4028m.getClass();
                    X3 = I.a(i13, object2, obj);
                    i12 += X3;
                    break;
                case 51:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.X(i13);
                        i12 += X3;
                        break;
                    }
                case 52:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.b0(i13);
                        i12 += X3;
                        break;
                    }
                case 53:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.e0(A(j4, abstractC0169v), i13);
                        i12 += X3;
                        break;
                    }
                case 54:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.o0(A(j4, abstractC0169v), i13);
                        i12 += X3;
                        break;
                    }
                case 55:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.d0(i13, z(j4, abstractC0169v));
                        i12 += X3;
                        break;
                    }
                case 56:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.a0(i13);
                        i12 += X3;
                        break;
                    }
                case 57:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.Z(i13);
                        i12 += X3;
                        break;
                    }
                case 58:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.V(i13);
                        i12 += X3;
                        break;
                    }
                case 59:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0169v, j4);
                        W3 = object3 instanceof C0155g ? C0160l.W(i13, (C0155g) object3) : C0160l.j0((String) object3, i13);
                        i12 = W3 + i12;
                        break;
                    }
                case 60:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = W.o(i13, unsafe.getObject(abstractC0169v, j4), m(i11));
                        i12 += X3;
                        break;
                    }
                case 61:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.W(i13, (C0155g) unsafe.getObject(abstractC0169v, j4));
                        i12 += X3;
                        break;
                    }
                case 62:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.m0(i13, z(j4, abstractC0169v));
                        i12 += X3;
                        break;
                    }
                case 63:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.Y(i13, z(j4, abstractC0169v));
                        i12 += X3;
                        break;
                    }
                case 64:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.f0(i13);
                        i12 += X3;
                        break;
                    }
                case 65:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.g0(i13);
                        i12 += X3;
                        break;
                    }
                case 66:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.h0(i13, z(j4, abstractC0169v));
                        i12 += X3;
                        break;
                    }
                case 67:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.i0(A(j4, abstractC0169v), i13);
                        i12 += X3;
                        break;
                    }
                case 68:
                    if (!q(i13, i11, abstractC0169v)) {
                        break;
                    } else {
                        X3 = C0160l.c0(i13, (AbstractC0149a) unsafe.getObject(abstractC0169v, j4), m(i11));
                        i12 += X3;
                        break;
                    }
            }
            i11 += 3;
            i9 = i4;
            i10 = i5;
            i8 = 1048575;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0169v g() {
        this.f4025j.getClass();
        return ((AbstractC0169v) this.f4020e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void h(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0169v) {
                AbstractC0169v abstractC0169v = (AbstractC0169v) obj;
                abstractC0169v.d();
                abstractC0169v.c();
                abstractC0169v.j();
            }
            int[] iArr = this.f4016a;
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int M3 = M(i4);
                long j4 = 1048575 & M3;
                int L3 = L(M3);
                if (L3 != 9) {
                    if (L3 != 60 && L3 != 68) {
                        switch (L3) {
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
                                this.f4026k.getClass();
                                B.a(j4, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f4015o;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    this.f4028m.getClass();
                                    I.c(object);
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i4], i4, obj)) {
                        m(i4).h(f4015o.getObject(obj, j4));
                    }
                }
                if (n(i4, obj)) {
                    m(i4).h(f4015o.getObject(obj, j4));
                }
            }
            this.f4027l.getClass();
            d0.b(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.B(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1 A[LOOP:0: B:2:0x0005->B:86:0x01f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(androidx.datastore.preferences.protobuf.AbstractC0169v r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.i(androidx.datastore.preferences.protobuf.v, java.lang.Object):boolean");
    }

    public final boolean j(AbstractC0169v abstractC0169v, Object obj, int i4) {
        return n(i4, abstractC0169v) == n(i4, obj);
    }

    public final void k(int i4, Object obj, Object obj2) {
        int i5 = this.f4016a[i4];
        if (i0.f4100c.h(M(i4) & 1048575, obj) == null) {
            return;
        }
        l(i4);
    }

    public final void l(int i4) {
        if (this.f4017b[((i4 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final V m(int i4) {
        int i5 = (i4 / 3) * 2;
        Object[] objArr = this.f4017b;
        V v4 = (V) objArr[i5];
        if (v4 != null) {
            return v4;
        }
        V a4 = S.f4034c.a((Class) objArr[i5 + 1]);
        objArr[i5] = a4;
        return a4;
    }

    public final boolean n(int i4, Object obj) {
        int i5 = this.f4016a[i4 + 2];
        long j4 = i5 & 1048575;
        if (j4 != 1048575) {
            return ((1 << (i5 >>> 20)) & i0.f4100c.f(j4, obj)) != 0;
        }
        int M3 = M(i4);
        long j5 = M3 & 1048575;
        switch (L(M3)) {
            case 0:
                return Double.doubleToRawLongBits(i0.f4100c.d(j5, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(i0.f4100c.e(j5, obj)) != 0;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return i0.f4100c.g(j5, obj) != 0;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return i0.f4100c.g(j5, obj) != 0;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return i0.f4100c.f(j5, obj) != 0;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return i0.f4100c.g(j5, obj) != 0;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return i0.f4100c.f(j5, obj) != 0;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return i0.f4100c.c(j5, obj);
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                Object h4 = i0.f4100c.h(j5, obj);
                if (h4 instanceof String) {
                    return !((String) h4).isEmpty();
                }
                if (h4 instanceof C0155g) {
                    return !C0155g.f4078n.equals(h4);
                }
                throw new IllegalArgumentException();
            case 9:
                return i0.f4100c.h(j5, obj) != null;
            case 10:
                return !C0155g.f4078n.equals(i0.f4100c.h(j5, obj));
            case 11:
                return i0.f4100c.f(j5, obj) != 0;
            case 12:
                return i0.f4100c.f(j5, obj) != 0;
            case 13:
                return i0.f4100c.f(j5, obj) != 0;
            case 14:
                return i0.f4100c.g(j5, obj) != 0;
            case 15:
                return i0.f4100c.f(j5, obj) != 0;
            case 16:
                return i0.f4100c.g(j5, obj) != 0;
            case 17:
                return i0.f4100c.h(j5, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? n(i4, obj) : (i6 & i7) != 0;
    }

    public final boolean q(int i4, int i5, Object obj) {
        return i0.f4100c.f((long) (this.f4016a[i5 + 2] & 1048575), obj) == i4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x006d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x064b A[Catch: all -> 0x025f, TryCatch #5 {all -> 0x025f, blocks: (B:54:0x0646, B:56:0x064b, B:57:0x0650, B:50:0x025a, B:78:0x0262, B:79:0x0275, B:80:0x0288, B:81:0x029b, B:82:0x02ae, B:83:0x02c7, B:84:0x02da, B:85:0x02ed, B:86:0x0300, B:87:0x0313, B:88:0x0326, B:89:0x0339, B:90:0x034c, B:91:0x035f, B:92:0x0372, B:93:0x0385, B:94:0x0398, B:95:0x03ab, B:96:0x03be, B:97:0x03d7, B:98:0x03ea, B:99:0x03fd, B:100:0x0411, B:101:0x0419, B:102:0x042c, B:103:0x043f, B:104:0x0452, B:105:0x0465, B:106:0x0478, B:107:0x048b, B:108:0x049e, B:109:0x04b1, B:110:0x04ca, B:111:0x04e0, B:112:0x04f6, B:113:0x050d, B:114:0x0524, B:115:0x053d, B:116:0x0553, B:117:0x0566, B:118:0x057f, B:119:0x058a, B:120:0x05a2, B:121:0x05b9, B:122:0x05d0, B:123:0x05e6, B:124:0x05fc, B:125:0x0611, B:126:0x0629), top: B:53:0x0646 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0656 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(androidx.datastore.preferences.protobuf.d0 r20, java.lang.Object r21, W.l r22, androidx.datastore.preferences.protobuf.C0162n r23) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.r(androidx.datastore.preferences.protobuf.d0, java.lang.Object, W.l, androidx.datastore.preferences.protobuf.n):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0162n r12, W.l r13) {
        /*
            r8 = this;
            int r10 = r8.M(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.h0 r10 = androidx.datastore.preferences.protobuf.i0.f4100c
            java.lang.Object r10 = r10.h(r0, r9)
            androidx.datastore.preferences.protobuf.I r2 = r8.f4028m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.H r10 = androidx.datastore.preferences.protobuf.H.f4009m
            androidx.datastore.preferences.protobuf.H r10 = r10.b()
            androidx.datastore.preferences.protobuf.i0.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.H r3 = (androidx.datastore.preferences.protobuf.H) r3
            boolean r3 = r3.f4010l
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.H r3 = androidx.datastore.preferences.protobuf.H.f4009m
            androidx.datastore.preferences.protobuf.H r3 = r3.b()
            androidx.datastore.preferences.protobuf.I.b(r3, r10)
            androidx.datastore.preferences.protobuf.i0.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.H r10 = (androidx.datastore.preferences.protobuf.H) r10
            androidx.datastore.preferences.protobuf.G r11 = (androidx.datastore.preferences.protobuf.G) r11
            androidx.datastore.preferences.protobuf.F r9 = r11.f4008a
            r11 = 2
            r13.B(r11)
            java.lang.Object r0 = r13.f2676d
            androidx.datastore.preferences.protobuf.j r0 = (androidx.datastore.preferences.protobuf.AbstractC0158j) r0
            int r1 = r0.v()
            int r1 = r0.e(r1)
            java.lang.String r2 = ""
            L.k r3 = r9.f4007c
            r4 = r3
        L55:
            int r5 = r13.b()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.c()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.C()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0172y -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.z r5 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0172y -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0172y -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0172y -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.o0 r5 = r9.f4006b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0172y -> L8e
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0172y -> L8e
            java.lang.Object r4 = r13.m(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0172y -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.m0 r5 = r9.f4005a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0172y -> L8e
            r6 = 0
            java.lang.Object r2 = r13.m(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0172y -> L8e
            goto L55
        L8e:
            boolean r5 = r13.C()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.z r9 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            r0.d(r1)
            return
        La2:
            r0.d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.s(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.n, W.l):void");
    }

    public final void t(int i4, Object obj, Object obj2) {
        if (n(i4, obj2)) {
            long M3 = M(i4) & 1048575;
            Unsafe unsafe = f4015o;
            Object object = unsafe.getObject(obj2, M3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4016a[i4] + " is present but null: " + obj2);
            }
            V m4 = m(i4);
            if (!n(i4, obj)) {
                if (p(object)) {
                    AbstractC0169v g4 = m4.g();
                    m4.b(g4, object);
                    unsafe.putObject(obj, M3, g4);
                } else {
                    unsafe.putObject(obj, M3, object);
                }
                H(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M3);
            if (!p(object2)) {
                AbstractC0169v g5 = m4.g();
                m4.b(g5, object2);
                unsafe.putObject(obj, M3, g5);
                object2 = g5;
            }
            m4.b(object2, object);
        }
    }

    public final void u(int i4, Object obj, Object obj2) {
        int[] iArr = this.f4016a;
        int i5 = iArr[i4];
        if (q(i5, i4, obj2)) {
            long M3 = M(i4) & 1048575;
            Unsafe unsafe = f4015o;
            Object object = unsafe.getObject(obj2, M3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2);
            }
            V m4 = m(i4);
            if (!q(i5, i4, obj)) {
                if (p(object)) {
                    AbstractC0169v g4 = m4.g();
                    m4.b(g4, object);
                    unsafe.putObject(obj, M3, g4);
                } else {
                    unsafe.putObject(obj, M3, object);
                }
                I(i5, i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M3);
            if (!p(object2)) {
                AbstractC0169v g5 = m4.g();
                m4.b(g5, object2);
                unsafe.putObject(obj, M3, g5);
                object2 = g5;
            }
            m4.b(object2, object);
        }
    }

    public final Object v(int i4, Object obj) {
        V m4 = m(i4);
        long M3 = M(i4) & 1048575;
        if (!n(i4, obj)) {
            return m4.g();
        }
        Object object = f4015o.getObject(obj, M3);
        if (p(object)) {
            return object;
        }
        AbstractC0169v g4 = m4.g();
        if (object != null) {
            m4.b(g4, object);
        }
        return g4;
    }

    public final Object w(int i4, int i5, Object obj) {
        V m4 = m(i5);
        if (!q(i4, i5, obj)) {
            return m4.g();
        }
        Object object = f4015o.getObject(obj, M(i5) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0169v g4 = m4.g();
        if (object != null) {
            m4.b(g4, object);
        }
        return g4;
    }
}
