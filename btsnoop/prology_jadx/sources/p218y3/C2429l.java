package p218y3;

/* renamed from: y3.l */
/* loaded from: classes.dex */
public final class C2429l {

    /* renamed from: b */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9545b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p218y3.C2429l.class, java.lang.Object.class, "lastScheduledTask");

    /* renamed from: c */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9546c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p218y3.C2429l.class, "producerIndex");

    /* renamed from: d */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9547d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p218y3.C2429l.class, "consumerIndex");

    /* renamed from: e */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9548e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p218y3.C2429l.class, "blockingTasksInBuffer");

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicReferenceArray f9549a = new java.util.concurrent.atomic.AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile java.lang.Object lastScheduledTask;
    private volatile int producerIndex;

    /* renamed from: a */
    public final p218y3.AbstractRunnableC2425h m4670a(p218y3.AbstractRunnableC2425h abstractRunnableC2425h) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9546c;
        if (atomicIntegerFieldUpdater.get(this) - f9547d.get(this) == 127) {
            return abstractRunnableC2425h;
        }
        if (abstractRunnableC2425h.f9534m.f117a == 1) {
            f9548e.incrementAndGet(this);
        }
        int i4 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f9549a;
            if (atomicReferenceArray.get(i4) == null) {
                atomicReferenceArray.lazySet(i4, abstractRunnableC2425h);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            java.lang.Thread.yield();
        }
    }

    /* renamed from: b */
    public final p218y3.AbstractRunnableC2425h m4671b() {
        p218y3.AbstractRunnableC2425h abstractRunnableC2425h;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9547d;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 - f9546c.get(this) == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 + 1) && (abstractRunnableC2425h = (p218y3.AbstractRunnableC2425h) this.f9549a.getAndSet(i5, null)) != null) {
                if (abstractRunnableC2425h.f9534m.f117a == 1) {
                    f9548e.decrementAndGet(this);
                }
                return abstractRunnableC2425h;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.get(r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r7 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        p218y3.C2429l.f9548e.decrementAndGet(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r1.f9534m.f117a == 1) == r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0.compareAndSet(r6, r1, null) == false) goto L14;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p218y3.AbstractRunnableC2425h m4672c(int r6, boolean r7) {
        /*
            r5 = this;
            r6 = r6 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.f9549a
            java.lang.Object r1 = r0.get(r6)
            y3.h r1 = (p218y3.AbstractRunnableC2425h) r1
            r2 = 0
            if (r1 == 0) goto L2c
            B2.C r3 = r1.f9534m
            int r3 = r3.f117a
            r4 = 1
            if (r3 != r4) goto L15
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 != r7) goto L2c
        L18:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L26
            if (r7 == 0) goto L25
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = p218y3.C2429l.f9548e
            r6.decrementAndGet(r5)
        L25:
            return r1
        L26:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L18
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p218y3.C2429l.m4672c(int, boolean):y3.h");
    }
}
