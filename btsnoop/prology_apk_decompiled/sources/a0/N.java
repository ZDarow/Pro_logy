package a0;

import B2.AbstractC0007h;
import T.C0095p;
import T.C0102x;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import f2.AbstractC0275C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.C0470b;
import q0.InterfaceC0466C;
import q0.InterfaceC0467D;
import s0.C0542d;

/* loaded from: classes.dex */
public final class N implements Handler.Callback, InterfaceC0466C, g0 {

    /* renamed from: e0, reason: collision with root package name */
    public static final long f3283e0 = W.y.Z(10000);

    /* renamed from: A, reason: collision with root package name */
    public final W.t f3284A;

    /* renamed from: B, reason: collision with root package name */
    public final C0145z f3285B;

    /* renamed from: C, reason: collision with root package name */
    public final W f3286C;

    /* renamed from: D, reason: collision with root package name */
    public final e0 f3287D;

    /* renamed from: E, reason: collision with root package name */
    public final C0128h f3288E;

    /* renamed from: F, reason: collision with root package name */
    public final long f3289F;

    /* renamed from: G, reason: collision with root package name */
    public final b0.l f3290G;

    /* renamed from: H, reason: collision with root package name */
    public m0 f3291H;

    /* renamed from: I, reason: collision with root package name */
    public f0 f3292I;
    public K J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3293K;

    /* renamed from: M, reason: collision with root package name */
    public boolean f3295M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3296N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f3298P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3299Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3300R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3301S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f3302T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3303U;

    /* renamed from: V, reason: collision with root package name */
    public int f3304V;

    /* renamed from: W, reason: collision with root package name */
    public M f3305W;

    /* renamed from: X, reason: collision with root package name */
    public long f3306X;

    /* renamed from: Y, reason: collision with root package name */
    public long f3307Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3308Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3309a0;

    /* renamed from: b0, reason: collision with root package name */
    public C0133m f3310b0;

    /* renamed from: d0, reason: collision with root package name */
    public r f3312d0;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0125e[] f3313l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f3314m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0125e[] f3315n;

    /* renamed from: o, reason: collision with root package name */
    public final t0.u f3316o;

    /* renamed from: p, reason: collision with root package name */
    public final t0.v f3317p;

    /* renamed from: q, reason: collision with root package name */
    public final C0130j f3318q;

    /* renamed from: r, reason: collision with root package name */
    public final u0.d f3319r;
    public final W.v s;

    /* renamed from: t, reason: collision with root package name */
    public final HandlerThread f3320t;

    /* renamed from: u, reason: collision with root package name */
    public final Looper f3321u;

    /* renamed from: v, reason: collision with root package name */
    public final T.T f3322v;
    public final T.S w;

    /* renamed from: x, reason: collision with root package name */
    public final long f3323x;

    /* renamed from: y, reason: collision with root package name */
    public final C0131k f3324y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f3325z;

    /* renamed from: L, reason: collision with root package name */
    public boolean f3294L = false;

    /* renamed from: c0, reason: collision with root package name */
    public long f3311c0 = -9223372036854775807L;

    /* renamed from: O, reason: collision with root package name */
    public long f3297O = -9223372036854775807L;

