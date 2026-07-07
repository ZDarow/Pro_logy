package p218y3;

/* renamed from: y3.b */
/* loaded from: classes.dex */
public final class ExecutorC2419b implements java.util.concurrent.Executor, java.io.Closeable {

    /* renamed from: s */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f9517s = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p218y3.ExecutorC2419b.class, "parkedWorkersStack");

    /* renamed from: t */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f9518t = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p218y3.ExecutorC2419b.class, "controlState");

    /* renamed from: u */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9519u = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p218y3.ExecutorC2419b.class, "_isTerminated");

    /* renamed from: v */
    public static final p124e2.C1358f f9520v = new p124e2.C1358f("NOT_IN_STACK", 1);
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: l */
    public final int f9521l;

    /* renamed from: m */
    public final int f9522m;

    /* renamed from: n */
    public final long f9523n;

    /* renamed from: o */
    public final java.lang.String f9524o;

    /* renamed from: p */
    public final p218y3.C2422e f9525p;
    private volatile long parkedWorkersStack;

    /* renamed from: q */
    public final p218y3.C2422e f9526q;

    /* renamed from: r */
    public final p209w3.C2357s f9527r;

    /* JADX WARN: Type inference failed for: r4v10, types: [y3.e, w3.l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [y3.e, w3.l] */
    public ExecutorC2419b(int i4, int i5, long j4, java.lang.String str) {
        this.f9521l = i4;
        this.f9522m = i5;
        this.f9523n = j4;
        this.f9524o = str;
        if (i4 < 1) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m151j(i4, "Core pool size ", " should be at least 1").toString());
        }
        if (i5 < i4) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m150i(i5, i4, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i5 > 2097150) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m151j(i5, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new java.lang.IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f9525p = new p209w3.C2350l();
        this.f9526q = new p209w3.C2350l();
        this.f9527r = new p209w3.C2357s((i4 + 1) * 2);
        this.controlState = i4 << 42;
        this._isTerminated = 0;
    }

    /* renamed from: a */
    public final int m4665a() {
        synchronized (this.f9527r) {
            try {
                if (f9519u.get(this) != 0) {
                    return -1;
                }
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f9518t;
                long j4 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j4 & 2097151);
                int i5 = i4 - ((int) ((j4 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f9521l) {
                    return 0;
                }
                if (i4 >= this.f9522m) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f9527r.m4570b(i6) != null) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                p218y3.C2418a c2418a = new p218y3.C2418a(this, i6);
                this.f9527r.m4571c(i6, c2418a);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                int i7 = i5 + 1;
                c2418a.start();
                return i7;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m4666b(java.lang.Runnable runnable, p009B2.C0032C c0032c, boolean z4) {
        p218y3.AbstractRunnableC2425h c2426i;
        int i4;
        p218y3.AbstractC2427j.f9541f.getClass();
        long nanoTime = java.lang.System.nanoTime();
        if (runnable instanceof p218y3.AbstractRunnableC2425h) {
            c2426i = (p218y3.AbstractRunnableC2425h) runnable;
            c2426i.f9533l = nanoTime;
            c2426i.f9534m = c0032c;
        } else {
            c2426i = new p218y3.C2426i(runnable, nanoTime, c0032c);
        }
        boolean z5 = false;
        boolean z6 = c2426i.f9534m.f117a == 1;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f9518t;
        long addAndGet = z6 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        p218y3.C2418a c2418a = currentThread instanceof p218y3.C2418a ? (p218y3.C2418a) currentThread : null;
        if (c2418a == null || !p154k3.AbstractC1803h.m3775a(c2418a.f9516s, this)) {
            c2418a = null;
        }
        if (c2418a != null && (i4 = c2418a.f9511n) != 5 && (c2426i.f9534m.f117a != 0 || i4 != 2)) {
            c2418a.f9515r = true;
            p218y3.C2429l c2429l = c2418a.f9509l;
            if (z4) {
                c2426i = c2429l.m4670a(c2426i);
            } else {
                c2429l.getClass();
                p218y3.AbstractRunnableC2425h abstractRunnableC2425h = (p218y3.AbstractRunnableC2425h) p218y3.C2429l.f9545b.getAndSet(c2429l, c2426i);
                c2426i = abstractRunnableC2425h == null ? null : c2429l.m4670a(abstractRunnableC2425h);
            }
        }
        if (c2426i != null) {
            if (!(c2426i.f9534m.f117a == 1 ? this.f9526q.m4561a(c2426i) : this.f9525p.m4561a(c2426i))) {
                throw new java.util.concurrent.RejectedExecutionException(p009B2.AbstractC0051h.m154m(new java.lang.StringBuilder(), this.f9524o, " was terminated"));
            }
        }
        if (z4 && c2418a != null) {
            z5 = true;
        }
        if (z6) {
            if (z5 || m4669f() || m4668e(addAndGet)) {
                return;
            }
            m4669f();
            return;
        }
        if (z5 || m4669f() || m4668e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m4669f();
    }

    /* renamed from: c */
    public final void m4667c(p218y3.C2418a c2418a, int i4, int i5) {
        while (true) {
            long j4 = f9517s.get(this);
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (i6 == i4) {
                if (i5 == 0) {
                    java.lang.Object m4658c = c2418a.m4658c();
                    while (true) {
                        if (m4658c == f9520v) {
                            i6 = -1;
                            break;
                        }
                        if (m4658c == null) {
                            i6 = 0;
                            break;
                        }
                        p218y3.C2418a c2418a2 = (p218y3.C2418a) m4658c;
                        int m4657b = c2418a2.m4657b();
                        if (m4657b != 0) {
                            i6 = m4657b;
                            break;
                        }
                        m4658c = c2418a2.m4658c();
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (f9517s.compareAndSet(this, j4, i6 | j5)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p218y3.ExecutorC2419b.f9519u
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p218y3.C2418a
            r3 = 0
            if (r1 == 0) goto L18
            y3.a r0 = (p218y3.C2418a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            y3.b r1 = r0.f9516s
            boolean r1 = p154k3.AbstractC1803h.m3775a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            w3.s r1 = r8.f9527r
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p218y3.ExecutorC2419b.f9518t     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L77
            r1 = r2
        L37:
            w3.s r5 = r8.f9527r
            java.lang.Object r5 = r5.m4570b(r1)
            p154k3.AbstractC1803h.m3776b(r5)
            y3.a r5 = (p218y3.C2418a) r5
            if (r5 == r0) goto L72
        L44:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L53:
            y3.l r5 = r5.f9509l
            y3.e r6 = r8.f9526q
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p218y3.C2429l.f9545b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            y3.h r7 = (p218y3.AbstractRunnableC2425h) r7
            if (r7 == 0) goto L67
            r6.m4561a(r7)
        L67:
            y3.h r7 = r5.m4671b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.m4561a(r7)
            goto L67
        L72:
            if (r1 == r4) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            y3.e r1 = r8.f9526q
            r1.m4562b()
            y3.e r1 = r8.f9525p
            r1.m4562b()
        L81:
            if (r0 == 0) goto L89
            y3.h r1 = r0.m4656a(r2)
            if (r1 != 0) goto Lb0
        L89:
            y3.e r1 = r8.f9525p
            java.lang.Object r1 = r1.m4564d()
            y3.h r1 = (p218y3.AbstractRunnableC2425h) r1
            if (r1 != 0) goto Lb0
            y3.e r1 = r8.f9526q
            java.lang.Object r1 = r1.m4564d()
            y3.h r1 = (p218y3.AbstractRunnableC2425h) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.m4663h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p218y3.ExecutorC2419b.f9517s
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p218y3.ExecutorC2419b.f9518t
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p218y3.ExecutorC2419b.close():void");
    }

    /* renamed from: e */
    public final boolean m4668e(long j4) {
        int i4 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = this.f9521l;
        if (i4 < i5) {
            int m4665a = m4665a();
            if (m4665a == 1 && i5 > 1) {
                m4665a();
            }
            if (m4665a > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        m4666b(runnable, p218y3.AbstractC2427j.f9542g, false);
    }

    /* renamed from: f */
    public final boolean m4669f() {
        p124e2.C1358f c1358f;
        int i4;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f9517s;
            long j4 = atomicLongFieldUpdater.get(this);
            p218y3.C2418a c2418a = (p218y3.C2418a) this.f9527r.m4570b((int) (2097151 & j4));
            if (c2418a == null) {
                c2418a = null;
            } else {
                long j5 = (2097152 + j4) & (-2097152);
                java.lang.Object m4658c = c2418a.m4658c();
                while (true) {
                    c1358f = f9520v;
                    if (m4658c == c1358f) {
                        i4 = -1;
                        break;
                    }
                    if (m4658c == null) {
                        i4 = 0;
                        break;
                    }
                    p218y3.C2418a c2418a2 = (p218y3.C2418a) m4658c;
                    i4 = c2418a2.m4657b();
                    if (i4 != 0) {
                        break;
                    }
                    m4658c = c2418a2.m4658c();
                }
                if (i4 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j4, j5 | i4)) {
                    c2418a.m4662g(c1358f);
                }
            }
            if (c2418a == null) {
                return false;
            }
            if (p218y3.C2418a.f9508t.compareAndSet(c2418a, -1, 0)) {
                java.util.concurrent.locks.LockSupport.unpark(c2418a);
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p209w3.C2357s c2357s = this.f9527r;
        int m4569a = c2357s.m4569a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < m4569a; i9++) {
            p218y3.C2418a c2418a = (p218y3.C2418a) c2357s.m4570b(i9);
            if (c2418a != null) {
                p218y3.C2429l c2429l = c2418a.f9509l;
                c2429l.getClass();
                int i10 = p218y3.C2429l.f9545b.get(c2429l) != null ? (p218y3.C2429l.f9546c.get(c2429l) - p218y3.C2429l.f9547d.get(c2429l)) + 1 : p218y3.C2429l.f9546c.get(c2429l) - p218y3.C2429l.f9547d.get(c2429l);
                int m781b = p044L.AbstractC0352j.m781b(c2418a.f9511n);
                if (m781b == 0) {
                    i4++;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (m781b == 1) {
                    i5++;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (m781b == 2) {
                    i6++;
                } else if (m781b == 3) {
                    i7++;
                    if (i10 > 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (m781b == 4) {
                    i8++;
                }
            }
        }
        long j4 = f9518t.get(this);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.f9524o);
        sb4.append('@');
        sb4.append(p187r3.AbstractC2131v.m4243b(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f9521l;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f9522m);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i4);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f9525p.m4563c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f9526q.m4563c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
