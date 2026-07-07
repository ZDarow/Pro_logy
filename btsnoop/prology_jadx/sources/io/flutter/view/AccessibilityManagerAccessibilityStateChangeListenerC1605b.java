package io.flutter.view;

/* renamed from: io.flutter.view.b */
/* loaded from: classes.dex */
public final class AccessibilityManagerAccessibilityStateChangeListenerC1605b implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ io.flutter.view.C1610g f6663a;

    public AccessibilityManagerAccessibilityStateChangeListenerC1605b(io.flutter.view.C1610g c1610g) {
        this.f6663a = c1610g;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z4) {
        io.flutter.view.C1610g c1610g = this.f6663a;
        if (c1610g.f6772u) {
            return;
        }
        boolean z5 = false;
        android.support.v4.media.session.C1061t c1061t = c1610g.f6753b;
        if (z4) {
            io.flutter.view.C1604a c1604a = c1610g.f6773v;
            c1061t.f3863o = c1604a;
            ((io.flutter.embedding.engine.FlutterJNI) c1061t.f3862n).setAccessibilityDelegate(c1604a);
            ((io.flutter.embedding.engine.FlutterJNI) c1061t.f3862n).setSemanticsEnabled(true);
        } else {
            c1610g.m3567j(false);
            c1061t.f3863o = null;
            ((io.flutter.embedding.engine.FlutterJNI) c1061t.f3862n).setAccessibilityDelegate(null);
            ((io.flutter.embedding.engine.FlutterJNI) c1061t.f3862n).setSemanticsEnabled(false);
        }
        p009B2.C0061r c0061r = c1610g.f6770s;
        if (c0061r != null) {
            boolean isTouchExplorationEnabled = c1610g.f6754c.isTouchExplorationEnabled();
            p009B2.C0064u c0064u = (p009B2.C0064u) c0061r.f188m;
            if (c0064u.f210s.f352b.f6478a.getIsSoftwareRenderingEnabled()) {
                c0064u.setWillNotDraw(false);
                return;
            }
            if (!z4 && !isTouchExplorationEnabled) {
                z5 = true;
            }
            c0064u.setWillNotDraw(z5);
        }
    }
}
