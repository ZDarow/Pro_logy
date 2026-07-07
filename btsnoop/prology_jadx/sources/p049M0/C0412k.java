package p049M0;

/* renamed from: M0.k */
/* loaded from: classes.dex */
public final class C0412k extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0412k> CREATOR = new p024F.C0206i(16);

    /* renamed from: m */
    public final java.lang.String f1183m;

    /* renamed from: n */
    public final java.lang.String f1184n;

    /* renamed from: o */
    public final java.lang.String f1185o;

    public C0412k(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("----");
        this.f1183m = str;
        this.f1184n = str2;
        this.f1185o = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0412k.class != obj.getClass()) {
            return false;
        }
        p049M0.C0412k c0412k = (p049M0.C0412k) obj;
        return p086W.AbstractC0805y.m1606a(this.f1184n, c0412k.f1184n) && p086W.AbstractC0805y.m1606a(this.f1183m, c0412k.f1183m) && p086W.AbstractC0805y.m1606a(this.f1185o, c0412k.f1185o);
    }

    public final int hashCode() {
        java.lang.String str = this.f1183m;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f1184n;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f1185o;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p049M0.AbstractC0410i
    public final java.lang.String toString() {
        return this.f1181l + ": domain=" + this.f1183m + ", description=" + this.f1184n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1181l);
        parcel.writeString(this.f1183m);
        parcel.writeString(this.f1185o);
    }

    public C0412k(android.os.Parcel parcel) {
        super("----");
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1183m = readString;
        this.f1184n = parcel.readString();
        this.f1185o = parcel.readString();
    }
}
