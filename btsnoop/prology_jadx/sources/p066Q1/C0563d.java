package p066Q1;

/* renamed from: Q1.d */
/* loaded from: classes.dex */
public final class C0563d extends com.google.android.gms.common.internal.AbstractC1253a {

    /* renamed from: J */
    public final p058O1.C0507k f1764J;

    public C0563d(android.content.Context context, android.os.Looper looper, p013C2.C0139d c0139d, p058O1.C0507k c0507k, p054N1.C0460o c0460o, p054N1.C0460o c0460o2) {
        super(context, looper, 270, c0139d, c0460o, c0460o2);
        this.f1764J = c0507k;
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: m */
    public final int mo896m() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: n */
    public final android.os.IInterface mo1078n(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof p066Q1.C0560a ? (p066Q1.C0560a) queryLocalInterface : new p088W1.AbstractC0815a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: o */
    public final p046L1.C0359c[] mo1079o() {
        return p088W1.AbstractC0818d.f2913b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: p */
    public final android.os.Bundle mo1080p() {
        this.f1764J.getClass();
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: r */
    public final java.lang.String mo1081r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: s */
    public final java.lang.String mo1082s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: t */
    public final boolean mo1083t() {
        return true;
    }
}
