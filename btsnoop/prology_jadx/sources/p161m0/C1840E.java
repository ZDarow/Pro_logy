package p161m0;

/* renamed from: m0.E */
/* loaded from: classes.dex */
public final class C1840E {

    /* renamed from: a */
    public final p129f2.C1425h0 f7425a;

    /* renamed from: b */
    public final p129f2.C1415c0 f7426b;

    /* renamed from: c */
    public final java.lang.String f7427c;

    /* renamed from: d */
    public final java.lang.String f7428d;

    /* renamed from: e */
    public final java.lang.String f7429e;

    /* renamed from: f */
    public final int f7430f;

    /* renamed from: g */
    public final android.net.Uri f7431g;

    /* renamed from: h */
    public final java.lang.String f7432h;

    /* renamed from: i */
    public final java.lang.String f7433i;

    /* renamed from: j */
    public final java.lang.String f7434j;

    /* renamed from: k */
    public final java.lang.String f7435k;

    /* renamed from: l */
    public final java.lang.String f7436l;

    public C1840E(p161m0.C1839D c1839d) {
        this.f7425a = p129f2.C1425h0.m3214a(c1839d.f7413a);
        this.f7426b = c1839d.f7414b.m3157g();
        java.lang.String str = c1839d.f7416d;
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f7427c = str;
        this.f7428d = c1839d.f7417e;
        this.f7429e = c1839d.f7418f;
        this.f7431g = c1839d.f7419g;
        this.f7432h = c1839d.f7420h;
        this.f7430f = c1839d.f7415c;
        this.f7433i = c1839d.f7421i;
        this.f7434j = c1839d.f7423k;
        this.f7435k = c1839d.f7424l;
        this.f7436l = c1839d.f7422j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p161m0.C1840E.class != obj.getClass()) {
            return false;
        }
        p161m0.C1840E c1840e = (p161m0.C1840E) obj;
        if (this.f7430f == c1840e.f7430f) {
            p129f2.C1425h0 c1425h0 = this.f7425a;
            c1425h0.getClass();
            if (p129f2.AbstractC1444r.m3228h(c1425h0, c1840e.f7425a) && this.f7426b.equals(c1840e.f7426b) && p086W.AbstractC0805y.m1606a(this.f7428d, c1840e.f7428d) && p086W.AbstractC0805y.m1606a(this.f7427c, c1840e.f7427c) && p086W.AbstractC0805y.m1606a(this.f7429e, c1840e.f7429e) && p086W.AbstractC0805y.m1606a(this.f7436l, c1840e.f7436l) && p086W.AbstractC0805y.m1606a(this.f7431g, c1840e.f7431g) && p086W.AbstractC0805y.m1606a(this.f7434j, c1840e.f7434j) && p086W.AbstractC0805y.m1606a(this.f7435k, c1840e.f7435k) && p086W.AbstractC0805y.m1606a(this.f7432h, c1840e.f7432h) && p086W.AbstractC0805y.m1606a(this.f7433i, c1840e.f7433i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f7426b.hashCode() + ((this.f7425a.hashCode() + 217) * 31)) * 31;
        java.lang.String str = this.f7428d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f7427c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f7429e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f7430f) * 31;
        java.lang.String str4 = this.f7436l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        android.net.Uri uri = this.f7431g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        java.lang.String str5 = this.f7434j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f7435k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f7432h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f7433i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
