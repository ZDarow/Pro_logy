package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class q implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    public long f6545l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f6546m;

    public q(r rVar, long j4) {
        this.f6546m = rVar;
        this.f6545l = j4;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        long nanoTime = System.nanoTime() - j4;
        long j5 = nanoTime < 0 ? 0L : nanoTime;
        r rVar = this.f6546m;
        rVar.f6550b.onVsync(j5, rVar.f6549a, this.f6545l);
        rVar.f6551c = this;
    }
}
