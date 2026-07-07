package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r implements IInterface {

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f1475c;

    public r(IBinder iBinder) {
        this.f1475c = iBinder;
    }

    public final void K(u uVar, e eVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(uVar);
            obtain.writeInt(1);
            O0.g.a(eVar, obtain, 0);
            this.f1475c.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1475c;
    }
}
