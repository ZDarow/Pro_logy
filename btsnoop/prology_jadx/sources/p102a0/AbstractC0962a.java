package p102a0;

/* renamed from: a0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0962a extends p076T.AbstractC0677U {

    /* renamed from: d */
    public static final /* synthetic */ int f3501d = 0;

    /* renamed from: b */
    public final int f3502b;

    /* renamed from: c */
    public final p179q0.C1991d0 f3503c;

    public AbstractC0962a(p179q0.C1991d0 c1991d0) {
        this.f3503c = c1991d0;
        this.f3502b = c1991d0.f8129b.length;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: a */
    public final int mo1247a(boolean z4) {
        if (this.f3502b == 0) {
            return -1;
        }
        int i4 = 0;
        if (z4) {
            int[] iArr = this.f3503c.f8129b;
            i4 = iArr.length > 0 ? iArr[0] : -1;
        }
        while (mo1971y(i4).m1256p()) {
            i4 = m1969w(i4, z4);
            if (i4 == -1) {
                return -1;
            }
        }
        return mo1971y(i4).mo1247a(z4) + mo1968v(i4);
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: b */
    public final int mo1231b(java.lang.Object obj) {
        int mo1231b;
        if (!(obj instanceof android.util.Pair)) {
            return -1;
        }
        android.util.Pair pair = (android.util.Pair) obj;
        java.lang.Object obj2 = pair.first;
        java.lang.Object obj3 = pair.second;
        int mo1963q = mo1963q(obj2);
        if (mo1963q == -1 || (mo1231b = mo1971y(mo1963q).mo1231b(obj3)) == -1) {
            return -1;
        }
        return mo1967u(mo1963q) + mo1231b;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: c */
    public final int mo1248c(boolean z4) {
        int i4;
        int i5 = this.f3502b;
        if (i5 == 0) {
            return -1;
        }
        if (z4) {
            int[] iArr = this.f3503c.f8129b;
            i4 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i4 = i5 - 1;
        }
        while (mo1971y(i4).m1256p()) {
            i4 = m1970x(i4, z4);
            if (i4 == -1) {
                return -1;
            }
        }
        return mo1971y(i4).mo1248c(z4) + mo1968v(i4);
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: e */
    public final int mo1250e(int i4, int i5, boolean z4) {
        int mo1965s = mo1965s(i4);
        int mo1968v = mo1968v(mo1965s);
        int mo1250e = mo1971y(mo1965s).mo1250e(i4 - mo1968v, i5 == 2 ? 0 : i5, z4);
        if (mo1250e != -1) {
            return mo1968v + mo1250e;
        }
        int m1969w = m1969w(mo1965s, z4);
        while (m1969w != -1 && mo1971y(m1969w).m1256p()) {
            m1969w = m1969w(m1969w, z4);
        }
        if (m1969w != -1) {
            return mo1971y(m1969w).mo1247a(z4) + mo1968v(m1969w);
        }
        if (i5 == 2) {
            return mo1247a(z4);
        }
        return -1;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: f */
    public final p076T.C0675S mo1232f(int i4, p076T.C0675S c0675s, boolean z4) {
        int mo1964r = mo1964r(i4);
        int mo1968v = mo1968v(mo1964r);
        mo1971y(mo1964r).mo1232f(i4 - mo1967u(mo1964r), c0675s, z4);
        c0675s.f2225c += mo1968v;
        if (z4) {
            java.lang.Object mo1966t = mo1966t(mo1964r);
            java.lang.Object obj = c0675s.f2224b;
            obj.getClass();
            c0675s.f2224b = android.util.Pair.create(mo1966t, obj);
        }
        return c0675s;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: g */
    public final p076T.C0675S mo1251g(java.lang.Object obj, p076T.C0675S c0675s) {
        android.util.Pair pair = (android.util.Pair) obj;
        java.lang.Object obj2 = pair.first;
        java.lang.Object obj3 = pair.second;
        int mo1963q = mo1963q(obj2);
        int mo1968v = mo1968v(mo1963q);
        mo1971y(mo1963q).mo1251g(obj3, c0675s);
        c0675s.f2225c += mo1968v;
        c0675s.f2224b = obj;
        return c0675s;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: k */
    public final int mo1254k(int i4, int i5, boolean z4) {
        int mo1965s = mo1965s(i4);
        int mo1968v = mo1968v(mo1965s);
        int mo1254k = mo1971y(mo1965s).mo1254k(i4 - mo1968v, i5 == 2 ? 0 : i5, z4);
        if (mo1254k != -1) {
            return mo1968v + mo1254k;
        }
        int m1970x = m1970x(mo1965s, z4);
        while (m1970x != -1 && mo1971y(m1970x).m1256p()) {
            m1970x = m1970x(m1970x, z4);
        }
        if (m1970x != -1) {
            return mo1971y(m1970x).mo1248c(z4) + mo1968v(m1970x);
        }
        if (i5 == 2) {
            return mo1248c(z4);
        }
        return -1;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: l */
    public final java.lang.Object mo1234l(int i4) {
        int mo1964r = mo1964r(i4);
        return android.util.Pair.create(mo1966t(mo1964r), mo1971y(mo1964r).mo1234l(i4 - mo1967u(mo1964r)));
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: m */
    public final p076T.C0676T mo1235m(int i4, p076T.C0676T c0676t, long j4) {
        int mo1965s = mo1965s(i4);
        int mo1968v = mo1968v(mo1965s);
        int mo1967u = mo1967u(mo1965s);
        mo1971y(mo1965s).mo1235m(i4 - mo1968v, c0676t, j4);
        java.lang.Object mo1966t = mo1966t(mo1965s);
        if (!p076T.C0676T.f2230q.equals(c0676t.f2232a)) {
            mo1966t = android.util.Pair.create(mo1966t, c0676t.f2232a);
        }
        c0676t.f2232a = mo1966t;
        c0676t.f2245n += mo1967u;
        c0676t.f2246o += mo1967u;
        return c0676t;
    }

    /* renamed from: q */
    public abstract int mo1963q(java.lang.Object obj);

    /* renamed from: r */
    public abstract int mo1964r(int i4);

    /* renamed from: s */
    public abstract int mo1965s(int i4);

    /* renamed from: t */
    public abstract java.lang.Object mo1966t(int i4);

    /* renamed from: u */
    public abstract int mo1967u(int i4);

    /* renamed from: v */
    public abstract int mo1968v(int i4);

    /* renamed from: w */
    public final int m1969w(int i4, boolean z4) {
        if (!z4) {
            if (i4 < this.f3502b - 1) {
                return i4 + 1;
            }
            return -1;
        }
        p179q0.C1991d0 c1991d0 = this.f3503c;
        int i5 = c1991d0.f8130c[i4] + 1;
        int[] iArr = c1991d0.f8129b;
        if (i5 < iArr.length) {
            return iArr[i5];
        }
        return -1;
    }

    /* renamed from: x */
    public final int m1970x(int i4, boolean z4) {
        if (!z4) {
            if (i4 > 0) {
                return i4 - 1;
            }
            return -1;
        }
        p179q0.C1991d0 c1991d0 = this.f3503c;
        int i5 = c1991d0.f8130c[i4] - 1;
        if (i5 >= 0) {
            return c1991d0.f8129b[i5];
        }
        return -1;
    }

    /* renamed from: y */
    public abstract p076T.AbstractC0677U mo1971y(int i4);
}
