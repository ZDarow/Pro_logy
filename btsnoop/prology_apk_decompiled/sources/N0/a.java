package N0;

import F.i;
import T.F;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class a implements F {
    public static final Parcelable.Creator<a> CREATOR = new i(23);

    /* renamed from: l, reason: collision with root package name */
    public final long f1228l;

    /* renamed from: m, reason: collision with root package name */
    public final long f1229m;

    /* renamed from: n, reason: collision with root package name */
    public final long f1230n;

    /* renamed from: o, reason: collision with root package name */
    public final long f1231o;

    /* renamed from: p, reason: collision with root package name */
    public final long f1232p;

    public a(long j4, long j5, long j6, long j7, long j8) {
        this.f1228l = j4;
        this.f1229m = j5;
        this.f1230n = j6;
        this.f1231o = j7;
        this.f1232p = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1228l == aVar.f1228l && this.f1229m == aVar.f1229m && this.f1230n == aVar.f1230n && this.f1231o == aVar.f1231o && this.f1232p == aVar.f1232p;
    }

    public final int hashCode() {
        return AbstractC0462a.z(this.f1232p) + ((AbstractC0462a.z(this.f1231o) + ((AbstractC0462a.z(this.f1230n) + ((AbstractC0462a.z(this.f1229m) + ((AbstractC0462a.z(this.f1228l) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f1228l + ", photoSize=" + this.f1229m + ", photoPresentationTimestampUs=" + this.f1230n + ", videoStartPosition=" + this.f1231o + ", videoSize=" + this.f1232p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f1228l);
        parcel.writeLong(this.f1229m);
        parcel.writeLong(this.f1230n);
        parcel.writeLong(this.f1231o);
        parcel.writeLong(this.f1232p);
    }

    public a(Parcel parcel) {
        this.f1228l = parcel.readLong();
        this.f1229m = parcel.readLong();
        this.f1230n = parcel.readLong();
        this.f1231o = parcel.readLong();
        this.f1232p = parcel.readLong();
    }
}
