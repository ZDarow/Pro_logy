package W1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2811c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f2812d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2813e;

    public /* synthetic */ a(IBinder iBinder, String str, int i4) {
        this.f2811c = i4;
        this.f2812d = iBinder;
        this.f2813e = str;
    }

    public Parcel K() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2813e);
        return obtain;
    }

    public void V(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2812d.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f2811c) {
            case 0:
                return this.f2812d;
            default:
                return this.f2812d;
        }
    }
}
