package p087W0;

/* renamed from: W0.i */
/* loaded from: classes.dex */
public abstract class AbstractC0814i implements p083V0.InterfaceC0767e {

    /* renamed from: a */
    public final java.util.ArrayDeque f2900a = new java.util.ArrayDeque();

    /* renamed from: b */
    public final java.util.ArrayDeque f2901b;

    /* renamed from: c */
    public final java.util.PriorityQueue f2902c;

    /* renamed from: d */
    public p087W0.C0813h f2903d;

    /* renamed from: e */
    public long f2904e;

    /* renamed from: f */
    public long f2905f;

    /* renamed from: g */
    public long f2906g;

    public AbstractC0814i() {
        for (int i4 = 0; i4 < 10; i4++) {
            this.f2900a.add(new p098Z.C0921f(1));
        }
        this.f2901b = new java.util.ArrayDeque();
        for (int i5 = 0; i5 < 2; i5++) {
            java.util.ArrayDeque arrayDeque = this.f2901b;
            p009B2.C0067x c0067x = new p009B2.C0067x(12, this);
            p083V0.C0765c c0765c = new p083V0.C0765c();
            c0765c.f2697s = c0067x;
            arrayDeque.add(c0765c);
        }
        this.f2902c = new java.util.PriorityQueue();
        this.f2906g = -9223372036854775807L;
    }

    @Override // p083V0.InterfaceC0767e
    /* renamed from: a */
    public final void mo1400a(long j4) {
        this.f2904e = j4;
    }

    @Override // p098Z.InterfaceC0918c
    /* renamed from: c */
    public final java.lang.Object mo1654c() {
        p086W.AbstractC0781a.m1421j(this.f2903d == null);
        java.util.ArrayDeque arrayDeque = this.f2900a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        p087W0.C0813h c0813h = (p087W0.C0813h) arrayDeque.pollFirst();
        this.f2903d = c0813h;
        return c0813h;
    }

    @Override // p098Z.InterfaceC0918c
    /* renamed from: d */
    public final void mo1655d(p083V0.C0771i c0771i) {
        p086W.AbstractC0781a.m1416e(c0771i == this.f2903d);
        p087W0.C0813h c0813h = (p087W0.C0813h) c0771i;
        long j4 = this.f2906g;
        if (j4 == -9223372036854775807L || c0813h.f3253r >= j4) {
            long j5 = this.f2905f;
            this.f2905f = 1 + j5;
            c0813h.f2899v = j5;
            this.f2902c.add(c0813h);
        } else {
            c0813h.mo1750e();
            this.f2900a.add(c0813h);
        }
        this.f2903d = null;
    }

    @Override // p098Z.InterfaceC0918c
    /* renamed from: e */
    public final void mo1656e(long j4) {
        this.f2906g = j4;
    }

    /* renamed from: f */
    public abstract p043K2.C0339o mo1638f();

    @Override // p098Z.InterfaceC0918c
    public void flush() {
        java.util.ArrayDeque arrayDeque;
        this.f2905f = 0L;
        this.f2904e = 0L;
        while (true) {
            java.util.PriorityQueue priorityQueue = this.f2902c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f2900a;
            if (isEmpty) {
                break;
            }
            p087W0.C0813h c0813h = (p087W0.C0813h) priorityQueue.poll();
            int i4 = p086W.AbstractC0805y.f2801a;
            c0813h.mo1750e();
            arrayDeque.add(c0813h);
        }
        p087W0.C0813h c0813h2 = this.f2903d;
        if (c0813h2 != null) {
            c0813h2.mo1750e();
            arrayDeque.add(c0813h2);
            this.f2903d = null;
        }
    }

    /* renamed from: g */
    public abstract void mo1639g(p087W0.C0813h c0813h);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return null;
     */
    @Override // p098Z.InterfaceC0918c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p083V0.C0765c mo1637b() {
        /*
            r7 = this;
            java.util.ArrayDeque r0 = r7.f2901b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r7.f2902c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6a
            java.lang.Object r3 = r1.peek()
            W0.h r3 = (p087W0.C0813h) r3
            int r4 = p086W.AbstractC0805y.f2801a
            long r3 = r3.f3253r
            long r5 = r7.f2904e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6a
            java.lang.Object r1 = r1.poll()
            W0.h r1 = (p087W0.C0813h) r1
            r3 = 4
            boolean r4 = r1.m1138c(r3)
            java.util.ArrayDeque r5 = r7.f2900a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            V0.c r0 = (p083V0.C0765c) r0
            r0.m1137a(r3)
            r1.mo1750e()
            r5.add(r1)
            return r0
        L41:
            r7.mo1639g(r1)
            boolean r3 = r7.mo1641i()
            if (r3 == 0) goto L63
            K2.o r2 = r7.mo1638f()
            java.lang.Object r0 = r0.pollFirst()
            V0.c r0 = (p083V0.C0765c) r0
            long r3 = r1.f3253r
            r0.f3256n = r3
            r0.f2694p = r2
            r0.f2695q = r3
            r1.mo1750e()
            r5.add(r1)
            return r0
        L63:
            r1.mo1750e()
            r5.add(r1)
            goto La
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p087W0.AbstractC0814i.mo1637b():V0.c");
    }

    /* renamed from: i */
    public abstract boolean mo1641i();

    @Override // p098Z.InterfaceC0918c
    public void release() {
    }
}
