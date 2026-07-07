package N0;

import F.i;
import T.F;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements F {
    public static final Parcelable.Creator<d> CREATOR = new i(26);

    /* renamed from: l, reason: collision with root package name */
    public final float f1237l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1238m;

    public d(float f4, int i4) {
        this.f1237l = f4;
        this.f1238m = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1237l == dVar.f1237l && this.f1238m == dVar.f1238m;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f1237l).hashCode() + 527) * 31) + this.f1238m;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f1237l + ", svcTemporalLayerCount=" + this.f1238m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f1237l);
        parcel.writeInt(this.f1238m);
    }

    public d(Parcel parcel) {
        this.f1237l = parcel.readFloat();
        this.f1238m = parcel.readInt();
    }
}
