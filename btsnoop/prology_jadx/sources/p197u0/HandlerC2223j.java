package p197u0;

/* renamed from: u0.j */
/* loaded from: classes.dex */
public final class HandlerC2223j extends android.os.Handler implements java.lang.Runnable {

    /* renamed from: l */
    public final int f8871l;

    /* renamed from: m */
    public final p197u0.InterfaceC2224k f8872m;

    /* renamed from: n */
    public final long f8873n;

    /* renamed from: o */
    public p197u0.InterfaceC2222i f8874o;

    /* renamed from: p */
    public java.io.IOException f8875p;

    /* renamed from: q */
    public int f8876q;

    /* renamed from: r */
    public java.lang.Thread f8877r;

    /* renamed from: s */
    public boolean f8878s;

    /* renamed from: t */
    public volatile boolean f8879t;

    /* renamed from: u */
    public final /* synthetic */ p197u0.C2227n f8880u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2223j(p197u0.C2227n c2227n, android.os.Looper looper, p197u0.InterfaceC2224k interfaceC2224k, p197u0.InterfaceC2222i interfaceC2222i, int i4, long j4) {
        super(looper);
        this.f8880u = c2227n;
        this.f8872m = interfaceC2224k;
        this.f8874o = interfaceC2222i;
        this.f8871l = i4;
        this.f8873n = j4;
    }

    /* renamed from: a */
    public final void m4429a(boolean z4) {
        this.f8879t = z4;
        this.f8875p = null;
        if (hasMessages(1)) {
            this.f8878s = true;
            removeMessages(1);
            if (!z4) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f8878s = true;
                    this.f8872m.mo3267c();
                    java.lang.Thread thread = this.f8877r;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        if (z4) {
            this.f8880u.f8885m = null;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            p197u0.InterfaceC2222i interfaceC2222i = this.f8874o;
            interfaceC2222i.getClass();
            interfaceC2222i.mo2971x(this.f8872m, elapsedRealtime, elapsedRealtime - this.f8873n, true);
            this.f8874o = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (this.f8879t) {
            return;
        }
        int i4 = message.what;
        if (i4 == 1) {
            this.f8875p = null;
            p197u0.C2227n c2227n = this.f8880u;
            java.util.concurrent.ExecutorService executorService = c2227n.f8884l;
            p197u0.HandlerC2223j handlerC2223j = c2227n.f8885m;
            handlerC2223j.getClass();
            executorService.execute(handlerC2223j);
            return;
        }
        if (i4 == 4) {
            throw ((java.lang.Error) message.obj);
        }
        this.f8880u.f8885m = null;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - this.f8873n;
        p197u0.InterfaceC2222i interfaceC2222i = this.f8874o;
        interfaceC2222i.getClass();
        if (this.f8878s) {
            interfaceC2222i.mo2971x(this.f8872m, elapsedRealtime, j4, false);
            return;
        }
        int i5 = message.what;
        if (i5 == 2) {
            try {
                interfaceC2222i.mo2969k(this.f8872m, elapsedRealtime, j4);
                return;
            } catch (java.lang.RuntimeException e4) {
                p086W.AbstractC0781a.m1426o("LoadTask", "Unexpected exception handling load completed", e4);
                this.f8880u.f8886n = new p197u0.C2226m(e4);
                return;
            }
        }
        if (i5 != 3) {
            return;
        }
        java.io.IOException iOException = (java.io.IOException) message.obj;
        this.f8875p = iOException;
        int i6 = this.f8876q + 1;
        this.f8876q = i6;
        p128f1.C1383e mo2970q = interfaceC2222i.mo2970q(this.f8872m, elapsedRealtime, j4, iOException, i6);
        int i7 = mo2970q.f5683a;
        if (i7 == 3) {
            this.f8880u.f8886n = this.f8875p;
            return;
        }
        if (i7 != 2) {
            if (i7 == 1) {
                this.f8876q = 1;
            }
            long j5 = mo2970q.f5684b;
            if (j5 == -9223372036854775807L) {
                j5 = java.lang.Math.min((this.f8876q - 1) * 1000, 5000);
            }
            p197u0.C2227n c2227n2 = this.f8880u;
            p086W.AbstractC0781a.m1421j(c2227n2.f8885m == null);
            c2227n2.f8885m = this;
            if (j5 > 0) {
                sendEmptyMessageDelayed(1, j5);
            } else {
                this.f8875p = null;
                c2227n2.f8884l.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.f8878s;
                this.f8877r = java.lang.Thread.currentThread();
            }
            if (!z4) {
                android.os.Trace.beginSection("load:".concat(this.f8872m.getClass().getSimpleName()));
                try {
                    this.f8872m.mo3266b();
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f8877r = null;
                java.lang.Thread.interrupted();
            }
            if (this.f8879t) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.io.IOException e4) {
            if (this.f8879t) {
                return;
            }
            obtainMessage(3, e4).sendToTarget();
        } catch (java.lang.Exception e5) {
            if (this.f8879t) {
                return;
            }
            p086W.AbstractC0781a.m1426o("LoadTask", "Unexpected exception loading stream", e5);
            obtainMessage(3, new p197u0.C2226m(e5)).sendToTarget();
        } catch (java.lang.OutOfMemoryError e6) {
            if (this.f8879t) {
                return;
            }
            p086W.AbstractC0781a.m1426o("LoadTask", "OutOfMemory error loading stream", e6);
            obtainMessage(3, new p197u0.C2226m(e6)).sendToTarget();
        } catch (java.lang.Error e7) {
            if (!this.f8879t) {
                p086W.AbstractC0781a.m1426o("LoadTask", "Unexpected error loading stream", e7);
                obtainMessage(4, e7).sendToTarget();
            }
            throw e7;
        }
    }
}
