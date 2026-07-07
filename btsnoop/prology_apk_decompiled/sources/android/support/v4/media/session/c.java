package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f3699c;

    @Override // android.support.v4.media.session.d
    public final PendingIntent N() {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3699c;
    }

    @Override // android.support.v4.media.session.d
    public final void k(b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(bVar);
            this.f3699c.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.d
    public final boolean k0(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.support.v4.media.session.d
    public final void r(b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(bVar);
            this.f3699c.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
