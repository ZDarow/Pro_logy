package p098Z;

/* renamed from: Z.f */
/* loaded from: classes.dex */
public class C0921f extends p073S0.AbstractC0625c {

    /* renamed from: n */
    public p076T.C0702p f3249n;

    /* renamed from: o */
    public final p098Z.C0917b f3250o = new p098Z.C0917b();

    /* renamed from: p */
    public java.nio.ByteBuffer f3251p;

    /* renamed from: q */
    public boolean f3252q;

    /* renamed from: r */
    public long f3253r;

    /* renamed from: s */
    public java.nio.ByteBuffer f3254s;

    /* renamed from: t */
    public final int f3255t;

    static {
        p076T.AbstractC0660C.m1179a("media3.decoder");
    }

    public C0921f(int i4) {
        this.f3255t = i4;
    }

    /* renamed from: e */
    public void mo1750e() {
        this.f1957m = 0;
        java.nio.ByteBuffer byteBuffer = this.f3251p;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        java.nio.ByteBuffer byteBuffer2 = this.f3254s;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f3252q = false;
    }

    /* renamed from: f */
    public final java.nio.ByteBuffer m1751f(int i4) {
        int i5 = this.f3255t;
        if (i5 == 1) {
            return java.nio.ByteBuffer.allocate(i4);
        }
        if (i5 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i4);
        }
        java.nio.ByteBuffer byteBuffer = this.f3251p;
        throw new java.lang.IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i4 + ")");
    }

    /* renamed from: h */
    public final void m1752h(int i4) {
        java.nio.ByteBuffer byteBuffer = this.f3251p;
        if (byteBuffer == null) {
            this.f3251p = m1751f(i4);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i5 = i4 + position;
        if (capacity >= i5) {
            this.f3251p = byteBuffer;
            return;
        }
        java.nio.ByteBuffer m1751f = m1751f(i5);
        m1751f.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m1751f.put(byteBuffer);
        }
        this.f3251p = m1751f;
    }

    /* renamed from: i */
    public final void m1753i() {
        java.nio.ByteBuffer byteBuffer = this.f3251p;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        java.nio.ByteBuffer byteBuffer2 = this.f3254s;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
