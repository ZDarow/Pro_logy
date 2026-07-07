package Y1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.a {
    public final n.j J;

    /* renamed from: K, reason: collision with root package name */
    public final n.j f3091K;

    /* renamed from: L, reason: collision with root package name */
    public final n.j f3092L;

    public i(Context context, Looper looper, C2.d dVar, N1.o oVar, N1.o oVar2) {
        super(context, looper, 23, dVar, oVar, oVar2);
        this.J = new n.j(0);
        this.f3091K = new n.j(0);
        this.f3092L = new n.j(0);
    }

    @Override // M1.c
    public final int m() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof x ? (x) queryLocalInterface : new W1.a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final L1.c[] o() {
        return a2.j.f3622a;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final void u() {
        System.currentTimeMillis();
        synchronized (this.J) {
            this.J.clear();
        }
        synchronized (this.f3091K) {
            this.f3091K.clear();
        }
        synchronized (this.f3092L) {
            this.f3092L.clear();
        }
    }
}
