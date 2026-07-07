package W;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
public final class o extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final p f2680a;

    public o(p pVar) {
        this.f2680a = pVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean z4 = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        p.a(z4 ? 10 : 5, this.f2680a);
    }
}
