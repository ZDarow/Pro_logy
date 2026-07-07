package a0;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0124d f3402b;

    public C0123c(C0124d c0124d, Handler handler) {
        this.f3402b = c0124d;
        this.f3401a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i4) {
        this.f3401a.post(new X2.i(i4, 2, this));
    }
}
