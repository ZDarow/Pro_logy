package p112c0;

/* renamed from: c0.n */
/* loaded from: classes.dex */
public final class C1232n {

    /* renamed from: a */
    public final android.os.Handler f4797a;

    /* renamed from: b */
    public final p102a0.SurfaceHolderCallbackC0941E f4798b;

    public /* synthetic */ C1232n(android.os.Handler handler, p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E) {
        this.f4797a = handler;
        this.f4798b = surfaceHolderCallbackC0941E;
    }

    /* renamed from: a */
    public void m2912a(p102a0.C0972f c0972f) {
        synchronized (c0972f) {
        }
        android.os.Handler handler = this.f4797a;
        if (handler != null) {
            handler.post(new p086W.RunnableC0793m(4, this, c0972f));
        }
    }

    /* renamed from: b */
    public void m2913b(p076T.C0690d0 c0690d0) {
        android.os.Handler handler = this.f4797a;
        if (handler != null) {
            handler.post(new p086W.RunnableC0793m(15, this, c0690d0));
        }
    }
}
