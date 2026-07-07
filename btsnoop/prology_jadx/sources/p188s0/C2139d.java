package p188s0;

/* renamed from: s0.d */
/* loaded from: classes.dex */
public final class C2139d extends p102a0.AbstractC0970e implements android.os.Handler.Callback {

    /* renamed from: C */
    public final p046L1.C0363g f8513C;

    /* renamed from: D */
    public final p098Z.C0921f f8514D;

    /* renamed from: E */
    public p188s0.InterfaceC2136a f8515E;

    /* renamed from: F */
    public final p129f2.C1408Y f8516F;

    /* renamed from: G */
    public boolean f8517G;

    /* renamed from: H */
    public int f8518H;

    /* renamed from: I */
    public p083V0.InterfaceC0767e f8519I;

    /* renamed from: J */
    public p083V0.C0771i f8520J;

    /* renamed from: K */
    public p083V0.C0765c f8521K;

    /* renamed from: L */
    public p083V0.C0765c f8522L;

    /* renamed from: M */
    public int f8523M;

    /* renamed from: N */
    public final android.os.Handler f8524N;

    /* renamed from: O */
    public final p102a0.SurfaceHolderCallbackC0941E f8525O;

    /* renamed from: P */
    public final p094Y.C0886x f8526P;

    /* renamed from: Q */
    public boolean f8527Q;

    /* renamed from: R */
    public boolean f8528R;

    /* renamed from: S */
    public p076T.C0702p f8529S;

    /* renamed from: T */
    public long f8530T;

    /* renamed from: U */
    public long f8531U;

