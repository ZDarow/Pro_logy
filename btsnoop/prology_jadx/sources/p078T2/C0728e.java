package p078T2;

/* renamed from: T2.e */
/* loaded from: classes.dex */
public final class C0728e {

    /* renamed from: a */
    public java.lang.String f2521a;

    /* renamed from: b */
    public java.lang.String f2522b;

    /* renamed from: c */
    public java.lang.String f2523c;

    /* renamed from: d */
    public java.lang.String f2524d;

    /* renamed from: e */
    public java.util.Map f2525e;

    /* renamed from: f */
    public p078T2.EnumC0731h f2526f;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p078T2.C0728e.class != obj.getClass()) {
            return false;
        }
        p078T2.C0728e c0728e = (p078T2.C0728e) obj;
        return java.util.Objects.equals(this.f2521a, c0728e.f2521a) && java.util.Objects.equals(this.f2522b, c0728e.f2522b) && java.util.Objects.equals(this.f2523c, c0728e.f2523c) && java.util.Objects.equals(this.f2524d, c0728e.f2524d) && this.f2525e.equals(c0728e.f2525e) && java.util.Objects.equals(this.f2526f, c0728e.f2526f);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f2521a, this.f2522b, this.f2523c, this.f2524d, this.f2525e, this.f2526f);
    }
}
