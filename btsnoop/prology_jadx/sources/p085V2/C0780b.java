package p085V2;

/* renamed from: V2.b */
/* loaded from: classes.dex */
public final class C0780b extends p078T2.AbstractC0735l implements io.flutter.view.InterfaceC1618o {

    /* renamed from: d */
    public boolean f2731d;

    /* JADX WARN: Type inference failed for: r0v0, types: [T2.a, V2.a] */
    @Override // p078T2.AbstractC0735l
    /* renamed from: a */
    public final p078T2.AbstractC0724a mo1322a(p102a0.InterfaceC0994s interfaceC0994s, io.flutter.view.TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer == null) {
            throw new java.lang.IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        boolean handlesCropAndRotation = textureRegistry$SurfaceProducer.handlesCropAndRotation();
        ?? abstractC0724a = new p078T2.AbstractC0724a(interfaceC0994s, this.f2538a);
        abstractC0724a.f2730p = handlesCropAndRotation;
        return abstractC0724a;
    }

    @Override // p078T2.AbstractC0735l
    /* renamed from: b */
    public final void mo1323b() {
        super.mo1323b();
        this.f2539b.release();
    }
}
