package p010B3;

/* renamed from: B3.u */
/* loaded from: classes.dex */
public final class C0090u extends p010B3.AbstractC0075f {

    /* renamed from: e */
    public static final p010B3.C0081l f277e;

    /* renamed from: b */
    public final p010B3.C0081l f278b;

    /* renamed from: c */
    public final p010B3.C0078i f279c;

    /* renamed from: d */
    public final java.util.LinkedHashMap f280d;

    static {
        java.lang.String str = p010B3.C0081l.f255m;
        f277e = p025F1.C0215g.m584u("/", false);
    }

    public C0090u(p010B3.C0081l c0081l, p010B3.C0078i c0078i, java.util.LinkedHashMap linkedHashMap) {
        p154k3.AbstractC1803h.m3779e(c0078i, "fileSystem");
        this.f278b = c0081l;
        this.f279c = c0078i;
        this.f280d = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, k3.p] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k3.p] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k3.p] */
    @Override // p010B3.AbstractC0075f
    /* renamed from: b */
    public final p010B3.C0074e mo323b(p010B3.C0081l c0081l) {
        p010B3.C0085p c0085p;
        p154k3.AbstractC1803h.m3779e(c0081l, "path");
        p010B3.C0081l c0081l2 = f277e;
        c0081l2.getClass();
        p014C3.C0148e c0148e = (p014C3.C0148e) this.f280d.get(p014C3.AbstractC0145b.m496b(c0081l2, c0081l, true));
        java.lang.Throwable th = null;
        if (c0148e == null) {
            return null;
        }
        boolean z4 = c0148e.f400b;
        p010B3.C0074e c0074e = new p010B3.C0074e(!z4, z4, z4 ? null : java.lang.Long.valueOf(c0148e.f401c), null, c0148e.f402d, null);
        long j4 = c0148e.f403e;
        if (j4 == -1) {
            return c0074e;
        }
        p010B3.C0077h m330e = this.f279c.m330e(this.f278b);
        try {
            c0085p = p176p1.AbstractC1949a.m3932f(m330e.m327e(j4));
            try {
                m330e.close();
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            try {
                m330e.close();
            } catch (java.lang.Throwable th4) {
                p101a.AbstractC0936a.m1793c(th3, th4);
            }
            c0085p = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        p154k3.AbstractC1803h.m3776b(c0085p);
        ?? obj = new java.lang.Object();
        obj.f7374l = c0074e.f244e;
        ?? obj2 = new java.lang.Object();
        ?? obj3 = new java.lang.Object();
        int m341a = c0085p.m341a();
        if (m341a != 67324752) {
            throw new java.io.IOException("bad zip: expected " + p014C3.AbstractC0144a.m491b(67324752) + " but was " + p014C3.AbstractC0144a.m491b(m341a));
        }
        c0085p.m346g(2L);
        short m343c = c0085p.m343c();
        int i4 = m343c & 65535;
        if ((m343c & 1) != 0) {
            throw new java.io.IOException("unsupported zip: general purpose bit flag=" + p014C3.AbstractC0144a.m491b(i4));
        }
        c0085p.m346g(18L);
        int m343c2 = c0085p.m343c() & 65535;
        c0085p.m346g(c0085p.m343c() & 65535);
        p014C3.AbstractC0144a.m493d(c0085p, m343c2, new p014C3.C0151h(c0085p, obj, obj2, obj3));
        p010B3.C0074e c0074e2 = new p010B3.C0074e(c0074e.f240a, c0074e.f241b, c0074e.f242c, (java.lang.Long) obj3.f7374l, (java.lang.Long) obj.f7374l, (java.lang.Long) obj2.f7374l);
        p154k3.AbstractC1803h.m3776b(c0074e2);
        return c0074e2;
    }
}
