package io.flutter.view;

/* renamed from: io.flutter.view.p */
/* loaded from: classes.dex */
public final class C1619p implements android.hardware.display.DisplayManager.DisplayListener {

    /* renamed from: a */
    public final /* synthetic */ int f6789a;

    /* renamed from: b */
    public final android.hardware.display.DisplayManager f6790b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.Object f6791c;

    public /* synthetic */ C1619p(java.lang.Object obj, android.hardware.display.DisplayManager displayManager, int i4) {
        this.f6789a = i4;
        this.f6791c = obj;
        this.f6790b = displayManager;
    }

    /* renamed from: a */
    private final void m3571a(int i4) {
    }

    /* renamed from: b */
    private final void m3572b(int i4) {
    }

    /* renamed from: c */
    private final void m3573c(int i4) {
    }

    /* renamed from: d */
    private final void m3574d(int i4) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i4) {
        int i5 = this.f6789a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i4) {
        switch (this.f6789a) {
            case 0:
                if (i4 == 0) {
                    float refreshRate = this.f6790b.getDisplay(0).getRefreshRate();
                    io.flutter.view.C1621r c1621r = (io.flutter.view.C1621r) this.f6791c;
                    c1621r.f6796a = (long) (1.0E9d / refreshRate);
                    c1621r.f6797b.setRefreshRateFPS(refreshRate);
                    return;
                }
                return;
            default:
                if (i4 == 0) {
                    p206w0.C2323s.m4524a((p206w0.C2323s) this.f6791c, this.f6790b.getDisplay(0));
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i4) {
        int i5 = this.f6789a;
    }
}
