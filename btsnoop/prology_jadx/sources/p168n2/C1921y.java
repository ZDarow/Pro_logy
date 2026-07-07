package p168n2;

/* renamed from: n2.y */
/* loaded from: classes.dex */
public final class C1921y extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public final /* synthetic */ p168n2.C1896A f7808p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1921y(p168n2.C1896A c1896a, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f7808p = c1896a;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p168n2.C1921y(this.f7808p, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p168n2.C1921y) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        r3 = r10.f7734f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
    
        if (r3 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r3.equals(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        r3 = p168n2.C1896A.f7730i;
        p154k3.AbstractC1803h.m3778d(r3, "access$getURI$cp(...)");
        r5.getClass();
        p025F1.C0215g.m581C(r3, r2);
        r2.putAll(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
    
        r1.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        p154k3.AbstractC1803h.m3783i("withType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        throw null;
     */
    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo660k(java.lang.Object r10) {
        /*
            r9 = this;
            p176p1.AbstractC1949a.m3913P(r10)
            n2.A r10 = r9.f7808p
            android.content.ContentResolver r0 = r10.f7733e
            r6 = 0
            if (r0 == 0) goto Le5
            android.net.Uri r1 = r10.f7734f
            java.lang.String r7 = "withType"
            if (r1 == 0) goto Le1
            java.lang.String[] r2 = r10.f7732d
            java.lang.String r3 = r10.f7736h
            if (r3 == 0) goto Ldb
            java.lang.String r4 = r10.f7735g
            if (r4 == 0) goto Ld5
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L33
            int r2 = r0.getCount()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
        L33:
            if (r0 == 0) goto Lcf
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto Lcf
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String[] r3 = r0.getColumnNames()
            k3.a r3 = p154k3.AbstractC1814s.m3791c(r3)
        L48:
            boolean r4 = r3.hasNext()
            F1.g r5 = r10.f7731c
            if (r4 == 0) goto Laa
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri r8 = r10.f7734f
            if (r8 == 0) goto La6
            p154k3.AbstractC1803h.m3776b(r4)
            r5.getClass()
            android.net.Uri r5 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L6d
            java.lang.Object r5 = p025F1.C0215g.m582D(r4, r0)
            goto La2
        L6d:
            android.net.Uri r5 = android.provider.MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L7a
            java.lang.Object r5 = p025F1.C0215g.m587x(r4, r0)
            goto La2
        L7a:
            android.net.Uri r5 = android.provider.MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L87
            java.lang.Object r5 = p025F1.C0215g.m580B(r4, r0)
            goto La2
        L87:
            android.net.Uri r5 = android.provider.MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L94
            java.lang.Object r5 = p025F1.C0215g.m588y(r4, r0)
            goto La2
        L94:
            android.net.Uri r5 = android.provider.MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto La1
            java.lang.Object r5 = p025F1.C0215g.m579A(r4, r0)
            goto La2
        La1:
            r5 = r6
        La2:
            r2.put(r4, r5)
            goto L48
        La6:
            p154k3.AbstractC1803h.m3783i(r7)
            throw r6
        Laa:
            android.net.Uri r3 = r10.f7734f
            if (r3 == 0) goto Lcb
            android.net.Uri r4 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc6
            android.net.Uri r3 = p168n2.C1896A.f7730i
            java.lang.String r4 = "access$getURI$cp(...)"
            p154k3.AbstractC1803h.m3778d(r3, r4)
            r5.getClass()
            p025F1.C0215g.m581C(r3, r2)
            r2.putAll(r2)
        Lc6:
            r1.add(r2)
            goto L33
        Lcb:
            p154k3.AbstractC1803h.m3783i(r7)
            throw r6
        Lcf:
            if (r0 == 0) goto Ld4
            r0.close()
        Ld4:
            return r1
        Ld5:
            java.lang.String r10 = "argsVal"
            p154k3.AbstractC1803h.m3783i(r10)
            throw r6
        Ldb:
            java.lang.String r10 = "argsKey"
            p154k3.AbstractC1803h.m3783i(r10)
            throw r6
        Le1:
            p154k3.AbstractC1803h.m3783i(r7)
            throw r6
        Le5:
            java.lang.String r10 = "resolver"
            p154k3.AbstractC1803h.m3783i(r10)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p168n2.C1921y.mo660k(java.lang.Object):java.lang.Object");
    }
}
