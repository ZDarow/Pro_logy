package T;

import C.C0023j;

/* renamed from: T.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090k {

    /* renamed from: a, reason: collision with root package name */
    public final int f2258a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2259b;

    static {
        C0023j c0023j = new C0023j(1);
        W.a.e(c0023j.f320b <= c0023j.f321c);
        new C0090k(c0023j);
        W.y.H(0);
        W.y.H(1);
        W.y.H(2);
        W.y.H(3);
    }

    public C0090k(C0023j c0023j) {
        c0023j.getClass();
        this.f2258a = c0023j.f320b;
        this.f2259b = c0023j.f321c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0090k)) {
            return false;
        }
        C0090k c0090k = (C0090k) obj;
        c0090k.getClass();
        return this.f2258a == c0090k.f2258a && this.f2259b == c0090k.f2259b && W.y.a(null, null);
    }

    public final int hashCode() {
        return (((16337 + this.f2258a) * 31) + this.f2259b) * 31;
    }
}
