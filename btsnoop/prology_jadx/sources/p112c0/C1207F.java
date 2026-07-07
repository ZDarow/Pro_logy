package p112c0;

/* renamed from: c0.F */
/* loaded from: classes.dex */
public final class C1207F {

    /* renamed from: a */
    public final android.media.AudioTrack f4647a;

    /* renamed from: b */
    public final p112c0.C1227i f4648b;

    /* renamed from: c */
    public p112c0.C1206E f4649c = new android.media.AudioRouting.OnRoutingChangedListener() { // from class: c0.E
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(android.media.AudioRouting audioRouting) {
            p112c0.C1207F.this.m2845b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [c0.E] */
    public C1207F(android.media.AudioTrack audioTrack, p112c0.C1227i c1227i) {
        this.f4647a = audioTrack;
        this.f4648b = c1227i;
        audioTrack.addOnRoutingChangedListener(this.f4649c, new android.os.Handler(android.os.Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m2845b(android.media.AudioRouting audioRouting) {
        if (this.f4649c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.f4648b.m2910b(audioRouting.getRoutedDevice());
    }

    /* renamed from: c */
    public void m2846c() {
        p112c0.C1206E c1206e = this.f4649c;
        c1206e.getClass();
        this.f4647a.removeOnRoutingChangedListener(c1206e);
        this.f4649c = null;
    }
}
