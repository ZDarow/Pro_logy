package j0;

import a0.C0119I;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f6811b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f6812c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f6817h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f6818i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f6819j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f6820k;

    /* renamed from: l, reason: collision with root package name */
    public long f6821l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6822m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f6823n;

    /* renamed from: o, reason: collision with root package name */
    public s f6824o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6810a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final W.l f6813d = new W.l();

    /* renamed from: e, reason: collision with root package name */
    public final W.l f6814e = new W.l();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f6815f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f6816g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f6811b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f6816g;
        if (!arrayDeque.isEmpty()) {
            this.f6818i = (MediaFormat) arrayDeque.getLast();
        }
        W.l lVar = this.f6813d;
        lVar.f2674b = lVar.f2673a;
        W.l lVar2 = this.f6814e;
        lVar2.f2674b = lVar2.f2673a;
        this.f6815f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f6810a) {
            this.f6820k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f6810a) {
            this.f6819j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i4) {
        C0119I c0119i;
        synchronized (this.f6810a) {
            this.f6813d.a(i4);
            s sVar = this.f6824o;
            if (sVar != null && (c0119i = sVar.f6845a.f6878Q) != null) {
                c0119i.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i4, MediaCodec.BufferInfo bufferInfo) {
        C0119I c0119i;
        synchronized (this.f6810a) {
            try {
                MediaFormat mediaFormat = this.f6818i;
                if (mediaFormat != null) {
                    this.f6814e.a(-2);
                    this.f6816g.add(mediaFormat);
                    this.f6818i = null;
                }
                this.f6814e.a(i4);
                this.f6815f.add(bufferInfo);
                s sVar = this.f6824o;
                if (sVar != null && (c0119i = sVar.f6845a.f6878Q) != null) {
                    c0119i.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f6810a) {
            this.f6814e.a(-2);
            this.f6816g.add(mediaFormat);
            this.f6818i = null;
        }
    }
}
