package a0;

import android.util.Pair;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0121a extends T.U {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3383d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f3384b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.d0 f3385c;

    public AbstractC0121a(q0.d0 d0Var) {
        this.f3385c = d0Var;
        this.f3384b = d0Var.f7826b.length;
    }

    @Override // T.U
    public final int a(boolean z4) {
        if (this.f3384b == 0) {
            return -1;
        }
        int i4 = 0;
        if (z4) {
            int[] iArr = this.f3385c.f7826b;
            i4 = iArr.length > 0 ? iArr[0] : -1;
        }
        while (y(i4).p()) {
            i4 = w(i4, z4);
            if (i4 == -1) {
                return -1;
            }
        }
        return y(i4).a(z4) + v(i4);
    }

    @Override // T.U
    public final int b(Object obj) {
        int b4;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q4 = q(obj2);
        if (q4 == -1 || (b4 = y(q4).b(obj3)) == -1) {
            return -1;
        }
        return u(q4) + b4;
    }

    @Override // T.U
    public final int c(boolean z4) {
        int i4;
        int i5 = this.f3384b;
        if (i5 == 0) {
            return -1;
        }
        if (z4) {
            int[] iArr = this.f3385c.f7826b;
            i4 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i4 = i5 - 1;
        }
        while (y(i4).p()) {
            i4 = x(i4, z4);
            if (i4 == -1) {
                return -1;
            }
        }
        return y(i4).c(z4) + v(i4);
    }

    @Override // T.U
    public final int e(int i4, int i5, boolean z4) {
        int s = s(i4);
        int v4 = v(s);
        int e4 = y(s).e(i4 - v4, i5 == 2 ? 0 : i5, z4);
        if (e4 != -1) {
            return v4 + e4;
        }
        int w = w(s, z4);
        while (w != -1 && y(w).p()) {
            w = w(w, z4);
        }
        if (w != -1) {
            return y(w).a(z4) + v(w);
        }
        if (i5 == 2) {
            return a(z4);
        }
        return -1;
    }

    @Override // T.U
    public final T.S f(int i4, T.S s, boolean z4) {
        int r4 = r(i4);
        int v4 = v(r4);
        y(r4).f(i4 - u(r4), s, z4);
        s.f2145c += v4;
        if (z4) {
            Object t4 = t(r4);
            Object obj = s.f2144b;
            obj.getClass();
            s.f2144b = Pair.create(t4, obj);
        }
        return s;
    }

    @Override // T.U
    public final T.S g(Object obj, T.S s) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q4 = q(obj2);
        int v4 = v(q4);
        y(q4).g(obj3, s);
        s.f2145c += v4;
        s.f2144b = obj;
        return s;
    }

    @Override // T.U
    public final int k(int i4, int i5, boolean z4) {
        int s = s(i4);
        int v4 = v(s);
        int k4 = y(s).k(i4 - v4, i5 == 2 ? 0 : i5, z4);
        if (k4 != -1) {
            return v4 + k4;
        }
        int x3 = x(s, z4);
        while (x3 != -1 && y(x3).p()) {
            x3 = x(x3, z4);
        }
        if (x3 != -1) {
            return y(x3).c(z4) + v(x3);
        }
        if (i5 == 2) {
            return c(z4);
        }
        return -1;
    }

    @Override // T.U
    public final Object l(int i4) {
        int r4 = r(i4);
        return Pair.create(t(r4), y(r4).l(i4 - u(r4)));
    }

    @Override // T.U
    public final T.T m(int i4, T.T t4, long j4) {
        int s = s(i4);
        int v4 = v(s);
        int u4 = u(s);
        y(s).m(i4 - v4, t4, j4);
        Object t5 = t(s);
        if (!T.T.f2150q.equals(t4.f2152a)) {
            t5 = Pair.create(t5, t4.f2152a);
        }
        t4.f2152a = t5;
        t4.f2165n += u4;
        t4.f2166o += u4;
        return t4;
    }

    public abstract int q(Object obj);

    public abstract int r(int i4);

    public abstract int s(int i4);

    public abstract Object t(int i4);

    public abstract int u(int i4);

    public abstract int v(int i4);

    public final int w(int i4, boolean z4) {
        if (!z4) {
            if (i4 < this.f3384b - 1) {
                return i4 + 1;
            }
            return -1;
        }
        q0.d0 d0Var = this.f3385c;
        int i5 = d0Var.f7827c[i4] + 1;
        int[] iArr = d0Var.f7826b;
        if (i5 < iArr.length) {
            return iArr[i5];
        }
        return -1;
    }

    public final int x(int i4, boolean z4) {
        if (!z4) {
            if (i4 > 0) {
                return i4 - 1;
            }
            return -1;
        }
        q0.d0 d0Var = this.f3385c;
        int i5 = d0Var.f7827c[i4] - 1;
        if (i5 >= 0) {
            return d0Var.f7826b[i5];
        }
        return -1;
    }

    public abstract T.U y(int i4);
}
