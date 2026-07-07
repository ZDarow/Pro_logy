package p112c0;

/* renamed from: c0.l */
/* loaded from: classes.dex */
public final class C1230l {

    /* renamed from: d */
    public static final p112c0.C1230l f4791d = new java.lang.Object().m2911a();

    /* renamed from: a */
    public final boolean f4792a;

    /* renamed from: b */
    public final boolean f4793b;

    /* renamed from: c */
    public final boolean f4794c;

    public C1230l(p112c0.C1229k c1229k) {
        this.f4792a = c1229k.f4788a;
        this.f4793b = c1229k.f4789b;
        this.f4794c = c1229k.f4790c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p112c0.C1230l.class != obj.getClass()) {
            return false;
        }
        p112c0.C1230l c1230l = (p112c0.C1230l) obj;
        return this.f4792a == c1230l.f4792a && this.f4793b == c1230l.f4793b && this.f4794c == c1230l.f4794c;
    }

    public final int hashCode() {
        return ((this.f4792a ? 1 : 0) << 2) + ((this.f4793b ? 1 : 0) << 1) + (this.f4794c ? 1 : 0);
    }
}
