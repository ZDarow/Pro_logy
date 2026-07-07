package io.flutter.view;

/* renamed from: io.flutter.view.c */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC1606c implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ android.view.accessibility.AccessibilityManager f6664a;

    /* renamed from: b */
    public final /* synthetic */ io.flutter.view.C1610g f6665b;

    public AccessibilityManagerTouchExplorationStateChangeListenerC1606c(io.flutter.view.C1610g c1610g, android.view.accessibility.AccessibilityManager accessibilityManager) {
        this.f6665b = c1610g;
        this.f6664a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        io.flutter.view.C1610g c1610g = this.f6665b;
        if (c1610g.f6772u) {
            return;
        }
        boolean z5 = false;
        if (!z4) {
            c1610g.m3567j(false);
            io.flutter.view.C1609f c1609f = c1610g.f6767p;
            if (c1609f != null) {
                c1610g.m3565h(c1609f.f6725b, 256);
                c1610g.f6767p = null;
            }
        }
        p009B2.C0061r c0061r = c1610g.f6770s;
        if (c0061r != null) {
            boolean isEnabled = this.f6664a.isEnabled();
            p009B2.C0064u c0064u = (p009B2.C0064u) c0061r.f188m;
            if (c0064u.f210s.f352b.f6478a.getIsSoftwareRenderingEnabled()) {
                c0064u.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z4) {
                z5 = true;
            }
            c0064u.setWillNotDraw(z5);
        }
    }
}
