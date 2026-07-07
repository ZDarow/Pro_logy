package p102a0;

/* renamed from: a0.b */
/* loaded from: classes.dex */
public final class RunnableC0964b extends android.content.BroadcastReceiver implements java.lang.Runnable {

    /* renamed from: l */
    public final p102a0.SurfaceHolderCallbackC0941E f3509l;

    /* renamed from: m */
    public final android.os.Handler f3510m;

    /* renamed from: n */
    public final /* synthetic */ p096Y1.C0890a f3511n;

    public RunnableC0964b(p096Y1.C0890a c0890a, android.os.Handler handler, p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E) {
        this.f3511n = c0890a;
        this.f3510m = handler;
        this.f3509l = surfaceHolderCallbackC0941E;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f3510m.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3511n.f3188l) {
            this.f3509l.f3316a.m1845R(-1, 3, false);
        }
    }
}
