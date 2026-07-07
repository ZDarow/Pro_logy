package android.support.v4.media;

/* renamed from: android.support.v4.media.d */
/* loaded from: classes.dex */
public final class C1036d {

    /* renamed from: a */
    public final android.content.Context f3784a;

    /* renamed from: b */
    public final android.media.browse.MediaBrowser f3785b;

    /* renamed from: c */
    public final android.os.Bundle f3786c;

    /* renamed from: d */
    public final android.support.v4.media.HandlerC1033a f3787d = new android.support.v4.media.HandlerC1033a(this);

    /* renamed from: e */
    public final p165n.C1878e f3788e = new p165n.C1883j(0);

    /* renamed from: f */
    public p094Y.C0886x f3789f;

    /* renamed from: g */
    public android.os.Messenger f3790g;

    /* renamed from: h */
    public android.support.v4.media.session.MediaSessionCompat$Token f3791h;

    /* JADX WARN: Type inference failed for: r0v1, types: [n.e, n.j] */
    public C1036d(android.content.Context context, android.content.ComponentName componentName, android.support.v4.media.AbstractC1035c abstractC1035c) {
        this.f3784a = context;
        android.os.Bundle bundle = new android.os.Bundle();
        this.f3786c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", android.os.Process.myPid());
        abstractC1035c.f3783b = this;
        this.f3785b = new android.media.browse.MediaBrowser(context, componentName, abstractC1035c.f3782a, bundle);
    }
}
