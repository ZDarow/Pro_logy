package p161m0;

/* renamed from: m0.c */
/* loaded from: classes.dex */
public final class C1846c {

    /* renamed from: a */
    public final java.lang.String f7460a;

    /* renamed from: b */
    public final int f7461b;

    /* renamed from: c */
    public final java.lang.String f7462c;

    /* renamed from: d */
    public final int f7463d;

    /* renamed from: e */
    public final int f7464e;

    /* renamed from: f */
    public final java.lang.String f7465f;

    /* renamed from: g */
    public final java.lang.String f7466g;

    /* renamed from: h */
    public final java.lang.String f7467h;

    /* renamed from: i */
    public final p129f2.C1425h0 f7468i;

    /* renamed from: j */
    public final p161m0.C1845b f7469j;

    public C1846c(p161m0.C1844a c1844a, p129f2.C1425h0 c1425h0, p161m0.C1845b c1845b) {
        this.f7460a = c1844a.f7447a;
        this.f7461b = c1844a.f7448b;
        this.f7462c = c1844a.f7449c;
        this.f7463d = c1844a.f7450d;
        this.f7465f = c1844a.f7453g;
        this.f7466g = c1844a.f7454h;
        this.f7464e = c1844a.f7452f;
        this.f7467h = c1844a.f7455i;
        this.f7468i = c1425h0;
        this.f7469j = c1845b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p161m0.C1846c.class != obj.getClass()) {
            return false;
        }
        p161m0.C1846c c1846c = (p161m0.C1846c) obj;
        if (this.f7460a.equals(c1846c.f7460a) && this.f7461b == c1846c.f7461b && this.f7462c.equals(c1846c.f7462c) && this.f7463d == c1846c.f7463d && this.f7464e == c1846c.f7464e) {
            p129f2.C1425h0 c1425h0 = this.f7468i;
            c1425h0.getClass();
            if (p129f2.AbstractC1444r.m3228h(c1425h0, c1846c.f7468i) && this.f7469j.equals(c1846c.f7469j) && p086W.AbstractC0805y.m1606a(this.f7465f, c1846c.f7465f) && p086W.AbstractC0805y.m1606a(this.f7466g, c1846c.f7466g) && p086W.AbstractC0805y.m1606a(this.f7467h, c1846c.f7467h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f7469j.hashCode() + ((this.f7468i.hashCode() + ((((((this.f7462c.hashCode() + ((((this.f7460a.hashCode() + 217) * 31) + this.f7461b) * 31)) * 31) + this.f7463d) * 31) + this.f7464e) * 31)) * 31)) * 31;
        java.lang.String str = this.f7465f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f7466g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f7467h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
