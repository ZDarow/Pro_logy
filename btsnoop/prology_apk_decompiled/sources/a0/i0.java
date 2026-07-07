package a0;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0125e f3503a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f3504b;

    /* renamed from: c, reason: collision with root package name */
    public final W.t f3505c;

    /* renamed from: d, reason: collision with root package name */
    public int f3506d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3507e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f3508f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3509g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3510h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3511i;

    public i0(g0 g0Var, AbstractC0125e abstractC0125e, T.U u4, int i4, W.t tVar, Looper looper) {
        this.f3504b = g0Var;
        this.f3503a = abstractC0125e;
        this.f3508f = looper;
        this.f3505c = tVar;
    }

    public final synchronized void a(long j4) {
        boolean z4;
        W.a.j(this.f3509g);
        W.a.j(this.f3508f.getThread() != Thread.currentThread());
        this.f3505c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j4;
        while (true) {
            z4 = this.f3511i;
            if (z4 || j4 <= 0) {
                break;
            }
            this.f3505c.getClass();
            wait(j4);
            this.f3505c.getClass();
            j4 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z4) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z4) {
        this.f3510h = z4 | this.f3510h;
        this.f3511i = true;
        notifyAll();
    }

    public final void c() {
        W.a.j(!this.f3509g);
        this.f3509g = true;
        N n4 = (N) this.f3504b;
        synchronized (n4) {
            if (!n4.f3293K && n4.f3321u.getThread().isAlive()) {
                n4.s.a(14, this).b();
                return;
            }
            W.a.A("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
