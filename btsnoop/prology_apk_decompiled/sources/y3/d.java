package y3;

import r3.AbstractC0531s;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: o, reason: collision with root package name */
    public static final d f9166o;

    /* JADX WARN: Type inference failed for: r0v0, types: [r3.s, y3.g, y3.d] */
    static {
        int i4 = j.f9174c;
        int i5 = j.f9175d;
        long j4 = j.f9176e;
        String str = j.f9172a;
        ?? abstractC0531s = new AbstractC0531s();
        abstractC0531s.f9168n = new b(i4, i5, j4, str);
        f9166o = abstractC0531s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // r3.AbstractC0531s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
