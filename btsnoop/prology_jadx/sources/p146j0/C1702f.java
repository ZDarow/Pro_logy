package p146j0;

/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class C1702f extends android.media.MediaCodec.Callback {

    /* renamed from: b */
    public final android.os.HandlerThread f7070b;

    /* renamed from: c */
    public android.os.Handler f7071c;

    /* renamed from: h */
    public android.media.MediaFormat f7076h;

    /* renamed from: i */
    public android.media.MediaFormat f7077i;

    /* renamed from: j */
    public android.media.MediaCodec.CodecException f7078j;

    /* renamed from: k */
    public android.media.MediaCodec.CryptoException f7079k;

    /* renamed from: l */
    public long f7080l;

    /* renamed from: m */
    public boolean f7081m;

    /* renamed from: n */
    public java.lang.IllegalStateException f7082n;

    /* renamed from: o */
    public p146j0.C1715s f7083o;

    /* renamed from: a */
    public final java.lang.Object f7069a = new java.lang.Object();

    /* renamed from: d */
    public final p086W.C0792l f7072d = new p086W.C0792l();

    /* renamed from: e */
    public final p086W.C0792l f7073e = new p086W.C0792l();

    /* renamed from: f */
    public final java.util.ArrayDeque f7074f = new java.util.ArrayDeque();

    /* renamed from: g */
    public final java.util.ArrayDeque f7075g = new java.util.ArrayDeque();

    public C1702f(android.os.HandlerThread handlerThread) {
        this.f7070b = handlerThread;
    }

    /* renamed from: a */
    public final void m3657a() {
        java.util.ArrayDeque arrayDeque = this.f7075g;
        if (!arrayDeque.isEmpty()) {
            this.f7077i = (android.media.MediaFormat) arrayDeque.getLast();
        }
        p086W.C0792l c0792l = this.f7072d;
        c0792l.f2766b = c0792l.f2765a;
        p086W.C0792l c0792l2 = this.f7073e;
        c0792l2.f2766b = c0792l2.f2765a;
        this.f7074f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CryptoException cryptoException) {
        synchronized (this.f7069a) {
            this.f7079k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        synchronized (this.f7069a) {
            this.f7078j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i4) {
        p102a0.C0945I c0945i;
        synchronized (this.f7069a) {
            this.f7072d.m1451a(i4);
            p146j0.C1715s c1715s = this.f7083o;
            if (c1715s != null && (c0945i = c1715s.f7105a.f7140Q) != null) {
                c0945i.m1863a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i4, android.media.MediaCodec.BufferInfo bufferInfo) {
        p102a0.C0945I c0945i;
        synchronized (this.f7069a) {
            try {
                android.media.MediaFormat mediaFormat = this.f7077i;
                if (mediaFormat != null) {
                    this.f7073e.m1451a(-2);
                    this.f7075g.add(mediaFormat);
                    this.f7077i = null;
                }
                this.f7073e.m1451a(i4);
                this.f7074f.add(bufferInfo);
                p146j0.C1715s c1715s = this.f7083o;
                if (c1715s != null && (c0945i = c1715s.f7105a.f7140Q) != null) {
                    c0945i.m1863a();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        synchronized (this.f7069a) {
            this.f7073e.m1451a(-2);
            this.f7075g.add(mediaFormat);
            this.f7077i = null;
        }
    }
}
