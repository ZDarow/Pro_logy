package io.flutter.view;

import B2.u;
import android.support.v4.media.session.t;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f6424a;

    public b(g gVar) {
        this.f6424a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z4) {
        g gVar = this.f6424a;
        if (gVar.f6526u) {
            return;
        }
        boolean z5 = false;
        t tVar = gVar.f6508b;
        if (z4) {
            a aVar = gVar.f6527v;
            tVar.f3736o = aVar;
            ((FlutterJNI) tVar.f3735n).setAccessibilityDelegate(aVar);
            ((FlutterJNI) tVar.f3735n).setSemanticsEnabled(true);
        } else {
            gVar.j(false);
            tVar.f3736o = null;
            ((FlutterJNI) tVar.f3735n).setAccessibilityDelegate(null);
            ((FlutterJNI) tVar.f3735n).setSemanticsEnabled(false);
        }
        B2.r rVar = gVar.s;
        if (rVar != null) {
            boolean isTouchExplorationEnabled = gVar.f6509c.isTouchExplorationEnabled();
            u uVar = (u) rVar.f185m;
            if (uVar.s.f346b.f6245a.getIsSoftwareRenderingEnabled()) {
                uVar.setWillNotDraw(false);
                return;
            }
            if (!z4 && !isTouchExplorationEnabled) {
                z5 = true;
            }
            uVar.setWillNotDraw(z5);
        }
    }
}
