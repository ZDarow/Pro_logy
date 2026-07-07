package j0;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0372a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.l f6789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f6790c;

    public /* synthetic */ C0372a(j jVar, w0.l lVar, int i4) {
        this.f6788a = i4;
        this.f6790c = jVar;
        this.f6789b = lVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j4, long j5) {
        switch (this.f6788a) {
            case 0:
                ((c) this.f6790c).getClass();
                w0.l lVar = this.f6789b;
                lVar.getClass();
                if (W.y.f2709a >= 30) {
                    lVar.a(j4);
                    return;
                } else {
                    Handler handler = lVar.f8794l;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j4 >> 32), (int) j4));
                    return;
                }
            default:
                ((android.support.v4.media.session.t) this.f6790c).getClass();
                w0.l lVar2 = this.f6789b;
                lVar2.getClass();
                if (W.y.f2709a >= 30) {
                    lVar2.a(j4);
                    return;
                } else {
                    Handler handler2 = lVar2.f8794l;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j4 >> 32), (int) j4));
                    return;
                }
        }
    }
}
