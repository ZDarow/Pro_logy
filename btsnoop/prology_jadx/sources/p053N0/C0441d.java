package p053N0;

/* renamed from: N0.d */
/* loaded from: classes.dex */
public final class C0441d implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p053N0.C0441d> CREATOR = new p024F.C0206i(26);

    /* renamed from: l */
    public final float f1279l;

    /* renamed from: m */
    public final int f1280m;

    public C0441d(float f4, int i4) {
        this.f1279l = f4;
        this.f1280m = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p053N0.C0441d.class != obj.getClass()) {
            return false;
        }
        p053N0.C0441d c0441d = (p053N0.C0441d) obj;
        return this.f1279l == c0441d.f1279l && this.f1280m == c0441d.f1280m;
    }

    public final int hashCode() {
        return ((java.lang.Float.valueOf(this.f1279l).hashCode() + 527) * 31) + this.f1280m;
    }

    public final java.lang.String toString() {
        return "smta: captureFrameRate=" + this.f1279l + ", svcTemporalLayerCount=" + this.f1280m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeFloat(this.f1279l);
        parcel.writeInt(this.f1280m);
    }

    public C0441d(android.os.Parcel parcel) {
        this.f1279l = parcel.readFloat();
        this.f1280m = parcel.readInt();
    }
}
