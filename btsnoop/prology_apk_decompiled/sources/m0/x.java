package m0;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: l, reason: collision with root package name */
    public final OutputStream f7310l;

    /* renamed from: m, reason: collision with root package name */
    public final HandlerThread f7311m;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f7312n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y f7313o;

    public x(y yVar, OutputStream outputStream) {
        this.f7313o = yVar;
        this.f7310l = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f7311m = handlerThread;
        handlerThread.start();
        this.f7312n = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.f7312n;
        HandlerThread handlerThread = this.f7311m;
        Objects.requireNonNull(handlerThread);
        handler.post(new F2.c(8, handlerThread));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
