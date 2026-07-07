package a0;

import C.C0016c;
import C.C0023j;
import T.C0084e;
import T.C0090k;
import T.C0093n;
import T.C0095p;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import b0.C0177a;
import j.C0359n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import q0.AbstractC0469a;
import q0.InterfaceC0468E;

/* renamed from: a0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118H extends E0.e implements InterfaceC0138s {

    /* renamed from: A, reason: collision with root package name */
    public final L1.g f3209A;

    /* renamed from: B, reason: collision with root package name */
    public final long f3210B;

    /* renamed from: C, reason: collision with root package name */
    public int f3211C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3212D;

    /* renamed from: E, reason: collision with root package name */
    public int f3213E;

    /* renamed from: F, reason: collision with root package name */
    public int f3214F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3215G;

    /* renamed from: H, reason: collision with root package name */
    public final m0 f3216H;

    /* renamed from: I, reason: collision with root package name */
    public q0.d0 f3217I;
    public final r J;

    /* renamed from: K, reason: collision with root package name */
    public T.L f3218K;

    /* renamed from: L, reason: collision with root package name */
    public T.E f3219L;

    /* renamed from: M, reason: collision with root package name */
    public C0095p f3220M;

    /* renamed from: N, reason: collision with root package name */
    public AudioTrack f3221N;

    /* renamed from: O, reason: collision with root package name */
    public Surface f3222O;

    /* renamed from: P, reason: collision with root package name */
    public Surface f3223P;

    /* renamed from: Q, reason: collision with root package name */
    public SurfaceHolder f3224Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3225R;

    /* renamed from: S, reason: collision with root package name */
    public final int f3226S;

    /* renamed from: T, reason: collision with root package name */
    public W.s f3227T;

    /* renamed from: U, reason: collision with root package name */
    public final int f3228U;

    /* renamed from: V, reason: collision with root package name */
    public C0084e f3229V;

    /* renamed from: W, reason: collision with root package name */
    public float f3230W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3231X;

    /* renamed from: Y, reason: collision with root package name */
    public final boolean f3232Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f3233Z;

    /* renamed from: a0, reason: collision with root package name */
    public final int f3234a0;

    /* renamed from: b, reason: collision with root package name */
    public final t0.v f3235b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3236b0;

    /* renamed from: c, reason: collision with root package name */
    public final T.L f3237c;

    /* renamed from: c0, reason: collision with root package name */
    public T.d0 f3238c0;

    /* renamed from: d, reason: collision with root package name */
    public final T2.n f3239d;

    /* renamed from: d0, reason: collision with root package name */
    public T.E f3240d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f3241e;

    /* renamed from: e0, reason: collision with root package name */
    public f0 f3242e0;

    /* renamed from: f, reason: collision with root package name */
    public final T.O f3243f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3244f0;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0125e[] f3245g;

    /* renamed from: g0, reason: collision with root package name */
    public long f3246g0;

    /* renamed from: h, reason: collision with root package name */
    public final t0.u f3247h;

    /* renamed from: i, reason: collision with root package name */
    public final W.v f3248i;

    /* renamed from: j, reason: collision with root package name */
    public final C0145z f3249j;

    /* renamed from: k, reason: collision with root package name */
    public final N f3250k;

    /* renamed from: l, reason: collision with root package name */
    public final W.k f3251l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f3252m;

    /* renamed from: n, reason: collision with root package name */
    public final T.S f3253n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f3254o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3255p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC0468E f3256q;

    /* renamed from: r, reason: collision with root package name */
    public final b0.e f3257r;
    public final Looper s;

    /* renamed from: t, reason: collision with root package name */
    public final u0.d f3258t;

    /* renamed from: u, reason: collision with root package name */
    public final W.t f3259u;

    /* renamed from: v, reason: collision with root package name */
    public final SurfaceHolderCallbackC0115E f3260v;
    public final C0116F w;

    /* renamed from: x, reason: collision with root package name */
    public final Y1.a f3261x;

    /* renamed from: y, reason: collision with root package name */
    public final C0124d f3262y;

    /* renamed from: z, reason: collision with root package name */
    public final F1.g f3263z;

    static {
        T.C.a("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [T2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, a0.F] */
    /* JADX WARN: Type inference failed for: r2v17, types: [Y1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [F1.g, java.lang.Object] */
    public C0118H(C0137q c0137q) {
        super(2);
        this.f3239d = new Object();
        try {
            W.a.r("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + W.y.f2713e + "]");
            Context context = c0137q.f3561a;
            Looper looper = c0137q.f3568h;
            this.f3241e = context.getApplicationContext();
            W.t tVar = c0137q.f3562b;
            this.f3257r = new b0.e(tVar);
            this.f3234a0 = c0137q.f3569i;
            this.f3229V = c0137q.f3570j;
            this.f3226S = c0137q.f3571k;
            this.f3231X = false;
            this.f3210B = c0137q.f3576p;
            SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E = new SurfaceHolderCallbackC0115E(this);
            this.f3260v = surfaceHolderCallbackC0115E;
            this.w = new Object();
            Handler handler = new Handler(looper);
            AbstractC0125e[] a4 = ((C0132l) c0137q.f3563c.get()).a(handler, surfaceHolderCallbackC0115E, surfaceHolderCallbackC0115E, surfaceHolderCallbackC0115E, surfaceHolderCallbackC0115E);
            this.f3245g = a4;
            W.a.j(a4.length > 0);
            this.f3247h = (t0.u) c0137q.f3565e.get();
            this.f3256q = (InterfaceC0468E) c0137q.f3564d.get();
            this.f3258t = (u0.d) c0137q.f3567g.get();
            this.f3255p = c0137q.f3572l;
            this.f3216H = c0137q.f3573m;
            this.s = looper;
            this.f3259u = tVar;
            this.f3243f = this;
            this.f3251l = new W.k(looper, tVar, new C0145z(this));
            this.f3252m = new CopyOnWriteArraySet();
            this.f3254o = new ArrayList();
            this.f3217I = new q0.d0();
            this.J = r.f3579a;
            this.f3235b = new t0.v(new l0[a4.length], new t0.s[a4.length], T.a0.f2223b, null);
            this.f3253n = new T.S();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i4 = 0; i4 < 20; i4++) {
                int i5 = iArr[i4];
                W.a.j(!false);
                sparseBooleanArray.append(i5, true);
            }
            this.f3247h.getClass();
            W.a.j(!false);
            sparseBooleanArray.append(29, true);
            W.a.j(!false);
            C0093n c0093n = new C0093n(sparseBooleanArray);
            this.f3237c = new T.L(c0093n);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i6 = 0; i6 < c0093n.f2269a.size(); i6++) {
                int a5 = c0093n.a(i6);
                W.a.j(!false);
                sparseBooleanArray2.append(a5, true);
            }
            W.a.j(!false);
            sparseBooleanArray2.append(4, true);
            W.a.j(!false);
            sparseBooleanArray2.append(10, true);
            W.a.j(!false);
            this.f3218K = new T.L(new C0093n(sparseBooleanArray2));
            this.f3248i = this.f3259u.a(this.s, null);
            C0145z c0145z = new C0145z(this);
            this.f3249j = c0145z;
            this.f3242e0 = f0.i(this.f3235b);
            this.f3257r.M(this.f3243f, this.s);
            int i7 = W.y.f2709a;
            String str = c0137q.s;
            this.f3250k = new N(this.f3245g, this.f3247h, this.f3235b, (C0130j) c0137q.f3566f.get(), this.f3258t, this.f3211C, this.f3212D, this.f3257r, this.f3216H, c0137q.f3574n, c0137q.f3575o, this.s, this.f3259u, c0145z, i7 < 31 ? new b0.l(str) : AbstractC0113C.a(this.f3241e, this, c0137q.f3577q, str), this.J);
            this.f3230W = 1.0f;
            this.f3211C = 0;
            T.E e4 = T.E.f2095y;
            this.f3219L = e4;
            this.f3240d0 = e4;
            this.f3244f0 = -1;
            if (i7 < 21) {
                AudioTrack audioTrack = this.f3221N;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f3221N.release();
                    this.f3221N = null;
                }
                if (this.f3221N == null) {
                    this.f3221N = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f3228U = this.f3221N.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f3241e.getSystemService("audio");
                this.f3228U = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            int i8 = V.c.f2579b;
            this.f3232Y = true;
            b0.e eVar = this.f3257r;
            eVar.getClass();
            this.f3251l.a(eVar);
            u0.d dVar = this.f3258t;
            Handler handler2 = new Handler(this.s);
            b0.e eVar2 = this.f3257r;
            u0.g gVar = (u0.g) dVar;
            gVar.getClass();
            eVar2.getClass();
            f2.Y y4 = gVar.f8514b;
            y4.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) y4.f5535m;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                u0.c cVar = (u0.c) it.next();
                if (cVar.f8498b == eVar2) {
                    cVar.f8499c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new u0.c(handler2, eVar2));
            this.f3252m.add(this.f3260v);
            SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E2 = this.f3260v;
            ?? obj = new Object();
            obj.f3079m = context.getApplicationContext();
            obj.f3080n = new RunnableC0122b(obj, handler, surfaceHolderCallbackC0115E2);
            this.f3261x = obj;
            obj.c();
            C0124d c0124d = new C0124d(context, handler, this.f3260v);
            this.f3262y = c0124d;
            c0124d.b(null);
            ?? obj2 = new Object();
            context.getApplicationContext();
            this.f3263z = obj2;
            this.f3209A = new L1.g(context);
            C0023j c0023j = new C0023j(1);
            c0023j.f320b = 0;
            c0023j.f321c = 0;
            new C0090k(c0023j);
            this.f3238c0 = T.d0.f2230e;
            this.f3227T = W.s.f2697c;
            this.f3247h.a(this.f3229V);
            G(1, 10, Integer.valueOf(this.f3228U));
            G(2, 10, Integer.valueOf(this.f3228U));
            G(1, 3, this.f3229V);
            G(2, 4, Integer.valueOf(this.f3226S));
            G(2, 5, 0);
            G(1, 9, Boolean.valueOf(this.f3231X));
            G(2, 7, this.w);
            G(6, 8, this.w);
            G(-1, 16, Integer.valueOf(this.f3234a0));
            this.f3239d.b();
        } catch (Throwable th) {
            this.f3239d.b();
            throw th;
        }
    }

    public static long y(f0 f0Var) {
        T.T t4 = new T.T();
        T.S s = new T.S();
        f0Var.f3459a.g(f0Var.f3460b.f7668a, s);
        long j4 = f0Var.f3461c;
        if (j4 != -9223372036854775807L) {
            return s.f2147e + j4;
        }
        return f0Var.f3459a.m(s.f2145c, t4, 0L).f2163l;
    }

    public final f0 A(f0 f0Var, T.U u4, Pair pair) {
        List list;
        W.a.e(u4.p() || pair != null);
        T.U u5 = f0Var.f3459a;
        long n4 = n(f0Var);
        f0 h4 = f0Var.h(u4);
        if (u4.p()) {
            q0.F f4 = f0.f3458u;
            long M3 = W.y.M(this.f3246g0);
            f0 b4 = h4.c(f4, M3, M3, M3, 0L, q0.k0.f7876d, this.f3235b, f2.c0.f5550p).b(f4);
            b4.f3475q = b4.s;
            return b4;
        }
        Object obj = h4.f3460b.f7668a;
        boolean equals = obj.equals(pair.first);
        q0.F f5 = !equals ? new q0.F(pair.first) : h4.f3460b;
        long longValue = ((Long) pair.second).longValue();
        long M4 = W.y.M(n4);
        if (!u5.p()) {
            M4 -= u5.g(obj, this.f3253n).f2147e;
        }
        if (!equals || longValue < M4) {
            W.a.j(!f5.b());
            q0.k0 k0Var = !equals ? q0.k0.f7876d : h4.f3466h;
            t0.v vVar = !equals ? this.f3235b : h4.f3467i;
            if (equals) {
                list = h4.f3468j;
            } else {
                f2.G g4 = f2.I.f5510m;
                list = f2.c0.f5550p;
            }
            f0 b5 = h4.c(f5, longValue, longValue, longValue, 0L, k0Var, vVar, list).b(f5);
            b5.f3475q = longValue;
            return b5;
        }
        if (longValue != M4) {
            W.a.j(!f5.b());
            long max = Math.max(0L, h4.f3476r - (longValue - M4));
            long j4 = h4.f3475q;
            if (h4.f3469k.equals(h4.f3460b)) {
                j4 = longValue + max;
            }
            f0 c4 = h4.c(f5, longValue, longValue, longValue, max, h4.f3466h, h4.f3467i, h4.f3468j);
            c4.f3475q = j4;
            return c4;
        }
        int b6 = u4.b(h4.f3469k.f7668a);
        if (b6 != -1 && u4.f(b6, this.f3253n, false).f2145c == u4.g(f5.f7668a, this.f3253n).f2145c) {
            return h4;
        }
        u4.g(f5.f7668a, this.f3253n);
        long a4 = f5.b() ? this.f3253n.a(f5.f7669b, f5.f7670c) : this.f3253n.f2146d;
        f0 b7 = h4.c(f5, h4.s, h4.s, h4.f3462d, a4 - h4.s, h4.f3466h, h4.f3467i, h4.f3468j).b(f5);
        b7.f3475q = a4;
        return b7;
    }

    public final Pair B(T.U u4, int i4, long j4) {
        if (u4.p()) {
            this.f3244f0 = i4;
            if (j4 == -9223372036854775807L) {
                j4 = 0;
            }
            this.f3246g0 = j4;
            return null;
        }
        if (i4 == -1 || i4 >= u4.o()) {
            i4 = u4.a(this.f3212D);
            j4 = W.y.Z(u4.m(i4, (T.T) this.f527a, 0L).f2163l);
        }
        return u4.i((T.T) this.f527a, this.f3253n, i4, W.y.M(j4));
    }

    public final void C(final int i4, final int i5) {
        W.s sVar = this.f3227T;
        if (i4 == sVar.f2698a && i5 == sVar.f2699b) {
            return;
        }
        this.f3227T = new W.s(i4, i5);
        this.f3251l.e(24, new W.h() { // from class: a0.x
            @Override // W.h
            public final void b(Object obj) {
                ((T.M) obj).r(i4, i5);
            }
        });
        G(2, 14, new W.s(i4, i5));
    }

    public final void D() {
        U();
        boolean w = w();
        int d4 = this.f3262y.d(2, w);
        R(d4, d4 == -1 ? 2 : 1, w);
        f0 f0Var = this.f3242e0;
        if (f0Var.f3463e != 1) {
            return;
        }
        f0 e4 = f0Var.e(null);
        f0 g4 = e4.g(e4.f3459a.p() ? 4 : 2);
        this.f3213E++;
        W.v vVar = this.f3250k.s;
        vVar.getClass();
        W.u b4 = W.v.b();
        b4.f2701a = vVar.f2703a.obtainMessage(29);
        b4.b();
        S(g4, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void E() {
        String str;
        boolean z4;
        t0.l lVar;
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.4.1] [");
        sb.append(W.y.f2713e);
        sb.append("] [");
        HashSet hashSet = T.C.f2072a;
        synchronized (T.C.class) {
            str = T.C.f2073b;
        }
        sb.append(str);
        sb.append("]");
        W.a.r("ExoPlayerImpl", sb.toString());
        U();
        int i4 = W.y.f2709a;
        if (i4 < 21 && (audioTrack = this.f3221N) != null) {
            audioTrack.release();
            this.f3221N = null;
        }
        this.f3261x.c();
        this.f3263z.getClass();
        this.f3209A.getClass();
        C0124d c0124d = this.f3262y;
        c0124d.f3408c = null;
        c0124d.a();
        c0124d.c(0);
        N n4 = this.f3250k;
        synchronized (n4) {
            if (!n4.f3293K && n4.f3321u.getThread().isAlive()) {
                n4.s.e(7);
                n4.j0(new C0134n(2, n4), n4.f3289F);
                z4 = n4.f3293K;
            }
            z4 = true;
        }
        if (!z4) {
            this.f3251l.e(10, new C0016c(15));
        }
        this.f3251l.d();
        this.f3248i.f2703a.removeCallbacksAndMessages(null);
        u0.d dVar = this.f3258t;
        b0.e eVar = this.f3257r;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((u0.g) dVar).f8514b.f5535m;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            u0.c cVar = (u0.c) it.next();
            if (cVar.f8498b == eVar) {
                cVar.f8499c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        f0 f0Var = this.f3242e0;
        if (f0Var.f3474p) {
            this.f3242e0 = f0Var.a();
        }
        f0 g4 = this.f3242e0.g(1);
        this.f3242e0 = g4;
        f0 b4 = g4.b(g4.f3460b);
        this.f3242e0 = b4;
        b4.f3475q = b4.s;
        this.f3242e0.f3476r = 0L;
        b0.e eVar2 = this.f3257r;
        W.v vVar = eVar2.s;
        W.a.k(vVar);
        vVar.c(new F2.c(3, eVar2));
        t0.q qVar = (t0.q) this.f3247h;
        synchronized (qVar.f8377c) {
            if (i4 >= 32) {
                try {
                    K2.l lVar2 = qVar.f8382h;
                    if (lVar2 != null && (lVar = (t0.l) lVar2.f1002d) != null && ((Handler) lVar2.f1001c) != null) {
                        ((Spatializer) lVar2.f1000b).removeOnSpatializerStateChangedListener(lVar);
                        ((Handler) lVar2.f1001c).removeCallbacksAndMessages(null);
                        lVar2.f1001c = null;
                        lVar2.f1002d = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        qVar.f8386a = null;
        qVar.f8387b = null;
        F();
        Surface surface = this.f3223P;
        if (surface != null) {
            surface.release();
            this.f3223P = null;
        }
        int i5 = V.c.f2579b;
        this.f3236b0 = true;
    }

    public final void F() {
        SurfaceHolder surfaceHolder = this.f3224Q;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f3260v);
            this.f3224Q = null;
        }
    }

    public final void G(int i4, int i5, Object obj) {
        for (AbstractC0125e abstractC0125e : this.f3245g) {
            if (i4 == -1 || abstractC0125e.f3422m == i4) {
                int u4 = u(this.f3242e0);
                T.U u5 = this.f3242e0.f3459a;
                int i6 = u4 == -1 ? 0 : u4;
                N n4 = this.f3250k;
                i0 i0Var = new i0(n4, abstractC0125e, u5, i6, this.f3259u, n4.f3321u);
                W.a.j(!i0Var.f3509g);
                i0Var.f3506d = i5;
                W.a.j(!i0Var.f3509g);
                i0Var.f3507e = obj;
                i0Var.c();
            }
        }
    }

    public final void H(C0084e c0084e, boolean z4) {
        U();
        if (this.f3236b0) {
            return;
        }
        boolean a4 = W.y.a(this.f3229V, c0084e);
        W.k kVar = this.f3251l;
        if (!a4) {
            this.f3229V = c0084e;
            G(1, 3, c0084e);
            kVar.c(20, new B2.x(15, c0084e));
        }
        C0084e c0084e2 = z4 ? c0084e : null;
        C0124d c0124d = this.f3262y;
        c0124d.b(c0084e2);
        this.f3247h.a(c0084e);
        boolean w = w();
        int d4 = c0124d.d(x(), w);
        R(d4, d4 == -1 ? 2 : 1, w);
        kVar.b();
    }

    public final void I(List list) {
        U();
        u(this.f3242e0);
        r();
        this.f3213E++;
        ArrayList arrayList = this.f3254o;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i4 = size - 1; i4 >= 0; i4--) {
                arrayList.remove(i4);
            }
            this.f3217I = this.f3217I.c(0, size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            d0 d0Var = new d0((AbstractC0469a) list.get(i5), this.f3255p);
            arrayList2.add(d0Var);
            arrayList.add(i5, new C0117G(d0Var.f3415b, d0Var.f3414a));
        }
        this.f3217I = this.f3217I.b(0, arrayList2.size());
        k0 k0Var = new k0(arrayList, this.f3217I);
        boolean p2 = k0Var.p();
        int i6 = k0Var.f3530e;
        if (!p2 && -1 >= i6) {
            throw new IllegalStateException();
        }
        int a4 = k0Var.a(this.f3212D);
        f0 A4 = A(this.f3242e0, k0Var, B(k0Var, a4, -9223372036854775807L));
        int i7 = A4.f3463e;
        if (a4 != -1 && i7 != 1) {
            i7 = (k0Var.p() || a4 >= i6) ? 4 : 2;
        }
        f0 g4 = A4.g(i7);
        this.f3250k.s.a(17, new C0120J(arrayList2, this.f3217I, a4, W.y.M(-9223372036854775807L))).b();
        if (!this.f3242e0.f3460b.f7668a.equals(g4.f3460b.f7668a) && !this.f3242e0.f3459a.p()) {
            z4 = true;
        }
        S(g4, 0, z4, 4, s(g4), -1, false);
    }

    public final void J(boolean z4) {
        U();
        int d4 = this.f3262y.d(x(), z4);
        R(d4, d4 == -1 ? 2 : 1, z4);
    }

    public final void K(T.K k4) {
        U();
        if (this.f3242e0.f3473o.equals(k4)) {
            return;
        }
        f0 f4 = this.f3242e0.f(k4);
        this.f3213E++;
        this.f3250k.s.a(4, k4).b();
        S(f4, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void L(int i4) {
        U();
        if (this.f3211C != i4) {
            this.f3211C = i4;
            W.v vVar = this.f3250k.s;
            vVar.getClass();
            W.u b4 = W.v.b();
            b4.f2701a = vVar.f2703a.obtainMessage(11, i4, 0);
            b4.b();
            C0144y c0144y = new C0144y(i4);
            W.k kVar = this.f3251l;
            kVar.c(8, c0144y);
            Q();
            kVar.b();
        }
    }

    public final void M(Surface surface) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0125e abstractC0125e : this.f3245g) {
            if (abstractC0125e.f3422m == 2) {
                int u4 = u(this.f3242e0);
                T.U u5 = this.f3242e0.f3459a;
                int i4 = u4 == -1 ? 0 : u4;
                N n4 = this.f3250k;
                i0 i0Var = new i0(n4, abstractC0125e, u5, i4, this.f3259u, n4.f3321u);
                W.a.j(!i0Var.f3509g);
                i0Var.f3506d = 1;
                W.a.j(!i0Var.f3509g);
                i0Var.f3507e = surface;
                i0Var.c();
                arrayList.add(i0Var);
            }
        }
        Surface surface2 = this.f3222O;
        if (surface2 == null || surface2 == surface) {
            z4 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((i0) it.next()).a(this.f3210B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z4 = true;
            }
            z4 = false;
            Surface surface3 = this.f3222O;
            Surface surface4 = this.f3223P;
            if (surface3 == surface4) {
                surface4.release();
                this.f3223P = null;
            }
        }
        this.f3222O = surface;
        if (z4) {
            P(new C0133m(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    public final void N(Surface surface) {
        U();
        F();
        M(surface);
        int i4 = surface == null ? 0 : -1;
        C(i4, i4);
    }

    public final void O(float f4) {
        U();
        final float i4 = W.y.i(f4, 0.0f, 1.0f);
        if (this.f3230W == i4) {
            return;
        }
        this.f3230W = i4;
        G(1, 2, Float.valueOf(this.f3262y.f3412g * i4));
        this.f3251l.e(22, new W.h() { // from class: a0.w
            @Override // W.h
            public final void b(Object obj) {
                ((T.M) obj).B(i4);
            }
        });
    }

    public final void P(C0133m c0133m) {
        f0 f0Var = this.f3242e0;
        f0 b4 = f0Var.b(f0Var.f3460b);
        b4.f3475q = b4.s;
        b4.f3476r = 0L;
        f0 g4 = b4.g(1);
        if (c0133m != null) {
            g4 = g4.e(c0133m);
        }
        f0 f0Var2 = g4;
        this.f3213E++;
        W.v vVar = this.f3250k.s;
        vVar.getClass();
        W.u b5 = W.v.b();
        b5.f2701a = vVar.f2703a.obtainMessage(6);
        b5.b();
        S(f0Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void Q() {
        int k4;
        int e4;
        T.L l4 = this.f3218K;
        int i4 = W.y.f2709a;
        C0118H c0118h = (C0118H) this.f3243f;
        boolean z4 = c0118h.z();
        T.U t4 = c0118h.t();
        boolean p2 = t4.p();
        T.T t5 = (T.T) c0118h.f527a;
        boolean z5 = !p2 && t4.m(c0118h.q(), t5, 0L).f2159h;
        T.U t6 = c0118h.t();
        if (t6.p()) {
            k4 = -1;
        } else {
            int q4 = c0118h.q();
            c0118h.U();
            int i5 = c0118h.f3211C;
            if (i5 == 1) {
                i5 = 0;
            }
            c0118h.U();
            k4 = t6.k(q4, i5, c0118h.f3212D);
        }
        boolean z6 = k4 != -1;
        T.U t7 = c0118h.t();
        if (t7.p()) {
            e4 = -1;
        } else {
            int q5 = c0118h.q();
            c0118h.U();
            int i6 = c0118h.f3211C;
            if (i6 == 1) {
                i6 = 0;
            }
            c0118h.U();
            e4 = t7.e(q5, i6, c0118h.f3212D);
        }
        boolean z7 = e4 != -1;
        T.U t8 = c0118h.t();
        boolean z8 = !t8.p() && t8.m(c0118h.q(), t5, 0L).a();
        T.U t9 = c0118h.t();
        boolean z9 = !t9.p() && t9.m(c0118h.q(), t5, 0L).f2160i;
        boolean p4 = c0118h.t().p();
        K2.o oVar = new K2.o(15);
        C0093n c0093n = this.f3237c.f2130a;
        B2.D d4 = (B2.D) oVar.f1009m;
        d4.getClass();
        for (int i7 = 0; i7 < c0093n.f2269a.size(); i7++) {
            d4.a(c0093n.a(i7));
        }
        boolean z10 = !z4;
        oVar.j(4, z10);
        oVar.j(5, z5 && !z4);
        oVar.j(6, z6 && !z4);
        oVar.j(7, !p4 && (z6 || !z8 || z5) && !z4);
        oVar.j(8, z7 && !z4);
        oVar.j(9, !p4 && (z7 || (z8 && z9)) && !z4);
        oVar.j(10, z10);
        oVar.j(11, z5 && !z4);
        oVar.j(12, z5 && !z4);
        T.L l5 = new T.L(d4.b());
        this.f3218K = l5;
        if (l5.equals(l4)) {
            return;
        }
        this.f3251l.c(13, new C0145z(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void R(int i4, int i5, boolean z4) {
        ?? r14 = (!z4 || i4 == -1) ? 0 : 1;
        int i6 = i4 == 0 ? 1 : 0;
        f0 f0Var = this.f3242e0;
        if (f0Var.f3470l == r14 && f0Var.f3472n == i6 && f0Var.f3471m == i5) {
            return;
        }
        this.f3213E++;
        f0 f0Var2 = this.f3242e0;
        boolean z5 = f0Var2.f3474p;
        f0 f0Var3 = f0Var2;
        if (z5) {
            f0Var3 = f0Var2.a();
        }
        f0 d4 = f0Var3.d(i5, i6, r14);
        int i7 = (i6 << 4) | i5;
        W.v vVar = this.f3250k.s;
        vVar.getClass();
        W.u b4 = W.v.b();
        b4.f2701a = vVar.f2703a.obtainMessage(1, r14, i7);
        b4.b();
        S(d4, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void S(final f0 f0Var, final int i4, boolean z4, final int i5, long j4, int i6, boolean z5) {
        Pair pair;
        int i7;
        final T.B b4;
        boolean z6;
        boolean z7;
        int i8;
        Object obj;
        T.B b5;
        Object obj2;
        int i9;
        long j5;
        long j6;
        long j7;
        long y4;
        Object obj3;
        T.B b6;
        Object obj4;
        int i10;
        f0 f0Var2 = this.f3242e0;
        this.f3242e0 = f0Var;
        boolean equals = f0Var2.f3459a.equals(f0Var.f3459a);
        T.U u4 = f0Var2.f3459a;
        T.U u5 = f0Var.f3459a;
        if (u5.p() && u4.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (u5.p() != u4.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            q0.F f4 = f0Var2.f3460b;
            Object obj5 = f4.f7668a;
            T.S s = this.f3253n;
            int i11 = u4.g(obj5, s).f2145c;
            T.T t4 = (T.T) this.f527a;
            Object obj6 = u4.m(i11, t4, 0L).f2152a;
            q0.F f5 = f0Var.f3460b;
            if (obj6.equals(u5.m(u5.g(f5.f7668a, s).f2145c, t4, 0L).f2152a)) {
                pair = (z4 && i5 == 0 && f4.f7671d < f5.f7671d) ? new Pair(Boolean.TRUE, 0) : (z4 && i5 == 1 && z5) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z4 && i5 == 0) {
                    i7 = 1;
                } else if (z4 && i5 == 1) {
                    i7 = 2;
                } else {
                    if (equals) {
                        throw new IllegalStateException();
                    }
                    i7 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i7));
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            b4 = !f0Var.f3459a.p() ? f0Var.f3459a.m(f0Var.f3459a.g(f0Var.f3460b.f7668a, this.f3253n).f2145c, (T.T) this.f527a, 0L).f2154c : null;
            this.f3240d0 = T.E.f2095y;
        } else {
            b4 = null;
        }
        if (booleanValue || !f0Var2.f3468j.equals(f0Var.f3468j)) {
            T.D a4 = this.f3240d0.a();
            List list = f0Var.f3468j;
            for (int i12 = 0; i12 < list.size(); i12++) {
                T.G g4 = (T.G) list.get(i12);
                int i13 = 0;
                while (true) {
                    T.F[] fArr = g4.f2118l;
                    if (i13 < fArr.length) {
                        fArr[i13].c(a4);
                        i13++;
                    }
                }
            }
            this.f3240d0 = new T.E(a4);
        }
        T.E l4 = l();
        boolean equals2 = l4.equals(this.f3219L);
        this.f3219L = l4;
        boolean z8 = f0Var2.f3470l != f0Var.f3470l;
        boolean z9 = f0Var2.f3463e != f0Var.f3463e;
        if (z9 || z8) {
            T();
        }
        boolean z10 = f0Var2.f3465g != f0Var.f3465g;
        if (!equals) {
            final int i14 = 0;
            this.f3251l.c(0, new W.h() { // from class: a0.t
                @Override // W.h
                public final void b(Object obj7) {
                    T.M m4 = (T.M) obj7;
                    switch (i14) {
                        case 0:
                            T.U u6 = ((f0) f0Var).f3459a;
                            m4.h(i4);
                            return;
                        default:
                            m4.q((T.B) f0Var, i4);
                            return;
                    }
                }
            });
        }
        if (z4) {
            T.S s4 = new T.S();
            if (f0Var2.f3459a.p()) {
                z6 = z9;
                z7 = z10;
                i8 = i6;
                obj = null;
                b5 = null;
                obj2 = null;
                i9 = -1;
            } else {
                Object obj7 = f0Var2.f3460b.f7668a;
                f0Var2.f3459a.g(obj7, s4);
                int i15 = s4.f2145c;
                int b7 = f0Var2.f3459a.b(obj7);
                z6 = z9;
                z7 = z10;
                obj = f0Var2.f3459a.m(i15, (T.T) this.f527a, 0L).f2152a;
                b5 = ((T.T) this.f527a).f2154c;
                i8 = i15;
                i9 = b7;
                obj2 = obj7;
            }
            if (i5 == 0) {
                if (f0Var2.f3460b.b()) {
                    q0.F f6 = f0Var2.f3460b;
                    j7 = s4.a(f6.f7669b, f6.f7670c);
                    y4 = y(f0Var2);
                } else if (f0Var2.f3460b.f7672e != -1) {
                    j7 = y(this.f3242e0);
                    y4 = j7;
                } else {
                    j5 = s4.f2147e;
                    j6 = s4.f2146d;
                    j7 = j5 + j6;
                    y4 = j7;
                }
            } else if (f0Var2.f3460b.b()) {
                j7 = f0Var2.s;
                y4 = y(f0Var2);
            } else {
                j5 = s4.f2147e;
                j6 = f0Var2.s;
                j7 = j5 + j6;
                y4 = j7;
            }
            long Z3 = W.y.Z(j7);
            long Z4 = W.y.Z(y4);
            q0.F f7 = f0Var2.f3460b;
            final T.N n4 = new T.N(obj, i8, b5, obj2, i9, Z3, Z4, f7.f7669b, f7.f7670c);
            int q4 = q();
            if (this.f3242e0.f3459a.p()) {
                obj3 = null;
                b6 = null;
                obj4 = null;
                i10 = -1;
            } else {
                f0 f0Var3 = this.f3242e0;
                Object obj8 = f0Var3.f3460b.f7668a;
                f0Var3.f3459a.g(obj8, this.f3253n);
                int b8 = this.f3242e0.f3459a.b(obj8);
                T.U u6 = this.f3242e0.f3459a;
                T.T t5 = (T.T) this.f527a;
                i10 = b8;
                obj3 = u6.m(q4, t5, 0L).f2152a;
                b6 = t5.f2154c;
                obj4 = obj8;
            }
            long Z5 = W.y.Z(j4);
            long Z6 = this.f3242e0.f3460b.b() ? W.y.Z(y(this.f3242e0)) : Z5;
            q0.F f8 = this.f3242e0.f3460b;
            final T.N n5 = new T.N(obj3, q4, b6, obj4, i10, Z5, Z6, f8.f7669b, f8.f7670c);
            this.f3251l.c(11, new W.h() { // from class: a0.B
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    m4.getClass();
                    m4.e(i5, n4, n5);
                }
            });
        } else {
            z6 = z9;
            z7 = z10;
        }
        if (booleanValue) {
            final int i16 = 1;
            this.f3251l.c(1, new W.h() { // from class: a0.t
                @Override // W.h
                public final void b(Object obj72) {
                    T.M m4 = (T.M) obj72;
                    switch (i16) {
                        case 0:
                            T.U u62 = ((f0) b4).f3459a;
                            m4.h(intValue);
                            return;
                        default:
                            m4.q((T.B) b4, intValue);
                            return;
                    }
                }
            });
        }
        if (f0Var2.f3464f != f0Var.f3464f) {
            final int i17 = 7;
            this.f3251l.c(10, new W.h() { // from class: a0.u
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    switch (i17) {
                        case 0:
                            f0 f0Var4 = f0Var;
                            boolean z11 = f0Var4.f3465g;
                            m4.getClass();
                            m4.s(f0Var4.f3465g);
                            return;
                        case 1:
                            f0 f0Var5 = f0Var;
                            m4.y(f0Var5.f3463e, f0Var5.f3470l);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4.f(f0Var.f3463e);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            f0 f0Var6 = f0Var;
                            m4.A(f0Var6.f3471m, f0Var6.f3470l);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            m4.c(f0Var.f3472n);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            m4.E(f0Var.k());
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4.p(f0Var.f3473o);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4.l(f0Var.f3464f);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            m4.t(f0Var.f3464f);
                            return;
                        default:
                            m4.n(f0Var.f3467i.f8391d);
                            return;
                    }
                }
            });
            if (f0Var.f3464f != null) {
                final int i18 = 8;
                this.f3251l.c(10, new W.h() { // from class: a0.u
                    @Override // W.h
                    public final void b(Object obj9) {
                        T.M m4 = (T.M) obj9;
                        switch (i18) {
                            case 0:
                                f0 f0Var4 = f0Var;
                                boolean z11 = f0Var4.f3465g;
                                m4.getClass();
                                m4.s(f0Var4.f3465g);
                                return;
                            case 1:
                                f0 f0Var5 = f0Var;
                                m4.y(f0Var5.f3463e, f0Var5.f3470l);
                                return;
                            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                m4.f(f0Var.f3463e);
                                return;
                            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                f0 f0Var6 = f0Var;
                                m4.A(f0Var6.f3471m, f0Var6.f3470l);
                                return;
                            case L.k.LONG_FIELD_NUMBER /* 4 */:
                                m4.c(f0Var.f3472n);
                                return;
                            case L.k.STRING_FIELD_NUMBER /* 5 */:
                                m4.E(f0Var.k());
                                return;
                            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                m4.p(f0Var.f3473o);
                                return;
                            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                m4.l(f0Var.f3464f);
                                return;
                            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                                m4.t(f0Var.f3464f);
                                return;
                            default:
                                m4.n(f0Var.f3467i.f8391d);
                                return;
                        }
                    }
                });
            }
        }
        t0.v vVar = f0Var2.f3467i;
        t0.v vVar2 = f0Var.f3467i;
        if (vVar != vVar2) {
            t0.u uVar = this.f3247h;
            C0359n c0359n = vVar2.f8392e;
            uVar.getClass();
            final int i19 = 9;
            this.f3251l.c(2, new W.h() { // from class: a0.u
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    switch (i19) {
                        case 0:
                            f0 f0Var4 = f0Var;
                            boolean z11 = f0Var4.f3465g;
                            m4.getClass();
                            m4.s(f0Var4.f3465g);
                            return;
                        case 1:
                            f0 f0Var5 = f0Var;
                            m4.y(f0Var5.f3463e, f0Var5.f3470l);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4.f(f0Var.f3463e);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            f0 f0Var6 = f0Var;
                            m4.A(f0Var6.f3471m, f0Var6.f3470l);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            m4.c(f0Var.f3472n);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            m4.E(f0Var.k());
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4.p(f0Var.f3473o);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4.l(f0Var.f3464f);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            m4.t(f0Var.f3464f);
                            return;
                        default:
                            m4.n(f0Var.f3467i.f8391d);
                            return;
                    }
                }
            });
        }
        if (!equals2) {
            this.f3251l.c(14, new B2.x(14, this.f3219L));
        }
        if (z7) {
            final int i20 = 0;
            this.f3251l.c(3, new W.h() { // from class: a0.u
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    switch (i20) {
                        case 0:
                            f0 f0Var4 = f0Var;
                            boolean z11 = f0Var4.f3465g;
                            m4.getClass();
                            m4.s(f0Var4.f3465g);
                            return;
                        case 1:
                            f0 f0Var5 = f0Var;
                            m4.y(f0Var5.f3463e, f0Var5.f3470l);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4.f(f0Var.f3463e);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            f0 f0Var6 = f0Var;
                            m4.A(f0Var6.f3471m, f0Var6.f3470l);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            m4.c(f0Var.f3472n);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            m4.E(f0Var.k());
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4.p(f0Var.f3473o);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4.l(f0Var.f3464f);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            m4.t(f0Var.f3464f);
                            return;
                        default:
                            m4.n(f0Var.f3467i.f8391d);
                            return;
                    }
                }
            });
        }
        if (z6 || z8) {
            final int i21 = 1;
            this.f3251l.c(-1, new W.h() { // from class: a0.u
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    switch (i21) {
                        case 0:
                            f0 f0Var4 = f0Var;
                            boolean z11 = f0Var4.f3465g;
                            m4.getClass();
                            m4.s(f0Var4.f3465g);
                            return;
                        case 1:
                            f0 f0Var5 = f0Var;
                            m4.y(f0Var5.f3463e, f0Var5.f3470l);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4.f(f0Var.f3463e);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            f0 f0Var6 = f0Var;
                            m4.A(f0Var6.f3471m, f0Var6.f3470l);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            m4.c(f0Var.f3472n);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            m4.E(f0Var.k());
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4.p(f0Var.f3473o);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4.l(f0Var.f3464f);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            m4.t(f0Var.f3464f);
                            return;
                        default:
                            m4.n(f0Var.f3467i.f8391d);
                            return;
                    }
                }
            });
        }
        if (z6) {
            final int i22 = 2;
            this.f3251l.c(4, new W.h() { // from class: a0.u
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    switch (i22) {
                        case 0:
                            f0 f0Var4 = f0Var;
                            boolean z11 = f0Var4.f3465g;
                            m4.getClass();
                            m4.s(f0Var4.f3465g);
                            return;
                        case 1:
                            f0 f0Var5 = f0Var;
                            m4.y(f0Var5.f3463e, f0Var5.f3470l);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4.f(f0Var.f3463e);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            f0 f0Var6 = f0Var;
                            m4.A(f0Var6.f3471m, f0Var6.f3470l);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            m4.c(f0Var.f3472n);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            m4.E(f0Var.k());
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4.p(f0Var.f3473o);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4.l(f0Var.f3464f);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            m4.t(f0Var.f3464f);
                            return;
                        default:
                            m4.n(f0Var.f3467i.f8391d);
                            return;
                    }
                }
            });
        }
        if (z8 || f0Var2.f3471m != f0Var.f3471m) {
            final int i23 = 3;
            this.f3251l.c(5, new W.h() { // from class: a0.u
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    switch (i23) {
                        case 0:
                            f0 f0Var4 = f0Var;
                            boolean z11 = f0Var4.f3465g;
                            m4.getClass();
                            m4.s(f0Var4.f3465g);
                            return;
                        case 1:
                            f0 f0Var5 = f0Var;
                            m4.y(f0Var5.f3463e, f0Var5.f3470l);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4.f(f0Var.f3463e);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            f0 f0Var6 = f0Var;
                            m4.A(f0Var6.f3471m, f0Var6.f3470l);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            m4.c(f0Var.f3472n);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            m4.E(f0Var.k());
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4.p(f0Var.f3473o);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4.l(f0Var.f3464f);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            m4.t(f0Var.f3464f);
                            return;
                        default:
                            m4.n(f0Var.f3467i.f8391d);
                            return;
                    }
                }
            });
        }
        if (f0Var2.f3472n != f0Var.f3472n) {
            final int i24 = 4;
            this.f3251l.c(6, new W.h() { // from class: a0.u
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    switch (i24) {
                        case 0:
                            f0 f0Var4 = f0Var;
                            boolean z11 = f0Var4.f3465g;
                            m4.getClass();
                            m4.s(f0Var4.f3465g);
                            return;
                        case 1:
                            f0 f0Var5 = f0Var;
                            m4.y(f0Var5.f3463e, f0Var5.f3470l);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4.f(f0Var.f3463e);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            f0 f0Var6 = f0Var;
                            m4.A(f0Var6.f3471m, f0Var6.f3470l);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            m4.c(f0Var.f3472n);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            m4.E(f0Var.k());
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4.p(f0Var.f3473o);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4.l(f0Var.f3464f);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            m4.t(f0Var.f3464f);
                            return;
                        default:
                            m4.n(f0Var.f3467i.f8391d);
                            return;
                    }
                }
            });
        }
        if (f0Var2.k() != f0Var.k()) {
            final int i25 = 5;
            this.f3251l.c(7, new W.h() { // from class: a0.u
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    switch (i25) {
                        case 0:
                            f0 f0Var4 = f0Var;
                            boolean z11 = f0Var4.f3465g;
                            m4.getClass();
                            m4.s(f0Var4.f3465g);
                            return;
                        case 1:
                            f0 f0Var5 = f0Var;
                            m4.y(f0Var5.f3463e, f0Var5.f3470l);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4.f(f0Var.f3463e);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            f0 f0Var6 = f0Var;
                            m4.A(f0Var6.f3471m, f0Var6.f3470l);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            m4.c(f0Var.f3472n);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            m4.E(f0Var.k());
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4.p(f0Var.f3473o);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4.l(f0Var.f3464f);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            m4.t(f0Var.f3464f);
                            return;
                        default:
                            m4.n(f0Var.f3467i.f8391d);
                            return;
                    }
                }
            });
        }
        if (!f0Var2.f3473o.equals(f0Var.f3473o)) {
            final int i26 = 6;
            this.f3251l.c(12, new W.h() { // from class: a0.u
                @Override // W.h
                public final void b(Object obj9) {
                    T.M m4 = (T.M) obj9;
                    switch (i26) {
                        case 0:
                            f0 f0Var4 = f0Var;
                            boolean z11 = f0Var4.f3465g;
                            m4.getClass();
                            m4.s(f0Var4.f3465g);
                            return;
                        case 1:
                            f0 f0Var5 = f0Var;
                            m4.y(f0Var5.f3463e, f0Var5.f3470l);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4.f(f0Var.f3463e);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            f0 f0Var6 = f0Var;
                            m4.A(f0Var6.f3471m, f0Var6.f3470l);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            m4.c(f0Var.f3472n);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            m4.E(f0Var.k());
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4.p(f0Var.f3473o);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4.l(f0Var.f3464f);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            m4.t(f0Var.f3464f);
                            return;
                        default:
                            m4.n(f0Var.f3467i.f8391d);
                            return;
                    }
                }
            });
        }
        Q();
        this.f3251l.b();
        if (f0Var2.f3474p != f0Var.f3474p) {
            Iterator it = this.f3252m.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC0115E) it.next()).f3204a.T();
            }
        }
    }

    public final void T() {
        int x3 = x();
        L1.g gVar = this.f3209A;
        F1.g gVar2 = this.f3263z;
        if (x3 != 1) {
            if (x3 == 2 || x3 == 3) {
                U();
                boolean z4 = this.f3242e0.f3474p;
                w();
                gVar2.getClass();
                w();
                gVar.getClass();
                return;
            }
            if (x3 != 4) {
                throw new IllegalStateException();
            }
        }
        gVar2.getClass();
        gVar.getClass();
    }

    public final void U() {
        T2.n nVar = this.f3239d;
        synchronized (nVar) {
            boolean z4 = false;
            while (!nVar.f2455a) {
                try {
                    nVar.wait();
                } catch (InterruptedException unused) {
                    z4 = true;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.s.getThread().getName();
            int i4 = W.y.f2709a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f3232Y) {
                throw new IllegalStateException(str);
            }
            W.a.B("ExoPlayerImpl", str, this.f3233Z ? null : new IllegalStateException());
            this.f3233Z = true;
        }
    }

    @Override // E0.e
    public final void k(int i4, long j4, boolean z4) {
        U();
        if (i4 == -1) {
            return;
        }
        W.a.e(i4 >= 0);
        T.U u4 = this.f3242e0.f3459a;
        if (u4.p() || i4 < u4.o()) {
            b0.e eVar = this.f3257r;
            if (!eVar.f4348t) {
                C0177a a4 = eVar.a();
                eVar.f4348t = true;
                eVar.K(a4, -1, new b0.c(12));
            }
            this.f3213E++;
            if (z()) {
                W.a.A("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                K k4 = new K(this.f3242e0);
                k4.c(1);
                C0118H c0118h = this.f3249j.f3592l;
                c0118h.f3248i.c(new W.m(2, c0118h, k4));
                return;
            }
            f0 f0Var = this.f3242e0;
            int i5 = f0Var.f3463e;
            if (i5 == 3 || (i5 == 4 && !u4.p())) {
                f0Var = this.f3242e0.g(2);
            }
            int q4 = q();
            f0 A4 = A(f0Var, u4, B(u4, i4, j4));
            this.f3250k.s.a(3, new M(u4, i4, W.y.M(j4))).b();
            S(A4, 0, true, 1, s(A4), q4, z4);
        }
    }

    public final T.E l() {
        T.U t4 = t();
        if (t4.p()) {
            return this.f3240d0;
        }
        T.B b4 = t4.m(q(), (T.T) this.f527a, 0L).f2154c;
        T.D a4 = this.f3240d0.a();
        T.E e4 = b4.f2069d;
        if (e4 != null) {
            CharSequence charSequence = e4.f2096a;
            if (charSequence != null) {
                a4.f2074a = charSequence;
            }
            CharSequence charSequence2 = e4.f2097b;
            if (charSequence2 != null) {
                a4.f2075b = charSequence2;
            }
            CharSequence charSequence3 = e4.f2098c;
            if (charSequence3 != null) {
                a4.f2076c = charSequence3;
            }
            CharSequence charSequence4 = e4.f2099d;
            if (charSequence4 != null) {
                a4.f2077d = charSequence4;
            }
            CharSequence charSequence5 = e4.f2100e;
            if (charSequence5 != null) {
                a4.f2078e = charSequence5;
            }
            byte[] bArr = e4.f2101f;
            if (bArr != null) {
                a4.f2079f = bArr == null ? null : (byte[]) bArr.clone();
                a4.f2080g = e4.f2102g;
            }
            Integer num = e4.f2103h;
            if (num != null) {
                a4.f2081h = num;
            }
            Integer num2 = e4.f2104i;
            if (num2 != null) {
                a4.f2082i = num2;
            }
            Integer num3 = e4.f2105j;
            if (num3 != null) {
                a4.f2083j = num3;
            }
            Boolean bool = e4.f2106k;
            if (bool != null) {
                a4.f2084k = bool;
            }
            Integer num4 = e4.f2107l;
            if (num4 != null) {
                a4.f2085l = num4;
            }
            Integer num5 = e4.f2108m;
            if (num5 != null) {
                a4.f2085l = num5;
            }
            Integer num6 = e4.f2109n;
            if (num6 != null) {
                a4.f2086m = num6;
            }
            Integer num7 = e4.f2110o;
            if (num7 != null) {
                a4.f2087n = num7;
            }
            Integer num8 = e4.f2111p;
            if (num8 != null) {
                a4.f2088o = num8;
            }
            Integer num9 = e4.f2112q;
            if (num9 != null) {
                a4.f2089p = num9;
            }
            Integer num10 = e4.f2113r;
            if (num10 != null) {
                a4.f2090q = num10;
            }
            CharSequence charSequence6 = e4.s;
            if (charSequence6 != null) {
                a4.f2091r = charSequence6;
            }
            CharSequence charSequence7 = e4.f2114t;
            if (charSequence7 != null) {
                a4.s = charSequence7;
            }
            CharSequence charSequence8 = e4.f2115u;
            if (charSequence8 != null) {
                a4.f2092t = charSequence8;
            }
            CharSequence charSequence9 = e4.f2116v;
            if (charSequence9 != null) {
                a4.f2093u = charSequence9;
            }
            CharSequence charSequence10 = e4.w;
            if (charSequence10 != null) {
                a4.f2094v = charSequence10;
            }
            Integer num11 = e4.f2117x;
            if (num11 != null) {
                a4.w = num11;
            }
        }
        return new T.E(a4);
    }

    public final long m() {
        U();
        if (z()) {
            f0 f0Var = this.f3242e0;
            return f0Var.f3469k.equals(f0Var.f3460b) ? W.y.Z(this.f3242e0.f3475q) : v();
        }
        U();
        if (this.f3242e0.f3459a.p()) {
            return this.f3246g0;
        }
        f0 f0Var2 = this.f3242e0;
        long j4 = 0;
        if (f0Var2.f3469k.f7671d != f0Var2.f3460b.f7671d) {
            return W.y.Z(f0Var2.f3459a.m(q(), (T.T) this.f527a, 0L).f2164m);
        }
        long j5 = f0Var2.f3475q;
        if (this.f3242e0.f3469k.b()) {
            f0 f0Var3 = this.f3242e0;
            f0Var3.f3459a.g(f0Var3.f3469k.f7668a, this.f3253n).d(this.f3242e0.f3469k.f7669b);
        } else {
            j4 = j5;
        }
        f0 f0Var4 = this.f3242e0;
        T.U u4 = f0Var4.f3459a;
        Object obj = f0Var4.f3469k.f7668a;
        T.S s = this.f3253n;
        u4.g(obj, s);
        return W.y.Z(j4 + s.f2147e);
    }

    public final long n(f0 f0Var) {
        if (!f0Var.f3460b.b()) {
            return W.y.Z(s(f0Var));
        }
        Object obj = f0Var.f3460b.f7668a;
        T.U u4 = f0Var.f3459a;
        T.S s = this.f3253n;
        u4.g(obj, s);
        long j4 = f0Var.f3461c;
        return j4 == -9223372036854775807L ? W.y.Z(u4.m(u(f0Var), (T.T) this.f527a, 0L).f2163l) : W.y.Z(s.f2147e) + W.y.Z(j4);
    }

    public final int o() {
        U();
        if (z()) {
            return this.f3242e0.f3460b.f7669b;
        }
        return -1;
    }

    public final int p() {
        U();
        if (z()) {
            return this.f3242e0.f3460b.f7670c;
        }
        return -1;
    }

    public final int q() {
        U();
        int u4 = u(this.f3242e0);
        if (u4 == -1) {
            return 0;
        }
        return u4;
    }

    public final long r() {
        U();
        return W.y.Z(s(this.f3242e0));
    }

    public final long s(f0 f0Var) {
        if (f0Var.f3459a.p()) {
            return W.y.M(this.f3246g0);
        }
        long j4 = f0Var.f3474p ? f0Var.j() : f0Var.s;
        if (f0Var.f3460b.b()) {
            return j4;
        }
        T.U u4 = f0Var.f3459a;
        Object obj = f0Var.f3460b.f7668a;
        T.S s = this.f3253n;
        u4.g(obj, s);
        return j4 + s.f2147e;
    }

    public final T.U t() {
        U();
        return this.f3242e0.f3459a;
    }

    public final int u(f0 f0Var) {
        if (f0Var.f3459a.p()) {
            return this.f3244f0;
        }
        return f0Var.f3459a.g(f0Var.f3460b.f7668a, this.f3253n).f2145c;
    }

    public final long v() {
        U();
        if (!z()) {
            T.U t4 = t();
            if (t4.p()) {
                return -9223372036854775807L;
            }
            return W.y.Z(t4.m(q(), (T.T) this.f527a, 0L).f2164m);
        }
        f0 f0Var = this.f3242e0;
        q0.F f4 = f0Var.f3460b;
        T.U u4 = f0Var.f3459a;
        Object obj = f4.f7668a;
        T.S s = this.f3253n;
        u4.g(obj, s);
        return W.y.Z(s.a(f4.f7669b, f4.f7670c));
    }

    public final boolean w() {
        U();
        return this.f3242e0.f3470l;
    }

    public final int x() {
        U();
        return this.f3242e0.f3463e;
    }

    public final boolean z() {
        U();
        return this.f3242e0.f3460b.b();
    }
}
