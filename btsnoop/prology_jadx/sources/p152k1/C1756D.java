package p152k1;

/* renamed from: k1.D */
/* loaded from: classes.dex */
public final class C1756D extends p011C.C0110b {

    /* renamed from: d */
    public final p152k1.C1757E f7211d;

    public C1756D(p152k1.C1757E c1757e) {
        this.f7211d = c1757e;
    }

    @Override // p011C.C0110b
    /* renamed from: b */
    public final void mo401b(android.view.View view, p015D.C0157f c0157f) {
        this.f308a.onInitializeAccessibilityNodeInfo(view, c0157f.f425a);
        p152k1.C1757E c1757e = this.f7211d;
        if (c1757e.f7212d.m2719l()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = c1757e.f7212d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            androidx.recyclerview.widget.RecyclerView.m2709j(view);
        }
    }

    @Override // p011C.C0110b
    /* renamed from: c */
    public final boolean mo402c(android.view.View view, int i4, android.os.Bundle bundle) {
        if (super.mo402c(view, i4, bundle)) {
            return true;
        }
        p152k1.C1757E c1757e = this.f7211d;
        if (!c1757e.f7212d.m2719l()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = c1757e.f7212d;
            if (recyclerView.getLayoutManager() != null) {
                io.flutter.plugin.platform.C1580c c1580c = recyclerView.getLayoutManager().f7294b.f4437l;
            }
        }
        return false;
    }
}
