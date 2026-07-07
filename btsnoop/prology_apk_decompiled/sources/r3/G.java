package r3;

import b3.InterfaceC0195i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class G extends H implements InterfaceC0537y {

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8114r = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_delayed");

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8115t = AtomicIntegerFieldUpdater.newUpdater(G.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // r3.AbstractC0531s
    public final void e(InterfaceC0195i interfaceC0195i, Runnable runnable) {
        p(runnable);
    }

    @Override // r3.H
    public final long l() {
        Runnable runnable;
        if (n()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8114r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof w3.n)) {
                if (obj == AbstractC0534v.f8180b) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (Runnable) obj;
                break loop0;
            }
            w3.n nVar = (w3.n) obj;
            Object d4 = nVar.d();
            if (d4 != w3.n.f8937g) {
                runnable = (Runnable) d4;
                break;
            }
            w3.n c4 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        a3.b bVar = this.f8119p;
        if (((bVar == null || bVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f8114r.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof w3.n)) {
                if (obj2 != AbstractC0534v.f8180b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j4 = w3.n.f8936f.get((w3.n) obj2);
            if (((int) (1073741823 & j4)) != ((int) ((j4 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // r3.H
    public void o() {
        h0.f8156a.set(null);
        f8115t.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8114r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            e2.f fVar = AbstractC0534v.f8180b;
            if (obj != null) {
                if (!(obj instanceof w3.n)) {
                    if (obj != fVar) {
                        w3.n nVar = new w3.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((w3.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, fVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (l() <= 0);
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = h();
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r3.G.f8114r
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = r3.G.f8115t
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
            boolean r2 = r1 instanceof w3.n
            r3 = 1
            if (r2 == 0) goto L46
            r2 = r1
            w3.n r2 = (w3.n) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L66
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            w3.n r2 = r2.c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            e2.f r2 = r3.AbstractC0534v.f8180b
            if (r1 != r2) goto L50
        L4a:
            r3.w r0 = r3.RunnableC0535w.f8188u
            r0.p(r6)
            goto L73
        L50:
            w3.n r2 = new w3.n
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L60:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L74
        L66:
            java.lang.Thread r6 = r5.h()
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
        throw new UnsupportedOperationException("Method not decompiled: r3.G.p(java.lang.Runnable):void");
    }

    public final boolean q() {
        a3.b bVar = this.f8119p;
        if (!(bVar != null ? bVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f8114r.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof w3.n) {
            long j4 = w3.n.f8936f.get((w3.n) obj);
            if (((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0534v.f8180b) {
            return true;
        }
        return false;
    }
}
