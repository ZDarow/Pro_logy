package p102a0;

/* renamed from: a0.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C0991p implements p124e2.InterfaceC1362j {

    /* renamed from: l */
    public final /* synthetic */ int f3683l;

    public /* synthetic */ C0991p(int i4) {
        this.f3683l = i4;
    }

    @Override // p124e2.InterfaceC1362j
    public final java.lang.Object get() {
        switch (this.f3683l) {
            case 0:
                return new p102a0.C0980j(new p197u0.C2218e(), 50000, 50000, 2500, 5000, -1, false, 0);
            case 1:
                byte[] bArr = new byte[12];
                p107b0.C1172g.f4514i.nextBytes(bArr);
                return android.util.Base64.encodeToString(bArr, 10);
            default:
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    java.lang.Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    invoke.getClass();
                    return (p076T.InterfaceC0688c0) invoke;
                } catch (java.lang.Exception e4) {
                    throw new java.lang.IllegalStateException(e4);
                }
        }
    }
}
