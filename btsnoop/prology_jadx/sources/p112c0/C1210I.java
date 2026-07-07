package p112c0;

/* renamed from: c0.I */
/* loaded from: classes.dex */
public final class C1210I {

    /* renamed from: a */
    public final android.os.Handler f4652a = new android.os.Handler(android.os.Looper.myLooper());

    /* renamed from: b */
    public final p112c0.C1209H f4653b = new p112c0.C1209H(this);

    /* renamed from: c */
    public final /* synthetic */ p112c0.C1211J f4654c;

    public C1210I(p112c0.C1211J c1211j) {
        this.f4654c = c1211j;
    }

    /* renamed from: a */
    public void m2847a(android.media.AudioTrack audioTrack) {
        android.os.Handler handler = this.f4652a;
        java.util.Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new p112c0.ExecutorC1208G(handler), this.f4653b);
    }

    /* renamed from: b */
    public void m2848b(android.media.AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f4653b);
        this.f4652a.removeCallbacksAndMessages(null);
    }
}
