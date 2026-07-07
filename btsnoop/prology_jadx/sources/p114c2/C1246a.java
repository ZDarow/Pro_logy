package p114c2;

/* renamed from: c2.a */
/* loaded from: classes.dex */
public final class C1246a extends com.google.android.gms.common.internal.AbstractC1253a implements p050M1.InterfaceC0419c {

    /* renamed from: J */
    public final boolean f4868J;

    /* renamed from: K */
    public final p013C2.C0139d f4869K;

    /* renamed from: L */
    public final android.os.Bundle f4870L;

    /* renamed from: M */
    public final java.lang.Integer f4871M;

    public C1246a(android.content.Context context, android.os.Looper looper, p013C2.C0139d c0139d, android.os.Bundle bundle, p050M1.InterfaceC0423g interfaceC0423g, p050M1.InterfaceC0424h interfaceC0424h) {
        super(context, looper, 44, c0139d, interfaceC0423g, interfaceC0424h);
        this.f4868J = true;
        this.f4869K = c0139d;
        this.f4870L = bundle;
        this.f4871M = (java.lang.Integer) c0139d.f380f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a, p050M1.InterfaceC0419c
    /* renamed from: j */
    public final boolean mo893j() {
        return this.f4868J;
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: m */
    public final int mo896m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: n */
    public final android.os.IInterface mo1078n(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof p114c2.C1249d ? (p114c2.C1249d) queryLocalInterface : new p088W1.AbstractC0815a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: p */
    public final android.os.Bundle mo1080p() {
        p013C2.C0139d c0139d = this.f4869K;
        boolean equals = this.f4925n.getPackageName().equals((java.lang.String) c0139d.f377c);
        android.os.Bundle bundle = this.f4870L;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (java.lang.String) c0139d.f377c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: r */
    public final java.lang.String mo1081r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1253a
    /* renamed from: s */
    public final java.lang.String mo1082s() {
        return "com.google.android.gms.signin.service.START";
    }
}
