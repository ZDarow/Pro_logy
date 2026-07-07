package p132g0;

/* renamed from: g0.s */
/* loaded from: classes.dex */
public final class C1474s implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p132g0.C1474s> CREATOR = new p104a2.C1009g(11);

    /* renamed from: l */
    public final int f6002l;

    /* renamed from: m */
    public final int f6003m;

    /* renamed from: n */
    public final java.lang.String f6004n;

    /* renamed from: o */
    public final java.lang.String f6005o;

    /* renamed from: p */
    public final java.lang.String f6006p;

    /* renamed from: q */
    public final java.lang.String f6007q;

    public C1474s(int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f6002l = i4;
        this.f6003m = i5;
        this.f6004n = str;
        this.f6005o = str2;
        this.f6006p = str3;
        this.f6007q = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p132g0.C1474s.class != obj.getClass()) {
            return false;
        }
        p132g0.C1474s c1474s = (p132g0.C1474s) obj;
        return this.f6002l == c1474s.f6002l && this.f6003m == c1474s.f6003m && android.text.TextUtils.equals(this.f6004n, c1474s.f6004n) && android.text.TextUtils.equals(this.f6005o, c1474s.f6005o) && android.text.TextUtils.equals(this.f6006p, c1474s.f6006p) && android.text.TextUtils.equals(this.f6007q, c1474s.f6007q);
    }

    public final int hashCode() {
        int i4 = ((this.f6002l * 31) + this.f6003m) * 31;
        java.lang.String str = this.f6004n;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f6005o;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f6006p;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        java.lang.String str4 = this.f6007q;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f6002l);
        parcel.writeInt(this.f6003m);
        parcel.writeString(this.f6004n);
        parcel.writeString(this.f6005o);
        parcel.writeString(this.f6006p);
        parcel.writeString(this.f6007q);
    }

    public C1474s(android.os.Parcel parcel) {
        this.f6002l = parcel.readInt();
        this.f6003m = parcel.readInt();
        this.f6004n = parcel.readString();
        this.f6005o = parcel.readString();
        this.f6006p = parcel.readString();
        this.f6007q = parcel.readString();
    }
}
