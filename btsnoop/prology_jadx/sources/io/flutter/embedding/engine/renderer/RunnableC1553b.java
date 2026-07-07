package io.flutter.embedding.engine.renderer;

/* renamed from: io.flutter.embedding.engine.renderer.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1553b implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f6443l;

    /* renamed from: m */
    public final /* synthetic */ io.flutter.view.InterfaceC1617n f6444m;

    public /* synthetic */ RunnableC1553b(io.flutter.view.InterfaceC1617n interfaceC1617n, int i4) {
        this.f6443l = i4;
        this.f6444m = interfaceC1617n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6443l) {
            case 0:
                io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer.m3440a((io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer) this.f6444m);
                return;
            default:
                ((io.flutter.embedding.engine.renderer.C1558g) this.f6444m).getClass();
                return;
        }
    }
}
