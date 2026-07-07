package p186r2;

/* renamed from: r2.c */
/* loaded from: classes.dex */
public final class C2069c extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f8408a;

    /* renamed from: b */
    public final /* synthetic */ p186r2.C2070d f8409b;

    public /* synthetic */ C2069c(p186r2.C2070d c2070d, int i4) {
        this.f8408a = i4;
        this.f8409b = c2070d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        switch (this.f8408a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f8409b.m4142e("onBecomingNoisy", new java.lang.Object[0]);
                    return;
                }
                return;
            default:
                this.f8409b.m4142e("onScoAudioStateUpdated", java.lang.Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), java.lang.Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
                return;
        }
    }
}
