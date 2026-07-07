package p161m0;

/* renamed from: m0.x */
/* loaded from: classes.dex */
public final class C1867x implements java.io.Closeable {

    /* renamed from: l */
    public final java.io.OutputStream f7589l;

    /* renamed from: m */
    public final android.os.HandlerThread f7590m;

    /* renamed from: n */
    public final android.os.Handler f7591n;

    /* renamed from: o */
    public final /* synthetic */ p161m0.C1868y f7592o;

    public C1867x(p161m0.C1868y c1868y, java.io.OutputStream outputStream) {
        this.f7592o = c1868y;
        this.f7589l = outputStream;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f7590m = handlerThread;
        handlerThread.start();
        this.f7591n = new android.os.Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        android.os.Handler handler = this.f7591n;
        android.os.HandlerThread handlerThread = this.f7590m;
        java.util.Objects.requireNonNull(handlerThread);
        handler.post(new p026F2.RunnableC0226c(8, handlerThread));
        try {
            handlerThread.join();
        } catch (java.lang.InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
