package p049M0;

/* renamed from: M0.m */
/* loaded from: classes.dex */
public final class C0414m extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0414m> CREATOR = new p024F.C0206i(18);

    /* renamed from: m */
    public final java.lang.String f1191m;

    /* renamed from: n */
    public final byte[] f1192n;

    public C0414m(java.lang.String str, byte[] bArr) {
        super("PRIV");
        this.f1191m = str;
        this.f1192n = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0414m.class != obj.getClass()) {
            return false;
        }
        p049M0.C0414m c0414m = (p049M0.C0414m) obj;
        return p086W.AbstractC0805y.m1606a(this.f1191m, c0414m.f1191m) && java.util.Arrays.equals(this.f1192n, c0414m.f1192n);
    }

    public final int hashCode() {
        java.lang.String str = this.f1191m;
        return java.util.Arrays.hashCode(this.f1192n) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p049M0.AbstractC0410i
    public final java.lang.String toString() {
        return this.f1181l + ": owner=" + this.f1191m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1191m);
        parcel.writeByteArray(this.f1192n);
    }

    public C0414m(android.os.Parcel parcel) {
        super("PRIV");
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1191m = readString;
        this.f1192n = parcel.createByteArray();
    }
}
