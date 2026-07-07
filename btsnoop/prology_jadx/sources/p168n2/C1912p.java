package p168n2;

/* renamed from: n2.p */
/* loaded from: classes.dex */
public final class C1912p extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public final /* synthetic */ p168n2.C1914r f7783p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1912p(p168n2.C1914r c1914r, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f7783p = c1914r;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p168n2.C1912p(this.f7783p, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p168n2.C1912p) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p025F1.C0215g c0215g;
        p176p1.AbstractC1949a.m3913P(obj);
        p168n2.C1914r c1914r = this.f7783p;
        android.content.ContentResolver contentResolver = c1914r.f7791g;
        if (contentResolver == null) {
            p154k3.AbstractC1803h.m3783i("resolver");
            throw null;
        }
        android.net.Uri uri = c1914r.f7789e;
        if (uri == null) {
            p154k3.AbstractC1803h.m3783i("uri");
            throw null;
        }
        java.lang.String[] m4072a = p181q2.AbstractC2023a.m4072a();
        java.lang.String str = c1914r.f7788d;
        java.lang.String str2 = c1914r.f7790f;
        if (str2 == null) {
            p154k3.AbstractC1803h.m3783i("sortType");
            throw null;
        }
        android.database.Cursor query = contentResolver.query(uri, m4072a, str, null, str2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (query != null) {
            new java.lang.Integer(query.getCount());
        }
        while (query != null && query.moveToNext()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            p154k3.C1796a m3791c = p154k3.AbstractC1814s.m3791c(query.getColumnNames());
            while (true) {
                boolean hasNext = m3791c.hasNext();
                c0215g = c1914r.f7787c;
                if (!hasNext) {
                    break;
                }
                java.lang.String str3 = (java.lang.String) m3791c.next();
                p154k3.AbstractC1803h.m3776b(str3);
                c0215g.getClass();
                hashMap.put(str3, p025F1.C0215g.m582D(str3, query));
            }
            android.net.Uri uri2 = c1914r.f7789e;
            if (uri2 == null) {
                p154k3.AbstractC1803h.m3783i("uri");
                throw null;
            }
            c0215g.getClass();
            p025F1.C0215g.m581C(uri2, hashMap);
            hashMap.putAll(hashMap);
            arrayList.add(hashMap);
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
