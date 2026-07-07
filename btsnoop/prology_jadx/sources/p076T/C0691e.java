package p076T;

/* renamed from: T.e */
/* loaded from: classes.dex */
public final class C0691e {

    /* renamed from: e */
    public static final p076T.C0691e f2315e = new p076T.C0691e(0, 0, 1);

    /* renamed from: a */
    public final int f2316a;

    /* renamed from: b */
    public final int f2317b;

    /* renamed from: c */
    public final int f2318c;

    /* renamed from: d */
    public p043K2.C0339o f2319d;

    static {
        p009B2.AbstractC0051h.m155n(0, 1, 2, 3, 4);
    }

    public C0691e(int i4, int i5, int i6) {
        this.f2316a = i4;
        this.f2317b = i5;
        this.f2318c = i6;
    }

    /* renamed from: a */
    public final p043K2.C0339o m1269a() {
        if (this.f2319d == null) {
            this.f2319d = new p043K2.C0339o(this);
        }
        return this.f2319d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0691e.class != obj.getClass()) {
            return false;
        }
        p076T.C0691e c0691e = (p076T.C0691e) obj;
        return this.f2316a == c0691e.f2316a && this.f2317b == c0691e.f2317b && this.f2318c == c0691e.f2318c;
    }

    public final int hashCode() {
        return (((((((527 + this.f2316a) * 31) + this.f2317b) * 31) + this.f2318c) * 31) + 1) * 31;
    }
}
