package j0;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements InterfaceC0371A {

    /* renamed from: m, reason: collision with root package name */
    public static final v f6914m = new v(0);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6915l;

    public /* synthetic */ v(int i4) {
        this.f6915l = i4;
    }

    @Override // j0.InterfaceC0371A
    public int c(Object obj) {
        m mVar = (m) obj;
        switch (this.f6915l) {
            case 1:
                String str = mVar.f6833a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (W.y.f2709a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return mVar.f6833a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
