package p076T;

/* renamed from: T.W */
/* loaded from: classes.dex */
public final class C0679W {

    /* renamed from: d */
    public static final p076T.C0679W f2254d = new p076T.C0679W(new p043K2.C0341q());

    /* renamed from: a */
    public final int f2255a;

    /* renamed from: b */
    public final boolean f2256b;

    /* renamed from: c */
    public final boolean f2257c;

    static {
        p086W.AbstractC0805y.m1587H(1);
        p086W.AbstractC0805y.m1587H(2);
        p086W.AbstractC0805y.m1587H(3);
    }

    public C0679W(p043K2.C0341q c0341q) {
        this.f2255a = c0341q.f1062a;
        this.f2256b = c0341q.f1063b;
        this.f2257c = c0341q.f1064c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0679W.class != obj.getClass()) {
            return false;
        }
        p076T.C0679W c0679w = (p076T.C0679W) obj;
        return this.f2255a == c0679w.f2255a && this.f2256b == c0679w.f2256b && this.f2257c == c0679w.f2257c;
    }

    public final int hashCode() {
        return ((((this.f2255a + 31) * 31) + (this.f2256b ? 1 : 0)) * 31) + (this.f2257c ? 1 : 0);
    }
}
