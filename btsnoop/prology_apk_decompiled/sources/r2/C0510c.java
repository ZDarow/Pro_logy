package r2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0511d f8094b;

    public /* synthetic */ C0510c(C0511d c0511d, int i4) {
        this.f8093a = i4;
        this.f8094b = c0511d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f8093a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f8094b.e("onBecomingNoisy", new Object[0]);
                    return;
                }
                return;
            default:
                this.f8094b.e("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
                return;
        }
    }
}
