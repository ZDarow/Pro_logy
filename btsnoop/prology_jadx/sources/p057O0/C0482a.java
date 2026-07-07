package p057O0;

/* renamed from: O0.a */
/* loaded from: classes.dex */
public final class C0482a extends p057O0.AbstractC0483b {
    public static final android.os.Parcelable.Creator<p057O0.C0482a> CREATOR = new p024F.C0206i(27);

    /* renamed from: l */
    public final long f1404l;

    /* renamed from: m */
    public final long f1405m;

    /* renamed from: n */
    public final byte[] f1406n;

    public C0482a(long j4, byte[] bArr, long j5) {
        this.f1404l = j5;
        this.f1405m = j4;
        this.f1406n = bArr;
    }

    @Override // p057O0.AbstractC0483b
    public final java.lang.String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f1404l + ", identifier= " + this.f1405m + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeLong(this.f1404l);
        parcel.writeLong(this.f1405m);
        parcel.writeByteArray(this.f1406n);
    }

    public C0482a(android.os.Parcel parcel) {
        this.f1404l = parcel.readLong();
        this.f1405m = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f1406n = createByteArray;
    }
}
