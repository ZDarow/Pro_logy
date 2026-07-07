package T;

import B2.AbstractC0007h;
import java.util.Collections;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final C0103y f2067b;

    /* renamed from: c, reason: collision with root package name */
    public final C0102x f2068c;

    /* renamed from: d, reason: collision with root package name */
    public final E f2069d;

    /* renamed from: e, reason: collision with root package name */
    public final C0100v f2070e;

    /* renamed from: f, reason: collision with root package name */
    public final C0104z f2071f;

    static {
        C0098t c0098t = new C0098t();
        f2.G g4 = f2.I.f5510m;
        f2.c0 c0Var = f2.c0.f5550p;
        Collections.emptyList();
        f2.c0 c0Var2 = f2.c0.f5550p;
        C0101w c0101w = new C0101w();
        C0104z c0104z = C0104z.f2370a;
        c0098t.a();
        c0101w.a();
        E e4 = E.f2095y;
        AbstractC0007h.n(0, 1, 2, 3, 4);
        W.y.H(5);
    }

    public B(String str, C0100v c0100v, C0103y c0103y, C0102x c0102x, E e4, C0104z c0104z) {
        this.f2066a = str;
        this.f2067b = c0103y;
        this.f2068c = c0102x;
        this.f2069d = e4;
        this.f2070e = c0100v;
        this.f2071f = c0104z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, T.t] */
    public final C0097s a() {
        ?? obj = new Object();
        obj.f2343d = new C0098t();
        obj.f2344e = new F1.g();
        obj.f2345f = Collections.emptyList();
        obj.f2346g = f2.c0.f5550p;
        obj.f2350k = new C0101w();
        obj.f2351l = C0104z.f2370a;
        obj.f2348i = -9223372036854775807L;
        C0100v c0100v = this.f2070e;
        ?? obj2 = new Object();
        obj2.f2352a = c0100v.f2353a;
        obj.f2343d = obj2;
        obj.f2340a = this.f2066a;
        obj.f2349j = this.f2069d;
        obj.f2350k = this.f2068c.a();
        obj.f2351l = this.f2071f;
        C0103y c0103y = this.f2067b;
        if (c0103y != null) {
            obj.f2342c = c0103y.f2365b;
            obj.f2341b = c0103y.f2364a;
            obj.f2345f = c0103y.f2366c;
            obj.f2346g = c0103y.f2367d;
            obj.f2347h = c0103y.f2368e;
            obj.f2344e = new F1.g();
            obj.f2348i = c0103y.f2369f;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b4 = (B) obj;
        return W.y.a(this.f2066a, b4.f2066a) && this.f2070e.equals(b4.f2070e) && W.y.a(this.f2067b, b4.f2067b) && this.f2068c.equals(b4.f2068c) && W.y.a(this.f2069d, b4.f2069d) && W.y.a(this.f2071f, b4.f2071f);
    }

    public final int hashCode() {
        int hashCode = this.f2066a.hashCode() * 31;
        C0103y c0103y = this.f2067b;
        int hashCode2 = (this.f2069d.hashCode() + ((this.f2070e.hashCode() + ((this.f2068c.hashCode() + ((hashCode + (c0103y != null ? c0103y.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f2071f.getClass();
        return hashCode2;
    }
}
