package p145j;

/* renamed from: j.i */
/* loaded from: classes.dex */
public final class C1663i implements p140i.InterfaceC1523o {

    /* renamed from: A */
    public boolean f6930A;

    /* renamed from: C */
    public p145j.C1657f f6932C;

    /* renamed from: D */
    public p145j.C1657f f6933D;

    /* renamed from: E */
    public p054N1.RunnableC0462q f6934E;

    /* renamed from: F */
    public p145j.C1659g f6935F;

    /* renamed from: l */
    public final android.content.Context f6937l;

    /* renamed from: m */
    public android.content.Context f6938m;

    /* renamed from: n */
    public p140i.MenuC1517i f6939n;

    /* renamed from: o */
    public final android.view.LayoutInflater f6940o;

    /* renamed from: p */
    public p140i.InterfaceC1522n f6941p;

    /* renamed from: r */
    public androidx.appcompat.widget.ActionMenuView f6943r;

    /* renamed from: s */
    public p145j.C1661h f6944s;

    /* renamed from: t */
    public android.graphics.drawable.Drawable f6945t;

    /* renamed from: u */
    public boolean f6946u;

    /* renamed from: v */
    public boolean f6947v;

    /* renamed from: w */
    public boolean f6948w;

    /* renamed from: x */
    public int f6949x;

    /* renamed from: y */
    public int f6950y;

    /* renamed from: z */
    public int f6951z;

    /* renamed from: q */
    public final int f6942q = com.prology.R.layout.abc_action_menu_item_layout;

    /* renamed from: B */
    public final android.util.SparseBooleanArray f6931B = new android.util.SparseBooleanArray();

    /* renamed from: G */
    public final p129f2.C1408Y f6936G = new p129f2.C1408Y(9, this);

