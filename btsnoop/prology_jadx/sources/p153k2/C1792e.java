package p153k2;

/* renamed from: k2.e */
/* loaded from: classes.dex */
public final class C1792e extends android.bluetooth.le.ScanCallback {

    /* renamed from: a */
    public final /* synthetic */ p153k2.C1795h f7325a;

    public C1792e(p153k2.C1795h c1795h) {
        this.f7325a = c1795h;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i4) {
        java.lang.String str = "onScanFailed: " + p153k2.C1795h.m3755m(i4);
        p153k2.C1795h c1795h = this.f7325a;
        c1795h.m3765C(str, 2);
        super.onScanFailed(i4);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("advertisements", new java.util.ArrayList());
        hashMap.put("success", 0);
        hashMap.put("error_code", java.lang.Integer.valueOf(i4));
        hashMap.put("error_string", p153k2.C1795h.m3755m(i4));
        c1795h.m3770z("OnScanResponse", hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021a  */
    @Override // android.bluetooth.le.ScanCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScanResult(int r18, android.bluetooth.le.ScanResult r19) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153k2.C1792e.onScanResult(int, android.bluetooth.le.ScanResult):void");
    }
}
