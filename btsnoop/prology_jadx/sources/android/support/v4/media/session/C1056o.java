package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.o */
/* loaded from: classes.dex */
public class C1056o {

    /* renamed from: a */
    public final android.media.session.MediaSession f3844a;

    /* renamed from: b */
    public final android.support.v4.media.session.BinderC1055n f3845b;

    /* renamed from: c */
    public final android.support.v4.media.session.MediaSessionCompat$Token f3846c;

    /* renamed from: d */
    public final java.lang.Object f3847d = new java.lang.Object();

    /* renamed from: e */
    public final android.os.RemoteCallbackList f3848e = new android.os.RemoteCallbackList();

    /* renamed from: f */
    public android.support.v4.media.session.PlaybackStateCompat f3849f;

    /* renamed from: g */
    public java.util.ArrayList f3850g;

    /* renamed from: h */
    public android.support.v4.media.MediaMetadataCompat f3851h;

    /* renamed from: i */
    public boolean f3852i;

    /* renamed from: j */
    public int f3853j;

    /* renamed from: k */
    public int f3854k;

    /* renamed from: l */
    public android.support.v4.media.session.AbstractC1054m f3855l;

    /* renamed from: m */
    public p064Q.C0549u f3856m;

    public C1056o(com.ryanheise.audioservice.AudioService audioService) {
        android.media.session.MediaSession mo2188a = mo2188a(audioService);
        this.f3844a = mo2188a;
        android.support.v4.media.session.BinderC1055n binderC1055n = new android.support.v4.media.session.BinderC1055n(this);
        this.f3845b = binderC1055n;
        this.f3846c = new android.support.v4.media.session.MediaSessionCompat$Token(mo2188a.getSessionToken(), binderC1055n);
        mo2188a.setFlags(3);
    }

    /* renamed from: a */
    public android.media.session.MediaSession mo2188a(com.ryanheise.audioservice.AudioService audioService) {
        return new android.media.session.MediaSession(audioService, "media-session");
    }

    /* renamed from: b */
    public final android.support.v4.media.session.AbstractC1054m m2189b() {
        android.support.v4.media.session.AbstractC1054m abstractC1054m;
        synchronized (this.f3847d) {
            abstractC1054m = this.f3855l;
        }
        return abstractC1054m;
    }

    /* renamed from: c */
    public p064Q.C0549u mo2190c() {
        p064Q.C0549u c0549u;
        synchronized (this.f3847d) {
            c0549u = this.f3856m;
        }
        return c0549u;
    }

    /* renamed from: d */
    public final android.support.v4.media.session.PlaybackStateCompat m2191d() {
        return this.f3849f;
    }

    /* renamed from: e */
    public final void m2192e(android.support.v4.media.session.AbstractC1054m abstractC1054m, android.os.Handler handler) {
        synchronized (this.f3847d) {
            this.f3855l = abstractC1054m;
            this.f3844a.setCallback(abstractC1054m == null ? null : abstractC1054m.f3838b, handler);
            if (abstractC1054m != null) {
                synchronized (abstractC1054m.f3837a) {
                    try {
                        abstractC1054m.f3840d = new java.lang.ref.WeakReference(this);
                        p064Q.HandlerC0547s handlerC0547s = abstractC1054m.f3841e;
                        p064Q.HandlerC0547s handlerC0547s2 = null;
                        if (handlerC0547s != null) {
                            handlerC0547s.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            handlerC0547s2 = new p064Q.HandlerC0547s(abstractC1054m, handler.getLooper(), 1);
                        }
                        abstractC1054m.f3841e = handlerC0547s2;
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void mo2193f(p064Q.C0549u c0549u) {
        synchronized (this.f3847d) {
            this.f3856m = c0549u;
        }
    }
}
