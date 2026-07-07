package p096Y1;

/* renamed from: Y1.i */
/* loaded from: classes.dex */
public final class C0898i extends com.google.android.gms.common.internal.AbstractC1253a {

    /* renamed from: J */
    public final p165n.C1883j f3201J;

    /* renamed from: K */
    public final p165n.C1883j f3202K;

    /* renamed from: L */
    public final p165n.C1883j f3203L;

    public C0898i(android.content.Context context, android.os.Looper looper, p013C2.C0139d c0139d, p054N1.C0460o c0460o, p054N1.C0460o c0460o2) {
        super(context, looper, 23, c0139d, c0460o, c0460o2);
        this.f3201J = new p165n.C1883j(0);
        this.f3202K = new p165n.C1883j(0);
        this.f3203L = new p165n.C1883j(0);
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: m */
    public final int mo896m() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: n */
    public final android.os.IInterface mo1078n(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof p096Y1.C0913x ? (p096Y1.C0913x) queryLocalInterface : new p088W1.AbstractC0815a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 1);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: o */
    public final p046L1.C0359c[] mo1079o() {
        return p104a2.AbstractC1012j.f3746a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: r */
    public final java.lang.String mo1081r() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: s */
    public final java.lang.String mo1082s() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: u */
    public final void mo1740u() {
        java.lang.System.currentTimeMillis();
        synchronized (this.f3201J) {
            this.f3201J.clear();
        }
        synchronized (this.f3202K) {
            this.f3202K.clear();
        }
        synchronized (this.f3203L) {
            this.f3203L.clear();
        }
    }
}
