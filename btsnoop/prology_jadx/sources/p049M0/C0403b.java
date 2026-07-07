package p049M0;

/* renamed from: M0.b */
/* loaded from: classes.dex */
public final class C0403b extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0403b> CREATOR = new p024F.C0206i(11);

    /* renamed from: m */
    public final byte[] f1157m;

    public C0403b(java.lang.String str, byte[] bArr) {
        super(str);
        this.f1157m = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0403b.class != obj.getClass()) {
            return false;
        }
        p049M0.C0403b c0403b = (p049M0.C0403b) obj;
        return this.f1181l.equals(c0403b.f1181l) && java.util.Arrays.equals(this.f1157m, c0403b.f1157m);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f1157m) + ((this.f1181l.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1181l);
        parcel.writeByteArray(this.f1157m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0403b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p086W.AbstractC0805y.f2801a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f1157m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p049M0.C0403b.<init>(android.os.Parcel):void");
    }
}
