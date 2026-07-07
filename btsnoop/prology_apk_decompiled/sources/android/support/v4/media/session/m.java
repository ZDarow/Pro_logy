package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: c, reason: collision with root package name */
    public boolean f3712c;

    /* renamed from: e, reason: collision with root package name */
    public Q.s f3714e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3710a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final l f3711b = new l(this);

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f3713d = new WeakReference(null);

    public void A(long j4) {
    }

    public void B() {
    }

    public final void a(o oVar, Handler handler) {
        if (this.f3712c) {
            this.f3712c = false;
            handler.removeMessages(1);
            PlaybackStateCompat d4 = oVar.d();
            long j4 = d4 == null ? 0L : d4.f3687p;
            boolean z4 = d4 != null && d4.f3683l == 3;
            boolean z5 = (516 & j4) != 0;
            boolean z6 = (j4 & 514) != 0;
            if (z4 && z6) {
                g();
            } else {
                if (z4 || !z5) {
                    return;
                }
                h();
            }
        }
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void c(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
    }

    public void d(String str, Bundle bundle) {
    }

    public void e() {
    }

    public boolean f(Intent intent) {
        o oVar;
        Q.s sVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.f3710a) {
            oVar = (o) this.f3713d.get();
            sVar = this.f3714e;
        }
        if (oVar == null || sVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        Q.u c4 = oVar.c();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 85) {
            a(oVar, sVar);
            return false;
        }
        if (keyEvent.getRepeatCount() != 0) {
            a(oVar, sVar);
        } else if (this.f3712c) {
            sVar.removeMessages(1);
            this.f3712c = false;
            PlaybackStateCompat d4 = oVar.d();
            if (((d4 == null ? 0L : d4.f3687p) & 32) != 0) {
                y();
            }
        } else {
            this.f3712c = true;
            sVar.sendMessageDelayed(sVar.obtainMessage(1, c4), ViewConfiguration.getDoubleTapTimeout());
        }
        return true;
    }

    public void g() {
    }

    public void h() {
    }

    public void i(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(Uri uri, Bundle bundle) {
    }

    public void l() {
    }

    public void m(String str, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(Uri uri, Bundle bundle) {
    }

    public void p(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void q() {
    }

    public void r(long j4) {
    }

    public void s(boolean z4) {
    }

    public void t(float f4) {
    }

    public void u(RatingCompat ratingCompat) {
    }

    public void v(RatingCompat ratingCompat, Bundle bundle) {
    }

    public void w(int i4) {
    }

    public void x(int i4) {
    }

    public void y() {
    }

    public void z() {
    }
}
