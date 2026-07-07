package V2;

import T2.l;
import a0.InterfaceC0138s;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;

/* loaded from: classes.dex */
public final class b extends l implements o {

    /* renamed from: d, reason: collision with root package name */
    public boolean f2639d;

    /* JADX WARN: Type inference failed for: r0v0, types: [T2.a, V2.a] */
    @Override // T2.l
    public final T2.a a(InterfaceC0138s interfaceC0138s, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        boolean handlesCropAndRotation = textureRegistry$SurfaceProducer.handlesCropAndRotation();
        ?? aVar = new T2.a(interfaceC0138s, this.f2451a);
        aVar.f2638p = handlesCropAndRotation;
        return aVar;
    }

    @Override // T2.l
    public final void b() {
        super.b();
        this.f2452b.release();
    }
}
