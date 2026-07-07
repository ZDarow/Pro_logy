package p111c;

/* renamed from: c.d */
/* loaded from: classes.dex */
public class C1201d implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p111c.C1201d> CREATOR = new p104a2.C1009g(6);

    /* renamed from: l */
    public p111c.InterfaceC1199b f4630l;

    /* renamed from: d */
    public void mo2059d(int i4, android.os.Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m2838e(int i4, android.os.Bundle bundle) {
        p111c.InterfaceC1199b interfaceC1199b = this.f4630l;
        if (interfaceC1199b != null) {
            try {
                interfaceC1199b.mo2837g0(i4, bundle);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        synchronized (this) {
            try {
                if (this.f4630l == null) {
                    this.f4630l = new p111c.BinderC1200c(this);
                }
                parcel.writeStrongBinder(this.f4630l.asBinder());
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
