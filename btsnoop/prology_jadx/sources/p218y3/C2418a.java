package p218y3;

/* renamed from: y3.a */
/* loaded from: classes.dex */
public final class C2418a extends java.lang.Thread {

    /* renamed from: t */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9508t = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p218y3.C2418a.class, "workerCtl");
    private volatile int indexInArray;

    /* renamed from: l */
    public final p218y3.C2429l f9509l;

    /* renamed from: m */
    public final p154k3.C1811p f9510m;

    /* renamed from: n */
    public int f9511n;
    private volatile java.lang.Object nextParkedWorker;

    /* renamed from: o */
    public long f9512o;

    /* renamed from: p */
    public long f9513p;

    /* renamed from: q */
    public int f9514q;

    /* renamed from: r */
    public boolean f9515r;

    /* renamed from: s */
    public final /* synthetic */ p218y3.ExecutorC2419b f9516s;
    private volatile int workerCtl;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k3.p] */
    public C2418a(p218y3.ExecutorC2419b executorC2419b, int i4) {
        this.f9516s = executorC2419b;
        setDaemon(true);
        this.f9509l = new p218y3.C2429l();
        this.f9510m = new java.lang.Object();
        this.f9511n = 4;
        this.nextParkedWorker = p218y3.ExecutorC2419b.f9520v;
        p159l3.AbstractC1832e.f7400l.getClass();
        this.f9514q = p159l3.AbstractC1832e.f7401m.mo3796a().nextInt();
        m4661f(i4);
    }

    /* renamed from: a */
    public final p218y3.AbstractRunnableC2425h m4656a(boolean z4) {
        p218y3.AbstractRunnableC2425h m4660e;
        p218y3.AbstractRunnableC2425h m4660e2;
        p218y3.ExecutorC2419b executorC2419b;
        long j4;
        int i4 = this.f9511n;
        p218y3.AbstractRunnableC2425h abstractRunnableC2425h = null;
        p218y3.C2429l c2429l = this.f9509l;
        p218y3.ExecutorC2419b executorC2419b2 = this.f9516s;
        if (i4 != 1) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = p218y3.ExecutorC2419b.f9518t;
            do {
                executorC2419b = this.f9516s;
                j4 = atomicLongFieldUpdater.get(executorC2419b);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    c2429l.getClass();
                    loop1: while (true) {
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p218y3.C2429l.f9545b;
                        p218y3.AbstractRunnableC2425h abstractRunnableC2425h2 = (p218y3.AbstractRunnableC2425h) atomicReferenceFieldUpdater.get(c2429l);
                        if (abstractRunnableC2425h2 == null || abstractRunnableC2425h2.f9534m.f117a != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(c2429l, abstractRunnableC2425h2, null)) {
                            if (atomicReferenceFieldUpdater.get(c2429l) != abstractRunnableC2425h2) {
                                break;
                            }
                        }
                        abstractRunnableC2425h = abstractRunnableC2425h2;
                    }
                    int i5 = p218y3.C2429l.f9547d.get(c2429l);
                    int i6 = p218y3.C2429l.f9546c.get(c2429l);
                    while (true) {
                        if (i5 == i6 || p218y3.C2429l.f9548e.get(c2429l) == 0) {
                            break;
                        }
                        i6--;
                        p218y3.AbstractRunnableC2425h m4672c = c2429l.m4672c(i6, true);
                        if (m4672c != null) {
                            abstractRunnableC2425h = m4672c;
                            break;
                        }
                    }
                    if (abstractRunnableC2425h != null) {
                        return abstractRunnableC2425h;
                    }
                    p218y3.AbstractRunnableC2425h abstractRunnableC2425h3 = (p218y3.AbstractRunnableC2425h) executorC2419b2.f9526q.m4564d();
                    return abstractRunnableC2425h3 == null ? m4664i(1) : abstractRunnableC2425h3;
                }
            } while (!p218y3.ExecutorC2419b.f9518t.compareAndSet(executorC2419b, j4, j4 - 4398046511104L));
            this.f9511n = 1;
        }
        if (z4) {
            boolean z5 = m4659d(executorC2419b2.f9521l * 2) == 0;
            if (z5 && (m4660e2 = m4660e()) != null) {
                return m4660e2;
            }
            c2429l.getClass();
            p218y3.AbstractRunnableC2425h abstractRunnableC2425h4 = (p218y3.AbstractRunnableC2425h) p218y3.C2429l.f9545b.getAndSet(c2429l, null);
            if (abstractRunnableC2425h4 == null) {
                abstractRunnableC2425h4 = c2429l.m4671b();
            }
            if (abstractRunnableC2425h4 != null) {
                return abstractRunnableC2425h4;
            }
            if (!z5 && (m4660e = m4660e()) != null) {
                return m4660e;
            }
        } else {
            p218y3.AbstractRunnableC2425h m4660e3 = m4660e();
            if (m4660e3 != null) {
                return m4660e3;
            }
        }
        return m4664i(3);
    }

    /* renamed from: b */
    public final int m4657b() {
        return this.indexInArray;
    }

    /* renamed from: c */
    public final java.lang.Object m4658c() {
        return this.nextParkedWorker;
    }

    /* renamed from: d */
    public final int m4659d(int i4) {
        int i5 = this.f9514q;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f9514q = i8;
        int i9 = i4 - 1;
        return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
    }

    /* renamed from: e */
    public final p218y3.AbstractRunnableC2425h m4660e() {
        int m4659d = m4659d(2);
        p218y3.ExecutorC2419b executorC2419b = this.f9516s;
        if (m4659d == 0) {
            p218y3.AbstractRunnableC2425h abstractRunnableC2425h = (p218y3.AbstractRunnableC2425h) executorC2419b.f9525p.m4564d();
            return abstractRunnableC2425h != null ? abstractRunnableC2425h : (p218y3.AbstractRunnableC2425h) executorC2419b.f9526q.m4564d();
        }
        p218y3.AbstractRunnableC2425h abstractRunnableC2425h2 = (p218y3.AbstractRunnableC2425h) executorC2419b.f9526q.m4564d();
        return abstractRunnableC2425h2 != null ? abstractRunnableC2425h2 : (p218y3.AbstractRunnableC2425h) executorC2419b.f9525p.m4564d();
    }

    /* renamed from: f */
    public final void m4661f(int i4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f9516s.f9524o);
        sb.append("-worker-");
        sb.append(i4 == 0 ? "TERMINATED" : java.lang.String.valueOf(i4));
        setName(sb.toString());
        this.indexInArray = i4;
    }

    /* renamed from: g */
    public final void m4662g(java.lang.Object obj) {
        this.nextParkedWorker = obj;
    }

    /* renamed from: h */
    public final boolean m4663h(int i4) {
        int i5 = this.f9511n;
        boolean z4 = i5 == 1;
        if (z4) {
            p218y3.ExecutorC2419b.f9518t.addAndGet(this.f9516s, 4398046511104L);
        }
        if (i5 != i4) {
            this.f9511n = i4;
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p218y3.AbstractRunnableC2425h m4664i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p218y3.C2418a.m4664i(int):y3.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p218y3.C2418a.run():void");
    }
}
