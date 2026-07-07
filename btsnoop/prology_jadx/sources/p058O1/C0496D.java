package p058O1;

/* renamed from: O1.D */
/* loaded from: classes.dex */
public final class C0496D implements p058O1.InterfaceC0502f, android.os.IInterface {

    /* renamed from: c */
    public final android.os.IBinder f1460c;

    public C0496D(android.os.IBinder iBinder) {
        this.f1460c = iBinder;
    }

    /* renamed from: K */
    public final android.accounts.Account m1002K() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = android.os.Parcel.obtain();
        try {
            this.f1460c.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (android.accounts.Account) p092X1.AbstractC0839a.m1678a(obtain, android.accounts.Account.CREATOR);
        } catch (java.lang.RuntimeException e4) {
            throw e4;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f1460c;
    }
}
