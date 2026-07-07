package p049M0;

/* renamed from: M0.f */
/* loaded from: classes.dex */
public final class C0407f extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0407f> CREATOR = new p024F.C0206i(15);

    /* renamed from: m */
    public final java.lang.String f1172m;

    /* renamed from: n */
    public final java.lang.String f1173n;

    /* renamed from: o */
    public final java.lang.String f1174o;

    /* renamed from: p */
    public final byte[] f1175p;

    public C0407f(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super("GEOB");
        this.f1172m = str;
        this.f1173n = str2;
        this.f1174o = str3;
        this.f1175p = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0407f.class != obj.getClass()) {
            return false;
        }
        p049M0.C0407f c0407f = (p049M0.C0407f) obj;
        return p086W.AbstractC0805y.m1606a(this.f1172m, c0407f.f1172m) && p086W.AbstractC0805y.m1606a(this.f1173n, c0407f.f1173n) && p086W.AbstractC0805y.m1606a(this.f1174o, c0407f.f1174o) && java.util.Arrays.equals(this.f1175p, c0407f.f1175p);
    }

    public final int hashCode() {
        java.lang.String str = this.f1172m;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f1173n;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f1174o;
        return java.util.Arrays.hashCode(this.f1175p) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p049M0.AbstractC0410i
    public final java.lang.String toString() {
        return this.f1181l + ": mimeType=" + this.f1172m + ", filename=" + this.f1173n + ", description=" + this.f1174o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1172m);
        parcel.writeString(this.f1173n);
        parcel.writeString(this.f1174o);
        parcel.writeByteArray(this.f1175p);
    }

    public C0407f(android.os.Parcel parcel) {
        super("GEOB");
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1172m = readString;
        this.f1173n = parcel.readString();
        this.f1174o = parcel.readString();
        this.f1175p = parcel.createByteArray();
    }
}
