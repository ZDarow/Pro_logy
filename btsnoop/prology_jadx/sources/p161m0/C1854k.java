package p161m0;

/* renamed from: m0.k */
/* loaded from: classes.dex */
public final class C1854k {

    /* renamed from: a */
    public final int f7510a;

    /* renamed from: b */
    public final int f7511b;

    /* renamed from: c */
    public final p076T.C0702p f7512c;

    /* renamed from: d */
    public final p129f2.C1425h0 f7513d;

    /* renamed from: e */
    public final java.lang.String f7514e;

    public C1854k(p076T.C0702p c0702p, int i4, int i5, p129f2.C1425h0 c1425h0, java.lang.String str) {
        this.f7510a = i4;
        this.f7511b = i5;
        this.f7512c = c0702p;
        this.f7513d = p129f2.C1425h0.m3214a(c1425h0);
        this.f7514e = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p161m0.C1854k.class != obj.getClass()) {
            return false;
        }
        p161m0.C1854k c1854k = (p161m0.C1854k) obj;
        if (this.f7510a == c1854k.f7510a && this.f7511b == c1854k.f7511b && this.f7512c.equals(c1854k.f7512c)) {
            p129f2.C1425h0 c1425h0 = this.f7513d;
            c1425h0.getClass();
            if (p129f2.AbstractC1444r.m3228h(c1425h0, c1854k.f7513d) && this.f7514e.equals(c1854k.f7514e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7514e.hashCode() + ((this.f7513d.hashCode() + ((this.f7512c.hashCode() + ((((217 + this.f7510a) * 31) + this.f7511b) * 31)) * 31)) * 31);
    }
}
