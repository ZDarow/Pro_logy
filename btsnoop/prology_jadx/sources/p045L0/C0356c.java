package p045L0;

/* renamed from: L0.c */
/* loaded from: classes.dex */
public final class C0356c implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p045L0.C0356c> CREATOR = new p024F.C0206i(7);

    /* renamed from: l */
    public final byte[] f1089l;

    /* renamed from: m */
    public final java.lang.String f1090m;

    /* renamed from: n */
    public final java.lang.String f1091n;

    public C0356c(java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.f1089l = bArr;
        this.f1090m = str;
        this.f1091n = str2;
    }

    @Override // p076T.InterfaceC0663F
    /* renamed from: c */
    public final void mo717c(p076T.C0661D c0661d) {
        java.lang.String str = this.f1090m;
        if (str != null) {
            c0661d.f2150a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p045L0.C0356c.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f1089l, ((p045L0.C0356c) obj).f1089l);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f1089l);
    }

    public final java.lang.String toString() {
        return "ICY: title=\"" + this.f1090m + "\", url=\"" + this.f1091n + "\", rawMetadata.length=\"" + this.f1089l.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeByteArray(this.f1089l);
        parcel.writeString(this.f1090m);
        parcel.writeString(this.f1091n);
    }

    public C0356c(android.os.Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f1089l = createByteArray;
        this.f1090m = parcel.readString();
        this.f1091n = parcel.readString();
    }
}
