package p031H;

/* renamed from: H.c */
/* loaded from: classes.dex */
public abstract class AbstractC0243c implements android.os.Parcelable {

    /* renamed from: l */
    public final android.os.Parcelable f709l;

    /* renamed from: m */
    public static final p031H.C0241a f708m = new p031H.AbstractC0243c();
    public static final android.os.Parcelable.Creator<p031H.AbstractC0243c> CREATOR = new p031H.C0242b(0);

    public AbstractC0243c() {
        this.f709l = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeParcelable(this.f709l, i4);
    }

    public AbstractC0243c(android.os.Parcelable parcelable) {
        if (parcelable != null) {
            this.f709l = parcelable == f708m ? null : parcelable;
            return;
        }
        throw new java.lang.IllegalArgumentException("superState must not be null");
    }

    public AbstractC0243c(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f709l = readParcelable == null ? f708m : readParcelable;
    }
}
