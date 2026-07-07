package p040K;

/* renamed from: K.i */
/* loaded from: classes.dex */
public final class C0319i implements p035I.InterfaceC0274a {

    /* renamed from: a */
    public final p010B3.C0078i f962a;

    /* renamed from: b */
    public final p010B3.C0081l f963b;

    /* renamed from: c */
    public final p035I.C0275a0 f964c;

    /* renamed from: d */
    public final p040K.C0315e f965d;

    /* renamed from: e */
    public final p040K.C0311a f966e;

    /* renamed from: f */
    public final p222z3.C2445d f967f;

    public C0319i(p010B3.C0078i c0078i, p010B3.C0081l c0081l, p035I.C0275a0 c0275a0, p040K.C0315e c0315e) {
        p154k3.AbstractC1803h.m3779e(c0078i, "fileSystem");
        p154k3.AbstractC1803h.m3779e(c0081l, "path");
        p154k3.AbstractC1803h.m3779e(c0275a0, "coordinator");
        this.f962a = c0078i;
        this.f963b = c0081l;
        this.f964c = c0275a0;
        this.f965d = c0315e;
        this.f966e = new p040K.C0311a();
        this.f967f = p222z3.AbstractC2446e.m4684a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007d, blocks: (B:21:0x007c, B:31:0x008c, B:28:0x008f, B:27:0x0087), top: B:7:0x0020, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10, types: [K.i] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [K.g, d3.b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [K.i] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [I.r] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m713a(p035I.C0296r r9, p120d3.AbstractC1292b r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p040K.C0317g
            if (r0 == 0) goto L13
            r0 = r10
            K.g r0 = (p040K.C0317g) r0
            int r1 = r0.f954t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f954t = r1
            goto L18
        L13:
            K.g r0 = new K.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f952r
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f954t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            boolean r9 = r0.f951q
            K.c r1 = r0.f950p
            K.i r0 = r0.f949o
            p176p1.AbstractC1949a.m3913P(r10)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L2e:
            r10 = move-exception
            goto L87
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            p176p1.AbstractC1949a.m3913P(r10)
            K.a r10 = r8.f966e
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.f931a
            boolean r10 = r10.get()
            if (r10 != 0) goto L9f
            z3.d r10 = r8.f967f
            boolean r10 = r10.m4682d(r3)
            K.c r2 = new K.c     // Catch: java.lang.Throwable -> L95
            B3.i r5 = r8.f962a     // Catch: java.lang.Throwable -> L95
            B3.l r6 = r8.f963b     // Catch: java.lang.Throwable -> L95
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L85
            r0.f949o = r8     // Catch: java.lang.Throwable -> L85
            r0.f950p = r2     // Catch: java.lang.Throwable -> L85
            r0.f951q = r10     // Catch: java.lang.Throwable -> L85
            r0.f954t = r4     // Catch: java.lang.Throwable -> L85
            java.lang.Object r9 = r9.m706p(r2, r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r9 != r1) goto L67
            return r1
        L67:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6c:
            r1.close()     // Catch: java.lang.Throwable -> L71
            r1 = r3
            goto L72
        L71:
            r1 = move-exception
        L72:
            if (r1 != 0) goto L7c
            if (r9 == 0) goto L7b
            z3.d r9 = r0.f967f
            r9.m4683e(r3)
        L7b:
            return r10
        L7c:
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r10 = move-exception
            goto L97
        L7f:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
            goto L87
        L85:
            r9 = move-exception
            goto L7f
        L87:
            r1.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r1 = move-exception
            p101a.AbstractC0936a.m1793c(r10, r1)     // Catch: java.lang.Throwable -> L7d
        L8f:
            throw r10     // Catch: java.lang.Throwable -> L7d
        L90:
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
            goto L97
        L95:
            r9 = move-exception
            goto L90
        L97:
            if (r9 == 0) goto L9e
            z3.d r9 = r0.f967f
            r9.m4683e(r3)
        L9e:
            throw r10
        L9f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040K.C0319i.m713a(I.r, d3.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:18:0x011a, B:20:0x0122, B:24:0x013a, B:34:0x0146, B:31:0x0149, B:30:0x0141), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:18:0x011a, B:20:0x0122, B:24:0x013a, B:34:0x0146, B:31:0x0149, B:30:0x0141), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [K.i] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [K.h, java.lang.Object, d3.b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v9, types: [j3.p] */
    /* JADX WARN: Type inference failed for: r11v13, types: [z3.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, c3.a] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [B3.l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15, types: [z3.a] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m714b(p035I.C0264P r10, p120d3.AbstractC1292b r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p040K.C0319i.m714b(I.P, d3.b):java.lang.Object");
    }

    @Override // p035I.InterfaceC0274a
    public final void close() {
        this.f966e.f931a.set(true);
        this.f965d.mo501c();
    }
}
