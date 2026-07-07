package p112c0;

/* renamed from: c0.c */
/* loaded from: classes.dex */
public abstract class AbstractC1221c {
    /* renamed from: a */
    public static p112c0.C1223e m2900a(android.media.AudioManager audioManager, p076T.C0691e c0691e) {
        java.util.List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((android.media.AudioAttributes) c0691e.m1269a().f1048m);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(2, new java.util.HashSet(p101a.AbstractC0936a.m1795d(12)));
        for (int i4 = 0; i4 < directProfilesForAttributes.size(); i4++) {
            android.media.AudioProfile m2789f = p107b0.AbstractC1174i.m2789f(directProfilesForAttributes.get(i4));
            encapsulationType = m2789f.getEncapsulationType();
            if (encapsulationType != 1) {
                format = m2789f.getFormat();
                if (p086W.AbstractC0805y.m1588I(format) || p112c0.C1223e.f4769e.containsKey(java.lang.Integer.valueOf(format))) {
                    if (hashMap.containsKey(java.lang.Integer.valueOf(format))) {
                        java.util.Set set = (java.util.Set) hashMap.get(java.lang.Integer.valueOf(format));
                        set.getClass();
                        channelMasks2 = m2789f.getChannelMasks();
                        set.addAll(p101a.AbstractC0936a.m1795d(channelMasks2));
                    } else {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(format);
                        channelMasks = m2789f.getChannelMasks();
                        hashMap.put(valueOf, new java.util.HashSet(p101a.AbstractC0936a.m1795d(channelMasks)));
                    }
                }
            }
        }
        p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            m3161i.m3145a(new p112c0.C1222d(((java.lang.Integer) entry.getKey()).intValue(), (java.util.Set) entry.getValue()));
        }
        return new p112c0.C1223e(m3161i.m3157g());
    }

    /* renamed from: b */
    public static p112c0.C1228j m2901b(android.media.AudioManager audioManager, p076T.C0691e c0691e) {
        java.util.List audioDevicesForAttributes;
        try {
            audioManager.getClass();
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((android.media.AudioAttributes) c0691e.m1269a().f1048m);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new p112c0.C1228j((android.media.AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (java.lang.RuntimeException unused) {
            return null;
        }
    }
}
