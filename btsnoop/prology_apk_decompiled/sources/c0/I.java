package c0;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4491a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    public final H f4492b = new H(this);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f4493c;

    public I(J j4) {
        this.f4493c = j4;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.f4491a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new G(handler), this.f4492b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f4492b);
        this.f4491a.removeCallbacksAndMessages(null);
    }
}
