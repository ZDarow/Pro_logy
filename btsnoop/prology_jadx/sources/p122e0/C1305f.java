package p122e0;

/* renamed from: e0.f */
/* loaded from: classes.dex */
public final class C1305f {

    /* renamed from: a */
    public final java.lang.String f5242a;

    /* renamed from: b */
    public final java.lang.String f5243b;

    /* renamed from: c */
    public final java.lang.String f5244c;

    public C1305f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f5242a = str;
        this.f5243b = str2;
        this.f5244c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p122e0.C1305f.class != obj.getClass()) {
            return false;
        }
        p122e0.C1305f c1305f = (p122e0.C1305f) obj;
        return p086W.AbstractC0805y.m1606a(this.f5242a, c1305f.f5242a) && p086W.AbstractC0805y.m1606a(this.f5243b, c1305f.f5243b) && p086W.AbstractC0805y.m1606a(this.f5244c, c1305f.f5244c);
    }

    public final int hashCode() {
        int hashCode = this.f5242a.hashCode() * 31;
        java.lang.String str = this.f5243b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f5244c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
