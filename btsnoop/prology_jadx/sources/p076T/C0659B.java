package p076T;

/* renamed from: T.B */
/* loaded from: classes.dex */
public final class C0659B {

    /* renamed from: a */
    public final java.lang.String f2142a;

    /* renamed from: b */
    public final p076T.C0711y f2143b;

    /* renamed from: c */
    public final p076T.C0710x f2144c;

    /* renamed from: d */
    public final p076T.C0662E f2145d;

    /* renamed from: e */
    public final p076T.C0708v f2146e;

    /* renamed from: f */
    public final p076T.C0712z f2147f;

    static {
        p076T.C0706t c0706t = new p076T.C0706t();
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        java.util.Collections.emptyList();
        p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
        p076T.C0709w c0709w = new p076T.C0709w();
        p076T.C0712z c0712z = p076T.C0712z.f2455a;
        c0706t.m1300a();
        c0709w.m1301a();
        p076T.C0662E c0662e = p076T.C0662E.f2173y;
        p009B2.AbstractC0051h.m155n(0, 1, 2, 3, 4);
        p086W.AbstractC0805y.m1587H(5);
    }

    public C0659B(java.lang.String str, p076T.C0708v c0708v, p076T.C0711y c0711y, p076T.C0710x c0710x, p076T.C0662E c0662e, p076T.C0712z c0712z) {
        this.f2142a = str;
        this.f2143b = c0711y;
        this.f2144c = c0710x;
        this.f2145d = c0662e;
        this.f2146e = c0708v;
        this.f2147f = c0712z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, T.t] */
    /* renamed from: a */
    public final p076T.C0705s m1178a() {
        ?? obj = new java.lang.Object();
        obj.f2428d = new p076T.C0706t();
        obj.f2429e = new p025F1.C0215g();
        obj.f2430f = java.util.Collections.emptyList();
        obj.f2431g = p129f2.C1415c0.f5744p;
        obj.f2435k = new p076T.C0709w();
        obj.f2436l = p076T.C0712z.f2455a;
        obj.f2433i = -9223372036854775807L;
        p076T.C0708v c0708v = this.f2146e;
        ?? obj2 = new java.lang.Object();
        obj2.f2437a = c0708v.f2438a;
        obj.f2428d = obj2;
        obj.f2425a = this.f2142a;
        obj.f2434j = this.f2145d;
        obj.f2435k = this.f2144c.m1302a();
        obj.f2436l = this.f2147f;
        p076T.C0711y c0711y = this.f2143b;
        if (c0711y != null) {
            obj.f2427c = c0711y.f2450b;
            obj.f2426b = c0711y.f2449a;
            obj.f2430f = c0711y.f2451c;
            obj.f2431g = c0711y.f2452d;
            obj.f2432h = c0711y.f2453e;
            obj.f2429e = new p025F1.C0215g();
            obj.f2433i = c0711y.f2454f;
        }
        return obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p076T.C0659B)) {
            return false;
        }
        p076T.C0659B c0659b = (p076T.C0659B) obj;
        return p086W.AbstractC0805y.m1606a(this.f2142a, c0659b.f2142a) && this.f2146e.equals(c0659b.f2146e) && p086W.AbstractC0805y.m1606a(this.f2143b, c0659b.f2143b) && this.f2144c.equals(c0659b.f2144c) && p086W.AbstractC0805y.m1606a(this.f2145d, c0659b.f2145d) && p086W.AbstractC0805y.m1606a(this.f2147f, c0659b.f2147f);
    }

    public final int hashCode() {
        int hashCode = this.f2142a.hashCode() * 31;
        p076T.C0711y c0711y = this.f2143b;
        int hashCode2 = (this.f2145d.hashCode() + ((this.f2146e.hashCode() + ((this.f2144c.hashCode() + ((hashCode + (c0711y != null ? c0711y.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f2147f.getClass();
        return hashCode2;
    }
}
