package c;

import a2.g;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0200d implements Parcelable {
    public static final Parcelable.Creator<C0200d> CREATOR = new g(6);

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0198b f4469l;

    public void d(int i4, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i4, Bundle bundle) {
        InterfaceC0198b interfaceC0198b = this.f4469l;
        if (interfaceC0198b != null) {
            try {
                interfaceC0198b.g0(i4, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        synchronized (this) {
            try {
                if (this.f4469l == null) {
                    this.f4469l = new BinderC0199c(this);
                }
                parcel.writeStrongBinder(this.f4469l.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
