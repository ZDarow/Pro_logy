package p206w0;

/* renamed from: w0.r */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC2322r implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {

    /* renamed from: p */
    public static final p206w0.ChoreographerFrameCallbackC2322r f9207p = new p206w0.ChoreographerFrameCallbackC2322r();

    /* renamed from: l */
    public volatile long f9208l = -9223372036854775807L;

    /* renamed from: m */
    public final android.os.Handler f9209m;

    /* renamed from: n */
    public android.view.Choreographer f9210n;

    /* renamed from: o */
    public int f9211o;

    public ChoreographerFrameCallbackC2322r() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        android.os.Looper looper = handlerThread.getLooper();
        int i4 = p086W.AbstractC0805y.f2801a;
        android.os.Handler handler = new android.os.Handler(looper, this);
        this.f9209m = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        this.f9208l = j4;
        android.view.Choreographer choreographer = this.f9210n;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i4 = message.what;
        if (i4 == 1) {
            try {
                this.f9210n = android.view.Choreographer.getInstance();
            } catch (java.lang.RuntimeException e4) {
                p086W.AbstractC0781a.m1411B("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
            }
            return true;
        }
        if (i4 == 2) {
            android.view.Choreographer choreographer = this.f9210n;
            if (choreographer != null) {
                int i5 = this.f9211o + 1;
                this.f9211o = i5;
                if (i5 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i4 != 3) {
            return false;
        }
        android.view.Choreographer choreographer2 = this.f9210n;
        if (choreographer2 != null) {
            int i6 = this.f9211o - 1;
            this.f9211o = i6;
            if (i6 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f9208l = -9223372036854775807L;
            }
        }
        return true;
    }
}
