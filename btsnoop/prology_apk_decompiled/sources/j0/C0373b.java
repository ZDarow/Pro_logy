package j0;

import android.os.HandlerThread;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0373b implements e2.j {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6792m;

    public /* synthetic */ C0373b(int i4, int i5) {
        this.f6791l = i5;
        this.f6792m = i4;
    }

    @Override // e2.j
    public final Object get() {
        switch (this.f6791l) {
            case 0:
                return new HandlerThread(c.d("ExoPlayer:MediaCodecAsyncAdapter:", this.f6792m));
            default:
                return new HandlerThread(c.d("ExoPlayer:MediaCodecQueueingThread:", this.f6792m));
        }
    }
}
