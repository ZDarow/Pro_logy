package p075S2;

/* renamed from: S2.g */
/* loaded from: classes.dex */
public final class C0654g extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f2138a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f2139b;

    public /* synthetic */ C0654g(int i4, java.lang.Object obj) {
        this.f2138a = i4;
        this.f2139b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.util.concurrent.Executor mainExecutor;
        switch (this.f2138a) {
            case 0:
                if ("close action".equals(intent.getAction())) {
                    ((io.flutter.plugins.urllauncher.WebViewActivity) this.f2139b).finish();
                    return;
                }
                return;
            case 1:
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                int i4 = 0;
                if (connectivityManager != null) {
                    try {
                        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
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
                                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                    i4 = 3;
                                    break;
                                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
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
                                    if (p086W.AbstractC0805y.f2801a >= 29) {
                                        i4 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i4 = 1;
                        }
                    } catch (java.lang.SecurityException unused) {
                    }
                }
                int i5 = p086W.AbstractC0805y.f2801a;
                p086W.C0796p c0796p = (p086W.C0796p) this.f2139b;
                if (i5 < 31 || i4 != 5) {
                    p086W.C0796p.m1505a(i4, c0796p);
                    return;
                }
                try {
                    android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
                    telephonyManager.getClass();
                    p086W.C0795o c0795o = new p086W.C0795o(c0796p);
                    mainExecutor = context.getMainExecutor();
                    telephonyManager.registerTelephonyCallback(mainExecutor, c0795o);
                    telephonyManager.unregisterTelephonyCallback(c0795o);
                    return;
                } catch (java.lang.RuntimeException unused2) {
                    p086W.C0796p.m1505a(5, c0796p);
                    return;
                }
            default:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                p112c0.C1227i c1227i = (p112c0.C1227i) this.f2139b;
                c1227i.m2909a(p112c0.C1223e.m2904c(context, intent, c1227i.f4785i, c1227i.f4784h));
                return;
        }
    }
}
