package p146j0;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1698b implements p124e2.InterfaceC1362j {

    /* renamed from: l */
    public final /* synthetic */ int f7049l;

    /* renamed from: m */
    public final /* synthetic */ int f7050m;

    public /* synthetic */ C1698b(int i4, int i5) {
        this.f7049l = i5;
        this.f7050m = i4;
    }

    @Override // p124e2.InterfaceC1362j
    public final java.lang.Object get() {
        switch (this.f7049l) {
            case 0:
                return new android.os.HandlerThread(p146j0.C1699c.m3654d("ExoPlayer:MediaCodecAsyncAdapter:", this.f7050m));
            default:
                return new android.os.HandlerThread(p146j0.C1699c.m3654d("ExoPlayer:MediaCodecQueueingThread:", this.f7050m));
        }
    }
}
