package p140i;

/* renamed from: i.j */
/* loaded from: classes.dex */
public final class MenuItemC1518j implements android.view.MenuItem {

    /* renamed from: A */
    public android.view.MenuItem.OnActionExpandListener f6292A;

    /* renamed from: a */
    public final int f6294a;

    /* renamed from: b */
    public final int f6295b;

    /* renamed from: c */
    public final int f6296c;

    /* renamed from: d */
    public final int f6297d;

    /* renamed from: e */
    public java.lang.CharSequence f6298e;

    /* renamed from: f */
    public java.lang.CharSequence f6299f;

    /* renamed from: g */
    public android.content.Intent f6300g;

    /* renamed from: h */
    public char f6301h;

    /* renamed from: j */
    public char f6303j;

    /* renamed from: l */
    public android.graphics.drawable.Drawable f6305l;

    /* renamed from: n */
    public final p140i.MenuC1517i f6307n;

    /* renamed from: o */
    public p140i.SubMenuC1527s f6308o;

    /* renamed from: p */
    public android.view.MenuItem.OnMenuItemClickListener f6309p;

    /* renamed from: q */
    public java.lang.CharSequence f6310q;

    /* renamed from: r */
    public java.lang.CharSequence f6311r;

    /* renamed from: z */
    public android.view.View f6319z;

    /* renamed from: i */
    public int f6302i = 4096;

    /* renamed from: k */
    public int f6304k = 4096;

    /* renamed from: m */
    public int f6306m = 0;

    /* renamed from: s */
    public android.content.res.ColorStateList f6312s = null;

    /* renamed from: t */
    public android.graphics.PorterDuff.Mode f6313t = null;

    /* renamed from: u */
    public boolean f6314u = false;

    /* renamed from: v */
    public boolean f6315v = false;

    /* renamed from: w */
    public boolean f6316w = false;

    /* renamed from: x */
    public int f6317x = 16;

    /* renamed from: B */
    public boolean f6293B = false;

    /* renamed from: y */
    public int f6318y = 0;

    public MenuItemC1518j(p140i.MenuC1517i menuC1517i, int i4, int i5, int i6, int i7, java.lang.CharSequence charSequence) {
        this.f6307n = menuC1517i;
        this.f6294a = i5;
        this.f6295b = i4;
        this.f6296c = i6;
        this.f6297d = i7;
        this.f6298e = charSequence;
    }

    /* renamed from: a */
    public static void m3378a(java.lang.StringBuilder sb, int i4, int i5, java.lang.String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    /* renamed from: b */
    public final android.graphics.drawable.Drawable m3379b(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.f6316w && (this.f6314u || this.f6315v)) {
            drawable = drawable.mutate();
            if (this.f6314u) {
                drawable.setTintList(this.f6312s);
            }
            if (this.f6315v) {
                drawable.setTintMode(this.f6313t);
            }
            this.f6316w = false;
        }
        return drawable;
    }

