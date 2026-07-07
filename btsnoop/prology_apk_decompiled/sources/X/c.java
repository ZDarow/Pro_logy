package X;

import T.F;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class c implements F {
    public static final Parcelable.Creator<c> CREATOR = new O0.g(18);

    /* renamed from: l, reason: collision with root package name */
    public final long f2825l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2826m;

    /* renamed from: n, reason: collision with root package name */
    public final long f2827n;

    public c(long j4, long j5, long j6) {
        this.f2825l = j4;
        this.f2826m = j5;
        this.f2827n = j6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2825l == cVar.f2825l && this.f2826m == cVar.f2826m && this.f2827n == cVar.f2827n;
    }

    public final int hashCode() {
        return AbstractC0462a.z(this.f2827n) + ((AbstractC0462a.z(this.f2826m) + ((AbstractC0462a.z(this.f2825l) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f2825l + ", modification time=" + this.f2826m + ", timescale=" + this.f2827n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f2825l);
        parcel.writeLong(this.f2826m);
        parcel.writeLong(this.f2827n);
    }

    public c(Parcel parcel) {
        this.f2825l = parcel.readLong();
        this.f2826m = parcel.readLong();
        this.f2827n = parcel.readLong();
    }
}
