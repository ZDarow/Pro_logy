package p152k1;

/* renamed from: k1.E */
/* loaded from: classes.dex */
public final class C1757E extends p011C.C0110b {

    /* renamed from: d */
    public final androidx.recyclerview.widget.RecyclerView f7212d;

    public C1757E(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f7212d = recyclerView;
        new p152k1.C1756D(this);
    }

    @Override // p011C.C0110b
    /* renamed from: a */
    public final void mo400a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo400a(view, accessibilityEvent);
        accessibilityEvent.setClassName(androidx.recyclerview.widget.RecyclerView.class.getName());
        if (!(view instanceof androidx.recyclerview.widget.RecyclerView) || this.f7212d.m2719l()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo2687A(accessibilityEvent);
        }
    }

    @Override // p011C.C0110b
    /* renamed from: b */
    public final void mo401b(android.view.View view, p015D.C0157f c0157f) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f308a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = c0157f.f425a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7212d;
        if (recyclerView.m2719l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        p152k1.AbstractC1780s layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = layoutManager.f7294b;
        io.flutter.plugin.platform.C1580c c1580c = recyclerView2.f4437l;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f7294b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f7294b.canScrollVertically(1) || layoutManager.f7294b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        p152k1.C1753A c1753a = recyclerView2.f4434i0;
        accessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo2686x(c1580c, c1753a), layoutManager.mo2685q(c1580c, c1753a), false, 0));
    }

    @Override // p011C.C0110b
    /* renamed from: c */
    public final boolean mo402c(android.view.View view, int i4, android.os.Bundle bundle) {
        int m3744u;
        int m3742s;
        if (super.mo402c(view, i4, bundle)) {
            return true;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7212d;
        if (recyclerView.m2719l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        p152k1.AbstractC1780s layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = layoutManager.f7294b;
        io.flutter.plugin.platform.C1580c c1580c = recyclerView2.f4437l;
        if (i4 == 4096) {
            m3744u = recyclerView2.canScrollVertically(1) ? (layoutManager.f7299g - layoutManager.m3744u()) - layoutManager.m3741r() : 0;
            if (layoutManager.f7294b.canScrollHorizontally(1)) {
                m3742s = (layoutManager.f7298f - layoutManager.m3742s()) - layoutManager.m3743t();
            }
            m3742s = 0;
        } else if (i4 != 8192) {
            m3742s = 0;
            m3744u = 0;
        } else {
            m3744u = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f7299g - layoutManager.m3744u()) - layoutManager.m3741r()) : 0;
            if (layoutManager.f7294b.canScrollHorizontally(-1)) {
                m3742s = -((layoutManager.f7298f - layoutManager.m3742s()) - layoutManager.m3743t());
            }
            m3742s = 0;
        }
        if (m3744u == 0 && m3742s == 0) {
            return false;
        }
        layoutManager.f7294b.m2725r(m3742s, m3744u);
        return true;
    }
}
