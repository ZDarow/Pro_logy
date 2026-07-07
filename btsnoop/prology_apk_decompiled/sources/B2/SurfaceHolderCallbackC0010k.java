package B2;

import T.O;
import a0.C0118H;
import a0.InterfaceC0138s;
import android.view.Surface;
import android.view.SurfaceHolder;

/* renamed from: B2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0010k implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171b;

    public /* synthetic */ SurfaceHolderCallbackC0010k(int i4, Object obj) {
        this.f170a = i4;
        this.f171b = obj;
    }

    private final void a(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        switch (this.f170a) {
            case 0:
                C0011l c0011l = (C0011l) this.f171b;
                io.flutter.embedding.engine.renderer.j jVar = c0011l.f174n;
                if (jVar == null || c0011l.f173m) {
                    return;
                }
                if (jVar == null) {
                    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
                }
                jVar.f6245a.onSurfaceChanged(i5, i6);
                return;
            default:
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.f170a) {
            case 0:
                C0011l c0011l = (C0011l) this.f171b;
                c0011l.f172l = true;
                if ((c0011l.f174n == null || c0011l.f173m) ? false : true) {
                    c0011l.e();
                    return;
                }
                return;
            default:
                Surface surface = surfaceHolder.getSurface();
                O o2 = (InterfaceC0138s) this.f171b;
                ((C0118H) o2).N(surface);
                E0.e eVar = (E0.e) o2;
                eVar.getClass();
                eVar.k(((C0118H) eVar).q(), 1L, false);
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.f170a) {
            case 0:
                C0011l c0011l = (C0011l) this.f171b;
                boolean z4 = false;
                c0011l.f172l = false;
                io.flutter.embedding.engine.renderer.j jVar = c0011l.f174n;
                if (jVar != null && !c0011l.f173m) {
                    z4 = true;
                }
                if (z4) {
                    if (jVar == null) {
                        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                    }
                    jVar.h();
                    return;
                }
                return;
            default:
                ((C0118H) ((InterfaceC0138s) this.f171b)).N(null);
                return;
        }
    }
}
