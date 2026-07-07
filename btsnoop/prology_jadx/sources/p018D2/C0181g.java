package p018D2;

/* renamed from: D2.g */
/* loaded from: classes.dex */
public final class C0181g implements p047L2.InterfaceC0375e {

    /* renamed from: a */
    public final io.flutter.embedding.engine.FlutterJNI f494a;

    /* renamed from: b */
    public final int f495b;

    /* renamed from: c */
    public final java.util.concurrent.atomic.AtomicBoolean f496c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public C0181g(io.flutter.embedding.engine.FlutterJNI flutterJNI, int i4) {
        this.f494a = flutterJNI;
        this.f495b = i4;
    }

    @Override // p047L2.InterfaceC0375e
    /* renamed from: a */
    public final void mo289a(java.nio.ByteBuffer byteBuffer) {
        if (this.f496c.getAndSet(true)) {
            throw new java.lang.IllegalStateException("Reply already submitted");
        }
        int i4 = this.f495b;
        io.flutter.embedding.engine.FlutterJNI flutterJNI = this.f494a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i4, byteBuffer, byteBuffer.position());
        }
    }
}
