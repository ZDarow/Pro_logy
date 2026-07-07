package p049M0;

/* renamed from: M0.c */
/* loaded from: classes.dex */
public final class C0404c extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0404c> CREATOR = new p024F.C0206i(12);

    /* renamed from: m */
    public final java.lang.String f1158m;

    /* renamed from: n */
    public final int f1159n;

    /* renamed from: o */
    public final int f1160o;

    /* renamed from: p */
    public final long f1161p;

    /* renamed from: q */
    public final long f1162q;

    /* renamed from: r */
    public final p049M0.AbstractC0410i[] f1163r;

    public C0404c(java.lang.String str, int i4, int i5, long j4, long j5, p049M0.AbstractC0410i[] abstractC0410iArr) {
        super("CHAP");
        this.f1158m = str;
        this.f1159n = i4;
        this.f1160o = i5;
        this.f1161p = j4;
        this.f1162q = j5;
        this.f1163r = abstractC0410iArr;
    }

    @Override // p049M0.AbstractC0410i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0404c.class != obj.getClass()) {
            return false;
        }
        p049M0.C0404c c0404c = (p049M0.C0404c) obj;
        return this.f1159n == c0404c.f1159n && this.f1160o == c0404c.f1160o && this.f1161p == c0404c.f1161p && this.f1162q == c0404c.f1162q && p086W.AbstractC0805y.m1606a(this.f1158m, c0404c.f1158m) && java.util.Arrays.equals(this.f1163r, c0404c.f1163r);
    }

    public final int hashCode() {
        int i4 = (((((((527 + this.f1159n) * 31) + this.f1160o) * 31) + ((int) this.f1161p)) * 31) + ((int) this.f1162q)) * 31;
        java.lang.String str = this.f1158m;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1158m);
        parcel.writeInt(this.f1159n);
        parcel.writeInt(this.f1160o);
        parcel.writeLong(this.f1161p);
        parcel.writeLong(this.f1162q);
        p049M0.AbstractC0410i[] abstractC0410iArr = this.f1163r;
        parcel.writeInt(abstractC0410iArr.length);
        for (p049M0.AbstractC0410i abstractC0410i : abstractC0410iArr) {
            parcel.writeParcelable(abstractC0410i, 0);
        }
    }

    public C0404c(android.os.Parcel parcel) {
        super("CHAP");
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1158m = readString;
        this.f1159n = parcel.readInt();
        this.f1160o = parcel.readInt();
        this.f1161p = parcel.readLong();
        this.f1162q = parcel.readLong();
        int readInt = parcel.readInt();
        this.f1163r = new p049M0.AbstractC0410i[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f1163r[i5] = (p049M0.AbstractC0410i) parcel.readParcelable(p049M0.AbstractC0410i.class.getClassLoader());
        }
    }
}
