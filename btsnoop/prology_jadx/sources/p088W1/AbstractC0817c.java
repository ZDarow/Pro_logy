package p088W1;

/* renamed from: W1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0817c {

    /* renamed from: a */
    public static final /* synthetic */ int f2911a = 0;

    static {
        p088W1.AbstractC0817c.class.getClassLoader();
    }

    /* renamed from: a */
    public static android.os.Parcelable m1661a(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m1662b(android.os.Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new android.os.BadParcelableException(p009B2.AbstractC0051h.m152k("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
