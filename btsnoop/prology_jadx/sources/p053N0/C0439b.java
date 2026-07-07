package p053N0;

/* renamed from: N0.b */
/* loaded from: classes.dex */
public final class C0439b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p053N0.C0439b> CREATOR = new p024F.C0206i(25);

    /* renamed from: l */
    public final long f1275l;

    /* renamed from: m */
    public final long f1276m;

    /* renamed from: n */
    public final int f1277n;

    public C0439b(int i4, long j4, long j5) {
        p086W.AbstractC0781a.m1416e(j4 < j5);
        this.f1275l = j4;
        this.f1276m = j5;
        this.f1277n = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p053N0.C0439b.class != obj.getClass()) {
            return false;
        }
        p053N0.C0439b c0439b = (p053N0.C0439b) obj;
        return this.f1275l == c0439b.f1275l && this.f1276m == c0439b.f1276m && this.f1277n == c0439b.f1277n;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.f1275l), java.lang.Long.valueOf(this.f1276m), java.lang.Integer.valueOf(this.f1277n)});
    }

    public final java.lang.String toString() {
        int i4 = p086W.AbstractC0805y.f2801a;
        java.util.Locale locale = java.util.Locale.US;
        return "Segment: startTimeMs=" + this.f1275l + ", endTimeMs=" + this.f1276m + ", speedDivisor=" + this.f1277n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeLong(this.f1275l);
        parcel.writeLong(this.f1276m);
        parcel.writeInt(this.f1277n);
    }
}
