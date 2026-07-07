package S2;

import L.k;
import W.o;
import W.p;
import W.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import c0.C0206e;
import c0.C0210i;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2063b;

    public /* synthetic */ g(int i4, Object obj) {
        this.f2062a = i4;
        this.f2063b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        switch (this.f2062a) {
            case 0:
                if ("close action".equals(intent.getAction())) {
                    ((WebViewActivity) this.f2063b).finish();
                    return;
                }
                return;
            case 1:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i4 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i4 = type != 9 ? 8 : 7;
                                        }
                                        i4 = 5;
                                    }
                                }
                                i4 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case k.FLOAT_FIELD_NUMBER /* 2 */:
                                    i4 = 3;
                                    break;
                                case k.INTEGER_FIELD_NUMBER /* 3 */:
                                case k.LONG_FIELD_NUMBER /* 4 */:
                                case k.STRING_FIELD_NUMBER /* 5 */:
                                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                                case k.BYTES_FIELD_NUMBER /* 8 */:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i4 = 4;
                                    break;
                                case 13:
                                    i4 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i4 = 6;
                                    break;
                                case 18:
                                    i4 = 2;
                                    break;
                                case 20:
                                    if (y.f2709a >= 29) {
                                        i4 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i4 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i5 = y.f2709a;
                p pVar = (p) this.f2063b;
                if (i5 < 31 || i4 != 5) {
                    p.a(i4, pVar);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    telephonyManager.getClass();
                    o oVar = new o(pVar);
                    mainExecutor = context.getMainExecutor();
                    telephonyManager.registerTelephonyCallback(mainExecutor, oVar);
                    telephonyManager.unregisterTelephonyCallback(oVar);
                    return;
                } catch (RuntimeException unused2) {
                    p.a(5, pVar);
                    return;
                }
            default:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C0210i c0210i = (C0210i) this.f2063b;
                c0210i.a(C0206e.c(context, intent, c0210i.f4619i, c0210i.f4618h));
                return;
        }
    }
}
