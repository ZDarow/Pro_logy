package q2;

import a3.C0148a;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0495a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f7942a = {"_data", "_id", "date_added", "date_modified", "name"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7943b = {"_id", "artist", "number_of_albums", "number_of_tracks"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7944c = {"_id", "name"};

    public static final String[] a() {
        ArrayList arrayList = new ArrayList(new C0148a(new String[]{"_data", "_display_name", "_id", "_size", "album", "album_artist", "album_id", "artist", "artist_id", "bookmark", "composer", "date_added", "date_modified", "duration", "title", "track", "year", "is_alarm", "is_music", "is_notification", "is_podcast", "is_ringtone"}, true));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            arrayList.add("is_audiobook");
        }
        if (i4 >= 30) {
            arrayList.add("genre");
            arrayList.add("genre_id");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
