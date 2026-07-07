package io.flutter.plugin.platform;

import android.view.SurfaceView;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6411l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6412m;

    public /* synthetic */ x(int i4, Object obj) {
        this.f6411l = i4;
        this.f6412m = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6411l) {
            case 0:
                y yVar = (y) this.f6412m;
                ((SurfaceView) yVar.f6414b).postDelayed((l) yVar.f6415c, 128L);
                return;
            default:
                z zVar = (z) this.f6412m;
                zVar.f6416a.getViewTreeObserver().removeOnDrawListener(zVar);
                return;
        }
    }
}
