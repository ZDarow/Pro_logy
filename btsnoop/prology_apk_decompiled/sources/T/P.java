package T;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class P implements Comparable, Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new O0.g(15);

    /* renamed from: l, reason: collision with root package name */
    public final int f2140l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2141m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2142n;

    static {
        W.y.H(0);
        W.y.H(1);
        W.y.H(2);
    }

    public P() {
        this.f2140l = -1;
        this.f2141m = -1;
        this.f2142n = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        P p2 = (P) obj;
        int i4 = this.f2140l - p2.f2140l;
        if (i4 != 0) {
            return i4;
        }
        int i5 = this.f2141m - p2.f2141m;
        return i5 == 0 ? this.f2142n - p2.f2142n : i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        P p2 = (P) obj;
        return this.f2140l == p2.f2140l && this.f2141m == p2.f2141m && this.f2142n == p2.f2142n;
    }

    public final int hashCode() {
        return (((this.f2140l * 31) + this.f2141m) * 31) + this.f2142n;
    }

    public final String toString() {
        return this.f2140l + "." + this.f2141m + "." + this.f2142n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2140l);
        parcel.writeInt(this.f2141m);
        parcel.writeInt(this.f2142n);
    }

    public P(Parcel parcel) {
        this.f2140l = parcel.readInt();
        this.f2141m = parcel.readInt();
        this.f2142n = parcel.readInt();
    }
}
