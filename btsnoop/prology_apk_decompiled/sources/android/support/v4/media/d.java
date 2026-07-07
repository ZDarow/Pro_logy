package android.support.v4.media;

import Y.x;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import n.C0442e;
import n.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3659a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaBrowser f3660b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f3661c;

    /* renamed from: d, reason: collision with root package name */
    public final a f3662d = new a(this);

    /* renamed from: e, reason: collision with root package name */
    public final C0442e f3663e = new j(0);

    /* renamed from: f, reason: collision with root package name */
    public x f3664f;

    /* renamed from: g, reason: collision with root package name */
    public Messenger f3665g;

    /* renamed from: h, reason: collision with root package name */
    public MediaSessionCompat$Token f3666h;

    /* JADX WARN: Type inference failed for: r0v1, types: [n.e, n.j] */
    public d(Context context, ComponentName componentName, c cVar) {
        this.f3659a = context;
        Bundle bundle = new Bundle();
        this.f3661c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        cVar.f3658b = this;
        this.f3660b = new MediaBrowser(context, componentName, cVar.f3657a, bundle);
    }
}
