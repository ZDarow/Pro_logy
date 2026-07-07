package y3;

import B2.AbstractC0007h;
import B2.C;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import r3.AbstractC0534v;
import w3.s;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {
    public static final AtomicLongFieldUpdater s = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9154t = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9155u = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: v, reason: collision with root package name */
    public static final e2.f f9156v = new e2.f("NOT_IN_STACK", 1);
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: l, reason: collision with root package name */
    public final int f9157l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9158m;

    /* renamed from: n, reason: collision with root package name */
    public final long f9159n;

    /* renamed from: o, reason: collision with root package name */
    public final String f9160o;

    /* renamed from: p, reason: collision with root package name */
    public final e f9161p;
    private volatile long parkedWorkersStack;

    /* renamed from: q, reason: collision with root package name */
    public final e f9162q;

    /* renamed from: r, reason: collision with root package name */
    public final s f9163r;

    /* JADX WARN: Type inference failed for: r4v10, types: [y3.e, w3.l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [y3.e, w3.l] */
    public b(int i4, int i5, long j4, String str) {
        this.f9157l = i4;
        this.f9158m = i5;
        this.f9159n = j4;
        this.f9160o = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(AbstractC0007h.j(i4, "Core pool size ", " should be at least 1").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(AbstractC0007h.i(i5, i4, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(AbstractC0007h.j(i5, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f9161p = new w3.l();
        this.f9162q = new w3.l();
        this.f9163r = new s((i4 + 1) * 2);
        this.controlState = i4 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f9163r) {
            try {
                if (f9155u.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f9154t;
                long j4 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j4 & 2097151);
                int i5 = i4 - ((int) ((j4 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f9157l) {
                    return 0;
                }
                if (i4 >= this.f9158m) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f9163r.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f9163r.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i7 = i5 + 1;
                aVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, C c4, boolean z4) {
        h iVar;
        int i4;
        j.f9177f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f9169l = nanoTime;
            iVar.f9170m = c4;
        } else {
            iVar = new i(runnable, nanoTime, c4);
        }
        boolean z5 = false;
        boolean z6 = iVar.f9170m.f114a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9154t;
        long addAndGet = z6 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !k3.h.a(aVar.s, this)) {
            aVar = null;
        }
        if (aVar != null && (i4 = aVar.f9149n) != 5 && (iVar.f9170m.f114a != 0 || i4 != 2)) {
            aVar.f9153r = true;
            l lVar = aVar.f9147l;
            if (z4) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f9181b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f9170m.f114a == 1 ? this.f9162q.a(iVar) : this.f9161p.a(iVar))) {
                throw new RejectedExecutionException(AbstractC0007h.m(new StringBuilder(), this.f9160o, " was terminated"));
            }
        }
        if (z4 && aVar != null) {
            z5 = true;
        }
        if (z6) {
            if (z5 || f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z5 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    public final void c(a aVar, int i4, int i5) {
        while (true) {
            long j4 = s.get(this);
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (i6 == i4) {
                if (i5 == 0) {
                    Object c4 = aVar.c();
                    while (true) {
                        if (c4 == f9156v) {
                            i6 = -1;
                            break;
                        }
                        if (c4 == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) c4;
                        int b4 = aVar2.b();
                        if (b4 != 0) {
                            i6 = b4;
                            break;
                        }
                        c4 = aVar2.c();
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (s.compareAndSet(this, j4, i6 | j5)) {
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = y3.b.f9155u
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof y3.a
            r3 = 0
            if (r1 == 0) goto L18
            y3.a r0 = (y3.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            y3.b r1 = r0.s
            boolean r1 = k3.h.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            w3.s r1 = r8.f9163r
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = y3.b.f9154t     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L77
            r1 = r2
        L37:
            w3.s r5 = r8.f9163r
            java.lang.Object r5 = r5.b(r1)
            k3.h.b(r5)
            y3.a r5 = (y3.a) r5
            if (r5 == r0) goto L72
        L44:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L53:
            y3.l r5 = r5.f9147l
            y3.e r6 = r8.f9162q
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = y3.l.f9181b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            y3.h r7 = (y3.h) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            y3.h r7 = r5.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r4) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            y3.e r1 = r8.f9162q
            r1.b()
            y3.e r1 = r8.f9161p
            r1.b()
        L81:
            if (r0 == 0) goto L89
            y3.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            y3.e r1 = r8.f9161p
            java.lang.Object r1 = r1.d()
            y3.h r1 = (y3.h) r1
            if (r1 != 0) goto Lb0
            y3.e r1 = r8.f9162q
            java.lang.Object r1 = r1.d()
            y3.h r1 = (y3.h) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = y3.b.s
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = y3.b.f9154t
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
        throw new UnsupportedOperationException("Method not decompiled: y3.b.close():void");
    }

    public final boolean e(long j4) {
        int i4 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = this.f9157l;
        if (i4 < i5) {
            int a4 = a();
            if (a4 == 1 && i5 > 1) {
                a();
            }
            if (a4 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, j.f9178g, false);
    }

    public final boolean f() {
        e2.f fVar;
        int i4;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = s;
            long j4 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f9163r.b((int) (2097151 & j4));
            if (aVar == null) {
                aVar = null;
            } else {
                long j5 = (2097152 + j4) & (-2097152);
                Object c4 = aVar.c();
                while (true) {
                    fVar = f9156v;
                    if (c4 == fVar) {
                        i4 = -1;
                        break;
                    }
                    if (c4 == null) {
                        i4 = 0;
                        break;
                    }
                    a aVar2 = (a) c4;
                    i4 = aVar2.b();
                    if (i4 != 0) {
                        break;
                    }
                    c4 = aVar2.c();
                }
                if (i4 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j4, j5 | i4)) {
                    aVar.g(fVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f9146t.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f9163r;
        int a4 = sVar.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a4; i9++) {
            a aVar = (a) sVar.b(i9);
            if (aVar != null) {
                l lVar = aVar.f9147l;
                lVar.getClass();
                int i10 = l.f9181b.get(lVar) != null ? (l.f9182c.get(lVar) - l.f9183d.get(lVar)) + 1 : l.f9182c.get(lVar) - l.f9183d.get(lVar);
                int b4 = L.j.b(aVar.f9149n);
                if (b4 == 0) {
                    i4++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (b4 == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (b4 == 2) {
                    i6++;
                } else if (b4 == 3) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (b4 == 4) {
                    i8++;
                }
            }
        }
        long j4 = f9154t.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f9160o);
        sb4.append('@');
        sb4.append(AbstractC0534v.b(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f9157l;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f9158m);
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
        sb4.append(this.f9161p.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f9162q.c());
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
