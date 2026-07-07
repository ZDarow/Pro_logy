package c0;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class L {
    public static void a(s sVar, Object obj) {
        C0211j c0211j;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        J j4 = (J) sVar;
        if (audioDeviceInfo == null) {
            c0211j = null;
        } else {
            j4.getClass();
            c0211j = new C0211j(audioDeviceInfo);
        }
        j4.f4527c0 = c0211j;
        C0210i c0210i = j4.f4556y;
        if (c0210i != null) {
            c0210i.b(audioDeviceInfo);
        }
        AudioTrack audioTrack = j4.w;
        if (audioTrack != null) {
            AbstractC0201A.a(audioTrack, j4.f4527c0);
        }
    }
}
