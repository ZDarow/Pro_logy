package p140i;

/* renamed from: i.k */
/* loaded from: classes.dex */
public abstract class AbstractC1519k implements p140i.InterfaceC1525q, p140i.InterfaceC1523o, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: l */
    public android.graphics.Rect f6320l;

    /* renamed from: m */
    public static int m3385m(android.widget.ListAdapter listAdapter, android.content.Context context, int i4) {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        android.widget.FrameLayout frameLayout = null;
        android.view.View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    /* renamed from: u */
    public static boolean m3386u(p140i.MenuC1517i menuC1517i) {
        int size = menuC1517i.f6277f.size();
        for (int i4 = 0; i4 < size; i4++) {
            android.view.MenuItem item = menuC1517i.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: b */
    public final boolean mo3387b(p140i.MenuItemC1518j menuItemC1518j) {
        return false;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: e */
    public final void mo3388e(android.content.Context context, p140i.MenuC1517i menuC1517i) {
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: g */
    public final boolean mo3389g(p140i.MenuItemC1518j menuItemC1518j) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo3348l(p140i.MenuC1517i menuC1517i);

    /* renamed from: n */
    public abstract void mo3349n(android.view.View view);

    /* renamed from: o */
    public abstract void mo3350o(boolean z4);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i4, long j4) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof android.widget.HeaderViewListAdapter ? (p140i.C1515g) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (p140i.C1515g) listAdapter).f6265l.m3374p((android.view.MenuItem) listAdapter.getItem(i4), this, !(this instanceof p140i.ViewOnKeyListenerC1514f) ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo3351p(int i4);

    /* renamed from: q */
    public abstract void mo3352q(int i4);

    /* renamed from: r */
    public abstract void mo3353r(android.widget.PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: s */
    public abstract void mo3354s(boolean z4);

    /* renamed from: t */
    public abstract void mo3355t(int i4);
}
