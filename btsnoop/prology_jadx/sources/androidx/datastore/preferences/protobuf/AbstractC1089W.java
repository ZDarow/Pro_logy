package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.W */
/* loaded from: classes.dex */
public abstract class AbstractC1089W {

    /* renamed from: a */
    public static final java.lang.Class f4192a;

    /* renamed from: b */
    public static final androidx.datastore.preferences.protobuf.C1100d0 f4193b;

    /* renamed from: c */
    public static final androidx.datastore.preferences.protobuf.C1100d0 f4194c;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.d0, java.lang.Object] */
    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
        androidx.datastore.preferences.protobuf.C1100d0 c1100d0 = null;
        try {
            cls = java.lang.Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f4192a = cls;
        try {
            androidx.datastore.preferences.protobuf.C1085S c1085s2 = androidx.datastore.preferences.protobuf.C1085S.f4182c;
            try {
                cls2 = java.lang.Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (java.lang.Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c1100d0 = (androidx.datastore.preferences.protobuf.C1100d0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (java.lang.Throwable unused3) {
        }
        f4193b = c1100d0;
        f4194c = new java.lang.Object();
    }

    /* renamed from: A */
    public static void m2429A(androidx.datastore.preferences.protobuf.C1100d0 c1100d0, java.lang.Object obj, java.lang.Object obj2) {
        c1100d0.getClass();
        androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v = (androidx.datastore.preferences.protobuf.AbstractC1132v) obj;
        androidx.datastore.preferences.protobuf.C1098c0 c1098c0 = abstractC1132v.unknownFields;
        androidx.datastore.preferences.protobuf.C1098c0 c1098c02 = ((androidx.datastore.preferences.protobuf.AbstractC1132v) obj2).unknownFields;
        androidx.datastore.preferences.protobuf.C1098c0 c1098c03 = androidx.datastore.preferences.protobuf.C1098c0.f4213f;
        if (!c1098c03.equals(c1098c02)) {
            if (c1098c03.equals(c1098c0)) {
                int i4 = c1098c0.f4214a + c1098c02.f4214a;
                int[] copyOf = java.util.Arrays.copyOf(c1098c0.f4215b, i4);
                java.lang.System.arraycopy(c1098c02.f4215b, 0, copyOf, c1098c0.f4214a, c1098c02.f4214a);
                java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(c1098c0.f4216c, i4);
                java.lang.System.arraycopy(c1098c02.f4216c, 0, copyOf2, c1098c0.f4214a, c1098c02.f4214a);
                c1098c0 = new androidx.datastore.preferences.protobuf.C1098c0(i4, copyOf, copyOf2, true);
            } else {
                c1098c0.getClass();
                if (!c1098c02.equals(c1098c03)) {
                    if (!c1098c0.f4218e) {
                        throw new java.lang.UnsupportedOperationException();
                    }
                    int i5 = c1098c0.f4214a + c1098c02.f4214a;
                    c1098c0.m2488a(i5);
                    java.lang.System.arraycopy(c1098c02.f4215b, 0, c1098c0.f4215b, c1098c0.f4214a, c1098c02.f4214a);
                    java.lang.System.arraycopy(c1098c02.f4216c, 0, c1098c0.f4216c, c1098c0.f4214a, c1098c02.f4214a);
                    c1098c0.f4214a = i5;
                }
            }
        }
        abstractC1132v.unknownFields = c1098c0;
    }

    /* renamed from: B */
    public static boolean m2430B(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: C */
    public static void m2431C(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2619u0(i4, ((java.lang.Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((java.lang.Boolean) list.get(i7)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1115l.f4256l;
            i6++;
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2617s0(((java.lang.Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    /* renamed from: D */
    public static void m2432D(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1072e.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a).m2620v0(i4, (androidx.datastore.preferences.protobuf.C1105g) list.get(i5));
        }
    }

    /* renamed from: E */
    public static void m2433E(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                double doubleValue = ((java.lang.Double) list.get(i5)).doubleValue();
                c1115l.getClass();
                c1115l.m2624z0(java.lang.Double.doubleToRawLongBits(doubleValue), i4);
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((java.lang.Double) list.get(i7)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1115l.f4256l;
            i6 += 8;
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2600A0(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    /* renamed from: F */
    public static void m2434F(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2601B0(i4, ((java.lang.Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += androidx.datastore.preferences.protobuf.C1115l.m2599p0(((java.lang.Integer) list.get(i7)).intValue());
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2602C0(((java.lang.Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    /* renamed from: G */
    public static void m2435G(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2622x0(i4, ((java.lang.Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((java.lang.Integer) list.get(i7)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1115l.f4256l;
            i6 += 4;
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2623y0(((java.lang.Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    /* renamed from: H */
    public static void m2436H(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2624z0(((java.lang.Long) list.get(i5)).longValue(), i4);
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((java.lang.Long) list.get(i7)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1115l.f4256l;
            i6 += 8;
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2600A0(((java.lang.Long) list.get(i5)).longValue());
            i5++;
        }
    }

    /* renamed from: I */
    public static void m2437I(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                float floatValue = ((java.lang.Float) list.get(i5)).floatValue();
                c1115l.getClass();
                c1115l.m2622x0(i4, java.lang.Float.floatToRawIntBits(floatValue));
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((java.lang.Float) list.get(i7)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1115l.f4256l;
            i6 += 4;
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2623y0(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    /* renamed from: J */
    public static void m2438J(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1072e.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            c1072e.m2363h(i4, list.get(i5), interfaceC1088V);
        }
    }

    /* renamed from: K */
    public static void m2439K(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2601B0(i4, ((java.lang.Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += androidx.datastore.preferences.protobuf.C1115l.m2599p0(((java.lang.Integer) list.get(i7)).intValue());
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2602C0(((java.lang.Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    /* renamed from: L */
    public static void m2440L(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2608I0(((java.lang.Long) list.get(i5)).longValue(), i4);
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += androidx.datastore.preferences.protobuf.C1115l.m2599p0(((java.lang.Long) list.get(i7)).longValue());
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2609J0(((java.lang.Long) list.get(i5)).longValue());
            i5++;
        }
    }

    /* renamed from: M */
    public static void m2441M(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1072e.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            c1072e.m2366k(i4, list.get(i5), interfaceC1088V);
        }
    }

    /* renamed from: N */
    public static void m2442N(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2622x0(i4, ((java.lang.Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((java.lang.Integer) list.get(i7)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1115l.f4256l;
            i6 += 4;
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2623y0(((java.lang.Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    /* renamed from: O */
    public static void m2443O(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2624z0(((java.lang.Long) list.get(i5)).longValue(), i4);
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((java.lang.Long) list.get(i7)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1115l.f4256l;
            i6 += 8;
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2600A0(((java.lang.Long) list.get(i5)).longValue());
            i5++;
        }
    }

    /* renamed from: P */
    public static void m2444P(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int intValue = ((java.lang.Integer) list.get(i5)).intValue();
                c1115l.m2606G0(i4, (intValue >> 31) ^ (intValue << 1));
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue2 = ((java.lang.Integer) list.get(i7)).intValue();
            i6 += androidx.datastore.preferences.protobuf.C1115l.m2597n0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            int intValue3 = ((java.lang.Integer) list.get(i5)).intValue();
            c1115l.m2607H0((intValue3 >> 31) ^ (intValue3 << 1));
            i5++;
        }
    }

    /* renamed from: Q */
    public static void m2445Q(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                long longValue = ((java.lang.Long) list.get(i5)).longValue();
                c1115l.m2608I0((longValue >> 63) ^ (longValue << 1), i4);
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((java.lang.Long) list.get(i7)).longValue();
            i6 += androidx.datastore.preferences.protobuf.C1115l.m2599p0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            long longValue3 = ((java.lang.Long) list.get(i5)).longValue();
            c1115l.m2609J0((longValue3 >> 63) ^ (longValue3 << 1));
            i5++;
        }
    }

    /* renamed from: R */
    public static void m2446R(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1072e.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a).m2603D0((java.lang.String) list.get(i5), i4);
        }
    }

    /* renamed from: S */
    public static void m2447S(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2606G0(i4, ((java.lang.Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += androidx.datastore.preferences.protobuf.C1115l.m2597n0(((java.lang.Integer) list.get(i7)).intValue());
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2607H0(((java.lang.Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    /* renamed from: T */
    public static void m2448T(int i4, java.util.List list, androidx.datastore.preferences.protobuf.C1072E c1072e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1115l.m2608I0(((java.lang.Long) list.get(i5)).longValue(), i4);
                i5++;
            }
            return;
        }
        c1115l.m2605F0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += androidx.datastore.preferences.protobuf.C1115l.m2599p0(((java.lang.Long) list.get(i7)).longValue());
        }
        c1115l.m2607H0(i6);
        while (i5 < list.size()) {
            c1115l.m2609J0(((java.lang.Long) list.get(i5)).longValue());
            i5++;
        }
    }

    /* renamed from: a */
    public static int m2449a(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return androidx.datastore.preferences.protobuf.C1115l.m2579V(i4) * size;
    }

    /* renamed from: b */
    public static int m2450b(java.util.List list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m2451c(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int size2 = ((androidx.datastore.preferences.protobuf.C1105g) list.get(i5)).size();
            m2595l0 += androidx.datastore.preferences.protobuf.C1115l.m2597n0(size2) + size2;
        }
        return m2595l0;
    }

    /* renamed from: d */
    public static int m2452d(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * size) + m2453e(list);
    }

    /* renamed from: e */
    public static int m2453e(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += androidx.datastore.preferences.protobuf.C1115l.m2599p0(((java.lang.Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    /* renamed from: f */
    public static int m2454f(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return androidx.datastore.preferences.protobuf.C1115l.m2583Z(i4) * size;
    }

    /* renamed from: g */
    public static int m2455g(java.util.List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m2456h(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return androidx.datastore.preferences.protobuf.C1115l.m2584a0(i4) * size;
    }

    /* renamed from: i */
    public static int m2457i(java.util.List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m2458j(int i4, java.util.List list, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += androidx.datastore.preferences.protobuf.C1115l.m2586c0(i4, (androidx.datastore.preferences.protobuf.AbstractC1093a) list.get(i6), interfaceC1088V);
        }
        return i5;
    }

    /* renamed from: k */
    public static int m2459k(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * size) + m2460l(list);
    }

    /* renamed from: l */
    public static int m2460l(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += androidx.datastore.preferences.protobuf.C1115l.m2599p0(((java.lang.Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    /* renamed from: m */
    public static int m2461m(int i4, java.util.List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * list.size()) + m2462n(list);
    }

    /* renamed from: n */
    public static int m2462n(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += androidx.datastore.preferences.protobuf.C1115l.m2599p0(((java.lang.Long) list.get(i5)).longValue());
        }
        return i4;
    }

    /* renamed from: o */
    public static int m2463o(int i4, java.lang.Object obj, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V) {
        int m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4);
        int mo2484a = ((androidx.datastore.preferences.protobuf.AbstractC1093a) obj).mo2484a(interfaceC1088V);
        return androidx.datastore.preferences.protobuf.C1115l.m2597n0(mo2484a) + mo2484a + m2595l0;
    }

    /* renamed from: p */
    public static int m2464p(int i4, java.util.List list, androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            int mo2484a = ((androidx.datastore.preferences.protobuf.AbstractC1093a) list.get(i5)).mo2484a(interfaceC1088V);
            m2595l0 += androidx.datastore.preferences.protobuf.C1115l.m2597n0(mo2484a) + mo2484a;
        }
        return m2595l0;
    }

    /* renamed from: q */
    public static int m2465q(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * size) + m2466r(list);
    }

    /* renamed from: r */
    public static int m2466r(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((java.lang.Integer) list.get(i5)).intValue();
            i4 += androidx.datastore.preferences.protobuf.C1115l.m2597n0((intValue >> 31) ^ (intValue << 1));
        }
        return i4;
    }

    /* renamed from: s */
    public static int m2467s(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * size) + m2468t(list);
    }

    /* renamed from: t */
    public static int m2468t(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((java.lang.Long) list.get(i5)).longValue();
            i4 += androidx.datastore.preferences.protobuf.C1115l.m2599p0((longValue >> 63) ^ (longValue << 1));
        }
        return i4;
    }

    /* renamed from: u */
    public static int m2469u(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            java.lang.Object obj = list.get(i5);
            if (obj instanceof androidx.datastore.preferences.protobuf.C1105g) {
                int size2 = ((androidx.datastore.preferences.protobuf.C1105g) obj).size();
                m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2597n0(size2) + size2 + m2595l0;
            } else {
                m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2594k0((java.lang.String) obj) + m2595l0;
            }
        }
        return m2595l0;
    }

    /* renamed from: v */
    public static int m2470v(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * size) + m2471w(list);
    }

    /* renamed from: w */
    public static int m2471w(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += androidx.datastore.preferences.protobuf.C1115l.m2597n0(((java.lang.Integer) list.get(i5)).intValue());
        }
        return i4;
    }

    /* renamed from: x */
    public static int m2472x(int i4, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4) * size) + m2473y(list);
    }

    /* renamed from: y */
    public static int m2473y(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += androidx.datastore.preferences.protobuf.C1115l.m2599p0(((java.lang.Long) list.get(i5)).longValue());
        }
        return i4;
    }

    /* renamed from: z */
    public static java.lang.Object m2474z(java.lang.Object obj, int i4, androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w, java.lang.Object obj2, androidx.datastore.preferences.protobuf.C1100d0 c1100d0) {
        return obj2;
    }
}
