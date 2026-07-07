package p145j;

/* renamed from: j.O */
/* loaded from: classes.dex */
public final class C1636O extends p145j.AbstractC1625D {

    /* renamed from: A */
    public p145j.InterfaceC1635N f6864A;

    /* renamed from: B */
    public p140i.MenuItemC1518j f6865B;

    /* renamed from: y */
    public final int f6866y;

    /* renamed from: z */
    public final int f6867z;

    public C1636O(android.content.Context context, boolean z4) {
        super(context, z4);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f6866y = 21;
            this.f6867z = 22;
        } else {
            this.f6866y = 22;
            this.f6867z = 21;
        }
    }

    @Override // p145j.AbstractC1625D, android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        p140i.C1515g c1515g;
        int i4;
        int pointToPosition;
        int i5;
        if (this.f6864A != null) {
            android.widget.ListAdapter adapter = getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                i4 = headerViewListAdapter.getHeadersCount();
                c1515g = (p140i.C1515g) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1515g = (p140i.C1515g) adapter;
                i4 = 0;
            }
            p140i.MenuItemC1518j item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i4) < 0 || i5 >= c1515g.getCount()) ? null : c1515g.getItem(i5);
            p140i.MenuItemC1518j menuItemC1518j = this.f6865B;
            if (menuItemC1518j != item) {
                p140i.MenuC1517i menuC1517i = c1515g.f6265l;
                if (menuItemC1518j != null) {
                    this.f6864A.mo3194j(menuC1517i, menuItemC1518j);
                }
                this.f6865B = item;
                if (item != null) {
                    this.f6864A.mo3193g(menuC1517i, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, android.view.KeyEvent keyEvent) {
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.f6866y) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i4 != this.f6867z) {
            return super.onKeyDown(i4, keyEvent);
        }
        setSelection(-1);
        android.widget.ListAdapter adapter = getAdapter();
        (adapter instanceof android.widget.HeaderViewListAdapter ? (p140i.C1515g) ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter() : (p140i.C1515g) adapter).f6265l.m3361c(false);
        return true;
    }

    public void setHoverListener(p145j.InterfaceC1635N interfaceC1635N) {
        this.f6864A = interfaceC1635N;
    }

    @Override // p145j.AbstractC1625D, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
        super.setSelector(drawable);
    }
}
