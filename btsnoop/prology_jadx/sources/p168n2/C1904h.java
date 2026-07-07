package p168n2;

/* renamed from: n2.h */
/* loaded from: classes.dex */
public final class C1904h extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public final /* synthetic */ p168n2.C1906j f7754p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1904h(p168n2.C1906j c1906j, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f7754p = c1906j;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p168n2.C1904h(this.f7754p, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p168n2.C1904h) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        android.net.Uri withAppendedId;
        android.graphics.Bitmap loadThumbnail;
        p176p1.AbstractC1949a.m3913P(obj);
        int i4 = android.os.Build.VERSION.SDK_INT;
        p168n2.C1906j c1906j = this.f7754p;
        byte[] bArr = null;
        p025F1.C0215g c0215g = c1906j.f7758c;
        if (i4 >= 29) {
            try {
                int i5 = c1906j.f7759d;
                if (i5 == 2 || i5 == 3 || i5 == 4) {
                    java.lang.Number number = c1906j.f7760e;
                    android.content.ContentResolver contentResolver = c1906j.f7765j;
                    if (contentResolver == null) {
                        p154k3.AbstractC1803h.m3783i("resolver");
                        throw null;
                    }
                    c0215g.getClass();
                    java.lang.String m589z = p025F1.C0215g.m589z(i5, number, contentResolver);
                    if (m589z == null) {
                        return null;
                    }
                    android.net.Uri uri = c1906j.f7764i;
                    if (uri == null) {
                        p154k3.AbstractC1803h.m3783i("uri");
                        throw null;
                    }
                    withAppendedId = android.content.ContentUris.withAppendedId(uri, java.lang.Long.parseLong(m589z));
                } else {
                    android.net.Uri uri2 = c1906j.f7764i;
                    if (uri2 == null) {
                        p154k3.AbstractC1803h.m3783i("uri");
                        throw null;
                    }
                    withAppendedId = android.content.ContentUris.withAppendedId(uri2, c1906j.f7760e.longValue());
                }
                p154k3.AbstractC1803h.m3776b(withAppendedId);
                android.content.ContentResolver contentResolver2 = c1906j.f7765j;
                if (contentResolver2 == null) {
                    p154k3.AbstractC1803h.m3783i("resolver");
                    throw null;
                }
                int i6 = c1906j.f7762g;
                loadThumbnail = contentResolver2.loadThumbnail(withAppendedId, new android.util.Size(i6, i6), null);
                p154k3.AbstractC1803h.m3778d(loadThumbnail, "loadThumbnail(...)");
                byte[] m3880b = p168n2.C1906j.m3880b(c1906j, loadThumbnail, null, 2);
                p154k3.AbstractC1803h.m3776b(m3880b);
                return m3880b;
            } catch (java.lang.Exception e4) {
                if (!c1906j.f7763h) {
                    return null;
                }
                android.util.Log.w("OnArtworksQuery", "(" + c1906j.f7760e + ") Message: " + e4);
                return null;
            }
        }
        int i7 = c1906j.f7759d;
        java.lang.Number number2 = c1906j.f7760e;
        android.content.ContentResolver contentResolver3 = c1906j.f7765j;
        if (contentResolver3 == null) {
            p154k3.AbstractC1803h.m3783i("resolver");
            throw null;
        }
        c0215g.getClass();
        java.lang.String m589z2 = p025F1.C0215g.m589z(i7, number2, contentResolver3);
        if (m589z2 == null) {
            return null;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(m589z2);
            android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(fileInputStream.getFD());
            byte[] m3880b2 = p168n2.C1906j.m3880b(c1906j, null, mediaMetadataRetriever.getEmbeddedPicture(), 1);
            if (m3880b2 == null) {
                return null;
            }
            if (i4 >= 29) {
                try {
                    mediaMetadataRetriever.release();
                } catch (java.lang.Exception e5) {
                    e = e5;
                    bArr = m3880b2;
                    if (!c1906j.f7763h) {
                        return bArr;
                    }
                    android.util.Log.w("OnArtworksQuery", "(" + c1906j.f7760e + ") Message: " + e);
                    return bArr;
                }
            }
            return m3880b2;
        } catch (java.lang.Exception e6) {
            e = e6;
        }
    }
}
