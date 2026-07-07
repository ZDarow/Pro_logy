package p046L1;

/* renamed from: L1.e */
/* loaded from: classes.dex */
public abstract class AbstractC0361e {

    /* renamed from: a */
    public static final int f1105a;

    static {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = p046L1.AbstractC0362f.f1106a;
        f1105a = 12451000;
    }

    /* renamed from: a */
    public android.content.Intent m810a(android.content.Context context, int i4, java.lang.String str) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return null;
            }
            android.net.Uri fromParts = android.net.Uri.fromParts("package", "com.google.android.gms", null);
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && p080U1.AbstractC0748a.m1385t(context)) {
            android.content.Intent intent2 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("gcore_");
        sb.append(f1105a);
        sb.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                p080U1.C0749b m1395a = p080U1.C0750c.m1395a(context);
                sb.append(m1395a.f2608l.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        java.lang.String sb2 = sb.toString();
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder appendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!android.text.TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d A[RETURN] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m811b(android.content.Context r13, int r14) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p046L1.AbstractC0361e.m811b(android.content.Context, int):int");
    }
}
