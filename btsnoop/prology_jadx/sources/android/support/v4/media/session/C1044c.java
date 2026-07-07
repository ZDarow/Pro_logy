package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public final class C1044c implements android.support.v4.media.session.InterfaceC1045d {

    /* renamed from: c */
    public android.os.IBinder f3826c;

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: N */
    public final android.app.PendingIntent mo2109N() {
        throw null;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f3826c;
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: k */
    public final void mo2110k(android.support.v4.media.session.InterfaceC1043b interfaceC1043b) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC1043b);
            this.f3826c.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: k0 */
    public final boolean mo2111k0(android.view.KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.support.v4.media.session.InterfaceC1045d
    /* renamed from: r */
    public final void mo2112r(android.support.v4.media.session.InterfaceC1043b interfaceC1043b) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC1043b);
            this.f3826c.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
