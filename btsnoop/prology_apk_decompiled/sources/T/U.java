package T;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f2168a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [T.Q, java.lang.Object] */
    static {
        W.y.H(0);
        W.y.H(1);
        W.y.H(2);
    }

    public int a(boolean z4) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z4) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i4, S s, T t4, int i5, boolean z4) {
        int i6 = f(i4, s, false).f2145c;
        if (m(i6, t4, 0L).f2166o != i4) {
            return i4 + 1;
        }
        int e4 = e(i6, i5, z4);
        if (e4 == -1) {
            return -1;
        }
        return m(e4, t4, 0L).f2165n;
    }

    public int e(int i4, int i5, boolean z4) {
        if (i5 == 0) {
            if (i4 == c(z4)) {
                return -1;
            }
            return i4 + 1;
        }
        if (i5 == 1) {
            return i4;
        }
        if (i5 == 2) {
            return i4 == c(z4) ? a(z4) : i4 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int c4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u4 = (U) obj;
        if (u4.o() != o() || u4.h() != h()) {
            return false;
        }
        T t4 = new T();
        S s = new S();
        T t5 = new T();
        S s4 = new S();
        for (int i4 = 0; i4 < o(); i4++) {
            if (!m(i4, t4, 0L).equals(u4.m(i4, t5, 0L))) {
                return false;
            }
        }
        for (int i5 = 0; i5 < h(); i5++) {
            if (!f(i5, s, true).equals(u4.f(i5, s4, true))) {
                return false;
            }
        }
        int a4 = a(true);
        if (a4 != u4.a(true) || (c4 = c(true)) != u4.c(true)) {
            return false;
        }
        while (a4 != c4) {
            int e4 = e(a4, 0, true);
            if (e4 != u4.e(a4, 0, true)) {
                return false;
            }
            a4 = e4;
        }
        return true;
    }

    public abstract S f(int i4, S s, boolean z4);

    public S g(Object obj, S s) {
        return f(b(obj), s, true);
    }

    public abstract int h();

    public final int hashCode() {
        T t4 = new T();
        S s = new S();
        int o2 = o() + 217;
        for (int i4 = 0; i4 < o(); i4++) {
            o2 = (o2 * 31) + m(i4, t4, 0L).hashCode();
        }
        int h4 = h() + (o2 * 31);
        for (int i5 = 0; i5 < h(); i5++) {
            h4 = (h4 * 31) + f(i5, s, true).hashCode();
        }
        int a4 = a(true);
        while (a4 != -1) {
            h4 = (h4 * 31) + a4;
            a4 = e(a4, 0, true);
        }
        return h4;
    }

    public final Pair i(T t4, S s, int i4, long j4) {
        Pair j5 = j(t4, s, i4, j4, 0L);
        j5.getClass();
        return j5;
    }

    public final Pair j(T t4, S s, int i4, long j4, long j5) {
        W.a.g(i4, o());
        m(i4, t4, j5);
        if (j4 == -9223372036854775807L) {
            j4 = t4.f2163l;
            if (j4 == -9223372036854775807L) {
                return null;
            }
        }
        int i5 = t4.f2165n;
        f(i5, s, false);
        while (i5 < t4.f2166o && s.f2147e != j4) {
            int i6 = i5 + 1;
            if (f(i6, s, false).f2147e > j4) {
                break;
            }
            i5 = i6;
        }
        f(i5, s, true);
        long j6 = j4 - s.f2147e;
        long j7 = s.f2146d;
        if (j7 != -9223372036854775807L) {
            j6 = Math.min(j6, j7 - 1);
        }
        long max = Math.max(0L, j6);
        Object obj = s.f2144b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i4, int i5, boolean z4) {
        if (i5 == 0) {
            if (i4 == a(z4)) {
                return -1;
            }
            return i4 - 1;
        }
        if (i5 == 1) {
            return i4;
        }
        if (i5 == 2) {
            return i4 == a(z4) ? c(z4) : i4 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i4);

    public abstract T m(int i4, T t4, long j4);

    public final void n(int i4, T t4) {
        m(i4, t4, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
