package W0;

import B2.x;
import K2.o;
import W.y;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class i implements V0.e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f2804a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2805b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f2806c;

    /* renamed from: d, reason: collision with root package name */
    public h f2807d;

    /* renamed from: e, reason: collision with root package name */
    public long f2808e;

    /* renamed from: f, reason: collision with root package name */
    public long f2809f;

    /* renamed from: g, reason: collision with root package name */
    public long f2810g;

    public i() {
        for (int i4 = 0; i4 < 10; i4++) {
            this.f2804a.add(new Z.f(1));
        }
        this.f2805b = new ArrayDeque();
        for (int i5 = 0; i5 < 2; i5++) {
            ArrayDeque arrayDeque = this.f2805b;
            x xVar = new x(12, this);
            V0.c cVar = new V0.c();
            cVar.s = xVar;
            arrayDeque.add(cVar);
        }
        this.f2806c = new PriorityQueue();
        this.f2810g = -9223372036854775807L;
    }

    @Override // V0.e
    public final void a(long j4) {
        this.f2808e = j4;
    }

    @Override // Z.c
    public final Object c() {
        W.a.j(this.f2807d == null);
        ArrayDeque arrayDeque = this.f2804a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.f2807d = hVar;
        return hVar;
    }

    @Override // Z.c
    public final void d(V0.i iVar) {
        W.a.e(iVar == this.f2807d);
        h hVar = (h) iVar;
        long j4 = this.f2810g;
        if (j4 == -9223372036854775807L || hVar.f3142r >= j4) {
            long j5 = this.f2809f;
            this.f2809f = 1 + j5;
            hVar.f2803v = j5;
            this.f2806c.add(hVar);
        } else {
            hVar.e();
            this.f2804a.add(hVar);
        }
        this.f2807d = null;
    }

    @Override // Z.c
    public final void e(long j4) {
        this.f2810g = j4;
    }

    public abstract o f();

    @Override // Z.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f2809f = 0L;
        this.f2808e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f2806c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f2804a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) priorityQueue.poll();
            int i4 = y.f2709a;
            hVar.e();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.f2807d;
        if (hVar2 != null) {
            hVar2.e();
            arrayDeque.add(hVar2);
            this.f2807d = null;
        }
    }

    public abstract void g(h hVar);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return null;
     */
    @Override // Z.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V0.c b() {
        /*
            r7 = this;
            java.util.ArrayDeque r0 = r7.f2805b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r7.f2806c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6a
            java.lang.Object r3 = r1.peek()
            W0.h r3 = (W0.h) r3
            int r4 = W.y.f2709a
            long r3 = r3.f3142r
            long r5 = r7.f2808e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6a
            java.lang.Object r1 = r1.poll()
            W0.h r1 = (W0.h) r1
            r3 = 4
            boolean r4 = r1.c(r3)
            java.util.ArrayDeque r5 = r7.f2804a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            V0.c r0 = (V0.c) r0
            r0.a(r3)
            r1.e()
            r5.add(r1)
            return r0
        L41:
            r7.g(r1)
            boolean r3 = r7.i()
            if (r3 == 0) goto L63
            K2.o r2 = r7.f()
            java.lang.Object r0 = r0.pollFirst()
            V0.c r0 = (V0.c) r0
            long r3 = r1.f3142r
            r0.f3144n = r3
            r0.f2603p = r2
            r0.f2604q = r3
            r1.e()
            r5.add(r1)
            return r0
        L63:
            r1.e()
            r5.add(r1)
            goto La
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.i.b():V0.c");
    }

    public abstract boolean i();

    @Override // Z.c
    public void release() {
    }
}
