package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4044a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f4045b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f4046c;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.d0, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        S s = S.f4034c;
        d0 d0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4044a = cls;
        try {
            S s4 = S.f4034c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                d0Var = (d0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f4045b = d0Var;
        f4046c = new Object();
    }

    public static void A(d0 d0Var, Object obj, Object obj2) {
        d0Var.getClass();
        AbstractC0169v abstractC0169v = (AbstractC0169v) obj;
        c0 c0Var = abstractC0169v.unknownFields;
        c0 c0Var2 = ((AbstractC0169v) obj2).unknownFields;
        c0 c0Var3 = c0.f4065f;
        if (!c0Var3.equals(c0Var2)) {
            if (c0Var3.equals(c0Var)) {
                int i4 = c0Var.f4066a + c0Var2.f4066a;
                int[] copyOf = Arrays.copyOf(c0Var.f4067b, i4);
                System.arraycopy(c0Var2.f4067b, 0, copyOf, c0Var.f4066a, c0Var2.f4066a);
                Object[] copyOf2 = Arrays.copyOf(c0Var.f4068c, i4);
                System.arraycopy(c0Var2.f4068c, 0, copyOf2, c0Var.f4066a, c0Var2.f4066a);
                c0Var = new c0(i4, copyOf, copyOf2, true);
            } else {
                c0Var.getClass();
                if (!c0Var2.equals(c0Var3)) {
                    if (!c0Var.f4070e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = c0Var.f4066a + c0Var2.f4066a;
                    c0Var.a(i5);
                    System.arraycopy(c0Var2.f4067b, 0, c0Var.f4067b, c0Var.f4066a, c0Var2.f4066a);
                    System.arraycopy(c0Var2.f4068c, 0, c0Var.f4068c, c0Var.f4066a, c0Var2.f4066a);
                    c0Var.f4066a = i5;
                }
            }
        }
        abstractC0169v.unknownFields = c0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.u0(i4, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            Logger logger = C0160l.f4108l;
            i6++;
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.s0(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void D(int i4, List list, E e4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e4.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((C0160l) e4.f4004a).v0(i4, (C0155g) list.get(i5));
        }
    }

    public static void E(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                double doubleValue = ((Double) list.get(i5)).doubleValue();
                c0160l.getClass();
                c0160l.z0(Double.doubleToRawLongBits(doubleValue), i4);
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            Logger logger = C0160l.f4108l;
            i6 += 8;
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.A0(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void F(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.B0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0160l.p0(((Integer) list.get(i7)).intValue());
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.C0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void G(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.x0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0160l.f4108l;
            i6 += 4;
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.y0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void H(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.z0(((Long) list.get(i5)).longValue(), i4);
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0160l.f4108l;
            i6 += 8;
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.A0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void I(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                float floatValue = ((Float) list.get(i5)).floatValue();
                c0160l.getClass();
                c0160l.x0(i4, Float.floatToRawIntBits(floatValue));
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            Logger logger = C0160l.f4108l;
            i6 += 4;
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.y0(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void J(int i4, List list, E e4, V v4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e4.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            e4.h(i4, list.get(i5), v4);
        }
    }

    public static void K(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.B0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0160l.p0(((Integer) list.get(i7)).intValue());
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.C0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void L(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.I0(((Long) list.get(i5)).longValue(), i4);
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0160l.p0(((Long) list.get(i7)).longValue());
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.J0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void M(int i4, List list, E e4, V v4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e4.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            e4.k(i4, list.get(i5), v4);
        }
    }

    public static void N(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.x0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0160l.f4108l;
            i6 += 4;
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.y0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void O(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.z0(((Long) list.get(i5)).longValue(), i4);
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0160l.f4108l;
            i6 += 8;
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.A0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void P(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int intValue = ((Integer) list.get(i5)).intValue();
                c0160l.G0(i4, (intValue >> 31) ^ (intValue << 1));
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue2 = ((Integer) list.get(i7)).intValue();
            i6 += C0160l.n0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            int intValue3 = ((Integer) list.get(i5)).intValue();
            c0160l.H0((intValue3 >> 31) ^ (intValue3 << 1));
            i5++;
        }
    }

    public static void Q(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                long longValue = ((Long) list.get(i5)).longValue();
                c0160l.I0((longValue >> 63) ^ (longValue << 1), i4);
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((Long) list.get(i7)).longValue();
            i6 += C0160l.p0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            long longValue3 = ((Long) list.get(i5)).longValue();
            c0160l.J0((longValue3 >> 63) ^ (longValue3 << 1));
            i5++;
        }
    }

    public static void R(int i4, List list, E e4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e4.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((C0160l) e4.f4004a).D0((String) list.get(i5), i4);
        }
    }

    public static void S(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.G0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0160l.n0(((Integer) list.get(i7)).intValue());
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.H0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void T(int i4, List list, E e4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0160l c0160l = (C0160l) e4.f4004a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0160l.I0(((Long) list.get(i5)).longValue(), i4);
                i5++;
            }
            return;
        }
        c0160l.F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0160l.p0(((Long) list.get(i7)).longValue());
        }
        c0160l.H0(i6);
        while (i5 < list.size()) {
            c0160l.J0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static int a(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0160l.V(i4) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l02 = C0160l.l0(i4) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int size2 = ((C0155g) list.get(i5)).size();
            l02 += C0160l.n0(size2) + size2;
        }
        return l02;
    }

    public static int d(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0160l.l0(i4) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0160l.p0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int f(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0160l.Z(i4) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0160l.a0(i4) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i4, List list, V v4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += C0160l.c0(i4, (AbstractC0149a) list.get(i6), v4);
        }
        return i5;
    }

    public static int k(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0160l.l0(i4) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0160l.p0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int m(int i4, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0160l.l0(i4) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0160l.p0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int o(int i4, Object obj, V v4) {
        int l02 = C0160l.l0(i4);
        int a4 = ((AbstractC0149a) obj).a(v4);
        return C0160l.n0(a4) + a4 + l02;
    }

    public static int p(int i4, List list, V v4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l02 = C0160l.l0(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            int a4 = ((AbstractC0149a) list.get(i5)).a(v4);
            l02 += C0160l.n0(a4) + a4;
        }
        return l02;
    }

    public static int q(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0160l.l0(i4) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Integer) list.get(i5)).intValue();
            i4 += C0160l.n0((intValue >> 31) ^ (intValue << 1));
        }
        return i4;
    }

    public static int s(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0160l.l0(i4) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i4 += C0160l.p0((longValue >> 63) ^ (longValue << 1));
        }
        return i4;
    }

    public static int u(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l02 = C0160l.l0(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj instanceof C0155g) {
                int size2 = ((C0155g) obj).size();
                l02 = C0160l.n0(size2) + size2 + l02;
            } else {
                l02 = C0160l.k0((String) obj) + l02;
            }
        }
        return l02;
    }

    public static int v(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0160l.l0(i4) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0160l.n0(((Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    public static int x(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0160l.l0(i4) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0160l.p0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static Object z(Object obj, int i4, InterfaceC0170w interfaceC0170w, Object obj2, d0 d0Var) {
        return obj2;
    }
}
