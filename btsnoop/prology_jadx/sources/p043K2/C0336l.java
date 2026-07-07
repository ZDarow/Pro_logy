package p043K2;

/* renamed from: K2.l */
/* loaded from: classes.dex */
public final class C0336l {

    /* renamed from: a */
    public boolean f1038a;

    /* renamed from: b */
    public java.lang.Object f1039b;

    /* renamed from: c */
    public java.lang.Object f1040c;

    /* renamed from: d */
    public java.lang.Object f1041d;

    /* renamed from: b */
    public static java.util.HashMap m744b(byte[] bArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("enabled", java.lang.Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    /* renamed from: a */
    public boolean m745a(p076T.C0691e c0691e, p076T.C0702p c0702p) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(c0702p.f2408m);
        int i4 = c0702p.f2385A;
        if (equals && i4 == 16) {
            i4 = 12;
        }
        int m1624s = p086W.AbstractC0805y.m1624s(i4);
        if (m1624s == 0) {
            return false;
        }
        android.media.AudioFormat.Builder channelMask = new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(m1624s);
        int i5 = c0702p.f2386B;
        if (i5 != -1) {
            channelMask.setSampleRate(i5);
        }
        canBeSpatialized = ((android.media.Spatializer) this.f1039b).canBeSpatialized((android.media.AudioAttributes) c0691e.m1269a().f1048m, channelMask.build());
        return canBeSpatialized;
    }
}
