package p197u0;

/* renamed from: u0.n */
/* loaded from: classes.dex */
public final class C2227n implements p197u0.InterfaceC2228o {

    /* renamed from: o */
    public static final p128f1.C1383e f8881o = new p128f1.C1383e(0, -9223372036854775807L, false);

    /* renamed from: p */
    public static final p128f1.C1383e f8882p = new p128f1.C1383e(2, -9223372036854775807L, false);

    /* renamed from: q */
    public static final p128f1.C1383e f8883q = new p128f1.C1383e(3, -9223372036854775807L, false);

    /* renamed from: l */
    public final java.util.concurrent.ExecutorService f8884l;

    /* renamed from: m */
    public p197u0.HandlerC2223j f8885m;

    /* renamed from: n */
    public java.io.IOException f8886n;

    public C2227n(java.lang.String str) {
        java.lang.String m153l = p009B2.AbstractC0051h.m153l("ExoPlayer:Loader:", str);
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f8884l = java.util.concurrent.Executors.newSingleThreadExecutor(new p086W.ThreadFactoryC0804x(m153l));
    }

    @Override // p197u0.InterfaceC2228o
    /* renamed from: a */
    public final void mo2967a() {
        java.io.IOException iOException;
        java.io.IOException iOException2 = this.f8886n;
        if (iOException2 != null) {
            throw iOException2;
        }
        p197u0.HandlerC2223j handlerC2223j = this.f8885m;
        if (handlerC2223j != null && (iOException = handlerC2223j.f8875p) != null && handlerC2223j.f8876q > handlerC2223j.f8871l) {
            throw iOException;
        }
    }

    /* renamed from: b */
    public final void m4430b() {
        p197u0.HandlerC2223j handlerC2223j = this.f8885m;
        p086W.AbstractC0781a.m1422k(handlerC2223j);
        handlerC2223j.m4429a(false);
    }

    /* renamed from: c */
    public final boolean m4431c() {
        return this.f8886n != null;
    }

    /* renamed from: d */
    public final boolean m4432d() {
        return this.f8885m != null;
    }

    /* renamed from: e */
    public final void m4433e(p197u0.InterfaceC2225l interfaceC2225l) {
        p197u0.HandlerC2223j handlerC2223j = this.f8885m;
        if (handlerC2223j != null) {
            handlerC2223j.m4429a(true);
        }
        java.util.concurrent.ExecutorService executorService = this.f8884l;
        if (interfaceC2225l != null) {
            executorService.execute(new p024F.RunnableC0199b(13, interfaceC2225l));
        }
        executorService.shutdown();
    }

    /* renamed from: f */
    public final long m4434f(p197u0.InterfaceC2224k interfaceC2224k, p197u0.InterfaceC2222i interfaceC2222i, int i4) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        p086W.AbstractC0781a.m1422k(myLooper);
        this.f8886n = null;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        p197u0.HandlerC2223j handlerC2223j = new p197u0.HandlerC2223j(this, myLooper, interfaceC2224k, interfaceC2222i, i4, elapsedRealtime);
        p086W.AbstractC0781a.m1421j(this.f8885m == null);
        this.f8885m = handlerC2223j;
        handlerC2223j.f8875p = null;
        this.f8884l.execute(handlerC2223j);
        return elapsedRealtime;
    }
}
