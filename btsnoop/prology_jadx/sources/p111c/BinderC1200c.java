package p111c;

/* renamed from: c.c */
/* loaded from: classes.dex */
public final class BinderC1200c extends android.os.Binder implements p111c.InterfaceC1199b {

    /* renamed from: d */
    public static final /* synthetic */ int f4628d = 0;

    /* renamed from: c */
    public final /* synthetic */ p111c.C1201d f4629c;

    public BinderC1200c(p111c.C1201d c1201d) {
        this.f4629c = c1201d;
        attachInterface(this, p111c.InterfaceC1199b.f4627b);
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    @Override // p111c.InterfaceC1199b
    /* renamed from: g0 */
    public final void mo2837g0(int i4, android.os.Bundle bundle) {
        p111c.C1201d c1201d = this.f4629c;
        c1201d.getClass();
        c1201d.mo2059d(i4, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, android.os.Parcel parcel, android.os.Parcel parcel2, int i5) {
        java.lang.String str = p111c.InterfaceC1199b.f4627b;
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i4 != 1) {
            return super.onTransact(i4, parcel, parcel2, i5);
        }
        mo2837g0(parcel.readInt(), (android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
