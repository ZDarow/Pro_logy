package I;

import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import java.util.List;
import r3.AbstractC0534v;
import r3.C0532t;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0039h {

    /* renamed from: l, reason: collision with root package name */
    public final K.f f771l;

    /* renamed from: m, reason: collision with root package name */
    public final L1.g f772m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0533u f773n;

    /* renamed from: q, reason: collision with root package name */
    public int f776q;

    /* renamed from: r, reason: collision with root package name */
    public r3.e0 f777r;

    /* renamed from: t, reason: collision with root package name */
    public final C0044m f778t;

    /* renamed from: u, reason: collision with root package name */
    public final Z2.e f779u;

    /* renamed from: v, reason: collision with root package name */
    public final Z2.e f780v;
    public final C0044m w;

    /* renamed from: o, reason: collision with root package name */
    public final f2.Y f774o = new f2.Y(new C0051u(this, null));

    /* renamed from: p, reason: collision with root package name */
    public final z3.d f775p = z3.e.a();
    public final B2.r s = new B2.r(12);

    /* JADX WARN: Type inference failed for: r3v4, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [I.m, java.lang.Object] */
    public Q(K.f fVar, List list, L1.g gVar, InterfaceC0533u interfaceC0533u) {
        this.f771l = fVar;
        this.f772m = gVar;
        this.f773n = interfaceC0533u;
        ?? obj = new Object();
        obj.f850o = this;
        obj.f847l = z3.e.a();
        r3.Z z4 = new r3.Z(true);
        z4.H(null);
        obj.f848m = z4;
        obj.f849n = a3.d.h0(list);
        this.f778t = obj;
        this.f779u = new Z2.e(new C0045n(this, 1));
        this.f780v = new Z2.e(new C0045n(this, 0));
        L l4 = new L(0, this);
        N n4 = new N(this, null);
        ?? obj2 = new Object();
        obj2.f847l = interfaceC0533u;
        obj2.f848m = n4;
        obj2.f849n = t3.i.a(Integer.MAX_VALUE, 0, 6);
        obj2.f850o = new B2.r(10);
        r3.P p2 = (r3.P) interfaceC0533u.h().j(C0532t.f8178m);
        if (p2 != null) {
            ((r3.Z) p2).I(false, true, new z3.b(2, l4, obj2));
        }
        this.w = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(I.Q r4, d3.b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof I.C0052v
            if (r0 == 0) goto L16
            r0 = r5
            I.v r0 = (I.C0052v) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s = r1
            goto L1b
        L16:
            I.v r0 = new I.v
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f871q
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            z3.d r4 = r0.f870p
            I.Q r0 = r0.f869o
            p1.AbstractC0462a.P(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            p1.AbstractC0462a.P(r5)
            r0.f869o = r4
            z3.d r5 = r4.f775p
            r0.f870p = r5
            r0.s = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L64
        L4a:
            r0 = 0
            int r1 = r4.f776q     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + (-1)
            r4.f776q = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            r3.e0 r1 = r4.f777r     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5a
            r1.b(r0)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.f777r = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.e(r0)
            Z2.g r1 = Z2.g.f3186a
        L64:
            return r1
        L65:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Q.a(I.Q, d3.b):java.lang.Object");
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(I.Q r9, I.T r10, d3.b r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Q.c(I.Q, I.T, d3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(I.Q r4, d3.b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof I.C0055y
            if (r0 == 0) goto L16
            r0 = r5
            I.y r0 = (I.C0055y) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s = r1
            goto L1b
        L16:
            I.y r0 = new I.y
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f882q
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            z3.d r4 = r0.f881p
            I.Q r0 = r0.f880o
            p1.AbstractC0462a.P(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            p1.AbstractC0462a.P(r5)
            r0.f880o = r4
            z3.d r5 = r4.f775p
            r0.f881p = r5
            r0.s = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L67
        L4a:
            r0 = 0
            int r1 = r4.f776q     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + r3
            r4.f776q = r1     // Catch: java.lang.Throwable -> L60
            if (r1 != r3) goto L62
            r3.u r1 = r4.f773n     // Catch: java.lang.Throwable -> L60
            I.A r2 = new I.A     // Catch: java.lang.Throwable -> L60
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L60
            r3.e0 r1 = r3.AbstractC0534v.g(r1, r2)     // Catch: java.lang.Throwable -> L60
            r4.f777r = r1     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r4 = move-exception
            goto L68
        L62:
            r5.e(r0)
            Z2.g r1 = Z2.g.f3186a
        L67:
            return r1
        L68:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Q.e(I.Q, d3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(I.Q r8, boolean r9, b3.InterfaceC0190d r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Q.f(I.Q, boolean, b3.d):java.lang.Object");
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(I.Q r8, boolean r9, d3.b r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Q.g(I.Q, boolean, d3.b):java.lang.Object");
    }

    @Override // I.InterfaceC0039h
    public final Object b(j3.p pVar, d3.g gVar) {
        InterfaceC0195i interfaceC0195i = gVar.f4989m;
        k3.h.b(interfaceC0195i);
        e0 e0Var = (e0) interfaceC0195i.j(d0.f812l);
        if (e0Var != null) {
            e0Var.d(this);
        }
        return AbstractC0534v.n(new e0(e0Var, this), new K(this, pVar, null), gVar);
    }

    @Override // I.InterfaceC0039h
    public final u3.d d() {
        return this.f774o;
    }

    public final a0 h() {
        return (a0) this.f780v.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(d3.b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof I.B
            if (r0 == 0) goto L13
            r0 = r6
            I.B r0 = (I.B) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            I.B r0 = new I.B
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f717q
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f716p
            I.Q r0 = r0.f715o
            p1.AbstractC0462a.P(r6)     // Catch: java.lang.Throwable -> L2e
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
            I.Q r2 = r0.f715o
            p1.AbstractC0462a.P(r6)
            goto L51
        L3e:
            p1.AbstractC0462a.P(r6)
            I.a0 r6 = r5.h()
            r0.f715o = r5
            r0.s = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            I.m r4 = r2.f778t     // Catch: java.lang.Throwable -> L6d
            r0.f715o = r2     // Catch: java.lang.Throwable -> L6d
            r0.f716p = r6     // Catch: java.lang.Throwable -> L6d
            r0.s = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.o(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
            return r1
        L66:
            Z2.g r6 = Z2.g.f3186a
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
            B2.r r0 = r0.s
            I.U r2 = new I.U
            r2.<init>(r6, r1)
            r0.n(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Q.i(d3.b):java.lang.Object");
    }

    public final Object j(d3.b bVar) {
        return ((K.i) this.f779u.a()).a(new r(3, (InterfaceC0190d) null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [k3.n, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r12, boolean r13, d3.b r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof I.O
            if (r0 == 0) goto L13
            r0 = r14
            I.O r0 = (I.O) r0
            int r1 = r0.f764r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f764r = r1
            goto L18
        L13:
            I.O r0 = new I.O
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f762p
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.f764r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            k3.n r12 = r0.f761o
            p1.AbstractC0462a.P(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            p1.AbstractC0462a.P(r14)
            k3.n r14 = new k3.n
            r14.<init>()
            Z2.e r2 = r11.f779u
            java.lang.Object r2 = r2.a()
            K.i r2 = (K.i) r2
            I.P r10 = new I.P
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f761o = r14
            r0.f764r = r3
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f7102l
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Q.k(java.lang.Object, boolean, d3.b):java.lang.Object");
    }
}
