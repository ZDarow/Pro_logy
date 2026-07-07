package p076T;

/* renamed from: T.U */
/* loaded from: classes.dex */
public abstract class AbstractC0677U {

    /* renamed from: a */
    public static final p076T.C0674Q f2248a = new java.lang.Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [T.Q, java.lang.Object] */
    static {
        p086W.AbstractC0805y.m1587H(0);
        p086W.AbstractC0805y.m1587H(1);
        p086W.AbstractC0805y.m1587H(2);
    }

    /* renamed from: a */
    public int mo1247a(boolean z4) {
        return m1256p() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo1231b(java.lang.Object obj);

    /* renamed from: c */
    public int mo1248c(boolean z4) {
        if (m1256p()) {
            return -1;
        }
        return mo1236o() - 1;
    }

    /* renamed from: d */
    public final int m1249d(int i4, p076T.C0675S c0675s, p076T.C0676T c0676t, int i5, boolean z4) {
        int i6 = mo1232f(i4, c0675s, false).f2225c;
        if (mo1235m(i6, c0676t, 0L).f2246o != i4) {
            return i4 + 1;
        }
        int mo1250e = mo1250e(i6, i5, z4);
        if (mo1250e == -1) {
            return -1;
        }
        return mo1235m(mo1250e, c0676t, 0L).f2245n;
    }

    /* renamed from: e */
    public int mo1250e(int i4, int i5, boolean z4) {
        if (i5 == 0) {
            if (i4 == mo1248c(z4)) {
                return -1;
            }
            return i4 + 1;
        }
        if (i5 == 1) {
            return i4;
        }
        if (i5 == 2) {
            return i4 == mo1248c(z4) ? mo1247a(z4) : i4 + 1;
        }
        throw new java.lang.IllegalStateException();
    }

    public final boolean equals(java.lang.Object obj) {
        int mo1248c;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p076T.AbstractC0677U)) {
            return false;
        }
        p076T.AbstractC0677U abstractC0677U = (p076T.AbstractC0677U) obj;
        if (abstractC0677U.mo1236o() != mo1236o() || abstractC0677U.mo1233h() != mo1233h()) {
            return false;
        }
        p076T.C0676T c0676t = new p076T.C0676T();
        p076T.C0675S c0675s = new p076T.C0675S();
        p076T.C0676T c0676t2 = new p076T.C0676T();
        p076T.C0675S c0675s2 = new p076T.C0675S();
        for (int i4 = 0; i4 < mo1236o(); i4++) {
            if (!mo1235m(i4, c0676t, 0L).equals(abstractC0677U.mo1235m(i4, c0676t2, 0L))) {
                return false;
            }
        }
        for (int i5 = 0; i5 < mo1233h(); i5++) {
            if (!mo1232f(i5, c0675s, true).equals(abstractC0677U.mo1232f(i5, c0675s2, true))) {
                return false;
            }
        }
        int mo1247a = mo1247a(true);
        if (mo1247a != abstractC0677U.mo1247a(true) || (mo1248c = mo1248c(true)) != abstractC0677U.mo1248c(true)) {
            return false;
        }
        while (mo1247a != mo1248c) {
            int mo1250e = mo1250e(mo1247a, 0, true);
            if (mo1250e != abstractC0677U.mo1250e(mo1247a, 0, true)) {
                return false;
            }
            mo1247a = mo1250e;
        }
        return true;
    }

    /* renamed from: f */
    public abstract p076T.C0675S mo1232f(int i4, p076T.C0675S c0675s, boolean z4);

    /* renamed from: g */
    public p076T.C0675S mo1251g(java.lang.Object obj, p076T.C0675S c0675s) {
        return mo1232f(mo1231b(obj), c0675s, true);
    }

    /* renamed from: h */
    public abstract int mo1233h();

    public final int hashCode() {
        p076T.C0676T c0676t = new p076T.C0676T();
        p076T.C0675S c0675s = new p076T.C0675S();
        int mo1236o = mo1236o() + 217;
        for (int i4 = 0; i4 < mo1236o(); i4++) {
            mo1236o = (mo1236o * 31) + mo1235m(i4, c0676t, 0L).hashCode();
        }
        int mo1233h = mo1233h() + (mo1236o * 31);
        for (int i5 = 0; i5 < mo1233h(); i5++) {
            mo1233h = (mo1233h * 31) + mo1232f(i5, c0675s, true).hashCode();
        }
        int mo1247a = mo1247a(true);
        while (mo1247a != -1) {
            mo1233h = (mo1233h * 31) + mo1247a;
            mo1247a = mo1250e(mo1247a, 0, true);
        }
        return mo1233h;
    }

    /* renamed from: i */
    public final android.util.Pair m1252i(p076T.C0676T c0676t, p076T.C0675S c0675s, int i4, long j4) {
        android.util.Pair m1253j = m1253j(c0676t, c0675s, i4, j4, 0L);
        m1253j.getClass();
        return m1253j;
    }

    /* renamed from: j */
    public final android.util.Pair m1253j(p076T.C0676T c0676t, p076T.C0675S c0675s, int i4, long j4, long j5) {
        p086W.AbstractC0781a.m1418g(i4, mo1236o());
        mo1235m(i4, c0676t, j5);
        if (j4 == -9223372036854775807L) {
            j4 = c0676t.f2243l;
            if (j4 == -9223372036854775807L) {
                return null;
            }
        }
        int i5 = c0676t.f2245n;
        mo1232f(i5, c0675s, false);
        while (i5 < c0676t.f2246o && c0675s.f2227e != j4) {
            int i6 = i5 + 1;
            if (mo1232f(i6, c0675s, false).f2227e > j4) {
                break;
            }
            i5 = i6;
        }
        mo1232f(i5, c0675s, true);
        long j6 = j4 - c0675s.f2227e;
        long j7 = c0675s.f2226d;
        if (j7 != -9223372036854775807L) {
            j6 = java.lang.Math.min(j6, j7 - 1);
        }
        long max = java.lang.Math.max(0L, j6);
        java.lang.Object obj = c0675s.f2224b;
        obj.getClass();
        return android.util.Pair.create(obj, java.lang.Long.valueOf(max));
    }

    /* renamed from: k */
    public int mo1254k(int i4, int i5, boolean z4) {
        if (i5 == 0) {
            if (i4 == mo1247a(z4)) {
                return -1;
            }
            return i4 - 1;
        }
        if (i5 == 1) {
            return i4;
        }
        if (i5 == 2) {
            return i4 == mo1247a(z4) ? mo1248c(z4) : i4 - 1;
        }
        throw new java.lang.IllegalStateException();
    }

    /* renamed from: l */
    public abstract java.lang.Object mo1234l(int i4);

    /* renamed from: m */
    public abstract p076T.C0676T mo1235m(int i4, p076T.C0676T c0676t, long j4);

    /* renamed from: n */
    public final void m1255n(int i4, p076T.C0676T c0676t) {
        mo1235m(i4, c0676t, 0L);
    }

    /* renamed from: o */
    public abstract int mo1236o();

    /* renamed from: p */
    public final boolean m1256p() {
        return mo1236o() == 0;
    }
}
