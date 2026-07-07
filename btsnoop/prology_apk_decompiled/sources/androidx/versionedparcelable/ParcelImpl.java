package androidx.versionedparcelable;

import a2.g;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p1.c;
import p1.d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new g(15);

    /* renamed from: l, reason: collision with root package name */
    public final d f4315l;

    public ParcelImpl(d dVar) {
        this.f4315l = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        new c(parcel).l(this.f4315l);
    }

    public ParcelImpl(Parcel parcel) {
        this.f4315l = new c(parcel).h();
    }
}
