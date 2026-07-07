package android.support.v4.media;

/* renamed from: android.support.v4.media.e */
/* loaded from: classes.dex */
public final class C1037e {

    /* renamed from: b */
    public static final boolean f3792b = android.util.Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final android.support.v4.media.C1036d f3793a;

    public C1037e(android.content.Context context, android.content.ComponentName componentName, android.support.v4.media.AbstractC1035c abstractC1035c) {
        this.f3793a = new android.support.v4.media.C1036d(context, componentName, abstractC1035c);
    }

    /* renamed from: a */
    public final void m2068a() {
        android.os.Messenger messenger;
        android.support.v4.media.C1036d c1036d = this.f3793a;
        p094Y.C0886x c0886x = c1036d.f3789f;
        if (c0886x != null && (messenger = c1036d.f3790g) != null) {
            try {
                c0886x.m1722Z(7, null, messenger);
            } catch (android.os.RemoteException unused) {
                android.util.Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        c1036d.f3785b.disconnect();
    }
}
