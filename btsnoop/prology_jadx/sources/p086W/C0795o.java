package p086W;

/* renamed from: W.o */
/* loaded from: classes.dex */
public final class C0795o extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {

    /* renamed from: a */
    public final p086W.C0796p f2772a;

    public C0795o(p086W.C0796p c0796p) {
        this.f2772a = c0796p;
    }

    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean z4 = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        p086W.C0796p.m1505a(z4 ? 10 : 5, this.f2772a);
    }
}
