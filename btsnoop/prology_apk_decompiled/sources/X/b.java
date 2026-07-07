package X;

import T.F;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements F {
    public static final Parcelable.Creator<b> CREATOR = new O0.g(17);

    /* renamed from: l, reason: collision with root package name */
    public final float f2823l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2824m;

    public b(float f4, float f5) {
        W.a.d("Invalid latitude or longitude", f4 >= -90.0f && f4 <= 90.0f && f5 >= -180.0f && f5 <= 180.0f);
        this.f2823l = f4;
        this.f2824m = f5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2823l == bVar.f2823l && this.f2824m == bVar.f2824m;
    }

    public final int hashCode() {
        return Float.valueOf(this.f2824m).hashCode() + ((Float.valueOf(this.f2823l).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f2823l + ", longitude=" + this.f2824m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f2823l);
        parcel.writeFloat(this.f2824m);
    }

    public b(Parcel parcel) {
        this.f2823l = parcel.readFloat();
        this.f2824m = parcel.readFloat();
    }
}
