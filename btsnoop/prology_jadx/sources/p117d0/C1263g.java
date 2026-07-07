package p117d0;

/* renamed from: d0.g */
/* loaded from: classes.dex */
public final class C1263g extends p179q0.AbstractC1984a {

    /* renamed from: A */
    public final long f5031A;

    /* renamed from: B */
    public final p127f0.C1372e f5032B;

    /* renamed from: C */
    public final p197u0.InterfaceC2229p f5033C;

    /* renamed from: D */
    public final p117d0.C1260d f5034D;

    /* renamed from: E */
    public final java.lang.Object f5035E;

    /* renamed from: F */
    public final android.util.SparseArray f5036F;

    /* renamed from: G */
    public final p117d0.RunnableC1259c f5037G;

    /* renamed from: H */
    public final p117d0.RunnableC1259c f5038H;

    /* renamed from: I */
    public final p117d0.C1260d f5039I;

    /* renamed from: J */
    public final p197u0.InterfaceC2228o f5040J;

    /* renamed from: K */
    public p094Y.InterfaceC0870h f5041K;

    /* renamed from: L */
    public p197u0.C2227n f5042L;

    /* renamed from: M */
    public p094Y.InterfaceC0860C f5043M;

    /* renamed from: N */
    public androidx.datastore.preferences.protobuf.C1113k f5044N;

    /* renamed from: O */
    public android.os.Handler f5045O;

    /* renamed from: P */
    public p076T.C0710x f5046P;

    /* renamed from: Q */
    public android.net.Uri f5047Q;

    /* renamed from: R */
    public final android.net.Uri f5048R;

    /* renamed from: S */
    public p122e0.C1302c f5049S;

    /* renamed from: T */
    public boolean f5050T;

    /* renamed from: U */
    public long f5051U;

    /* renamed from: V */
    public long f5052V;

    /* renamed from: W */
    public long f5053W;

    /* renamed from: X */
    public int f5054X;

    /* renamed from: Y */
    public long f5055Y;

    /* renamed from: Z */
    public int f5056Z;

    /* renamed from: a0 */
    public p076T.C0659B f5057a0;

    /* renamed from: s */
    public final boolean f5058s;

    /* renamed from: t */
    public final p094Y.InterfaceC0869g f5059t;

    /* renamed from: u */
    public final p063P2.C0528a f5060u;

    /* renamed from: v */
    public final p046L1.C0363g f5061v;

    /* renamed from: w */
    public final p127f0.InterfaceC1376i f5062w;

    /* renamed from: x */
    public final p193t0.C2164b f5063x;

    /* renamed from: y */
    public final p035I.C0291m f5064y;

    /* renamed from: z */
    public final long f5065z;

