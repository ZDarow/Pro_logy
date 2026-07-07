package p209w3;

/* renamed from: w3.n */
/* loaded from: classes.dex */
public final class C2352n {

    /* renamed from: e */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9294e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p209w3.C2352n.class, java.lang.Object.class, "_next");

    /* renamed from: f */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f9295f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p209w3.C2352n.class, "_state");

    /* renamed from: g */
    public static final p124e2.C1358f f9296g = new p124e2.C1358f("REMOVE_FROZEN", 1);
    private volatile java.lang.Object _next;
    private volatile long _state;

    /* renamed from: a */
    public final int f9297a;

    /* renamed from: b */
    public final boolean f9298b;

    /* renamed from: c */
    public final int f9299c;

    /* renamed from: d */
    public final java.util.concurrent.atomic.AtomicReferenceArray f9300d;

    public C2352n(int i4, boolean z4) {
        this.f9297a = i4;
        this.f9298b = z4;
        int i5 = i4 - 1;
        this.f9299c = i5;
        this.f9300d = new java.util.concurrent.atomic.AtomicReferenceArray(i4);
        if (i5 > 1073741823) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if ((i4 & i5) != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m4565a(java.lang.Runnable r14) {
        /*
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = p209w3.C2352n.f9295f
            long r2 = r6.get(r13)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L19
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r14 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r14 == 0) goto L18
            r1 = 2
        L18:
            return r1
        L19:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r4 = r10 + 2
            int r11 = r13.f9299c
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L32
            return r1
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r13.f9300d
            boolean r4 = r13.f9298b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L51
            r4 = r10 & r11
            java.lang.Object r4 = r12.get(r4)
            if (r4 == 0) goto L51
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r13.f9297a
            if (r3 < r2) goto L50
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L0
        L50:
            return r1
        L51:
            int r0 = r10 + 1
            r0 = r0 & r5
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r0 = (long) r0
            long r0 = r0 << r9
            long r4 = r4 | r0
            r0 = r6
            r1 = r13
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = r10 & r11
            r12.set(r0, r14)
            r0 = r13
        L6b:
            long r1 = r6.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L94
            w3.n r0 = r0.m4567c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f9300d
            int r2 = r0.f9299c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof p209w3.C2351m
            if (r4 == 0) goto L91
            w3.m r3 = (p209w3.C2351m) r3
            int r3 = r3.f9293a
            if (r3 != r10) goto L91
            r1.set(r2, r14)
            goto L92
        L91:
            r0 = 0
        L92:
            if (r0 != 0) goto L6b
        L94:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p209w3.C2352n.m4565a(java.lang.Runnable):int");
    }

    /* renamed from: b */
    public final boolean m4566b() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        do {
            atomicLongFieldUpdater = f9295f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 2305843009213693952L | j4));
        return true;
    }

    /* renamed from: c */
    public final p209w3.C2352n m4567c() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        while (true) {
            atomicLongFieldUpdater = f9295f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                break;
            }
            long j5 = j4 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j5)) {
                j4 = j5;
                break;
            }
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9294e;
            p209w3.C2352n c2352n = (p209w3.C2352n) atomicReferenceFieldUpdater.get(this);
            if (c2352n != null) {
                return c2352n;
            }
            p209w3.C2352n c2352n2 = new p209w3.C2352n(this.f9297a * 2, this.f9298b);
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i6 = this.f9299c;
                int i7 = i4 & i6;
                if (i7 == (i6 & i5)) {
                    break;
                }
                java.lang.Object obj = this.f9300d.get(i7);
                if (obj == null) {
                    obj = new p209w3.C2351m(i4);
                }
                c2352n2.f9300d.set(c2352n2.f9299c & i4, obj);
                i4++;
            }
            atomicLongFieldUpdater.set(c2352n2, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2352n2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* renamed from: d */
    public final java.lang.Object m4568d() {
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f9295f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                return f9296g;
            }
            int i4 = (int) (j4 & 1073741823);
            int i5 = this.f9299c;
            int i6 = i4 & i5;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i5) == i6) {
                return null;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f9300d;
            java.lang.Object obj = atomicReferenceArray.get(i6);
            boolean z4 = this.f9298b;
            if (obj == null) {
                if (z4) {
                    return null;
                }
            } else {
                if (obj instanceof p209w3.C2351m) {
                    return null;
                }
                long j5 = (i4 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j4, (j4 & (-1073741824)) | j5)) {
                    atomicReferenceArray.set(i6, null);
                    return obj;
                }
                if (z4) {
                    p209w3.C2352n c2352n = this;
                    while (true) {
                        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f9295f;
                        long j6 = atomicLongFieldUpdater2.get(c2352n);
                        int i7 = (int) (j6 & 1073741823);
                        if ((j6 & 1152921504606846976L) != 0) {
                            c2352n = c2352n.m4567c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(c2352n, j6, (j6 & (-1073741824)) | j5)) {
                                c2352n.f9300d.set(c2352n.f9299c & i7, null);
                                c2352n = null;
                            } else {
                                continue;
                            }
                        }
                        if (c2352n == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
