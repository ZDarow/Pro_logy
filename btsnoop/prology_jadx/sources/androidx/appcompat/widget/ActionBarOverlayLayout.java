package androidx.appcompat.widget;

@android.annotation.SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements p011C.InterfaceC0116h, p011C.InterfaceC0117i {

    /* renamed from: J */
    public static final int[] f3914J = {com.prology.R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A */
    public p011C.C0105O f3915A;

    /* renamed from: B */
    public p011C.C0105O f3916B;

    /* renamed from: C */
    public p011C.C0105O f3917C;

    /* renamed from: D */
    public android.widget.OverScroller f3918D;

    /* renamed from: E */
    public android.view.ViewPropertyAnimator f3919E;

    /* renamed from: F */
    public final p145j.C1649b f3920F;

    /* renamed from: G */
    public final p145j.RunnableC1651c f3921G;

    /* renamed from: H */
    public final p145j.RunnableC1651c f3922H;

    /* renamed from: I */
    public final p011C.C0118j f3923I;

    /* renamed from: l */
    public int f3924l;

    /* renamed from: m */
    public androidx.appcompat.widget.ContentFrameLayout f3925m;

    /* renamed from: n */
    public androidx.appcompat.widget.ActionBarContainer f3926n;

    /* renamed from: o */
    public p145j.InterfaceC1622A f3927o;

    /* renamed from: p */
    public android.graphics.drawable.Drawable f3928p;

    /* renamed from: q */
    public boolean f3929q;

    /* renamed from: r */
    public boolean f3930r;

    /* renamed from: s */
    public boolean f3931s;

    /* renamed from: t */
    public boolean f3932t;

    /* renamed from: u */
    public boolean f3933u;

    /* renamed from: v */
    public int f3934v;

    /* renamed from: w */
    public final android.graphics.Rect f3935w;

    /* renamed from: x */
    public final android.graphics.Rect f3936x;

    /* renamed from: y */
    public final android.graphics.Rect f3937y;

    /* renamed from: z */
    public p011C.C0105O f3938z;

    public ActionBarOverlayLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3935w = new android.graphics.Rect();
        this.f3936x = new android.graphics.Rect();
        this.f3937y = new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        p011C.C0105O c0105o = p011C.C0105O.f301b;
        this.f3938z = c0105o;
        this.f3915A = c0105o;
        this.f3916B = c0105o;
        this.f3917C = c0105o;
        this.f3920F = new p145j.C1649b(this);
        this.f3921G = new p145j.RunnableC1651c(this, 0);
        this.f3922H = new p145j.RunnableC1651c(this, 1);
        m2286i(context);
        this.f3923I = new p011C.C0118j(0);
    }

    /* renamed from: g */
    public static boolean m2284g(android.view.View view, android.graphics.Rect rect, boolean z4) {
        boolean z5;
        p145j.C1655e c1655e = (p145j.C1655e) view.getLayoutParams();
        int i4 = ((android.view.ViewGroup.MarginLayoutParams) c1655e).leftMargin;
        int i5 = rect.left;
        if (i4 != i5) {
            ((android.view.ViewGroup.MarginLayoutParams) c1655e).leftMargin = i5;
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = ((android.view.ViewGroup.MarginLayoutParams) c1655e).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((android.view.ViewGroup.MarginLayoutParams) c1655e).topMargin = i7;
            z5 = true;
        }
        int i8 = ((android.view.ViewGroup.MarginLayoutParams) c1655e).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((android.view.ViewGroup.MarginLayoutParams) c1655e).rightMargin = i9;
            z5 = true;
        }
        if (z4) {
            int i10 = ((android.view.ViewGroup.MarginLayoutParams) c1655e).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((android.view.ViewGroup.MarginLayoutParams) c1655e).bottomMargin = i11;
                return true;
            }
        }
        return z5;
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: a */
    public final void mo426a(android.view.View view, android.view.View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: b */
    public final void mo427b(android.view.ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(viewGroup, i4, i5, i6, i7);
        }
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: c */
    public final void mo428c(android.view.View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p145j.C1655e;
    }

    @Override // p011C.InterfaceC0117i
    /* renamed from: d */
    public final void mo431d(android.view.ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        mo427b(viewGroup, i4, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.f3928p == null || this.f3929q) {
            return;
        }
        if (this.f3926n.getVisibility() == 0) {
            i4 = (int) (this.f3926n.getTranslationY() + this.f3926n.getBottom() + 0.5f);
        } else {
            i4 = 0;
        }
        this.f3928p.setBounds(0, i4, getWidth(), this.f3928p.getIntrinsicHeight() + i4);
        this.f3928p.draw(canvas);
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: e */
    public final void mo429e(int i4, int i5, int i6, int[] iArr) {
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: f */
    public final boolean mo430f(android.view.View view, android.view.View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f3926n;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p011C.C0118j c0118j = this.f3923I;
        return c0118j.f327c | c0118j.f326b;
    }

    public java.lang.CharSequence getTitle() {
        m2287j();
        return ((p145j.C1684s0) this.f3927o).f6998a.getTitle();
    }

    /* renamed from: h */
    public final void m2285h() {
        removeCallbacks(this.f3921G);
        removeCallbacks(this.f3922H);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f3919E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public final void m2286i(android.content.Context context) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3914J);
        this.f3924l = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f3928p = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f3929q = context.getApplicationInfo().targetSdkVersion < 19;
        this.f3918D = new android.widget.OverScroller(context);
    }

    /* renamed from: j */
    public final void m2287j() {
        p145j.InterfaceC1622A wrapper;
        if (this.f3925m == null) {
            this.f3925m = (androidx.appcompat.widget.ContentFrameLayout) findViewById(com.prology.R.id.action_bar_activity_content);
            this.f3926n = (androidx.appcompat.widget.ActionBarContainer) findViewById(com.prology.R.id.action_bar_container);
            android.view.KeyEvent.Callback findViewById = findViewById(com.prology.R.id.action_bar);
            if (findViewById instanceof p145j.InterfaceC1622A) {
                wrapper = (p145j.InterfaceC1622A) findViewById;
            } else {
                if (!(findViewById instanceof androidx.appcompat.widget.Toolbar)) {
                    throw new java.lang.IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((androidx.appcompat.widget.Toolbar) findViewById).getWrapper();
            }
            this.f3927o = wrapper;
        }
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        m2287j();
        p011C.C0105O m396c = p011C.C0105O.m396c(this, windowInsets);
        p011C.C0101K c0101k = m396c.f302a;
        boolean m2284g = m2284g(this.f3926n, new android.graphics.Rect(c0101k.mo363i().f8810a, c0101k.mo363i().f8811b, c0101k.mo363i().f8812c, c0101k.mo363i().f8813d), false);
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        android.graphics.Rect rect = this.f3935w;
        p011C.AbstractC0126r.m444a(this, m396c, rect);
        p011C.C0105O mo364k = c0101k.mo364k(rect.left, rect.top, rect.right, rect.bottom);
        this.f3938z = mo364k;
        boolean z4 = true;
        if (!this.f3915A.equals(mo364k)) {
            this.f3915A = this.f3938z;
            m2284g = true;
        }
        android.graphics.Rect rect2 = this.f3936x;
        if (rect2.equals(rect)) {
            z4 = m2284g;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return c0101k.mo378a().f302a.mo374c().f302a.mo373b().m397b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2286i(getContext());
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        p011C.AbstractC0125q.m443b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2285h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            android.view.View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                p145j.C1655e c1655e = (p145j.C1655e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((android.view.ViewGroup.MarginLayoutParams) c1655e).leftMargin + paddingLeft;
                int i10 = ((android.view.ViewGroup.MarginLayoutParams) c1655e).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int measuredHeight;
        m2287j();
        measureChildWithMargins(this.f3926n, i4, 0, i5, 0);
        p145j.C1655e c1655e = (p145j.C1655e) this.f3926n.getLayoutParams();
        int max = java.lang.Math.max(0, this.f3926n.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) c1655e).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c1655e).rightMargin);
        int max2 = java.lang.Math.max(0, this.f3926n.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) c1655e).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c1655e).bottomMargin);
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, this.f3926n.getMeasuredState());
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.f3924l;
            if (this.f3931s && this.f3926n.getTabContainer() != null) {
                measuredHeight += this.f3924l;
            }
        } else {
            measuredHeight = this.f3926n.getVisibility() != 8 ? this.f3926n.getMeasuredHeight() : 0;
        }
        android.graphics.Rect rect = this.f3935w;
        android.graphics.Rect rect2 = this.f3937y;
        rect2.set(rect);
        p011C.C0105O c0105o = this.f3938z;
        this.f3916B = c0105o;
        if (this.f3930r || z4) {
            p196u.C2207b m4386a = p196u.C2207b.m4386a(c0105o.f302a.mo363i().f8810a, this.f3916B.f302a.mo363i().f8811b + measuredHeight, this.f3916B.f302a.mo363i().f8812c, this.f3916B.f302a.mo363i().f8813d);
            p011C.C0105O c0105o2 = this.f3916B;
            int i6 = android.os.Build.VERSION.SDK_INT;
            p011C.AbstractC0094D c0093c = i6 >= 34 ? new p011C.C0093C(c0105o2) : i6 >= 30 ? new p011C.C0092B(c0105o2) : i6 >= 29 ? new p011C.C0091A(c0105o2) : new p011C.C0134z(c0105o2);
            c0093c.mo356d(m4386a);
            this.f3916B = c0093c.mo354b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f3916B = c0105o.f302a.mo364k(0, measuredHeight, 0, 0);
        }
        m2284g(this.f3925m, rect2, true);
        if (!this.f3917C.equals(this.f3916B)) {
            p011C.C0105O c0105o3 = this.f3916B;
            this.f3917C = c0105o3;
            androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = this.f3925m;
            int i7 = android.os.Build.VERSION.SDK_INT;
            android.view.WindowInsets m397b = c0105o3.m397b();
            if (m397b != null) {
                android.view.WindowInsets m458a = i7 >= 30 ? p011C.AbstractC0131w.m458a(contentFrameLayout, m397b) : p011C.AbstractC0125q.m442a(contentFrameLayout, m397b);
                if (!m458a.equals(m397b)) {
                    p011C.C0105O.m396c(contentFrameLayout, m458a);
                }
            }
        }
        measureChildWithMargins(this.f3925m, i4, 0, i5, 0);
        p145j.C1655e c1655e2 = (p145j.C1655e) this.f3925m.getLayoutParams();
        int max3 = java.lang.Math.max(max, this.f3925m.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) c1655e2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c1655e2).rightMargin);
        int max4 = java.lang.Math.max(max2, this.f3925m.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) c1655e2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c1655e2).bottomMargin);
        int combineMeasuredStates2 = android.view.View.combineMeasuredStates(combineMeasuredStates, this.f3925m.getMeasuredState());
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i4, combineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f4, float f5, boolean z4) {
        if (!this.f3932t || !z4) {
            return false;
        }
        this.f3918D.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3918D.getFinalY() > this.f3926n.getHeight()) {
            m2285h();
            this.f3922H.run();
        } else {
            m2285h();
            this.f3921G.run();
        }
        this.f3933u = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f3934v + i5;
        this.f3934v = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i4) {
        this.f3923I.f326b = i4;
        this.f3934v = getActionBarHideOffset();
        m2285h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i4) {
        if ((i4 & 2) == 0 || this.f3926n.getVisibility() != 0) {
            return false;
        }
        return this.f3932t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        if (!this.f3932t || this.f3933u) {
            return;
        }
        if (this.f3934v <= this.f3926n.getHeight()) {
            m2285h();
            postDelayed(this.f3921G, 600L);
        } else {
            m2285h();
            postDelayed(this.f3922H, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        m2287j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
    }

    public void setActionBarHideOffset(int i4) {
        m2285h();
        this.f3926n.setTranslationY(-java.lang.Math.max(0, java.lang.Math.min(i4, this.f3926n.getHeight())));
    }

    public void setActionBarVisibilityCallback(p145j.InterfaceC1653d interfaceC1653d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f3931s = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f3932t) {
            this.f3932t = z4;
            if (z4) {
                return;
            }
            m2285h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        m2287j();
        p145j.C1684s0 c1684s0 = (p145j.C1684s0) this.f3927o;
        c1684s0.f7001d = i4 != 0 ? p126f.AbstractC1367a.m3116a(c1684s0.f6998a.getContext(), i4) : null;
        c1684s0.m3623c();
    }

    public void setLogo(int i4) {
        m2287j();
        p145j.C1684s0 c1684s0 = (p145j.C1684s0) this.f3927o;
        c1684s0.f7002e = i4 != 0 ? p126f.AbstractC1367a.m3116a(c1684s0.f6998a.getContext(), i4) : null;
        c1684s0.m3623c();
    }

    public void setOverlayMode(boolean z4) {
        this.f3930r = z4;
        this.f3929q = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i4) {
    }

    public void setWindowCallback(android.view.Window.Callback callback) {
        m2287j();
        ((p145j.C1684s0) this.f3927o).f7008k = callback;
    }

    public void setWindowTitle(java.lang.CharSequence charSequence) {
        m2287j();
        p145j.C1684s0 c1684s0 = (p145j.C1684s0) this.f3927o;
        if (c1684s0.f7004g) {
            return;
        }
        c1684s0.f7005h = charSequence;
        if ((c1684s0.f6999b & 8) != 0) {
            c1684s0.f6998a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new android.view.ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        m2287j();
        p145j.C1684s0 c1684s0 = (p145j.C1684s0) this.f3927o;
        c1684s0.f7001d = drawable;
        c1684s0.m3623c();
    }
}
