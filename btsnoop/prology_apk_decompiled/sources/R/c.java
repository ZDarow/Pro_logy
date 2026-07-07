package R;

import E0.e;
import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.t;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public int[] f1712b;

    /* renamed from: c, reason: collision with root package name */
    public MediaSessionCompat$Token f1713c;

    @Override // E0.e
    public final void a(t tVar) {
        int i4 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) tVar.f3734m;
        if (i4 >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f1712b, this.f1713c));
        } else {
            a.d(builder, a.b(a.a(), this.f1712b, this.f1713c));
        }
    }
}
