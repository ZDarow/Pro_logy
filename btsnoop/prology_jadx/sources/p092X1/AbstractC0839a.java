package p092X1;

/* renamed from: X1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0839a {

    /* renamed from: a */
    public static final /* synthetic */ int f3011a = 0;

    static {
        p092X1.AbstractC0839a.class.getClassLoader();
    }

    /* renamed from: a */
    public static android.os.Parcelable m1678a(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m1679b(android.os.Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new android.os.BadParcelableException(p009B2.AbstractC0051h.m152k("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
