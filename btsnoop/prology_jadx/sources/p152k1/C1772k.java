package p152k1;

/* renamed from: k1.k */
/* loaded from: classes.dex */
public final class C1772k implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p152k1.C1772k> CREATOR = new p104a2.C1009g(12);

    /* renamed from: l */
    public int f7283l;

    /* renamed from: m */
    public int f7284m;

    /* renamed from: n */
    public boolean f7285n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f7283l);
        parcel.writeInt(this.f7284m);
        parcel.writeInt(this.f7285n ? 1 : 0);
    }
}
