package p049M0;

/* renamed from: M0.d */
/* loaded from: classes.dex */
public final class C0405d extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0405d> CREATOR = new p024F.C0206i(13);

    /* renamed from: m */
    public final java.lang.String f1164m;

    /* renamed from: n */
    public final boolean f1165n;

    /* renamed from: o */
    public final boolean f1166o;

    /* renamed from: p */
    public final java.lang.String[] f1167p;

    /* renamed from: q */
    public final p049M0.AbstractC0410i[] f1168q;

    public C0405d(java.lang.String str, boolean z4, boolean z5, java.lang.String[] strArr, p049M0.AbstractC0410i[] abstractC0410iArr) {
        super("CTOC");
        this.f1164m = str;
        this.f1165n = z4;
        this.f1166o = z5;
        this.f1167p = strArr;
        this.f1168q = abstractC0410iArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0405d.class != obj.getClass()) {
            return false;
        }
        p049M0.C0405d c0405d = (p049M0.C0405d) obj;
        return this.f1165n == c0405d.f1165n && this.f1166o == c0405d.f1166o && p086W.AbstractC0805y.m1606a(this.f1164m, c0405d.f1164m) && java.util.Arrays.equals(this.f1167p, c0405d.f1167p) && java.util.Arrays.equals(this.f1168q, c0405d.f1168q);
    }

    public final int hashCode() {
        int i4 = (((527 + (this.f1165n ? 1 : 0)) * 31) + (this.f1166o ? 1 : 0)) * 31;
        java.lang.String str = this.f1164m;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1164m);
        parcel.writeByte(this.f1165n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1166o ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f1167p);
        p049M0.AbstractC0410i[] abstractC0410iArr = this.f1168q;
        parcel.writeInt(abstractC0410iArr.length);
        for (p049M0.AbstractC0410i abstractC0410i : abstractC0410iArr) {
            parcel.writeParcelable(abstractC0410i, 0);
        }
    }

    public C0405d(android.os.Parcel parcel) {
        super("CTOC");
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1164m = readString;
        this.f1165n = parcel.readByte() != 0;
        this.f1166o = parcel.readByte() != 0;
        this.f1167p = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f1168q = new p049M0.AbstractC0410i[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f1168q[i5] = (p049M0.AbstractC0410i) parcel.readParcelable(p049M0.AbstractC0410i.class.getClassLoader());
        }
    }
}
