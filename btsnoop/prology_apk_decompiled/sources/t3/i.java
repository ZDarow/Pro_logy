package t3;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f8462a = new Object();

    public static b a(int i4, int i5, int i6) {
        b lVar;
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if (i4 != -2) {
            if (i4 == -1) {
                if (i5 == 1) {
                    return new l(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i4 != 0) {
                return i4 != Integer.MAX_VALUE ? i5 == 1 ? new b(i4, null) : new l(i4, i5, null) : new b(Integer.MAX_VALUE, null);
            }
            lVar = i5 == 1 ? new b(0, null) : new l(1, i5, null);
        } else if (i5 == 1) {
            f.f8460h.getClass();
            lVar = new b(e.f8459b, null);
        } else {
            lVar = new l(1, i5, null);
        }
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v2, types: [b3.d, t3.m, d3.b] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r5v5, types: [j3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(t3.o r4, L.b r5, d3.b r6) {
        /*
            boolean r0 = r6 instanceof t3.m
            if (r0 == 0) goto L13
            r0 = r6
            t3.m r0 = (t3.m) r0
            int r1 = r0.f8467q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8467q = r1
            goto L18
        L13:
            t3.m r0 = new t3.m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8466p
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.f8467q
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            j3.a r5 = r0.f8465o
            p1.AbstractC0462a.P(r6)     // Catch: java.lang.Throwable -> L29
            goto L65
        L29:
            r4 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            p1.AbstractC0462a.P(r6)
            b3.i r6 = r0.f4989m
            k3.h.b(r6)
            r3.t r2 = r3.C0532t.f8178m
            b3.g r6 = r6.j(r2)
            if (r6 != r4) goto L6f
            r0.f8465o = r5     // Catch: java.lang.Throwable -> L29
            r0.f8467q = r3     // Catch: java.lang.Throwable -> L29
            r3.f r6 = new r3.f     // Catch: java.lang.Throwable -> L29
            b3.d r0 = p1.AbstractC0462a.C(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.v()     // Catch: java.lang.Throwable -> L29
            I.L r0 = new I.L     // Catch: java.lang.Throwable -> L29
            r2 = 1
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L29
            t3.n r4 = (t3.n) r4     // Catch: java.lang.Throwable -> L29
            r4.X(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.u()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L65
            return r1
        L65:
            r5.c()
            Z2.g r4 = Z2.g.f3186a
            return r4
        L6b:
            r5.c()
            throw r4
        L6f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.i.b(t3.o, L.b, d3.b):java.lang.Object");
    }
}
