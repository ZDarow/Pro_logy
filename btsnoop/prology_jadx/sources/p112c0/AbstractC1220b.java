package p112c0;

/* renamed from: c0.b */
/* loaded from: classes.dex */
public abstract class AbstractC1220b {
    /* renamed from: a */
    public static p129f2.AbstractC1393I m2898a(p076T.C0691e c0691e) {
        boolean isDirectPlaybackSupported;
        p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
        p129f2.AbstractC1445r0 it = p112c0.C1223e.f4769e.keySet().iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            int intValue = num.intValue();
            if (p086W.AbstractC0805y.f2801a >= p086W.AbstractC0805y.m1622q(intValue)) {
                isDirectPlaybackSupported = android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (android.media.AudioAttributes) c0691e.m1269a().f1048m);
                if (isDirectPlaybackSupported) {
                    m3161i.m3145a(num);
                }
            }
        }
        m3161i.m3145a(2);
        return m3161i.m3157g();
    }

    /* renamed from: b */
    public static int m2899b(int i4, int i5, p076T.C0691e c0691e) {
        boolean isDirectPlaybackSupported;
        for (int i6 = 10; i6 > 0; i6--) {
            int m1624s = p086W.AbstractC0805y.m1624s(i6);
            if (m1624s != 0) {
                isDirectPlaybackSupported = android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setEncoding(i4).setSampleRate(i5).setChannelMask(m1624s).build(), (android.media.AudioAttributes) c0691e.m1269a().f1048m);
                if (isDirectPlaybackSupported) {
                    return i6;
                }
            }
        }
        return 0;
    }
}
