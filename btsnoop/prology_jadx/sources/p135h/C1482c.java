package p135h;

/* renamed from: h.c */
/* loaded from: classes.dex */
public final class C1482c {

    /* renamed from: A */
    public java.lang.CharSequence f6025A;

    /* renamed from: D */
    public final /* synthetic */ p135h.C1483d f6028D;

    /* renamed from: a */
    public final android.view.Menu f6029a;

    /* renamed from: h */
    public boolean f6036h;

    /* renamed from: i */
    public int f6037i;

    /* renamed from: j */
    public int f6038j;

    /* renamed from: k */
    public java.lang.CharSequence f6039k;

    /* renamed from: l */
    public java.lang.CharSequence f6040l;

    /* renamed from: m */
    public int f6041m;

    /* renamed from: n */
    public char f6042n;

    /* renamed from: o */
    public int f6043o;

    /* renamed from: p */
    public char f6044p;

    /* renamed from: q */
    public int f6045q;

    /* renamed from: r */
    public int f6046r;

    /* renamed from: s */
    public boolean f6047s;

    /* renamed from: t */
    public boolean f6048t;

    /* renamed from: u */
    public boolean f6049u;

    /* renamed from: v */
    public int f6050v;

    /* renamed from: w */
    public int f6051w;

    /* renamed from: x */
    public java.lang.String f6052x;

    /* renamed from: y */
    public java.lang.String f6053y;

    /* renamed from: z */
    public java.lang.CharSequence f6054z;

    /* renamed from: B */
    public android.content.res.ColorStateList f6026B = null;

    /* renamed from: C */
    public android.graphics.PorterDuff.Mode f6027C = null;

    /* renamed from: b */
    public int f6030b = 0;

    /* renamed from: c */
    public int f6031c = 0;

    /* renamed from: d */
    public int f6032d = 0;

    /* renamed from: e */
    public int f6033e = 0;

    /* renamed from: f */
    public boolean f6034f = true;

    /* renamed from: g */
    public boolean f6035g = true;

    public C1482c(p135h.C1483d c1483d, android.view.Menu menu) {
        this.f6028D = c1483d;
        this.f6029a = menu;
    }

    /* renamed from: a */
    public final java.lang.Object m3307a(java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(str, false, this.f6028D.f6059c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (java.lang.Exception e4) {
            android.util.Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.MenuItem$OnMenuItemClickListener, java.lang.Object, h.b] */
    /* renamed from: b */
    public final void m3308b(android.view.MenuItem menuItem) {
        boolean z4 = false;
        menuItem.setChecked(this.f6047s).setVisible(this.f6048t).setEnabled(this.f6049u).setCheckable(this.f6046r >= 1).setTitleCondensed(this.f6040l).setIcon(this.f6041m);
        int i4 = this.f6050v;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        java.lang.String str = this.f6053y;
        p135h.C1483d c1483d = this.f6028D;
        if (str != null) {
            if (c1483d.f6059c.isRestricted()) {
                throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c1483d.f6060d == null) {
                c1483d.f6060d = p135h.C1483d.m3309a(c1483d.f6059c);
            }
            java.lang.Object obj = c1483d.f6060d;
            java.lang.String str2 = this.f6053y;
            ?? obj2 = new java.lang.Object();
            obj2.f6023a = obj;
            java.lang.Class<?> cls = obj.getClass();
            try {
                obj2.f6024b = cls.getMethod(str2, p135h.MenuItemOnMenuItemClickListenerC1481b.f6022c);
                menuItem.setOnMenuItemClickListener(obj2);
            } catch (java.lang.Exception e4) {
                android.view.InflateException inflateException = new android.view.InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f6046r >= 2 && (menuItem instanceof p140i.MenuItemC1518j)) {
            p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) menuItem;
            menuItemC1518j.f6317x = (menuItemC1518j.f6317x & (-5)) | 4;
        }
        java.lang.String str3 = this.f6052x;
        if (str3 != null) {
            menuItem.setActionView((android.view.View) m3307a(str3, p135h.C1483d.f6055e, c1483d.f6057a));
            z4 = true;
        }
        int i5 = this.f6051w;
        if (i5 > 0) {
            if (z4) {
                android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        java.lang.CharSequence charSequence = this.f6054z;
        boolean z5 = menuItem instanceof p140i.MenuItemC1518j;
        if (z5) {
            ((p140i.MenuItemC1518j) menuItem).m3382e(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        java.lang.CharSequence charSequence2 = this.f6025A;
        if (z5) {
            ((p140i.MenuItemC1518j) menuItem).m3384g(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c4 = this.f6042n;
        int i6 = this.f6043o;
        if (z5) {
            ((p140i.MenuItemC1518j) menuItem).setAlphabeticShortcut(c4, i6);
        } else {
            menuItem.setAlphabeticShortcut(c4, i6);
        }
        char c5 = this.f6044p;
        int i7 = this.f6045q;
        if (z5) {
            ((p140i.MenuItemC1518j) menuItem).setNumericShortcut(c5, i7);
        } else {
            menuItem.setNumericShortcut(c5, i7);
        }
        android.graphics.PorterDuff.Mode mode = this.f6027C;
        if (mode != null) {
            if (z5) {
                ((p140i.MenuItemC1518j) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        android.content.res.ColorStateList colorStateList = this.f6026B;
        if (colorStateList != null) {
            if (z5) {
                ((p140i.MenuItemC1518j) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
