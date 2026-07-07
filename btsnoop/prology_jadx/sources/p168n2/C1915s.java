package p168n2;

/* renamed from: n2.s */
/* loaded from: classes.dex */
public final class C1915s extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public final /* synthetic */ p168n2.C1917u f7792p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1915s(p168n2.C1917u c1917u, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f7792p = c1917u;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p168n2.C1915s(this.f7792p, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p168n2.C1915s) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p025F1.C0215g c0215g;
        p176p1.AbstractC1949a.m3913P(obj);
        p168n2.C1917u c1917u = this.f7792p;
        android.content.ContentResolver contentResolver = c1917u.f7799f;
        if (contentResolver == null) {
            p154k3.AbstractC1803h.m3783i("resolver");
            throw null;
        }
        android.net.Uri uri = c1917u.f7797d;
        if (uri == null) {
            p154k3.AbstractC1803h.m3783i("uri");
            throw null;
        }
        java.lang.String[] strArr = p181q2.AbstractC2023a.f8252c;
        java.lang.String str = c1917u.f7798e;
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
            while (true) {
                boolean hasNext = m3791c.hasNext();
                c0215g = c1917u.f7796c;
                if (!hasNext) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) m3791c.next();
                p154k3.AbstractC1803h.m3776b(str2);
                c0215g.getClass();
                hashMap.put(str2, p025F1.C0215g.m579A(str2, query));
            }
            java.lang.String valueOf = java.lang.String.valueOf(hashMap.get("_id"));
            android.content.ContentResolver contentResolver2 = c1917u.f7799f;
            if (contentResolver2 == null) {
                p154k3.AbstractC1803h.m3783i("resolver");
                throw null;
            }
            c0215g.getClass();
            hashMap.put("num_of_songs", new java.lang.Integer(p025F1.C0215g.m586w(0, valueOf, contentResolver2)));
            if (hashMap.get("name") != null && !p154k3.AbstractC1803h.m3775a(hashMap.get("_id"), new java.lang.Integer(0))) {
                arrayList.add(hashMap);
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
