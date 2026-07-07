package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0199c extends Binder implements InterfaceC0198b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4467d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0200d f4468c;

    public BinderC0199c(C0200d c0200d) {
        this.f4468c = c0200d;
        attachInterface(this, InterfaceC0198b.f4466b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // c.InterfaceC0198b
    public final void g0(int i4, Bundle bundle) {
        C0200d c0200d = this.f4468c;
        c0200d.getClass();
        c0200d.d(i4, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        String str = InterfaceC0198b.f4466b;
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
        g0(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
