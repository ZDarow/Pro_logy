package p112c0;

/* renamed from: c0.J */
/* loaded from: classes.dex */
public final class C1211J implements p112c0.InterfaceC1237s {

    /* renamed from: m0 */
    public static final java.lang.Object f4655m0 = new java.lang.Object();

    /* renamed from: n0 */
    public static java.util.concurrent.ExecutorService f4656n0;

    /* renamed from: o0 */
    public static int f4657o0;

    /* renamed from: A */
    public p076T.C0691e f4658A;

    /* renamed from: B */
    public p112c0.C1205D f4659B;

    /* renamed from: C */
    public p112c0.C1205D f4660C;

    /* renamed from: D */
    public p076T.C0668K f4661D;

    /* renamed from: E */
    public boolean f4662E;

    /* renamed from: F */
    public java.nio.ByteBuffer f4663F;

    /* renamed from: G */
    public int f4664G;

    /* renamed from: H */
    public long f4665H;

    /* renamed from: I */
    public long f4666I;

    /* renamed from: J */
    public long f4667J;

    /* renamed from: K */
    public long f4668K;

    /* renamed from: L */
    public int f4669L;

    /* renamed from: M */
    public boolean f4670M;

    /* renamed from: N */
    public boolean f4671N;

    /* renamed from: O */
    public long f4672O;

    /* renamed from: P */
    public float f4673P;

    /* renamed from: Q */
    public java.nio.ByteBuffer f4674Q;

    /* renamed from: R */
    public int f4675R;

    /* renamed from: S */
    public java.nio.ByteBuffer f4676S;

    /* renamed from: T */
    public byte[] f4677T;

    /* renamed from: U */
    public int f4678U;

    /* renamed from: V */
    public boolean f4679V;

    /* renamed from: W */
    public boolean f4680W;

    /* renamed from: X */
    public boolean f4681X;

    /* renamed from: Y */
    public boolean f4682Y;

    /* renamed from: Z */
    public boolean f4683Z;

    /* renamed from: a */
    public final android.content.Context f4684a;

    /* renamed from: a0 */
    public int f4685a0;

    /* renamed from: b */
    public final android.support.v4.media.session.C1061t f4686b;

    /* renamed from: b0 */
    public p076T.C0692f f4687b0;

    /* renamed from: c */
    public final boolean f4688c;

    /* renamed from: c0 */
    public p112c0.C1228j f4689c0;

    /* renamed from: d */
    public final p112c0.C1241w f4690d;

    /* renamed from: d0 */
    public boolean f4691d0;

    /* renamed from: e */
    public final p112c0.C1218Q f4692e;

    /* renamed from: e0 */
    public long f4693e0;

    /* renamed from: f */
    public final p129f2.C1415c0 f4694f;

    /* renamed from: f0 */
    public long f4695f0;

    /* renamed from: g */
    public final p129f2.C1415c0 f4696g;

    /* renamed from: g0 */
    public boolean f4697g0;

    /* renamed from: h */
    public final p078T2.C0737n f4698h;

    /* renamed from: h0 */
    public boolean f4699h0;

    /* renamed from: i */
    public final p112c0.C1240v f4700i;

    /* renamed from: i0 */
    public android.os.Looper f4701i0;

    /* renamed from: j */
    public final java.util.ArrayDeque f4702j;

    /* renamed from: j0 */
    public long f4703j0;

    /* renamed from: k */
    public final boolean f4704k;

    /* renamed from: k0 */
    public long f4705k0;

    /* renamed from: l */
    public int f4706l;

    /* renamed from: l0 */
    public android.os.Handler f4707l0;

    /* renamed from: m */
    public p112c0.C1210I f4708m;

    /* renamed from: n */
    public final p028G0.C0235c f4709n;

    /* renamed from: o */
    public final p028G0.C0235c f4710o;

    /* renamed from: p */
    public final p112c0.C1212K f4711p;

