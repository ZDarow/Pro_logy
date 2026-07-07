package n2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class o extends androidx.lifecycle.x {

    /* renamed from: j, reason: collision with root package name */
    public static final Uri f7489j;

    /* renamed from: d, reason: collision with root package name */
    public int f7491d;

    /* renamed from: f, reason: collision with root package name */
    public String f7493f;

    /* renamed from: g, reason: collision with root package name */
    public String f7494g;

    /* renamed from: h, reason: collision with root package name */
    public String f7495h;

    /* renamed from: i, reason: collision with root package name */
    public ContentResolver f7496i;

    /* renamed from: c, reason: collision with root package name */
    public final F1.g f7490c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Uri f7492e = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;

    static {
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        k3.h.d(uri, "EXTERNAL_CONTENT_URI");
        f7489j = uri;
    }

    public static boolean b(o oVar, String str, String str2, int i4) {
        Uri uri;
        String[] strArr;
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if (str != null) {
            uri = MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;
            strArr = new String[]{"name", "_id"};
        } else {
            uri = MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI;
            strArr = new String[]{"name", "_id"};
        }
        String[] strArr2 = strArr;
        Uri uri2 = uri;
        ContentResolver contentResolver = oVar.f7496i;
        if (contentResolver == null) {
            k3.h.i("resolver");
            throw null;
        }
        Cursor query = contentResolver.query(uri2, strArr2, null, null, null);
        while (query != null && query.moveToNext()) {
            String string = query.getString(0);
            if ((string != null && string.equals(str)) || k3.h.a(string, str2)) {
                oVar.f7491d = query.getInt(1);
                return true;
            }
        }
        if (query != null) {
            query.close();
        }
        return false;
    }
}
