package p190s2;

/* renamed from: s2.c */
/* loaded from: classes.dex */
public final class C2143c {

    /* renamed from: a */
    public final android.content.SharedPreferences f8537a;

    /* renamed from: b */
    public boolean f8538b;

    /* renamed from: c */
    public java.lang.String f8539c;

    /* renamed from: d */
    public java.lang.String f8540d;

    /* renamed from: e */
    public java.lang.String f8541e;

    /* renamed from: f */
    public int f8542f;

    /* renamed from: g */
    public java.lang.String f8543g;

    /* renamed from: h */
    public boolean f8544h;

    /* renamed from: i */
    public boolean f8545i;

    /* renamed from: j */
    public boolean f8546j;

    /* renamed from: k */
    public boolean f8547k;

    /* renamed from: l */
    public int f8548l;

    /* renamed from: m */
    public int f8549m;

    /* renamed from: n */
    public java.lang.String f8550n;

    /* renamed from: o */
    public java.lang.String f8551o;

    public C2143c(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f8537a = sharedPreferences;
        this.f8538b = sharedPreferences.getBoolean("androidResumeOnClick", true);
        this.f8539c = sharedPreferences.getString("androidNotificationChannelId", null);
        this.f8540d = sharedPreferences.getString("androidNotificationChannelName", null);
        this.f8541e = sharedPreferences.getString("androidNotificationChannelDescription", null);
        this.f8542f = sharedPreferences.getInt("notificationColor", -1);
        this.f8543g = sharedPreferences.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.f8544h = sharedPreferences.getBoolean("androidShowNotificationBadge", false);
        this.f8545i = sharedPreferences.getBoolean("androidNotificationClickStartsActivity", true);
        this.f8546j = sharedPreferences.getBoolean("androidNotificationOngoing", false);
        this.f8547k = sharedPreferences.getBoolean("androidStopForegroundOnPause", true);
        this.f8548l = sharedPreferences.getInt("artDownscaleWidth", -1);
        this.f8549m = sharedPreferences.getInt("artDownscaleHeight", -1);
        this.f8550n = sharedPreferences.getString("activityClassName", null);
        this.f8551o = sharedPreferences.getString("androidBrowsableRootExtras", null);
    }

    /* renamed from: a */
    public final void m4263a() {
        this.f8537a.edit().putBoolean("androidResumeOnClick", this.f8538b).putString("androidNotificationChannelId", this.f8539c).putString("androidNotificationChannelName", this.f8540d).putString("androidNotificationChannelDescription", this.f8541e).putInt("notificationColor", this.f8542f).putString("androidNotificationIcon", this.f8543g).putBoolean("androidShowNotificationBadge", this.f8544h).putBoolean("androidNotificationClickStartsActivity", this.f8545i).putBoolean("androidNotificationOngoing", this.f8546j).putBoolean("androidStopForegroundOnPause", this.f8547k).putInt("artDownscaleWidth", this.f8548l).putInt("artDownscaleHeight", this.f8549m).putString("activityClassName", this.f8550n).putString("androidBrowsableRootExtras", this.f8551o).apply();
    }
}
