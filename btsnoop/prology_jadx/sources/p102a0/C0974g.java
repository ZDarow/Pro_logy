package p102a0;

/* renamed from: a0.g */
/* loaded from: classes.dex */
public final class C0974g {

    /* renamed from: a */
    public final java.lang.String f3599a;

    /* renamed from: b */
    public final p076T.C0702p f3600b;

    /* renamed from: c */
    public final p076T.C0702p f3601c;

    /* renamed from: d */
    public final int f3602d;

    /* renamed from: e */
    public final int f3603e;

    public C0974g(java.lang.String str, p076T.C0702p c0702p, p076T.C0702p c0702p2, int i4, int i5) {
        p086W.AbstractC0781a.m1416e(i4 == 0 || i5 == 0);
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f3599a = str;
        c0702p.getClass();
        this.f3600b = c0702p;
        c0702p2.getClass();
        this.f3601c = c0702p2;
        this.f3602d = i4;
        this.f3603e = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p102a0.C0974g.class != obj.getClass()) {
            return false;
        }
        p102a0.C0974g c0974g = (p102a0.C0974g) obj;
        return this.f3602d == c0974g.f3602d && this.f3603e == c0974g.f3603e && this.f3599a.equals(c0974g.f3599a) && this.f3600b.equals(c0974g.f3600b) && this.f3601c.equals(c0974g.f3601c);
    }

    public final int hashCode() {
        return this.f3601c.hashCode() + ((this.f3600b.hashCode() + ((this.f3599a.hashCode() + ((((527 + this.f3602d) * 31) + this.f3603e) * 31)) * 31)) * 31);
    }
}
