package p072S;

/* renamed from: S.b */
/* loaded from: classes.dex */
public final class C0622b extends android.support.v4.media.AbstractC1035c {

    /* renamed from: c */
    public final android.content.Context f1948c;

    /* renamed from: d */
    public final android.content.Intent f1949d;

    /* renamed from: e */
    public final android.content.BroadcastReceiver.PendingResult f1950e;

    /* renamed from: f */
    public android.support.v4.media.C1037e f1951f;

    public C0622b(android.content.Context context, android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.f1948c = context;
        this.f1949d = intent;
        this.f1950e = pendingResult;
    }

    @Override // android.support.v4.media.AbstractC1035c
    /* renamed from: a */
    public final void mo1130a() {
        android.support.v4.media.C1036d c1036d = this.f1951f.f3793a;
        if (c1036d.f3791h == null) {
            android.media.session.MediaSession.Token sessionToken = c1036d.f3785b.getSessionToken();
            c1036d.f3791h = sessionToken != null ? new android.support.v4.media.session.MediaSessionCompat$Token(sessionToken, null) : null;
        }
        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = c1036d.f3791h;
        if (mediaSessionCompat$Token == null) {
            throw new java.lang.IllegalArgumentException("sessionToken must not be null");
        }
        java.util.Collections.synchronizedSet(new java.util.HashSet());
        int i4 = android.os.Build.VERSION.SDK_INT;
        android.content.Context context = this.f1948c;
        android.support.v4.media.session.C1049h c1049h = i4 >= 29 ? new android.support.v4.media.session.C1049h(context, mediaSessionCompat$Token) : new android.support.v4.media.session.C1049h(context, mediaSessionCompat$Token);
        android.view.KeyEvent keyEvent = (android.view.KeyEvent) this.f1949d.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new java.lang.IllegalArgumentException("KeyEvent may not be null");
        }
        c1049h.f3831a.dispatchMediaButtonEvent(keyEvent);
        this.f1951f.m2068a();
        this.f1950e.finish();
    }

    @Override // android.support.v4.media.AbstractC1035c
    /* renamed from: b */
    public final void mo1131b() {
        this.f1951f.m2068a();
        this.f1950e.finish();
    }

    @Override // android.support.v4.media.AbstractC1035c
    /* renamed from: c */
    public final void mo1132c() {
        this.f1951f.m2068a();
        this.f1950e.finish();
    }
}
