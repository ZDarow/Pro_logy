package p111c;

/* renamed from: c.a */
/* loaded from: classes.dex */
public final class C1198a implements p111c.InterfaceC1199b {

    /* renamed from: c */
    public android.os.IBinder f4626c;

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f4626c;
    }

    @Override // p111c.InterfaceC1199b
    /* renamed from: g0 */
    public final void mo2837g0(int i4, android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(p111c.InterfaceC1199b.f4627b);
            obtain.writeInt(i4);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4626c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
