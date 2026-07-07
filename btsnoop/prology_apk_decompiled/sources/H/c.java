package H;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: l, reason: collision with root package name */
    public final Parcelable f698l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f697m = new c();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f698l = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f698l, i4);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f698l = parcelable == f697m ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f698l = readParcelable == null ? f697m : readParcelable;
    }
}
