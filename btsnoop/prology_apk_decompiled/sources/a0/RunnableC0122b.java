package a0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0122b extends BroadcastReceiver implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final SurfaceHolderCallbackC0115E f3391l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f3392m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y1.a f3393n;

    public RunnableC0122b(Y1.a aVar, Handler handler, SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E) {
        this.f3393n = aVar;
        this.f3392m = handler;
        this.f3391l = surfaceHolderCallbackC0115E;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f3392m.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3393n.f3078l) {
            this.f3391l.f3204a.R(-1, 3, false);
        }
    }
}
