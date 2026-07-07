package p080U1;

/* renamed from: U1.b */
/* loaded from: classes.dex */
public final class C0749b implements p146j0.InterfaceC1705i {

    /* renamed from: l */
    public final android.content.Context f2608l;

    @Override // p146j0.InterfaceC1705i
    /* renamed from: G */
    public p146j0.InterfaceC1706j mo820G(p146j0.C1704h c1704h) {
        android.content.Context context;
        int i4 = p086W.AbstractC0805y.f2801a;
        if (i4 < 23 || (i4 < 31 && ((context = this.f2608l) == null || i4 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new p046L1.C0363g(23, false).mo820G(c1704h);
        }
        int m1196g = p076T.AbstractC0665H.m1196g(c1704h.f7089c.f2408m);
        p086W.AbstractC0781a.m1429r("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + p086W.AbstractC0805y.m1585F(m1196g));
        return new p094Y.C0886x(m1196g).mo820G(c1704h);
    }
}
