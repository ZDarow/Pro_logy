package p086W;

/* renamed from: W.s */
/* loaded from: classes.dex */
public final class C0799s {

    /* renamed from: c */
    public static final p086W.C0799s f2789c = new p086W.C0799s(-1, -1);

    /* renamed from: a */
    public final int f2790a;

    /* renamed from: b */
    public final int f2791b;

    static {
        new p086W.C0799s(0, 0);
    }

    public C0799s(int i4, int i5) {
        p086W.AbstractC0781a.m1416e((i4 == -1 || i4 >= 0) && (i5 == -1 || i5 >= 0));
        this.f2790a = i4;
        this.f2791b = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p086W.C0799s)) {
            return false;
        }
        p086W.C0799s c0799s = (p086W.C0799s) obj;
        return this.f2790a == c0799s.f2790a && this.f2791b == c0799s.f2791b;
    }

    public final int hashCode() {
        int i4 = this.f2790a;
        return ((i4 >>> 16) | (i4 << 16)) ^ this.f2791b;
    }

    public final java.lang.String toString() {
        return this.f2790a + "x" + this.f2791b;
    }
}
