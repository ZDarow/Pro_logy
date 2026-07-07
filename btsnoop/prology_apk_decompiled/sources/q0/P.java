package q0;

import T.C0098t;
import a.AbstractC0110a;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class P implements u0.k {

    /* renamed from: m, reason: collision with root package name */
    public final Uri f7701m;

    /* renamed from: n, reason: collision with root package name */
    public final Y.B f7702n;

    /* renamed from: o, reason: collision with root package name */
    public final android.support.v4.media.session.t f7703o;

    /* renamed from: p, reason: collision with root package name */
    public final T f7704p;

    /* renamed from: q, reason: collision with root package name */
    public final T2.n f7705q;
    public volatile boolean s;

    /* renamed from: u, reason: collision with root package name */
    public long f7708u;
    public y0.F w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7710x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ T f7711y;

    /* renamed from: r, reason: collision with root package name */
    public final C0098t f7706r = new Object();

    /* renamed from: t, reason: collision with root package name */
    public boolean f7707t = true;

    /* renamed from: l, reason: collision with root package name */
    public final long f7700l = C0491x.f7929b.getAndIncrement();

    /* renamed from: v, reason: collision with root package name */
    public Y.l f7709v = a(0);

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, T.t] */
    public P(T t4, Uri uri, Y.h hVar, android.support.v4.media.session.t tVar, T t5, T2.n nVar) {
        this.f7711y = t4;
        this.f7701m = uri;
        this.f7702n = new Y.B(hVar);
        this.f7703o = tVar;
        this.f7704p = t5;
        this.f7705q = nVar;
    }

    public final Y.l a(long j4) {
        Collections.emptyMap();
        this.f7711y.getClass();
        Map map = T.f7716Y;
        Uri uri = this.f7701m;
        W.a.l(uri, "The uri must be set.");
        return new Y.l(uri, 1, null, map, j4, -1L, null, 6);
    }

    @Override // u0.k
    public final void b() {
        Y.h hVar;
        y0.o oVar;
        int i4;
        int i5 = 0;
        while (i5 == 0 && !this.s) {
            try {
                long j4 = this.f7706r.f2352a;
                Y.l a4 = a(j4);
                this.f7709v = a4;
                long b4 = this.f7702n.b(a4);
                if (this.s) {
                    if (i5 != 1 && this.f7703o.f0() != -1) {
                        this.f7706r.f2352a = this.f7703o.f0();
                    }
                    AbstractC0110a.m(this.f7702n);
                    return;
                }
                if (b4 != -1) {
                    b4 += j4;
                    T t4 = this.f7711y;
                    t4.f7718A.post(new N(t4, 0));
                }
                long j5 = b4;
                this.f7711y.f7720C = L0.b.d(this.f7702n.f2988l.y());
                Y.B b5 = this.f7702n;
                L0.b bVar = this.f7711y.f7720C;
                if (bVar == null || (i4 = bVar.f1049q) == -1) {
                    hVar = b5;
                } else {
                    hVar = new C0490w(b5, i4, this);
                    T t5 = this.f7711y;
                    t5.getClass();
                    y0.F C4 = t5.C(new S(0, true));
                    this.w = C4;
                    C4.c(T.f7717Z);
                }
                long j6 = j4;
                this.f7703o.m0(hVar, this.f7701m, this.f7702n.f2988l.y(), j4, j5, this.f7704p);
                if (this.f7711y.f7720C != null && (oVar = (y0.o) this.f7703o.f3735n) != null) {
                    y0.o d4 = oVar.d();
                    if (d4 instanceof R0.d) {
                        ((R0.d) d4).f1742r = true;
                    }
                }
                if (this.f7707t) {
                    android.support.v4.media.session.t tVar = this.f7703o;
                    long j7 = this.f7708u;
                    y0.o oVar2 = (y0.o) tVar.f3735n;
                    oVar2.getClass();
                    oVar2.b(j6, j7);
                    this.f7707t = false;
                }
                while (true) {
                    long j8 = j6;
                    while (i5 == 0 && !this.s) {
                        try {
                            T2.n nVar = this.f7705q;
                            synchronized (nVar) {
                                while (!nVar.f2455a) {
                                    nVar.wait();
                                }
                            }
                            android.support.v4.media.session.t tVar2 = this.f7703o;
                            C0098t c0098t = this.f7706r;
                            y0.o oVar3 = (y0.o) tVar2.f3735n;
                            oVar3.getClass();
                            y0.l lVar = (y0.l) tVar2.f3736o;
                            lVar.getClass();
                            i5 = oVar3.l(lVar, c0098t);
                            j6 = this.f7703o.f0();
                            if (j6 > this.f7711y.f7748t + j8) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f7705q.a();
                    T t6 = this.f7711y;
                    t6.f7718A.post(t6.f7753z);
                }
                if (i5 == 1) {
                    i5 = 0;
                } else if (this.f7703o.f0() != -1) {
                    this.f7706r.f2352a = this.f7703o.f0();
                }
                AbstractC0110a.m(this.f7702n);
            } catch (Throwable th) {
                if (i5 != 1 && this.f7703o.f0() != -1) {
                    this.f7706r.f2352a = this.f7703o.f0();
                }
                AbstractC0110a.m(this.f7702n);
                throw th;
            }
        }
    }

    @Override // u0.k
    public final void c() {
        this.s = true;
    }
}
