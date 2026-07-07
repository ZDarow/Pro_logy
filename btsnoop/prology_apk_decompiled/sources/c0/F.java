package c0;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f4486a;

    /* renamed from: b, reason: collision with root package name */
    public final C0210i f4487b;

    /* renamed from: c, reason: collision with root package name */
    public E f4488c = new AudioRouting.OnRoutingChangedListener() { // from class: c0.E
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            F.this.b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [c0.E] */
    public F(AudioTrack audioTrack, C0210i c0210i) {
        this.f4486a = audioTrack;
        this.f4487b = c0210i;
        audioTrack.addOnRoutingChangedListener(this.f4488c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        if (this.f4488c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.f4487b.b(audioRouting.getRoutedDevice());
    }

    public void c() {
        E e4 = this.f4488c;
        e4.getClass();
        this.f4486a.removeOnRoutingChangedListener(e4);
        this.f4488c = null;
    }
}
