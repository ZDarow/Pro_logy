package p168n2;

/* renamed from: n2.a */
/* loaded from: classes.dex */
public final class C1897a extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public final /* synthetic */ p168n2.C1899c f7737p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1897a(p168n2.C1899c c1899c, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f7737p = c1899c;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p168n2.C1897a(this.f7737p, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p168n2.C1897a) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p176p1.AbstractC1949a.m3913P(obj);
        p168n2.C1899c c1899c = this.f7737p;
        android.content.ContentResolver contentResolver = c1899c.f7744f;
        if (contentResolver == null) {
            p154k3.AbstractC1803h.m3783i("resolver");
            throw null;
        }
        android.net.Uri uri = c1899c.f7742d;
        if (uri == null) {
            p154k3.AbstractC1803h.m3783i("uri");
            throw null;
        }
        java.lang.String str = c1899c.f7743e;
        if (str == null) {
            p154k3.AbstractC1803h.m3783i("sortType");
            throw null;
        }
        android.database.Cursor query = contentResolver.query(uri, null, null, null, str);
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
                c1899c.f7741c.getClass();
                hashMap.put(str2, p025F1.C0215g.m587x(str2, query));
            }
            if (java.lang.String.valueOf(hashMap.get("album_art")).length() == 0) {
                hashMap.remove("album_art");
            }
            arrayList.add(hashMap);
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
