package c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197a implements InterfaceC0198b {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f4465c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4465c;
    }

    @Override // c.InterfaceC0198b
    public final void g0(int i4, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0198b.f4466b);
            obtain.writeInt(i4);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4465c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
