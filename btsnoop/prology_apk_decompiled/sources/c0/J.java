package c0;

import T.C0084e;
import T.C0085f;
import T.C0095p;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import f2.c0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class J implements s {

    /* renamed from: m0, reason: collision with root package name */
    public static final Object f4494m0 = new Object();

    /* renamed from: n0, reason: collision with root package name */
    public static ExecutorService f4495n0;

    /* renamed from: o0, reason: collision with root package name */
    public static int f4496o0;

    /* renamed from: A, reason: collision with root package name */
    public C0084e f4497A;

    /* renamed from: B, reason: collision with root package name */
    public D f4498B;

    /* renamed from: C, reason: collision with root package name */
    public D f4499C;

    /* renamed from: D, reason: collision with root package name */
    public T.K f4500D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4501E;

    /* renamed from: F, reason: collision with root package name */
    public ByteBuffer f4502F;

    /* renamed from: G, reason: collision with root package name */
    public int f4503G;

    /* renamed from: H, reason: collision with root package name */
    public long f4504H;

    /* renamed from: I, reason: collision with root package name */
    public long f4505I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public long f4506K;

    /* renamed from: L, reason: collision with root package name */
    public int f4507L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f4508M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f4509N;

    /* renamed from: O, reason: collision with root package name */
    public long f4510O;

    /* renamed from: P, reason: collision with root package name */
    public float f4511P;

    /* renamed from: Q, reason: collision with root package name */
    public ByteBuffer f4512Q;

    /* renamed from: R, reason: collision with root package name */
    public int f4513R;

    /* renamed from: S, reason: collision with root package name */
    public ByteBuffer f4514S;

    /* renamed from: T, reason: collision with root package name */
    public byte[] f4515T;

    /* renamed from: U, reason: collision with root package name */
    public int f4516U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4517V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4518W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4519X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f4520Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f4521Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4522a;

    /* renamed from: a0, reason: collision with root package name */
    public int f4523a0;

    /* renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.t f4524b;

    /* renamed from: b0, reason: collision with root package name */
    public C0085f f4525b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4526c;

    /* renamed from: c0, reason: collision with root package name */
    public C0211j f4527c0;

    /* renamed from: d, reason: collision with root package name */
    public final w f4528d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4529d0;

    /* renamed from: e, reason: collision with root package name */
    public final Q f4530e;

    /* renamed from: e0, reason: collision with root package name */
    public long f4531e0;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f4532f;

    /* renamed from: f0, reason: collision with root package name */
    public long f4533f0;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f4534g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f4535g0;

    /* renamed from: h, reason: collision with root package name */
    public final T2.n f4536h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4537h0;

    /* renamed from: i, reason: collision with root package name */
    public final v f4538i;

    /* renamed from: i0, reason: collision with root package name */
    public Looper f4539i0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f4540j;

    /* renamed from: j0, reason: collision with root package name */
    public long f4541j0;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4542k;

    /* renamed from: k0, reason: collision with root package name */
    public long f4543k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4544l;

    /* renamed from: l0, reason: collision with root package name */
    public Handler f4545l0;

    /* renamed from: m, reason: collision with root package name */
    public I f4546m;

    /* renamed from: n, reason: collision with root package name */
    public final G0.c f4547n;

    /* renamed from: o, reason: collision with root package name */
    public final G0.c f4548o;

    /* renamed from: p, reason: collision with root package name */
    public final K f4549p;

    /* renamed from: q, reason: collision with root package name */
    public final Y.x f4550q;

    /* renamed from: r, reason: collision with root package name */
    public b0.l f4551r;
    public K2.o s;

    /* renamed from: t, reason: collision with root package name */
    public C f4552t;

    /* renamed from: u, reason: collision with root package name */
    public C f4553u;

    /* renamed from: v, reason: collision with root package name */
    public U.a f4554v;
    public AudioTrack w;

    /* renamed from: x, reason: collision with root package name */
    public C0206e f4555x;

    /* renamed from: y, reason: collision with root package name */
    public C0210i f4556y;

    /* renamed from: z, reason: collision with root package name */
    public F f4557z;

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, T.f] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, c0.w, U.e] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, U.e, c0.Q] */
    public J(N1.r rVar) {
        C0206e c0206e;
        Context context = (Context) rVar.f1308b;
        this.f4522a = context;
        C0084e c0084e = C0084e.f2235e;
        this.f4497A = c0084e;
        if (context != null) {
            C0206e c0206e2 = C0206e.f4601c;
            int i4 = W.y.f2709a;
            c0206e = C0206e.b(context, c0084e, null);
        } else {
            c0206e = (C0206e) rVar.f1309c;
        }
        this.f4555x = c0206e;
        this.f4524b = (android.support.v4.media.session.t) rVar.f1310d;
        int i5 = W.y.f2709a;
        this.f4526c = false;
        this.f4542k = false;
        this.f4544l = 0;
        this.f4549p = (K) rVar.f1311e;
        Y.x xVar = (Y.x) rVar.f1312f;
        xVar.getClass();
        this.f4550q = xVar;
        ?? obj = new Object();
        this.f4536h = obj;
        obj.b();
        this.f4538i = new v(new K2.o(23, this));
        ?? eVar = new U.e();
        this.f4528d = eVar;
        ?? eVar2 = new U.e();
        eVar2.f4594m = W.y.f2714f;
        this.f4530e = eVar2;
        this.f4532f = f2.I.q(new U.e(), eVar, eVar2);
        this.f4534g = f2.I.o(new U.e());
        this.f4511P = 1.0f;
        this.f4523a0 = 0;
        this.f4525b0 = new Object();
        T.K k4 = T.K.f2126d;
        this.f4499C = new D(k4, 0L, 0L);
        this.f4500D = k4;
        this.f4501E = false;
        this.f4540j = new ArrayDeque();
        this.f4547n = new G0.c(3);
        this.f4548o = new G0.c(3);
    }

    public static boolean m(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (W.y.f2709a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r2 != 4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r2 != 4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            boolean r2 = r16.t()
            r3 = 4
            r4 = 1610612736(0x60000000, float:3.689349E19)
            r5 = 22
            r6 = 1342177280(0x50000000, float:8.589935E9)
            r7 = 21
            boolean r8 = r0.f4526c
            android.support.v4.media.session.t r9 = r0.f4524b
            if (r2 != 0) goto L5b
            boolean r2 = r0.f4529d0
            if (r2 != 0) goto L55
            c0.C r2 = r0.f4553u
            int r10 = r2.f4472c
            if (r10 != 0) goto L55
            T.p r2 = r2.f4470a
            int r2 = r2.f2305C
            if (r8 == 0) goto L33
            int r10 = W.y.f2709a
            if (r2 == r7) goto L55
            if (r2 == r6) goto L55
            if (r2 == r5) goto L55
            if (r2 == r4) goto L55
            if (r2 != r3) goto L33
            goto L55
        L33:
            T.K r2 = r0.f4500D
            r9.getClass()
            float r10 = r2.f2127a
            java.lang.Object r11 = r9.f3736o
            U.g r11 = (U.g) r11
            float r12 = r11.f2500c
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 == 0) goto L48
            r11.f2500c = r10
            r11.f2506i = r1
        L48:
            float r10 = r11.f2501d
            float r12 = r2.f2128b
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L57
            r11.f2501d = r12
            r11.f2506i = r1
            goto L57
        L55:
            T.K r2 = T.K.f2126d
        L57:
            r0.f4500D = r2
        L59:
            r11 = r2
            goto L5e
        L5b:
            T.K r2 = T.K.f2126d
            goto L59
        L5e:
            boolean r2 = r0.f4529d0
            if (r2 != 0) goto L84
            c0.C r2 = r0.f4553u
            int r10 = r2.f4472c
            if (r10 != 0) goto L84
            T.p r2 = r2.f4470a
            int r2 = r2.f2305C
            if (r8 == 0) goto L7b
            int r8 = W.y.f2709a
            if (r2 == r7) goto L84
            if (r2 == r6) goto L84
            if (r2 == r5) goto L84
            if (r2 == r4) goto L84
            if (r2 != r3) goto L7b
            goto L84
        L7b:
            boolean r2 = r0.f4501E
            java.lang.Object r3 = r9.f3735n
            c0.O r3 = (c0.O) r3
            r3.f4582o = r2
            goto L85
        L84:
            r2 = 0
        L85:
            r0.f4501E = r2
            java.util.ArrayDeque r2 = r0.f4540j
            c0.D r3 = new c0.D
            r4 = 0
            r6 = r17
            long r12 = java.lang.Math.max(r4, r6)
            c0.C r4 = r0.f4553u
            long r5 = r16.h()
            int r4 = r4.f4474e
            long r14 = W.y.S(r5, r4)
            r10 = r3
            r10.<init>(r11, r12, r14)
            r2.add(r3)
            c0.C r2 = r0.f4553u
            U.a r2 = r2.f4478i
            r0.f4554v = r2
            r2.b()
            K2.o r2 = r0.s
            if (r2 == 0) goto Lc7
            boolean r3 = r0.f4501E
            java.lang.Object r2 = r2.f1009m
            c0.M r2 = (c0.M) r2
            c0.n r2 = r2.f4560Q0
            android.os.Handler r4 = r2.f4631a
            if (r4 == 0) goto Lc7
            X2.h r5 = new X2.h
            r5.<init>(r2, r3, r1)
            r4.post(r5)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.J.a(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
    
        if (((r5 == java.math.RoundingMode.HALF_EVEN) & ((r18 & 1) != 0)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c5, code lost:
    
        if (r23 > 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c8, code lost:
    
        if (r9 > 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        if (r9 < 0) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x0196. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Type inference failed for: r13v7, types: [f2.F, f2.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(T.C0095p r27, int[] r28) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.J.b(T.p, int[]):void");
    }

    public final boolean c() {
        if (!this.f4554v.e()) {
            ByteBuffer byteBuffer = this.f4514S;
            if (byteBuffer == null) {
                return true;
            }
            u(byteBuffer, Long.MIN_VALUE);
            return this.f4514S == null;
        }
        U.a aVar = this.f4554v;
        if (aVar.e() && !aVar.f2464d) {
            aVar.f2464d = true;
            ((U.d) aVar.f2462b.get(0)).d();
        }
        q(Long.MIN_VALUE);
        if (!this.f4554v.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f4514S;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [c0.K, java.lang.Object] */
    public final void d() {
        F f4;
        if (l()) {
            this.f4504H = 0L;
            this.f4505I = 0L;
            this.J = 0L;
            this.f4506K = 0L;
            this.f4537h0 = false;
            this.f4507L = 0;
            this.f4499C = new D(this.f4500D, 0L, 0L);
            this.f4510O = 0L;
            this.f4498B = null;
            this.f4540j.clear();
            this.f4512Q = null;
            this.f4513R = 0;
            this.f4514S = null;
            this.f4518W = false;
            this.f4517V = false;
            this.f4519X = false;
            this.f4502F = null;
            this.f4503G = 0;
            this.f4530e.f4596o = 0L;
            U.a aVar = this.f4553u.f4478i;
            this.f4554v = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f4538i.f4663c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (m(this.w)) {
                I i4 = this.f4546m;
                i4.getClass();
                i4.b(this.w);
            }
            int i5 = W.y.f2709a;
            if (i5 < 21 && !this.f4521Z) {
                this.f4523a0 = 0;
            }
            this.f4553u.getClass();
            final ?? obj = new Object();
            C c4 = this.f4552t;
            if (c4 != null) {
                this.f4553u = c4;
                this.f4552t = null;
            }
            v vVar = this.f4538i;
            vVar.d();
            vVar.f4663c = null;
            vVar.f4666f = null;
            if (i5 >= 24 && (f4 = this.f4557z) != null) {
                f4.c();
                this.f4557z = null;
            }
            final AudioTrack audioTrack2 = this.w;
            final T2.n nVar = this.f4536h;
            final K2.o oVar = this.s;
            nVar.a();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f4494m0) {
                try {
                    if (f4495n0 == null) {
                        f4495n0 = Executors.newSingleThreadExecutor(new W.x("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f4496o0++;
                    f4495n0.execute(new Runnable() { // from class: c0.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioTrack audioTrack3 = audioTrack2;
                            K2.o oVar2 = oVar;
                            Handler handler2 = handler;
                            K k4 = obj;
                            T2.n nVar2 = nVar;
                            try {
                                audioTrack3.flush();
                                audioTrack3.release();
                                if (oVar2 != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new W.m(5, oVar2, k4));
                                }
                                nVar2.b();
                                synchronized (J.f4494m0) {
                                    try {
                                        int i6 = J.f4496o0 - 1;
                                        J.f4496o0 = i6;
                                        if (i6 == 0) {
                                            J.f4495n0.shutdown();
                                            J.f4495n0 = null;
                                        }
                                    } finally {
                                    }
                                }
                            } catch (Throwable th) {
                                if (oVar2 != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new W.m(5, oVar2, k4));
                                }
                                nVar2.b();
                                synchronized (J.f4494m0) {
                                    try {
                                        int i7 = J.f4496o0 - 1;
                                        J.f4496o0 = i7;
                                        if (i7 == 0) {
                                            J.f4495n0.shutdown();
                                            J.f4495n0 = null;
                                        }
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w = null;
        }
        this.f4548o.f675n = null;
        this.f4547n.f675n = null;
        this.f4541j0 = 0L;
        this.f4543k0 = 0L;
        Handler handler2 = this.f4545l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final C0213l e(C0095p c0095p) {
        int i4;
        boolean booleanValue;
        if (this.f4535g0) {
            return C0213l.f4625d;
        }
        C0084e c0084e = this.f4497A;
        Y.x xVar = this.f4550q;
        xVar.getClass();
        c0095p.getClass();
        c0084e.getClass();
        int i5 = W.y.f2709a;
        if (i5 < 29 || (i4 = c0095p.f2304B) == -1) {
            return C0213l.f4625d;
        }
        Boolean bool = (Boolean) xVar.f3066n;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = (Context) xVar.f3065m;
            if (context != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    xVar.f3066n = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    xVar.f3066n = Boolean.FALSE;
                }
            } else {
                xVar.f3066n = Boolean.FALSE;
            }
            booleanValue = ((Boolean) xVar.f3066n).booleanValue();
        }
        String str = c0095p.f2325m;
        str.getClass();
        int b4 = T.H.b(str, c0095p.f2322j);
        if (b4 == 0 || i5 < W.y.q(b4)) {
            return C0213l.f4625d;
        }
        int s = W.y.s(c0095p.f2303A);
        if (s == 0) {
            return C0213l.f4625d;
        }
        try {
            AudioFormat r4 = W.y.r(i4, s, b4);
            return i5 >= 31 ? y.a(r4, (AudioAttributes) c0084e.a().f1009m, booleanValue) : x.a(r4, (AudioAttributes) c0084e.a().f1009m, booleanValue);
        } catch (IllegalArgumentException unused) {
            return C0213l.f4625d;
        }
    }

    public final int f(C0095p c0095p) {
        n();
        if (!"audio/raw".equals(c0095p.f2325m)) {
            return this.f4555x.d(this.f4497A, c0095p) != null ? 2 : 0;
        }
        int i4 = c0095p.f2305C;
        if (W.y.I(i4)) {
            return (i4 == 2 || (this.f4526c && i4 == 4)) ? 2 : 1;
        }
        W.a.A("DefaultAudioSink", "Invalid PCM encoding: " + i4);
        return 0;
    }

    public final long g() {
        return this.f4553u.f4472c == 0 ? this.f4504H / r0.f4471b : this.f4505I;
    }

    public final long h() {
        C c4 = this.f4553u;
        if (c4.f4472c != 0) {
            return this.f4506K;
        }
        long j4 = this.J;
        long j5 = c4.f4473d;
        int i4 = W.y.f2709a;
        return ((j4 + j5) - 1) / j5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        if (r9.b() == 0) goto L72;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x017d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x0182. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(long r24, java.nio.ByteBuffer r26, int r27) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.J.i(long, java.nio.ByteBuffer, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3.f4519X != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r3 = this;
            boolean r0 = r3.l()
            if (r0 == 0) goto L26
            int r0 = W.y.f2709a
            r1 = 29
            if (r0 < r1) goto L18
            android.media.AudioTrack r0 = r3.w
            boolean r0 = B2.AbstractC0008i.v(r0)
            if (r0 == 0) goto L18
            boolean r0 = r3.f4519X
            if (r0 != 0) goto L26
        L18:
            c0.v r0 = r3.f4538i
            long r1 = r3.h()
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.J.j():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.J.k():boolean");
    }

    public final boolean l() {
        return this.w != null;
    }

    public final void n() {
        Context context;
        C0206e c4;
        C0208g c0208g;
        if (this.f4556y != null || (context = this.f4522a) == null) {
            return;
        }
        this.f4539i0 = Looper.myLooper();
        C0210i c0210i = new C0210i(context, new B2.x(25, this), this.f4497A, this.f4527c0);
        this.f4556y = c0210i;
        if (c0210i.f4620j) {
            c4 = c0210i.f4617g;
            c4.getClass();
        } else {
            c0210i.f4620j = true;
            C0209h c0209h = c0210i.f4616f;
            if (c0209h != null) {
                c0209h.f4608a.registerContentObserver(c0209h.f4609b, false, c0209h);
            }
            int i4 = W.y.f2709a;
            Handler handler = c0210i.f4613c;
            Context context2 = c0210i.f4611a;
            if (i4 >= 23 && (c0208g = c0210i.f4614d) != null) {
                AbstractC0207f.a(context2, c0208g, handler);
            }
            S2.g gVar = c0210i.f4615e;
            c4 = C0206e.c(context2, gVar != null ? context2.registerReceiver(gVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null, c0210i.f4619i, c0210i.f4618h);
            c0210i.f4617g = c4;
        }
        this.f4555x = c4;
    }

    public final void o() {
        this.f4520Y = true;
        if (l()) {
            v vVar = this.f4538i;
            if (vVar.f4683y != -9223372036854775807L) {
                vVar.J.getClass();
                vVar.f4683y = W.y.M(SystemClock.elapsedRealtime());
            }
            u uVar = vVar.f4666f;
            uVar.getClass();
            uVar.a();
            this.w.play();
        }
    }

    public final void p() {
        if (this.f4518W) {
            return;
        }
        this.f4518W = true;
        long h4 = h();
        v vVar = this.f4538i;
        vVar.f4652A = vVar.b();
        vVar.J.getClass();
        vVar.f4683y = W.y.M(SystemClock.elapsedRealtime());
        vVar.f4653B = h4;
        if (m(this.w)) {
            this.f4519X = false;
        }
        this.w.stop();
        this.f4503G = 0;
    }

    public final void q(long j4) {
        ByteBuffer byteBuffer;
        if (!this.f4554v.e()) {
            ByteBuffer byteBuffer2 = this.f4512Q;
            if (byteBuffer2 == null) {
                byteBuffer2 = U.d.f2470a;
            }
            u(byteBuffer2, j4);
            return;
        }
        while (!this.f4554v.d()) {
            do {
                U.a aVar = this.f4554v;
                if (aVar.e()) {
                    ByteBuffer byteBuffer3 = aVar.f2463c[aVar.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        aVar.f(U.d.f2470a);
                        byteBuffer = aVar.f2463c[aVar.c()];
                    }
                } else {
                    byteBuffer = U.d.f2470a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer, j4);
                } else {
                    ByteBuffer byteBuffer4 = this.f4512Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    U.a aVar2 = this.f4554v;
                    ByteBuffer byteBuffer5 = this.f4512Q;
                    if (aVar2.e() && !aVar2.f2464d) {
                        aVar2.f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void r() {
        d();
        f2.G listIterator = this.f4532f.listIterator(0);
        while (listIterator.hasNext()) {
            ((U.d) listIterator.next()).b();
        }
        f2.G listIterator2 = this.f4534g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((U.d) listIterator2.next()).b();
        }
        U.a aVar = this.f4554v;
        if (aVar != null) {
            int i4 = 0;
            while (true) {
                c0 c0Var = aVar.f2461a;
                if (i4 >= c0Var.size()) {
                    break;
                }
                U.d dVar = (U.d) c0Var.get(i4);
                dVar.flush();
                dVar.b();
                i4++;
            }
            aVar.f2463c = new ByteBuffer[0];
            U.b bVar = U.b.f2465e;
            aVar.f2464d = false;
        }
        this.f4520Y = false;
        this.f4535g0 = false;
    }

    public final void s() {
        if (l()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f4500D.f2127a).setPitch(this.f4500D.f2128b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e4) {
                W.a.B("DefaultAudioSink", "Failed to set playback params", e4);
            }
            T.K k4 = new T.K(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.f4500D = k4;
            v vVar = this.f4538i;
            vVar.f4670j = k4.f2127a;
            u uVar = vVar.f4666f;
            if (uVar != null) {
                uVar.a();
            }
            vVar.d();
        }
    }

    public final boolean t() {
        C c4 = this.f4553u;
        return c4 != null && c4.f4479j && W.y.f2709a >= 23;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ee, code lost:
    
        if (r15 < r14) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.J.u(java.nio.ByteBuffer, long):void");
    }
}
