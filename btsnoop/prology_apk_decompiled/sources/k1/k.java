package k1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a2.g(12);

    /* renamed from: l, reason: collision with root package name */
    public int f7017l;

    /* renamed from: m, reason: collision with root package name */
    public int f7018m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7019n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f7017l);
        parcel.writeInt(this.f7018m);
        parcel.writeInt(this.f7019n ? 1 : 0);
    }
}
