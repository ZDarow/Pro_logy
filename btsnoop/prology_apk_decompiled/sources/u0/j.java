package u0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import f1.C0271e;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class j extends Handler implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final int f8530l;

    /* renamed from: m, reason: collision with root package name */
    public final k f8531m;

    /* renamed from: n, reason: collision with root package name */
    public final long f8532n;

    /* renamed from: o, reason: collision with root package name */
    public i f8533o;

    /* renamed from: p, reason: collision with root package name */
    public IOException f8534p;

    /* renamed from: q, reason: collision with root package name */
    public int f8535q;

    /* renamed from: r, reason: collision with root package name */
    public Thread f8536r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f8537t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f8538u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, i iVar, int i4, long j4) {
        super(looper);
        this.f8538u = nVar;
        this.f8531m = kVar;
        this.f8533o = iVar;
        this.f8530l = i4;
        this.f8532n = j4;
    }

    public final void a(boolean z4) {
        this.f8537t = z4;
        this.f8534p = null;
        if (hasMessages(1)) {
            this.s = true;
            removeMessages(1);
            if (!z4) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.s = true;
                    this.f8531m.c();
                    Thread thread = this.f8536r;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z4) {
            this.f8538u.f8543m = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.f8533o;
            iVar.getClass();
            iVar.x(this.f8531m, elapsedRealtime, elapsedRealtime - this.f8532n, true);
            this.f8533o = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f8537t) {
            return;
        }
        int i4 = message.what;
        if (i4 == 1) {
            this.f8534p = null;
            n nVar = this.f8538u;
            ExecutorService executorService = nVar.f8542l;
            j jVar = nVar.f8543m;
            jVar.getClass();
            executorService.execute(jVar);
            return;
        }
        if (i4 == 4) {
            throw ((Error) message.obj);
        }
        this.f8538u.f8543m = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - this.f8532n;
        i iVar = this.f8533o;
        iVar.getClass();
        if (this.s) {
            iVar.x(this.f8531m, elapsedRealtime, j4, false);
            return;
        }
        int i5 = message.what;
        if (i5 == 2) {
            try {
                iVar.k(this.f8531m, elapsedRealtime, j4);
                return;
            } catch (RuntimeException e4) {
                W.a.o("LoadTask", "Unexpected exception handling load completed", e4);
                this.f8538u.f8544n = new m(e4);
                return;
            }
        }
        if (i5 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f8534p = iOException;
        int i6 = this.f8535q + 1;
        this.f8535q = i6;
        C0271e q4 = iVar.q(this.f8531m, elapsedRealtime, j4, iOException, i6);
        int i7 = q4.f5489a;
        if (i7 == 3) {
            this.f8538u.f8544n = this.f8534p;
            return;
        }
        if (i7 != 2) {
            if (i7 == 1) {
                this.f8535q = 1;
            }
            long j5 = q4.f5490b;
            if (j5 == -9223372036854775807L) {
                j5 = Math.min((this.f8535q - 1) * 1000, 5000);
            }
            n nVar2 = this.f8538u;
            W.a.j(nVar2.f8543m == null);
            nVar2.f8543m = this;
            if (j5 > 0) {
                sendEmptyMessageDelayed(1, j5);
            } else {
                this.f8534p = null;
                nVar2.f8542l.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.s;
                this.f8536r = Thread.currentThread();
            }
            if (!z4) {
                Trace.beginSection("load:".concat(this.f8531m.getClass().getSimpleName()));
                try {
                    this.f8531m.b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f8536r = null;
                Thread.interrupted();
            }
            if (this.f8537t) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e4) {
            if (this.f8537t) {
                return;
            }
            obtainMessage(3, e4).sendToTarget();
        } catch (Exception e5) {
            if (this.f8537t) {
                return;
            }
            W.a.o("LoadTask", "Unexpected exception loading stream", e5);
            obtainMessage(3, new m(e5)).sendToTarget();
        } catch (OutOfMemoryError e6) {
            if (this.f8537t) {
                return;
            }
            W.a.o("LoadTask", "OutOfMemory error loading stream", e6);
            obtainMessage(3, new m(e6)).sendToTarget();
        } catch (Error e7) {
            if (!this.f8537t) {
                W.a.o("LoadTask", "Unexpected error loading stream", e7);
                obtainMessage(4, e7).sendToTarget();
            }
            throw e7;
        }
    }
}
