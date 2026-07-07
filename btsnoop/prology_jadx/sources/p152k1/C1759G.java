package p152k1;

/* renamed from: k1.G */
/* loaded from: classes.dex */
public final class C1759G implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p152k1.C1759G> CREATOR = new p104a2.C1009g(13);

    /* renamed from: l */
    public int f7213l;

    /* renamed from: m */
    public int f7214m;

    /* renamed from: n */
    public int[] f7215n;

    /* renamed from: o */
    public boolean f7216o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "FullSpanItem{mPosition=" + this.f7213l + ", mGapDir=" + this.f7214m + ", mHasUnwantedGapAfter=" + this.f7216o + ", mGapPerSpan=" + java.util.Arrays.toString(this.f7215n) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f7213l);
        parcel.writeInt(this.f7214m);
        parcel.writeInt(this.f7216o ? 1 : 0);
        int[] iArr = this.f7215n;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f7215n);
        }
    }
}
