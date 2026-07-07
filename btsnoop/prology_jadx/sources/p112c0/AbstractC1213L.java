package p112c0;

/* renamed from: c0.L */
/* loaded from: classes.dex */
public abstract class AbstractC1213L {
    /* renamed from: a */
    public static void m2871a(p112c0.InterfaceC1237s interfaceC1237s, java.lang.Object obj) {
        p112c0.C1228j c1228j;
        android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) obj;
        p112c0.C1211J c1211j = (p112c0.C1211J) interfaceC1237s;
        if (audioDeviceInfo == null) {
            c1228j = null;
        } else {
            c1211j.getClass();
            c1228j = new p112c0.C1228j(audioDeviceInfo);
        }
        c1211j.f4689c0 = c1228j;
        p112c0.C1227i c1227i = c1211j.f4720y;
        if (c1227i != null) {
            c1227i.m2910b(audioDeviceInfo);
        }
        android.media.AudioTrack audioTrack = c1211j.f4718w;
        if (audioTrack != null) {
            p112c0.AbstractC1202A.m2839a(audioTrack, c1211j.f4689c0);
        }
    }
}
