package y3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k3.p;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9146t = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
    private volatile int indexInArray;

    /* renamed from: l, reason: collision with root package name */
    public final l f9147l;

    /* renamed from: m, reason: collision with root package name */
    public final p f9148m;

    /* renamed from: n, reason: collision with root package name */
    public int f9149n;
    private volatile Object nextParkedWorker;

    /* renamed from: o, reason: collision with root package name */
    public long f9150o;

    /* renamed from: p, reason: collision with root package name */
    public long f9151p;

    /* renamed from: q, reason: collision with root package name */
    public int f9152q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9153r;
    public final /* synthetic */ b s;
    private volatile int workerCtl;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k3.p] */
    public a(b bVar, int i4) {
        this.s = bVar;
        setDaemon(true);
        this.f9147l = new l();
        this.f9148m = new Object();
        this.f9149n = 4;
        this.nextParkedWorker = b.f9156v;
        l3.e.f7130l.getClass();
        this.f9152q = l3.e.f7131m.a().nextInt();
        f(i4);
    }

    public final h a(boolean z4) {
        h e4;
        h e5;
        b bVar;
        long j4;
        int i4 = this.f9149n;
        h hVar = null;
        l lVar = this.f9147l;
        b bVar2 = this.s;
        if (i4 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f9154t;
            do {
                bVar = this.s;
                j4 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f9181b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 == null || hVar2.f9170m.f114a != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                break;
                            }
                        }
                        hVar = hVar2;
                    }
                    int i5 = l.f9183d.get(lVar);
                    int i6 = l.f9182c.get(lVar);
                    while (true) {
                        if (i5 == i6 || l.f9184e.get(lVar) == 0) {
                            break;
                        }
                        i6--;
                        h c4 = lVar.c(i6, true);
                        if (c4 != null) {
                            hVar = c4;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f9162q.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f9154t.compareAndSet(bVar, j4, j4 - 4398046511104L));
            this.f9149n = 1;
        }
        if (z4) {
            boolean z5 = d(bVar2.f9157l * 2) == 0;
            if (z5 && (e5 = e()) != null) {
                return e5;
            }
            lVar.getClass();
            h hVar4 = (h) l.f9181b.getAndSet(lVar, null);
            if (hVar4 == null) {
                hVar4 = lVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z5 && (e4 = e()) != null) {
                return e4;
            }
        } else {
            h e6 = e();
            if (e6 != null) {
                return e6;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i4) {
        int i5 = this.f9152q;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f9152q = i8;
        int i9 = i4 - 1;
        return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
    }

    public final h e() {
        int d4 = d(2);
        b bVar = this.s;
        if (d4 == 0) {
            h hVar = (h) bVar.f9161p.d();
            return hVar != null ? hVar : (h) bVar.f9162q.d();
        }
        h hVar2 = (h) bVar.f9162q.d();
        return hVar2 != null ? hVar2 : (h) bVar.f9161p.d();
    }

    public final void f(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.s.f9160o);
        sb.append("-worker-");
        sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
        setName(sb.toString());
        this.indexInArray = i4;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i4) {
        int i5 = this.f9149n;
        boolean z4 = i5 == 1;
        if (z4) {
            b.f9154t.addAndGet(this.s, 4398046511104L);
        }
        if (i5 != i4) {
            this.f9149n = i4;
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y3.h i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.a.i(int):y3.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.a.run():void");
    }
}
