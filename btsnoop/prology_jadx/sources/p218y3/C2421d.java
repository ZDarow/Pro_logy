package p218y3;

/* renamed from: y3.d */
/* loaded from: classes.dex */
public final class C2421d extends p218y3.AbstractC2424g {

    /* renamed from: o */
    public static final p218y3.C2421d f9530o;

    /* JADX WARN: Type inference failed for: r0v0, types: [r3.s, y3.g, y3.d] */
    static {
        int i4 = p218y3.AbstractC2427j.f9538c;
        int i5 = p218y3.AbstractC2427j.f9539d;
        long j4 = p218y3.AbstractC2427j.f9540e;
        java.lang.String str = p218y3.AbstractC2427j.f9536a;
        ?? abstractC2128s = new p187r3.AbstractC2128s();
        abstractC2128s.f9532n = new p218y3.ExecutorC2419b(i4, i5, j4, str);
        f9530o = abstractC2128s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p187r3.AbstractC2128s
    public final java.lang.String toString() {
        return "Dispatchers.Default";
    }
}
