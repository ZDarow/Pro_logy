package p181q2;

/* renamed from: q2.a */
/* loaded from: classes.dex */
public abstract class AbstractC2023a {

    /* renamed from: a */
    public static final java.lang.String[] f8250a = {"_data", "_id", "date_added", "date_modified", "name"};

    /* renamed from: b */
    public static final java.lang.String[] f8251b = {"_id", "artist", "number_of_albums", "number_of_tracks"};

    /* renamed from: c */
    public static final java.lang.String[] f8252c = {"_id", "name"};

    /* renamed from: a */
    public static final java.lang.String[] m4072a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(new p105a3.C1018a(new java.lang.String[]{"_data", "_display_name", "_id", "_size", "album", "album_artist", "album_id", "artist", "artist_id", "bookmark", "composer", "date_added", "date_modified", "duration", "title", "track", "year", "is_alarm", "is_music", "is_notification", "is_podcast", "is_ringtone"}, true));
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            arrayList.add("is_audiobook");
        }
        if (i4 >= 30) {
            arrayList.add("genre");
            arrayList.add("genre_id");
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }
}
