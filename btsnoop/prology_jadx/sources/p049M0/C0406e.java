package p049M0;

/* renamed from: M0.e */
/* loaded from: classes.dex */
public final class C0406e extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0406e> CREATOR = new p024F.C0206i(14);

    /* renamed from: m */
    public final java.lang.String f1169m;

    /* renamed from: n */
    public final java.lang.String f1170n;

    /* renamed from: o */
    public final java.lang.String f1171o;

    public C0406e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("COMM");
        this.f1169m = str;
        this.f1170n = str2;
        this.f1171o = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0406e.class != obj.getClass()) {
            return false;
        }
        p049M0.C0406e c0406e = (p049M0.C0406e) obj;
        return p086W.AbstractC0805y.m1606a(this.f1170n, c0406e.f1170n) && p086W.AbstractC0805y.m1606a(this.f1169m, c0406e.f1169m) && p086W.AbstractC0805y.m1606a(this.f1171o, c0406e.f1171o);
    }

    public final int hashCode() {
        java.lang.String str = this.f1169m;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f1170n;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f1171o;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p049M0.AbstractC0410i
    public final java.lang.String toString() {
        return this.f1181l + ": language=" + this.f1169m + ", description=" + this.f1170n + ", text=" + this.f1171o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1181l);
        parcel.writeString(this.f1169m);
        parcel.writeString(this.f1171o);
    }

    public C0406e(android.os.Parcel parcel) {
        super("COMM");
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1169m = readString;
        this.f1170n = parcel.readString();
        this.f1171o = parcel.readString();
    }
}
