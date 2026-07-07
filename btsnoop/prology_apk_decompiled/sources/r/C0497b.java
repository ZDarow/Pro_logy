package r;

import android.app.Notification;
import android.support.v4.media.session.t;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497b extends E0.e {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f7958b;

    @Override // E0.e
    public final void a(t tVar) {
        new Notification.BigTextStyle((Notification.Builder) tVar.f3734m).setBigContentTitle(null).bigText(this.f7958b);
    }

    @Override // E0.e
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
