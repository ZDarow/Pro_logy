package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: p */
    public final int f4389p;

    /* renamed from: q */
    public final p129f2.C1408Y f4390q;

    public GridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f4389p = -1;
        new android.util.SparseIntArray();
        new android.util.SparseIntArray();
        p129f2.C1408Y c1408y = new p129f2.C1408Y(13);
        this.f4390q = c1408y;
        new android.graphics.Rect();
        int i6 = p152k1.AbstractC1780s.m3733w(context, attributeSet, i4, i5).f7280c;
        if (i6 == this.f4389p) {
            return;
        }
        if (i6 < 1) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Span count should be at least 1. Provided ", i6));
        }
        this.f4389p = i6;
        ((android.util.SparseIntArray) c1408y.f5729m).clear();
        m3737H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: Q */
    public final void mo2679Q(boolean z4) {
        if (z4) {
            throw new java.lang.UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo2679Q(false);
    }

    /* renamed from: R */
    public final int m2680R(io.flutter.plugin.platform.C1580c c1580c, p152k1.C1753A c1753a, int i4) {
        boolean z4 = c1753a.f7201c;
        p129f2.C1408Y c1408y = this.f4390q;
        if (!z4) {
            int i5 = this.f4389p;
            c1408y.getClass();
            return p129f2.C1408Y.m3183w(i4, i5);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) c1580c.f6569q;
        if (i4 < 0 || i4 >= recyclerView.f4434i0.m3718a()) {
            throw new java.lang.IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + recyclerView.f4434i0.m3718a() + recyclerView.m2716h());
        }
        int m2220d0 = !recyclerView.f4434i0.f7201c ? i4 : recyclerView.f4441n.m2220d0(i4, 0);
        if (m2220d0 != -1) {
            int i6 = this.f4389p;
            c1408y.getClass();
            return p129f2.C1408Y.m3183w(m2220d0, i6);
        }
        android.util.Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: d */
    public final boolean mo2681d(p152k1.C1781t c1781t) {
        return c1781t instanceof p152k1.C1770i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p152k1.AbstractC1780s
    /* renamed from: l */
    public final p152k1.C1781t mo2682l() {
        return this.f4391h == 0 ? new p152k1.C1781t(-2, -1) : new p152k1.C1781t(-1, -2);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: m */
    public final p152k1.C1781t mo2683m(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p152k1.C1781t(context, attributeSet);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: n */
    public final p152k1.C1781t mo2684n(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new p152k1.C1781t((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new p152k1.C1781t(layoutParams);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: q */
    public final int mo2685q(io.flutter.plugin.platform.C1580c c1580c, p152k1.C1753A c1753a) {
        if (this.f4391h == 1) {
            return this.f4389p;
        }
        if (c1753a.m3718a() < 1) {
            return 0;
        }
        return m2680R(c1580c, c1753a, c1753a.m3718a() - 1) + 1;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: x */
    public final int mo2686x(io.flutter.plugin.platform.C1580c c1580c, p152k1.C1753A c1753a) {
        if (this.f4391h == 0) {
            return this.f4389p;
        }
        if (c1753a.m3718a() < 1) {
            return 0;
        }
        return m2680R(c1580c, c1753a, c1753a.m3718a() - 1) + 1;
    }
}
