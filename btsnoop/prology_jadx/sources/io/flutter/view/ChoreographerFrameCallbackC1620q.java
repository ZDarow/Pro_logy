package io.flutter.view;

/* renamed from: io.flutter.view.q */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1620q implements android.view.Choreographer.FrameCallback {

    /* renamed from: l */
    public long f6792l;

    /* renamed from: m */
    public final /* synthetic */ io.flutter.view.C1621r f6793m;

    public ChoreographerFrameCallbackC1620q(io.flutter.view.C1621r c1621r, long j4) {
        this.f6793m = c1621r;
        this.f6792l = j4;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        long nanoTime = java.lang.System.nanoTime() - j4;
        long j5 = nanoTime < 0 ? 0L : nanoTime;
        io.flutter.view.C1621r c1621r = this.f6793m;
        c1621r.f6797b.onVsync(j5, c1621r.f6796a, this.f6792l);
        c1621r.f6798c = this;
    }
}
