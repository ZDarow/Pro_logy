package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.g */
/* loaded from: classes.dex */
public class C1105g implements java.lang.Iterable, java.io.Serializable {

    /* renamed from: n */
    public static final androidx.datastore.preferences.protobuf.C1105g f4226n = new androidx.datastore.preferences.protobuf.C1105g(androidx.datastore.preferences.protobuf.AbstractC1134x.f4298b);

    /* renamed from: o */
    public static final androidx.datastore.preferences.protobuf.C1101e f4227o;

    /* renamed from: l */
    public int f4228l = 0;

    /* renamed from: m */
    public final byte[] f4229m;

    static {
        f4227o = androidx.datastore.preferences.protobuf.AbstractC1097c.m2487a() ? new androidx.datastore.preferences.protobuf.C1101e(1) : new androidx.datastore.preferences.protobuf.C1101e(0);
    }

    public C1105g(byte[] bArr) {
        bArr.getClass();
        this.f4229m = bArr;
    }

    /* renamed from: b */
    public static int m2508b(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m151j(i4, "Beginning index: ", " < 0"));
        }
        if (i5 < i4) {
            throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m150i(i4, i5, "Beginning index larger than ending index: ", ", "));
        }
        throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m150i(i5, i6, "End index: ", " >= "));
    }

    /* renamed from: c */
    public static androidx.datastore.preferences.protobuf.C1105g m2509c(byte[] bArr, int i4, int i5) {
        byte[] copyOfRange;
        m2508b(i4, i4 + i5, bArr.length);
        switch (f4227o.f4222a) {
            case 0:
                copyOfRange = java.util.Arrays.copyOfRange(bArr, i4, i5 + i4);
                break;
            default:
                copyOfRange = new byte[i5];
                java.lang.System.arraycopy(bArr, i4, copyOfRange, 0, i5);
                break;
        }
        return new androidx.datastore.preferences.protobuf.C1105g(copyOfRange);
    }

    /* renamed from: a */
    public byte mo2496a(int i4) {
        return this.f4229m[i4];
    }

    /* renamed from: d */
    public void mo2497d(byte[] bArr, int i4) {
        java.lang.System.arraycopy(this.f4229m, 0, bArr, 0, i4);
    }

    /* renamed from: e */
    public int mo2498e() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.C1105g) || size() != ((androidx.datastore.preferences.protobuf.C1105g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.C1105g)) {
            return obj.equals(this);
        }
        androidx.datastore.preferences.protobuf.C1105g c1105g = (androidx.datastore.preferences.protobuf.C1105g) obj;
        int i4 = this.f4228l;
        int i5 = c1105g.f4228l;
        if (i4 != 0 && i5 != 0 && i4 != i5) {
            return false;
        }
        int size = size();
        if (size > c1105g.size()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1105g.size()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c1105g.size());
        }
        int mo2498e = mo2498e() + size;
        int mo2498e2 = mo2498e();
        int mo2498e3 = c1105g.mo2498e();
        while (mo2498e2 < mo2498e) {
            if (this.f4229m[mo2498e2] != c1105g.f4229m[mo2498e3]) {
                return false;
            }
            mo2498e2++;
            mo2498e3++;
        }
        return true;
    }

    /* renamed from: f */
    public byte mo2499f(int i4) {
        return this.f4229m[i4];
    }

    public final int hashCode() {
        int i4 = this.f4228l;
        if (i4 == 0) {
            int size = size();
            int mo2498e = mo2498e();
            int i5 = size;
            for (int i6 = mo2498e; i6 < mo2498e + size; i6++) {
                i5 = (i5 * 31) + this.f4229m[i6];
            }
            i4 = i5 == 0 ? 1 : i5;
            this.f4228l = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.C1099d(this);
    }

    public int size() {
        return this.f4229m.length;
    }

    public final java.lang.String toString() {
        androidx.datastore.preferences.protobuf.C1105g c1103f;
        java.lang.String sb;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = p101a.AbstractC0936a.m1815w(this);
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            int m2508b = m2508b(0, 47, size());
            if (m2508b == 0) {
                c1103f = f4226n;
            } else {
                c1103f = new androidx.datastore.preferences.protobuf.C1103f(this.f4229m, mo2498e(), m2508b);
            }
            sb2.append(p101a.AbstractC0936a.m1815w(c1103f));
            sb2.append("...");
            sb = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return p009B2.AbstractC0051h.m154m(sb3, sb, "\">");
    }
}
