package s2;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546c {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8218a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8219b;

    /* renamed from: c, reason: collision with root package name */
    public String f8220c;

    /* renamed from: d, reason: collision with root package name */
    public String f8221d;

    /* renamed from: e, reason: collision with root package name */
    public String f8222e;

    /* renamed from: f, reason: collision with root package name */
    public int f8223f;

    /* renamed from: g, reason: collision with root package name */
    public String f8224g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8225h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8226i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8227j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8228k;

    /* renamed from: l, reason: collision with root package name */
    public int f8229l;

    /* renamed from: m, reason: collision with root package name */
    public int f8230m;

    /* renamed from: n, reason: collision with root package name */
    public String f8231n;

    /* renamed from: o, reason: collision with root package name */
    public String f8232o;

    public C0546c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f8218a = sharedPreferences;
        this.f8219b = sharedPreferences.getBoolean("androidResumeOnClick", true);
        this.f8220c = sharedPreferences.getString("androidNotificationChannelId", null);
        this.f8221d = sharedPreferences.getString("androidNotificationChannelName", null);
        this.f8222e = sharedPreferences.getString("androidNotificationChannelDescription", null);
        this.f8223f = sharedPreferences.getInt("notificationColor", -1);
        this.f8224g = sharedPreferences.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.f8225h = sharedPreferences.getBoolean("androidShowNotificationBadge", false);
        this.f8226i = sharedPreferences.getBoolean("androidNotificationClickStartsActivity", true);
        this.f8227j = sharedPreferences.getBoolean("androidNotificationOngoing", false);
        this.f8228k = sharedPreferences.getBoolean("androidStopForegroundOnPause", true);
        this.f8229l = sharedPreferences.getInt("artDownscaleWidth", -1);
        this.f8230m = sharedPreferences.getInt("artDownscaleHeight", -1);
        this.f8231n = sharedPreferences.getString("activityClassName", null);
        this.f8232o = sharedPreferences.getString("androidBrowsableRootExtras", null);
    }

    public final void a() {
        this.f8218a.edit().putBoolean("androidResumeOnClick", this.f8219b).putString("androidNotificationChannelId", this.f8220c).putString("androidNotificationChannelName", this.f8221d).putString("androidNotificationChannelDescription", this.f8222e).putInt("notificationColor", this.f8223f).putString("androidNotificationIcon", this.f8224g).putBoolean("androidShowNotificationBadge", this.f8225h).putBoolean("androidNotificationClickStartsActivity", this.f8226i).putBoolean("androidNotificationOngoing", this.f8227j).putBoolean("androidStopForegroundOnPause", this.f8228k).putInt("artDownscaleWidth", this.f8229l).putInt("artDownscaleHeight", this.f8230m).putString("activityClassName", this.f8231n).putString("androidBrowsableRootExtras", this.f8232o).apply();
    }
}