    /* renamed from: V */
    public long f8532V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139d(p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E, android.os.Looper looper) {
        super(3);
        p129f2.C1408Y c1408y = p188s0.InterfaceC2138c.f8512g;
        this.f8525O = surfaceHolderCallbackC0941E;
        this.f8524N = looper == null ? null : new android.os.Handler(looper, this);
        this.f8516F = c1408y;
        this.f8513C = new p046L1.C0363g(14, false);
        this.f8514D = new p098Z.C0921f(1);
        this.f8526P = new p094Y.C0886x((char) 0, 4);
        this.f8532V = -9223372036854775807L;
        this.f8530T = -9223372036854775807L;
        this.f8531U = -9223372036854775807L;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: D */
    public final int mo1983D(p076T.C0702p c0702p) {
        if (!java.util.Objects.equals(c0702p.f2408m, "application/x-media3-cues")) {
            p129f2.C1408Y c1408y = this.f8516F;
            c1408y.getClass();
            if (!((p046L1.C0363g) c1408y.f5729m).mo600o(c0702p)) {
                java.lang.String str = c0702p.f2408m;
                if (!java.util.Objects.equals(str, "application/cea-608") && !java.util.Objects.equals(str, "application/x-mp4-cea-608") && !java.util.Objects.equals(str, "application/cea-708")) {
                    return p076T.AbstractC0665H.m1199j(str) ? p102a0.AbstractC0970e.m1976f(1, 0, 0, 0) : p102a0.AbstractC0970e.m1976f(0, 0, 0, 0);
                }
            }
        }
        return p102a0.AbstractC0970e.m1976f(c0702p.f2394J == 0 ? 4 : 2, 0, 0, 0);
    }

    /* renamed from: F */
    public final void m4257F() {
        p086W.AbstractC0781a.m1420i("Legacy decoding is disabled, can't handle " + this.f8529S.f2408m + " samples (expected application/x-media3-cues).", java.util.Objects.equals(this.f8529S.f2408m, "application/cea-608") || java.util.Objects.equals(this.f8529S.f2408m, "application/x-mp4-cea-608") || java.util.Objects.equals(this.f8529S.f2408m, "application/cea-708"));
    }

    /* renamed from: G */
    public final long m4258G() {
        if (this.f8523M == -1) {
            return Long.MAX_VALUE;
        }
        this.f8521K.getClass();
        if (this.f8523M >= this.f8521K.mo655Q()) {
            return Long.MAX_VALUE;
        }
        return this.f8521K.mo654B(this.f8523M);
    }

    /* renamed from: H */
    public final long m4259H(long j4) {
        p086W.AbstractC0781a.m1421j(j4 != -9223372036854775807L);
        p086W.AbstractC0781a.m1421j(this.f8530T != -9223372036854775807L);
        return j4 - this.f8530T;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003b. Please report as an issue. */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4260I() {
        /*
            r7 = this;
            r0 = 1
            r7.f8517G = r0
            T.p r1 = r7.f8529S
            r1.getClass()
            f2.Y r2 = r7.f8516F
            r2.getClass()
            java.lang.String r3 = r1.f2408m
            if (r3 == 0) goto L4d
            int r4 = r1.f2390F
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r5
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            W0.g r0 = new W0.g
            java.util.List r1 = r1.f2411p
            r0.<init>(r4, r1)
            goto L6e
        L47:
            W0.c r0 = new W0.c
            r0.<init>(r3, r4)
            goto L6e
        L4d:
            java.lang.Object r0 = r2.f5729m
            L1.g r0 = (p046L1.C0363g) r0
            boolean r2 = r0.mo600o(r1)
            if (r2 == 0) goto L76
            V0.l r0 = r0.mo591d(r1)
            i0.b r1 = new i0.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6e:
            r7.f8519I = r0
            long r1 = r7.f3550w
            r0.mo1656e(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = p009B2.AbstractC0051h.m153l(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p188s0.C2139d.m4260I():void");
    }

    /* renamed from: J */
    public final void m4261J(p082V.C0758c c0758c) {
        p129f2.AbstractC1393I abstractC1393I = c0758c.f2671a;
        p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E = this.f8525O;
        surfaceHolderCallbackC0941E.f3316a.f3364l.m1444e(27, new p009B2.C0067x(19, abstractC1393I));
        p102a0.C0944H c0944h = surfaceHolderCallbackC0941E.f3316a;
        c0944h.getClass();
        c0944h.f3364l.m1444e(27, new p009B2.C0067x(16, c0758c));
    }

    /* renamed from: K */
    public final void m4262K() {
        this.f8520J = null;
        this.f8523M = -1;
        p083V0.C0765c c0765c = this.f8521K;
        if (c0765c != null) {
            c0765c.mo1399f();
            this.f8521K = null;
        }
        p083V0.C0765c c0765c2 = this.f8522L;
        if (c0765c2 != null) {
            c0765c2.mo1399f();
            this.f8522L = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            throw new java.lang.IllegalStateException();
        }
        m4261J((p082V.C0758c) message.obj);
        return true;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: l */
    public final java.lang.String mo1988l() {
        return "TextRenderer";
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: n */
    public final boolean mo1990n() {
        return this.f8528R;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: p */
    public final boolean mo1991p() {
        return true;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: q */
    public final void mo1992q() {
        this.f8529S = null;
        this.f8532V = -9223372036854775807L;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        m4259H(this.f8531U);
        p082V.C0758c c0758c = new p082V.C0758c(c1415c0);
        android.os.Handler handler = this.f8524N;
        if (handler != null) {
            handler.obtainMessage(1, c0758c).sendToTarget();
        } else {
            m4261J(c0758c);
        }
        this.f8530T = -9223372036854775807L;
        this.f8531U = -9223372036854775807L;
        if (this.f8519I != null) {
            m4262K();
            p083V0.InterfaceC0767e interfaceC0767e = this.f8519I;
            interfaceC0767e.getClass();
            interfaceC0767e.release();
            this.f8519I = null;
            this.f8518H = 0;
        }
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: s */
    public final void mo1994s(long j4, boolean z4) {
        this.f8531U = j4;
        p188s0.InterfaceC2136a interfaceC2136a = this.f8515E;
        if (interfaceC2136a != null) {
            interfaceC2136a.clear();
        }
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        m4259H(this.f8531U);
        p082V.C0758c c0758c = new p082V.C0758c(c1415c0);
        android.os.Handler handler = this.f8524N;
        if (handler != null) {
            handler.obtainMessage(1, c0758c).sendToTarget();
        } else {
            m4261J(c0758c);
        }
        this.f8527Q = false;
        this.f8528R = false;
        this.f8532V = -9223372036854775807L;
        p076T.C0702p c0702p = this.f8529S;
        if (c0702p == null || java.util.Objects.equals(c0702p.f2408m, "application/x-media3-cues")) {
            return;
        }
        if (this.f8518H == 0) {
            m4262K();
            p083V0.InterfaceC0767e interfaceC0767e = this.f8519I;
            interfaceC0767e.getClass();
            interfaceC0767e.flush();
            interfaceC0767e.mo1656e(this.f3550w);
            return;
        }
        m4262K();
        p083V0.InterfaceC0767e interfaceC0767e2 = this.f8519I;
        interfaceC0767e2.getClass();
        interfaceC0767e2.release();
        this.f8519I = null;
        this.f8518H = 0;
        m4260I();
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: x */
    public final void mo1999x(p076T.C0702p[] c0702pArr, long j4, long j5) {
        this.f8530T = j5;
        p076T.C0702p c0702p = c0702pArr[0];
        this.f8529S = c0702p;
        if (java.util.Objects.equals(c0702p.f2408m, "application/x-media3-cues")) {
            this.f8515E = this.f8529S.f2391G == 1 ? new p188s0.C2137b() : new p056O.C0479g(2);
            return;
        }
        m4257F();
        if (this.f8519I != null) {
            this.f8518H = 1;
        } else {
            m4260I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023f A[EXC_TOP_SPLITTER, LOOP:2: B:100:0x023f->B:122:0x02ad, LOOP_START, PHI: r15
      0x023f: PHI (r15v2 Y.x) = (r15v1 Y.x), (r15v3 Y.x) binds: [B:99:0x023b, B:122:0x02ad] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ed  */
    @Override // p102a0.AbstractC0970e
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2001z(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p188s0.C2139d.mo2001z(long, long):void");
    }
}
