package p088W1;

/* renamed from: W1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0815a implements android.os.IInterface {

    /* renamed from: c */
    public final /* synthetic */ int f2907c;

    /* renamed from: d */
    public final android.os.IBinder f2908d;

    /* renamed from: e */
    public final java.lang.String f2909e;

    public /* synthetic */ AbstractC0815a(android.os.IBinder iBinder, java.lang.String str, int i4) {
        this.f2907c = i4;
        this.f2908d = iBinder;
        this.f2909e = str;
    }

    /* renamed from: K */
    public android.os.Parcel m1657K() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.f2909e);
        return obtain;
    }

    /* renamed from: V */
    public void m1658V(android.os.Parcel parcel, int i4) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            this.f2908d.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        switch (this.f2907c) {
            case 0:
                return this.f2908d;
            default:
                return this.f2908d;
        }
    }
}
