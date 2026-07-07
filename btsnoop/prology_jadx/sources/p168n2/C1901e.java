package p168n2;

/* renamed from: n2.e */
/* loaded from: classes.dex */
public final class C1901e extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public final /* synthetic */ p168n2.C1903g f7746p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1901e(p168n2.C1903g c1903g, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f7746p = c1903g;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p168n2.C1901e(this.f7746p, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p168n2.C1901e) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p176p1.AbstractC1949a.m3913P(obj);
        p168n2.C1903g c1903g = this.f7746p;
        android.content.ContentResolver contentResolver = c1903g.f7752e;
        if (contentResolver == null) {
            p154k3.AbstractC1803h.m3783i("resolver");
            throw null;
        }
        android.net.Uri uri = c1903g.f7751d;
        if (uri == null) {
            p154k3.AbstractC1803h.m3783i("uri");
            throw null;
        }
        java.lang.String[] strArr = p181q2.AbstractC2023a.f8251b;
        java.lang.String str = c1903g.f7753f;
        if (str == null) {
            p154k3.AbstractC1803h.m3783i("sortType");
            throw null;
        }
        android.database.Cursor query = contentResolver.query(uri, strArr, null, null, str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (query != null) {
            new java.lang.Integer(query.getCount());
        }
        while (query != null && query.moveToNext()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            p154k3.C1796a m3791c = p154k3.AbstractC1814s.m3791c(query.getColumnNames());
            while (m3791c.hasNext()) {
                java.lang.String str2 = (java.lang.String) m3791c.next();
                p154k3.AbstractC1803h.m3776b(str2);
                c1903g.f7750c.getClass();
                hashMap.put(str2, p025F1.C0215g.m588y(str2, query));
            }
            arrayList.add(hashMap);
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
