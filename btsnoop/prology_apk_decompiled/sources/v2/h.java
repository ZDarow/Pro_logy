package v2;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f8680a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8681b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f8682c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f8683d;

    /* renamed from: e, reason: collision with root package name */
    public W.m f8684e;

    /* renamed from: f, reason: collision with root package name */
    public g f8685f;

    public h(String str, int i4) {
        this.f8680a = str;
        this.f8681b = i4;
    }

    public final synchronized void a(W.m mVar) {
        HandlerThread handlerThread = new HandlerThread(this.f8680a, this.f8681b);
        this.f8682c = handlerThread;
        handlerThread.start();
        this.f8683d = new Handler(this.f8682c.getLooper());
        this.f8684e = mVar;
    }
}
