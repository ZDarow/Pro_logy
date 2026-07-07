package p187r3;

/* renamed from: r3.G */
/* loaded from: classes.dex */
public abstract class AbstractC2079G extends p187r3.AbstractC2080H implements p187r3.InterfaceC2134y {

    /* renamed from: r */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8429r = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p187r3.AbstractC2079G.class, java.lang.Object.class, "_queue");

    /* renamed from: s */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8430s = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p187r3.AbstractC2079G.class, java.lang.Object.class, "_delayed");

    /* renamed from: t */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8431t = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p187r3.AbstractC2079G.class, "_isCompleted");
    private volatile java.lang.Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile java.lang.Object _queue;

    @Override // p187r3.AbstractC2128s
    /* renamed from: e */
    public final void mo4159e(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Runnable runnable) {
        mo4162p(runnable);
    }

    @Override // p187r3.AbstractC2080H
    /* renamed from: l */
    public final long mo4160l() {
        java.lang.Runnable runnable;
        if (m4167n()) {
            return 0L;
        }
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8429r;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof p209w3.C2352n)) {
                if (obj == p187r3.AbstractC2131v.f8498b) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (java.lang.Runnable) obj;
                break loop0;
            }
            p209w3.C2352n c2352n = (p209w3.C2352n) obj;
            java.lang.Object m4568d = c2352n.m4568d();
            if (m4568d != p209w3.C2352n.f9296g) {
                runnable = (java.lang.Runnable) m4568d;
                break;
            }
            p209w3.C2352n m4567c = c2352n.m4567c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m4567c) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        p105a3.C1019b c1019b = this.f8435p;
        if (((c1019b == null || c1019b.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        java.lang.Object obj2 = f8429r.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof p209w3.C2352n)) {
                if (obj2 != p187r3.AbstractC2131v.f8498b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j4 = p209w3.C2352n.f9295f.get((p209w3.C2352n) obj2);
            if (((int) (1073741823 & j4)) != ((int) ((j4 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // p187r3.AbstractC2080H
    /* renamed from: o */
    public void mo4161o() {
        p187r3.AbstractC2113h0.f8474a.set(null);
        f8431t.set(this, 1);
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8429r;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            p124e2.C1358f c1358f = p187r3.AbstractC2131v.f8498b;
            if (obj != null) {
                if (!(obj instanceof p209w3.C2352n)) {
                    if (obj != c1358f) {
                        p209w3.C2352n c2352n = new p209w3.C2352n(8, true);
                        c2352n.m4565a((java.lang.Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2352n)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((p209w3.C2352n) obj).m4566b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1358f)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (mo4160l() <= 0);
        java.lang.System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = mo4165h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4162p(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p187r3.AbstractC2079G.f8429r
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p187r3.AbstractC2079G.f8431t
            int r2 = r2.get(r5)
            if (r2 == 0) goto Lf
            goto L4a
        Lf:
            if (r1 != 0) goto L20
        L11:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L19
            goto L66
        L19:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L11
            goto L0
        L20:
            boolean r2 = r1 instanceof p209w3.C2352n
            r3 = 1
            if (r2 == 0) goto L46
            r2 = r1
            w3.n r2 = (p209w3.C2352n) r2
            int r4 = r2.m4565a(r6)
            if (r4 == 0) goto L66
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            w3.n r2 = r2.m4567c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            e2.f r2 = p187r3.AbstractC2131v.f8498b
            if (r1 != r2) goto L50
        L4a:
            r3.w r0 = p187r3.RunnableC2132w.f8506u
            r0.mo4162p(r6)
            goto L73
        L50:
            w3.n r2 = new w3.n
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.m4565a(r3)
            r2.m4565a(r6)
        L60:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L74
        L66:
            java.lang.Thread r6 = r5.mo4165h()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L73
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L73:
            return
        L74:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L60
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: p187r3.AbstractC2079G.mo4162p(java.lang.Runnable):void");
    }

    /* renamed from: q */
    public final boolean m4163q() {
        p105a3.C1019b c1019b = this.f8435p;
        if (!(c1019b != null ? c1019b.isEmpty() : true)) {
            return false;
        }
        java.lang.Object obj = f8429r.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof p209w3.C2352n) {
            long j4 = p209w3.C2352n.f9295f.get((p209w3.C2352n) obj);
            if (((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == p187r3.AbstractC2131v.f8498b) {
            return true;
        }
        return false;
    }
}
