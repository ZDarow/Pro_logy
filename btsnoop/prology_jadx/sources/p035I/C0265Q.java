package p035I;

/* renamed from: I.Q */
/* loaded from: classes.dex */
public final class C0265Q implements p035I.InterfaceC0286h {

    /* renamed from: l */
    public final p040K.C0316f f791l;

    /* renamed from: m */
    public final p046L1.C0363g f792m;

    /* renamed from: n */
    public final p187r3.InterfaceC2130u f793n;

    /* renamed from: q */
    public int f796q;

    /* renamed from: r */
    public p187r3.C2107e0 f797r;

    /* renamed from: t */
    public final p035I.C0291m f799t;

    /* renamed from: u */
    public final p100Z2.C0932e f800u;

    /* renamed from: v */
    public final p100Z2.C0932e f801v;

    /* renamed from: w */
    public final p035I.C0291m f802w;

    /* renamed from: o */
    public final p129f2.C1408Y f794o = new p129f2.C1408Y(new p035I.C0299u(this, null));

    /* renamed from: p */
    public final p222z3.C2445d f795p = p222z3.AbstractC2446e.m4684a();

    /* renamed from: s */
    public final p009B2.C0061r f798s = new p009B2.C0061r(12);

    /* JADX WARN: Type inference failed for: r3v4, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [I.m, java.lang.Object] */
    public C0265Q(p040K.C0316f c0316f, java.util.List list, p046L1.C0363g c0363g, p187r3.InterfaceC2130u interfaceC2130u) {
        this.f791l = c0316f;
        this.f792m = c0363g;
        this.f793n = interfaceC2130u;
        ?? obj = new java.lang.Object();
        obj.f879o = this;
        obj.f876l = p222z3.AbstractC2446e.m4684a();
        p187r3.C2097Z c2097z = new p187r3.C2097Z(true);
        c2097z.m4190H(null);
        obj.f877m = c2097z;
        obj.f878n = p105a3.AbstractC1021d.m2053h0(list);
        this.f799t = obj;
        this.f800u = new p100Z2.C0932e(new p035I.C0292n(this, 1));
        this.f801v = new p100Z2.C0932e(new p035I.C0292n(this, 0));
        p035I.C0260L c0260l = new p035I.C0260L(0, this);
        p035I.C0262N c0262n = new p035I.C0262N(this, null);
        ?? obj2 = new java.lang.Object();
        obj2.f876l = interfaceC2130u;
        obj2.f877m = c0262n;
        obj2.f878n = p195t3.AbstractC2196i.m4373a(Integer.MAX_VALUE, 0, 6);
        obj2.f879o = new p009B2.C0061r(10);
        p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) interfaceC2130u.mo2652h().mo678j(p187r3.C2129t.f8496m);
        if (interfaceC2088P != null) {
            ((p187r3.C2097Z) interfaceC2088P).m4191I(false, true, new p222z3.C2443b(2, c0260l, obj2));
        }
        this.f802w = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m662a(p035I.C0265Q r4, p120d3.AbstractC1292b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof p035I.C0300v
            if (r0 == 0) goto L16
            r0 = r5
            I.v r0 = (p035I.C0300v) r0
            int r1 = r0.f903s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f903s = r1
            goto L1b
        L16:
            I.v r0 = new I.v
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f901q
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f903s
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            z3.d r4 = r0.f900p
            I.Q r0 = r0.f899o
            p176p1.AbstractC1949a.m3913P(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            p176p1.AbstractC1949a.m3913P(r5)
            r0.f899o = r4
            z3.d r5 = r4.f795p
            r0.f900p = r5
            r0.f903s = r3
            java.lang.Object r0 = r5.m4681c(r0)
            if (r0 != r1) goto L4a
            goto L64
        L4a:
            r0 = 0
            int r1 = r4.f796q     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + (-1)
            r4.f796q = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            r3.e0 r1 = r4.f797r     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5a
            r1.mo4170b(r0)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.f797r = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.m4683e(r0)
            Z2.g r1 = p100Z2.C0934g.f3298a
        L64:
            return r1
        L65:
            r5.m4683e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0265Q.m662a(I.Q, d3.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|(7:57|(1:(1:(1:61)(2:63|64))(3:65|66|67))(1:68)|62|17|(1:19)(1:23)|20|21)(4:8|9|10|(9:12|13|14|(1:24)|16|17|(0)(0)|20|21)(3:30|(1:32)(1:55)|(2:34|(2:36|(2:38|39))(2:47|48))(2:49|(2:51|52)(2:53|54))))|40|41|42|(1:44)|16|17|(0)(0)|20|21))|70|6|(0)(0)|40|41|42|(0)|16|17|(0)(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r2v3, types: [d3.g, j3.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [d3.g, j3.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m663c(p035I.C0265Q r9, p035I.C0267T r10, p120d3.AbstractC1292b r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0265Q.m663c(I.Q, I.T, d3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m664e(p035I.C0265Q r4, p120d3.AbstractC1292b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof p035I.C0303y
            if (r0 == 0) goto L16
            r0 = r5
            I.y r0 = (p035I.C0303y) r0
            int r1 = r0.f916s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f916s = r1
            goto L1b
        L16:
            I.y r0 = new I.y
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f914q
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f916s
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            z3.d r4 = r0.f913p
            I.Q r0 = r0.f912o
            p176p1.AbstractC1949a.m3913P(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            p176p1.AbstractC1949a.m3913P(r5)
            r0.f912o = r4
            z3.d r5 = r4.f795p
            r0.f913p = r5
            r0.f916s = r3
            java.lang.Object r0 = r5.m4681c(r0)
            if (r0 != r1) goto L4a
            goto L67
        L4a:
            r0 = 0
            int r1 = r4.f796q     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + r3
            r4.f796q = r1     // Catch: java.lang.Throwable -> L60
            if (r1 != r3) goto L62
            r3.u r1 = r4.f793n     // Catch: java.lang.Throwable -> L60
            I.A r2 = new I.A     // Catch: java.lang.Throwable -> L60
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L60
            r3.e0 r1 = p187r3.AbstractC2131v.m4248g(r1, r2)     // Catch: java.lang.Throwable -> L60
            r4.f797r = r1     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r4 = move-exception
            goto L68
        L62:
            r5.m4683e(r0)
            Z2.g r1 = p100Z2.C0934g.f3298a
        L67:
            return r1
        L68:
            r5.m4683e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0265Q.m664e(I.Q, d3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m665f(p035I.C0265Q r8, boolean r9, p110b3.InterfaceC1190d r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0265Q.m665f(I.Q, boolean, b3.d):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: b -> 0x00ab, TryCatch #0 {b -> 0x00ab, blocks: (B:36:0x00a6, B:37:0x0144, B:41:0x00b4, B:42:0x0127, B:58:0x00d1, B:60:0x00ea, B:61:0x00ee, B:67:0x00da, B:71:0x0115), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k3.p, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [k3.n, java.lang.Object, java.io.Serializable] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m666g(p035I.C0265Q r8, boolean r9, p120d3.AbstractC1292b r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0265Q.m666g(I.Q, boolean, d3.b):java.lang.Object");
    }

    @Override // p035I.InterfaceC0286h
    /* renamed from: b */
    public final java.lang.Object mo667b(p149j3.InterfaceC1741p interfaceC1741p, p120d3.AbstractC1297g abstractC1297g) {
        p110b3.InterfaceC1195i interfaceC1195i = abstractC1297g.f5176m;
        p154k3.AbstractC1803h.m3776b(interfaceC1195i);
        p035I.C0283e0 c0283e0 = (p035I.C0283e0) interfaceC1195i.mo678j(p035I.C0281d0.f837l);
        if (c0283e0 != null) {
            c0283e0.m677d(this);
        }
        return p187r3.AbstractC2131v.m4255n(new p035I.C0283e0(c0283e0, this), new p035I.C0259K(this, interfaceC1741p, null), abstractC1297g);
    }

    @Override // p035I.InterfaceC0286h
    /* renamed from: d */
    public final p200u3.InterfaceC2250d mo668d() {
        return this.f794o;
    }

    /* renamed from: h */
    public final p035I.C0275a0 m669h() {
        return (p035I.C0275a0) this.f801v.m1762a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m670i(p120d3.AbstractC1292b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p035I.C0250B
            if (r0 == 0) goto L13
            r0 = r6
            I.B r0 = (p035I.C0250B) r0
            int r1 = r0.f730s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f730s = r1
            goto L18
        L13:
            I.B r0 = new I.B
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f728q
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f730s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f727p
            I.Q r0 = r0.f726o
            p176p1.AbstractC1949a.m3913P(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            I.Q r2 = r0.f726o
            p176p1.AbstractC1949a.m3913P(r6)
            goto L51
        L3e:
            p176p1.AbstractC1949a.m3913P(r6)
            I.a0 r6 = r5.m669h()
            r0.f726o = r5
            r0.f730s = r4
            java.lang.Integer r6 = r6.m673a()
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            I.m r4 = r2.f799t     // Catch: java.lang.Throwable -> L6d
            r0.f726o = r2     // Catch: java.lang.Throwable -> L6d
            r0.f727p = r6     // Catch: java.lang.Throwable -> L6d
            r0.f730s = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.m698o(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
            return r1
        L66:
            Z2.g r6 = p100Z2.C0934g.f3298a
            return r6
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L6f
        L6d:
            r0 = move-exception
            goto L69
        L6f:
            B2.r r0 = r0.f798s
            I.U r2 = new I.U
            r2.<init>(r6, r1)
            r0.m275n(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0265Q.m670i(d3.b):java.lang.Object");
    }

    /* renamed from: j */
    public final java.lang.Object m671j(p120d3.AbstractC1292b abstractC1292b) {
        return ((p040K.C0319i) this.f800u.m1762a()).m713a(new p035I.C0296r(3, (p110b3.InterfaceC1190d) null), abstractC1292b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [k3.n, java.lang.Object] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m672k(java.lang.Object r12, boolean r13, p120d3.AbstractC1292b r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p035I.C0263O
            if (r0 == 0) goto L13
            r0 = r14
            I.O r0 = (p035I.C0263O) r0
            int r1 = r0.f783r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f783r = r1
            goto L18
        L13:
            I.O r0 = new I.O
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f781p
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f783r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            k3.n r12 = r0.f780o
            p176p1.AbstractC1949a.m3913P(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            p176p1.AbstractC1949a.m3913P(r14)
            k3.n r14 = new k3.n
            r14.<init>()
            Z2.e r2 = r11.f800u
            java.lang.Object r2 = r2.m1762a()
            K.i r2 = (p040K.C0319i) r2
            I.P r10 = new I.P
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f780o = r14
            r0.f783r = r3
            java.lang.Object r12 = r2.m714b(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f7372l
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0265Q.m672k(java.lang.Object, boolean, d3.b):java.lang.Object");
    }
}
