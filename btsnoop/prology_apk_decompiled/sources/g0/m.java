package g0;

import T.B;
import T.C0101w;
import T.C0102x;
import T.C0103y;
import W.y;
import Y.C;
import android.net.Uri;
import android.os.Looper;
import f2.I;
import f2.Y;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import q0.AbstractC0469a;
import q0.C0491x;
import q0.F;
import q0.InterfaceC0467D;
import q0.h0;
import t0.C0560b;

/* loaded from: classes.dex */
public final class m extends AbstractC0469a {

    /* renamed from: A, reason: collision with root package name */
    public final long f5723A;

    /* renamed from: B, reason: collision with root package name */
    public C0102x f5724B;

    /* renamed from: C, reason: collision with root package name */
    public C f5725C;

    /* renamed from: D, reason: collision with root package name */
    public B f5726D;
    public final C0307c s;

    /* renamed from: t, reason: collision with root package name */
    public final Y f5727t;

    /* renamed from: u, reason: collision with root package name */
    public final L1.g f5728u;

    /* renamed from: v, reason: collision with root package name */
    public final f0.i f5729v;
    public final C0560b w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5730x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5731y;

    /* renamed from: z, reason: collision with root package name */
    public final h0.c f5732z;

    static {
        T.C.a("media3.exoplayer.hls");
    }

    public m(B b4, Y y4, C0307c c0307c, L1.g gVar, f0.i iVar, C0560b c0560b, h0.c cVar, long j4, boolean z4, int i4) {
        this.f5726D = b4;
        this.f5724B = b4.f2068c;
        this.f5727t = y4;
        this.s = c0307c;
        this.f5728u = gVar;
        this.f5729v = iVar;
        this.w = c0560b;
        this.f5732z = cVar;
        this.f5723A = j4;
        this.f5730x = z4;
        this.f5731y = i4;
    }

