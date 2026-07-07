package p218y3;

/* renamed from: y3.c */
/* loaded from: classes.dex */
public final class ExecutorC2420c extends p187r3.AbstractC2081I implements java.util.concurrent.Executor {

    /* renamed from: n */
    public static final p218y3.ExecutorC2420c f9528n = new p187r3.AbstractC2128s();

    /* renamed from: o */
    public static final p187r3.AbstractC2128s f9529o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [r3.s, y3.c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [w3.i] */
    static {
        p218y3.C2428k c2428k = p218y3.C2428k.f9544n;
        int i4 = p209w3.AbstractC2361w.f9310a;
        if (64 >= i4) {
            i4 = 64;
        }
        int m4548k = p209w3.AbstractC2339a.m4548k("kotlinx.coroutines.io.parallelism", i4, 0, 0, 12);
        c2428k.getClass();
        if (m4548k < 1) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Expected positive parallelism level, but got ", m4548k).toString());
        }
        if (m4548k < p218y3.AbstractC2427j.f9539d) {
            if (m4548k < 1) {
                throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Expected positive parallelism level, but got ", m4548k).toString());
            }
            c2428k = new p209w3.C2347i(c2428k, m4548k);
        }
        f9529o = c2428k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // p187r3.AbstractC2128s
    /* renamed from: e */
    public final void mo4159e(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Runnable runnable) {
        f9529o.mo4159e(interfaceC1195i, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        mo4159e(p110b3.C1196j.f4623l, runnable);
    }

    @Override // p187r3.AbstractC2128s
    public final java.lang.String toString() {
        return "Dispatchers.IO";
    }
}
