package p168n2;

/* renamed from: n2.v */
/* loaded from: classes.dex */
public final class C1918v extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public final /* synthetic */ p168n2.C1920x f7800p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1918v(p168n2.C1920x c1920x, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f7800p = c1920x;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p168n2.C1918v(this.f7800p, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p168n2.C1918v) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p025F1.C0215g c0215g;
        p176p1.AbstractC1949a.m3913P(obj);
        p168n2.C1920x c1920x = this.f7800p;
        android.content.ContentResolver contentResolver = c1920x.f7806e;
        if (contentResolver == null) {
            p154k3.AbstractC1803h.m3783i("resolver");
            throw null;
        }
        android.net.Uri uri = c1920x.f7805d;
        if (uri == null) {
            p154k3.AbstractC1803h.m3783i("uri");
            throw null;
        }
        android.database.Cursor query = contentResolver.query(uri, p181q2.AbstractC2023a.f8250a, null, null, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (query != null) {
            new java.lang.Integer(query.getCount());
        }
        while (query != null && query.moveToNext()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            p154k3.C1796a m3791c = p154k3.AbstractC1814s.m3791c(query.getColumnNames());
            while (true) {
                boolean hasNext = m3791c.hasNext();
                c0215g = c1920x.f7804c;
                if (!hasNext) {
                    break;
                }
                java.lang.String str = (java.lang.String) m3791c.next();
                p154k3.AbstractC1803h.m3776b(str);
                c0215g.getClass();
                hashMap.put(str, p025F1.C0215g.m580B(str, query));
            }
            java.lang.String valueOf = java.lang.String.valueOf(hashMap.get("_id"));
            android.content.ContentResolver contentResolver2 = c1920x.f7806e;
            if (contentResolver2 == null) {
                p154k3.AbstractC1803h.m3783i("resolver");
                throw null;
            }
            c0215g.getClass();
            hashMap.put("num_of_songs", new java.lang.Integer(p025F1.C0215g.m586w(1, valueOf, contentResolver2)));
            arrayList.add(hashMap);
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
