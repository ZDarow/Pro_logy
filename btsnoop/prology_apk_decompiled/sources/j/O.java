package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import i.C0326g;
import i.MenuC0328i;
import i.MenuItemC0329j;

/* loaded from: classes.dex */
public final class O extends D {

    /* renamed from: A, reason: collision with root package name */
    public N f6611A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItemC0329j f6612B;

    /* renamed from: y, reason: collision with root package name */
    public final int f6613y;

    /* renamed from: z, reason: collision with root package name */
    public final int f6614z;

    public O(Context context, boolean z4) {
        super(context, z4);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f6613y = 21;
            this.f6614z = 22;
        } else {
            this.f6613y = 22;
            this.f6614z = 21;
        }
    }

    @Override // j.D, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0326g c0326g;
        int i4;
        int pointToPosition;
        int i5;
        if (this.f6611A != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i4 = headerViewListAdapter.getHeadersCount();
                c0326g = (C0326g) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0326g = (C0326g) adapter;
                i4 = 0;
            }
            MenuItemC0329j item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i4) < 0 || i5 >= c0326g.getCount()) ? null : c0326g.getItem(i5);
            MenuItemC0329j menuItemC0329j = this.f6612B;
            if (menuItemC0329j != item) {
                MenuC0328i menuC0328i = c0326g.f6042l;
                if (menuItemC0329j != null) {
                    this.f6611A.j(menuC0328i, menuItemC0329j);
                }
                this.f6612B = item;
                if (item != null) {
                    this.f6611A.g(menuC0328i, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.f6613y) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i4 != this.f6614z) {
            return super.onKeyDown(i4, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0326g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0326g) adapter).f6042l.c(false);
        return true;
    }

    public void setHoverListener(N n4) {
        this.f6611A = n4;
    }

    @Override // j.D, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
