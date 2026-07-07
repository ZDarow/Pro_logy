package c0;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import f2.AbstractC0275C;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0202a {
    /* JADX WARN: Type inference failed for: r0v0, types: [f2.L, f2.C] */
    private static f2.M a() {
        ?? abstractC0275C = new AbstractC0275C(4);
        Integer[] numArr = {8, 7};
        f2.r.c(2, numArr);
        abstractC0275C.f(abstractC0275C.f5499b + 2);
        System.arraycopy(numArr, 0, abstractC0275C.f5498a, abstractC0275C.f5499b, 2);
        abstractC0275C.f5499b += 2;
        int i4 = W.y.f2709a;
        if (i4 >= 31) {
            Integer[] numArr2 = {26, 27};
            f2.r.c(2, numArr2);
            abstractC0275C.f(abstractC0275C.f5499b + 2);
            System.arraycopy(numArr2, 0, abstractC0275C.f5498a, abstractC0275C.f5499b, 2);
            abstractC0275C.f5499b += 2;
        }
        if (i4 >= 33) {
            abstractC0275C.a(30);
        }
        return abstractC0275C.g();
    }

    public static boolean b(AudioManager audioManager, C0211j c0211j) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (c0211j == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{c0211j.f4621a};
        }
        f2.M a4 = a();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (a4.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
