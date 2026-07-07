package w0;

import W.y;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final r f8849p = new r();

    /* renamed from: l, reason: collision with root package name */
    public volatile long f8850l = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f8851m;

    /* renamed from: n, reason: collision with root package name */
    public Choreographer f8852n;

    /* renamed from: o, reason: collision with root package name */
    public int f8853o;

    public r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i4 = y.f2709a;
        Handler handler = new Handler(looper, this);
        this.f8851m = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        this.f8850l = j4;
        Choreographer choreographer = this.f8852n;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1) {
            try {
                this.f8852n = Choreographer.getInstance();
            } catch (RuntimeException e4) {
                W.a.B("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
            }
            return true;
        }
        if (i4 == 2) {
            Choreographer choreographer = this.f8852n;
            if (choreographer != null) {
                int i5 = this.f8853o + 1;
                this.f8853o = i5;
                if (i5 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i4 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f8852n;
        if (choreographer2 != null) {
            int i6 = this.f8853o - 1;
            this.f8853o = i6;
            if (i6 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f8850l = -9223372036854775807L;
            }
        }
        return true;
    }
}
