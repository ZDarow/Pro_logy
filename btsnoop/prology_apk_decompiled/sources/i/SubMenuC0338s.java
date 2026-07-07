package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: i.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0338s extends MenuC0328i implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final MenuC0328i f6124v;
    public final MenuItemC0329j w;

    public SubMenuC0338s(Context context, MenuC0328i menuC0328i, MenuItemC0329j menuItemC0329j) {
        super(context);
        this.f6124v = menuC0328i;
        this.w = menuItemC0329j;
    }

    @Override // i.MenuC0328i
    public final boolean d(MenuItemC0329j menuItemC0329j) {
        return this.f6124v.d(menuItemC0329j);
    }

    @Override // i.MenuC0328i
    public final boolean e(MenuC0328i menuC0328i, MenuItem menuItem) {
        super.e(menuC0328i, menuItem);
        return this.f6124v.e(menuC0328i, menuItem);
    }

    @Override // i.MenuC0328i
    public final boolean f(MenuItemC0329j menuItemC0329j) {
        return this.f6124v.f(menuItemC0329j);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.w;
    }

    @Override // i.MenuC0328i
    public final MenuC0328i j() {
        return this.f6124v.j();
    }

    @Override // i.MenuC0328i
    public final boolean l() {
        return this.f6124v.l();
    }

    @Override // i.MenuC0328i
    public final boolean m() {
        return this.f6124v.m();
    }

    @Override // i.MenuC0328i
    public final boolean n() {
        return this.f6124v.n();
    }

    @Override // i.MenuC0328i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f6124v.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.w.setIcon(drawable);
        return this;
    }

    @Override // i.MenuC0328i, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f6124v.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i4) {
        q(0, null, i4, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i4) {
        q(i4, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i4) {
        this.w.setIcon(i4);
        return this;
    }
}
