package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c0 */
/* loaded from: classes.dex */
public final class C1098c0 {

    /* renamed from: f */
    public static final androidx.datastore.preferences.protobuf.C1098c0 f4213f = new androidx.datastore.preferences.protobuf.C1098c0(0, new int[0], new java.lang.Object[0], false);

    /* renamed from: a */
    public int f4214a;

    /* renamed from: b */
    public int[] f4215b;

    /* renamed from: c */
    public java.lang.Object[] f4216c;

    /* renamed from: d */
    public int f4217d = -1;

    /* renamed from: e */
    public boolean f4218e;

    public C1098c0(int i4, int[] iArr, java.lang.Object[] objArr, boolean z4) {
        this.f4214a = i4;
        this.f4215b = iArr;
        this.f4216c = objArr;
        this.f4218e = z4;
    }

    /* renamed from: a */
    public final void m2488a(int i4) {
        int[] iArr = this.f4215b;
        if (i4 > iArr.length) {
            int i5 = this.f4214a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f4215b = java.util.Arrays.copyOf(iArr, i4);
            this.f4216c = java.util.Arrays.copyOf(this.f4216c, i4);
        }
    }

    /* renamed from: b */
    public final int m2489b() {
        int m2598o0;
        int i4 = this.f4217d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f4214a; i6++) {
            int i7 = this.f4215b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                m2598o0 = androidx.datastore.preferences.protobuf.C1115l.m2598o0(((java.lang.Long) this.f4216c[i6]).longValue(), i8);
            } else if (i9 == 1) {
                ((java.lang.Long) this.f4216c[i6]).getClass();
                m2598o0 = androidx.datastore.preferences.protobuf.C1115l.m2584a0(i8);
            } else if (i9 == 2) {
                m2598o0 = androidx.datastore.preferences.protobuf.C1115l.m2580W(i8, (androidx.datastore.preferences.protobuf.C1105g) this.f4216c[i6]);
            } else if (i9 == 3) {
                i5 = ((androidx.datastore.preferences.protobuf.C1098c0) this.f4216c[i6]).m2489b() + (androidx.datastore.preferences.protobuf.C1115l.m2595l0(i8) * 2) + i5;
            } else {
                if (i9 != 5) {
                    throw new java.lang.IllegalStateException(androidx.datastore.preferences.protobuf.C1136z.m2646b());
                }
                ((java.lang.Integer) this.f4216c[i6]).getClass();
                m2598o0 = androidx.datastore.preferences.protobuf.C1115l.m2583Z(i8);
            }
            i5 = m2598o0 + i5;
        }
        this.f4217d = i5;
        return i5;
    }

    /* renamed from: c */
    public final void m2490c(int i4, java.lang.Object obj) {
        if (!this.f4218e) {
            throw new java.lang.UnsupportedOperationException();
        }
        m2488a(this.f4214a + 1);
        int[] iArr = this.f4215b;
        int i5 = this.f4214a;
        iArr[i5] = i4;
        this.f4216c[i5] = obj;
        this.f4214a = i5 + 1;
    }

    /* renamed from: d */
    public final void m2491d(androidx.datastore.preferences.protobuf.C1072E c1072e) {
        if (this.f4214a == 0) {
            return;
        }
        c1072e.getClass();
        for (int i4 = 0; i4 < this.f4214a; i4++) {
            int i5 = this.f4215b[i4];
            java.lang.Object obj = this.f4216c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                c1072e.m2365j(((java.lang.Long) obj).longValue(), i6);
            } else if (i7 == 1) {
                c1072e.m2361f(((java.lang.Long) obj).longValue(), i6);
            } else if (i7 == 2) {
                c1072e.m2357b(i6, (androidx.datastore.preferences.protobuf.C1105g) obj);
            } else if (i7 == 3) {
                androidx.datastore.preferences.protobuf.C1115l c1115l = (androidx.datastore.preferences.protobuf.C1115l) c1072e.f4152a;
                c1115l.m2605F0(i6, 3);
                ((androidx.datastore.preferences.protobuf.C1098c0) obj).m2491d(c1072e);
                c1115l.m2605F0(i6, 4);
            } else {
                if (i7 != 5) {
                    throw new java.lang.RuntimeException(androidx.datastore.preferences.protobuf.C1136z.m2646b());
                }
                c1072e.m2360e(i6, ((java.lang.Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.datastore.preferences.protobuf.C1098c0)) {
            return false;
        }
        androidx.datastore.preferences.protobuf.C1098c0 c1098c0 = (androidx.datastore.preferences.protobuf.C1098c0) obj;
        int i4 = this.f4214a;
        if (i4 == c1098c0.f4214a) {
            int[] iArr = this.f4215b;
            int[] iArr2 = c1098c0.f4215b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    java.lang.Object[] objArr = this.f4216c;
                    java.lang.Object[] objArr2 = c1098c0.f4216c;
                    int i6 = this.f4214a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f4214a;
        int i5 = (527 + i4) * 31;
        int[] iArr = this.f4215b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        java.lang.Object[] objArr = this.f4216c;
        int i10 = this.f4214a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}
