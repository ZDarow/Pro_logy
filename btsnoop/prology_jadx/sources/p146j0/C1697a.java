package p146j0;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1697a implements android.media.MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ int f7046a;

    /* renamed from: b */
    public final /* synthetic */ p206w0.C2316l f7047b;

    /* renamed from: c */
    public final /* synthetic */ p146j0.InterfaceC1706j f7048c;

    public /* synthetic */ C1697a(p146j0.InterfaceC1706j interfaceC1706j, p206w0.C2316l c2316l, int i4) {
        this.f7046a = i4;
        this.f7048c = interfaceC1706j;
        this.f7047b = c2316l;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(android.media.MediaCodec mediaCodec, long j4, long j5) {
        switch (this.f7046a) {
            case 0:
                ((p146j0.C1699c) this.f7048c).getClass();
                p206w0.C2316l c2316l = this.f7047b;
                c2316l.getClass();
                if (p086W.AbstractC0805y.f2801a >= 30) {
                    c2316l.m4498a(j4);
                    return;
                } else {
                    android.os.Handler handler = c2316l.f9149l;
                    handler.sendMessageAtFrontOfQueue(android.os.Message.obtain(handler, 0, (int) (j4 >> 32), (int) j4));
                    return;
                }
            default:
                ((android.support.v4.media.session.C1061t) this.f7048c).getClass();
                p206w0.C2316l c2316l2 = this.f7047b;
                c2316l2.getClass();
                if (p086W.AbstractC0805y.f2801a >= 30) {
                    c2316l2.m4498a(j4);
                    return;
                } else {
                    android.os.Handler handler2 = c2316l2.f9149l;
                    handler2.sendMessageAtFrontOfQueue(android.os.Message.obtain(handler2, 0, (int) (j4 >> 32), (int) j4));
                    return;
                }
        }
    }
}
