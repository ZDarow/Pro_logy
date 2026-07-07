package io.flutter.plugin.platform;

import B2.C0009j;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class d extends C0009j {

    /* renamed from: r, reason: collision with root package name */
    public C0344a f6335r;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0344a c0344a = this.f6335r;
        if (c0344a != null) {
            io.flutter.view.g gVar = c0344a.f6327a;
            if (gVar == null ? false : gVar.f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
