package y3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9181b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9182c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9183d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9184e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f9185a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9182c;
        if (atomicIntegerFieldUpdater.get(this) - f9183d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f9170m.f114a == 1) {
            f9184e.incrementAndGet(this);
        }
        int i4 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f9185a;
            if (atomicReferenceArray.get(i4) == null) {
                atomicReferenceArray.lazySet(i4, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9183d;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 - f9182c.get(this) == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 + 1) && (hVar = (h) this.f9185a.getAndSet(i5, null)) != null) {
                if (hVar.f9170m.f114a == 1) {
                    f9184e.decrementAndGet(this);
                }
                return hVar;
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
    
        y3.l.f9184e.decrementAndGet(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r1.f9170m.f114a == 1) == r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0.compareAndSet(r6, r1, null) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y3.h c(int r6, boolean r7) {
        /*
            r5 = this;
            r6 = r6 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.f9185a
            java.lang.Object r1 = r0.get(r6)
            y3.h r1 = (y3.h) r1
            r2 = 0
            if (r1 == 0) goto L2c
            B2.C r3 = r1.f9170m
            int r3 = r3.f114a
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = y3.l.f9184e
            r6.decrementAndGet(r5)
        L25:
            return r1
        L26:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L18
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.l.c(int, boolean):y3.h");
    }
}
