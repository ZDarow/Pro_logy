package p112c0;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1219a {
    /* JADX WARN: Type inference failed for: r0v0, types: [f2.L, f2.C] */
    /* renamed from: a */
    private static p129f2.AbstractC1397M m2896a() {
        ?? abstractC1387C = new p129f2.AbstractC1387C(4);
        java.lang.Integer[] numArr = {8, 7};
        p129f2.AbstractC1444r.m3224c(2, numArr);
        abstractC1387C.m3149f(abstractC1387C.f5693b + 2);
        java.lang.System.arraycopy(numArr, 0, abstractC1387C.f5692a, abstractC1387C.f5693b, 2);
        abstractC1387C.f5693b += 2;
        int i4 = p086W.AbstractC0805y.f2801a;
        if (i4 >= 31) {
            java.lang.Integer[] numArr2 = {26, 27};
            p129f2.AbstractC1444r.m3224c(2, numArr2);
            abstractC1387C.m3149f(abstractC1387C.f5693b + 2);
            java.lang.System.arraycopy(numArr2, 0, abstractC1387C.f5692a, abstractC1387C.f5693b, 2);
            abstractC1387C.f5693b += 2;
        }
        if (i4 >= 33) {
            abstractC1387C.m3145a(30);
        }
        return abstractC1387C.m3175g();
    }

    /* renamed from: b */
    public static boolean m2897b(android.media.AudioManager audioManager, p112c0.C1228j c1228j) {
        android.media.AudioDeviceInfo[] audioDeviceInfoArr;
        if (c1228j == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new android.media.AudioDeviceInfo[]{c1228j.f4787a};
        }
        p129f2.AbstractC1397M m2896a = m2896a();
        for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (m2896a.contains(java.lang.Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
