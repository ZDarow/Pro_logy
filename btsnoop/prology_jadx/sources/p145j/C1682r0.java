package p145j;

/* renamed from: j.r0 */
/* loaded from: classes.dex */
public final class C1682r0 extends p031H.AbstractC0243c {
    public static final android.os.Parcelable.Creator<p145j.C1682r0> CREATOR = new p031H.C0242b(2);

    /* renamed from: n */
    public int f6993n;

    /* renamed from: o */
    public boolean f6994o;

    public C1682r0(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6993n = parcel.readInt();
        this.f6994o = parcel.readInt() != 0;
    }

    @Override // p031H.AbstractC0243c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f6993n);
        parcel.writeInt(this.f6994o ? 1 : 0);
    }
}
