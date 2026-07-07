package p185r1;

/* renamed from: r1.i */
/* loaded from: classes.dex */
public final class C2066i implements java.lang.Comparable {

    /* renamed from: q */
    public static final p185r1.C2066i f8401q;

    /* renamed from: l */
    public final int f8402l;

    /* renamed from: m */
    public final int f8403m;

    /* renamed from: n */
    public final int f8404n;

    /* renamed from: o */
    public final java.lang.String f8405o;

    /* renamed from: p */
    public final p100Z2.C0932e f8406p = new p100Z2.C0932e(new p014C3.C0146c(4, this));

    static {
        new p185r1.C2066i(0, 0, 0, "");
        f8401q = new p185r1.C2066i(0, 1, 0, "");
        new p185r1.C2066i(1, 0, 0, "");
    }

    public C2066i(int i4, int i5, int i6, java.lang.String str) {
        this.f8402l = i4;
        this.f8403m = i5;
        this.f8404n = i6;
        this.f8405o = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        p185r1.C2066i c2066i = (p185r1.C2066i) obj;
        p154k3.AbstractC1803h.m3779e(c2066i, "other");
        java.lang.Object m1762a = this.f8406p.m1762a();
        p154k3.AbstractC1803h.m3778d(m1762a, "<get-bigInteger>(...)");
        java.lang.Object m1762a2 = c2066i.f8406p.m1762a();
        p154k3.AbstractC1803h.m3778d(m1762a2, "<get-bigInteger>(...)");
        return ((java.math.BigInteger) m1762a).compareTo((java.math.BigInteger) m1762a2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p185r1.C2066i)) {
            return false;
        }
        p185r1.C2066i c2066i = (p185r1.C2066i) obj;
        return this.f8402l == c2066i.f8402l && this.f8403m == c2066i.f8403m && this.f8404n == c2066i.f8404n;
    }

    public final int hashCode() {
        return ((((527 + this.f8402l) * 31) + this.f8403m) * 31) + this.f8404n;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.f8405o;
        if (p182q3.AbstractC2032i.m4078l0(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f8402l + '.' + this.f8403m + '.' + this.f8404n + str;
    }
}
