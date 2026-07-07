package p195t3;

/* renamed from: t3.b */
/* loaded from: classes.dex */
public class C2189b implements p195t3.InterfaceC2193f {

    /* renamed from: n */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f8764n = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p195t3.C2189b.class, "sendersAndCloseStatus");

    /* renamed from: o */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f8765o = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p195t3.C2189b.class, "receivers");

    /* renamed from: p */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f8766p = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p195t3.C2189b.class, "bufferEnd");

    /* renamed from: q */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f8767q = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p195t3.C2189b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: r */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8768r = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p195t3.C2189b.class, java.lang.Object.class, "sendSegment");

    /* renamed from: s */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8769s = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p195t3.C2189b.class, java.lang.Object.class, "receiveSegment");

    /* renamed from: t */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8770t = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p195t3.C2189b.class, java.lang.Object.class, "bufferEndSegment");

    /* renamed from: u */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8771u = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p195t3.C2189b.class, java.lang.Object.class, "_closeCause");

    /* renamed from: v */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8772v = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p195t3.C2189b.class, java.lang.Object.class, "closeHandler");
    private volatile java.lang.Object _closeCause;
    private volatile long bufferEnd;
    private volatile java.lang.Object bufferEndSegment;
    private volatile java.lang.Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: l */
    public final int f8773l;

    /* renamed from: m */
    public final p149j3.InterfaceC1737l f8774m;
    private volatile java.lang.Object receiveSegment;
    private volatile long receivers;
    private volatile java.lang.Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public C2189b(int i4, p149j3.InterfaceC1737l interfaceC1737l) {
        this.f8773l = i4;
        this.f8774m = interfaceC1737l;
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m151j(i4, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        p195t3.C2197j c2197j = p195t3.AbstractC2191d.f8776a;
        this.bufferEnd = i4 != 0 ? i4 != Integer.MAX_VALUE ? i4 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f8766p.get(this);
        p195t3.C2197j c2197j2 = new p195t3.C2197j(0L, null, this, 3);
        this.sendSegment = c2197j2;
        this.receiveSegment = c2197j2;
        if (m4367u()) {
            c2197j2 = p195t3.AbstractC2191d.f8776a;
            p154k3.AbstractC1803h.m3777c(c2197j2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = c2197j2;
        this._closeCause = p195t3.AbstractC2191d.f8794s;
    }

    /* renamed from: a */
    public static final p195t3.C2197j m4343a(p195t3.C2189b c2189b, long j4, p195t3.C2197j c2197j) {
        java.lang.Object m4540c;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        long j6;
        c2189b.getClass();
        p195t3.C2197j c2197j2 = p195t3.AbstractC2191d.f8776a;
        p195t3.C2190c c2190c = p195t3.C2190c.f8775t;
        loop0: while (true) {
            m4540c = p209w3.AbstractC2339a.m4540c(c2197j, j4, c2190c);
            if (!p209w3.AbstractC2339a.m4543f(m4540c)) {
                p209w3.AbstractC2359u m4541d = p209w3.AbstractC2339a.m4541d(m4540c);
                while (true) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8768r;
                    p209w3.AbstractC2359u abstractC2359u = (p209w3.AbstractC2359u) atomicReferenceFieldUpdater.get(c2189b);
                    if (abstractC2359u.f9308n >= m4541d.f9308n) {
                        break loop0;
                    }
                    if (!m4541d.m4574i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2189b, abstractC2359u, m4541d)) {
                        if (atomicReferenceFieldUpdater.get(c2189b) != abstractC2359u) {
                            if (m4541d.m4572e()) {
                                m4541d.m4555d();
                            }
                        }
                    }
                    if (abstractC2359u.m4572e()) {
                        abstractC2359u.m4555d();
                    }
                }
            } else {
                break;
            }
        }
        boolean m4543f = p209w3.AbstractC2339a.m4543f(m4540c);
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8765o;
        if (m4543f) {
            c2189b.m4365s();
            if (c2197j.f9308n * p195t3.AbstractC2191d.f8777b >= atomicLongFieldUpdater2.get(c2189b)) {
                return null;
            }
            c2197j.m4552a();
            return null;
        }
        p195t3.C2197j c2197j3 = (p195t3.C2197j) p209w3.AbstractC2339a.m4541d(m4540c);
        long j7 = c2197j3.f9308n;
        if (j7 <= j4) {
            return c2197j3;
        }
        long j8 = p195t3.AbstractC2191d.f8777b * j7;
        do {
            atomicLongFieldUpdater = f8764n;
            j5 = atomicLongFieldUpdater.get(c2189b);
            j6 = 1152921504606846975L & j5;
            if (j6 >= j8) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(c2189b, j5, j6 + (((int) (j5 >> 60)) << 60)));
        if (j7 * p195t3.AbstractC2191d.f8777b >= atomicLongFieldUpdater2.get(c2189b)) {
            return null;
        }
        c2197j3.m4552a();
        return null;
    }

    /* renamed from: c */
    public static final void m4344c(p195t3.C2189b c2189b, java.lang.Object obj, p187r3.C2108f c2108f) {
        p149j3.InterfaceC1737l interfaceC1737l = c2189b.f8774m;
        if (interfaceC1737l != null) {
            p209w3.AbstractC2339a.m4538a(interfaceC1737l, obj, c2108f.f8471p);
        }
        c2108f.mo2836i(p176p1.AbstractC1949a.m3942s(c2189b.m4362o()));
    }

    /* renamed from: d */
    public static final int m4345d(p195t3.C2189b c2189b, p195t3.C2197j c2197j, int i4, java.lang.Object obj, long j4, java.lang.Object obj2, boolean z4) {
        c2189b.getClass();
        c2197j.m4380m(i4, obj);
        if (z4) {
            return c2189b.m4349B(c2197j, i4, obj, j4, obj2, z4);
        }
        java.lang.Object m4378k = c2197j.m4378k(i4);
        if (m4378k == null) {
            if (c2189b.m4353f(j4)) {
                if (c2197j.m4377j(i4, null, p195t3.AbstractC2191d.f8779d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c2197j.m4377j(i4, null, obj2)) {
                    return 2;
                }
            }
        } else if (m4378k instanceof p187r3.InterfaceC2121l0) {
            c2197j.m4380m(i4, null);
            if (c2189b.m4371y(m4378k, obj)) {
                c2197j.m4381n(i4, p195t3.AbstractC2191d.f8784i);
                return 0;
            }
            p124e2.C1358f c1358f = p195t3.AbstractC2191d.f8786k;
            if (c2197j.f8801q.getAndSet((i4 * 2) + 1, c1358f) != c1358f) {
                c2197j.m4379l(i4, true);
            }
            return 5;
        }
        return c2189b.m4349B(c2197j, i4, obj, j4, obj2, z4);
    }

    /* renamed from: q */
    public static void m4346q(p195t3.C2189b c2189b) {
        c2189b.getClass();
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f8767q;
        if ((atomicLongFieldUpdater.addAndGet(c2189b, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(c2189b) & 4611686018427387904L) != 0);
    }

    /* renamed from: z */
    public static boolean m4347z(java.lang.Object obj) {
        if (obj instanceof p187r3.InterfaceC2106e) {
            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return p195t3.AbstractC2191d.m4372a((p187r3.InterfaceC2106e) obj, p100Z2.C0934g.f3298a, null);
        }
        throw new java.lang.IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* renamed from: A */
    public final java.lang.Object m4348A(p195t3.C2197j c2197j, int i4, long j4, java.lang.Object obj) {
        java.lang.Object m4378k = c2197j.m4378k(i4);
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = c2197j.f8801q;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f8764n;
        if (m4378k == null) {
            if (j4 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return p195t3.AbstractC2191d.f8789n;
                }
                if (c2197j.m4377j(i4, m4378k, obj)) {
                    m4358k();
                    return p195t3.AbstractC2191d.f8788m;
                }
            }
        } else if (m4378k == p195t3.AbstractC2191d.f8779d && c2197j.m4377j(i4, m4378k, p195t3.AbstractC2191d.f8784i)) {
            m4358k();
            java.lang.Object obj2 = atomicReferenceArray.get(i4 * 2);
            c2197j.m4380m(i4, null);
            return obj2;
        }
        while (true) {
            java.lang.Object m4378k2 = c2197j.m4378k(i4);
            if (m4378k2 == null || m4378k2 == p195t3.AbstractC2191d.f8780e) {
                if (j4 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c2197j.m4377j(i4, m4378k2, p195t3.AbstractC2191d.f8783h)) {
                        m4358k();
                        return p195t3.AbstractC2191d.f8790o;
                    }
                } else {
                    if (obj == null) {
                        return p195t3.AbstractC2191d.f8789n;
                    }
                    if (c2197j.m4377j(i4, m4378k2, obj)) {
                        m4358k();
                        return p195t3.AbstractC2191d.f8788m;
                    }
                }
            } else {
                if (m4378k2 != p195t3.AbstractC2191d.f8779d) {
                    p124e2.C1358f c1358f = p195t3.AbstractC2191d.f8785j;
                    if (m4378k2 != c1358f && m4378k2 != p195t3.AbstractC2191d.f8783h) {
                        if (m4378k2 == p195t3.AbstractC2191d.f8787l) {
                            m4358k();
                            return p195t3.AbstractC2191d.f8790o;
                        }
                        if (m4378k2 != p195t3.AbstractC2191d.f8782g && c2197j.m4377j(i4, m4378k2, p195t3.AbstractC2191d.f8781f)) {
                            boolean z4 = m4378k2 instanceof p195t3.C2205r;
                            if (z4) {
                                m4378k2 = ((p195t3.C2205r) m4378k2).f8807a;
                            }
                            if (m4347z(m4378k2)) {
                                c2197j.m4381n(i4, p195t3.AbstractC2191d.f8784i);
                                m4358k();
                                java.lang.Object obj3 = atomicReferenceArray.get(i4 * 2);
                                c2197j.m4380m(i4, null);
                                return obj3;
                            }
                            c2197j.m4381n(i4, c1358f);
                            c2197j.m4573h();
                            if (z4) {
                                m4358k();
                            }
                            return p195t3.AbstractC2191d.f8790o;
                        }
                    }
                    return p195t3.AbstractC2191d.f8790o;
                }
                if (c2197j.m4377j(i4, m4378k2, p195t3.AbstractC2191d.f8784i)) {
                    m4358k();
                    java.lang.Object obj4 = atomicReferenceArray.get(i4 * 2);
                    c2197j.m4380m(i4, null);
                    return obj4;
                }
            }
        }
    }

    /* renamed from: B */
    public final int m4349B(p195t3.C2197j c2197j, int i4, java.lang.Object obj, long j4, java.lang.Object obj2, boolean z4) {
        while (true) {
            java.lang.Object m4378k = c2197j.m4378k(i4);
            if (m4378k == null) {
                if (!m4353f(j4) || z4) {
                    if (z4) {
                        if (c2197j.m4377j(i4, null, p195t3.AbstractC2191d.f8785j)) {
                            c2197j.m4573h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c2197j.m4377j(i4, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c2197j.m4377j(i4, null, p195t3.AbstractC2191d.f8779d)) {
                    return 1;
                }
            } else {
                if (m4378k != p195t3.AbstractC2191d.f8780e) {
                    p124e2.C1358f c1358f = p195t3.AbstractC2191d.f8786k;
                    if (m4378k == c1358f) {
                        c2197j.m4380m(i4, null);
                        return 5;
                    }
                    if (m4378k == p195t3.AbstractC2191d.f8783h) {
                        c2197j.m4380m(i4, null);
                        return 5;
                    }
                    if (m4378k == p195t3.AbstractC2191d.f8787l) {
                        c2197j.m4380m(i4, null);
                        m4365s();
                        return 4;
                    }
                    c2197j.m4380m(i4, null);
                    if (m4378k instanceof p195t3.C2205r) {
                        m4378k = ((p195t3.C2205r) m4378k).f8807a;
                    }
                    if (m4371y(m4378k, obj)) {
                        c2197j.m4381n(i4, p195t3.AbstractC2191d.f8784i);
                        return 0;
                    }
                    if (c2197j.f8801q.getAndSet((i4 * 2) + 1, c1358f) == c1358f) {
                        return 5;
                    }
                    c2197j.m4379l(i4, true);
                    return 5;
                }
                if (c2197j.m4377j(i4, m4378k, p195t3.AbstractC2191d.f8779d)) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: C */
    public final void m4350C(long j4) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        long j6;
        if (m4367u()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f8766p;
        } while (atomicLongFieldUpdater.get(this) <= j4);
        int i4 = p195t3.AbstractC2191d.f8778c;
        int i5 = 0;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8767q;
            if (i5 >= i4) {
                do {
                    j5 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, 4611686018427387904L + (j5 & 4611686018427387903L)));
                while (true) {
                    long j7 = atomicLongFieldUpdater.get(this);
                    long j8 = atomicLongFieldUpdater2.get(this);
                    long j9 = j8 & 4611686018427387903L;
                    boolean z4 = (j8 & 4611686018427387904L) != 0;
                    if (j7 == j9 && j7 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z4) {
                        atomicLongFieldUpdater2.compareAndSet(this, j8, j9 + 4611686018427387904L);
                    }
                }
                do {
                    j6 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j6, j6 & 4611686018427387903L));
                return;
            }
            long j10 = atomicLongFieldUpdater.get(this);
            if (j10 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j10 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // p195t3.InterfaceC2203p
    /* renamed from: b */
    public final void mo4351b(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new java.util.concurrent.CancellationException("Channel was cancelled");
        }
        m4355h(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        m4344c(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c8, code lost:
    
        r2.m4222B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.m4552a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r2 = r27;
        r1 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [r3.f] */
    @Override // p195t3.InterfaceC2204q
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo4352e(p110b3.InterfaceC1190d r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p195t3.C2189b.mo4352e(b3.d, java.lang.Object):java.lang.Object");
    }

    /* renamed from: f */
    public final boolean m4353f(long j4) {
        return j4 < f8766p.get(this) || j4 < f8765o.get(this) + ((long) this.f8773l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // p195t3.InterfaceC2204q
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo4354g(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p195t3.C2189b.mo4354g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3 = p195t3.AbstractC2191d.f8794s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = p195t3.C2189b.f8771u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r4.compareAndSet(r13, r3, r14) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r4.get(r13) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r15 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r9.compareAndSet(r13, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        m4365s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r11 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r14 = p195t3.C2189b.f8772v;
        r15 = r14.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r15 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = p195t3.AbstractC2191d.f8792q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r14.compareAndSet(r13, r15, r0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r15 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r14.get(r13) == r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r15 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        p154k3.AbstractC1814s.m3789a(1, r15);
        ((p149j3.InterfaceC1737l) r15).mo661b(m4360m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r0 = p195t3.AbstractC2191d.f8793r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r5 = r9.get(r13);
        r14 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r14 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r14 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        if (r9.compareAndSet(r13, r5, (r3 << 60) + r14) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0061, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002e, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r7 = p195t3.AbstractC2191d.f8776a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r9.compareAndSet(r13, r5, (1 << 60) + (r5 & 1152921504606846975L)) == false) goto L46;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4355h(java.lang.Throwable r14, boolean r15) {
        /*
            r13 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = p195t3.C2189b.f8764n
            r10 = 1
            if (r15 == 0) goto L24
        Lc:
            long r5 = r9.get(r13)
            long r3 = r5 >> r0
            int r3 = (int) r3
            if (r3 != 0) goto L24
            long r3 = r5 & r1
            t3.j r7 = p195t3.AbstractC2191d.f8776a
            long r7 = (long) r10
            long r7 = r7 << r0
            long r7 = r7 + r3
            r3 = r9
            r4 = r13
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto Lc
        L24:
            e2.f r3 = p195t3.AbstractC2191d.f8794s
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p195t3.C2189b.f8771u
            boolean r5 = r4.compareAndSet(r13, r3, r14)
            if (r5 == 0) goto L30
            r11 = r10
            goto L38
        L30:
            java.lang.Object r4 = r4.get(r13)
            if (r4 == r3) goto L26
            r14 = 0
            r11 = r14
        L38:
            r12 = 3
            if (r15 == 0) goto L4e
        L3b:
            long r5 = r9.get(r13)
            long r14 = r5 & r1
            long r3 = (long) r12
            long r3 = r3 << r0
            long r7 = r3 + r14
            r3 = r9
            r4 = r13
            boolean r14 = r3.compareAndSet(r4, r5, r7)
            if (r14 == 0) goto L3b
            goto L6e
        L4e:
            long r5 = r9.get(r13)
            long r14 = r5 >> r0
            int r14 = (int) r14
            if (r14 == 0) goto L61
            if (r14 == r10) goto L5a
            goto L6e
        L5a:
            long r14 = r5 & r1
            long r3 = (long) r12
        L5d:
            long r3 = r3 << r0
            long r3 = r3 + r14
            r7 = r3
            goto L66
        L61:
            long r14 = r5 & r1
            r3 = 2
            long r3 = (long) r3
            goto L5d
        L66:
            r3 = r9
            r4 = r13
            boolean r14 = r3.compareAndSet(r4, r5, r7)
            if (r14 == 0) goto L4e
        L6e:
            r13.m4365s()
            if (r11 == 0) goto L9d
        L73:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = p195t3.C2189b.f8772v
            java.lang.Object r15 = r14.get(r13)
            if (r15 != 0) goto L7e
            e2.f r0 = p195t3.AbstractC2191d.f8792q
            goto L80
        L7e:
            e2.f r0 = p195t3.AbstractC2191d.f8793r
        L80:
            boolean r1 = r14.compareAndSet(r13, r15, r0)
            if (r1 == 0) goto L96
            if (r15 != 0) goto L89
            goto L9d
        L89:
            p154k3.AbstractC1814s.m3789a(r10, r15)
            j3.l r15 = (p149j3.InterfaceC1737l) r15
            java.lang.Throwable r14 = r13.m4360m()
            r15.mo661b(r14)
            goto L9d
        L96:
            java.lang.Object r1 = r14.get(r13)
            if (r1 == r15) goto L80
            goto L73
        L9d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p195t3.C2189b.m4355h(java.lang.Throwable, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (p195t3.C2197j) ((p209w3.AbstractC2342d) p209w3.AbstractC2342d.f9275m.get(r1));
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p195t3.C2197j m4356i(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p195t3.C2189b.m4356i(long):t3.j");
    }

    /* renamed from: j */
    public final void m4357j(long j4) {
        p037I1.C0307a m4539b;
        p195t3.C2197j c2197j = (p195t3.C2197j) f8769s.get(this);
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f8765o;
            long j5 = atomicLongFieldUpdater.get(this);
            if (j4 < java.lang.Math.max(this.f8773l + j5, f8766p.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j5, j5 + 1)) {
                long j6 = p195t3.AbstractC2191d.f8777b;
                long j7 = j5 / j6;
                int i4 = (int) (j5 % j6);
                if (c2197j.f9308n != j7) {
                    p195t3.C2197j m4359l = m4359l(j7, c2197j);
                    if (m4359l == null) {
                        continue;
                    } else {
                        c2197j = m4359l;
                    }
                }
                java.lang.Object m4348A = m4348A(c2197j, i4, j5, null);
                if (m4348A != p195t3.AbstractC2191d.f8790o) {
                    c2197j.m4552a();
                    p149j3.InterfaceC1737l interfaceC1737l = this.f8774m;
                    if (interfaceC1737l != null && (m4539b = p209w3.AbstractC2339a.m4539b(interfaceC1737l, m4348A, null)) != null) {
                        throw m4539b;
                    }
                } else if (j5 < m4363p()) {
                    c2197j.m4552a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00c4, code lost:
    
        if ((r0.addAndGet(r16, r14 - r9) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00cd, code lost:
    
        if ((r0.get(r16) & 4611686018427387904L) == 0) goto L144;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4358k() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p195t3.C2189b.m4358k():void");
    }

    /* renamed from: l */
    public final p195t3.C2197j m4359l(long j4, p195t3.C2197j c2197j) {
        java.lang.Object m4540c;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        p195t3.C2197j c2197j2 = p195t3.AbstractC2191d.f8776a;
        p195t3.C2190c c2190c = p195t3.C2190c.f8775t;
        loop0: while (true) {
            m4540c = p209w3.AbstractC2339a.m4540c(c2197j, j4, c2190c);
            if (!p209w3.AbstractC2339a.m4543f(m4540c)) {
                p209w3.AbstractC2359u m4541d = p209w3.AbstractC2339a.m4541d(m4540c);
                while (true) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8769s;
                    p209w3.AbstractC2359u abstractC2359u = (p209w3.AbstractC2359u) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2359u.f9308n >= m4541d.f9308n) {
                        break loop0;
                    }
                    if (!m4541d.m4574i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2359u, m4541d)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC2359u) {
                            if (m4541d.m4572e()) {
                                m4541d.m4555d();
                            }
                        }
                    }
                    if (abstractC2359u.m4572e()) {
                        abstractC2359u.m4555d();
                    }
                }
            } else {
                break;
            }
        }
        if (p209w3.AbstractC2339a.m4543f(m4540c)) {
            m4365s();
            if (c2197j.f9308n * p195t3.AbstractC2191d.f8777b >= m4363p()) {
                return null;
            }
            c2197j.m4552a();
            return null;
        }
        p195t3.C2197j c2197j3 = (p195t3.C2197j) p209w3.AbstractC2339a.m4541d(m4540c);
        boolean m4367u = m4367u();
        long j6 = c2197j3.f9308n;
        if (!m4367u && j4 <= f8766p.get(this) / p195t3.AbstractC2191d.f8777b) {
            while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8770t;
                p209w3.AbstractC2359u abstractC2359u2 = (p209w3.AbstractC2359u) atomicReferenceFieldUpdater2.get(this);
                if (abstractC2359u2.f9308n >= j6) {
                    break;
                }
                if (!c2197j3.m4574i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC2359u2, c2197j3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != abstractC2359u2) {
                        if (c2197j3.m4572e()) {
                            c2197j3.m4555d();
                        }
                    }
                }
                if (abstractC2359u2.m4572e()) {
                    abstractC2359u2.m4555d();
                }
            }
        }
        if (j6 <= j4) {
            return c2197j3;
        }
        long j7 = p195t3.AbstractC2191d.f8777b * j6;
        do {
            atomicLongFieldUpdater = f8765o;
            j5 = atomicLongFieldUpdater.get(this);
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, j7));
        if (j6 * p195t3.AbstractC2191d.f8777b >= m4363p()) {
            return null;
        }
        c2197j3.m4552a();
        return null;
    }

    /* renamed from: m */
    public final java.lang.Throwable m4360m() {
        return (java.lang.Throwable) f8771u.get(this);
    }

    /* renamed from: n */
    public final java.lang.Throwable m4361n() {
        java.lang.Throwable m4360m = m4360m();
        return m4360m == null ? new java.util.NoSuchElementException("Channel was closed") : m4360m;
    }

    /* renamed from: o */
    public final java.lang.Throwable m4362o() {
        java.lang.Throwable m4360m = m4360m();
        return m4360m == null ? new java.lang.IllegalStateException("Channel was closed") : m4360m;
    }

    /* renamed from: p */
    public final long m4363p() {
        return f8764n.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (p195t3.C2197j) ((p209w3.AbstractC2342d) p209w3.AbstractC2342d.f9275m.get(r0));
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4364r(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p195t3.C2189b.m4364r(long, boolean):boolean");
    }

    /* renamed from: s */
    public final boolean m4365s() {
        return m4364r(f8764n.get(this), false);
    }

    /* renamed from: t */
    public boolean mo4366t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (p195t3.C2197j) r3.m4553b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a1, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p195t3.C2189b.toString():java.lang.String");
    }

    /* renamed from: u */
    public final boolean m4367u() {
        long j4 = f8766p.get(this);
        return j4 == 0 || j4 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4368v(long r5, p195t3.C2197j r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f9308n
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            w3.d r0 = r7.m4553b()
            t3.j r0 = (p195t3.C2197j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo4554c()
            if (r5 == 0) goto L22
            w3.d r5 = r7.m4553b()
            t3.j r5 = (p195t3.C2197j) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p195t3.C2189b.f8770t
            java.lang.Object r6 = r5.get(r4)
            w3.u r6 = (p209w3.AbstractC2359u) r6
            long r0 = r6.f9308n
            long r2 = r7.f9308n
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.m4574i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m4572e()
            if (r5 == 0) goto L49
            r6.m4555d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.m4572e()
            if (r5 == 0) goto L22
            r7.m4555d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p195t3.C2189b.m4368v(long, t3.j):void");
    }

    /* renamed from: w */
    public final java.lang.Object m4369w(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p037I1.C0307a m4539b;
        p187r3.C2108f c2108f = new p187r3.C2108f(1, p176p1.AbstractC1949a.m3902C(interfaceC1190d));
        c2108f.m4232v();
        p149j3.InterfaceC1737l interfaceC1737l = this.f8774m;
        if (interfaceC1737l == null || (m4539b = p209w3.AbstractC2339a.m4539b(interfaceC1737l, obj, null)) == null) {
            c2108f.mo2836i(p176p1.AbstractC1949a.m3942s(m4362o()));
        } else {
            p101a.AbstractC0936a.m1793c(m4539b, m4362o());
            c2108f.mo2836i(p176p1.AbstractC1949a.m3942s(m4539b));
        }
        java.lang.Object m4231u = c2108f.m4231u();
        return m4231u == p115c3.EnumC1252a.f4880l ? m4231u : p100Z2.C0934g.f3298a;
    }

    /* renamed from: x */
    public final void m4370x(p187r3.InterfaceC2121l0 interfaceC2121l0, boolean z4) {
        if (interfaceC2121l0 instanceof p187r3.InterfaceC2106e) {
            ((p110b3.InterfaceC1190d) interfaceC2121l0).mo2836i(p176p1.AbstractC1949a.m3942s(z4 ? m4361n() : m4362o()));
            return;
        }
        if (!(interfaceC2121l0 instanceof p195t3.C2188a)) {
            throw new java.lang.IllegalStateException(("Unexpected waiter: " + interfaceC2121l0).toString());
        }
        p195t3.C2188a c2188a = (p195t3.C2188a) interfaceC2121l0;
        p187r3.C2108f c2108f = c2188a.f8762m;
        p154k3.AbstractC1803h.m3776b(c2108f);
        c2188a.f8762m = null;
        c2188a.f8761l = p195t3.AbstractC2191d.f8787l;
        java.lang.Throwable m4360m = c2188a.f8763n.m4360m();
        if (m4360m == null) {
            c2108f.mo2836i(java.lang.Boolean.FALSE);
        } else {
            c2108f.mo2836i(p176p1.AbstractC1949a.m3942s(m4360m));
        }
    }

    /* renamed from: y */
    public final boolean m4371y(java.lang.Object obj, java.lang.Object obj2) {
        if (!(obj instanceof p195t3.C2188a)) {
            if (!(obj instanceof p187r3.InterfaceC2106e)) {
                throw new java.lang.IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            p187r3.InterfaceC2106e interfaceC2106e = (p187r3.InterfaceC2106e) obj;
            p149j3.InterfaceC1737l interfaceC1737l = this.f8774m;
            return p195t3.AbstractC2191d.m4372a(interfaceC2106e, obj2, interfaceC1737l != null ? new p209w3.C2354p(interfaceC1737l, obj2, interfaceC2106e.mo2835f()) : null);
        }
        p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        p195t3.C2188a c2188a = (p195t3.C2188a) obj;
        p187r3.C2108f c2108f = c2188a.f8762m;
        p154k3.AbstractC1803h.m3776b(c2108f);
        c2188a.f8762m = null;
        c2188a.f8761l = obj2;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        p149j3.InterfaceC1737l interfaceC1737l2 = c2188a.f8763n.f8774m;
        return p195t3.AbstractC2191d.m4372a(c2108f, bool, interfaceC1737l2 != null ? new p209w3.C2354p(interfaceC1737l2, obj2, c2108f.f8471p) : null);
    }
}
