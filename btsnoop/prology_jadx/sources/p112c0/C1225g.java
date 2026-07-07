package p112c0;

/* renamed from: c0.g */
/* loaded from: classes.dex */
public final class C1225g extends android.media.AudioDeviceCallback {

    /* renamed from: a */
    public final /* synthetic */ int f4772a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f4773b;

    public /* synthetic */ C1225g(int i4, java.lang.Object obj) {
        this.f4772a = i4;
        this.f4773b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.f4772a) {
            case 0:
                p112c0.C1227i c1227i = (p112c0.C1227i) this.f4773b;
                c1227i.m2909a(p112c0.C1223e.m2903b(c1227i.f4777a, c1227i.f4785i, c1227i.f4784h));
                return;
            default:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    arrayList.add(p186r2.C2071e.m4145b(audioDeviceInfo));
                }
                ((p186r2.C2070d) this.f4773b).m4142e("onAudioDevicesAdded", arrayList);
                return;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.f4772a) {
            case 0:
                p112c0.C1227i c1227i = (p112c0.C1227i) this.f4773b;
                if (p086W.AbstractC0805y.m1617l(audioDeviceInfoArr, c1227i.f4784h)) {
                    c1227i.f4784h = null;
                }
                c1227i.m2909a(p112c0.C1223e.m2903b(c1227i.f4777a, c1227i.f4785i, c1227i.f4784h));
                return;
            default:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    arrayList.add(p186r2.C2071e.m4145b(audioDeviceInfo));
                }
                ((p186r2.C2070d) this.f4773b).m4142e("onAudioDevicesRemoved", arrayList);
                return;
        }
    }
}
