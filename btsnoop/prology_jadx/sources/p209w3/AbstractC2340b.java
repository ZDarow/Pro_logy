package p209w3;

/* renamed from: w3.b */
/* loaded from: classes.dex */
public abstract class AbstractC2340b extends p209w3.AbstractC2355q {

    /* renamed from: a */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9272a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p209w3.AbstractC2340b.class, java.lang.Object.class, "_consensus");
    private volatile java.lang.Object _consensus = p209w3.AbstractC2339a.f9266a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r1 = r0.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.compareAndSet(r4, r2, r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.get(r4) == r2) goto L17;
     */
    @Override // p209w3.AbstractC2355q
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4551a(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p209w3.AbstractC2340b.f9272a
            java.lang.Object r1 = r0.get(r4)
            e2.f r2 = p209w3.AbstractC2339a.f9266a
            if (r1 != r2) goto L28
            e2.f r3 = r4.mo4182c(r5)
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            goto L28
        L15:
            boolean r1 = r0.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L1d
            r1 = r3
            goto L28
        L1d:
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            java.lang.Object r0 = r0.get(r4)
            r1 = r0
        L28:
            r4.mo4181b(r5, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p209w3.AbstractC2340b.mo4551a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public abstract void mo4181b(java.lang.Object obj, java.lang.Object obj2);

    /* renamed from: c */
    public abstract p124e2.C1358f mo4182c(java.lang.Object obj);
}
