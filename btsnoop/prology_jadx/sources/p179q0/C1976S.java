package p179q0;

/* renamed from: q0.S */
/* loaded from: classes.dex */
public final class C1976S {

    /* renamed from: a */
    public final int f8010a;

    /* renamed from: b */
    public final boolean f8011b;

    public C1976S(int i4, boolean z4) {
        this.f8010a = i4;
        this.f8011b = z4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p179q0.C1976S.class != obj.getClass()) {
            return false;
        }
        p179q0.C1976S c1976s = (p179q0.C1976S) obj;
        return this.f8010a == c1976s.f8010a && this.f8011b == c1976s.f8011b;
    }

    public final int hashCode() {
        return (this.f8010a * 31) + (this.f8011b ? 1 : 0);
    }
}
