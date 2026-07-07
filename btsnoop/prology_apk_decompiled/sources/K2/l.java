package K2;

import T.C0084e;
import T.C0095p;
import W.y;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f999a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1000b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1001c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1002d;

    public static HashMap b(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public boolean a(C0084e c0084e, C0095p c0095p) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(c0095p.f2325m);
        int i4 = c0095p.f2303A;
        if (equals && i4 == 16) {
            i4 = 12;
        }
        int s = y.s(i4);
        if (s == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(s);
        int i5 = c0095p.f2304B;
        if (i5 != -1) {
            channelMask.setSampleRate(i5);
        }
        canBeSpatialized = ((Spatializer) this.f1000b).canBeSpatialized((AudioAttributes) c0084e.a().f1009m, channelMask.build());
        return canBeSpatialized;
    }
}