    /* renamed from: q */
    public final p094Y.C0886x f4712q;

    /* renamed from: r */
    public p107b0.C1177l f4713r;

    /* renamed from: s */
    public p043K2.C0339o f4714s;

    /* renamed from: t */
    public p112c0.C1204C f4715t;

    /* renamed from: u */
    public p112c0.C1204C f4716u;

    /* renamed from: v */
    public p079U.C0740a f4717v;

    /* renamed from: w */
    public android.media.AudioTrack f4718w;

    /* renamed from: x */
    public p112c0.C1223e f4719x;

    /* renamed from: y */
    public p112c0.C1227i f4720y;

    /* renamed from: z */
    public p112c0.C1207F f4721z;

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, T.f] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, c0.w, U.e] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, U.e, c0.Q] */
    public C1211J(p054N1.C0463r c0463r) {
        p112c0.C1223e c1223e;
        android.content.Context context = (android.content.Context) c0463r.f1352b;
        this.f4684a = context;
        p076T.C0691e c0691e = p076T.C0691e.f2315e;
        this.f4658A = c0691e;
        if (context != null) {
            p112c0.C1223e c1223e2 = p112c0.C1223e.f4767c;
            int i4 = p086W.AbstractC0805y.f2801a;
            c1223e = p112c0.C1223e.m2903b(context, c0691e, null);
        } else {
            c1223e = (p112c0.C1223e) c0463r.f1353c;
        }
        this.f4719x = c1223e;
        this.f4686b = (android.support.v4.media.session.C1061t) c0463r.f1354d;
        int i5 = p086W.AbstractC0805y.f2801a;
        this.f4688c = false;
        this.f4704k = false;
        this.f4706l = 0;
        this.f4711p = (p112c0.C1212K) c0463r.f1355e;
        p094Y.C0886x c0886x = (p094Y.C0886x) c0463r.f1356f;
        c0886x.getClass();
        this.f4712q = c0886x;
        ?? obj = new java.lang.Object();
        this.f4698h = obj;
        obj.m1327b();
        this.f4700i = new p112c0.C1240v(new p043K2.C0339o(23, this));
        ?? abstractC0744e = new p079U.AbstractC0744e();
        this.f4690d = abstractC0744e;
        ?? abstractC0744e2 = new p079U.AbstractC0744e();
        abstractC0744e2.f4760m = p086W.AbstractC0805y.f2806f;
        this.f4692e = abstractC0744e2;
        this.f4694f = p129f2.AbstractC1393I.m3168q(new p079U.AbstractC0744e(), abstractC0744e, abstractC0744e2);
        this.f4696g = p129f2.AbstractC1393I.m3166o(new p079U.AbstractC0744e());
        this.f4673P = 1.0f;
        this.f4685a0 = 0;
        this.f4687b0 = new java.lang.Object();
        p076T.C0668K c0668k = p076T.C0668K.f2206d;
        this.f4660C = new p112c0.C1205D(c0668k, 0L, 0L);
        this.f4661D = c0668k;
        this.f4662E = false;
        this.f4702j = new java.util.ArrayDeque();
        this.f4709n = new p028G0.C0235c(3);
        this.f4710o = new p028G0.C0235c(3);
    }

    /* renamed from: m */
    public static boolean m2849m(android.media.AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (p086W.AbstractC0805y.f2801a >= 29) {
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2850a(long r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            boolean r2 = r16.m2868t()
            r3 = 4
            r4 = 1610612736(0x60000000, float:3.689349E19)
            r5 = 22
            r6 = 1342177280(0x50000000, float:8.589935E9)
            r7 = 21
            boolean r8 = r0.f4688c
            android.support.v4.media.session.t r9 = r0.f4686b
            if (r2 != 0) goto L5b
            boolean r2 = r0.f4691d0
            if (r2 != 0) goto L55
            c0.C r2 = r0.f4716u
            int r10 = r2.f4633c
            if (r10 != 0) goto L55
            T.p r2 = r2.f4631a
            int r2 = r2.f2387C
            if (r8 == 0) goto L33
            int r10 = p086W.AbstractC0805y.f2801a
            if (r2 == r7) goto L55
            if (r2 == r6) goto L55
            if (r2 == r5) goto L55
            if (r2 == r4) goto L55
            if (r2 != r3) goto L33
            goto L55
        L33:
            T.K r2 = r0.f4661D
            r9.getClass()
            float r10 = r2.f2207a
            java.lang.Object r11 = r9.f3863o
            U.g r11 = (p079U.C0746g) r11
            float r12 = r11.f2588c
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 == 0) goto L48
            r11.f2588c = r10
            r11.f2594i = r1
        L48:
            float r10 = r11.f2589d
            float r12 = r2.f2208b
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L57
            r11.f2589d = r12
            r11.f2594i = r1
            goto L57
        L55:
            T.K r2 = p076T.C0668K.f2206d
        L57:
            r0.f4661D = r2
        L59:
            r11 = r2
            goto L5e
        L5b:
            T.K r2 = p076T.C0668K.f2206d
            goto L59
        L5e:
            boolean r2 = r0.f4691d0
            if (r2 != 0) goto L84
            c0.C r2 = r0.f4716u
            int r10 = r2.f4633c
            if (r10 != 0) goto L84
            T.p r2 = r2.f4631a
            int r2 = r2.f2387C
            if (r8 == 0) goto L7b
            int r8 = p086W.AbstractC0805y.f2801a
            if (r2 == r7) goto L84
            if (r2 == r6) goto L84
            if (r2 == r5) goto L84
            if (r2 == r4) goto L84
            if (r2 != r3) goto L7b
            goto L84
        L7b:
            boolean r2 = r0.f4662E
            java.lang.Object r3 = r9.f3862n
            c0.O r3 = (p112c0.C1216O) r3
            r3.f4747o = r2
            goto L85
        L84:
            r2 = 0
        L85:
            r0.f4662E = r2
            java.util.ArrayDeque r2 = r0.f4702j
            c0.D r3 = new c0.D
            r4 = 0
            r6 = r17
            long r12 = java.lang.Math.max(r4, r6)
            c0.C r4 = r0.f4716u
            long r5 = r16.m2857h()
            int r4 = r4.f4635e
            long r14 = p086W.AbstractC0805y.m1598S(r5, r4)
            r10 = r3
            r10.<init>(r11, r12, r14)
            r2.add(r3)
            c0.C r2 = r0.f4716u
            U.a r2 = r2.f4639i
            r0.f4717v = r2
            r2.m1332b()
            K2.o r2 = r0.f4714s
            if (r2 == 0) goto Lc7
            boolean r3 = r0.f4662E
            java.lang.Object r2 = r2.f1048m
            c0.M r2 = (p112c0.C1214M) r2
            c0.n r2 = r2.f4724Q0
            android.os.Handler r4 = r2.f4797a
            if (r4 == 0) goto Lc7
            X2.h r5 = new X2.h
            r5.<init>(r2, r3, r1)
            r4.post(r5)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1211J.m2850a(long):void");
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2851b(p076T.C0702p r27, int[] r28) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1211J.m2851b(T.p, int[]):void");
    }

    /* renamed from: c */
    public final boolean m2852c() {
        if (!this.f4717v.m1335e()) {
            java.nio.ByteBuffer byteBuffer = this.f4676S;
            if (byteBuffer == null) {
                return true;
            }
            m2869u(byteBuffer, Long.MIN_VALUE);
            return this.f4676S == null;
        }
        p079U.C0740a c0740a = this.f4717v;
        if (c0740a.m1335e() && !c0740a.f2551d) {
            c0740a.f2551d = true;
            ((p079U.InterfaceC0743d) c0740a.f2549b.get(0)).mo1340d();
        }
        m2865q(Long.MIN_VALUE);
        if (!this.f4717v.m1334d()) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer2 = this.f4676S;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [c0.K, java.lang.Object] */
    /* renamed from: d */
    public final void m2853d() {
        p112c0.C1207F c1207f;
        if (m2861l()) {
            this.f4665H = 0L;
            this.f4666I = 0L;
            this.f4667J = 0L;
            this.f4668K = 0L;
            this.f4699h0 = false;
            this.f4669L = 0;
            this.f4660C = new p112c0.C1205D(this.f4661D, 0L, 0L);
            this.f4672O = 0L;
            this.f4659B = null;
            this.f4702j.clear();
            this.f4674Q = null;
            this.f4675R = 0;
            this.f4676S = null;
            this.f4680W = false;
            this.f4679V = false;
            this.f4681X = false;
            this.f4663F = null;
            this.f4664G = 0;
            this.f4692e.f4762o = 0L;
            p079U.C0740a c0740a = this.f4716u.f4639i;
            this.f4717v = c0740a;
            c0740a.m1332b();
            android.media.AudioTrack audioTrack = this.f4700i.f4830c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f4718w.pause();
            }
            if (m2849m(this.f4718w)) {
                p112c0.C1210I c1210i = this.f4708m;
                c1210i.getClass();
                c1210i.m2848b(this.f4718w);
            }
            int i4 = p086W.AbstractC0805y.f2801a;
            if (i4 < 21 && !this.f4683Z) {
                this.f4685a0 = 0;
            }
            this.f4716u.getClass();
            final ?? obj = new java.lang.Object();
            p112c0.C1204C c1204c = this.f4715t;
            if (c1204c != null) {
                this.f4716u = c1204c;
                this.f4715t = null;
            }
            p112c0.C1240v c1240v = this.f4700i;
            c1240v.m2919d();
            c1240v.f4830c = null;
            c1240v.f4833f = null;
            if (i4 >= 24 && (c1207f = this.f4721z) != null) {
                c1207f.m2846c();
                this.f4721z = null;
            }
            final android.media.AudioTrack audioTrack2 = this.f4718w;
            final p078T2.C0737n c0737n = this.f4698h;
            final p043K2.C0339o c0339o = this.f4714s;
            c0737n.m1326a();
            final android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());
            synchronized (f4655m0) {
                try {
                    if (f4656n0 == null) {
                        f4656n0 = java.util.concurrent.Executors.newSingleThreadExecutor(new p086W.ThreadFactoryC0804x("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f4657o0++;
                    f4656n0.execute(new java.lang.Runnable() { // from class: c0.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            android.media.AudioTrack audioTrack3 = audioTrack2;
                            p043K2.C0339o c0339o2 = c0339o;
                            android.os.Handler handler2 = handler;
                            p112c0.C1212K c1212k = obj;
                            p078T2.C0737n c0737n2 = c0737n;
                            try {
                                audioTrack3.flush();
                                audioTrack3.release();
                                if (c0339o2 != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new p086W.RunnableC0793m(5, c0339o2, c1212k));
                                }
                                c0737n2.m1327b();
                                synchronized (p112c0.C1211J.f4655m0) {
                                    try {
                                        int i5 = p112c0.C1211J.f4657o0 - 1;
                                        p112c0.C1211J.f4657o0 = i5;
                                        if (i5 == 0) {
                                            p112c0.C1211J.f4656n0.shutdown();
                                            p112c0.C1211J.f4656n0 = null;
                                        }
                                    } finally {
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                if (c0339o2 != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new p086W.RunnableC0793m(5, c0339o2, c1212k));
                                }
                                c0737n2.m1327b();
                                synchronized (p112c0.C1211J.f4655m0) {
                                    try {
                                        int i6 = p112c0.C1211J.f4657o0 - 1;
                                        p112c0.C1211J.f4657o0 = i6;
                                        if (i6 == 0) {
                                            p112c0.C1211J.f4656n0.shutdown();
                                            p112c0.C1211J.f4656n0 = null;
                                        }
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                        }
                    });
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            this.f4718w = null;
        }
        this.f4710o.f685n = null;
        this.f4709n.f685n = null;
        this.f4703j0 = 0L;
        this.f4705k0 = 0L;
        android.os.Handler handler2 = this.f4707l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: e */
    public final p112c0.C1230l m2854e(p076T.C0702p c0702p) {
        int i4;
        boolean booleanValue;
        if (this.f4697g0) {
            return p112c0.C1230l.f4791d;
        }
        p076T.C0691e c0691e = this.f4658A;
        p094Y.C0886x c0886x = this.f4712q;
        c0886x.getClass();
        c0702p.getClass();
        c0691e.getClass();
        int i5 = p086W.AbstractC0805y.f2801a;
        if (i5 < 29 || (i4 = c0702p.f2386B) == -1) {
            return p112c0.C1230l.f4791d;
        }
        java.lang.Boolean bool = (java.lang.Boolean) c0886x.f3176n;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            android.content.Context context = (android.content.Context) c0886x.f3175m;
            if (context != null) {
                android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    java.lang.String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    c0886x.f3176n = java.lang.Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    c0886x.f3176n = java.lang.Boolean.FALSE;
                }
            } else {
                c0886x.f3176n = java.lang.Boolean.FALSE;
            }
            booleanValue = ((java.lang.Boolean) c0886x.f3176n).booleanValue();
        }
        java.lang.String str = c0702p.f2408m;
        str.getClass();
        int m1191b = p076T.AbstractC0665H.m1191b(str, c0702p.f2405j);
        if (m1191b == 0 || i5 < p086W.AbstractC0805y.m1622q(m1191b)) {
            return p112c0.C1230l.f4791d;
        }
        int m1624s = p086W.AbstractC0805y.m1624s(c0702p.f2385A);
        if (m1624s == 0) {
            return p112c0.C1230l.f4791d;
        }
        try {
            android.media.AudioFormat m1623r = p086W.AbstractC0805y.m1623r(i4, m1624s, m1191b);
            return i5 >= 31 ? p112c0.AbstractC1243y.m2921a(m1623r, (android.media.AudioAttributes) c0691e.m1269a().f1048m, booleanValue) : p112c0.AbstractC1242x.m2920a(m1623r, (android.media.AudioAttributes) c0691e.m1269a().f1048m, booleanValue);
        } catch (java.lang.IllegalArgumentException unused) {
            return p112c0.C1230l.f4791d;
        }
    }

    /* renamed from: f */
    public final int m2855f(p076T.C0702p c0702p) {
        m2862n();
        if (!"audio/raw".equals(c0702p.f2408m)) {
            return this.f4719x.m2905d(this.f4658A, c0702p) != null ? 2 : 0;
        }
        int i4 = c0702p.f2387C;
        if (p086W.AbstractC0805y.m1588I(i4)) {
            return (i4 == 2 || (this.f4688c && i4 == 4)) ? 2 : 1;
        }
        p086W.AbstractC0781a.m1410A("DefaultAudioSink", "Invalid PCM encoding: " + i4);
        return 0;
    }

    /* renamed from: g */
    public final long m2856g() {
        return this.f4716u.f4633c == 0 ? this.f4665H / r0.f4632b : this.f4666I;
    }

    /* renamed from: h */
    public final long m2857h() {
        p112c0.C1204C c1204c = this.f4716u;
        if (c1204c.f4633c != 0) {
            return this.f4668K;
        }
        long j4 = this.f4667J;
        long j5 = c1204c.f4634d;
        int i4 = p086W.AbstractC0805y.f2801a;
        return ((j4 + j5) - 1) / j5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        if (r9.m2917b() == 0) goto L72;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x017d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x0182. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026e  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2858i(long r24, java.nio.ByteBuffer r26, int r27) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1211J.m2858i(long, java.nio.ByteBuffer, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3.f4681X != false) goto L13;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2859j() {
        /*
            r3 = this;
            boolean r0 = r3.m2861l()
            if (r0 == 0) goto L26
            int r0 = p086W.AbstractC0805y.f2801a
            r1 = 29
            if (r0 < r1) goto L18
            android.media.AudioTrack r0 = r3.f4718w
            boolean r0 = p009B2.AbstractC0052i.m187v(r0)
            if (r0 == 0) goto L18
            boolean r0 = r3.f4681X
            if (r0 != 0) goto L26
        L18:
            c0.v r0 = r3.f4700i
            long r1 = r3.m2857h()
            boolean r0 = r0.m2918c(r1)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1211J.m2859j():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2860k() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1211J.m2860k():boolean");
    }

    /* renamed from: l */
    public final boolean m2861l() {
        return this.f4718w != null;
    }

    /* renamed from: n */
    public final void m2862n() {
        android.content.Context context;
        p112c0.C1223e m2904c;
        p112c0.C1225g c1225g;
        if (this.f4720y != null || (context = this.f4684a) == null) {
            return;
        }
        this.f4701i0 = android.os.Looper.myLooper();
        p112c0.C1227i c1227i = new p112c0.C1227i(context, new p009B2.C0067x(25, this), this.f4658A, this.f4689c0);
        this.f4720y = c1227i;
        if (c1227i.f4786j) {
            m2904c = c1227i.f4783g;
            m2904c.getClass();
        } else {
            c1227i.f4786j = true;
            p112c0.C1226h c1226h = c1227i.f4782f;
            if (c1226h != null) {
                c1226h.f4774a.registerContentObserver(c1226h.f4775b, false, c1226h);
            }
            int i4 = p086W.AbstractC0805y.f2801a;
            android.os.Handler handler = c1227i.f4779c;
            android.content.Context context2 = c1227i.f4777a;
            if (i4 >= 23 && (c1225g = c1227i.f4780d) != null) {
                p112c0.AbstractC1224f.m2907a(context2, c1225g, handler);
            }
            p075S2.C0654g c0654g = c1227i.f4781e;
            m2904c = p112c0.C1223e.m2904c(context2, c0654g != null ? context2.registerReceiver(c0654g, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null, c1227i.f4785i, c1227i.f4784h);
            c1227i.f4783g = m2904c;
        }
        this.f4719x = m2904c;
    }

    /* renamed from: o */
    public final void m2863o() {
        this.f4682Y = true;
        if (m2861l()) {
            p112c0.C1240v c1240v = this.f4700i;
            if (c1240v.f4852y != -9223372036854775807L) {
                c1240v.f4827J.getClass();
                c1240v.f4852y = p086W.AbstractC0805y.m1592M(android.os.SystemClock.elapsedRealtime());
            }
            p112c0.C1239u c1239u = c1240v.f4833f;
            c1239u.getClass();
            c1239u.m2914a();
            this.f4718w.play();
        }
    }

    /* renamed from: p */
    public final void m2864p() {
        if (this.f4680W) {
            return;
        }
        this.f4680W = true;
        long m2857h = m2857h();
        p112c0.C1240v c1240v = this.f4700i;
        c1240v.f4818A = c1240v.m2917b();
        c1240v.f4827J.getClass();
        c1240v.f4852y = p086W.AbstractC0805y.m1592M(android.os.SystemClock.elapsedRealtime());
        c1240v.f4819B = m2857h;
        if (m2849m(this.f4718w)) {
            this.f4681X = false;
        }
        this.f4718w.stop();
        this.f4664G = 0;
    }

    /* renamed from: q */
    public final void m2865q(long j4) {
        java.nio.ByteBuffer byteBuffer;
        if (!this.f4717v.m1335e()) {
            java.nio.ByteBuffer byteBuffer2 = this.f4674Q;
            if (byteBuffer2 == null) {
                byteBuffer2 = p079U.InterfaceC0743d.f2557a;
            }
            m2869u(byteBuffer2, j4);
            return;
        }
        while (!this.f4717v.m1334d()) {
            do {
                p079U.C0740a c0740a = this.f4717v;
                if (c0740a.m1335e()) {
                    java.nio.ByteBuffer byteBuffer3 = c0740a.f2550c[c0740a.m1333c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c0740a.m1336f(p079U.InterfaceC0743d.f2557a);
                        byteBuffer = c0740a.f2550c[c0740a.m1333c()];
                    }
                } else {
                    byteBuffer = p079U.InterfaceC0743d.f2557a;
                }
                if (byteBuffer.hasRemaining()) {
                    m2869u(byteBuffer, j4);
                } else {
                    java.nio.ByteBuffer byteBuffer4 = this.f4674Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    p079U.C0740a c0740a2 = this.f4717v;
                    java.nio.ByteBuffer byteBuffer5 = this.f4674Q;
                    if (c0740a2.m1335e() && !c0740a2.f2551d) {
                        c0740a2.m1336f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    /* renamed from: r */
    public final void m2866r() {
        m2853d();
        p129f2.C1391G listIterator = this.f4694f.listIterator(0);
        while (listIterator.hasNext()) {
            ((p079U.InterfaceC0743d) listIterator.next()).mo1338b();
        }
        p129f2.C1391G listIterator2 = this.f4696g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((p079U.InterfaceC0743d) listIterator2.next()).mo1338b();
        }
        p079U.C0740a c0740a = this.f4717v;
        if (c0740a != null) {
            int i4 = 0;
            while (true) {
                p129f2.C1415c0 c1415c0 = c0740a.f2548a;
                if (i4 >= c1415c0.size()) {
                    break;
                }
                p079U.InterfaceC0743d interfaceC0743d = (p079U.InterfaceC0743d) c1415c0.get(i4);
                interfaceC0743d.flush();
                interfaceC0743d.mo1338b();
                i4++;
            }
            c0740a.f2550c = new java.nio.ByteBuffer[0];
            p079U.C0741b c0741b = p079U.C0741b.f2552e;
            c0740a.f2551d = false;
        }
        this.f4682Y = false;
        this.f4697g0 = false;
    }

    /* renamed from: s */
    public final void m2867s() {
        if (m2861l()) {
            try {
                this.f4718w.setPlaybackParams(new android.media.PlaybackParams().allowDefaults().setSpeed(this.f4661D.f2207a).setPitch(this.f4661D.f2208b).setAudioFallbackMode(2));
            } catch (java.lang.IllegalArgumentException e4) {
                p086W.AbstractC0781a.m1411B("DefaultAudioSink", "Failed to set playback params", e4);
            }
            p076T.C0668K c0668k = new p076T.C0668K(this.f4718w.getPlaybackParams().getSpeed(), this.f4718w.getPlaybackParams().getPitch());
            this.f4661D = c0668k;
            p112c0.C1240v c1240v = this.f4700i;
            c1240v.f4837j = c0668k.f2207a;
            p112c0.C1239u c1239u = c1240v.f4833f;
            if (c1239u != null) {
                c1239u.m2914a();
            }
            c1240v.m2919d();
        }
    }

    /* renamed from: t */
    public final boolean m2868t() {
        p112c0.C1204C c1204c = this.f4716u;
        return c1204c != null && c1204c.f4640j && p086W.AbstractC0805y.f2801a >= 23;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ee, code lost:
    
        if (r15 < r14) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0150  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2869u(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1211J.m2869u(java.nio.ByteBuffer, long):void");
    }
}
