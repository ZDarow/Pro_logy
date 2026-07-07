package k3;

import B2.AbstractC0007h;

/* loaded from: classes.dex */
public abstract class l extends c implements o3.c {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7100r;

    public l(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f7100r = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return d().equals(lVar.d()) && this.f7091o.equals(lVar.f7091o) && this.f7092p.equals(lVar.f7092p) && this.f7089m.equals(lVar.f7089m);
        }
        if (obj instanceof o3.c) {
            return obj.equals(f());
        }
        return false;
    }

    public final o3.a f() {
        if (this.f7100r) {
            return this;
        }
        o3.a aVar = this.f7088l;
        if (aVar != null) {
            return aVar;
        }
        o3.a a4 = a();
        this.f7088l = a4;
        return a4;
    }

    public final int hashCode() {
        return this.f7092p.hashCode() + ((this.f7091o.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        o3.a f4 = f();
        return f4 != this ? f4.toString() : AbstractC0007h.m(new StringBuilder("property "), this.f7091o, " (Kotlin reflection is not available)");
    }
}
