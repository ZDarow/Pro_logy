package p146j0;

/* renamed from: j0.v */
/* loaded from: classes.dex */
public final /* synthetic */ class C1718v implements p146j0.InterfaceC1695A {

    /* renamed from: m */
    public static final p146j0.C1718v f7176m = new p146j0.C1718v(0);

    /* renamed from: l */
    public final /* synthetic */ int f7177l;

    public /* synthetic */ C1718v(int i4) {
        this.f7177l = i4;
    }

    @Override // p146j0.InterfaceC1695A
    /* renamed from: c */
    public int mo286c(java.lang.Object obj) {
        p146j0.C1709m c1709m = (p146j0.C1709m) obj;
        switch (this.f7177l) {
            case 1:
                java.lang.String str = c1709m.f7093a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (p086W.AbstractC0805y.f2801a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return c1709m.f7093a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
