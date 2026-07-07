package p058O1;

/* renamed from: O1.r */
/* loaded from: classes.dex */
public final class C0514r implements android.os.IInterface {

    /* renamed from: c */
    public final android.os.IBinder f1526c;

    public C0514r(android.os.IBinder iBinder) {
        this.f1526c = iBinder;
    }

    /* renamed from: K */
    public final void m1013K(p058O1.BinderC0517u binderC0517u, p058O1.C0501e c0501e) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(binderC0517u);
            obtain.writeInt(1);
            p057O0.C0488g.m997a(c0501e, obtain, 0);
            this.f1526c.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f1526c;
    }
}
