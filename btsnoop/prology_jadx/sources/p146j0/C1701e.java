package p146j0;

/* renamed from: j0.e */
/* loaded from: classes.dex */
public final class C1701e implements p146j0.InterfaceC1707k {

    /* renamed from: r */
    public static final java.util.ArrayDeque f7061r = new java.util.ArrayDeque();

    /* renamed from: s */
    public static final java.lang.Object f7062s = new java.lang.Object();

    /* renamed from: l */
    public final android.media.MediaCodec f7063l;

    /* renamed from: m */
    public final android.os.HandlerThread f7064m;

    /* renamed from: n */
    public p064Q.HandlerC0547s f7065n;

    /* renamed from: o */
    public final java.util.concurrent.atomic.AtomicReference f7066o;

    /* renamed from: p */
    public final p078T2.C0737n f7067p;

    /* renamed from: q */
    public boolean f7068q;

    /* JADX WARN: Type inference failed for: r0v0, types: [T2.n, java.lang.Object] */
    public C1701e(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread) {
        ?? obj = new java.lang.Object();
        this.f7063l = mediaCodec;
        this.f7064m = handlerThread;
        this.f7067p = obj;
        this.f7066o = new java.util.concurrent.atomic.AtomicReference();
    }

    /* renamed from: a */
    public static p146j0.C1700d m3656a() {
        java.util.ArrayDeque arrayDeque = f7061r;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new p146j0.C1700d();
                }
                return (p146j0.C1700d) arrayDeque.removeFirst();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p146j0.InterfaceC1707k
    /* renamed from: b */
    public final void mo3189b(int i4, p098Z.C0917b c0917b, long j4, int i5) {
        mo3197r();
        p146j0.C1700d m3656a = m3656a();
        m3656a.f7056a = i4;
        m3656a.f7057b = 0;
        m3656a.f7059d = j4;
        m3656a.f7060e = i5;
        int i6 = c0917b.f3244f;
        android.media.MediaCodec.CryptoInfo cryptoInfo = m3656a.f7058c;
        cryptoInfo.numSubSamples = i6;
        int[] iArr = c0917b.f3242d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = java.util.Arrays.copyOf(iArr, iArr.length);
            } else {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = c0917b.f3243e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = java.util.Arrays.copyOf(iArr3, iArr3.length);
            } else {
                java.lang.System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = c0917b.f3240b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = java.util.Arrays.copyOf(bArr, bArr.length);
            } else {
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = c0917b.f3239a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = java.util.Arrays.copyOf(bArr3, bArr3.length);
            } else {
                java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = c0917b.f3241c;
        if (p086W.AbstractC0805y.f2801a >= 24) {
            cryptoInfo.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(c0917b.f3245g, c0917b.f3246h));
        }
        this.f7065n.obtainMessage(2, m3656a).sendToTarget();
    }

    @Override // p146j0.InterfaceC1707k
    /* renamed from: c */
    public final void mo3190c(android.os.Bundle bundle) {
        mo3197r();
        p064Q.HandlerC0547s handlerC0547s = this.f7065n;
        int i4 = p086W.AbstractC0805y.f2801a;
        handlerC0547s.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p146j0.InterfaceC1707k
    /* renamed from: d */
    public final void mo3191d() {
        if (this.f7068q) {
            return;
        }
        android.os.HandlerThread handlerThread = this.f7064m;
        handlerThread.start();
        this.f7065n = new p064Q.HandlerC0547s(this, handlerThread.getLooper(), 2);
        this.f7068q = true;
    }

    @Override // p146j0.InterfaceC1707k
    /* renamed from: e */
    public final void mo3192e(int i4, int i5, long j4, int i6) {
        mo3197r();
        p146j0.C1700d m3656a = m3656a();
        m3656a.f7056a = i4;
        m3656a.f7057b = i5;
        m3656a.f7059d = j4;
        m3656a.f7060e = i6;
        p064Q.HandlerC0547s handlerC0547s = this.f7065n;
        int i7 = p086W.AbstractC0805y.f2801a;
        handlerC0547s.obtainMessage(1, m3656a).sendToTarget();
    }

    @Override // p146j0.InterfaceC1707k
    public final void flush() {
        if (this.f7068q) {
            try {
                p064Q.HandlerC0547s handlerC0547s = this.f7065n;
                handlerC0547s.getClass();
                handlerC0547s.removeCallbacksAndMessages(null);
                p078T2.C0737n c0737n = this.f7067p;
                c0737n.m1326a();
                p064Q.HandlerC0547s handlerC0547s2 = this.f7065n;
                handlerC0547s2.getClass();
                handlerC0547s2.obtainMessage(3).sendToTarget();
                synchronized (c0737n) {
                    while (!c0737n.f2542a) {
                        c0737n.wait();
                    }
                }
            } catch (java.lang.InterruptedException e4) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e4);
            }
        }
    }

    @Override // p146j0.InterfaceC1707k
    /* renamed from: l */
    public final void mo3195l() {
        if (this.f7068q) {
            flush();
            this.f7064m.quit();
        }
        this.f7068q = false;
    }

    @Override // p146j0.InterfaceC1707k
    /* renamed from: r */
    public final void mo3197r() {
        java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) this.f7066o.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