    static {
        p076T.AbstractC0660C.m1179a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [d0.c] */
    public C1263g(p076T.C0659B c0659b, p094Y.InterfaceC0869g interfaceC0869g, p197u0.InterfaceC2229p interfaceC2229p, p063P2.C0528a c0528a, p046L1.C0363g c0363g, p127f0.InterfaceC1376i interfaceC1376i, p193t0.C2164b c2164b, long j4, long j5) {
        this.f5057a0 = c0659b;
        this.f5046P = c0659b.f2144c;
        p076T.C0711y c0711y = c0659b.f2143b;
        c0711y.getClass();
        android.net.Uri uri = c0711y.f2449a;
        this.f5047Q = uri;
        this.f5048R = uri;
        this.f5049S = null;
        this.f5059t = interfaceC0869g;
        this.f5033C = interfaceC2229p;
        this.f5060u = c0528a;
        this.f5062w = interfaceC1376i;
        this.f5063x = c2164b;
        this.f5065z = j4;
        this.f5031A = j5;
        this.f5061v = c0363g;
        this.f5064y = new p035I.C0291m(7);
        this.f5058s = false;
        this.f5032B = m4031a(null);
        this.f5035E = new java.lang.Object();
        this.f5036F = new android.util.SparseArray();
        this.f5039I = new p117d0.C1260d(this, 1);
        this.f5055Y = -9223372036854775807L;
        this.f5053W = -9223372036854775807L;
        this.f5034D = new p117d0.C1260d(this, 2);
        this.f5040J = new p117d0.C1260d(this, 3);
        final int i4 = 0;
        this.f5037G = new java.lang.Runnable(this) { // from class: d0.c

            /* renamed from: m */
            public final /* synthetic */ p117d0.C1263g f5017m;

            {
                this.f5017m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f5017m.m2974B();
                        return;
                    default:
                        this.f5017m.m2973A(false);
                        return;
                }
            }
        };
        final int i5 = 1;
        this.f5038H = new java.lang.Runnable(this) { // from class: d0.c

            /* renamed from: m */
            public final /* synthetic */ p117d0.C1263g f5017m;

            {
                this.f5017m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f5017m.m2974B();
                        return;
                    default:
                        this.f5017m.m2973A(false);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2972v(p122e0.C1307h r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List r2 = r5.f5251c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            e0.a r2 = (p122e0.C1300a) r2
            int r2 = r2.f5208b
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
        throw new UnsupportedOperationException("Method not decompiled: p117d0.C1263g.m2972v(e0.h):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c6, code lost:
    
        r2 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f2, code lost:
    
        if (r10 != (-9223372036854775807L)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x035e, code lost:
    
        if (r12.f2439a == (-9223372036854775807L)) goto L184;
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
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2973A(boolean r41) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p117d0.C1263g.m2973A(boolean):void");
    }

    /* renamed from: B */
    public final void m2974B() {
        android.net.Uri uri;
        this.f5045O.removeCallbacks(this.f5037G);
        if (this.f5042L.m4431c()) {
            return;
        }
        if (this.f5042L.m4432d()) {
            this.f5050T = true;
            return;
        }
        synchronized (this.f5035E) {
            uri = this.f5047Q;
        }
        this.f5050T = false;
        p197u0.C2230q c2230q = new p197u0.C2230q(this.f5041K, uri, 4, this.f5033C);
        p117d0.C1260d c1260d = this.f5034D;
        this.f5063x.getClass();
        this.f5032B.m3127k(new p179q0.C2019x(c2230q.f8887l, c2230q.f8888m, this.f5042L.m4434f(c2230q, c1260d, 3)), c2230q.f8889n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: b */
    public final p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        int intValue = ((java.lang.Integer) c1964f.f7960a).intValue() - this.f5056Z;
        p127f0.C1372e m4031a = m4031a(c1964f);
        p127f0.C1372e c1372e = new p127f0.C1372e(this.f8114o.f5650c, 0, c1964f);
        int i4 = this.f5056Z + intValue;
        p122e0.C1302c c1302c = this.f5049S;
        p094Y.InterfaceC0860C interfaceC0860C = this.f5043M;
        long j5 = this.f5053W;
        p107b0.C1177l c1177l = this.f8117r;
        p086W.AbstractC0781a.m1422k(c1177l);
        p117d0.C1258b c1258b = new p117d0.C1258b(i4, c1302c, this.f5064y, intValue, this.f5060u, interfaceC0860C, this.f5062w, c1372e, this.f5063x, m4031a, j5, this.f5040J, c2218e, this.f5061v, this.f5039I, c1177l);
        this.f5036F.put(i4, c1258b);
        return c1258b;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: h */
    public final synchronized p076T.C0659B mo2976h() {
        return this.f5057a0;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: j */
    public final void mo2977j() {
        this.f5040J.mo2967a();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: m */
    public final void mo2978m(p094Y.InterfaceC0860C interfaceC0860C) {
        this.f5043M = interfaceC0860C;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        p107b0.C1177l c1177l = this.f8117r;
        p086W.AbstractC0781a.m1422k(c1177l);
        p127f0.InterfaceC1376i interfaceC1376i = this.f5062w;
        interfaceC1376i.mo3131b(myLooper, c1177l);
        interfaceC1376i.m3134c();
        if (this.f5058s) {
            m2973A(false);
            return;
        }
        this.f5041K = this.f5059t.mo104a();
        this.f5042L = new p197u0.C2227n("DashMediaSource");
        this.f5045O = p086W.AbstractC0805y.m1619n(null);
        m2974B();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
        p117d0.C1258b c1258b = (p117d0.C1258b) interfaceC1962D;
        p117d0.C1271o c1271o = c1258b.f5013x;
        c1271o.f5111t = true;
        c1271o.f5106o.removeCallbacksAndMessages(null);
        for (p184r0.C2050h c2050h : c1258b.f4995C) {
            c2050h.m4106B(c1258b);
        }
        c1258b.f4994B = null;
        this.f5036F.remove(c1258b.f5001l);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: r */
    public final void mo2980r() {
        this.f5050T = false;
        this.f5041K = null;
        p197u0.C2227n c2227n = this.f5042L;
        if (c2227n != null) {
            c2227n.m4433e(null);
            this.f5042L = null;
        }
        this.f5051U = 0L;
        this.f5052V = 0L;
        this.f5047Q = this.f5048R;
        this.f5044N = null;
        android.os.Handler handler = this.f5045O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f5045O = null;
        }
        this.f5053W = -9223372036854775807L;
        this.f5054X = 0;
        this.f5055Y = -9223372036854775807L;
        this.f5036F.clear();
        p035I.C0291m c0291m = this.f5064y;
        ((java.util.HashMap) c0291m.f876l).clear();
        ((java.util.HashMap) c0291m.f877m).clear();
        ((java.util.HashMap) c0291m.f878n).clear();
        this.f5062w.release();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: u */
    public final synchronized void mo2981u(p076T.C0659B c0659b) {
        this.f5057a0 = c0659b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, u0.k] */
    /* renamed from: w */
    public final void m2982w() {
        boolean z4;
        p197u0.C2227n c2227n;
        p197u0.C2227n c2227n2 = this.f5042L;
        p117d0.C1260d c1260d = new p117d0.C1260d(this, 0);
        synchronized (p202v0.AbstractC2269a.f9006b) {
            z4 = p202v0.AbstractC2269a.f9007c;
            c2227n = c2227n2;
        }
        if (z4) {
            c1260d.m2968b();
            return;
        }
        if (c2227n2 == null) {
            c2227n = new p197u0.C2227n("SntpClient");
        }
        c2227n.m4434f(new java.lang.Object(), new p129f2.C1408Y(28, c1260d), 1);
    }

    /* renamed from: y */
    public final void m2983y(p197u0.C2230q c2230q, long j4, long j5) {
        long j6 = c2230q.f8887l;
        android.net.Uri uri = c2230q.f8890o.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        this.f5063x.getClass();
        this.f5032B.m3119c(c2019x, c2230q.f8889n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: z */
    public final void m2984z(java.io.IOException iOException) {
        p086W.AbstractC0781a.m1426o("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f5053W = java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime();
        m2973A(true);
    }
}
