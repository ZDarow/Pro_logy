package p088W1;

/* renamed from: W1.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0816b extends android.os.Binder implements android.os.IInterface {

    /* renamed from: c */
    public final /* synthetic */ int f2910c;

    public AbstractBinderC0816b(java.lang.String str, int i4) {
        this.f2910c = i4;
        switch (i4) {
            case 1:
                attachInterface(this, str);
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                attachInterface(this, str);
                return;
            default:
                attachInterface(this, str);
                return;
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        int i4 = this.f2910c;
        return this;
    }

    /* renamed from: l0 */
    public abstract boolean mo1659l0(int i4, android.os.Parcel parcel, android.os.Parcel parcel2);

    /* renamed from: m0 */
    public boolean mo826m0(int i4, android.os.Parcel parcel, android.os.Parcel parcel2) {
        return false;
    }

    /* renamed from: n0 */
    public abstract boolean mo1660n0(android.os.Parcel parcel, int i4);

    @Override // android.os.Binder
    public final boolean onTransact(int i4, android.os.Parcel parcel, android.os.Parcel parcel2, int i5) {
        switch (this.f2910c) {
            case 0:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                return mo1659l0(i4, parcel, parcel2);
            case 1:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                return mo826m0(i4, parcel, parcel2);
            default:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                return mo1660n0(parcel, i4);
        }
    }
}
