package W1;

import L.k;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements IInterface {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2814c;

    public b(String str, int i4) {
        this.f2814c = i4;
        switch (i4) {
            case 1:
                attachInterface(this, str);
                return;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                attachInterface(this, str);
                return;
            default:
                attachInterface(this, str);
                return;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i4 = this.f2814c;
        return this;
    }

    public abstract boolean l0(int i4, Parcel parcel, Parcel parcel2);

    public boolean m0(int i4, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean n0(Parcel parcel, int i4);

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        switch (this.f2814c) {
            case 0:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                return l0(i4, parcel, parcel2);
            case 1:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                return m0(i4, parcel, parcel2);
            default:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i5)) {
                    return true;
                }
                return n0(parcel, i4);
        }
    }
}