    public C1663i(android.content.Context context) {
        this.f6937l = context;
        this.f6940o = android.view.LayoutInflater.from(context);
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: a */
    public final void mo3340a(p140i.MenuC1517i menuC1517i, boolean z4) {
        m3604i();
        p145j.C1657f c1657f = this.f6933D;
        if (c1657f != null && c1657f.m3391b()) {
            c1657f.f6330i.dismiss();
        }
        p140i.InterfaceC1522n interfaceC1522n = this.f6941p;
        if (interfaceC1522n != null) {
            interfaceC1522n.mo821a(menuC1517i, z4);
        }
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: b */
    public final boolean mo3387b(p140i.MenuItemC1518j menuItemC1518j) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i.p] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: c */
    public final android.view.View m3603c(p140i.MenuItemC1518j menuItemC1518j, android.view.View view, androidx.appcompat.widget.ActionMenuView actionMenuView) {
        android.view.View view2 = menuItemC1518j.f6319z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || menuItemC1518j.m3380c()) {
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = view instanceof p140i.InterfaceC1524p ? (p140i.InterfaceC1524p) view : (p140i.InterfaceC1524p) this.f6940o.inflate(this.f6942q, (android.view.ViewGroup) actionMenuView, false);
            actionMenuItemView.mo2277c(menuItemC1518j);
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f6943r);
            if (this.f6935F == null) {
                this.f6935F = new p145j.C1659g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f6935F);
            view2 = actionMenuItemView;
        }
        view2.setVisibility(menuItemC1518j.f6293B ? 8 : 0);
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof p145j.C1667k)) {
            view2.setLayoutParams(androidx.appcompat.widget.ActionMenuView.m2289i(layoutParams));
        }
        return view2;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: d */
    public final boolean mo3342d() {
        int i4;
        java.util.ArrayList arrayList;
        int i5;
        boolean z4;
        p140i.MenuC1517i menuC1517i = this.f6939n;
        if (menuC1517i != null) {
            arrayList = menuC1517i.m3369k();
            i4 = arrayList.size();
        } else {
            i4 = 0;
            arrayList = null;
        }
        int i6 = this.f6951z;
        int i7 = this.f6950y;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f6943r;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = 2;
            z4 = true;
            if (i8 >= i4) {
                break;
            }
            p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) arrayList.get(i8);
            int i11 = menuItemC1518j.f6318y;
            if ((i11 & 2) == 2) {
                i9++;
            } else if ((i11 & 1) == 1) {
                i10++;
            } else {
                z5 = true;
            }
            if (this.f6930A && menuItemC1518j.f6293B) {
                i6 = 0;
            }
            i8++;
        }
        if (this.f6947v && (z5 || i10 + i9 > i6)) {
            i6--;
        }
        int i12 = i6 - i9;
        android.util.SparseBooleanArray sparseBooleanArray = this.f6931B;
        sparseBooleanArray.clear();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i4) {
            p140i.MenuItemC1518j menuItemC1518j2 = (p140i.MenuItemC1518j) arrayList.get(i13);
            int i15 = menuItemC1518j2.f6318y;
            boolean z6 = (i15 & 2) == i5 ? z4 : false;
            int i16 = menuItemC1518j2.f6295b;
            if (z6) {
                android.view.View m3603c = m3603c(menuItemC1518j2, null, actionMenuView);
                m3603c.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = m3603c.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                if (i16 != 0) {
                    sparseBooleanArray.put(i16, z4);
                }
                menuItemC1518j2.m3383f(z4);
            } else if ((i15 & 1) == z4) {
                boolean z7 = sparseBooleanArray.get(i16);
                boolean z8 = ((i12 > 0 || z7) && i7 > 0) ? z4 : false;
                if (z8) {
                    android.view.View m3603c2 = m3603c(menuItemC1518j2, null, actionMenuView);
                    m3603c2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = m3603c2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z8 &= i7 + i14 > 0;
                }
                if (z8 && i16 != 0) {
                    sparseBooleanArray.put(i16, true);
                } else if (z7) {
                    sparseBooleanArray.put(i16, false);
                    for (int i17 = 0; i17 < i13; i17++) {
                        p140i.MenuItemC1518j menuItemC1518j3 = (p140i.MenuItemC1518j) arrayList.get(i17);
                        if (menuItemC1518j3.f6295b == i16) {
                            if (menuItemC1518j3.m3381d()) {
                                i12++;
                            }
                            menuItemC1518j3.m3383f(false);
                        }
                    }
                }
                if (z8) {
                    i12--;
                }
                menuItemC1518j2.m3383f(z8);
            } else {
                menuItemC1518j2.m3383f(false);
                i13++;
                i5 = 2;
                z4 = true;
            }
            i13++;
            i5 = 2;
            z4 = true;
        }
        return z4;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: e */
    public final void mo3388e(android.content.Context context, p140i.MenuC1517i menuC1517i) {
        this.f6938m = context;
        android.view.LayoutInflater.from(context);
        this.f6939n = menuC1517i;
        android.content.res.Resources resources = context.getResources();
        if (!this.f6948w) {
            this.f6947v = true;
        }
        int i4 = 2;
        this.f6949x = context.getResources().getDisplayMetrics().widthPixels / 2;
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
            i4 = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
            i4 = 4;
        } else if (i5 >= 360) {
            i4 = 3;
        }
        this.f6951z = i4;
        int i7 = this.f6949x;
        if (this.f6947v) {
            if (this.f6944s == null) {
                p145j.C1661h c1661h = new p145j.C1661h(this, this.f6937l);
                this.f6944s = c1661h;
                if (this.f6946u) {
                    c1661h.setImageDrawable(this.f6945t);
                    this.f6945t = null;
                    this.f6946u = false;
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6944s.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f6944s.getMeasuredWidth();
        } else {
            this.f6944s = null;
        }
        this.f6950y = i7;
        float f4 = resources.getDisplayMetrics().density;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: f */
    public final void mo3343f(p140i.InterfaceC1522n interfaceC1522n) {
        throw null;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: g */
    public final boolean mo3389g(p140i.MenuItemC1518j menuItemC1518j) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p140i.InterfaceC1523o
    /* renamed from: h */
    public final void mo3344h() {
        int i4;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f6943r;
        java.util.ArrayList arrayList = null;
        boolean z4 = false;
        if (actionMenuView != null) {
            p140i.MenuC1517i menuC1517i = this.f6939n;
            if (menuC1517i != null) {
                menuC1517i.m3367i();
                java.util.ArrayList m3369k = this.f6939n.m3369k();
                int size = m3369k.size();
                i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    p140i.MenuItemC1518j menuItemC1518j = (p140i.MenuItemC1518j) m3369k.get(i5);
                    if (menuItemC1518j.m3381d()) {
                        android.view.View childAt = actionMenuView.getChildAt(i4);
                        p140i.MenuItemC1518j itemData = childAt instanceof p140i.InterfaceC1524p ? ((p140i.InterfaceC1524p) childAt).getItemData() : null;
                        android.view.View m3603c = m3603c(menuItemC1518j, childAt, actionMenuView);
                        if (menuItemC1518j != itemData) {
                            m3603c.setPressed(false);
                            m3603c.jumpDrawablesToCurrentState();
                        }
                        if (m3603c != childAt) {
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) m3603c.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(m3603c);
                            }
                            this.f6943r.addView(m3603c, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i4) == this.f6944s) {
                    i4++;
                } else {
                    actionMenuView.removeViewAt(i4);
                }
            }
        }
        this.f6943r.requestLayout();
        p140i.MenuC1517i menuC1517i2 = this.f6939n;
        if (menuC1517i2 != null) {
            menuC1517i2.m3367i();
            java.util.ArrayList arrayList2 = menuC1517i2.f6280i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((p140i.MenuItemC1518j) arrayList2.get(i6)).getClass();
            }
        }
        p140i.MenuC1517i menuC1517i3 = this.f6939n;
        if (menuC1517i3 != null) {
            menuC1517i3.m3367i();
            arrayList = menuC1517i3.f6281j;
        }
        if (this.f6947v && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((p140i.MenuItemC1518j) arrayList.get(0)).f6293B;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f6944s == null) {
                this.f6944s = new p145j.C1661h(this, this.f6937l);
            }
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f6944s.getParent();
            if (viewGroup2 != this.f6943r) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f6944s);
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView2 = this.f6943r;
                p145j.C1661h c1661h = this.f6944s;
                actionMenuView2.getClass();
                p145j.C1667k m2288h = androidx.appcompat.widget.ActionMenuView.m2288h();
                m2288h.f6959a = true;
                actionMenuView2.addView(c1661h, m2288h);
            }
        } else {
            p145j.C1661h c1661h2 = this.f6944s;
            if (c1661h2 != null) {
                android.view.ViewParent parent = c1661h2.getParent();
                androidx.appcompat.widget.ActionMenuView actionMenuView3 = this.f6943r;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f6944s);
                }
            }
        }
        this.f6943r.setOverflowReserved(this.f6947v);
    }

    /* renamed from: i */
    public final boolean m3604i() {
        androidx.appcompat.widget.ActionMenuView actionMenuView;
        p054N1.RunnableC0462q runnableC0462q = this.f6934E;
        if (runnableC0462q != null && (actionMenuView = this.f6943r) != null) {
            actionMenuView.removeCallbacks(runnableC0462q);
            this.f6934E = null;
            return true;
        }
        p145j.C1657f c1657f = this.f6932C;
        if (c1657f == null) {
            return false;
        }
        if (c1657f.m3391b()) {
            c1657f.f6330i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p140i.InterfaceC1523o
    /* renamed from: j */
    public final boolean mo3346j(p140i.SubMenuC1527s subMenuC1527s) {
        boolean z4;
        if (!subMenuC1527s.hasVisibleItems()) {
            return false;
        }
        p140i.SubMenuC1527s subMenuC1527s2 = subMenuC1527s;
        while (true) {
            p140i.MenuC1517i menuC1517i = subMenuC1527s2.f6352v;
            if (menuC1517i == this.f6939n) {
                break;
            }
            subMenuC1527s2 = (p140i.SubMenuC1527s) menuC1517i;
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f6943r;
        android.view.View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                android.view.View childAt = actionMenuView.getChildAt(i4);
                if ((childAt instanceof p140i.InterfaceC1524p) && ((p140i.InterfaceC1524p) childAt).getItemData() == subMenuC1527s2.f6353w) {
                    view = childAt;
                    break;
                }
                i4++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC1527s.f6353w.getClass();
        int size = subMenuC1527s.f6277f.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z4 = false;
                break;
            }
            android.view.MenuItem item = subMenuC1527s.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i5++;
        }
        p145j.C1657f c1657f = new p145j.C1657f(this, this.f6938m, subMenuC1527s, view);
        this.f6933D = c1657f;
        c1657f.f6328g = z4;
        p140i.AbstractC1519k abstractC1519k = c1657f.f6330i;
        if (abstractC1519k != null) {
            abstractC1519k.mo3350o(z4);
        }
        p145j.C1657f c1657f2 = this.f6933D;
        if (!c1657f2.m3391b()) {
            if (c1657f2.f6326e == null) {
                throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c1657f2.m3393d(0, 0, false, false);
        }
        p140i.InterfaceC1522n interfaceC1522n = this.f6941p;
        if (interfaceC1522n != null) {
            interfaceC1522n.mo822h(subMenuC1527s);
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m3605k() {
        p140i.MenuC1517i menuC1517i;
        if (!this.f6947v) {
            return false;
        }
        p145j.C1657f c1657f = this.f6932C;
        if ((c1657f != null && c1657f.m3391b()) || (menuC1517i = this.f6939n) == null || this.f6943r == null || this.f6934E != null) {
            return false;
        }
        menuC1517i.m3367i();
        if (menuC1517i.f6281j.isEmpty()) {
            return false;
        }
        p054N1.RunnableC0462q runnableC0462q = new p054N1.RunnableC0462q(8, this, new p145j.C1657f(this, this.f6938m, this.f6939n, this.f6944s));
        this.f6934E = runnableC0462q;
        this.f6943r.post(runnableC0462q);
        return true;
    }
}
