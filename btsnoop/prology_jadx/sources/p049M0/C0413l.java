package p049M0;

/* renamed from: M0.l */
/* loaded from: classes.dex */
public final class C0413l extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0413l> CREATOR = new p024F.C0206i(17);

    /* renamed from: m */
    public final int f1186m;

    /* renamed from: n */
    public final int f1187n;

    /* renamed from: o */
    public final int f1188o;

    /* renamed from: p */
    public final int[] f1189p;

    /* renamed from: q */
    public final int[] f1190q;

    public C0413l(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f1186m = i4;
        this.f1187n = i5;
        this.f1188o = i6;
        this.f1189p = iArr;
        this.f1190q = iArr2;
    }

    @Override // p049M0.AbstractC0410i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0413l.class != obj.getClass()) {
            return false;
        }
        p049M0.C0413l c0413l = (p049M0.C0413l) obj;
        return this.f1186m == c0413l.f1186m && this.f1187n == c0413l.f1187n && this.f1188o == c0413l.f1188o && java.util.Arrays.equals(this.f1189p, c0413l.f1189p) && java.util.Arrays.equals(this.f1190q, c0413l.f1190q);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f1190q) + ((java.util.Arrays.hashCode(this.f1189p) + ((((((527 + this.f1186m) * 31) + this.f1187n) * 31) + this.f1188o) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f1186m);
        parcel.writeInt(this.f1187n);
        parcel.writeInt(this.f1188o);
        parcel.writeIntArray(this.f1189p);
        parcel.writeIntArray(this.f1190q);
    }

    public C0413l(android.os.Parcel parcel) {
        super("MLLT");
        this.f1186m = parcel.readInt();
        this.f1187n = parcel.readInt();
        this.f1188o = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1189p = createIntArray;
        this.f1190q = parcel.createIntArray();
    }
}
