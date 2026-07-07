package u0;

import B2.AbstractC0007h;
import W.x;
import W.y;
import android.os.Looper;
import android.os.SystemClock;
import f1.C0271e;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: o, reason: collision with root package name */
    public static final C0271e f8539o = new C0271e(0, -9223372036854775807L, false);

    /* renamed from: p, reason: collision with root package name */
    public static final C0271e f8540p = new C0271e(2, -9223372036854775807L, false);

    /* renamed from: q, reason: collision with root package name */
    public static final C0271e f8541q = new C0271e(3, -9223372036854775807L, false);

    /* renamed from: l, reason: collision with root package name */
    public final ExecutorService f8542l;

    /* renamed from: m, reason: collision with root package name */
    public j f8543m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f8544n;

    public n(String str) {
        String l4 = AbstractC0007h.l("ExoPlayer:Loader:", str);
        int i4 = y.f2709a;
        this.f8542l = Executors.newSingleThreadExecutor(new x(l4));
    }

    @Override // u0.o
    public final void a() {
        IOException iOException;
        IOException iOException2 = this.f8544n;
        if (iOException2 != null) {
            throw iOException2;
        }
        j jVar = this.f8543m;
        if (jVar != null && (iOException = jVar.f8534p) != null && jVar.f8535q > jVar.f8530l) {
            throw iOException;
        }
    }

    public final void b() {
        j jVar = this.f8543m;
        W.a.k(jVar);
        jVar.a(false);
    }

    public final boolean c() {
        return this.f8544n != null;
    }

    public final boolean d() {
        return this.f8543m != null;
    }

    public final void e(l lVar) {
        j jVar = this.f8543m;
        if (jVar != null) {
            jVar.a(true);
        }
        ExecutorService executorService = this.f8542l;
        if (lVar != null) {
            executorService.execute(new F.b(13, lVar));
        }
        executorService.shutdown();
    }

    public final long f(k kVar, i iVar, int i4) {
        Looper myLooper = Looper.myLooper();
        W.a.k(myLooper);
        this.f8544n = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        j jVar = new j(this, myLooper, kVar, iVar, i4, elapsedRealtime);
        W.a.j(this.f8543m == null);
        this.f8543m = jVar;
        jVar.f8534p = null;
        this.f8542l.execute(jVar);
        return elapsedRealtime;
    }
}
