package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.m */
/* loaded from: classes.dex */
public abstract class AbstractC1054m {

    /* renamed from: c */
    public boolean f3839c;

    /* renamed from: e */
    public p064Q.HandlerC0547s f3841e;

    /* renamed from: a */
    public final java.lang.Object f3837a = new java.lang.Object();

    /* renamed from: b */
    public final android.support.v4.media.session.C1053l f3838b = new android.support.v4.media.session.C1053l(this);

    /* renamed from: d */
    public java.lang.ref.WeakReference f3840d = new java.lang.ref.WeakReference(null);

    /* renamed from: A */
    public void mo2160A(long j4) {
    }

    /* renamed from: B */
    public void mo2161B() {
    }

    /* renamed from: a */
    public final void m2162a(android.support.v4.media.session.C1056o c1056o, android.os.Handler handler) {
        if (this.f3839c) {
            this.f3839c = false;
            handler.removeMessages(1);
            android.support.v4.media.session.PlaybackStateCompat m2191d = c1056o.m2191d();
            long j4 = m2191d == null ? 0L : m2191d.f3812p;
            boolean z4 = m2191d != null && m2191d.f3808l == 3;
            boolean z5 = (516 & j4) != 0;
            boolean z6 = (j4 & 514) != 0;
            if (z4 && z6) {
                mo2168g();
            } else {
                if (z4 || !z5) {
                    return;
                }
                mo2169h();
            }
        }
    }

    /* renamed from: b */
    public void mo2163b(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
    }

    /* renamed from: c */
    public void mo2164c(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i4) {
    }

    /* renamed from: d */
    public void mo2165d(java.lang.String str, android.os.Bundle bundle) {
    }

    /* renamed from: e */
    public void mo2166e() {
    }

    /* renamed from: f */
    public boolean mo2167f(android.content.Intent intent) {
        android.support.v4.media.session.C1056o c1056o;
        p064Q.HandlerC0547s handlerC0547s;
        android.view.KeyEvent keyEvent;
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.f3837a) {
            c1056o = (android.support.v4.media.session.C1056o) this.f3840d.get();
            handlerC0547s = this.f3841e;
        }
        if (c1056o == null || handlerC0547s == null || (keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        p064Q.C0549u mo2190c = c1056o.mo2190c();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 85) {
            m2162a(c1056o, handlerC0547s);
            return false;
        }
        if (keyEvent.getRepeatCount() != 0) {
            m2162a(c1056o, handlerC0547s);
        } else if (this.f3839c) {
            handlerC0547s.removeMessages(1);
            this.f3839c = false;
            android.support.v4.media.session.PlaybackStateCompat m2191d = c1056o.m2191d();
            if (((m2191d == null ? 0L : m2191d.f3812p) & 32) != 0) {
                mo2186y();
            }
        } else {
            this.f3839c = true;
            handlerC0547s.sendMessageDelayed(handlerC0547s.obtainMessage(1, mo2190c), android.view.ViewConfiguration.getDoubleTapTimeout());
        }
        return true;
    }

    /* renamed from: g */
    public void mo2168g() {
    }

    /* renamed from: h */
    public void mo2169h() {
    }

    /* renamed from: i */
    public void mo2170i(java.lang.String str, android.os.Bundle bundle) {
    }

    /* renamed from: j */
    public void mo2171j(java.lang.String str, android.os.Bundle bundle) {
    }

    /* renamed from: k */
    public void mo2172k(android.net.Uri uri, android.os.Bundle bundle) {
    }

    /* renamed from: l */
    public void mo2173l() {
    }

    /* renamed from: m */
    public void mo2174m(java.lang.String str, android.os.Bundle bundle) {
    }

    /* renamed from: n */
    public void mo2175n(java.lang.String str, android.os.Bundle bundle) {
    }

    /* renamed from: o */
    public void mo2176o(android.net.Uri uri, android.os.Bundle bundle) {
    }

    /* renamed from: p */
    public void mo2177p(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
    }

    /* renamed from: q */
    public void mo2178q() {
    }

    /* renamed from: r */
    public void mo2179r(long j4) {
    }

    /* renamed from: s */
    public void mo2180s(boolean z4) {
    }

    /* renamed from: t */
    public void mo2181t(float f4) {
    }

    /* renamed from: u */
    public void mo2182u(android.support.v4.media.RatingCompat ratingCompat) {
    }

    /* renamed from: v */
    public void mo2183v(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) {
    }

    /* renamed from: w */
    public void mo2184w(int i4) {
    }

    /* renamed from: x */
    public void mo2185x(int i4) {
    }

    /* renamed from: y */
    public void mo2186y() {
    }

    /* renamed from: z */
    public void mo2187z() {
    }
}
