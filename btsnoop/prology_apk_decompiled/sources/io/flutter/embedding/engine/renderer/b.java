package io.flutter.embedding.engine.renderer;

import io.flutter.view.n;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6210l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f6211m;

    public /* synthetic */ b(n nVar, int i4) {
        this.f6210l = i4;
        this.f6211m = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6210l) {
            case 0:
                FlutterRenderer$ImageReaderSurfaceProducer.a((FlutterRenderer$ImageReaderSurfaceProducer) this.f6211m);
                return;
            default:
                ((g) this.f6211m).getClass();
                return;
        }
    }
}
