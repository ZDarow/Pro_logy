package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionMenuView extends p145j.AbstractC1629H implements p140i.InterfaceC1516h {

    /* renamed from: A */
    public p140i.MenuC1517i f3939A;

    /* renamed from: B */
    public android.content.Context f3940B;

    /* renamed from: C */
    public int f3941C;

    /* renamed from: D */
    public p145j.C1663i f3942D;

    /* renamed from: E */
    public boolean f3943E;

    /* renamed from: F */
    public int f3944F;

    /* renamed from: G */
    public final int f3945G;

    /* renamed from: H */
    public final int f3946H;

    /* renamed from: I */
    public p145j.InterfaceC1669l f3947I;

    public ActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f3945G = (int) (56.0f * f4);
        this.f3946H = (int) (f4 * 4.0f);
        this.f3940B = context;
        this.f3941C = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.k, android.widget.LinearLayout$LayoutParams] */
    /* renamed from: h */
    public static p145j.C1667k m2288h() {
        ?? layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.f6959a = false;
        ((android.widget.LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j.k, android.widget.LinearLayout$LayoutParams] */
    /* renamed from: i */
    public static p145j.C1667k m2289i(android.view.ViewGroup.LayoutParams layoutParams) {
        p145j.C1667k c1667k;
        if (layoutParams == null) {
            return m2288h();
        }
        if (layoutParams instanceof p145j.C1667k) {
            p145j.C1667k c1667k2 = (p145j.C1667k) layoutParams;
            ?? layoutParams2 = new android.widget.LinearLayout.LayoutParams((android.view.ViewGroup.LayoutParams) c1667k2);
            layoutParams2.f6959a = c1667k2.f6959a;
            c1667k = layoutParams2;
        } else {
            c1667k = new android.widget.LinearLayout.LayoutParams(layoutParams);
        }
        if (((android.widget.LinearLayout.LayoutParams) c1667k).gravity <= 0) {
            ((android.widget.LinearLayout.LayoutParams) c1667k).gravity = 16;
        }
        return c1667k;
    }

    @Override // p140i.InterfaceC1516h
    /* renamed from: a */
    public final boolean mo2280a(p140i.MenuItemC1518j menuItemC1518j) {
        return this.f3939A.m3374p(menuItemC1518j, null, 0);
    }

    @Override // p145j.AbstractC1629H, android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p145j.C1667k;
    }

    @Override // p145j.AbstractC1629H
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ p145j.C1628G generateDefaultLayoutParams() {
        return m2288h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    @Override // p145j.AbstractC1629H
    /* renamed from: e */
    public final p145j.C1628G generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.widget.LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // p145j.AbstractC1629H
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ p145j.C1628G generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m2289i(layoutParams);
    }

    @Override // p145j.AbstractC1629H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2288h();
    }

    @Override // p145j.AbstractC1629H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m2289i(layoutParams);
    }

    public android.view.Menu getMenu() {
        if (this.f3939A == null) {
            android.content.Context context = getContext();
            p140i.MenuC1517i menuC1517i = new p140i.MenuC1517i(context);
            this.f3939A = menuC1517i;
            menuC1517i.f6276e = new p129f2.C1408Y(10, this);
            p145j.C1663i c1663i = new p145j.C1663i(context);
            this.f3942D = c1663i;
            c1663i.f6947v = true;
            c1663i.f6948w = true;
            c1663i.f6941p = new p046L1.C0363g(22, false);
            this.f3939A.m3360b(c1663i, this.f3940B);
            p145j.C1663i c1663i2 = this.f3942D;
            c1663i2.f6943r = this;
            this.f3939A = c1663i2.f6939n;
        }
        return this.f3939A;
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        getMenu();
        p145j.C1663i c1663i = this.f3942D;
        p145j.C1661h c1661h = c1663i.f6944s;
        if (c1661h != null) {
            return c1661h.getDrawable();
        }
        if (c1663i.f6946u) {
            return c1663i.f6945t;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3941C;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: j */
    public final boolean m2293j(int i4) {
        boolean z4 = false;
        if (i4 == 0) {
            return false;
        }
        android.view.KeyEvent.Callback childAt = getChildAt(i4 - 1);
        android.view.KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof p145j.InterfaceC1665j)) {
            z4 = ((p145j.InterfaceC1665j) childAt).mo2275a();
        }
        return (i4 <= 0 || !(childAt2 instanceof p145j.InterfaceC1665j)) ? z4 : z4 | ((p145j.InterfaceC1665j) childAt2).mo2276b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p145j.C1663i c1663i = this.f3942D;
        if (c1663i != null) {
            c1663i.mo3344h();
            p145j.C1657f c1657f = this.f3942D.f6932C;
            if (c1657f == null || !c1657f.m3391b()) {
                return;
            }
            this.f3942D.m3604i();
            this.f3942D.m3605k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p145j.C1663i c1663i = this.f3942D;
        if (c1663i != null) {
            c1663i.m3604i();
            p145j.C1657f c1657f = c1663i.f6933D;
            if (c1657f == null || !c1657f.m3391b()) {
                return;
            }
            c1657f.f6330i.dismiss();
        }
    }

    @Override // p145j.AbstractC1629H, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int width;
        int i8;
        if (!this.f3943E) {
            super.onLayout(z4, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i6 - i4;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean m3632a = p145j.AbstractC1690v0.m3632a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            android.view.View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                p145j.C1667k c1667k = (p145j.C1667k) childAt.getLayoutParams();
                if (c1667k.f6959a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m2293j(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m3632a) {
                        i8 = getPaddingLeft() + ((android.widget.LinearLayout.LayoutParams) c1667k).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((android.widget.LinearLayout.LayoutParams) c1667k).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((android.widget.LinearLayout.LayoutParams) c1667k).leftMargin) + ((android.widget.LinearLayout.LayoutParams) c1667k).rightMargin;
                    m2293j(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            android.view.View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        int max = java.lang.Math.max(0, i17 > 0 ? paddingRight / i17 : 0);
        if (m3632a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt3 = getChildAt(i18);
                p145j.C1667k c1667k2 = (p145j.C1667k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1667k2.f6959a) {
                    int i19 = width2 - ((android.widget.LinearLayout.LayoutParams) c1667k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((android.widget.LinearLayout.LayoutParams) c1667k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            android.view.View childAt4 = getChildAt(i21);
            p145j.C1667k c1667k3 = (p145j.C1667k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1667k3.f6959a) {
                int i22 = paddingLeft + ((android.widget.LinearLayout.LayoutParams) c1667k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + ((android.widget.LinearLayout.LayoutParams) c1667k3).rightMargin + max + i22;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // p145j.AbstractC1629H, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i10;
        ?? r4;
        int i11;
        int i12;
        int i13;
        p140i.MenuC1517i menuC1517i;
        boolean z6 = this.f3943E;
        boolean z7 = android.view.View.MeasureSpec.getMode(i4) == 1073741824;
        this.f3943E = z7;
        if (z6 != z7) {
            this.f3944F = 0;
        }
        int size = android.view.View.MeasureSpec.getSize(i4);
        if (this.f3943E && (menuC1517i = this.f3939A) != null && size != this.f3944F) {
            this.f3944F = size;
            menuC1517i.m3373o(true);
        }
        int childCount = getChildCount();
        if (!this.f3943E || childCount <= 0) {
            for (int i14 = 0; i14 < childCount; i14++) {
                p145j.C1667k c1667k = (p145j.C1667k) getChildAt(i14).getLayoutParams();
                ((android.widget.LinearLayout.LayoutParams) c1667k).rightMargin = 0;
                ((android.widget.LinearLayout.LayoutParams) c1667k).leftMargin = 0;
            }
            super.onMeasure(i4, i5);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i5);
        int size2 = android.view.View.MeasureSpec.getSize(i4);
        int size3 = android.view.View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.f3945G;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z8 = false;
        int i24 = 0;
        long j4 = 0;
        while (true) {
            i6 = this.f3946H;
            if (i23 >= childCount2) {
                break;
            }
            android.view.View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = i15;
            if (childAt.getVisibility() == 8) {
                i11 = mode;
                i12 = paddingBottom;
            } else {
                boolean z9 = childAt instanceof androidx.appcompat.view.menu.ActionMenuItemView;
                int i27 = i21 + 1;
                if (z9) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                p145j.C1667k c1667k2 = (p145j.C1667k) childAt.getLayoutParams();
                c1667k2.f6964f = false;
                c1667k2.f6961c = 0;
                c1667k2.f6960b = 0;
                c1667k2.f6962d = false;
                ((android.widget.LinearLayout.LayoutParams) c1667k2).leftMargin = 0;
                ((android.widget.LinearLayout.LayoutParams) c1667k2).rightMargin = 0;
                c1667k2.f6963e = z9 && !android.text.TextUtils.isEmpty(((androidx.appcompat.view.menu.ActionMenuItemView) childAt).getText());
                int i28 = c1667k2.f6959a ? 1 : i17;
                p145j.C1667k c1667k3 = (p145j.C1667k) childAt.getLayoutParams();
                i11 = mode;
                i12 = paddingBottom;
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, android.view.View.MeasureSpec.getMode(childMeasureSpec));
                androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = z9 ? (androidx.appcompat.view.menu.ActionMenuItemView) childAt : null;
                boolean z10 = (actionMenuItemView == null || android.text.TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i28 <= 0 || (z10 && i28 < 2)) {
                    i13 = 0;
                } else {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i28 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i13 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i13++;
                    }
                    if (z10 && i13 < 2) {
                        i13 = 2;
                    }
                }
                c1667k3.f6962d = !c1667k3.f6959a && z10;
                c1667k3.f6960b = i13;
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i13 * i19, 1073741824), makeMeasureSpec);
                i22 = java.lang.Math.max(i22, i13);
                if (c1667k2.f6962d) {
                    i24++;
                }
                if (c1667k2.f6959a) {
                    z8 = true;
                }
                i17 -= i13;
                i20 = java.lang.Math.max(i20, childAt.getMeasuredHeight());
                if (i13 == 1) {
                    j4 |= 1 << i23;
                }
                i21 = i27;
            }
            i23++;
            size3 = i25;
            i15 = i26;
            paddingBottom = i12;
            mode = i11;
        }
        int i29 = mode;
        int i30 = i15;
        int i31 = size3;
        boolean z11 = z8 && i21 == 2;
        boolean z12 = false;
        while (i24 > 0 && i17 > 0) {
            int i32 = Integer.MAX_VALUE;
            int i33 = 0;
            int i34 = 0;
            long j5 = 0;
            while (i34 < childCount2) {
                p145j.C1667k c1667k4 = (p145j.C1667k) getChildAt(i34).getLayoutParams();
                boolean z13 = z12;
                if (c1667k4.f6962d) {
                    int i35 = c1667k4.f6960b;
                    if (i35 < i32) {
                        j5 = 1 << i34;
                        i32 = i35;
                        i33 = 1;
                    } else if (i35 == i32) {
                        j5 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z12 = z13;
            }
            z4 = z12;
            j4 |= j5;
            if (i33 > i17) {
                break;
            }
            int i36 = i32 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                android.view.View childAt2 = getChildAt(i37);
                p145j.C1667k c1667k5 = (p145j.C1667k) childAt2.getLayoutParams();
                int i38 = i20;
                int i39 = childMeasureSpec;
                int i40 = childCount2;
                long j6 = 1 << i37;
                if ((j5 & j6) != 0) {
                    if (z11 && c1667k5.f6963e) {
                        r4 = 1;
                        r4 = 1;
                        if (i17 == 1) {
                            childAt2.setPadding(i6 + i19, 0, i6, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c1667k5.f6960b += r4;
                    c1667k5.f6964f = r4;
                    i17--;
                } else if (c1667k5.f6960b == i36) {
                    j4 |= j6;
                }
                i37++;
                childMeasureSpec = i39;
                i20 = i38;
                childCount2 = i40;
            }
            z12 = true;
        }
        z4 = z12;
        int i41 = i20;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z14 = !z8 && i21 == 1;
        if (i17 <= 0 || j4 == 0 || (i17 >= i21 - 1 && !z14 && i22 <= 1)) {
            i7 = i43;
            z5 = z4;
        } else {
            float bitCount = java.lang.Long.bitCount(j4);
            if (!z14) {
                if ((j4 & 1) != 0 && !((p145j.C1667k) getChildAt(0).getLayoutParams()).f6963e) {
                    bitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j4 & (1 << i44)) != 0 && !((p145j.C1667k) getChildAt(i44).getLayoutParams()).f6963e) {
                    bitCount -= 0.5f;
                }
            }
            int i45 = bitCount > 0.0f ? (int) ((i17 * i19) / bitCount) : 0;
            boolean z15 = z4;
            i7 = i43;
            for (int i46 = 0; i46 < i7; i46++) {
                if ((j4 & (1 << i46)) != 0) {
                    android.view.View childAt3 = getChildAt(i46);
                    p145j.C1667k c1667k6 = (p145j.C1667k) childAt3.getLayoutParams();
                    if (childAt3 instanceof androidx.appcompat.view.menu.ActionMenuItemView) {
                        c1667k6.f6961c = i45;
                        c1667k6.f6964f = true;
                        if (i46 == 0 && !c1667k6.f6963e) {
                            ((android.widget.LinearLayout.LayoutParams) c1667k6).leftMargin = (-i45) / 2;
                        }
                        z15 = true;
                    } else {
                        if (c1667k6.f6959a) {
                            c1667k6.f6961c = i45;
                            c1667k6.f6964f = true;
                            ((android.widget.LinearLayout.LayoutParams) c1667k6).rightMargin = (-i45) / 2;
                            z15 = true;
                        } else {
                            if (i46 != 0) {
                                ((android.widget.LinearLayout.LayoutParams) c1667k6).leftMargin = i45 / 2;
                            }
                            if (i46 != i7 - 1) {
                                ((android.widget.LinearLayout.LayoutParams) c1667k6).rightMargin = i45 / 2;
                            }
                        }
                    }
                }
            }
            z5 = z15;
        }
        if (z5) {
            int i47 = 0;
            while (i47 < i7) {
                android.view.View childAt4 = getChildAt(i47);
                p145j.C1667k c1667k7 = (p145j.C1667k) childAt4.getLayoutParams();
                if (c1667k7.f6964f) {
                    i10 = i42;
                    childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec((c1667k7.f6960b * i19) + c1667k7.f6961c, 1073741824), i10);
                } else {
                    i10 = i42;
                }
                i47++;
                i42 = i10;
            }
        }
        if (i29 != 1073741824) {
            i9 = i30;
            i8 = i41;
        } else {
            i8 = i31;
            i9 = i30;
        }
        setMeasuredDimension(i9, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f3942D.f6930A = z4;
    }

    public void setOnMenuItemClickListener(p145j.InterfaceC1669l interfaceC1669l) {
        this.f3947I = interfaceC1669l;
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        getMenu();
        p145j.C1663i c1663i = this.f3942D;
        p145j.C1661h c1661h = c1663i.f6944s;
        if (c1661h != null) {
            c1661h.setImageDrawable(drawable);
        } else {
            c1663i.f6946u = true;
            c1663i.f6945t = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
    }

    public void setPopupTheme(int i4) {
        if (this.f3941C != i4) {
            this.f3941C = i4;
            if (i4 == 0) {
                this.f3940B = getContext();
            } else {
                this.f3940B = new android.view.ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(p145j.C1663i c1663i) {
        this.f3942D = c1663i;
        c1663i.f6943r = this;
        this.f3939A = c1663i.f6939n;
    }

    @Override // p145j.AbstractC1629H, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.widget.LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
