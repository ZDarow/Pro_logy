package O1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class u extends W1.b {

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f1480d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1481e;

    public u(com.google.android.gms.common.internal.a aVar, int i4) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f1480d = aVar;
        this.f1481e = i4;
    }

    @Override // W1.b
    public final boolean m0(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) X1.a.a(parcel, Bundle.CREATOR);
            X1.a.b(parcel);
            s.e(this.f1480d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f1480d;
            aVar.getClass();
            w wVar = new w(aVar, readInt, readStrongBinder, bundle);
            t tVar = aVar.f4754p;
            tVar.sendMessage(tVar.obtainMessage(1, this.f1481e, -1, wVar));
            this.f1480d = null;
        } else if (i4 == 2) {
            parcel.readInt();
            X1.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i4 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            y yVar = (y) X1.a.a(parcel, y.CREATOR);
            X1.a.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f1480d;
            s.e(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            s.d(yVar);
            aVar2.f4747F = yVar;
            if (aVar2 instanceof Y1.i) {
                C0064d c0064d = yVar.f1490o;
                h b4 = h.b();
                i iVar = c0064d == null ? null : c0064d.f1416l;
                synchronized (b4) {
                    if (iVar == null) {
                        iVar = h.f1445c;
                    } else {
                        i iVar2 = (i) b4.f1446a;
                        if (iVar2 != null) {
                            if (iVar2.f1447l < iVar.f1447l) {
                            }
                        }
                    }
                    b4.f1446a = iVar;
                }
            }
            Bundle bundle2 = yVar.f1487l;
            s.e(this.f1480d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f1480d;
            aVar3.getClass();
            w wVar2 = new w(aVar3, readInt2, readStrongBinder2, bundle2);
            t tVar2 = aVar3.f4754p;
            tVar2.sendMessage(tVar2.obtainMessage(1, this.f1481e, -1, wVar2));
            this.f1480d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
