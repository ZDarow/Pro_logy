package p122e0;

/* renamed from: e0.i */
/* loaded from: classes.dex */
public final class C1308i {

    /* renamed from: a */
    public final java.lang.String f5253a;

    /* renamed from: b */
    public final java.lang.String f5254b;

    /* renamed from: c */
    public final java.lang.String f5255c;

    /* renamed from: d */
    public final java.lang.String f5256d;

    /* renamed from: e */
    public final java.lang.String f5257e;

    public C1308i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f5253a = str;
        this.f5254b = str2;
        this.f5255c = str3;
        this.f5256d = str4;
        this.f5257e = str5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p122e0.C1308i)) {
            return false;
        }
        p122e0.C1308i c1308i = (p122e0.C1308i) obj;
        return p086W.AbstractC0805y.m1606a(this.f5253a, c1308i.f5253a) && p086W.AbstractC0805y.m1606a(this.f5254b, c1308i.f5254b) && p086W.AbstractC0805y.m1606a(this.f5255c, c1308i.f5255c) && p086W.AbstractC0805y.m1606a(this.f5256d, c1308i.f5256d) && p086W.AbstractC0805y.m1606a(this.f5257e, c1308i.f5257e);
    }

    public final int hashCode() {
        java.lang.String str = this.f5253a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f5254b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f5255c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        java.lang.String str4 = this.f5256d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        java.lang.String str5 = this.f5257e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
