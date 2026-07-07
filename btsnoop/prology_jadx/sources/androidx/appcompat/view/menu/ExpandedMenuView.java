package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements p140i.InterfaceC1516h, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: l */
    public static final int[] f3875l = {android.R.attr.background, android.R.attr.divider};

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        android.support.v4.media.session.C1061t m2202q0 = android.support.v4.media.session.C1061t.m2202q0(context, attributeSet, f3875l, android.R.attr.listViewStyle);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) m2202q0.f3862n;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(m2202q0.m2225g0(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(m2202q0.m2225g0(1));
        }
        m2202q0.m2243u0();
    }

    @Override // p140i.InterfaceC1516h
    /* renamed from: a */
    public final boolean mo2280a(p140i.MenuItemC1518j menuItemC1518j) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i4, long j4) {
        throw null;
    }
}
