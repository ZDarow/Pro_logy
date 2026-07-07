package O1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class w extends p {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f1484g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1485h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.google.android.gms.common.internal.a aVar, int i4, IBinder iBinder, Bundle bundle) {
        super(aVar, i4, bundle);
        this.f1485h = aVar;
        this.f1484g = iBinder;
    }

    @Override // O1.p
    public final void a(L1.a aVar) {
        h hVar = this.f1485h.f4762z;
        if (hVar != null) {
            ((M1.h) hVar.f1446a).f0(aVar);
        }
        System.currentTimeMillis();
    }

    @Override // O1.p
    public final boolean b() {
        IBinder iBinder = this.f1484g;
        try {
            s.d(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f1485h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface n4 = aVar.n(iBinder);
            if (n4 == null || !(com.google.android.gms.common.internal.a.v(aVar, 2, 4, n4) || com.google.android.gms.common.internal.a.v(aVar, 3, 4, n4))) {
                return false;
            }
            aVar.f4745D = null;
            h hVar = aVar.f4761y;
            if (hVar == null) {
                return true;
            }
            ((M1.g) hVar.f1446a).V();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
