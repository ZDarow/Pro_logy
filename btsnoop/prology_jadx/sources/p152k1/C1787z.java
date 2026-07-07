package p152k1;

/* renamed from: k1.z */
/* loaded from: classes.dex */
public final class C1787z extends p031H.AbstractC0243c {
    public static final android.os.Parcelable.Creator<p152k1.C1787z> CREATOR = new p031H.C0242b(3);

    /* renamed from: n */
    public android.os.Parcelable f7304n;

    public C1787z(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7304n = parcel.readParcelable(classLoader == null ? p152k1.AbstractC1780s.class.getClassLoader() : classLoader);
    }

    @Override // p031H.AbstractC0243c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeParcelable(this.f7304n, 0);
    }
}
