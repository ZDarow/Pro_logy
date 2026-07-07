package w0;

import T.C0094o;
import T.C0095p;
import T.H;
import T.d0;
import W.y;
import a0.C0116F;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import i1.ExecutorC0342b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: w0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597g {

    /* renamed from: m, reason: collision with root package name */
    public static final ExecutorC0342b f8768m = new ExecutorC0342b(1);

    /* renamed from: a, reason: collision with root package name */
    public final C0596f f8769a;

    /* renamed from: b, reason: collision with root package name */
    public final p f8770b;

    /* renamed from: c, reason: collision with root package name */
    public final t f8771c;

    /* renamed from: d, reason: collision with root package name */
    public final C0593c f8772d;

    /* renamed from: e, reason: collision with root package name */
    public final W.t f8773e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f8774f;

    /* renamed from: g, reason: collision with root package name */
    public C0095p f8775g;

    /* renamed from: h, reason: collision with root package name */
    public C0116F f8776h;

    /* renamed from: i, reason: collision with root package name */
    public W.v f8777i;

    /* renamed from: j, reason: collision with root package name */
    public Pair f8778j;

    /* renamed from: k, reason: collision with root package name */
    public int f8779k;

    /* renamed from: l, reason: collision with root package name */
    public int f8780l;

    public C0597g(N1.r rVar) {
        C0596f c0596f = new C0596f(this, (Context) rVar.f1308b);
        this.f8769a = c0596f;
        W.t tVar = (W.t) rVar.f1312f;
        this.f8773e = tVar;
        p pVar = (p) rVar.f1309c;
        this.f8770b = pVar;
        pVar.f8848k = tVar;
        this.f8771c = new t(new C0591a(this), pVar);
        C0593c c0593c = (C0593c) rVar.f1311e;
        W.a.k(c0593c);
        this.f8772d = c0593c;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f8774f = copyOnWriteArraySet;
        this.f8780l = 0;
        copyOnWriteArraySet.add(c0596f);
    }

    public final void a(long j4, long j5) {
        t tVar;
        W.l lVar;
        int i4;
        if (this.f8779k != 0 || (i4 = (lVar = (tVar = this.f8771c).f8876f).f2674b) == 0) {
            return;
        }
        if (i4 == 0) {
            throw new NoSuchElementException();
        }
        long j6 = ((long[]) lVar.f2676d)[lVar.f2673a];
        Long l4 = (Long) tVar.f8875e.g(j6);
        p pVar = tVar.f8872b;
        if (l4 != null && l4.longValue() != tVar.f8879i) {
            tVar.f8879i = l4.longValue();
            pVar.c(2);
        }
        int a4 = tVar.f8872b.a(j6, j4, j5, tVar.f8879i, false, tVar.f8873c);
        C0597g c0597g = (C0597g) tVar.f8871a.f8747l;
        if (a4 != 0 && a4 != 1) {
            if (a4 != 2 && a4 != 3 && a4 != 4) {
                if (a4 != 5) {
                    throw new IllegalStateException(String.valueOf(a4));
                }
                return;
            }
            tVar.f8880j = j6;
            lVar.z();
            Iterator it = c0597g.f8774f.iterator();
            while (it.hasNext()) {
                C0596f c0596f = (C0596f) it.next();
                c0596f.f8766i.execute(new RunnableC0595e(c0596f, c0596f.f8765h, 1));
            }
            W.a.k(null);
            throw null;
        }
        tVar.f8880j = j6;
        long z4 = lVar.z();
        d0 d0Var = (d0) tVar.f8874d.g(z4);
        if (d0Var != null && !d0Var.equals(d0.f2230e) && !d0Var.equals(tVar.f8878h)) {
            tVar.f8878h = d0Var;
            C0094o c0094o = new C0094o();
            c0094o.f2296r = d0Var.f2231a;
            c0094o.s = d0Var.f2232b;
            c0094o.f2290l = H.l("video/raw");
            c0597g.f8775g = new C0095p(c0094o);
            Iterator it2 = c0597g.f8774f.iterator();
            while (it2.hasNext()) {
                C0596f c0596f2 = (C0596f) it2.next();
                c0596f2.f8766i.execute(new RunnableC0595e(c0596f2, c0596f2.f8765h, d0Var));
            }
        }
        boolean z5 = pVar.f8841d != 3;
        pVar.f8841d = 3;
        pVar.f8848k.getClass();
        pVar.f8843f = y.M(SystemClock.elapsedRealtime());
        if (z5 && c0597g.f8778j != null) {
            Iterator it3 = c0597g.f8774f.iterator();
            while (it3.hasNext()) {
                C0596f c0596f3 = (C0596f) it3.next();
                c0596f3.f8766i.execute(new RunnableC0595e(c0596f3, c0596f3.f8765h, 2));
            }
        }
        if (c0597g.f8776h != null) {
            if (c0597g.f8775g == null) {
                new C0094o().a();
            }
            C0116F c0116f = c0597g.f8776h;
            c0597g.f8773e.getClass();
            c0116f.c(z4, System.nanoTime());
        }
        W.a.k(null);
        throw null;
    }
}
