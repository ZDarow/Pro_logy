package p090X;

/* renamed from: X.c */
/* loaded from: classes.dex */
public final class C0826c implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p090X.C0826c> CREATOR = new p057O0.C0488g(18);

    /* renamed from: l */
    public final long f2921l;

    /* renamed from: m */
    public final long f2922m;

    /* renamed from: n */
    public final long f2923n;

    public C0826c(long j4, long j5, long j6) {
        this.f2921l = j4;
        this.f2922m = j5;
        this.f2923n = j6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p090X.C0826c)) {
            return false;
        }
        p090X.C0826c c0826c = (p090X.C0826c) obj;
        return this.f2921l == c0826c.f2921l && this.f2922m == c0826c.f2922m && this.f2923n == c0826c.f2923n;
    }

    public final int hashCode() {
        return p176p1.AbstractC1949a.m3947z(this.f2923n) + ((p176p1.AbstractC1949a.m3947z(this.f2922m) + ((p176p1.AbstractC1949a.m3947z(this.f2921l) + 527) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Mp4Timestamp: creation time=" + this.f2921l + ", modification time=" + this.f2922m + ", timescale=" + this.f2923n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeLong(this.f2921l);
        parcel.writeLong(this.f2922m);
        parcel.writeLong(this.f2923n);
    }

    public C0826c(android.os.Parcel parcel) {
        this.f2921l = parcel.readLong();
        this.f2922m = parcel.readLong();
        this.f2923n = parcel.readLong();
    }
}