    public static h0.d v(I i4, long j4) {
        h0.d dVar = null;
        for (int i5 = 0; i5 < i4.size(); i5++) {
            h0.d dVar2 = (h0.d) i4.get(i5);
            long j5 = dVar2.f5885p;
            if (j5 > j4 || !dVar2.w) {
                if (j5 > j4) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @Override // q0.AbstractC0469a
    public final InterfaceC0467D b(F f4, u0.e eVar, long j4) {
        f0.e a4 = a(f4);
        f0.e eVar2 = new f0.e(this.f7811o.f5456c, 0, f4);
        C c4 = this.f5725C;
        b0.l lVar = this.f7814r;
        W.a.k(lVar);
        return new l(this.s, this.f5732z, this.f5727t, c4, this.f5729v, eVar2, this.w, a4, eVar, this.f5728u, this.f5730x, this.f5731y, lVar);
    }

    @Override // q0.AbstractC0469a
    public final synchronized B h() {
        return this.f5726D;
    }

    @Override // q0.AbstractC0469a
    public final void j() {
        h0.c cVar = this.f5732z;
        u0.n nVar = cVar.f5870r;
        if (nVar != null) {
            nVar.a();
        }
        Uri uri = cVar.f5873v;
        if (uri != null) {
            h0.b bVar = (h0.b) cVar.f5867o.get(uri);
            bVar.f5854m.a();
            IOException iOException = bVar.f5861u;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // q0.AbstractC0469a
    public final void m(C c4) {
        this.f5725C = c4;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        b0.l lVar = this.f7814r;
        W.a.k(lVar);
        f0.i iVar = this.f5729v;
        iVar.b(myLooper, lVar);
        iVar.c();
        f0.e a4 = a(null);
        C0103y c0103y = h().f2067b;
        c0103y.getClass();
        h0.c cVar = this.f5732z;
        cVar.getClass();
        cVar.s = y.n(null);
        cVar.f5869q = a4;
        cVar.f5871t = this;
        u0.q qVar = new u0.q(((Y.g) cVar.f5864l.f5535m).a(), c0103y.f2364a, 4, cVar.f5865m.q());
        W.a.j(cVar.f5870r == null);
        u0.n nVar = new u0.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f5870r = nVar;
        C0560b c0560b = cVar.f5866n;
        int i4 = qVar.f8547n;
        a4.k(new C0491x(qVar.f8545l, qVar.f8546m, nVar.f(qVar, cVar, c0560b.e(i4))), i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
        l lVar = (l) interfaceC0467D;
        lVar.f5711m.f5868p.remove(lVar);
        for (r rVar : lVar.f5706E) {
            if (rVar.f5761O) {
                for (q qVar : rVar.f5754G) {
                    qVar.g();
                    K2.o oVar = qVar.f7791h;
                    if (oVar != null) {
                        oVar.K(qVar.f7788e);
                        qVar.f7791h = null;
                        qVar.f7790g = null;
                    }
                }
            }
            i iVar = rVar.f5785o;
            h0.b bVar = (h0.b) iVar.f5663g.f5867o.get(iVar.f5661e[iVar.f5673q.a()]);
            if (bVar != null) {
                bVar.f5862v = false;
            }
            iVar.f5670n = null;
            rVar.f5790u.e(rVar);
            rVar.f5750C.removeCallbacksAndMessages(null);
            rVar.f5765S = true;
            rVar.f5751D.clear();
        }
        lVar.f5703B = null;
    }

    @Override // q0.AbstractC0469a
    public final void r() {
        h0.c cVar = this.f5732z;
        cVar.f5873v = null;
        cVar.w = null;
        cVar.f5872u = null;
        cVar.f5875y = -9223372036854775807L;
        cVar.f5870r.e(null);
        cVar.f5870r = null;
        HashMap hashMap = cVar.f5867o;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((h0.b) it.next()).f5854m.e(null);
        }
        cVar.s.removeCallbacksAndMessages(null);
        cVar.s = null;
        hashMap.clear();
        this.f5729v.release();
    }

    @Override // q0.AbstractC0469a
    public final synchronized void u(B b4) {
        this.f5726D = b4;
    }

    public final void w(h0.i iVar) {
        h0 h0Var;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z4 = iVar.f5908p;
        long j8 = iVar.f5900h;
        long Z3 = z4 ? y.Z(j8) : -9223372036854775807L;
        int i4 = iVar.f5896d;
        long j9 = (i4 == 2 || i4 == 1) ? Z3 : -9223372036854775807L;
        h0.c cVar = this.f5732z;
        cVar.f5872u.getClass();
        L1.g gVar = new L1.g(18, false);
        boolean z5 = cVar.f5874x;
        long j10 = iVar.f5912u;
        I i5 = iVar.f5910r;
        boolean z6 = iVar.f5899g;
        long j11 = Z3;
        long j12 = iVar.f5897e;
        if (z5) {
            long j13 = j9;
            long j14 = j8 - cVar.f5875y;
            boolean z7 = iVar.f5907o;
            long j15 = z7 ? j14 + j10 : -9223372036854775807L;
            long M3 = iVar.f5908p ? y.M(y.z(this.f5723A)) - (j8 + j10) : 0L;
            long j16 = this.f5724B.f2359a;
            h0.h hVar = iVar.f5913v;
            if (j16 != -9223372036854775807L) {
                j5 = y.M(j16);
            } else {
                if (j12 != -9223372036854775807L) {
                    j4 = j10 - j12;
                } else {
                    long j17 = hVar.f5894d;
                    if (j17 == -9223372036854775807L || iVar.f5906n == -9223372036854775807L) {
                        j4 = hVar.f5893c;
                        if (j4 == -9223372036854775807L) {
                            j4 = iVar.f5905m * 3;
                        }
                    } else {
                        j4 = j17;
                    }
                }
                j5 = j4 + M3;
            }
            long j18 = j10 + M3;
            long k4 = y.k(j5, M3, j18);
            C0102x c0102x = h().f2068c;
            boolean z8 = c0102x.f2362d == -3.4028235E38f && c0102x.f2363e == -3.4028235E38f && hVar.f5893c == -9223372036854775807L && hVar.f5894d == -9223372036854775807L;
            C0101w c0101w = new C0101w();
            c0101w.f2354a = y.Z(k4);
            c0101w.f2357d = z8 ? 1.0f : this.f5724B.f2362d;
            c0101w.f2358e = z8 ? 1.0f : this.f5724B.f2363e;
            C0102x c0102x2 = new C0102x(c0101w);
            this.f5724B = c0102x2;
            if (j12 == -9223372036854775807L) {
                j12 = j18 - y.M(c0102x2.f2359a);
            }
            if (z6) {
                j7 = j12;
            } else {
                h0.d v4 = v(iVar.s, j12);
                if (v4 != null) {
                    j6 = v4.f5885p;
                } else if (i5.isEmpty()) {
                    j7 = 0;
                } else {
                    h0.f fVar = (h0.f) i5.get(y.d(i5, Long.valueOf(j12), true));
                    h0.d v5 = v(fVar.f5880x, j12);
                    j6 = v5 != null ? v5.f5885p : fVar.f5885p;
                }
                j7 = j6;
            }
            h0Var = new h0(j13, j11, j15, iVar.f5912u, j14, j7, true, !z7, i4 == 2 && iVar.f5898f, gVar, h(), this.f5724B);
        } else {
            long j19 = j9;
            long j20 = (j12 == -9223372036854775807L || i5.isEmpty()) ? 0L : (z6 || j12 == j10) ? j12 : ((h0.f) i5.get(y.d(i5, Long.valueOf(j12), true))).f5885p;
            B h4 = h();
            long j21 = iVar.f5912u;
            h0Var = new h0(j19, j11, j21, j21, 0L, j20, true, false, true, gVar, h4, null);
        }
        n(h0Var);
    }
}
