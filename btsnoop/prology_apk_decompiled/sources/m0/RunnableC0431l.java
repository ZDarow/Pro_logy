package m0;

import android.os.Handler;
import f2.h0;
import java.io.Closeable;

/* renamed from: m0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0431l implements Runnable, Closeable {

    /* renamed from: l, reason: collision with root package name */
    public final Handler f7242l = W.y.n(null);

    /* renamed from: m, reason: collision with root package name */
    public final long f7243m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7244n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0432m f7245o;

    public RunnableC0431l(C0432m c0432m, long j4) {
        this.f7245o = c0432m;
        this.f7243m = j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7244n = false;
        this.f7242l.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0432m c0432m = this.f7245o;
        P2.a aVar = c0432m.f7256r;
        aVar.l(aVar.h(4, c0432m.f7259v, h0.f5570r, c0432m.s));
        this.f7242l.postDelayed(this, this.f7243m);
    }
}
