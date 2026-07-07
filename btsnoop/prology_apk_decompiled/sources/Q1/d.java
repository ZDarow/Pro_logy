package Q1;

import N1.o;
import O1.k;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.a {
    public final k J;

    public d(Context context, Looper looper, C2.d dVar, k kVar, o oVar, o oVar2) {
        super(context, looper, 270, dVar, oVar, oVar2);
        this.J = kVar;
    }

    @Override // M1.c
    public final int m() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new W1.a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final L1.c[] o() {
        return W1.d.f2817b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        this.J.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
