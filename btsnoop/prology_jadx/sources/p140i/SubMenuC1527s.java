package p140i;

/* renamed from: i.s */
/* loaded from: classes.dex */
public final class SubMenuC1527s extends p140i.MenuC1517i implements android.view.SubMenu {

    /* renamed from: v */
    public final p140i.MenuC1517i f6352v;

    /* renamed from: w */
    public final p140i.MenuItemC1518j f6353w;

    public SubMenuC1527s(android.content.Context context, p140i.MenuC1517i menuC1517i, p140i.MenuItemC1518j menuItemC1518j) {
        super(context);
        this.f6352v = menuC1517i;
        this.f6353w = menuItemC1518j;
    }

    @Override // p140i.MenuC1517i
    /* renamed from: d */
    public final boolean mo3362d(p140i.MenuItemC1518j menuItemC1518j) {
        return this.f6352v.mo3362d(menuItemC1518j);
    }

    @Override // p140i.MenuC1517i
    /* renamed from: e */
    public final boolean mo3363e(p140i.MenuC1517i menuC1517i, android.view.MenuItem menuItem) {
        super.mo3363e(menuC1517i, menuItem);
        return this.f6352v.mo3363e(menuC1517i, menuItem);
    }

    @Override // p140i.MenuC1517i
    /* renamed from: f */
    public final boolean mo3364f(p140i.MenuItemC1518j menuItemC1518j) {
        return this.f6352v.mo3364f(menuItemC1518j);
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
        return this.f6353w;
    }

    @Override // p140i.MenuC1517i
    /* renamed from: j */
    public final p140i.MenuC1517i mo3368j() {
        return this.f6352v.mo3368j();
    }

    @Override // p140i.MenuC1517i
    /* renamed from: l */
    public final boolean mo3370l() {
        return this.f6352v.mo3370l();
    }

    @Override // p140i.MenuC1517i
    /* renamed from: m */
    public final boolean mo3371m() {
        return this.f6352v.mo3371m();
    }

    @Override // p140i.MenuC1517i
    /* renamed from: n */
    public final boolean mo3372n() {
        return this.f6352v.mo3372n();
    }

    @Override // p140i.MenuC1517i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f6352v.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        m3375q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        m3375q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View view) {
        m3375q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.f6353w.setIcon(drawable);
        return this;
    }

    @Override // p140i.MenuC1517i, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f6352v.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int i4) {
        m3375q(0, null, i4, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int i4) {
        m3375q(i4, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int i4) {
        this.f6353w.setIcon(i4);
        return this;
    }
}