    /* renamed from: c */
    public final boolean m3380c() {
        return ((this.f6318y & 8) == 0 || this.f6319z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f6318y & 8) == 0) {
            return false;
        }
        if (this.f6319z == null) {
            return true;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.f6292A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6307n.mo3362d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m3381d() {
        return (this.f6317x & 32) == 32;
    }

    /* renamed from: e */
    public final p140i.MenuItemC1518j m3382e(java.lang.CharSequence charSequence) {
        this.f6310q = charSequence;
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m3380c()) {
            return false;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.f6292A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6307n.mo3364f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final void m3383f(boolean z4) {
        if (z4) {
            this.f6317x |= 32;
        } else {
            this.f6317x &= -33;
        }
    }

    /* renamed from: g */
    public final p140i.MenuItemC1518j m3384g(java.lang.CharSequence charSequence) {
        this.f6311r = charSequence;
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
        android.view.View view = this.f6319z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6304k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6303j;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.f6310q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6295b;
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        android.graphics.drawable.Drawable drawable = this.f6305l;
        if (drawable != null) {
            return m3379b(drawable);
        }
        int i4 = this.f6306m;
        if (i4 == 0) {
            return null;
        }
        android.graphics.drawable.Drawable m3116a = p126f.AbstractC1367a.m3116a(this.f6307n.f6272a, i4);
        this.f6306m = 0;
        this.f6305l = m3116a;
        return m3379b(m3116a);
    }

    @Override // android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.f6312s;
    }

    @Override // android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f6313t;
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.f6300g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6294a;
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6302i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6301h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6296c;
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return this.f6308o;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
        return this.f6298e;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f6299f;
        return charSequence != null ? charSequence : this.f6298e;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.f6311r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6308o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6293B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6317x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6317x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6317x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f6317x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View view) {
        int i4;
        this.f6319z = view;
        if (view != null && view.getId() == -1 && (i4 = this.f6294a) > 0) {
            view.setId(i4);
        }
        p140i.MenuC1517i menuC1517i = this.f6307n;
        menuC1517i.f6282k = true;
        menuC1517i.m3373o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c4) {
        if (this.f6303j == c4) {
            return this;
        }
        this.f6303j = java.lang.Character.toLowerCase(c4);
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z4) {
        int i4 = this.f6317x;
        int i5 = (z4 ? 1 : 0) | (i4 & (-2));
        this.f6317x = i5;
        if (i4 != i5) {
            this.f6307n.m3373o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z4) {
        int i4 = this.f6317x;
        if ((i4 & 4) != 0) {
            p140i.MenuC1517i menuC1517i = this.f6307n;
            menuC1517i.getClass();
            java.util.ArrayList arrayList = menuC1517i.f6277f;
            int size = arrayList.size();
            menuC1517i.m3377s();
            for (int i5 = 0; i5 < size; i5++) {
                p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) arrayList.get(i5);
                if (menuItemC1518j.f6295b == this.f6295b && (menuItemC1518j.f6317x & 4) != 0 && menuItemC1518j.isCheckable()) {
                    boolean z5 = menuItemC1518j == this;
                    int i6 = menuItemC1518j.f6317x;
                    int i7 = (z5 ? 2 : 0) | (i6 & (-3));
                    menuItemC1518j.f6317x = i7;
                    if (i6 != i7) {
                        menuItemC1518j.f6307n.m3373o(false);
                    }
                }
            }
            menuC1517i.m3376r();
        } else {
            int i8 = (i4 & (-3)) | (z4 ? 2 : 0);
            this.f6317x = i8;
            if (i4 != i8) {
                this.f6307n.m3373o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        m3382e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f6317x |= 16;
        } else {
            this.f6317x &= -17;
        }
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f6306m = 0;
        this.f6305l = drawable;
        this.f6316w = true;
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f6312s = colorStateList;
        this.f6314u = true;
        this.f6316w = true;
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f6313t = mode;
        this.f6315v = true;
        this.f6316w = true;
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f6300g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c4) {
        if (this.f6301h == c4) {
            return this;
        }
        this.f6301h = c4;
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6292A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6309p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c4, char c5) {
        this.f6301h = c4;
        this.f6303j = java.lang.Character.toLowerCase(c5);
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f6318y = i4;
        p140i.MenuC1517i menuC1517i = this.f6307n;
        menuC1517i.f6282k = true;
        menuC1517i.m3373o(true);
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f6298e = charSequence;
        this.f6307n.m3373o(false);
        p140i.SubMenuC1527s subMenuC1527s = this.f6308o;
        if (subMenuC1527s != null) {
            subMenuC1527s.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f6299f = charSequence;
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        m3384g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z4) {
        int i4 = this.f6317x;
        int i5 = (z4 ? 0 : 8) | (i4 & (-9));
        this.f6317x = i5;
        if (i4 != i5) {
            p140i.MenuC1517i menuC1517i = this.f6307n;
            menuC1517i.f6279h = true;
            menuC1517i.m3373o(true);
        }
        return this;
    }

    public final java.lang.String toString() {
        java.lang.CharSequence charSequence = this.f6298e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f6303j == c4 && this.f6304k == i4) {
            return this;
        }
        this.f6303j = java.lang.Character.toLowerCase(c4);
        this.f6304k = android.view.KeyEvent.normalizeMetaState(i4);
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f6301h == c4 && this.f6302i == i4) {
            return this;
        }
        this.f6301h = c4;
        this.f6302i = android.view.KeyEvent.normalizeMetaState(i4);
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f6301h = c4;
        this.f6302i = android.view.KeyEvent.normalizeMetaState(i4);
        this.f6303j = java.lang.Character.toLowerCase(c5);
        this.f6304k = android.view.KeyEvent.normalizeMetaState(i5);
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i4) {
        this.f6305l = null;
        this.f6306m = i4;
        this.f6316w = true;
        this.f6307n.m3373o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i4) {
        setTitle(this.f6307n.f6272a.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int i4) {
        int i5;
        android.content.Context context = this.f6307n.f6272a;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i4, (android.view.ViewGroup) new android.widget.LinearLayout(context), false);
        this.f6319z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i5 = this.f6294a) > 0) {
            inflate.setId(i5);
        }
        p140i.MenuC1517i menuC1517i = this.f6307n;
        menuC1517i.f6282k = true;
        menuC1517i.m3373o(true);
        return this;
    }
}
