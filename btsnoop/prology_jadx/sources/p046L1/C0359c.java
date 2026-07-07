package p046L1;

/* renamed from: L1.c */
/* loaded from: classes.dex */
public final class C0359c extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p046L1.C0359c> CREATOR = new p024F.C0206i(9);

    /* renamed from: l */
    public final java.lang.String f1100l;

    /* renamed from: m */
    public final int f1101m;

    /* renamed from: n */
    public final long f1102n;

    public C0359c(long j4, java.lang.String str, int i4) {
        this.f1100l = str;
        this.f1101m = i4;
        this.f1102n = j4;
    }

    /* renamed from: d */
    public final long m804d() {
        long j4 = this.f1102n;
        return j4 == -1 ? this.f1101m : j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p046L1.C0359c) {
            p046L1.C0359c c0359c = (p046L1.C0359c) obj;
            java.lang.String str = this.f1100l;
            if (((str != null && str.equals(c0359c.f1100l)) || (str == null && c0359c.f1100l == null)) && m804d() == c0359c.m804d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f1100l, java.lang.Long.valueOf(m804d())});
    }

    public final java.lang.String toString() {
        p008B1.C0026d c0026d = new p008B1.C0026d(this);
        c0026d.m108i(this.f1100l, "name");
        c0026d.m108i(java.lang.Long.valueOf(m804d()), "version");
        return c0026d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3917T(parcel, 1, this.f1100l);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f1101m);
        long m804d = m804d();
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 8);
        parcel.writeLong(m804d);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }

    public C0359c(java.lang.String str, long j4) {
        this.f1100l = str;
        this.f1102n = j4;
        this.f1101m = -1;
    }
}
