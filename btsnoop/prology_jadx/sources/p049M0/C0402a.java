package p049M0;

/* renamed from: M0.a */
/* loaded from: classes.dex */
public final class C0402a extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0402a> CREATOR = new p024F.C0206i(10);

    /* renamed from: m */
    public final java.lang.String f1153m;

    /* renamed from: n */
    public final java.lang.String f1154n;

    /* renamed from: o */
    public final int f1155o;

    /* renamed from: p */
    public final byte[] f1156p;

    public C0402a(java.lang.String str, java.lang.String str2, int i4, byte[] bArr) {
        super("APIC");
        this.f1153m = str;
        this.f1154n = str2;
        this.f1155o = i4;
        this.f1156p = bArr;
    }

    @Override // p076T.InterfaceC0663F
    /* renamed from: c */
    public final void mo717c(p076T.C0661D c0661d) {
        c0661d.m1180a(this.f1156p, this.f1155o);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0402a.class != obj.getClass()) {
            return false;
        }
        p049M0.C0402a c0402a = (p049M0.C0402a) obj;
        return this.f1155o == c0402a.f1155o && p086W.AbstractC0805y.m1606a(this.f1153m, c0402a.f1153m) && p086W.AbstractC0805y.m1606a(this.f1154n, c0402a.f1154n) && java.util.Arrays.equals(this.f1156p, c0402a.f1156p);
    }

    public final int hashCode() {
        int i4 = (527 + this.f1155o) * 31;
        java.lang.String str = this.f1153m;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f1154n;
        return java.util.Arrays.hashCode(this.f1156p) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p049M0.AbstractC0410i
    public final java.lang.String toString() {
        return this.f1181l + ": mimeType=" + this.f1153m + ", description=" + this.f1154n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1153m);
        parcel.writeString(this.f1154n);
        parcel.writeInt(this.f1155o);
        parcel.writeByteArray(this.f1156p);
    }

    public C0402a(android.os.Parcel parcel) {
        super("APIC");
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1153m = readString;
        this.f1154n = parcel.readString();
        this.f1155o = parcel.readInt();
        this.f1156p = parcel.createByteArray();
    }
}
