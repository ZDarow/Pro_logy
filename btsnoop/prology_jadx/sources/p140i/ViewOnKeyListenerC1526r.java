package p140i;

/* renamed from: i.r */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1526r extends p140i.AbstractC1519k implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {

    /* renamed from: A */
    public boolean f6333A;

    /* renamed from: B */
    public boolean f6334B;

    /* renamed from: C */
    public int f6335C;

    /* renamed from: D */
    public int f6336D = 0;

    /* renamed from: E */
    public boolean f6337E;

    /* renamed from: m */
    public final android.content.Context f6338m;

    /* renamed from: n */
    public final p140i.MenuC1517i f6339n;

    /* renamed from: o */
    public final p140i.C1515g f6340o;

    /* renamed from: p */
    public final boolean f6341p;

    /* renamed from: q */
    public final int f6342q;

    /* renamed from: r */
    public final int f6343r;

    /* renamed from: s */
    public final p145j.C1637P f6344s;

    /* renamed from: t */
    public final p140i.ViewTreeObserverOnGlobalLayoutListenerC1511c f6345t;

    /* renamed from: u */
    public final p140i.ViewOnAttachStateChangeListenerC1512d f6346u;

    /* renamed from: v */
    public p140i.C1520l f6347v;

    /* renamed from: w */
    public android.view.View f6348w;

    /* renamed from: x */
    public android.view.View f6349x;

    /* renamed from: y */
    public p140i.InterfaceC1522n f6350y;

    /* renamed from: z */
    public android.view.ViewTreeObserver f6351z;

    /* JADX WARN: Type inference failed for: r6v1, types: [j.M, j.P] */
    public ViewOnKeyListenerC1526r(int i4, android.content.Context context, android.view.View view, p140i.MenuC1517i menuC1517i, boolean z4) {
        int i5 = 1;
        this.f6345t = new p140i.ViewTreeObserverOnGlobalLayoutListenerC1511c(this, i5);
        this.f6346u = new p140i.ViewOnAttachStateChangeListenerC1512d(this, i5);
        this.f6338m = context;
        this.f6339n = menuC1517i;
        this.f6341p = z4;
        this.f6340o = new p140i.C1515g(menuC1517i, android.view.LayoutInflater.from(context), z4, com.prology.R.layout.abc_popup_menu_item_layout);
        this.f6343r = i4;
        android.content.res.Resources resources = context.getResources();
        this.f6342q = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.prology.R.dimen.abc_config_prefDialogWidth));
        this.f6348w = view;
        this.f6344s = new p145j.AbstractC1634M(context, i4);
        menuC1517i.m3360b(this, context);
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: a */
    public final void mo3340a(p140i.MenuC1517i menuC1517i, boolean z4) {
        if (menuC1517i != this.f6339n) {
            return;
        }
        dismiss();
        p140i.InterfaceC1522n interfaceC1522n = this.f6350y;
        if (interfaceC1522n != null) {
            interfaceC1522n.mo821a(menuC1517i, z4);
        }
    }

    @Override // p140i.InterfaceC1525q
    /* renamed from: c */
    public final void mo3341c() {
        android.view.View view;
        if (mo3345i()) {
            return;
        }
        if (this.f6333A || (view = this.f6348w) == null) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f6349x = view;
        p145j.C1637P c1637p = this.f6344s;
        c1637p.f6848G.setOnDismissListener(this);
        c1637p.f6861x = this;
        c1637p.f6847F = true;
        c1637p.f6848G.setFocusable(true);
        android.view.View view2 = this.f6349x;
        boolean z4 = this.f6351z == null;
        android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f6351z = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f6345t);
        }
        view2.addOnAttachStateChangeListener(this.f6346u);
        c1637p.f6860w = view2;
        c1637p.f6858u = this.f6336D;
        boolean z5 = this.f6334B;
        android.content.Context context = this.f6338m;
        p140i.C1515g c1515g = this.f6340o;
        if (!z5) {
            this.f6335C = p140i.AbstractC1519k.m3385m(c1515g, context, this.f6342q);
            this.f6334B = true;
        }
        int i4 = this.f6335C;
        android.graphics.drawable.Drawable background = c1637p.f6848G.getBackground();
        if (background != null) {
            android.graphics.Rect rect = c1637p.f6845D;
            background.getPadding(rect);
            c1637p.f6852o = rect.left + rect.right + i4;
        } else {
            c1637p.f6852o = i4;
        }
        c1637p.f6848G.setInputMethodMode(2);
        android.graphics.Rect rect2 = this.f6320l;
        c1637p.f6846E = rect2 != null ? new android.graphics.Rect(rect2) : null;
        c1637p.mo3341c();
        p145j.C1636O c1636o = c1637p.f6851n;
        c1636o.setOnKeyListener(this);
        if (this.f6337E) {
            p140i.MenuC1517i menuC1517i = this.f6339n;
            if (menuC1517i.f6283l != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(context).inflate(com.prology.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) c1636o, false);
                android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1517i.f6283l);
                }
                frameLayout.setEnabled(false);
                c1636o.addHeaderView(frameLayout, null, false);
            }
        }
        c1637p.m3590a(c1515g);
        c1637p.mo3341c();
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: d */
    public final boolean mo3342d() {
        return false;
    }

    @Override // p140i.InterfaceC1525q
    public final void dismiss() {
        if (mo3345i()) {
            this.f6344s.dismiss();
        }
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: f */
    public final void mo3343f(p140i.InterfaceC1522n interfaceC1522n) {
        this.f6350y = interfaceC1522n;
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: h */
    public final void mo3344h() {
        this.f6334B = false;
        p140i.C1515g c1515g = this.f6340o;
        if (c1515g != null) {
            c1515g.notifyDataSetChanged();
        }
    }

    @Override // p140i.InterfaceC1525q
    /* renamed from: i */
    public final boolean mo3345i() {
        return !this.f6333A && this.f6344s.f6848G.isShowing();
    }

    @Override // p140i.InterfaceC1523o
    /* renamed from: j */
    public final boolean mo3346j(p140i.SubMenuC1527s subMenuC1527s) {
        if (subMenuC1527s.hasVisibleItems()) {
            p140i.C1521m c1521m = new p140i.C1521m(this.f6343r, this.f6338m, this.f6349x, subMenuC1527s, this.f6341p);
            p140i.InterfaceC1522n interfaceC1522n = this.f6350y;
            c1521m.f6329h = interfaceC1522n;
            p140i.AbstractC1519k abstractC1519k = c1521m.f6330i;
            if (abstractC1519k != null) {
                abstractC1519k.mo3343f(interfaceC1522n);
            }
            boolean m3386u = p140i.AbstractC1519k.m3386u(subMenuC1527s);
            c1521m.f6328g = m3386u;
            p140i.AbstractC1519k abstractC1519k2 = c1521m.f6330i;
            if (abstractC1519k2 != null) {
                abstractC1519k2.mo3350o(m3386u);
            }
            c1521m.f6331j = this.f6347v;
            this.f6347v = null;
            this.f6339n.m3361c(false);
            p145j.C1637P c1637p = this.f6344s;
            int i4 = c1637p.f6853p;
            int i5 = !c1637p.f6855r ? 0 : c1637p.f6854q;
            int i6 = this.f6336D;
            android.view.View view = this.f6348w;
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            if ((android.view.Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i4 += this.f6348w.getWidth();
            }
            if (!c1521m.m3391b()) {
                if (c1521m.f6326e != null) {
                    c1521m.m3393d(i4, i5, true, true);
                }
            }
            p140i.InterfaceC1522n interfaceC1522n2 = this.f6350y;
            if (interfaceC1522n2 != null) {
                interfaceC1522n2.mo822h(subMenuC1527s);
            }
            return true;
        }
        return false;
    }

    @Override // p140i.InterfaceC1525q
    /* renamed from: k */
    public final android.widget.ListView mo3347k() {
        return this.f6344s.f6851n;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: l */
    public final void mo3348l(p140i.MenuC1517i menuC1517i) {
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: n */
    public final void mo3349n(android.view.View view) {
        this.f6348w = view;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: o */
    public final void mo3350o(boolean z4) {
        this.f6340o.f6267n = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f6333A = true;
        this.f6339n.m3361c(true);
        android.view.ViewTreeObserver viewTreeObserver = this.f6351z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f6351z = this.f6349x.getViewTreeObserver();
            }
            this.f6351z.removeGlobalOnLayoutListener(this.f6345t);
            this.f6351z = null;
        }
        this.f6349x.removeOnAttachStateChangeListener(this.f6346u);
        p140i.C1520l c1520l = this.f6347v;
        if (c1520l != null) {
            c1520l.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i4, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: p */
    public final void mo3351p(int i4) {
        this.f6336D = i4;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: q */
    public final void mo3352q(int i4) {
        this.f6344s.f6853p = i4;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: r */
    public final void mo3353r(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f6347v = (p140i.C1520l) onDismissListener;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: s */
    public final void mo3354s(boolean z4) {
        this.f6337E = z4;
    }

    @Override // p140i.AbstractC1519k
    /* renamed from: t */
    public final void mo3355t(int i4) {
        p145j.C1637P c1637p = this.f6344s;
        c1637p.f6854q = i4;
        c1637p.f6855r = true;
    }
}
