package androidx.versionedparcelable;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new p104a2.C1009g(15);

    /* renamed from: l */
    public final p176p1.InterfaceC1952d f4471l;

    public ParcelImpl(p176p1.InterfaceC1952d interfaceC1952d) {
        this.f4471l = interfaceC1952d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        new p176p1.C1951c(parcel).m3960l(this.f4471l);
    }

    public ParcelImpl(android.os.Parcel parcel) {
        this.f4471l = new p176p1.C1951c(parcel).m3956h();
    }
}
