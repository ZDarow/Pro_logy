package k3;

/* loaded from: classes.dex */
public abstract class g extends c implements f, o3.a, Z2.a {

    /* renamed from: r, reason: collision with root package name */
    public final int f7096r;
    public final int s;

    public g(int i4, Class cls, String str, String str2, int i5) {
        this(i4, b.f7087l, cls, str, str2, i5);
    }

    @Override // k3.c
    public final o3.a a() {
        q.f7105a.getClass();
        return this;
    }

    @Override // k3.f
    public final int e() {
        return this.f7096r;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f7091o.equals(gVar.f7091o) && this.f7092p.equals(gVar.f7092p) && this.s == gVar.s && this.f7096r == gVar.f7096r && this.f7089m.equals(gVar.f7089m) && d().equals(gVar.d());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        o3.a aVar = this.f7088l;
        if (aVar == null) {
            a();
            this.f7088l = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        d();
        return this.f7092p.hashCode() + ((this.f7091o.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        o3.a aVar = this.f7088l;
        if (aVar == null) {
            a();
            this.f7088l = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f7091o;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f7096r = i4;
        this.s = 0;
    }
}
