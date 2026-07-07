package p104a2;

/* renamed from: a2.i */
/* loaded from: classes.dex */
public final class C1011i extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p104a2.C1011i> CREATOR = new p104a2.C1009g(1);

    /* renamed from: l */
    public final int f3742l;

    /* renamed from: m */
    public final int f3743m;

    /* renamed from: n */
    public final long f3744n;

    /* renamed from: o */
    public final long f3745o;

    public C1011i(int i4, int i5, long j4, long j5) {
        this.f3742l = i4;
        this.f3743m = i5;
        this.f3744n = j4;
        this.f3745o = j5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p104a2.C1011i) {
            p104a2.C1011i c1011i = (p104a2.C1011i) obj;
            if (this.f3742l == c1011i.f3742l && this.f3743m == c1011i.f3743m && this.f3744n == c1011i.f3744n && this.f3745o == c1011i.f3745o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f3743m), java.lang.Integer.valueOf(this.f3742l), java.lang.Long.valueOf(this.f3745o), java.lang.Long.valueOf(this.f3744n)});
    }

    public final java.lang.String toString() {
        int i4 = this.f3742l;
        int length = java.lang.String.valueOf(i4).length();
        int i5 = this.f3743m;
        int length2 = java.lang.String.valueOf(i5).length();
        long j4 = this.f3745o;
        int length3 = java.lang.String.valueOf(j4).length();
        long j5 = this.f3744n;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 50 + length2 + 18 + length3 + 17 + java.lang.String.valueOf(j5).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i4);
        sb.append(" Cell status: ");
        sb.append(i5);
        sb.append(" elapsed time NS: ");
        sb.append(j4);
        sb.append(" system time ms: ");
        sb.append(j5);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f3742l);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f3743m);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 8);
        parcel.writeLong(this.f3744n);
        p176p1.AbstractC1949a.m3925a0(parcel, 4, 8);
        parcel.writeLong(this.f3745o);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
