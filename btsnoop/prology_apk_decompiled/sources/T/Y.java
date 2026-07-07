package T;

import B2.AbstractC0007h;
import f2.h0;

/* loaded from: classes.dex */
public class Y {

    /* renamed from: a, reason: collision with root package name */
    public final int f2195a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2196b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2197c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2198d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2199e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2200f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2201g;

    /* renamed from: h, reason: collision with root package name */
    public final f2.c0 f2202h;

    /* renamed from: i, reason: collision with root package name */
    public final f2.c0 f2203i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2204j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2205k;

    /* renamed from: l, reason: collision with root package name */
    public final f2.c0 f2206l;

    /* renamed from: m, reason: collision with root package name */
    public final W f2207m;

    /* renamed from: n, reason: collision with root package name */
    public final f2.c0 f2208n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2209o;

    /* renamed from: p, reason: collision with root package name */
    public final h0 f2210p;

    /* renamed from: q, reason: collision with root package name */
    public final f2.M f2211q;

    static {
        new Y(new X());
        W.y.H(1);
        W.y.H(2);
        W.y.H(3);
        W.y.H(4);
        AbstractC0007h.n(5, 6, 7, 8, 9);
        AbstractC0007h.n(10, 11, 12, 13, 14);
        AbstractC0007h.n(15, 16, 17, 18, 19);
        AbstractC0007h.n(20, 21, 22, 23, 24);
        AbstractC0007h.n(25, 26, 27, 28, 29);
        W.y.H(30);
        W.y.H(31);
    }

    public Y(X x3) {
        this.f2195a = x3.f2178a;
        this.f2196b = x3.f2179b;
        this.f2197c = x3.f2180c;
        this.f2198d = x3.f2181d;
        this.f2199e = x3.f2182e;
        this.f2200f = x3.f2183f;
        this.f2201g = x3.f2184g;
        this.f2202h = x3.f2185h;
        this.f2203i = x3.f2186i;
        this.f2204j = x3.f2187j;
        this.f2205k = x3.f2188k;
        this.f2206l = x3.f2189l;
        this.f2207m = x3.f2190m;
        this.f2208n = x3.f2191n;
        this.f2209o = x3.f2192o;
        this.f2210p = h0.a(x3.f2193p);
        this.f2211q = f2.M.j(x3.f2194q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Y y4 = (Y) obj;
        if (this.f2195a == y4.f2195a && this.f2196b == y4.f2196b && this.f2197c == y4.f2197c && this.f2198d == y4.f2198d && this.f2201g == y4.f2201g && this.f2199e == y4.f2199e && this.f2200f == y4.f2200f && this.f2202h.equals(y4.f2202h) && this.f2203i.equals(y4.f2203i) && this.f2204j == y4.f2204j && this.f2205k == y4.f2205k && this.f2206l.equals(y4.f2206l) && this.f2207m.equals(y4.f2207m) && this.f2208n.equals(y4.f2208n) && this.f2209o == y4.f2209o) {
            h0 h0Var = this.f2210p;
            h0Var.getClass();
            if (f2.r.h(h0Var, y4.f2210p) && this.f2211q.equals(y4.f2211q)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f2211q.hashCode() + ((this.f2210p.hashCode() + ((((this.f2208n.hashCode() + ((this.f2207m.hashCode() + ((this.f2206l.hashCode() + ((((((this.f2203i.hashCode() + ((this.f2202h.hashCode() + ((((((((((((((this.f2195a + 31) * 31) + this.f2196b) * 31) + this.f2197c) * 31) + this.f2198d) * 28629151) + (this.f2201g ? 1 : 0)) * 31) + this.f2199e) * 31) + this.f2200f) * 31)) * 961)) * 961) + this.f2204j) * 31) + this.f2205k) * 31)) * 31)) * 31)) * 31) + this.f2209o) * 887503681)) * 31);
    }
}
