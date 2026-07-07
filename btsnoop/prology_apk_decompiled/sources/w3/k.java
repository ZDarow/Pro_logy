package w3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r3.AbstractC0534v;

/* loaded from: classes.dex */
public class k {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8930l = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8931m = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8932n = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((w3.r) r6).f8946a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w3.k i() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = w3.k.f8931m
            java.lang.Object r1 = r0.get(r9)
            w3.k r1 = (w3.k) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = w3.k.f8930l
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
            boolean r7 = r9.m()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof w3.q
            if (r7 == 0) goto L38
            w3.q r6 = (w3.q) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof w3.r
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            w3.r r6 = (w3.r) r6
            w3.k r6 = r6.f8946a
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
            w3.k r3 = (w3.k) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            k3.h.c(r6, r4)
            r4 = r6
            w3.k r4 = (w3.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.k.i():w3.k");
    }

    public final void j(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8931m;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (k() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (m()) {
                kVar.i();
                return;
            }
            return;
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f8930l.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final k l() {
        k kVar;
        Object k4 = k();
        r rVar = k4 instanceof r ? (r) k4 : null;
        if (rVar != null && (kVar = rVar.f8946a) != null) {
            return kVar;
        }
        k3.h.c(k4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) k4;
    }

    public boolean m() {
        return k() instanceof r;
    }

    public String toString() {
        return new k3.l(this, AbstractC0534v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0534v.b(this);
    }
}
