package p090X;

/* renamed from: X.a */
/* loaded from: classes.dex */
public final class C0824a implements p076T.InterfaceC0663F {
    public static final android.os.Parcelable.Creator<p090X.C0824a> CREATOR = new p057O0.C0488g(16);

    /* renamed from: l */
    public final java.lang.String f2915l;

    /* renamed from: m */
    public final byte[] f2916m;

    /* renamed from: n */
    public final int f2917n;

    /* renamed from: o */
    public final int f2918o;

    public C0824a(java.lang.String str, byte[] bArr, int i4, int i5) {
        this.f2915l = str;
        this.f2916m = bArr;
        this.f2917n = i4;
        this.f2918o = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p090X.C0824a.class != obj.getClass()) {
            return false;
        }
        p090X.C0824a c0824a = (p090X.C0824a) obj;
        return this.f2915l.equals(c0824a.f2915l) && java.util.Arrays.equals(this.f2916m, c0824a.f2916m) && this.f2917n == c0824a.f2917n && this.f2918o == c0824a.f2918o;
    }

    public final int hashCode() {
        return ((((java.util.Arrays.hashCode(this.f2916m) + ((this.f2915l.hashCode() + 527) * 31)) * 31) + this.f2917n) * 31) + this.f2918o;
    }

    public final java.lang.String toString() {
        byte[] bArr = this.f2916m;
        int i4 = this.f2918o;
        return "mdta: key=" + this.f2915l + ", value=" + (i4 != 1 ? i4 != 23 ? i4 != 67 ? p086W.AbstractC0805y.m1604Y(bArr) : java.lang.String.valueOf(p101a.AbstractC0936a.m1816x(bArr)) : java.lang.String.valueOf(java.lang.Float.intBitsToFloat(p101a.AbstractC0936a.m1816x(bArr))) : p086W.AbstractC0805y.m1621p(bArr));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f2915l);
        parcel.writeByteArray(this.f2916m);
        parcel.writeInt(this.f2917n);
        parcel.writeInt(this.f2918o);
    }

    public C0824a(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f2915l = readString;
        this.f2916m = parcel.createByteArray();
        this.f2917n = parcel.readInt();
        this.f2918o = parcel.readInt();
    }
}
