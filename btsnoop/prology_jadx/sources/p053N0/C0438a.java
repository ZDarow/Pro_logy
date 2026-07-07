package p053N0;

/* renamed from: N0.a */
/* loaded from: classes.dex */
public final class C0438a implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p053N0.C0438a> CREATOR = new p024F.C0206i(23);

    /* renamed from: l */
    public final long f1270l;

    /* renamed from: m */
    public final long f1271m;

    /* renamed from: n */
    public final long f1272n;

    /* renamed from: o */
    public final long f1273o;

    /* renamed from: p */
    public final long f1274p;

    public C0438a(long j4, long j5, long j6, long j7, long j8) {
        this.f1270l = j4;
        this.f1271m = j5;
        this.f1272n = j6;
        this.f1273o = j7;
        this.f1274p = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p053N0.C0438a.class != obj.getClass()) {
            return false;
        }
        p053N0.C0438a c0438a = (p053N0.C0438a) obj;
        return this.f1270l == c0438a.f1270l && this.f1271m == c0438a.f1271m && this.f1272n == c0438a.f1272n && this.f1273o == c0438a.f1273o && this.f1274p == c0438a.f1274p;
    }

    public final int hashCode() {
        return p176p1.AbstractC1949a.m3947z(this.f1274p) + ((p176p1.AbstractC1949a.m3947z(this.f1273o) + ((p176p1.AbstractC1949a.m3947z(this.f1272n) + ((p176p1.AbstractC1949a.m3947z(this.f1271m) + ((p176p1.AbstractC1949a.m3947z(this.f1270l) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f1270l + ", photoSize=" + this.f1271m + ", photoPresentationTimestampUs=" + this.f1272n + ", videoStartPosition=" + this.f1273o + ", videoSize=" + this.f1274p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeLong(this.f1270l);
        parcel.writeLong(this.f1271m);
        parcel.writeLong(this.f1272n);
        parcel.writeLong(this.f1273o);
        parcel.writeLong(this.f1274p);
    }

    public C0438a(android.os.Parcel parcel) {
        this.f1270l = parcel.readLong();
        this.f1271m = parcel.readLong();
        this.f1272n = parcel.readLong();
        this.f1273o = parcel.readLong();
        this.f1274p = parcel.readLong();
    }
}
