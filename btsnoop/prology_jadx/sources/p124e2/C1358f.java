package p124e2;

/* renamed from: e2.f */
/* loaded from: classes.dex */
public final class C1358f {

    /* renamed from: a */
    public final /* synthetic */ int f5634a;

    /* renamed from: b */
    public final java.lang.String f5635b;

    public /* synthetic */ C1358f(java.lang.String str, int i4) {
        this.f5634a = i4;
        this.f5635b = str;
    }

    /* renamed from: c */
    public static p124e2.C1358f m3113c(p086W.C0798r c0798r) {
        java.lang.String str;
        c0798r.m1538H(2);
        int m1559u = c0798r.m1559u();
        int i4 = m1559u >> 1;
        int m1559u2 = ((c0798r.m1559u() >> 3) & 31) | ((m1559u & 1) << 5);
        if (i4 == 4 || i4 == 5 || i4 == 7) {
            str = "dvhe";
        } else if (i4 == 8) {
            str = "hev1";
        } else {
            if (i4 != 9) {
                return null;
            }
            str = "avc3";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i4);
        sb.append(m1559u2 >= 10 ? "." : ".0");
        sb.append(m1559u2);
        return new p124e2.C1358f(sb.toString(), 2);
    }

    /* renamed from: a */
    public void m3114a(java.lang.StringBuilder sb, java.util.Iterator it) {
        try {
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                java.util.Objects.requireNonNull(next);
                sb.append(next instanceof java.lang.CharSequence ? (java.lang.CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((java.lang.CharSequence) this.f5635b);
                    java.lang.Object next2 = it.next();
                    java.util.Objects.requireNonNull(next2);
                    sb.append(next2 instanceof java.lang.CharSequence ? (java.lang.CharSequence) next2 : next2.toString());
                }
            }
        } catch (java.io.IOException e4) {
            throw new java.lang.AssertionError(e4);
        }
    }

    /* renamed from: b */
    public java.lang.String m3115b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        m3114a(sb, it);
        return sb.toString();
    }

    public java.lang.String toString() {
        switch (this.f5634a) {
            case 1:
                return "<" + this.f5635b + '>';
            default:
                return super.toString();
        }
    }

    public C1358f(java.lang.String str) {
        this.f5634a = 0;
        str.getClass();
        this.f5635b = str;
    }
}
