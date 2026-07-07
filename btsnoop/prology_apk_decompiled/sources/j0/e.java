package j0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: r, reason: collision with root package name */
    public static final ArrayDeque f6803r = new ArrayDeque();
    public static final Object s = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final MediaCodec f6804l;

    /* renamed from: m, reason: collision with root package name */
    public final HandlerThread f6805m;

    /* renamed from: n, reason: collision with root package name */
    public Q.s f6806n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f6807o;

    /* renamed from: p, reason: collision with root package name */
    public final T2.n f6808p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6809q;

    /* JADX WARN: Type inference failed for: r0v0, types: [T2.n, java.lang.Object] */
    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ?? obj = new Object();
        this.f6804l = mediaCodec;
        this.f6805m = handlerThread;
        this.f6808p = obj;
        this.f6807o = new AtomicReference();
    }

    public static d a() {
        ArrayDeque arrayDeque = f6803r;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j0.k
    public final void b(int i4, Z.b bVar, long j4, int i5) {
        r();
        d a4 = a();
        a4.f6798a = i4;
        a4.f6799b = 0;
        a4.f6801d = j4;
        a4.f6802e = i5;
        int i6 = bVar.f3133f;
        MediaCodec.CryptoInfo cryptoInfo = a4.f6800c;
        cryptoInfo.numSubSamples = i6;
        int[] iArr = bVar.f3131d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = bVar.f3132e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = bVar.f3129b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = bVar.f3128a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = bVar.f3130c;
        if (W.y.f2709a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f3134g, bVar.f3135h));
        }
        this.f6806n.obtainMessage(2, a4).sendToTarget();
    }

    @Override // j0.k
    public final void c(Bundle bundle) {
        r();
        Q.s sVar = this.f6806n;
        int i4 = W.y.f2709a;
        sVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // j0.k
    public final void d() {
        if (this.f6809q) {
            return;
        }
        HandlerThread handlerThread = this.f6805m;
        handlerThread.start();
        this.f6806n = new Q.s(this, handlerThread.getLooper(), 2);
        this.f6809q = true;
    }

    @Override // j0.k
    public final void e(int i4, int i5, long j4, int i6) {
        r();
        d a4 = a();
        a4.f6798a = i4;
        a4.f6799b = i5;
        a4.f6801d = j4;
        a4.f6802e = i6;
        Q.s sVar = this.f6806n;
        int i7 = W.y.f2709a;
        sVar.obtainMessage(1, a4).sendToTarget();
    }

    @Override // j0.k
    public final void flush() {
        if (this.f6809q) {
            try {
                Q.s sVar = this.f6806n;
                sVar.getClass();
                sVar.removeCallbacksAndMessages(null);
                T2.n nVar = this.f6808p;
                nVar.a();
                Q.s sVar2 = this.f6806n;
                sVar2.getClass();
                sVar2.obtainMessage(3).sendToTarget();
                synchronized (nVar) {
                    while (!nVar.f2455a) {
                        nVar.wait();
                    }
                }
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    @Override // j0.k
    public final void l() {
        if (this.f6809q) {
            flush();
            this.f6805m.quit();
        }
        this.f6809q = false;
    }

    @Override // j0.k
    public final void r() {
        RuntimeException runtimeException = (RuntimeException) this.f6807o.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
