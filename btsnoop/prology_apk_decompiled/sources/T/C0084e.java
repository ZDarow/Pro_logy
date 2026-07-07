package T;

import B2.AbstractC0007h;

/* renamed from: T.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084e {

    /* renamed from: e, reason: collision with root package name */
    public static final C0084e f2235e = new C0084e(0, 0, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2238c;

    /* renamed from: d, reason: collision with root package name */
    public K2.o f2239d;

    static {
        AbstractC0007h.n(0, 1, 2, 3, 4);
    }

    public C0084e(int i4, int i5, int i6) {
        this.f2236a = i4;
        this.f2237b = i5;
        this.f2238c = i6;
    }

    public final K2.o a() {
        if (this.f2239d == null) {
            this.f2239d = new K2.o(this);
        }
        return this.f2239d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0084e.class != obj.getClass()) {
            return false;
        }
        C0084e c0084e = (C0084e) obj;
        return this.f2236a == c0084e.f2236a && this.f2237b == c0084e.f2237b && this.f2238c == c0084e.f2238c;
    }

    public final int hashCode() {
        return (((((((527 + this.f2236a) * 31) + this.f2237b) * 31) + this.f2238c) * 31) + 1) * 31;
    }
}
