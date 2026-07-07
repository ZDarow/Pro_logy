package d0;

import I.C0044m;
import T.B;
import T.C0102x;
import T.C0103y;
import W.y;
import Y.C;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.C0159k;
import e0.C0251c;
import f2.Y;
import java.io.IOException;
import java.util.HashMap;
import q0.AbstractC0469a;
import q0.C0491x;
import q0.F;
import q0.InterfaceC0467D;
import r0.C0506h;
import t0.C0560b;
import u0.p;
import u0.q;
import v0.AbstractC0587a;

/* loaded from: classes.dex */
public final class g extends AbstractC0469a {

    /* renamed from: A, reason: collision with root package name */
    public final long f4849A;

    /* renamed from: B, reason: collision with root package name */
    public final f0.e f4850B;

    /* renamed from: C, reason: collision with root package name */
    public final p f4851C;

    /* renamed from: D, reason: collision with root package name */
    public final d f4852D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f4853E;

    /* renamed from: F, reason: collision with root package name */
    public final SparseArray f4854F;

    /* renamed from: G, reason: collision with root package name */
    public final RunnableC0230c f4855G;

    /* renamed from: H, reason: collision with root package name */
    public final RunnableC0230c f4856H;

    /* renamed from: I, reason: collision with root package name */
    public final d f4857I;
    public final u0.o J;

    /* renamed from: K, reason: collision with root package name */
    public Y.h f4858K;

    /* renamed from: L, reason: collision with root package name */
    public u0.n f4859L;

    /* renamed from: M, reason: collision with root package name */
    public C f4860M;

    /* renamed from: N, reason: collision with root package name */
    public C0159k f4861N;

    /* renamed from: O, reason: collision with root package name */
    public Handler f4862O;

    /* renamed from: P, reason: collision with root package name */
    public C0102x f4863P;

    /* renamed from: Q, reason: collision with root package name */
    public Uri f4864Q;

    /* renamed from: R, reason: collision with root package name */
    public final Uri f4865R;

    /* renamed from: S, reason: collision with root package name */
    public C0251c f4866S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4867T;

    /* renamed from: U, reason: collision with root package name */
    public long f4868U;

    /* renamed from: V, reason: collision with root package name */
    public long f4869V;

    /* renamed from: W, reason: collision with root package name */
    public long f4870W;

    /* renamed from: X, reason: collision with root package name */
    public int f4871X;

    /* renamed from: Y, reason: collision with root package name */
    public long f4872Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f4873Z;

    /* renamed from: a0, reason: collision with root package name */
    public B f4874a0;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final Y.g f4875t;

    /* renamed from: u, reason: collision with root package name */
    public final P2.a f4876u;

    /* renamed from: v, reason: collision with root package name */
    public final L1.g f4877v;
    public final f0.i w;

    /* renamed from: x, reason: collision with root package name */
    public final C0560b f4878x;

    /* renamed from: y, reason: collision with root package name */
    public final C0044m f4879y;

    /* renamed from: z, reason: collision with root package name */
    public final long f4880z;

