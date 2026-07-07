package I;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final z3.d f802a = z3.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final B2.r f803b = new B2.r(10);

    /* renamed from: c, reason: collision with root package name */
    public final f2.Y f804c = new f2.Y((j3.p) new d3.g(2, null));

    /* JADX WARN: Type inference failed for: r3v3, types: [d3.g, j3.p] */
    public a0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f803b.f185m).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j3.l r8, d3.b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof I.X
            if (r0 == 0) goto L13
            r0 = r9
            I.X r0 = (I.X) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            I.X r0 = new I.X
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f796q
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.s
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f794o
            z3.a r8 = (z3.a) r8
            p1.AbstractC0462a.P(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            z3.d r8 = r0.f795p
            java.lang.Object r2 = r0.f794o
            j3.l r2 = (j3.l) r2
            p1.AbstractC0462a.P(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            p1.AbstractC0462a.P(r9)
            r0.f794o = r8
            z3.d r9 = r7.f802a
            r0.f795p = r9
            r0.s = r4
            java.lang.Object r2 = r9.c(r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r0.f794o = r9     // Catch: java.lang.Throwable -> L6d
            r0.f795p = r5     // Catch: java.lang.Throwable -> L6d
            r0.s = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.b(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L64
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            z3.d r8 = (z3.d) r8
            r8.e(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            z3.d r8 = (z3.d) r8
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I.a0.b(j3.l, d3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(j3.p r7, d3.b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof I.Y
            if (r0 == 0) goto L13
            r0 = r8
            I.Y r0 = (I.Y) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            I.Y r0 = new I.Y
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f800q
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f799p
            z3.d r0 = r0.f798o
            p1.AbstractC0462a.P(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            p1.AbstractC0462a.P(r8)
            z3.d r8 = r6.f802a
            boolean r2 = r8.d(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f798o = r8     // Catch: java.lang.Throwable -> L59
            r0.f799p = r2     // Catch: java.lang.Throwable -> L59
            r0.s = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.h(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.e(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.e(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I.a0.c(j3.p, d3.b):java.lang.Object");
    }
}