    public N(AbstractC0125e[] abstractC0125eArr, t0.u uVar, t0.v vVar, C0130j c0130j, u0.d dVar, int i4, boolean z4, b0.e eVar, m0 m0Var, C0128h c0128h, long j4, Looper looper, W.t tVar, C0145z c0145z, b0.l lVar, r rVar) {
        this.f3285B = c0145z;
        this.f3313l = abstractC0125eArr;
        this.f3316o = uVar;
        this.f3317p = vVar;
        this.f3318q = c0130j;
        this.f3319r = dVar;
        this.f3299Q = i4;
        this.f3300R = z4;
        this.f3291H = m0Var;
        this.f3288E = c0128h;
        this.f3289F = j4;
        this.f3284A = tVar;
        this.f3290G = lVar;
        this.f3312d0 = rVar;
        this.f3323x = c0130j.f3519h;
        T.Q q4 = T.U.f2168a;
        f0 i5 = f0.i(vVar);
        this.f3292I = i5;
        this.J = new K(i5);
        this.f3315n = new AbstractC0125e[abstractC0125eArr.length];
        t0.q qVar = (t0.q) uVar;
        qVar.getClass();
        for (int i6 = 0; i6 < abstractC0125eArr.length; i6++) {
            AbstractC0125e abstractC0125e = abstractC0125eArr[i6];
            abstractC0125e.f3425p = i6;
            abstractC0125e.f3426q = lVar;
            abstractC0125e.f3427r = tVar;
            this.f3315n[i6] = abstractC0125e;
            AbstractC0125e abstractC0125e2 = this.f3315n[i6];
            synchronized (abstractC0125e2.f3421l) {
                abstractC0125e2.f3420B = qVar;
            }
        }
        this.f3324y = new C0131k(this, tVar);
        this.f3325z = new ArrayList();
        this.f3314m = Collections.newSetFromMap(new IdentityHashMap());
        this.f3322v = new T.T();
        this.w = new T.S();
        uVar.f8386a = this;
        uVar.f8387b = dVar;
        this.f3309a0 = true;
        W.v a4 = tVar.a(looper, null);
        this.f3286C = new W(eVar, a4, new B2.x(20, this), rVar);
        this.f3287D = new e0(this, eVar, a4, lVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f3320t = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f3321u = looper2;
        this.s = tVar.a(looper2, this);
    }

    public static Pair F(T.U u4, M m4, boolean z4, int i4, boolean z5, T.T t4, T.S s) {
        Pair i5;
        int G3;
        T.U u5 = m4.f3280a;
        if (u4.p()) {
            return null;
        }
        T.U u6 = u5.p() ? u4 : u5;
        try {
            i5 = u6.i(t4, s, m4.f3281b, m4.f3282c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (u4.equals(u6)) {
            return i5;
        }
        if (u4.b(i5.first) != -1) {
            return (u6.g(i5.first, s).f2148f && u6.m(s.f2145c, t4, 0L).f2165n == u6.b(i5.first)) ? u4.i(t4, s, u4.g(i5.first, s).f2145c, m4.f3282c) : i5;
        }
        if (z4 && (G3 = G(t4, s, i4, z5, i5.first, u6, u4)) != -1) {
            return u4.i(t4, s, G3, -9223372036854775807L);
        }
        return null;
    }

    public static int G(T.T t4, T.S s, int i4, boolean z4, Object obj, T.U u4, T.U u5) {
        Object obj2 = u4.m(u4.g(obj, s).f2145c, t4, 0L).f2152a;
        for (int i5 = 0; i5 < u5.o(); i5++) {
            if (u5.m(i5, t4, 0L).f2152a.equals(obj2)) {
                return i5;
            }
        }
        int b4 = u4.b(obj);
        int h4 = u4.h();
        int i6 = b4;
        int i7 = -1;
        for (int i8 = 0; i8 < h4 && i7 == -1; i8++) {
            i6 = u4.d(i6, s, t4, i4, z4);
            if (i6 == -1) {
                break;
            }
            i7 = u5.b(u4.l(i6));
        }
        if (i7 == -1) {
            return -1;
        }
        return u5.f(i7, s, false).f2145c;
    }

    public static void N(AbstractC0125e abstractC0125e, long j4) {
        abstractC0125e.f3432y = true;
        if (abstractC0125e instanceof C0542d) {
            C0542d c0542d = (C0542d) abstractC0125e;
            W.a.j(c0542d.f3432y);
            c0542d.f8213V = j4;
        }
    }

    public static boolean q(AbstractC0125e abstractC0125e) {
        return abstractC0125e.s != 0;
    }

    public final void A() {
        float f4 = this.f3324y.b().f2127a;
        W w = this.f3286C;
        T t4 = w.f3371i;
        T t5 = w.f3372j;
        t0.v vVar = null;
        T t6 = t4;
        boolean z4 = true;
        while (t6 != null && t6.f3338d) {
            t0.v h4 = t6.h(f4, this.f3292I.f3459a);
            t0.v vVar2 = t6 == this.f3286C.f3371i ? h4 : vVar;
            t0.v vVar3 = t6.f3348n;
            if (vVar3 != null) {
                int length = vVar3.f8390c.length;
                t0.s[] sVarArr = h4.f8390c;
                if (length == sVarArr.length) {
                    for (int i4 = 0; i4 < sVarArr.length; i4++) {
                        if (h4.a(vVar3, i4)) {
                        }
                    }
                    if (t6 == t5) {
                        z4 = false;
                    }
                    t6 = t6.f3346l;
                    vVar = vVar2;
                }
            }
            if (z4) {
                W w4 = this.f3286C;
                T t7 = w4.f3371i;
                boolean k4 = w4.k(t7);
                boolean[] zArr = new boolean[this.f3313l.length];
                vVar2.getClass();
                long a4 = t7.a(vVar2, this.f3292I.s, k4, zArr);
                f0 f0Var = this.f3292I;
                boolean z5 = (f0Var.f3463e == 4 || a4 == f0Var.s) ? false : true;
                f0 f0Var2 = this.f3292I;
                this.f3292I = n(f0Var2.f3460b, a4, f0Var2.f3461c, f0Var2.f3462d, z5, 5);
                if (z5) {
                    D(a4);
                }
                boolean[] zArr2 = new boolean[this.f3313l.length];
                int i5 = 0;
                while (true) {
                    AbstractC0125e[] abstractC0125eArr = this.f3313l;
                    if (i5 >= abstractC0125eArr.length) {
                        break;
                    }
                    AbstractC0125e abstractC0125e = abstractC0125eArr[i5];
                    boolean q4 = q(abstractC0125e);
                    zArr2[i5] = q4;
                    q0.a0 a0Var = t7.f3337c[i5];
                    if (q4) {
                        if (a0Var != abstractC0125e.f3428t) {
                            b(abstractC0125e);
                        } else if (zArr[i5]) {
                            long j4 = this.f3306X;
                            abstractC0125e.f3432y = false;
                            abstractC0125e.w = j4;
                            abstractC0125e.f3431x = j4;
                            abstractC0125e.s(j4, false);
                            i5++;
                        }
                    }
                    i5++;
                }
                d(zArr2, this.f3306X);
            } else {
                this.f3286C.k(t6);
                if (t6.f3338d) {
                    t6.a(h4, Math.max(t6.f3340f.f3351b, this.f3306X - t6.f3349o), false, new boolean[t6.f3343i.length]);
                }
            }
            j(true);
            if (this.f3292I.f3463e != 4) {
                s();
                g0();
                this.s.e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.N.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        T t4 = this.f3286C.f3371i;
        this.f3295M = t4 != null && t4.f3340f.f3357h && this.f3294L;
    }

    public final void D(long j4) {
        T t4 = this.f3286C.f3371i;
        long j5 = j4 + (t4 == null ? 1000000000000L : t4.f3349o);
        this.f3306X = j5;
        this.f3324y.f3524l.d(j5);
        for (AbstractC0125e abstractC0125e : this.f3313l) {
            if (q(abstractC0125e)) {
                long j6 = this.f3306X;
                abstractC0125e.f3432y = false;
                abstractC0125e.w = j6;
                abstractC0125e.f3431x = j6;
                abstractC0125e.s(j6, false);
            }
        }
        for (T t5 = r0.f3371i; t5 != null; t5 = t5.f3346l) {
            for (t0.s sVar : t5.f3348n.f8390c) {
                if (sVar != null) {
                    sVar.m();
                }
            }
        }
    }

    public final void E(T.U u4, T.U u5) {
        if (u4.p() && u5.p()) {
            return;
        }
        ArrayList arrayList = this.f3325z;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC0007h.r(arrayList.get(size));
            throw null;
        }
    }

    public final void H(long j4) {
        this.s.f2703a.sendEmptyMessageAtTime(2, j4 + ((this.f3292I.f3463e != 3 || Y()) ? f3283e0 : 1000L));
    }

    public final void I(boolean z4) {
        q0.F f4 = this.f3286C.f3371i.f3340f.f3350a;
        long K3 = K(f4, this.f3292I.s, true, false);
        if (K3 != this.f3292I.s) {
            f0 f0Var = this.f3292I;
            this.f3292I = n(f4, K3, f0Var.f3461c, f0Var.f3462d, z4, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [q0.D, java.lang.Object] */
    public final void J(M m4) {
        long j4;
        long j5;
        boolean z4;
        q0.F f4;
        long j6;
        long j7;
        long j8;
        f0 f0Var;
        int i4;
        this.J.c(1);
        Pair F3 = F(this.f3292I.f3459a, m4, true, this.f3299Q, this.f3300R, this.f3322v, this.w);
        if (F3 == null) {
            Pair g4 = g(this.f3292I.f3459a);
            f4 = (q0.F) g4.first;
            long longValue = ((Long) g4.second).longValue();
            z4 = !this.f3292I.f3459a.p();
            j4 = longValue;
            j5 = -9223372036854775807L;
        } else {
            Object obj = F3.first;
            long longValue2 = ((Long) F3.second).longValue();
            long j9 = m4.f3282c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            q0.F m5 = this.f3286C.m(this.f3292I.f3459a, obj, longValue2);
            if (m5.b()) {
                this.f3292I.f3459a.g(m5.f7668a, this.w);
                if (this.w.e(m5.f7669b) == m5.f7670c) {
                    this.w.f2149g.getClass();
                }
                j4 = 0;
                j5 = j9;
                f4 = m5;
                z4 = true;
            } else {
                j4 = longValue2;
                j5 = j9;
                z4 = m4.f3282c == -9223372036854775807L;
                f4 = m5;
            }
        }
        try {
            if (this.f3292I.f3459a.p()) {
                this.f3305W = m4;
            } else {
                if (F3 != null) {
                    if (f4.equals(this.f3292I.f3460b)) {
                        T t4 = this.f3286C.f3371i;
                        long b4 = (t4 == null || !t4.f3338d || j4 == 0) ? j4 : t4.f3335a.b(j4, this.f3291H);
                        if (W.y.Z(b4) == W.y.Z(this.f3292I.s) && ((i4 = (f0Var = this.f3292I).f3463e) == 2 || i4 == 3)) {
                            long j10 = f0Var.s;
                            this.f3292I = n(f4, j10, j5, j10, z4, 2);
                            return;
                        }
                        j7 = b4;
                    } else {
                        j7 = j4;
                    }
                    boolean z5 = this.f3292I.f3463e == 4;
                    W w = this.f3286C;
                    long K3 = K(f4, j7, w.f3371i != w.f3372j, z5);
                    z4 |= j4 != K3;
                    try {
                        f0 f0Var2 = this.f3292I;
                        T.U u4 = f0Var2.f3459a;
                        h0(u4, f4, u4, f0Var2.f3460b, j5, true);
                        j8 = K3;
                        this.f3292I = n(f4, j8, j5, j8, z4, 2);
                    } catch (Throwable th) {
                        th = th;
                        j6 = K3;
                        this.f3292I = n(f4, j6, j5, j6, z4, 2);
                        throw th;
                    }
                }
                if (this.f3292I.f3463e != 1) {
                    X(4);
                }
                B(false, true, false, true);
            }
            j8 = j4;
            this.f3292I = n(f4, j8, j5, j8, z4, 2);
        } catch (Throwable th2) {
            th = th2;
            j6 = j4;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [q0.D, java.lang.Object] */
    public final long K(q0.F f4, long j4, boolean z4, boolean z5) {
        c0();
        i0(false, true);
        if (z5 || this.f3292I.f3463e == 3) {
            X(2);
        }
        W w = this.f3286C;
        T t4 = w.f3371i;
        T t5 = t4;
        while (t5 != null && !f4.equals(t5.f3340f.f3350a)) {
            t5 = t5.f3346l;
        }
        if (z4 || t4 != t5 || (t5 != null && t5.f3349o + j4 < 0)) {
            AbstractC0125e[] abstractC0125eArr = this.f3313l;
            for (AbstractC0125e abstractC0125e : abstractC0125eArr) {
                b(abstractC0125e);
            }
            if (t5 != null) {
                while (w.f3371i != t5) {
                    w.a();
                }
                w.k(t5);
                t5.f3349o = 1000000000000L;
                d(new boolean[abstractC0125eArr.length], w.f3372j.e());
            }
        }
        if (t5 != null) {
            w.k(t5);
            if (!t5.f3338d) {
                t5.f3340f = t5.f3340f.b(j4);
            } else if (t5.f3339e) {
                ?? r9 = t5.f3335a;
                j4 = r9.l(j4);
                r9.m(j4 - this.f3323x);
            }
            D(j4);
            s();
        } else {
            w.b();
            D(j4);
        }
        j(false);
        this.s.e(2);
        return j4;
    }

    public final void L(i0 i0Var) {
        Looper looper = i0Var.f3508f;
        Looper looper2 = this.f3321u;
        W.v vVar = this.s;
        if (looper != looper2) {
            vVar.a(15, i0Var).b();
            return;
        }
        synchronized (i0Var) {
        }
        try {
            i0Var.f3503a.d(i0Var.f3506d, i0Var.f3507e);
            i0Var.b(true);
            int i4 = this.f3292I.f3463e;
            if (i4 == 3 || i4 == 2) {
                vVar.e(2);
            }
        } catch (Throwable th) {
            i0Var.b(true);
            throw th;
        }
    }

    public final void M(i0 i0Var) {
        Looper looper = i0Var.f3508f;
        if (looper.getThread().isAlive()) {
            this.f3284A.a(looper, null).c(new W.m(3, this, i0Var));
        } else {
            W.a.A("TAG", "Trying to send message on a dead thread.");
            i0Var.b(false);
        }
    }

    public final void O(boolean z4, AtomicBoolean atomicBoolean) {
        if (this.f3301S != z4) {
            this.f3301S = z4;
            if (!z4) {
                for (AbstractC0125e abstractC0125e : this.f3313l) {
                    if (!q(abstractC0125e) && this.f3314m.remove(abstractC0125e)) {
                        abstractC0125e.B();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void P(C0120J c0120j) {
        this.J.c(1);
        int i4 = c0120j.f3267c;
        ArrayList arrayList = c0120j.f3265a;
        q0.d0 d0Var = c0120j.f3266b;
        if (i4 != -1) {
            this.f3305W = new M(new k0(arrayList, d0Var), c0120j.f3267c, c0120j.f3268d);
        }
        e0 e0Var = this.f3287D;
        ArrayList arrayList2 = e0Var.f3435b;
        e0Var.g(0, arrayList2.size());
        k(e0Var.a(arrayList2.size(), arrayList, d0Var), false);
    }

    public final void Q(boolean z4) {
        this.f3294L = z4;
        C();
        if (this.f3295M) {
            W w = this.f3286C;
            if (w.f3372j != w.f3371i) {
                I(true);
                j(false);
            }
        }
    }

    public final void R(int i4, int i5, boolean z4, boolean z5) {
        this.J.c(z5 ? 1 : 0);
        this.f3292I = this.f3292I.d(i5, i4, z4);
        i0(false, false);
        for (T t4 = this.f3286C.f3371i; t4 != null; t4 = t4.f3346l) {
            for (t0.s sVar : t4.f3348n.f8390c) {
                if (sVar != null) {
                    sVar.c(z4);
                }
            }
        }
        if (!Y()) {
            c0();
            g0();
            return;
        }
        int i6 = this.f3292I.f3463e;
        W.v vVar = this.s;
        if (i6 != 3) {
            if (i6 == 2) {
                vVar.e(2);
            }
        } else {
            C0131k c0131k = this.f3324y;
            c0131k.f3529q = true;
            c0131k.f3524l.f();
            a0();
            vVar.e(2);
        }
    }

    public final void S(T.K k4) {
        this.s.d(16);
        C0131k c0131k = this.f3324y;
        c0131k.a(k4);
        T.K b4 = c0131k.b();
        m(b4, b4.f2127a, true, true);
    }

    public final void T(r rVar) {
        this.f3312d0 = rVar;
        T.U u4 = this.f3292I.f3459a;
        W w = this.f3286C;
        w.getClass();
        rVar.getClass();
        if (w.f3377o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < w.f3377o.size(); i4++) {
            ((T) w.f3377o.get(i4)).g();
        }
        w.f3377o = arrayList;
    }

    public final void U(int i4) {
        this.f3299Q = i4;
        T.U u4 = this.f3292I.f3459a;
        W w = this.f3286C;
        w.f3369g = i4;
        if (!w.o(u4)) {
            I(true);
        }
        j(false);
    }

    public final void V(boolean z4) {
        this.f3300R = z4;
        T.U u4 = this.f3292I.f3459a;
        W w = this.f3286C;
        w.f3370h = z4;
        if (!w.o(u4)) {
            I(true);
        }
        j(false);
    }

    public final void W(q0.d0 d0Var) {
        this.J.c(1);
        e0 e0Var = this.f3287D;
        int size = e0Var.f3435b.size();
        if (d0Var.f7826b.length != size) {
            d0Var = d0Var.a().b(0, size);
        }
        e0Var.f3443j = d0Var;
        k(e0Var.b(), false);
    }

    public final void X(int i4) {
        f0 f0Var = this.f3292I;
        if (f0Var.f3463e != i4) {
            if (i4 != 2) {
                this.f3311c0 = -9223372036854775807L;
            }
            this.f3292I = f0Var.g(i4);
        }
    }

    public final boolean Y() {
        f0 f0Var = this.f3292I;
        return f0Var.f3470l && f0Var.f3472n == 0;
    }

    public final boolean Z(T.U u4, q0.F f4) {
        if (f4.b() || u4.p()) {
            return false;
        }
        int i4 = u4.g(f4.f7668a, this.w).f2145c;
        T.T t4 = this.f3322v;
        u4.n(i4, t4);
        return t4.a() && t4.f2160i && t4.f2157f != -9223372036854775807L;
    }

    public final void a(C0120J c0120j, int i4) {
        this.J.c(1);
        e0 e0Var = this.f3287D;
        if (i4 == -1) {
            i4 = e0Var.f3435b.size();
        }
        k(e0Var.a(i4, c0120j.f3265a, c0120j.f3266b), false);
    }

    public final void a0() {
        T t4 = this.f3286C.f3371i;
        if (t4 == null) {
            return;
        }
        t0.v vVar = t4.f3348n;
        int i4 = 0;
        while (true) {
            AbstractC0125e[] abstractC0125eArr = this.f3313l;
            if (i4 >= abstractC0125eArr.length) {
                return;
            }
            if (vVar.b(i4)) {
                AbstractC0125e abstractC0125e = abstractC0125eArr[i4];
                int i5 = abstractC0125e.s;
                if (i5 == 1) {
                    W.a.j(i5 == 1);
                    abstractC0125e.s = 2;
                    abstractC0125e.v();
                }
            }
            i4++;
        }
    }

    public final void b(AbstractC0125e abstractC0125e) {
        if (q(abstractC0125e)) {
            C0131k c0131k = this.f3324y;
            if (abstractC0125e == c0131k.f3526n) {
                c0131k.f3527o = null;
                c0131k.f3526n = null;
                c0131k.f3528p = true;
            }
            int i4 = abstractC0125e.s;
            if (i4 == 2) {
                W.a.j(i4 == 2);
                abstractC0125e.s = 1;
                abstractC0125e.w();
            }
            W.a.j(abstractC0125e.s == 1);
            abstractC0125e.f3423n.N();
            abstractC0125e.s = 0;
            abstractC0125e.f3428t = null;
            abstractC0125e.f3429u = null;
            abstractC0125e.f3432y = false;
            abstractC0125e.q();
            this.f3304V--;
        }
    }

    public final void b0(boolean z4, boolean z5) {
        B(z4 || !this.f3301S, false, true, false);
        this.J.c(z5 ? 1 : 0);
        C0130j c0130j = this.f3318q;
        if (c0130j.f3520i.remove(this.f3290G) != null) {
            c0130j.d();
        }
        X(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:305:0x05c0, code lost:
    
        if (r2 >= r6.b()) goto L320;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x035d A[EDGE_INSN: B:79:0x035d->B:80:0x035d BREAK  A[LOOP:0: B:39:0x02e1->B:50:0x035a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b4  */
    /* JADX WARN: Type inference failed for: r0v65, types: [t0.v] */
    /* JADX WARN: Type inference failed for: r1v2, types: [q0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82, types: [q0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [q0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [int] */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r3v26, types: [q0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v75, types: [q0.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v82, types: [t0.s[]] */
    /* JADX WARN: Type inference failed for: r4v83, types: [t0.s] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [int] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [int] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.N.c():void");
    }

    public final void c0() {
        int i4;
        C0131k c0131k = this.f3324y;
        c0131k.f3529q = false;
        n0 n0Var = c0131k.f3524l;
        if (n0Var.f3554m) {
            n0Var.d(n0Var.e());
            n0Var.f3554m = false;
        }
        for (AbstractC0125e abstractC0125e : this.f3313l) {
            if (q(abstractC0125e) && (i4 = abstractC0125e.s) == 2) {
                W.a.j(i4 == 2);
                abstractC0125e.s = 1;
                abstractC0125e.w();
            }
        }
    }

    public final void d(boolean[] zArr, long j4) {
        AbstractC0125e[] abstractC0125eArr;
        Set set;
        int i4;
        W w;
        T t4;
        t0.v vVar;
        Set set2;
        int i5;
        S s;
        W w4 = this.f3286C;
        T t5 = w4.f3372j;
        t0.v vVar2 = t5.f3348n;
        int i6 = 0;
        while (true) {
            abstractC0125eArr = this.f3313l;
            int length = abstractC0125eArr.length;
            set = this.f3314m;
            if (i6 >= length) {
                break;
            }
            if (!vVar2.b(i6) && set.remove(abstractC0125eArr[i6])) {
                abstractC0125eArr[i6].B();
            }
            i6++;
        }
        int i7 = 0;
        while (i7 < abstractC0125eArr.length) {
            if (vVar2.b(i7)) {
                boolean z4 = zArr[i7];
                AbstractC0125e abstractC0125e = abstractC0125eArr[i7];
                if (!q(abstractC0125e)) {
                    T t6 = w4.f3372j;
                    boolean z5 = t6 == w4.f3371i;
                    t0.v vVar3 = t6.f3348n;
                    l0 l0Var = vVar3.f8389b[i7];
                    t0.s sVar = vVar3.f8390c[i7];
                    if (sVar != null) {
                        w = w4;
                        i5 = sVar.length();
                    } else {
                        w = w4;
                        i5 = 0;
                    }
                    C0095p[] c0095pArr = new C0095p[i5];
                    vVar = vVar2;
                    for (int i8 = 0; i8 < i5; i8++) {
                        c0095pArr[i8] = sVar.h(i8);
                    }
                    boolean z6 = Y() && this.f3292I.f3463e == 3;
                    boolean z7 = !z4 && z6;
                    this.f3304V++;
                    set.add(abstractC0125e);
                    q0.a0 a0Var = t6.f3337c[i7];
                    t4 = t5;
                    boolean z8 = z6;
                    long j5 = t6.f3349o;
                    U u4 = t6.f3340f;
                    W.a.j(abstractC0125e.s == 0);
                    abstractC0125e.f3424o = l0Var;
                    abstractC0125e.s = 1;
                    abstractC0125e.r(z7, z5);
                    boolean z9 = z5;
                    i4 = i7;
                    set2 = set;
                    abstractC0125e.A(c0095pArr, a0Var, j4, j5, u4.f3350a);
                    abstractC0125e.f3432y = false;
                    abstractC0125e.w = j4;
                    abstractC0125e.f3431x = j4;
                    abstractC0125e.s(j4, z7);
                    abstractC0125e.d(11, new C0119I(this));
                    C0131k c0131k = this.f3324y;
                    c0131k.getClass();
                    S k4 = abstractC0125e.k();
                    if (k4 != null && k4 != (s = c0131k.f3527o)) {
                        if (s != null) {
                            throw new C0133m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        c0131k.f3527o = k4;
                        c0131k.f3526n = abstractC0125e;
                        ((c0.M) k4).a(c0131k.f3524l.f3557p);
                    }
                    if (z8 && z9) {
                        W.a.j(abstractC0125e.s == 1);
                        abstractC0125e.s = 2;
                        abstractC0125e.v();
                    }
                    i7 = i4 + 1;
                    set = set2;
                    w4 = w;
                    vVar2 = vVar;
                    t5 = t4;
                }
            }
            i4 = i7;
            w = w4;
            t4 = t5;
            vVar = vVar2;
            set2 = set;
            i7 = i4 + 1;
            set = set2;
            w4 = w;
            vVar2 = vVar;
            t5 = t4;
        }
        t5.f3341g = true;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [q0.c0, java.lang.Object] */
    public final void d0() {
        T t4 = this.f3286C.f3373k;
        boolean z4 = this.f3298P || (t4 != null && t4.f3335a.c());
        f0 f0Var = this.f3292I;
        if (z4 != f0Var.f3465g) {
            this.f3292I = new f0(f0Var.f3459a, f0Var.f3460b, f0Var.f3461c, f0Var.f3462d, f0Var.f3463e, f0Var.f3464f, z4, f0Var.f3466h, f0Var.f3467i, f0Var.f3468j, f0Var.f3469k, f0Var.f3470l, f0Var.f3471m, f0Var.f3472n, f0Var.f3473o, f0Var.f3475q, f0Var.f3476r, f0Var.s, f0Var.f3477t, f0Var.f3474p);
        }
    }

    public final long e(T.U u4, Object obj, long j4) {
        T.S s = this.w;
        int i4 = u4.g(obj, s).f2145c;
        T.T t4 = this.f3322v;
        u4.n(i4, t4);
        if (t4.f2157f != -9223372036854775807L && t4.a() && t4.f2160i) {
            return W.y.M(W.y.z(t4.f2158g) - t4.f2157f) - (j4 + s.f2147e);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public final void e0(t0.v vVar) {
        T.U u4 = this.f3292I.f3459a;
        t0.s[] sVarArr = vVar.f8390c;
        C0130j c0130j = this.f3318q;
        C0129i c0129i = (C0129i) c0130j.f3520i.get(this.f3290G);
        c0129i.getClass();
        int i4 = c0130j.f3517f;
        if (i4 == -1) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                AbstractC0125e[] abstractC0125eArr = this.f3313l;
                int i7 = 13107200;
                if (i5 < abstractC0125eArr.length) {
                    if (sVarArr[i5] != null) {
                        switch (abstractC0125eArr[i5].f3422m) {
                            case 0:
                                i7 = 144310272;
                                i6 += i7;
                                break;
                            case 1:
                                i6 += i7;
                                break;
                            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                i7 = 131072000;
                                i6 += i7;
                                break;
                            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            case L.k.LONG_FIELD_NUMBER /* 4 */:
                            case L.k.STRING_FIELD_NUMBER /* 5 */:
                            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                i7 = 131072;
                                i6 += i7;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i5++;
                } else {
                    i4 = Math.max(13107200, i6);
                }
            }
        }
        c0129i.f3502b = i4;
        c0130j.d();
    }

    @Override // q0.b0
    public final void f(q0.c0 c0Var) {
        this.s.a(9, (InterfaceC0467D) c0Var).b();
    }

    public final void f0(int i4, int i5, List list) {
        this.J.c(1);
        e0 e0Var = this.f3287D;
        e0Var.getClass();
        ArrayList arrayList = e0Var.f3435b;
        W.a.e(i4 >= 0 && i4 <= i5 && i5 <= arrayList.size());
        W.a.e(list.size() == i5 - i4);
        for (int i6 = i4; i6 < i5; i6++) {
            ((d0) arrayList.get(i6)).f3414a.u((T.B) list.get(i6 - i4));
        }
        k(e0Var.b(), false);
    }

    public final Pair g(T.U u4) {
        long j4 = 0;
        if (u4.p()) {
            return Pair.create(f0.f3458u, 0L);
        }
        Pair i4 = u4.i(this.f3322v, this.w, u4.a(this.f3300R), -9223372036854775807L);
        q0.F m4 = this.f3286C.m(u4, i4.first, 0L);
        long longValue = ((Long) i4.second).longValue();
        if (m4.b()) {
            Object obj = m4.f7668a;
            T.S s = this.w;
            u4.g(obj, s);
            if (m4.f7670c == s.e(m4.f7669b)) {
                s.f2149g.getClass();
            }
        } else {
            j4 = longValue;
        }
        return Pair.create(m4, Long.valueOf(j4));
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [q0.D, java.lang.Object] */
    public final void g0() {
        T t4 = this.f3286C.f3371i;
        if (t4 == null) {
            return;
        }
        long u4 = t4.f3338d ? t4.f3335a.u() : -9223372036854775807L;
        if (u4 != -9223372036854775807L) {
            if (!t4.f()) {
                this.f3286C.k(t4);
                j(false);
                s();
            }
            D(u4);
            if (u4 != this.f3292I.s) {
                f0 f0Var = this.f3292I;
                this.f3292I = n(f0Var.f3460b, u4, f0Var.f3461c, u4, true, 5);
            }
        } else {
            C0131k c0131k = this.f3324y;
            boolean z4 = t4 != this.f3286C.f3372j;
            AbstractC0125e abstractC0125e = c0131k.f3526n;
            n0 n0Var = c0131k.f3524l;
            if (abstractC0125e == null || abstractC0125e.n() || ((z4 && c0131k.f3526n.s != 2) || (!c0131k.f3526n.p() && (z4 || c0131k.f3526n.m())))) {
                c0131k.f3528p = true;
                if (c0131k.f3529q) {
                    n0Var.f();
                }
            } else {
                S s = c0131k.f3527o;
                s.getClass();
                long e4 = s.e();
                if (c0131k.f3528p) {
                    if (e4 >= n0Var.e()) {
                        c0131k.f3528p = false;
                        if (c0131k.f3529q) {
                            n0Var.f();
                        }
                    } else if (n0Var.f3554m) {
                        n0Var.d(n0Var.e());
                        n0Var.f3554m = false;
                    }
                }
                n0Var.d(e4);
                T.K b4 = s.b();
                if (!b4.equals(n0Var.f3557p)) {
                    n0Var.a(b4);
                    c0131k.f3525m.s.a(16, b4).b();
                }
            }
            long e5 = c0131k.e();
            this.f3306X = e5;
            long j4 = e5 - t4.f3349o;
            long j5 = this.f3292I.s;
            if (!this.f3325z.isEmpty() && !this.f3292I.f3460b.b()) {
                if (this.f3309a0) {
                    this.f3309a0 = false;
                }
                f0 f0Var2 = this.f3292I;
                f0Var2.f3459a.b(f0Var2.f3460b.f7668a);
                int min = Math.min(this.f3308Z, this.f3325z.size());
                if (min > 0 && this.f3325z.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.f3325z.size() && this.f3325z.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f3308Z = min;
            }
            if (this.f3324y.c()) {
                boolean z5 = !this.J.f3271c;
                f0 f0Var3 = this.f3292I;
                this.f3292I = n(f0Var3.f3460b, j4, f0Var3.f3461c, j4, z5, 6);
            } else {
                f0 f0Var4 = this.f3292I;
                f0Var4.s = j4;
                f0Var4.f3477t = SystemClock.elapsedRealtime();
            }
        }
        this.f3292I.f3475q = this.f3286C.f3373k.d();
        f0 f0Var5 = this.f3292I;
        long j6 = f0Var5.f3475q;
        T t5 = this.f3286C.f3373k;
        f0Var5.f3476r = t5 == null ? 0L : Math.max(0L, j6 - (this.f3306X - t5.f3349o));
        f0 f0Var6 = this.f3292I;
        if (f0Var6.f3470l && f0Var6.f3463e == 3 && Z(f0Var6.f3459a, f0Var6.f3460b)) {
            f0 f0Var7 = this.f3292I;
            float f4 = 1.0f;
            if (f0Var7.f3473o.f2127a == 1.0f) {
                C0128h c0128h = this.f3288E;
                long e6 = e(f0Var7.f3459a, f0Var7.f3460b.f7668a, f0Var7.s);
                long j7 = this.f3292I.f3475q;
                T t6 = this.f3286C.f3373k;
                long max = t6 == null ? 0L : Math.max(0L, j7 - (this.f3306X - t6.f3349o));
                if (c0128h.f3490h != -9223372036854775807L) {
                    long j8 = e6 - max;
                    if (c0128h.f3500r == -9223372036854775807L) {
                        c0128h.f3500r = j8;
                        c0128h.s = 0L;
                    } else {
                        float f5 = 1.0f - c0128h.f3489g;
                        c0128h.f3500r = Math.max(j8, (((float) j8) * f5) + (((float) r12) * r0));
                        c0128h.s = (f5 * ((float) Math.abs(j8 - r12))) + (r0 * ((float) c0128h.s));
                    }
                    long j9 = c0128h.f3499q;
                    long j10 = c0128h.f3485c;
                    if (j9 == -9223372036854775807L || SystemClock.elapsedRealtime() - c0128h.f3499q >= j10) {
                        c0128h.f3499q = SystemClock.elapsedRealtime();
                        long j11 = (c0128h.s * 3) + c0128h.f3500r;
                        long j12 = c0128h.f3495m;
                        float f6 = c0128h.f3486d;
                        if (j12 > j11) {
                            float M3 = (float) W.y.M(j10);
                            long[] jArr = {j11, c0128h.f3492j, c0128h.f3495m - (((c0128h.f3498p - 1.0f) * M3) + ((c0128h.f3496n - 1.0f) * M3))};
                            long j13 = jArr[0];
                            for (int i4 = 1; i4 < 3; i4++) {
                                long j14 = jArr[i4];
                                if (j14 > j13) {
                                    j13 = j14;
                                }
                            }
                            c0128h.f3495m = j13;
                        } else {
                            long k4 = W.y.k(e6 - (Math.max(0.0f, c0128h.f3498p - 1.0f) / f6), c0128h.f3495m, j11);
                            c0128h.f3495m = k4;
                            long j15 = c0128h.f3494l;
                            if (j15 != -9223372036854775807L && k4 > j15) {
                                c0128h.f3495m = j15;
                            }
                        }
                        long j16 = e6 - c0128h.f3495m;
                        if (Math.abs(j16) < c0128h.f3487e) {
                            c0128h.f3498p = 1.0f;
                        } else {
                            c0128h.f3498p = W.y.i((f6 * ((float) j16)) + 1.0f, c0128h.f3497o, c0128h.f3496n);
                        }
                        f4 = c0128h.f3498p;
                    } else {
                        f4 = c0128h.f3498p;
                    }
                }
                if (this.f3324y.b().f2127a != f4) {
                    T.K k5 = new T.K(f4, this.f3292I.f3473o.f2128b);
                    this.s.d(16);
                    this.f3324y.a(k5);
                    m(this.f3292I.f3473o, this.f3324y.b().f2127a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [q0.c0, java.lang.Object] */
    public final void h(InterfaceC0467D interfaceC0467D) {
        T t4 = this.f3286C.f3373k;
        if (t4 == null || t4.f3335a != interfaceC0467D) {
            return;
        }
        long j4 = this.f3306X;
        if (t4 != null) {
            W.a.j(t4.f3346l == null);
            if (t4.f3338d) {
                t4.f3335a.w(j4 - t4.f3349o);
            }
        }
        s();
    }

    public final void h0(T.U u4, q0.F f4, T.U u5, q0.F f5, long j4, boolean z4) {
        if (!Z(u4, f4)) {
            T.K k4 = f4.b() ? T.K.f2126d : this.f3292I.f3473o;
            C0131k c0131k = this.f3324y;
            if (c0131k.b().equals(k4)) {
                return;
            }
            this.s.d(16);
            c0131k.a(k4);
            m(this.f3292I.f3473o, k4.f2127a, false, false);
            return;
        }
        Object obj = f4.f7668a;
        T.S s = this.w;
        int i4 = u4.g(obj, s).f2145c;
        T.T t4 = this.f3322v;
        u4.n(i4, t4);
        C0102x c0102x = t4.f2161j;
        C0128h c0128h = this.f3288E;
        c0128h.getClass();
        c0128h.f3490h = W.y.M(c0102x.f2359a);
        c0128h.f3493k = W.y.M(c0102x.f2360b);
        c0128h.f3494l = W.y.M(c0102x.f2361c);
        float f6 = c0102x.f2362d;
        if (f6 == -3.4028235E38f) {
            f6 = c0128h.f3483a;
        }
        c0128h.f3497o = f6;
        float f7 = c0102x.f2363e;
        if (f7 == -3.4028235E38f) {
            f7 = c0128h.f3484b;
        }
        c0128h.f3496n = f7;
        if (f6 == 1.0f && f7 == 1.0f) {
            c0128h.f3490h = -9223372036854775807L;
        }
        c0128h.a();
        if (j4 != -9223372036854775807L) {
            c0128h.f3491i = e(u4, obj, j4);
            c0128h.a();
            return;
        }
        if (!W.y.a(!u5.p() ? u5.m(u5.g(f5.f7668a, s).f2145c, t4, 0L).f2152a : null, t4.f2152a) || z4) {
            c0128h.f3491i = -9223372036854775807L;
            c0128h.a();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        W w;
        boolean z4;
        T t4;
        int i4;
        T t5;
        int i5;
        try {
            switch (message.what) {
                case 1:
                    boolean z5 = message.arg1 != 0;
                    int i6 = message.arg2;
                    R(i6 >> 4, i6 & 15, z5, true);
                    break;
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    c();
                    break;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    J((M) message.obj);
                    break;
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    S((T.K) message.obj);
                    break;
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    this.f3291H = (m0) message.obj;
                    break;
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    b0(false, true);
                    break;
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    x();
                    return true;
                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                    l((InterfaceC0467D) message.obj);
                    break;
                case 9:
                    h((InterfaceC0467D) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    U(message.arg1);
                    break;
                case 12:
                    V(message.arg1 != 0);
                    break;
                case 13:
                    O(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    i0 i0Var = (i0) message.obj;
                    i0Var.getClass();
                    L(i0Var);
                    break;
                case 15:
                    M((i0) message.obj);
                    break;
                case 16:
                    T.K k4 = (T.K) message.obj;
                    m(k4, k4.f2127a, true, false);
                    break;
                case 17:
                    P((C0120J) message.obj);
                    break;
                case 18:
                    a((C0120J) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC0007h.r(message.obj);
                    v();
                    throw null;
                case 20:
                    z(message.arg1, message.arg2, (q0.d0) message.obj);
                    break;
                case 21:
                    W((q0.d0) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    Q(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    A();
                    I(true);
                    break;
                case 26:
                    A();
                    I(true);
                    break;
                case 27:
                    f0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    T((r) message.obj);
                    break;
                case 29:
                    w();
                    break;
            }
        } catch (T.I e4) {
            boolean z6 = e4.f2122l;
            int i7 = e4.f2123m;
            if (i7 == 1) {
                i5 = z6 ? 3001 : 3003;
            } else {
                if (i7 == 4) {
                    i5 = z6 ? 3002 : 3004;
                }
                i(e4, r4);
            }
            r4 = i5;
            i(e4, r4);
        } catch (Y.i e5) {
            i(e5, e5.f3015l);
        } catch (C0133m e6) {
            C0133m c0133m = e6;
            int i8 = c0133m.f3542n;
            W w4 = this.f3286C;
            if (i8 != 1 || (t5 = w4.f3372j) == null) {
                w = w4;
            } else {
                w = w4;
                c0133m = new C0133m(c0133m.getMessage(), c0133m.getCause(), c0133m.f2124l, c0133m.f3542n, c0133m.f3543o, c0133m.f3544p, c0133m.f3545q, c0133m.f3546r, t5.f3340f.f3350a, c0133m.f2125m, c0133m.f3547t);
            }
            if (c0133m.f3547t && (this.f3310b0 == null || (i4 = c0133m.f2124l) == 5004 || i4 == 5003)) {
                W.a.B("ExoPlayerImplInternal", "Recoverable renderer error", c0133m);
                C0133m c0133m2 = this.f3310b0;
                if (c0133m2 != null) {
                    c0133m2.addSuppressed(c0133m);
                    c0133m = this.f3310b0;
                } else {
                    this.f3310b0 = c0133m;
                }
                W.v vVar = this.s;
                W.u a4 = vVar.a(25, c0133m);
                vVar.getClass();
                Message message2 = a4.f2701a;
                message2.getClass();
                vVar.f2703a.sendMessageAtFrontOfQueue(message2);
                a4.a();
                z4 = true;
            } else {
                C0133m c0133m3 = this.f3310b0;
                if (c0133m3 != null) {
                    c0133m3.addSuppressed(c0133m);
                    c0133m = this.f3310b0;
                }
                C0133m c0133m4 = c0133m;
                W.a.o("ExoPlayerImplInternal", "Playback error", c0133m4);
                if (c0133m4.f3542n == 1) {
                    W w5 = w;
                    if (w5.f3371i != w5.f3372j) {
                        while (true) {
                            t4 = w5.f3371i;
                            if (t4 == w5.f3372j) {
                                break;
                            }
                            w5.a();
                        }
                        t4.getClass();
                        t();
                        U u4 = t4.f3340f;
                        q0.F f4 = u4.f3350a;
                        long j4 = u4.f3351b;
                        this.f3292I = n(f4, j4, u4.f3352c, j4, true, 0);
                    }
                    z4 = true;
                } else {
                    z4 = true;
                }
                b0(z4, false);
                this.f3292I = this.f3292I.e(c0133m4);
            }
        } catch (f0.c e7) {
            i(e7, e7.f5452l);
        } catch (RuntimeException e8) {
            C0133m c0133m5 = new C0133m(2, e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            W.a.o("ExoPlayerImplInternal", "Playback error", c0133m5);
            b0(true, false);
            this.f3292I = this.f3292I.e(c0133m5);
        } catch (C0470b e9) {
            i(e9, 1002);
        } catch (IOException e10) {
            i(e10, 2000);
        }
        z4 = true;
        t();
        return z4;
    }

    public final void i(IOException iOException, int i4) {
        C0133m c0133m = new C0133m(0, iOException, i4);
        T t4 = this.f3286C.f3371i;
        if (t4 != null) {
            U u4 = t4.f3340f;
            c0133m = new C0133m(c0133m.getMessage(), c0133m.getCause(), c0133m.f2124l, c0133m.f3542n, c0133m.f3543o, c0133m.f3544p, c0133m.f3545q, c0133m.f3546r, u4.f3350a, c0133m.f2125m, c0133m.f3547t);
        }
        W.a.o("ExoPlayerImplInternal", "Playback error", c0133m);
        b0(false, false);
        this.f3292I = this.f3292I.e(c0133m);
    }

    public final void i0(boolean z4, boolean z5) {
        long j4;
        this.f3296N = z4;
        if (!z4 || z5) {
            j4 = -9223372036854775807L;
        } else {
            this.f3284A.getClass();
            j4 = SystemClock.elapsedRealtime();
        }
        this.f3297O = j4;
    }

    public final void j(boolean z4) {
        T t4 = this.f3286C.f3373k;
        q0.F f4 = t4 == null ? this.f3292I.f3460b : t4.f3340f.f3350a;
        boolean equals = this.f3292I.f3469k.equals(f4);
        if (!equals) {
            this.f3292I = this.f3292I.b(f4);
        }
        f0 f0Var = this.f3292I;
        f0Var.f3475q = t4 == null ? f0Var.s : t4.d();
        f0 f0Var2 = this.f3292I;
        long j4 = f0Var2.f3475q;
        T t5 = this.f3286C.f3373k;
        f0Var2.f3476r = t5 != null ? Math.max(0L, j4 - (this.f3306X - t5.f3349o)) : 0L;
        if ((!equals || z4) && t4 != null && t4.f3338d) {
            e0(t4.f3348n);
        }
    }

    public final synchronized void j0(C0134n c0134n, long j4) {
        this.f3284A.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j4;
        boolean z4 = false;
        while (!((Boolean) c0134n.get()).booleanValue() && j4 > 0) {
            try {
                this.f3284A.getClass();
                wait(j4);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            this.f3284A.getClass();
            j4 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e1 A[Catch: all -> 0x02e7, TryCatch #2 {all -> 0x02e7, blocks: (B:75:0x02db, B:77:0x02e1, B:20:0x0306, B:22:0x0313, B:24:0x0319, B:26:0x0323, B:28:0x0330, B:31:0x0333, B:34:0x033e), top: B:18:0x027f }] */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [a0.M] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [a0.N] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(T.U r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.N.k(T.U, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [q0.D, java.lang.Object] */
    public final void l(InterfaceC0467D interfaceC0467D) {
        W w = this.f3286C;
        T t4 = w.f3373k;
        if (t4 == null || t4.f3335a != interfaceC0467D) {
            return;
        }
        float f4 = this.f3324y.b().f2127a;
        T.U u4 = this.f3292I.f3459a;
        t4.f3338d = true;
        t4.f3347m = t4.f3335a.e();
        t0.v h4 = t4.h(f4, u4);
        U u5 = t4.f3340f;
        long j4 = u5.f3354e;
        long j5 = u5.f3351b;
        long a4 = t4.a(h4, (j4 == -9223372036854775807L || j5 < j4) ? j5 : Math.max(0L, j4 - 1), false, new boolean[t4.f3343i.length]);
        long j6 = t4.f3349o;
        U u6 = t4.f3340f;
        t4.f3349o = (u6.f3351b - a4) + j6;
        t4.f3340f = u6.b(a4);
        e0(t4.f3348n);
        if (t4 == w.f3371i) {
            D(t4.f3340f.f3351b);
            d(new boolean[this.f3313l.length], w.f3372j.e());
            f0 f0Var = this.f3292I;
            q0.F f5 = f0Var.f3460b;
            long j7 = t4.f3340f.f3351b;
            this.f3292I = n(f5, j7, f0Var.f3461c, j7, false, 5);
        }
        s();
    }

    public final void m(T.K k4, float f4, boolean z4, boolean z5) {
        int i4;
        if (z4) {
            if (z5) {
                this.J.c(1);
            }
            this.f3292I = this.f3292I.f(k4);
        }
        float f5 = k4.f2127a;
        T t4 = this.f3286C.f3371i;
        while (true) {
            i4 = 0;
            if (t4 == null) {
                break;
            }
            t0.s[] sVarArr = t4.f3348n.f8390c;
            int length = sVarArr.length;
            while (i4 < length) {
                t0.s sVar = sVarArr[i4];
                if (sVar != null) {
                    sVar.j(f5);
                }
                i4++;
            }
            t4 = t4.f3346l;
        }
        AbstractC0125e[] abstractC0125eArr = this.f3313l;
        int length2 = abstractC0125eArr.length;
        while (i4 < length2) {
            AbstractC0125e abstractC0125e = abstractC0125eArr[i4];
            if (abstractC0125e != null) {
                abstractC0125e.C(f4, k4.f2127a);
            }
            i4++;
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [f2.F, f2.C] */
    public final f0 n(q0.F f4, long j4, long j5, long j6, boolean z4, int i4) {
        q0.k0 k0Var;
        t0.v vVar;
        List list;
        f2.c0 c0Var;
        boolean z5;
        int i5;
        int i6;
        this.f3309a0 = (!this.f3309a0 && j4 == this.f3292I.s && f4.equals(this.f3292I.f3460b)) ? false : true;
        C();
        f0 f0Var = this.f3292I;
        q0.k0 k0Var2 = f0Var.f3466h;
        t0.v vVar2 = f0Var.f3467i;
        List list2 = f0Var.f3468j;
        if (this.f3287D.f3444k) {
            T t4 = this.f3286C.f3371i;
            q0.k0 k0Var3 = t4 == null ? q0.k0.f7876d : t4.f3347m;
            t0.v vVar3 = t4 == null ? this.f3317p : t4.f3348n;
            t0.s[] sVarArr = vVar3.f8390c;
            ?? abstractC0275C = new AbstractC0275C(4);
            int length = sVarArr.length;
            int i7 = 0;
            boolean z6 = false;
            while (i7 < length) {
                t0.s sVar = sVarArr[i7];
                if (sVar != null) {
                    T.G g4 = sVar.h(0).f2323k;
                    if (g4 == null) {
                        abstractC0275C.a(new T.G(new T.F[0]));
                    } else {
                        abstractC0275C.a(g4);
                        i6 = 1;
                        z6 = true;
                        i7 += i6;
                    }
                }
                i6 = 1;
                i7 += i6;
            }
            if (z6) {
                c0Var = abstractC0275C.g();
            } else {
                f2.G g5 = f2.I.f5510m;
                c0Var = f2.c0.f5550p;
            }
            if (t4 != null) {
                U u4 = t4.f3340f;
                if (u4.f3352c != j5) {
                    t4.f3340f = u4.a(j5);
                }
            }
            T t5 = this.f3286C.f3371i;
            if (t5 != null) {
                t0.v vVar4 = t5.f3348n;
                boolean z7 = false;
                int i8 = 0;
                while (true) {
                    AbstractC0125e[] abstractC0125eArr = this.f3313l;
                    if (i8 >= abstractC0125eArr.length) {
                        z5 = true;
                        break;
                    }
                    if (vVar4.b(i8)) {
                        i5 = 1;
                        if (abstractC0125eArr[i8].f3422m != 1) {
                            z5 = false;
                            break;
                        }
                        if (vVar4.f8389b[i8].f3540a != 0) {
                            z7 = true;
                        }
                    } else {
                        i5 = 1;
                    }
                    i8 += i5;
                }
                boolean z8 = z7 && z5;
                if (z8 != this.f3303U) {
                    this.f3303U = z8;
                    if (!z8 && this.f3292I.f3474p) {
                        this.s.e(2);
                    }
                }
            }
            list = c0Var;
            k0Var = k0Var3;
            vVar = vVar3;
        } else if (f4.equals(f0Var.f3460b)) {
            k0Var = k0Var2;
            vVar = vVar2;
            list = list2;
        } else {
            k0Var = q0.k0.f7876d;
            vVar = this.f3317p;
            list = f2.c0.f5550p;
        }
        if (z4) {
            K k4 = this.J;
            if (!k4.f3271c || k4.f3272d == 5) {
                k4.f3270b = true;
                k4.f3271c = true;
                k4.f3272d = i4;
            } else {
                W.a.e(i4 == 5);
            }
        }
        f0 f0Var2 = this.f3292I;
        long j7 = f0Var2.f3475q;
        T t6 = this.f3286C.f3373k;
        return f0Var2.c(f4, j4, j5, j6, t6 == null ? 0L : Math.max(0L, j7 - (this.f3306X - t6.f3349o)), k0Var, vVar, list);
    }

    @Override // q0.InterfaceC0466C
    public final void o(InterfaceC0467D interfaceC0467D) {
        this.s.a(8, interfaceC0467D).b();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [q0.D, q0.c0, java.lang.Object] */
    public final boolean p() {
        T t4 = this.f3286C.f3373k;
        if (t4 == null) {
            return false;
        }
        try {
            ?? r22 = t4.f3335a;
            if (t4.f3338d) {
                for (q0.a0 a0Var : t4.f3337c) {
                    if (a0Var != null) {
                        a0Var.a();
                    }
                }
            } else {
                r22.j();
            }
            return (!t4.f3338d ? 0L : r22.r()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean r() {
        T t4 = this.f3286C.f3371i;
        long j4 = t4.f3340f.f3354e;
        return t4.f3338d && (j4 == -9223372036854775807L || this.f3292I.s < j4 || !Y());
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [q0.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [q0.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [q0.D, java.lang.Object] */
    public final void s() {
        boolean c4;
        if (p()) {
            T t4 = this.f3286C.f3373k;
            long r4 = !t4.f3338d ? 0L : t4.f3335a.r();
            T t5 = this.f3286C.f3373k;
            long max = t5 == null ? 0L : Math.max(0L, r4 - (this.f3306X - t5.f3349o));
            T t6 = this.f3286C.f3371i;
            long j4 = Z(this.f3292I.f3459a, t4.f3340f.f3350a) ? this.f3288E.f3495m : -9223372036854775807L;
            b0.l lVar = this.f3290G;
            T.U u4 = this.f3292I.f3459a;
            float f4 = this.f3324y.b().f2127a;
            boolean z4 = this.f3292I.f3470l;
            O o2 = new O(lVar, max, f4, this.f3296N, j4);
            c4 = this.f3318q.c(o2);
            T t7 = this.f3286C.f3371i;
            if (!c4 && t7.f3338d && max < 500000 && this.f3323x > 0) {
                t7.f3335a.m(this.f3292I.s);
                c4 = this.f3318q.c(o2);
            }
        } else {
            c4 = false;
        }
        this.f3298P = c4;
        if (c4) {
            T t8 = this.f3286C.f3373k;
            long j5 = this.f3306X;
            float f5 = this.f3324y.b().f2127a;
            long j6 = this.f3297O;
            W.a.j(t8.f3346l == null);
            long j7 = j5 - t8.f3349o;
            ?? r12 = t8.f3335a;
            P p2 = new P();
            p2.f3329a = j7;
            W.a.e(f5 > 0.0f || f5 == -3.4028235E38f);
            p2.f3330b = f5;
            W.a.e(j6 >= 0 || j6 == -9223372036854775807L);
            p2.f3331c = j6;
            r12.i(new Q(p2));
        }
        d0();
    }

    public final void t() {
        K k4 = this.J;
        f0 f0Var = this.f3292I;
        boolean z4 = k4.f3270b | (((f0) k4.f3273e) != f0Var);
        k4.f3270b = z4;
        k4.f3273e = f0Var;
        if (z4) {
            C0118H c0118h = this.f3285B.f3592l;
            c0118h.f3248i.c(new W.m(2, c0118h, k4));
            this.J = new K(this.f3292I);
        }
    }

    public final void u() {
        k(this.f3287D.b(), true);
    }

    public final void v() {
        this.J.c(1);
        throw null;
    }

    public final void w() {
        this.J.c(1);
        int i4 = 0;
        B(false, false, false, true);
        C0130j c0130j = this.f3318q;
        c0130j.getClass();
        long id = Thread.currentThread().getId();
        long j4 = c0130j.f3521j;
        W.a.i("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j4 == -1 || j4 == id);
        c0130j.f3521j = id;
        HashMap hashMap = c0130j.f3520i;
        b0.l lVar = this.f3290G;
        if (!hashMap.containsKey(lVar)) {
            hashMap.put(lVar, new Object());
        }
        C0129i c0129i = (C0129i) hashMap.get(lVar);
        c0129i.getClass();
        int i5 = c0130j.f3517f;
        if (i5 == -1) {
            i5 = 13107200;
        }
        c0129i.f3502b = i5;
        c0129i.f3501a = false;
        X(this.f3292I.f3459a.p() ? 4 : 2);
        u0.g gVar = (u0.g) this.f3319r;
        gVar.getClass();
        e0 e0Var = this.f3287D;
        W.a.j(!e0Var.f3444k);
        e0Var.f3445l = gVar;
        while (true) {
            ArrayList arrayList = e0Var.f3435b;
            if (i4 >= arrayList.size()) {
                e0Var.f3444k = true;
                this.s.e(2);
                return;
            } else {
                d0 d0Var = (d0) arrayList.get(i4);
                e0Var.e(d0Var);
                e0Var.f3440g.add(d0Var);
                i4++;
            }
        }
    }

    public final void x() {
        try {
            B(true, false, true, false);
            y();
            C0130j c0130j = this.f3318q;
            if (c0130j.f3520i.remove(this.f3290G) != null) {
                c0130j.d();
            }
            if (c0130j.f3520i.isEmpty()) {
                c0130j.f3521j = -1L;
            }
            X(1);
            HandlerThread handlerThread = this.f3320t;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f3293K = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f3320t;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f3293K = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void y() {
        for (int i4 = 0; i4 < this.f3313l.length; i4++) {
            AbstractC0125e abstractC0125e = this.f3315n[i4];
            synchronized (abstractC0125e.f3421l) {
                abstractC0125e.f3420B = null;
            }
            AbstractC0125e abstractC0125e2 = this.f3313l[i4];
            W.a.j(abstractC0125e2.s == 0);
            abstractC0125e2.t();
        }
    }

    public final void z(int i4, int i5, q0.d0 d0Var) {
        this.J.c(1);
        e0 e0Var = this.f3287D;
        e0Var.getClass();
        W.a.e(i4 >= 0 && i4 <= i5 && i5 <= e0Var.f3435b.size());
        e0Var.f3443j = d0Var;
        e0Var.g(i4, i5);
        k(e0Var.b(), false);
    }
}
