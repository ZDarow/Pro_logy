package p090X;

/* renamed from: X.b */
/* loaded from: classes.dex */
public final class C0825b implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p090X.C0825b> CREATOR = new p057O0.C0488g(17);

    /* renamed from: l */
    public final float f2919l;

    /* renamed from: m */
    public final float f2920m;

    public C0825b(float f4, float f5) {
        p086W.AbstractC0781a.m1415d("Invalid latitude or longitude", f4 >= -90.0f && f4 <= 90.0f && f5 >= -180.0f && f5 <= 180.0f);
        this.f2919l = f4;
        this.f2920m = f5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p090X.C0825b.class != obj.getClass()) {
            return false;
        }
        p090X.C0825b c0825b = (p090X.C0825b) obj;
        return this.f2919l == c0825b.f2919l && this.f2920m == c0825b.f2920m;
    }

    public final int hashCode() {
        return java.lang.Float.valueOf(this.f2920m).hashCode() + ((java.lang.Float.valueOf(this.f2919l).hashCode() + 527) * 31);
    }

    public final java.lang.String toString() {
        return "xyz: latitude=" + this.f2919l + ", longitude=" + this.f2920m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeFloat(this.f2919l);
        parcel.writeFloat(this.f2920m);
    }

    public C0825b(android.os.Parcel parcel) {
        this.f2919l = parcel.readFloat();
        this.f2920m = parcel.readFloat();
    }
}
