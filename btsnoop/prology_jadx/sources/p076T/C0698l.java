package p076T;

/* renamed from: T.l */
/* loaded from: classes.dex */
public final class C0698l implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p076T.C0698l> CREATOR = new p057O0.C0488g(13);

    /* renamed from: l */
    public int f2340l;

    /* renamed from: m */
    public final java.util.UUID f2341m;

    /* renamed from: n */
    public final java.lang.String f2342n;

    /* renamed from: o */
    public final java.lang.String f2343o;

    /* renamed from: p */
    public final byte[] f2344p;

    public C0698l(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
        uuid.getClass();
        this.f2341m = uuid;
        this.f2342n = str;
        str2.getClass();
        this.f2343o = p076T.AbstractC0665H.m1201l(str2);
        this.f2344p = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p076T.C0698l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        p076T.C0698l c0698l = (p076T.C0698l) obj;
        return p086W.AbstractC0805y.m1606a(this.f2342n, c0698l.f2342n) && p086W.AbstractC0805y.m1606a(this.f2343o, c0698l.f2343o) && p086W.AbstractC0805y.m1606a(this.f2341m, c0698l.f2341m) && java.util.Arrays.equals(this.f2344p, c0698l.f2344p);
    }

    public final int hashCode() {
        if (this.f2340l == 0) {
            int hashCode = this.f2341m.hashCode() * 31;
            java.lang.String str = this.f2342n;
            this.f2340l = java.util.Arrays.hashCode(this.f2344p) + ((this.f2343o.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }
        return this.f2340l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        java.util.UUID uuid = this.f2341m;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f2342n);
        parcel.writeString(this.f2343o);
        parcel.writeByteArray(this.f2344p);
    }

    public C0698l(android.os.Parcel parcel) {
        this.f2341m = new java.util.UUID(parcel.readLong(), parcel.readLong());
        this.f2342n = parcel.readString();
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f2343o = readString;
        this.f2344p = parcel.createByteArray();
    }
}
