package c0;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import r2.C0511d;
import r2.C0512e;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208g extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4607b;

    public /* synthetic */ C0208g(int i4, Object obj) {
        this.f4606a = i4;
        this.f4607b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.f4606a) {
            case 0:
                C0210i c0210i = (C0210i) this.f4607b;
                c0210i.a(C0206e.b(c0210i.f4611a, c0210i.f4619i, c0210i.f4618h));
                return;
            default:
                ArrayList arrayList = new ArrayList();
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    arrayList.add(C0512e.b(audioDeviceInfo));
                }
                ((C0511d) this.f4607b).e("onAudioDevicesAdded", arrayList);
                return;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.f4606a) {
            case 0:
                C0210i c0210i = (C0210i) this.f4607b;
                if (W.y.l(audioDeviceInfoArr, c0210i.f4618h)) {
                    c0210i.f4618h = null;
                }
                c0210i.a(C0206e.b(c0210i.f4611a, c0210i.f4619i, c0210i.f4618h));
                return;
            default:
                ArrayList arrayList = new ArrayList();
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    arrayList.add(C0512e.b(audioDeviceInfo));
                }
                ((C0511d) this.f4607b).e("onAudioDevicesRemoved", arrayList);
                return;
        }
    }
}
