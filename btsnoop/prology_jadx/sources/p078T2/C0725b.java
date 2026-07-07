package p078T2;

/* renamed from: T2.b */
/* loaded from: classes.dex */
public final class C0725b extends p021E0.AbstractC0193e {

    /* renamed from: b */
    public final int f2516b;

    /* renamed from: c */
    public final java.util.HashMap f2517c;

    public C0725b(java.lang.String str, int i4, java.util.HashMap hashMap) {
        super(str);
        this.f2516b = i4;
        this.f2517c = hashMap;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [T.u, T.v] */
    @Override // p021E0.AbstractC0193e
    /* renamed from: g */
    public final p076T.C0659B mo554g() {
        p076T.C0706t c0706t = new p076T.C0706t();
        new p025F1.C0215g();
        java.util.List emptyList = java.util.Collections.emptyList();
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        p076T.C0709w c0709w = new p076T.C0709w();
        p076T.C0712z c0712z = p076T.C0712z.f2455a;
        java.lang.String str = (java.lang.String) this.f537a;
        android.net.Uri parse = str == null ? null : android.net.Uri.parse(str);
        int m781b = p044L.AbstractC0352j.m781b(this.f2516b);
        java.lang.String str2 = m781b != 1 ? m781b != 2 ? m781b != 3 ? null : "application/x-mpegURL" : "application/dash+xml" : "application/vnd.ms-sstr+xml";
        if (str2 == null) {
            str2 = null;
        }
        return new p076T.C0659B("", new p076T.C0707u(c0706t), parse != null ? new p076T.C0711y(parse, str2, null, emptyList, c1415c0, null, -9223372036854775807L) : null, new p076T.C0710x(c0709w), p076T.C0662E.f2173y, c0712z);
    }

    @Override // p021E0.AbstractC0193e
    /* renamed from: h */
    public final p179q0.InterfaceC1963E mo555h(android.content.Context context) {
        p077T0.C0717e c0717e = new p077T0.C0717e(1);
        java.util.HashMap hashMap = this.f2517c;
        c0717e.f2478p = (hashMap.isEmpty() || !hashMap.containsKey("User-Agent")) ? "ExoPlayer" : (java.lang.String) hashMap.get("User-Agent");
        c0717e.f2476n = true;
        if (!hashMap.isEmpty()) {
            c0717e.m1309d(hashMap);
        }
        p008B1.C0026d c0026d = new p008B1.C0026d(context, c0717e);
        p179q0.C2015t c2015t = new p179q0.C2015t(context);
        c2015t.f8224b = c0026d;
        p054N1.C0463r c0463r = c2015t.f8223a;
        if (c0026d != ((p008B1.C0026d) c0463r.f1355e)) {
            c0463r.f1355e = c0026d;
            ((java.util.HashMap) c0463r.f1353c).clear();
            ((java.util.HashMap) c0463r.f1354d).clear();
        }
        return c2015t;
    }
}
