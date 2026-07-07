package S;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.c;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.h;
import android.view.KeyEvent;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: c, reason: collision with root package name */
    public final Context f1877c;

    /* renamed from: d, reason: collision with root package name */
    public final Intent f1878d;

    /* renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver.PendingResult f1879e;

    /* renamed from: f, reason: collision with root package name */
    public e f1880f;

    public b(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f1877c = context;
        this.f1878d = intent;
        this.f1879e = pendingResult;
    }

    @Override // android.support.v4.media.c
    public final void a() {
        d dVar = this.f1880f.f3668a;
        if (dVar.f3666h == null) {
            MediaSession.Token sessionToken = dVar.f3660b.getSessionToken();
            dVar.f3666h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, null) : null;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = dVar.f3666h;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        Collections.synchronizedSet(new HashSet());
        int i4 = Build.VERSION.SDK_INT;
        Context context = this.f1877c;
        h hVar = i4 >= 29 ? new h(context, mediaSessionCompat$Token) : new h(context, mediaSessionCompat$Token);
        KeyEvent keyEvent = (KeyEvent) this.f1878d.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        hVar.f3704a.dispatchMediaButtonEvent(keyEvent);
        this.f1880f.a();
        this.f1879e.finish();
    }

    @Override // android.support.v4.media.c
    public final void b() {
        this.f1880f.a();
        this.f1879e.finish();
    }

    @Override // android.support.v4.media.c
    public final void c() {
        this.f1880f.a();
        this.f1879e.finish();
    }
}