    static {
        T.C.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [d0.c] */
    public g(B b4, Y.g gVar, p pVar, P2.a aVar, L1.g gVar2, f0.i iVar, C0560b c0560b, long j4, long j5) {
        this.f4874a0 = b4;
        this.f4863P = b4.f2068c;
        C0103y c0103y = b4.f2067b;
        c0103y.getClass();
        Uri uri = c0103y.f2364a;
        this.f4864Q = uri;
        this.f4865R = uri;
        this.f4866S = null;
        this.f4875t = gVar;
        this.f4851C = pVar;
        this.f4876u = aVar;
        this.w = iVar;
        this.f4878x = c0560b;
        this.f4880z = j4;
        this.f4849A = j5;
        this.f4877v = gVar2;
        this.f4879y = new C0044m(7);
        this.s = false;
        this.f4850B = a(null);
        this.f4853E = new Object();
        this.f4854F = new SparseArray();
        this.f4857I = new d(this, 1);
        this.f4872Y = -9223372036854775807L;
        this.f4870W = -9223372036854775807L;
        this.f4852D = new d(this, 2);
        this.J = new d(this, 3);
        final int i4 = 0;
        this.f4855G = new Runnable(this) { // from class: d0.c

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ g f4835m;

            {
                this.f4835m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f4835m.B();
                        return;
                    default:
                        this.f4835m.A(false);
                        return;
                }
            }
        };
        final int i5 = 1;
        this.f4856H = new Runnable(this) { // from class: d0.c

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ g f4835m;

            {
                this.f4835m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f4835m.B();
                        return;
                    default:
                        this.f4835m.A(false);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean v(e0.h r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List r2 = r5.f5063c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            e0.a r2 = (e0.C0249a) r2
            int r2 = r2.f5020b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.g.v(e0.h):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c6, code lost:
    
        r2 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f2, code lost:
    
        if (r10 != (-9223372036854775807L)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x035e, code lost:
    
        if (r12.f2354a == (-9223372036854775807L)) goto L184;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r2v20, types: [t0.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r41) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.g.A(boolean):void");
    }

    public final void B() {
        Uri uri;
        this.f4862O.removeCallbacks(this.f4855G);
        if (this.f4859L.c()) {
            return;
        }
        if (this.f4859L.d()) {
            this.f4867T = true;
            return;
        }
        synchronized (this.f4853E) {
            uri = this.f4864Q;
        }
        this.f4867T = false;
        q qVar = new q(this.f4858K, uri, 4, this.f4851C);
        d dVar = this.f4852D;
        this.f4878x.getClass();
        this.f4850B.k(new C0491x(qVar.f8545l, qVar.f8546m, this.f4859L.f(qVar, dVar, 3)), qVar.f8547n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // q0.AbstractC0469a
    public final InterfaceC0467D b(F f4, u0.e eVar, long j4) {
        int intValue = ((Integer) f4.f7668a).intValue() - this.f4873Z;
        f0.e a4 = a(f4);
        f0.e eVar2 = new f0.e(this.f7811o.f5456c, 0, f4);
        int i4 = this.f4873Z + intValue;
        C0251c c0251c = this.f4866S;
        C c4 = this.f4860M;
        long j5 = this.f4870W;
        b0.l lVar = this.f7814r;
        W.a.k(lVar);
        C0229b c0229b = new C0229b(i4, c0251c, this.f4879y, intValue, this.f4876u, c4, this.w, eVar2, this.f4878x, a4, j5, this.J, eVar, this.f4877v, this.f4857I, lVar);
        this.f4854F.put(i4, c0229b);
        return c0229b;
    }

    @Override // q0.AbstractC0469a
    public final synchronized B h() {
        return this.f4874a0;
    }

    @Override // q0.AbstractC0469a
    public final void j() {
        this.J.a();
    }

    @Override // q0.AbstractC0469a
    public final void m(C c4) {
        this.f4860M = c4;
        Looper myLooper = Looper.myLooper();
        b0.l lVar = this.f7814r;
        W.a.k(lVar);
        f0.i iVar = this.w;
        iVar.b(myLooper, lVar);
        iVar.c();
        if (this.s) {
            A(false);
            return;
        }
        this.f4858K = this.f4875t.a();
        this.f4859L = new u0.n("DashMediaSource");
        this.f4862O = y.n(null);
        B();
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
        C0229b c0229b = (C0229b) interfaceC0467D;
        o oVar = c0229b.f4831x;
        oVar.f4924t = true;
        oVar.f4920o.removeCallbacksAndMessages(null);
        for (C0506h c0506h : c0229b.f4815C) {
            c0506h.B(c0229b);
        }
        c0229b.f4814B = null;
        this.f4854F.remove(c0229b.f4821l);
    }

    @Override // q0.AbstractC0469a
    public final void r() {
        this.f4867T = false;
        this.f4858K = null;
        u0.n nVar = this.f4859L;
        if (nVar != null) {
            nVar.e(null);
            this.f4859L = null;
        }
        this.f4868U = 0L;
        this.f4869V = 0L;
        this.f4864Q = this.f4865R;
        this.f4861N = null;
        Handler handler = this.f4862O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f4862O = null;
        }
        this.f4870W = -9223372036854775807L;
        this.f4871X = 0;
        this.f4872Y = -9223372036854775807L;
        this.f4854F.clear();
        C0044m c0044m = this.f4879y;
        ((HashMap) c0044m.f847l).clear();
        ((HashMap) c0044m.f848m).clear();
        ((HashMap) c0044m.f849n).clear();
        this.w.release();
    }

    @Override // q0.AbstractC0469a
    public final synchronized void u(B b4) {
        this.f4874a0 = b4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, u0.k] */
    public final void w() {
        boolean z4;
        u0.n nVar;
        u0.n nVar2 = this.f4859L;
        d dVar = new d(this, 0);
        synchronized (AbstractC0587a.f8656b) {
            z4 = AbstractC0587a.f8657c;
            nVar = nVar2;
        }
        if (z4) {
            dVar.b();
            return;
        }
        if (nVar2 == null) {
            nVar = new u0.n("SntpClient");
        }
        nVar.f(new Object(), new Y(28, dVar), 1);
    }

    public final void y(q qVar, long j4, long j5) {
        long j6 = qVar.f8545l;
        Uri uri = qVar.f8548o.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.f4878x.getClass();
        this.f4850B.c(c0491x, qVar.f8547n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void z(IOException iOException) {
        W.a.o("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f4870W = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        A(true);
    }
}
