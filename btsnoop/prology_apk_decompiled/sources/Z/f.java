package Z;

import T.C;
import T.C0095p;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f extends S0.c {

    /* renamed from: n, reason: collision with root package name */
    public C0095p f3138n;

    /* renamed from: o, reason: collision with root package name */
    public final b f3139o = new b();

    /* renamed from: p, reason: collision with root package name */
    public ByteBuffer f3140p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3141q;

    /* renamed from: r, reason: collision with root package name */
    public long f3142r;
    public ByteBuffer s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3143t;

    static {
        C.a("media3.decoder");
    }

    public f(int i4) {
        this.f3143t = i4;
    }

    public void e() {
        this.f1886m = 0;
        ByteBuffer byteBuffer = this.f3140p;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.s;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f3141q = false;
    }

    public final ByteBuffer f(int i4) {
        int i5 = this.f3143t;
        if (i5 == 1) {
            return ByteBuffer.allocate(i4);
        }
        if (i5 == 2) {
            return ByteBuffer.allocateDirect(i4);
        }
        ByteBuffer byteBuffer = this.f3140p;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i4 + ")");
    }

    public final void h(int i4) {
        ByteBuffer byteBuffer = this.f3140p;
        if (byteBuffer == null) {
            this.f3140p = f(i4);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i5 = i4 + position;
        if (capacity >= i5) {
            this.f3140p = byteBuffer;
            return;
        }
        ByteBuffer f4 = f(i5);
        f4.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f4.put(byteBuffer);
        }
        this.f3140p = f4;
    }

    public final void i() {
        ByteBuffer byteBuffer = this.f3140p;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.s;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
