package O1;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class D implements f, IInterface {

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f1412c;

    public D(IBinder iBinder) {
        this.f1412c = iBinder;
    }

    public final Account K() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f1412c.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) X1.a.a(obtain, Account.CREATOR);
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1412c;
    }
}
