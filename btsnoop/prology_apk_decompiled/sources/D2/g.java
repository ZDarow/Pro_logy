package D2;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements L2.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f486b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f487c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i4) {
        this.f485a = flutterJNI;
        this.f486b = i4;
    }

    @Override // L2.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f487c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i4 = this.f486b;
        FlutterJNI flutterJNI = this.f485a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i4, byteBuffer, byteBuffer.position());
        }
    }
}
