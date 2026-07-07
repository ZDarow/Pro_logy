package p049M0;

/* renamed from: M0.o */
/* loaded from: classes.dex */
public final class C0416o extends p049M0.AbstractC0410i {
    public static final android.os.Parcelable.Creator<p049M0.C0416o> CREATOR = new p024F.C0206i(20);

    /* renamed from: m */
    public final java.lang.String f1195m;

    /* renamed from: n */
    public final java.lang.String f1196n;

    public C0416o(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.f1195m = str2;
        this.f1196n = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p049M0.C0416o.class != obj.getClass()) {
            return false;
        }
        p049M0.C0416o c0416o = (p049M0.C0416o) obj;
        return this.f1181l.equals(c0416o.f1181l) && p086W.AbstractC0805y.m1606a(this.f1195m, c0416o.f1195m) && p086W.AbstractC0805y.m1606a(this.f1196n, c0416o.f1196n);
    }

    public final int hashCode() {
        int hashCode = (this.f1181l.hashCode() + 527) * 31;
        java.lang.String str = this.f1195m;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f1196n;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p049M0.AbstractC0410i
    public final java.lang.String toString() {
        return this.f1181l + ": url=" + this.f1196n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeString(this.f1181l);
        parcel.writeString(this.f1195m);
        parcel.writeString(this.f1196n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0416o(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p086W.AbstractC0805y.f2801a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f1195m = r0
            java.lang.String r3 = r3.readString()
            r2.f1196n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p049M0.C0416o.<init>(android.os.Parcel):void");
    }
}
