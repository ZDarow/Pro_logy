package p168n2;

/* renamed from: n2.o */
/* loaded from: classes.dex */
public final class C1911o extends androidx.lifecycle.AbstractC1160x {

    /* renamed from: j */
    public static final android.net.Uri f7775j;

    /* renamed from: d */
    public int f7777d;

    /* renamed from: f */
    public java.lang.String f7779f;

    /* renamed from: g */
    public java.lang.String f7780g;

    /* renamed from: h */
    public java.lang.String f7781h;

    /* renamed from: i */
    public android.content.ContentResolver f7782i;

    /* renamed from: c */
    public final p025F1.C0215g f7776c = new java.lang.Object();

    /* renamed from: e */
    public android.net.Uri f7778e = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;

    static {
        android.net.Uri uri = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        p154k3.AbstractC1803h.m3778d(uri, "EXTERNAL_CONTENT_URI");
        f7775j = uri;
    }

    /* renamed from: b */
    public static boolean m3881b(p168n2.C1911o c1911o, java.lang.String str, java.lang.String str2, int i4) {
        android.net.Uri uri;
        java.lang.String[] strArr;
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if (str != null) {
            uri = android.provider.MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;
            strArr = new java.lang.String[]{"name", "_id"};
        } else {
            uri = android.provider.MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI;
            strArr = new java.lang.String[]{"name", "_id"};
        }
        java.lang.String[] strArr2 = strArr;
        android.net.Uri uri2 = uri;
        android.content.ContentResolver contentResolver = c1911o.f7782i;
        if (contentResolver == null) {
            p154k3.AbstractC1803h.m3783i("resolver");
            throw null;
        }
        android.database.Cursor query = contentResolver.query(uri2, strArr2, null, null, null);
        while (query != null && query.moveToNext()) {
            java.lang.String string = query.getString(0);
            if ((string != null && string.equals(str)) || p154k3.AbstractC1803h.m3775a(string, str2)) {
                c1911o.f7777d = query.getInt(1);
                return true;
            }
        }
        if (query != null) {
            query.close();
        }
        return false;
    }
}
