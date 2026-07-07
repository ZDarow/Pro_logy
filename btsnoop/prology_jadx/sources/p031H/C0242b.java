package p031H;

/* renamed from: H.b */
/* loaded from: classes.dex */
public final class C0242b implements android.os.Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    public final /* synthetic */ int f707a;

    public /* synthetic */ C0242b(int i4) {
        this.f707a = i4;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        switch (this.f707a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return p031H.AbstractC0243c.f708m;
                }
                throw new java.lang.IllegalStateException("superState must be null");
            case 1:
                return new p145j.C1656e0(parcel, classLoader);
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new p145j.C1682r0(parcel, classLoader);
            default:
                return new p152k1.C1787z(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i4) {
        switch (this.f707a) {
            case 0:
                return new p031H.AbstractC0243c[i4];
            case 1:
                return new p145j.C1656e0[i4];
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new p145j.C1682r0[i4];
            default:
                return new p152k1.C1787z[i4];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f707a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return p031H.AbstractC0243c.f708m;
                }
                throw new java.lang.IllegalStateException("superState must be null");
            case 1:
                return new p145j.C1656e0(parcel, null);
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new p145j.C1682r0(parcel, null);
            default:
                return new p152k1.C1787z(parcel, null);
        }
    }
}
