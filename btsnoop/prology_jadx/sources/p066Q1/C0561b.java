package p066Q1;

/* renamed from: Q1.b */
/* loaded from: classes.dex */
public final class C0561b extends p101a.AbstractC0936a {

    /* renamed from: k */
    public final /* synthetic */ int f1762k;

    @Override // p101a.AbstractC0936a
    /* renamed from: e */
    public p050M1.InterfaceC0419c mo1076e(android.content.Context context, android.os.Looper looper, p013C2.C0139d c0139d, java.lang.Object obj, p050M1.InterfaceC0423g interfaceC0423g, p050M1.InterfaceC0424h interfaceC0424h) {
        switch (this.f1762k) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                c0139d.getClass();
                java.lang.Integer num = (java.lang.Integer) c0139d.f380f;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new p114c2.C1246a(context, looper, c0139d, bundle, interfaceC0423g, interfaceC0424h);
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                obj.getClass();
                throw new java.lang.ClassCastException();
            default:
                return super.mo1076e(context, looper, c0139d, obj, interfaceC0423g, interfaceC0424h);
        }
    }

    @Override // p101a.AbstractC0936a
    /* renamed from: f */
    public /* synthetic */ p050M1.InterfaceC0419c mo1077f(android.content.Context context, android.os.Looper looper, p013C2.C0139d c0139d, java.lang.Object obj, p054N1.C0460o c0460o, p054N1.C0460o c0460o2) {
        switch (this.f1762k) {
            case 0:
                return new p066Q1.C0563d(context, looper, c0139d, (p058O1.C0507k) obj, c0460o, c0460o2);
            case 1:
                return new p096Y1.C0898i(context, looper, c0139d, c0460o, c0460o2);
            default:
                return super.mo1077f(context, looper, c0139d, obj, c0460o, c0460o2);
        }
    }
}
