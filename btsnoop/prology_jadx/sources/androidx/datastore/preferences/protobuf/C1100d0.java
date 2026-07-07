package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d0 */
/* loaded from: classes.dex */
public final class C1100d0 {
    /* renamed from: a */
    public static androidx.datastore.preferences.protobuf.C1098c0 m2492a(java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v = (androidx.datastore.preferences.protobuf.AbstractC1132v) obj;
        androidx.datastore.preferences.protobuf.C1098c0 c1098c0 = abstractC1132v.unknownFields;
        if (c1098c0 != androidx.datastore.preferences.protobuf.C1098c0.f4213f) {
            return c1098c0;
        }
        androidx.datastore.preferences.protobuf.C1098c0 c1098c02 = new androidx.datastore.preferences.protobuf.C1098c0(0, new int[8], new java.lang.Object[8], true);
        abstractC1132v.unknownFields = c1098c02;
        return c1098c02;
    }

    /* renamed from: b */
    public static void m2493b(java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.C1098c0 c1098c0 = ((androidx.datastore.preferences.protobuf.AbstractC1132v) obj).unknownFields;
        if (c1098c0.f4218e) {
            c1098c0.f4218e = false;
        }
    }

    /* renamed from: c */
    public static boolean m2494c(int i4, p086W.C0792l c0792l, java.lang.Object obj) {
        int i5 = c0792l.f2765a;
        int i6 = i5 >>> 3;
        int i7 = i5 & 7;
        androidx.datastore.preferences.protobuf.AbstractC1111j abstractC1111j = (androidx.datastore.preferences.protobuf.AbstractC1111j) c0792l.f2768d;
        if (i7 == 0) {
            c0792l.m1449B(0);
            ((androidx.datastore.preferences.protobuf.C1098c0) obj).m2490c(i6 << 3, java.lang.Long.valueOf(abstractC1111j.mo2530n()));
            return true;
        }
        if (i7 == 1) {
            c0792l.m1449B(1);
            ((androidx.datastore.preferences.protobuf.C1098c0) obj).m2490c((i6 << 3) | 1, java.lang.Long.valueOf(abstractC1111j.mo2527k()));
            return true;
        }
        if (i7 == 2) {
            ((androidx.datastore.preferences.protobuf.C1098c0) obj).m2490c((i6 << 3) | 2, c0792l.m1457i());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw androidx.datastore.preferences.protobuf.C1136z.m2646b();
            }
            c0792l.m1449B(5);
            ((androidx.datastore.preferences.protobuf.C1098c0) obj).m2490c(5 | (i6 << 3), java.lang.Integer.valueOf(abstractC1111j.mo2526j()));
            return true;
        }
        androidx.datastore.preferences.protobuf.C1098c0 c1098c0 = new androidx.datastore.preferences.protobuf.C1098c0(0, new int[8], new java.lang.Object[8], true);
        int i8 = i6 << 3;
        int i9 = i8 | 4;
        int i10 = i4 + 1;
        if (i10 >= 100) {
            throw new java.io.IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0792l.m1452b() != Integer.MAX_VALUE && m2494c(i10, c0792l, c1098c0)) {
        }
        if (i9 != c0792l.f2765a) {
            throw new java.io.IOException("Protocol message end-group tag did not match expected tag.");
        }
        if (c1098c0.f4218e) {
            c1098c0.f4218e = false;
        }
        ((androidx.datastore.preferences.protobuf.C1098c0) obj).m2490c(i8 | 3, c1098c0);
        return true;
    }
}
