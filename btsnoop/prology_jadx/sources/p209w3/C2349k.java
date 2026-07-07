package p209w3;

/* renamed from: w3.k */
/* loaded from: classes.dex */
public class C2349k {

    /* renamed from: l */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9289l = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p209w3.C2349k.class, java.lang.Object.class, "_next");

    /* renamed from: m */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9290m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p209w3.C2349k.class, java.lang.Object.class, "_prev");

    /* renamed from: n */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9291n = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p209w3.C2349k.class, java.lang.Object.class, "_removedRef");
    private volatile java.lang.Object _next = this;
    private volatile java.lang.Object _prev = this;
    private volatile java.lang.Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((p209w3.C2356r) r6).f9305a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p209w3.C2349k m4557i() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p209w3.C2349k.f9290m
            java.lang.Object r1 = r0.get(r9)
            w3.k r1 = (p209w3.C2349k) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p209w3.C2349k.f9289l
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.mo4215m()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof p209w3.AbstractC2355q
            if (r7 == 0) goto L38
            w3.q r6 = (p209w3.AbstractC2355q) r6
            r6.mo4551a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof p209w3.C2356r
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            w3.r r6 = (p209w3.C2356r) r6
            w3.k r6 = r6.f9305a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            w3.k r3 = (p209w3.C2349k) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            p154k3.AbstractC1803h.m3777c(r6, r4)
            r4 = r6
            w3.k r4 = (p209w3.C2349k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p209w3.C2349k.m4557i():w3.k");
    }

    /* renamed from: j */
    public final void m4558j(p209w3.C2349k c2349k) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9290m;
            p209w3.C2349k c2349k2 = (p209w3.C2349k) atomicReferenceFieldUpdater.get(c2349k);
            if (m4559k() != c2349k) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c2349k, c2349k2, this)) {
                if (atomicReferenceFieldUpdater.get(c2349k) != c2349k2) {
                    break;
                }
            }
            if (mo4215m()) {
                c2349k.m4557i();
                return;
            }
            return;
        }
    }

    /* renamed from: k */
    public final java.lang.Object m4559k() {
        while (true) {
            java.lang.Object obj = f9289l.get(this);
            if (!(obj instanceof p209w3.AbstractC2355q)) {
                return obj;
            }
            ((p209w3.AbstractC2355q) obj).mo4551a(this);
        }
    }

    /* renamed from: l */
    public final p209w3.C2349k m4560l() {
        p209w3.C2349k c2349k;
        java.lang.Object m4559k = m4559k();
        p209w3.C2356r c2356r = m4559k instanceof p209w3.C2356r ? (p209w3.C2356r) m4559k : null;
        if (c2356r != null && (c2349k = c2356r.f9305a) != null) {
            return c2349k;
        }
        p154k3.AbstractC1803h.m3777c(m4559k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (p209w3.C2349k) m4559k;
    }

    /* renamed from: m */
    public boolean mo4215m() {
        return m4559k() instanceof p209w3.C2356r;
    }

    public java.lang.String toString() {
        return new p154k3.AbstractC1807l(this, p187r3.AbstractC2131v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + p187r3.AbstractC2131v.m4243b(this);
    }
}
