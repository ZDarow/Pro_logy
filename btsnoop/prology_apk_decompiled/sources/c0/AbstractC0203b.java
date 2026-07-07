package c0;

import T.C0084e;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import f2.C0278F;
import f2.r0;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0203b {
    public static f2.I a(C0084e c0084e) {
        boolean isDirectPlaybackSupported;
        C0278F i4 = f2.I.i();
        r0 it = C0206e.f4603e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (W.y.f2709a >= W.y.q(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) c0084e.a().f1009m);
                if (isDirectPlaybackSupported) {
                    i4.a(num);
                }
            }
        }
        i4.a(2);
        return i4.g();
    }

    public static int b(int i4, int i5, C0084e c0084e) {
        boolean isDirectPlaybackSupported;
        for (int i6 = 10; i6 > 0; i6--) {
            int s = W.y.s(i6);
            if (s != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i5).setChannelMask(s).build(), (AudioAttributes) c0084e.a().f1009m);
                if (isDirectPlaybackSupported) {
                    return i6;
                }
            }
        }
        return 0;
    }
}
