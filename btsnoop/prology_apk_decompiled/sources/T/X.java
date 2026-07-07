package T;

import java.util.HashMap;
import java.util.HashSet;
import t0.C0569k;

/* loaded from: classes.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    public int f2178a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f2179b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f2180c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f2181d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f2182e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f2183f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2184g = true;

    /* renamed from: h, reason: collision with root package name */
    public f2.c0 f2185h;

    /* renamed from: i, reason: collision with root package name */
    public f2.c0 f2186i;

    /* renamed from: j, reason: collision with root package name */
    public int f2187j;

    /* renamed from: k, reason: collision with root package name */
    public int f2188k;

    /* renamed from: l, reason: collision with root package name */
    public f2.c0 f2189l;

    /* renamed from: m, reason: collision with root package name */
    public W f2190m;

    /* renamed from: n, reason: collision with root package name */
    public f2.c0 f2191n;

    /* renamed from: o, reason: collision with root package name */
    public int f2192o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f2193p;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f2194q;

    public X() {
        f2.G g4 = f2.I.f5510m;
        f2.c0 c0Var = f2.c0.f5550p;
        this.f2185h = c0Var;
        this.f2186i = c0Var;
        this.f2187j = Integer.MAX_VALUE;
        this.f2188k = Integer.MAX_VALUE;
        this.f2189l = c0Var;
        this.f2190m = W.f2174d;
        this.f2191n = c0Var;
        this.f2192o = 0;
        this.f2193p = new HashMap();
        this.f2194q = new HashSet();
    }

    public final void a(C0569k c0569k) {
        this.f2178a = c0569k.f2195a;
        this.f2179b = c0569k.f2196b;
        this.f2180c = c0569k.f2197c;
        this.f2181d = c0569k.f2198d;
        this.f2182e = c0569k.f2199e;
        this.f2183f = c0569k.f2200f;
        this.f2184g = c0569k.f2201g;
        this.f2185h = c0569k.f2202h;
        this.f2186i = c0569k.f2203i;
        this.f2187j = c0569k.f2204j;
        this.f2188k = c0569k.f2205k;
        this.f2189l = c0569k.f2206l;
        this.f2190m = c0569k.f2207m;
        this.f2191n = c0569k.f2208n;
        this.f2192o = c0569k.f2209o;
        this.f2194q = new HashSet(c0569k.f2211q);
        this.f2193p = new HashMap(c0569k.f2210p);
    }

    public X b(int i4, int i5) {
        this.f2182e = i4;
        this.f2183f = i5;
        this.f2184g = true;
        return this;
    }
}
