package k1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class G implements Parcelable {
    public static final Parcelable.Creator<G> CREATOR = new a2.g(13);

    /* renamed from: l, reason: collision with root package name */
    public int f6950l;

    /* renamed from: m, reason: collision with root package name */
    public int f6951m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f6952n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6953o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f6950l + ", mGapDir=" + this.f6951m + ", mHasUnwantedGapAfter=" + this.f6953o + ", mGapPerSpan=" + Arrays.toString(this.f6952n) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f6950l);
        parcel.writeInt(this.f6951m);
        parcel.writeInt(this.f6953o ? 1 : 0);
        int[] iArr = this.f6952n;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f6952n);
        }
    }
}
