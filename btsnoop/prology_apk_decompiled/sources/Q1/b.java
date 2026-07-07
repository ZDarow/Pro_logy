package Q1;

import L.k;
import M1.g;
import M1.h;
import N1.o;
import Y1.i;
import a.AbstractC0110a;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import c2.C0219a;

/* loaded from: classes.dex */
public final class b extends AbstractC0110a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1704k;

    @Override // a.AbstractC0110a
    public M1.c e(Context context, Looper looper, C2.d dVar, Object obj, g gVar, h hVar) {
        switch (this.f1704k) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                dVar.getClass();
                Integer num = (Integer) dVar.f372f;
                Bundle bundle = new Bundle();
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
                return new C0219a(context, looper, dVar, bundle, gVar, hVar);
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.e(context, looper, dVar, obj, gVar, hVar);
        }
    }

    @Override // a.AbstractC0110a
    public /* synthetic */ M1.c f(Context context, Looper looper, C2.d dVar, Object obj, o oVar, o oVar2) {
        switch (this.f1704k) {
            case 0:
                return new d(context, looper, dVar, (O1.k) obj, oVar, oVar2);
            case 1:
                return new i(context, looper, dVar, oVar, oVar2);
            default:
                return super.f(context, looper, dVar, obj, oVar, oVar2);
        }
    }
}
