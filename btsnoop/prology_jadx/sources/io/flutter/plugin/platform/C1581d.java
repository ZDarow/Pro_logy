package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.d */
/* loaded from: classes.dex */
public final class C1581d extends p009B2.C0053j {

    /* renamed from: r */
    public io.flutter.plugin.platform.C1578a f6570r;

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        io.flutter.plugin.platform.C1578a c1578a = this.f6570r;
        if (c1578a != null) {
            io.flutter.view.C1610g c1610g = c1578a.f6562a;
            if (c1610g == null ? false : c1610g.m3563f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
