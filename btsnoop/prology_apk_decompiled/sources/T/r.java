package T;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f2338a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2339b;

    static {
        W.y.H(0);
        W.y.H(1);
    }

    public r(String str, String str2) {
        this.f2338a = W.y.N(str);
        this.f2339b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return W.y.a(this.f2338a, rVar.f2338a) && W.y.a(this.f2339b, rVar.f2339b);
    }

    public final int hashCode() {
        int hashCode = this.f2339b.hashCode() * 31;
        String str = this.f2338a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
