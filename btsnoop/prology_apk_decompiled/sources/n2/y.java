package n2;

import b3.InterfaceC0190d;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class y extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0452A f7522p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0452A c0452a, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7522p = c0452a;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new y(this.f7522p, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((y) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        r3 = r10.f7448f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
    
        if (r3 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r3.equals(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        r3 = n2.C0452A.f7444i;
        k3.h.d(r3, "access$getURI$cp(...)");
        r5.getClass();
        F1.g.C(r3, r2);
        r2.putAll(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
    
        r1.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        k3.h.i("withType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        throw null;
     */
    @Override // d3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r10) {
        /*
            r9 = this;
            p1.AbstractC0462a.P(r10)
            n2.A r10 = r9.f7522p
            android.content.ContentResolver r0 = r10.f7447e
            r6 = 0
            if (r0 == 0) goto Le5
            android.net.Uri r1 = r10.f7448f
            java.lang.String r7 = "withType"
            if (r1 == 0) goto Le1
            java.lang.String[] r2 = r10.f7446d
            java.lang.String r3 = r10.f7450h
            if (r3 == 0) goto Ldb
            java.lang.String r4 = r10.f7449g
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
            k3.a r3 = k3.s.c(r3)
        L48:
            boolean r4 = r3.hasNext()
            F1.g r5 = r10.f7445c
            if (r4 == 0) goto Laa
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri r8 = r10.f7448f
            if (r8 == 0) goto La6
            k3.h.b(r4)
            r5.getClass()
            android.net.Uri r5 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L6d
            java.lang.Object r5 = F1.g.D(r4, r0)
            goto La2
        L6d:
            android.net.Uri r5 = android.provider.MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L7a
            java.lang.Object r5 = F1.g.x(r4, r0)
            goto La2
        L7a:
            android.net.Uri r5 = android.provider.MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L87
            java.lang.Object r5 = F1.g.B(r4, r0)
            goto La2
        L87:
            android.net.Uri r5 = android.provider.MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L94
            java.lang.Object r5 = F1.g.y(r4, r0)
            goto La2
        L94:
            android.net.Uri r5 = android.provider.MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto La1
            java.lang.Object r5 = F1.g.A(r4, r0)
            goto La2
        La1:
            r5 = r6
        La2:
            r2.put(r4, r5)
            goto L48
        La6:
            k3.h.i(r7)
            throw r6
        Laa:
            android.net.Uri r3 = r10.f7448f
            if (r3 == 0) goto Lcb
            android.net.Uri r4 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc6
            android.net.Uri r3 = n2.C0452A.f7444i
            java.lang.String r4 = "access$getURI$cp(...)"
            k3.h.d(r3, r4)
            r5.getClass()
            F1.g.C(r3, r2)
            r2.putAll(r2)
        Lc6:
            r1.add(r2)
            goto L33
        Lcb:
            k3.h.i(r7)
            throw r6
        Lcf:
            if (r0 == 0) goto Ld4
            r0.close()
        Ld4:
            return r1
        Ld5:
            java.lang.String r10 = "argsVal"
            k3.h.i(r10)
            throw r6
        Ldb:
            java.lang.String r10 = "argsKey"
            k3.h.i(r10)
            throw r6
        Le1:
            k3.h.i(r7)
            throw r6
        Le5:
            java.lang.String r10 = "resolver"
            k3.h.i(r10)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.y.k(java.lang.Object):java.lang.Object");
    }
}
