package p195t3;

/* renamed from: t3.j */
/* loaded from: classes.dex */
public final class C2197j extends p209w3.AbstractC2359u {

    /* renamed from: p */
    public final p195t3.C2189b f8800p;

    /* renamed from: q */
    public final java.util.concurrent.atomic.AtomicReferenceArray f8801q;

    public C2197j(long j4, p195t3.C2197j c2197j, p195t3.C2189b c2189b, int i4) {
        super(j4, c2197j, i4);
        this.f8800p = c2189b;
        this.f8801q = new java.util.concurrent.atomic.AtomicReferenceArray(p195t3.AbstractC2191d.f8777b * 2);
    }

    @Override // p209w3.AbstractC2359u
    /* renamed from: f */
    public final int mo4375f() {
        return p195t3.AbstractC2191d.f8777b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m4380m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        p154k3.AbstractC1803h.m3776b(r4);
        r7 = r4.f8774m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        p209w3.AbstractC2339a.m4538a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // p209w3.AbstractC2359u
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4376g(int r7, p110b3.InterfaceC1195i r8) {
        /*
            r6 = this;
            int r0 = p195t3.AbstractC2191d.f8777b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f8801q
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.m4378k(r7)
            boolean r3 = r2 instanceof p187r3.InterfaceC2121l0
            t3.b r4 = r6.f8800p
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof p195t3.C2205r
            if (r3 == 0) goto L22
            goto L6b
        L22:
            e2.f r3 = p195t3.AbstractC2191d.f8785j
            if (r2 == r3) goto L5b
            e2.f r3 = p195t3.AbstractC2191d.f8786k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            e2.f r3 = p195t3.AbstractC2191d.f8782g
            if (r2 == r3) goto L12
            e2.f r3 = p195t3.AbstractC2191d.f8781f
            if (r2 != r3) goto L34
            goto L12
        L34:
            e2.f r7 = p195t3.AbstractC2191d.f8784i
            if (r2 == r7) goto L5a
            e2.f r7 = p195t3.AbstractC2191d.f8779d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            e2.f r7 = p195t3.AbstractC2191d.f8787l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m4380m(r7, r5)
            if (r1 == 0) goto L6a
            p154k3.AbstractC1803h.m3776b(r4)
            j3.l r7 = r4.f8774m
            if (r7 == 0) goto L6a
            p209w3.AbstractC2339a.m4538a(r7, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            e2.f r3 = p195t3.AbstractC2191d.f8785j
            goto L72
        L70:
            e2.f r3 = p195t3.AbstractC2191d.f8786k
        L72:
            boolean r2 = r6.m4377j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m4380m(r7, r5)
            r2 = r1 ^ 1
            r6.m4379l(r7, r2)
            if (r1 == 0) goto L8c
            p154k3.AbstractC1803h.m3776b(r4)
            j3.l r7 = r4.f8774m
            if (r7 == 0) goto L8c
            p209w3.AbstractC2339a.m4538a(r7, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p195t3.C2197j.mo4376g(int, b3.i):void");
    }

    /* renamed from: j */
    public final boolean m4377j(int i4, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f8801q;
        int i5 = (i4 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i5, obj, obj2)) {
            if (atomicReferenceArray.get(i5) != obj) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final java.lang.Object m4378k(int i4) {
        return this.f8801q.get((i4 * 2) + 1);
    }

    /* renamed from: l */
    public final void m4379l(int i4, boolean z4) {
        if (z4) {
            p195t3.C2189b c2189b = this.f8800p;
            p154k3.AbstractC1803h.m3776b(c2189b);
            c2189b.m4350C((this.f9308n * p195t3.AbstractC2191d.f8777b) + i4);
        }
        m4573h();
    }

    /* renamed from: m */
    public final void m4380m(int i4, java.lang.Object obj) {
        this.f8801q.lazySet(i4 * 2, obj);
    }

    /* renamed from: n */
    public final void m4381n(int i4, p124e2.C1358f c1358f) {
        this.f8801q.set((i4 * 2) + 1, c1358f);
    }
}
