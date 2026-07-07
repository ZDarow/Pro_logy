package io.flutter.view;

import android.hardware.display.DisplayManager;
import w0.s;

/* loaded from: classes.dex */
public final class p implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6542a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayManager f6543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6544c;

    public /* synthetic */ p(Object obj, DisplayManager displayManager, int i4) {
        this.f6542a = i4;
        this.f6544c = obj;
        this.f6543b = displayManager;
    }

    private final void a(int i4) {
    }

    private final void b(int i4) {
    }

    private final void c(int i4) {
    }

    private final void d(int i4) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i4) {
        int i5 = this.f6542a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i4) {
        switch (this.f6542a) {
            case 0:
                if (i4 == 0) {
                    float refreshRate = this.f6543b.getDisplay(0).getRefreshRate();
                    r rVar = (r) this.f6544c;
                    rVar.f6549a = (long) (1.0E9d / refreshRate);
                    rVar.f6550b.setRefreshRateFPS(refreshRate);
                    return;
                }
                return;
            default:
                if (i4 == 0) {
                    s.a((s) this.f6544c, this.f6543b.getDisplay(0));
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i4) {
        int i5 = this.f6542a;
    }
}
