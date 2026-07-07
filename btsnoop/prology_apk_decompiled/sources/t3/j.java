package t3;

import java.util.concurrent.atomic.AtomicReferenceArray;
import w3.u;

/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: p, reason: collision with root package name */
    public final b f8463p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReferenceArray f8464q;

    public j(long j4, j jVar, b bVar, int i4) {
        super(j4, jVar, i4);
        this.f8463p = bVar;
        this.f8464q = new AtomicReferenceArray(d.f8441b * 2);
    }

    @Override // w3.u
    public final int f() {
        return d.f8441b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        k3.h.b(r4);
        r7 = r4.f8438m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        w3.a.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // w3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7, b3.InterfaceC0195i r8) {
        /*
            r6 = this;
            int r0 = t3.d.f8441b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f8464q
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof r3.l0
            t3.b r4 = r6.f8463p
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof t3.r
            if (r3 == 0) goto L22
            goto L6b
        L22:
            e2.f r3 = t3.d.f8449j
            if (r2 == r3) goto L5b
            e2.f r3 = t3.d.f8450k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            e2.f r3 = t3.d.f8446g
            if (r2 == r3) goto L12
            e2.f r3 = t3.d.f8445f
            if (r2 != r3) goto L34
            goto L12
        L34:
            e2.f r7 = t3.d.f8448i
            if (r2 == r7) goto L5a
            e2.f r7 = t3.d.f8443d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            e2.f r7 = t3.d.f8451l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r5)
            if (r1 == 0) goto L6a
            k3.h.b(r4)
            j3.l r7 = r4.f8438m
            if (r7 == 0) goto L6a
            w3.a.a(r7, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            e2.f r3 = t3.d.f8449j
            goto L72
        L70:
            e2.f r3 = t3.d.f8450k
        L72:
            boolean r2 = r6.j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r5)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L8c
            k3.h.b(r4)
            j3.l r7 = r4.f8438m
            if (r7 == 0) goto L8c
            w3.a.a(r7, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.j.g(int, b3.i):void");
    }

    public final boolean j(int i4, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f8464q;
        int i5 = (i4 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i5, obj, obj2)) {
            if (atomicReferenceArray.get(i5) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i4) {
        return this.f8464q.get((i4 * 2) + 1);
    }

    public final void l(int i4, boolean z4) {
        if (z4) {
            b bVar = this.f8463p;
            k3.h.b(bVar);
            bVar.C((this.f8949n * d.f8441b) + i4);
        }
        h();
    }

    public final void m(int i4, Object obj) {
        this.f8464q.lazySet(i4 * 2, obj);
    }

    public final void n(int i4, e2.f fVar) {
        this.f8464q.set((i4 * 2) + 1, fVar);
    }
}
