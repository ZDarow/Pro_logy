package p204v2;

/* renamed from: v2.h */
/* loaded from: classes.dex */
public final class C2278h {

    /* renamed from: a */
    public final java.lang.String f9030a;

    /* renamed from: b */
    public final int f9031b;

    /* renamed from: c */
    public android.os.HandlerThread f9032c;

    /* renamed from: d */
    public android.os.Handler f9033d;

    /* renamed from: e */
    public p086W.RunnableC0793m f9034e;

    /* renamed from: f */
    public p204v2.C2277g f9035f;

    public C2278h(java.lang.String str, int i4) {
        this.f9030a = str;
        this.f9031b = i4;
    }

    /* renamed from: a */
    public final synchronized void m4477a(p086W.RunnableC0793m runnableC0793m) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.f9030a, this.f9031b);
        this.f9032c = handlerThread;
        handlerThread.start();
        this.f9033d = new android.os.Handler(this.f9032c.getLooper());
        this.f9034e = runnableC0793m;
    }
}
