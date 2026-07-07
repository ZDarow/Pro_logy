package t3;

import B2.AbstractC0007h;
import a.AbstractC0110a;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p1.AbstractC0462a;
import r3.C0519f;
import r3.InterfaceC0518e;
import r3.l0;
import w3.u;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8429n = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8430o = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8431p = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: q, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8432q = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8433r = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8434t = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8435u = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8436v = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: l, reason: collision with root package name */
    public final int f8437l;

    /* renamed from: m, reason: collision with root package name */
    public final j3.l f8438m;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i4, j3.l lVar) {
        this.f8437l = i4;
        this.f8438m = lVar;
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0007h.j(i4, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        j jVar = d.f8440a;
        this.bufferEnd = i4 != 0 ? i4 != Integer.MAX_VALUE ? i4 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f8431p.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f8440a;
            k3.h.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.s;
    }

    public static final j a(b bVar, long j4, j jVar) {
        Object c4;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        long j6;
        bVar.getClass();
        j jVar2 = d.f8440a;
        c cVar = c.f8439t;
        loop0: while (true) {
            c4 = w3.a.c(jVar, j4, cVar);
            if (!w3.a.f(c4)) {
                u d4 = w3.a.d(c4);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8433r;
                    u uVar = (u) atomicReferenceFieldUpdater.get(bVar);
                    if (uVar.f8949n >= d4.f8949n) {
                        break loop0;
                    }
                    if (!d4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, d4)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != uVar) {
                            if (d4.e()) {
                                d4.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean f4 = w3.a.f(c4);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8430o;
        if (f4) {
            bVar.s();
            if (jVar.f8949n * d.f8441b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) w3.a.d(c4);
        long j7 = jVar3.f8949n;
        if (j7 <= j4) {
            return jVar3;
        }
        long j8 = d.f8441b * j7;
        do {
            atomicLongFieldUpdater = f8429n;
            j5 = atomicLongFieldUpdater.get(bVar);
            j6 = 1152921504606846975L & j5;
            if (j6 >= j8) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j5, j6 + (((int) (j5 >> 60)) << 60)));
        if (j7 * d.f8441b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0519f c0519f) {
        j3.l lVar = bVar.f8438m;
        if (lVar != null) {
            w3.a.a(lVar, obj, c0519f.f8153p);
        }
        c0519f.i(AbstractC0462a.s(bVar.o()));
    }

    public static final int d(b bVar, j jVar, int i4, Object obj, long j4, Object obj2, boolean z4) {
        bVar.getClass();
        jVar.m(i4, obj);
        if (z4) {
            return bVar.B(jVar, i4, obj, j4, obj2, z4);
        }
        Object k4 = jVar.k(i4);
        if (k4 == null) {
            if (bVar.f(j4)) {
                if (jVar.j(i4, null, d.f8443d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(i4, null, obj2)) {
                    return 2;
                }
            }
        } else if (k4 instanceof l0) {
            jVar.m(i4, null);
            if (bVar.y(k4, obj)) {
                jVar.n(i4, d.f8448i);
                return 0;
            }
            e2.f fVar = d.f8450k;
            if (jVar.f8464q.getAndSet((i4 * 2) + 1, fVar) != fVar) {
                jVar.l(i4, true);
            }
            return 5;
        }
        return bVar.B(jVar, i4, obj, j4, obj2, z4);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8432q;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0518e) {
            k3.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0518e) obj, Z2.g.f3186a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(j jVar, int i4, long j4, Object obj) {
        Object k4 = jVar.k(i4);
        AtomicReferenceArray atomicReferenceArray = jVar.f8464q;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8429n;
        if (k4 == null) {
            if (j4 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f8453n;
                }
                if (jVar.j(i4, k4, obj)) {
                    k();
                    return d.f8452m;
                }
            }
        } else if (k4 == d.f8443d && jVar.j(i4, k4, d.f8448i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i4 * 2);
            jVar.m(i4, null);
            return obj2;
        }
        while (true) {
            Object k5 = jVar.k(i4);
            if (k5 == null || k5 == d.f8444e) {
                if (j4 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i4, k5, d.f8447h)) {
                        k();
                        return d.f8454o;
                    }
                } else {
                    if (obj == null) {
                        return d.f8453n;
                    }
                    if (jVar.j(i4, k5, obj)) {
                        k();
                        return d.f8452m;
                    }
                }
            } else {
                if (k5 != d.f8443d) {
                    e2.f fVar = d.f8449j;
                    if (k5 != fVar && k5 != d.f8447h) {
                        if (k5 == d.f8451l) {
                            k();
                            return d.f8454o;
                        }
                        if (k5 != d.f8446g && jVar.j(i4, k5, d.f8445f)) {
                            boolean z4 = k5 instanceof r;
                            if (z4) {
                                k5 = ((r) k5).f8469a;
                            }
                            if (z(k5)) {
                                jVar.n(i4, d.f8448i);
                                k();
                                Object obj3 = atomicReferenceArray.get(i4 * 2);
                                jVar.m(i4, null);
                                return obj3;
                            }
                            jVar.n(i4, fVar);
                            jVar.h();
                            if (z4) {
                                k();
                            }
                            return d.f8454o;
                        }
                    }
                    return d.f8454o;
                }
                if (jVar.j(i4, k5, d.f8448i)) {
                    k();
                    Object obj4 = atomicReferenceArray.get(i4 * 2);
                    jVar.m(i4, null);
                    return obj4;
                }
            }
        }
    }

    public final int B(j jVar, int i4, Object obj, long j4, Object obj2, boolean z4) {
        while (true) {
            Object k4 = jVar.k(i4);
            if (k4 == null) {
                if (!f(j4) || z4) {
                    if (z4) {
                        if (jVar.j(i4, null, d.f8449j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(i4, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i4, null, d.f8443d)) {
                    return 1;
                }
            } else {
                if (k4 != d.f8444e) {
                    e2.f fVar = d.f8450k;
                    if (k4 == fVar) {
                        jVar.m(i4, null);
                        return 5;
                    }
                    if (k4 == d.f8447h) {
                        jVar.m(i4, null);
                        return 5;
                    }
                    if (k4 == d.f8451l) {
                        jVar.m(i4, null);
                        s();
                        return 4;
                    }
                    jVar.m(i4, null);
                    if (k4 instanceof r) {
                        k4 = ((r) k4).f8469a;
                    }
                    if (y(k4, obj)) {
                        jVar.n(i4, d.f8448i);
                        return 0;
                    }
                    if (jVar.f8464q.getAndSet((i4 * 2) + 1, fVar) == fVar) {
                        return 5;
                    }
                    jVar.l(i4, true);
                    return 5;
                }
                if (jVar.j(i4, k4, d.f8443d)) {
                    return 1;
                }
            }
        }
    }

    public final void C(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        long j6;
        if (u()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f8431p;
        } while (atomicLongFieldUpdater.get(this) <= j4);
        int i4 = d.f8442c;
        int i5 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8432q;
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

    @Override // t3.p
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        c(r26, r28, r5);
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
    
        r2.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.a();
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
    @Override // t3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(b3.InterfaceC0190d r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.e(b3.d, java.lang.Object):java.lang.Object");
    }

    public final boolean f(long j4) {
        return j4 < f8431p.get(this) || j4 < f8430o.get(this) + ((long) this.f8437l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // t3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3 = t3.d.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = t3.b.f8435u;
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
    
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r11 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r14 = t3.b.f8436v;
        r15 = r14.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r15 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = t3.d.f8456q;
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
    
        k3.s.a(1, r15);
        ((j3.l) r15).b(m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r0 = t3.d.f8457r;
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
    
        r7 = t3.d.f8440a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r9.compareAndSet(r13, r5, (1 << 60) + (r5 & 1152921504606846975L)) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(java.lang.Throwable r14, boolean r15) {
        /*
            r13 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = t3.b.f8429n
            r10 = 1
            if (r15 == 0) goto L24
        Lc:
            long r5 = r9.get(r13)
            long r3 = r5 >> r0
            int r3 = (int) r3
            if (r3 != 0) goto L24
            long r3 = r5 & r1
            t3.j r7 = t3.d.f8440a
            long r7 = (long) r10
            long r7 = r7 << r0
            long r7 = r7 + r3
            r3 = r9
            r4 = r13
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto Lc
        L24:
            e2.f r3 = t3.d.s
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = t3.b.f8435u
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
            r13.s()
            if (r11 == 0) goto L9d
        L73:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = t3.b.f8436v
            java.lang.Object r15 = r14.get(r13)
            if (r15 != 0) goto L7e
            e2.f r0 = t3.d.f8456q
            goto L80
        L7e:
            e2.f r0 = t3.d.f8457r
        L80:
            boolean r1 = r14.compareAndSet(r13, r15, r0)
            if (r1 == 0) goto L96
            if (r15 != 0) goto L89
            goto L9d
        L89:
            k3.s.a(r10, r15)
            j3.l r15 = (j3.l) r15
            java.lang.Throwable r14 = r13.m()
            r15.b(r14)
            goto L9d
        L96:
            java.lang.Object r1 = r14.get(r13)
            if (r1 == r15) goto L80
            goto L73
        L9d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.h(java.lang.Throwable, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (t3.j) ((w3.d) w3.d.f8917m.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t3.j i(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.i(long):t3.j");
    }

    public final void j(long j4) {
        I1.a b4;
        j jVar = (j) s.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8430o;
            long j5 = atomicLongFieldUpdater.get(this);
            if (j4 < Math.max(this.f8437l + j5, f8431p.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j5, j5 + 1)) {
                long j6 = d.f8441b;
                long j7 = j5 / j6;
                int i4 = (int) (j5 % j6);
                if (jVar.f8949n != j7) {
                    j l4 = l(j7, jVar);
                    if (l4 == null) {
                        continue;
                    } else {
                        jVar = l4;
                    }
                }
                Object A4 = A(jVar, i4, j5, null);
                if (A4 != d.f8454o) {
                    jVar.a();
                    j3.l lVar = this.f8438m;
                    if (lVar != null && (b4 = w3.a.b(lVar, A4, null)) != null) {
                        throw b4;
                    }
                } else if (j5 < p()) {
                    jVar.a();
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.k():void");
    }

    public final j l(long j4, j jVar) {
        Object c4;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        j jVar2 = d.f8440a;
        c cVar = c.f8439t;
        loop0: while (true) {
            c4 = w3.a.c(jVar, j4, cVar);
            if (!w3.a.f(c4)) {
                u d4 = w3.a.d(c4);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f8949n >= d4.f8949n) {
                        break loop0;
                    }
                    if (!d4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d4)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (d4.e()) {
                                d4.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (w3.a.f(c4)) {
            s();
            if (jVar.f8949n * d.f8441b >= p()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) w3.a.d(c4);
        boolean u4 = u();
        long j6 = jVar3.f8949n;
        if (!u4 && j4 <= f8431p.get(this) / d.f8441b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8434t;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f8949n >= j6) {
                    break;
                }
                if (!jVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (jVar3.e()) {
                            jVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j6 <= j4) {
            return jVar3;
        }
        long j7 = d.f8441b * j6;
        do {
            atomicLongFieldUpdater = f8430o;
            j5 = atomicLongFieldUpdater.get(this);
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, j7));
        if (j6 * d.f8441b >= p()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable m() {
        return (Throwable) f8435u.get(this);
    }

    public final Throwable n() {
        Throwable m4 = m();
        return m4 == null ? new NoSuchElementException("Channel was closed") : m4;
    }

    public final Throwable o() {
        Throwable m4 = m();
        return m4 == null ? new IllegalStateException("Channel was closed") : m4;
    }

    public final long p() {
        return f8429n.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (t3.j) ((w3.d) w3.d.f8917m.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.r(long, boolean):boolean");
    }

    public final boolean s() {
        return r(f8429n.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (t3.j) r3.b();
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
        throw new UnsupportedOperationException("Method not decompiled: t3.b.toString():java.lang.String");
    }

    public final boolean u() {
        long j4 = f8431p.get(this);
        return j4 == 0 || j4 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(long r5, t3.j r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f8949n
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            w3.d r0 = r7.b()
            t3.j r0 = (t3.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            w3.d r5 = r7.b()
            t3.j r5 = (t3.j) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = t3.b.f8434t
            java.lang.Object r6 = r5.get(r4)
            w3.u r6 = (w3.u) r6
            long r0 = r6.f8949n
            long r2 = r7.f8949n
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.v(long, t3.j):void");
    }

    public final Object w(InterfaceC0190d interfaceC0190d, Object obj) {
        I1.a b4;
        C0519f c0519f = new C0519f(1, AbstractC0462a.C(interfaceC0190d));
        c0519f.v();
        j3.l lVar = this.f8438m;
        if (lVar == null || (b4 = w3.a.b(lVar, obj, null)) == null) {
            c0519f.i(AbstractC0462a.s(o()));
        } else {
            AbstractC0110a.c(b4, o());
            c0519f.i(AbstractC0462a.s(b4));
        }
        Object u4 = c0519f.u();
        return u4 == EnumC0225a.f4710l ? u4 : Z2.g.f3186a;
    }

    public final void x(l0 l0Var, boolean z4) {
        if (l0Var instanceof InterfaceC0518e) {
            ((InterfaceC0190d) l0Var).i(AbstractC0462a.s(z4 ? n() : o()));
            return;
        }
        if (!(l0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
        a aVar = (a) l0Var;
        C0519f c0519f = aVar.f8427m;
        k3.h.b(c0519f);
        aVar.f8427m = null;
        aVar.f8426l = d.f8451l;
        Throwable m4 = aVar.f8428n.m();
        if (m4 == null) {
            c0519f.i(Boolean.FALSE);
        } else {
            c0519f.i(AbstractC0462a.s(m4));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0518e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            k3.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0518e interfaceC0518e = (InterfaceC0518e) obj;
            j3.l lVar = this.f8438m;
            return d.a(interfaceC0518e, obj2, lVar != null ? new w3.p(lVar, obj2, interfaceC0518e.f()) : null);
        }
        k3.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0519f c0519f = aVar.f8427m;
        k3.h.b(c0519f);
        aVar.f8427m = null;
        aVar.f8426l = obj2;
        Boolean bool = Boolean.TRUE;
        j3.l lVar2 = aVar.f8428n.f8438m;
        return d.a(c0519f, bool, lVar2 != null ? new w3.p(lVar2, obj2, c0519f.f8153p) : null);
    }
}
