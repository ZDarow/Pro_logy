package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup {

    /* renamed from: A */
    public int f4043A;

    /* renamed from: B */
    public int f4044B;

    /* renamed from: C */
    public int f4045C;

    /* renamed from: D */
    public int f4046D;

    /* renamed from: E */
    public p145j.C1640T f4047E;

    /* renamed from: F */
    public int f4048F;

    /* renamed from: G */
    public int f4049G;

    /* renamed from: H */
    public final int f4050H;

    /* renamed from: I */
    public java.lang.CharSequence f4051I;

    /* renamed from: J */
    public java.lang.CharSequence f4052J;

    /* renamed from: K */
    public android.content.res.ColorStateList f4053K;

    /* renamed from: L */
    public android.content.res.ColorStateList f4054L;

    /* renamed from: M */
    public boolean f4055M;

    /* renamed from: N */
    public boolean f4056N;

    /* renamed from: O */
    public final java.util.ArrayList f4057O;

    /* renamed from: P */
    public final java.util.ArrayList f4058P;

    /* renamed from: Q */
    public final int[] f4059Q;

    /* renamed from: R */
    public final p129f2.C1408Y f4060R;

    /* renamed from: S */
    public p145j.C1684s0 f4061S;

    /* renamed from: T */
    public p145j.C1676o0 f4062T;

    /* renamed from: U */
    public boolean f4063U;

    /* renamed from: V */
    public final p024F.RunnableC0199b f4064V;

    /* renamed from: l */
    public androidx.appcompat.widget.ActionMenuView f4065l;

    /* renamed from: m */
    public p145j.C1687u f4066m;

    /* renamed from: n */
    public p145j.C1687u f4067n;

    /* renamed from: o */
    public p145j.C1677p f4068o;

    /* renamed from: p */
    public p145j.C1679q f4069p;

    /* renamed from: q */
    public final android.graphics.drawable.Drawable f4070q;

    /* renamed from: r */
    public final java.lang.CharSequence f4071r;

    /* renamed from: s */
    public p145j.C1677p f4072s;

    /* renamed from: t */
    public android.view.View f4073t;

    /* renamed from: u */
    public android.content.Context f4074u;

    /* renamed from: v */
    public int f4075v;

    /* renamed from: w */
    public int f4076w;

    /* renamed from: x */
    public int f4077x;

    /* renamed from: y */
    public final int f4078y;

    /* renamed from: z */
    public final int f4079z;

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.prology.R.attr.toolbarStyle);
        this.f4050H = 8388627;
        this.f4057O = new java.util.ArrayList();
        this.f4058P = new java.util.ArrayList();
        this.f4059Q = new int[2];
        this.f4060R = new p129f2.C1408Y(11, this);
        this.f4064V = new p024F.RunnableC0199b(8, this);
        android.content.Context context2 = getContext();
        int[] iArr = p121e.AbstractC1299a.f5204t;
        android.support.v4.media.session.C1061t m2202q0 = android.support.v4.media.session.C1061t.m2202q0(context2, attributeSet, iArr, com.prology.R.attr.toolbarStyle);
        p011C.AbstractC0132x.m463c(this, context, iArr, attributeSet, (android.content.res.TypedArray) m2202q0.f3862n, com.prology.R.attr.toolbarStyle);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) m2202q0.f3862n;
        this.f4076w = typedArray.getResourceId(28, 0);
        this.f4077x = typedArray.getResourceId(19, 0);
        this.f4050H = typedArray.getInteger(0, 8388627);
        this.f4078y = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4046D = dimensionPixelOffset;
        this.f4045C = dimensionPixelOffset;
        this.f4044B = dimensionPixelOffset;
        this.f4043A = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4043A = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4044B = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4045C = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4046D = dimensionPixelOffset5;
        }
        this.f4079z = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m2320d();
        p145j.C1640T c1640t = this.f4047E;
        c1640t.f6885h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1640t.f6882e = dimensionPixelSize;
            c1640t.f6878a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1640t.f6883f = dimensionPixelSize2;
            c1640t.f6879b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1640t.m3598a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4048F = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4049G = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4070q = m2202q0.m2225g0(4);
        this.f4071r = typedArray.getText(3);
        java.lang.CharSequence text = typedArray.getText(21);
        if (!android.text.TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        java.lang.CharSequence text2 = typedArray.getText(18);
        if (!android.text.TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4074u = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        android.graphics.drawable.Drawable m2225g0 = m2202q0.m2225g0(16);
        if (m2225g0 != null) {
            setNavigationIcon(m2225g0);
        }
        java.lang.CharSequence text3 = typedArray.getText(15);
        if (!android.text.TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        android.graphics.drawable.Drawable m2225g02 = m2202q0.m2225g0(11);
        if (m2225g02 != null) {
            setLogo(m2225g02);
        }
        java.lang.CharSequence text4 = typedArray.getText(12);
        if (!android.text.TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(m2202q0.m2222e0(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(m2202q0.m2222e0(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        m2202q0.m2243u0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.p0, android.view.ViewGroup$MarginLayoutParams] */
    /* renamed from: g */
    public static p145j.C1678p0 m2313g() {
        ?? marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f6990b = 0;
        marginLayoutParams.f6989a = 8388627;
        return marginLayoutParams;
    }

    private android.view.MenuInflater getMenuInflater() {
        return new p135h.C1483d(getContext());
    }

    /* renamed from: h */
    public static p145j.C1678p0 m2314h(android.view.ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof p145j.C1678p0;
        if (z4) {
            p145j.C1678p0 c1678p0 = (p145j.C1678p0) layoutParams;
            p145j.C1678p0 c1678p02 = new p145j.C1678p0(c1678p0);
            c1678p02.f6990b = 0;
            c1678p02.f6990b = c1678p0.f6990b;
            return c1678p02;
        }
        if (z4) {
            p145j.C1678p0 c1678p03 = new p145j.C1678p0((p145j.C1678p0) layoutParams);
            c1678p03.f6990b = 0;
            return c1678p03;
        }
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            p145j.C1678p0 c1678p04 = new p145j.C1678p0(layoutParams);
            c1678p04.f6990b = 0;
            return c1678p04;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        p145j.C1678p0 c1678p05 = new p145j.C1678p0(marginLayoutParams);
        c1678p05.f6990b = 0;
        ((android.view.ViewGroup.MarginLayoutParams) c1678p05).leftMargin = marginLayoutParams.leftMargin;
        ((android.view.ViewGroup.MarginLayoutParams) c1678p05).topMargin = marginLayoutParams.topMargin;
        ((android.view.ViewGroup.MarginLayoutParams) c1678p05).rightMargin = marginLayoutParams.rightMargin;
        ((android.view.ViewGroup.MarginLayoutParams) c1678p05).bottomMargin = marginLayoutParams.bottomMargin;
        return c1678p05;
    }

    /* renamed from: k */
    public static int m2315k(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: l */
    public static int m2316l(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m2317a(int i4, java.util.ArrayList arrayList) {
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        arrayList.clear();
        if (!z4) {
            for (int i5 = 0; i5 < childCount; i5++) {
                android.view.View childAt = getChildAt(i5);
                p145j.C1678p0 c1678p0 = (p145j.C1678p0) childAt.getLayoutParams();
                if (c1678p0.f6990b == 0 && m2330r(childAt) && m2323i(c1678p0.f6989a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            android.view.View childAt2 = getChildAt(i6);
            p145j.C1678p0 c1678p02 = (p145j.C1678p0) childAt2.getLayoutParams();
            if (c1678p02.f6990b == 0 && m2330r(childAt2) && m2323i(c1678p02.f6989a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    public final void m2318b(android.view.View view, boolean z4) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p145j.C1678p0 m2313g = layoutParams == null ? m2313g() : !checkLayoutParams(layoutParams) ? m2314h(layoutParams) : (p145j.C1678p0) layoutParams;
        m2313g.f6990b = 1;
        if (!z4 || this.f4073t == null) {
            addView(view, m2313g);
        } else {
            view.setLayoutParams(m2313g);
            this.f4058P.add(view);
        }
    }

    /* renamed from: c */
    public final void m2319c() {
        if (this.f4072s == null) {
            p145j.C1677p c1677p = new p145j.C1677p(getContext());
            this.f4072s = c1677p;
            c1677p.setImageDrawable(this.f4070q);
            this.f4072s.setContentDescription(this.f4071r);
            p145j.C1678p0 m2313g = m2313g();
            m2313g.f6989a = (this.f4078y & 112) | 8388611;
            m2313g.f6990b = 2;
            this.f4072s.setLayoutParams(m2313g);
            this.f4072s.setOnClickListener(new p145j.ViewOnClickListenerC1674n0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof p145j.C1678p0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j.T, java.lang.Object] */
    /* renamed from: d */
    public final void m2320d() {
        if (this.f4047E == null) {
            ?? obj = new java.lang.Object();
            obj.f6878a = 0;
            obj.f6879b = 0;
            obj.f6880c = Integer.MIN_VALUE;
            obj.f6881d = Integer.MIN_VALUE;
            obj.f6882e = 0;
            obj.f6883f = 0;
            obj.f6884g = false;
            obj.f6885h = false;
            this.f4047E = obj;
        }
    }

    /* renamed from: e */
    public final void m2321e() {
        if (this.f4065l == null) {
            androidx.appcompat.widget.ActionMenuView actionMenuView = new androidx.appcompat.widget.ActionMenuView(getContext(), null);
            this.f4065l = actionMenuView;
            actionMenuView.setPopupTheme(this.f4075v);
            this.f4065l.setOnMenuItemClickListener(this.f4060R);
            this.f4065l.getClass();
            p145j.C1678p0 m2313g = m2313g();
            m2313g.f6989a = (this.f4078y & 112) | 8388613;
            this.f4065l.setLayoutParams(m2313g);
            m2318b(this.f4065l, false);
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView2 = this.f4065l;
        if (actionMenuView2.f3939A == null) {
            p140i.MenuC1517i menuC1517i = (p140i.MenuC1517i) actionMenuView2.getMenu();
            if (this.f4062T == null) {
                this.f4062T = new p145j.C1676o0(this);
            }
            this.f4065l.setExpandedActionViewsExclusive(true);
            menuC1517i.m3360b(this.f4062T, this.f4074u);
        }
    }

    /* renamed from: f */
    public final void m2322f() {
        if (this.f4068o == null) {
            this.f4068o = new p145j.C1677p(getContext());
            p145j.C1678p0 m2313g = m2313g();
            m2313g.f6989a = (this.f4078y & 112) | 8388611;
            this.f4068o.setLayoutParams(m2313g);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2313g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m2314h(layoutParams);
    }

    public java.lang.CharSequence getCollapseContentDescription() {
        p145j.C1677p c1677p = this.f4072s;
        if (c1677p != null) {
            return c1677p.getContentDescription();
        }
        return null;
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
        p145j.C1677p c1677p = this.f4072s;
        if (c1677p != null) {
            return c1677p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p145j.C1640T c1640t = this.f4047E;
        if (c1640t != null) {
            return c1640t.f6884g ? c1640t.f6878a : c1640t.f6879b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f4049G;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p145j.C1640T c1640t = this.f4047E;
        if (c1640t != null) {
            return c1640t.f6878a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p145j.C1640T c1640t = this.f4047E;
        if (c1640t != null) {
            return c1640t.f6879b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p145j.C1640T c1640t = this.f4047E;
        if (c1640t != null) {
            return c1640t.f6884g ? c1640t.f6879b : c1640t.f6878a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f4048F;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        p140i.MenuC1517i menuC1517i;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f4065l;
        return (actionMenuView == null || (menuC1517i = actionMenuView.f3939A) == null || !menuC1517i.hasVisibleItems()) ? getContentInsetEnd() : java.lang.Math.max(getContentInsetEnd(), java.lang.Math.max(this.f4049G, 0));
    }

    public int getCurrentContentInsetLeft() {
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? java.lang.Math.max(getContentInsetStart(), java.lang.Math.max(this.f4048F, 0)) : getContentInsetStart();
    }

    public android.graphics.drawable.Drawable getLogo() {
        p145j.C1679q c1679q = this.f4069p;
        if (c1679q != null) {
            return c1679q.getDrawable();
        }
        return null;
    }

    public java.lang.CharSequence getLogoDescription() {
        p145j.C1679q c1679q = this.f4069p;
        if (c1679q != null) {
            return c1679q.getContentDescription();
        }
        return null;
    }

    public android.view.Menu getMenu() {
        m2321e();
        return this.f4065l.getMenu();
    }

    public java.lang.CharSequence getNavigationContentDescription() {
        p145j.C1677p c1677p = this.f4068o;
        if (c1677p != null) {
            return c1677p.getContentDescription();
        }
        return null;
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
        p145j.C1677p c1677p = this.f4068o;
        if (c1677p != null) {
            return c1677p.getDrawable();
        }
        return null;
    }

    public p145j.C1663i getOuterActionMenuPresenter() {
        return null;
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        m2321e();
        return this.f4065l.getOverflowIcon();
    }

    public android.content.Context getPopupContext() {
        return this.f4074u;
    }

    public int getPopupTheme() {
        return this.f4075v;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.f4052J;
    }

    public final android.widget.TextView getSubtitleTextView() {
        return this.f4067n;
    }

    public java.lang.CharSequence getTitle() {
        return this.f4051I;
    }

    public int getTitleMarginBottom() {
        return this.f4046D;
    }

    public int getTitleMarginEnd() {
        return this.f4044B;
    }

    public int getTitleMarginStart() {
        return this.f4043A;
    }

    public int getTitleMarginTop() {
        return this.f4045C;
    }

    public final android.widget.TextView getTitleTextView() {
        return this.f4066m;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j.s0, java.lang.Object] */
    public p145j.InterfaceC1622A getWrapper() {
        android.graphics.drawable.Drawable drawable;
        if (this.f4061S == null) {
            ?? obj = new java.lang.Object();
            obj.f7009l = 0;
            obj.f6998a = this;
            obj.f7005h = getTitle();
            obj.f7006i = getSubtitle();
            obj.f7004g = obj.f7005h != null;
            obj.f7003f = getNavigationIcon();
            android.support.v4.media.session.C1061t m2202q0 = android.support.v4.media.session.C1061t.m2202q0(getContext(), null, p121e.AbstractC1299a.f5185a, com.prology.R.attr.actionBarStyle);
            obj.f7010m = m2202q0.m2225g0(15);
            android.content.res.TypedArray typedArray = (android.content.res.TypedArray) m2202q0.f3862n;
            java.lang.CharSequence text = typedArray.getText(27);
            if (!android.text.TextUtils.isEmpty(text)) {
                obj.f7004g = true;
                obj.f7005h = text;
                if ((obj.f6999b & 8) != 0) {
                    obj.f6998a.setTitle(text);
                }
            }
            java.lang.CharSequence text2 = typedArray.getText(25);
            if (!android.text.TextUtils.isEmpty(text2)) {
                obj.f7006i = text2;
                if ((obj.f6999b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            android.graphics.drawable.Drawable m2225g0 = m2202q0.m2225g0(20);
            if (m2225g0 != null) {
                obj.f7002e = m2225g0;
                obj.m3623c();
            }
            android.graphics.drawable.Drawable m2225g02 = m2202q0.m2225g0(17);
            if (m2225g02 != null) {
                obj.f7001d = m2225g02;
                obj.m3623c();
            }
            if (obj.f7003f == null && (drawable = obj.f7010m) != null) {
                obj.f7003f = drawable;
                int i4 = obj.f6999b & 4;
                androidx.appcompat.widget.Toolbar toolbar = obj.f6998a;
                if (i4 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
                }
            }
            obj.m3621a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(resourceId, (android.view.ViewGroup) this, false);
                android.view.View view = obj.f7000c;
                if (view != null && (obj.f6999b & 16) != 0) {
                    removeView(view);
                }
                obj.f7000c = inflate;
                if (inflate != null && (obj.f6999b & 16) != 0) {
                    addView(inflate);
                }
                obj.m3621a(obj.f6999b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = java.lang.Math.max(dimensionPixelOffset, 0);
                int max2 = java.lang.Math.max(dimensionPixelOffset2, 0);
                m2320d();
                this.f4047E.m3598a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                android.content.Context context = getContext();
                this.f4076w = resourceId2;
                p145j.C1687u c1687u = this.f4066m;
                if (c1687u != null) {
                    c1687u.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                android.content.Context context2 = getContext();
                this.f4077x = resourceId3;
                p145j.C1687u c1687u2 = this.f4067n;
                if (c1687u2 != null) {
                    c1687u2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            m2202q0.m2243u0();
            if (com.prology.R.string.abc_action_bar_up_description != obj.f7009l) {
                obj.f7009l = com.prology.R.string.abc_action_bar_up_description;
                if (android.text.TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i5 = obj.f7009l;
                    obj.f7007j = i5 != 0 ? getContext().getString(i5) : null;
                    obj.m3622b();
                }
            }
            obj.f7007j = getNavigationContentDescription();
            setNavigationOnClickListener(new p145j.ViewOnClickListenerC1674n0((p145j.C1684s0) obj));
            this.f4061S = obj;
        }
        return this.f4061S;
    }

    /* renamed from: i */
    public final int m2323i(int i4) {
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    /* renamed from: j */
    public final int m2324j(android.view.View view, int i4) {
        p145j.C1678p0 c1678p0 = (p145j.C1678p0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int i6 = c1678p0.f6989a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f4050H & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((android.view.ViewGroup.MarginLayoutParams) c1678p0).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((android.view.ViewGroup.MarginLayoutParams) c1678p0).topMargin;
        if (i7 < i8) {
            i7 = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
            int i10 = ((android.view.ViewGroup.MarginLayoutParams) c1678p0).bottomMargin;
            if (i9 < i10) {
                i7 = java.lang.Math.max(0, i7 - (i10 - i9));
            }
        }
        return paddingTop + i7;
    }

    /* renamed from: m */
    public final boolean m2325m(android.view.View view) {
        return view.getParent() == this || this.f4058P.contains(view);
    }

    /* renamed from: n */
    public final int m2326n(android.view.View view, int i4, int i5, int[] iArr) {
        p145j.C1678p0 c1678p0 = (p145j.C1678p0) view.getLayoutParams();
        int i6 = ((android.view.ViewGroup.MarginLayoutParams) c1678p0).leftMargin - iArr[0];
        int max = java.lang.Math.max(0, i6) + i4;
        iArr[0] = java.lang.Math.max(0, -i6);
        int m2324j = m2324j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m2324j, max + measuredWidth, view.getMeasuredHeight() + m2324j);
        return measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) c1678p0).rightMargin + max;
    }

    /* renamed from: o */
    public final int m2327o(android.view.View view, int i4, int i5, int[] iArr) {
        p145j.C1678p0 c1678p0 = (p145j.C1678p0) view.getLayoutParams();
        int i6 = ((android.view.ViewGroup.MarginLayoutParams) c1678p0).rightMargin - iArr[1];
        int max = i4 - java.lang.Math.max(0, i6);
        iArr[1] = java.lang.Math.max(0, -i6);
        int m2324j = m2324j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m2324j, max, view.getMeasuredHeight() + m2324j);
        return max - (measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) c1678p0).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4064V);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4056N = false;
        }
        if (!this.f4056N) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4056N = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4056N = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean m3632a = p145j.AbstractC1690v0.m3632a(this);
        int i13 = !m3632a ? 1 : 0;
        int i14 = 0;
        if (m2330r(this.f4068o)) {
            m2329q(this.f4068o, i4, 0, i5, this.f4079z);
            i6 = m2315k(this.f4068o) + this.f4068o.getMeasuredWidth();
            i7 = java.lang.Math.max(0, m2316l(this.f4068o) + this.f4068o.getMeasuredHeight());
            i8 = android.view.View.combineMeasuredStates(0, this.f4068o.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (m2330r(this.f4072s)) {
            m2329q(this.f4072s, i4, 0, i5, this.f4079z);
            i6 = m2315k(this.f4072s) + this.f4072s.getMeasuredWidth();
            i7 = java.lang.Math.max(i7, m2316l(this.f4072s) + this.f4072s.getMeasuredHeight());
            i8 = android.view.View.combineMeasuredStates(i8, this.f4072s.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = java.lang.Math.max(currentContentInsetStart, i6);
        int max2 = java.lang.Math.max(0, currentContentInsetStart - i6);
        int[] iArr = this.f4059Q;
        iArr[m3632a ? 1 : 0] = max2;
        if (m2330r(this.f4065l)) {
            m2329q(this.f4065l, i4, max, i5, this.f4079z);
            i9 = m2315k(this.f4065l) + this.f4065l.getMeasuredWidth();
            i7 = java.lang.Math.max(i7, m2316l(this.f4065l) + this.f4065l.getMeasuredHeight());
            i8 = android.view.View.combineMeasuredStates(i8, this.f4065l.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + java.lang.Math.max(currentContentInsetEnd, i9);
        iArr[i13] = java.lang.Math.max(0, currentContentInsetEnd - i9);
        if (m2330r(this.f4073t)) {
            max3 += m2328p(this.f4073t, i4, max3, i5, 0, iArr);
            i7 = java.lang.Math.max(i7, m2316l(this.f4073t) + this.f4073t.getMeasuredHeight());
            i8 = android.view.View.combineMeasuredStates(i8, this.f4073t.getMeasuredState());
        }
        if (m2330r(this.f4069p)) {
            max3 += m2328p(this.f4069p, i4, max3, i5, 0, iArr);
            i7 = java.lang.Math.max(i7, m2316l(this.f4069p) + this.f4069p.getMeasuredHeight());
            i8 = android.view.View.combineMeasuredStates(i8, this.f4069p.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            android.view.View childAt = getChildAt(i15);
            if (((p145j.C1678p0) childAt.getLayoutParams()).f6990b == 0 && m2330r(childAt)) {
                max3 += m2328p(childAt, i4, max3, i5, 0, iArr);
                i7 = java.lang.Math.max(i7, m2316l(childAt) + childAt.getMeasuredHeight());
                i8 = android.view.View.combineMeasuredStates(i8, childAt.getMeasuredState());
            }
        }
        int i16 = this.f4045C + this.f4046D;
        int i17 = this.f4043A + this.f4044B;
        if (m2330r(this.f4066m)) {
            m2328p(this.f4066m, i4, max3 + i17, i5, i16, iArr);
            int m2315k = m2315k(this.f4066m) + this.f4066m.getMeasuredWidth();
            i10 = m2316l(this.f4066m) + this.f4066m.getMeasuredHeight();
            i11 = android.view.View.combineMeasuredStates(i8, this.f4066m.getMeasuredState());
            i12 = m2315k;
        } else {
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        if (m2330r(this.f4067n)) {
            i12 = java.lang.Math.max(i12, m2328p(this.f4067n, i4, max3 + i17, i5, i10 + i16, iArr));
            i10 += m2316l(this.f4067n) + this.f4067n.getMeasuredHeight();
            i11 = android.view.View.combineMeasuredStates(i11, this.f4067n.getMeasuredState());
        }
        int max4 = java.lang.Math.max(i7, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingRight + max3 + i12, getSuggestedMinimumWidth()), i4, (-16777216) & i11);
        int resolveSizeAndState2 = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, i11 << 16);
        if (this.f4063U) {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                android.view.View childAt2 = getChildAt(i18);
                if (!m2330r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i14);
        }
        i14 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i14);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem findItem;
        if (!(parcelable instanceof p145j.C1682r0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p145j.C1682r0 c1682r0 = (p145j.C1682r0) parcelable;
        super.onRestoreInstanceState(c1682r0.f709l);
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f4065l;
        p140i.MenuC1517i menuC1517i = actionMenuView != null ? actionMenuView.f3939A : null;
        int i4 = c1682r0.f6993n;
        if (i4 != 0 && this.f4062T != null && menuC1517i != null && (findItem = menuC1517i.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (c1682r0.f6994o) {
            p024F.RunnableC0199b runnableC0199b = this.f4064V;
            removeCallbacks(runnableC0199b);
            post(runnableC0199b);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        m2320d();
        p145j.C1640T c1640t = this.f4047E;
        boolean z4 = i4 == 1;
        if (z4 == c1640t.f6884g) {
            return;
        }
        c1640t.f6884g = z4;
        if (!c1640t.f6885h) {
            c1640t.f6878a = c1640t.f6882e;
            c1640t.f6879b = c1640t.f6883f;
            return;
        }
        if (z4) {
            int i5 = c1640t.f6881d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = c1640t.f6882e;
            }
            c1640t.f6878a = i5;
            int i6 = c1640t.f6880c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = c1640t.f6883f;
            }
            c1640t.f6879b = i6;
            return;
        }
        int i7 = c1640t.f6880c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = c1640t.f6882e;
        }
        c1640t.f6878a = i7;
        int i8 = c1640t.f6881d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = c1640t.f6883f;
        }
        c1640t.f6879b = i8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.r0, android.os.Parcelable, H.c] */
    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        p145j.C1663i c1663i;
        p145j.C1657f c1657f;
        p140i.MenuItemC1518j menuItemC1518j;
        ?? abstractC0243c = new p031H.AbstractC0243c(super.onSaveInstanceState());
        p145j.C1676o0 c1676o0 = this.f4062T;
        if (c1676o0 != null && (menuItemC1518j = c1676o0.f6985m) != null) {
            abstractC0243c.f6993n = menuItemC1518j.f6294a;
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f4065l;
        abstractC0243c.f6994o = (actionMenuView == null || (c1663i = actionMenuView.f3942D) == null || (c1657f = c1663i.f6932C) == null || !c1657f.m3391b()) ? false : true;
        return abstractC0243c;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4055M = false;
        }
        if (!this.f4055M) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4055M = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4055M = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m2328p(android.view.View view, int i4, int i5, int i6, int i7, int[] iArr) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = java.lang.Math.max(0, i9) + java.lang.Math.max(0, i8);
        iArr[0] = java.lang.Math.max(0, -i8);
        iArr[1] = java.lang.Math.max(0, -i9);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), android.view.ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: q */
    public final void m2329q(android.view.View view, int i4, int i5, int i6, int i7) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = java.lang.Math.min(android.view.View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: r */
    public final boolean m2330r(android.view.View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(p126f.AbstractC1367a.m3116a(getContext(), i4));
    }

    public void setCollapsible(boolean z4) {
        this.f4063U = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f4049G) {
            this.f4049G = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f4048F) {
            this.f4048F = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(p126f.AbstractC1367a.m3116a(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(p126f.AbstractC1367a.m3116a(getContext(), i4));
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onClickListener) {
        m2322f();
        this.f4068o.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(p145j.InterfaceC1680q0 interfaceC1680q0) {
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        m2321e();
        this.f4065l.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f4075v != i4) {
            this.f4075v = i4;
            if (i4 == 0) {
                this.f4074u = getContext();
            } else {
                this.f4074u = new android.view.ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(android.content.res.ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f4046D = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f4044B = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f4043A = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f4045C = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(android.content.res.ColorStateList.valueOf(i4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.p0, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        android.content.Context context = getContext();
        ?? marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f6989a = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p121e.AbstractC1299a.f5186b);
        marginLayoutParams.f6989a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f6990b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            m2319c();
        }
        p145j.C1677p c1677p = this.f4072s;
        if (c1677p != null) {
            c1677p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            m2319c();
            this.f4072s.setImageDrawable(drawable);
        } else {
            p145j.C1677p c1677p = this.f4072s;
            if (c1677p != null) {
                c1677p.setImageDrawable(this.f4070q);
            }
        }
    }

    public void setLogo(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (this.f4069p == null) {
                this.f4069p = new p145j.C1679q(getContext(), 0);
            }
            if (!m2325m(this.f4069p)) {
                m2318b(this.f4069p, true);
            }
        } else {
            p145j.C1679q c1679q = this.f4069p;
            if (c1679q != null && m2325m(c1679q)) {
                removeView(this.f4069p);
                this.f4058P.remove(this.f4069p);
            }
        }
        p145j.C1679q c1679q2 = this.f4069p;
        if (c1679q2 != null) {
            c1679q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence) && this.f4069p == null) {
            this.f4069p = new p145j.C1679q(getContext(), 0);
        }
        p145j.C1679q c1679q = this.f4069p;
        if (c1679q != null) {
            c1679q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            m2322f();
        }
        p145j.C1677p c1677p = this.f4068o;
        if (c1677p != null) {
            c1677p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            m2322f();
            if (!m2325m(this.f4068o)) {
                m2318b(this.f4068o, true);
            }
        } else {
            p145j.C1677p c1677p = this.f4068o;
            if (c1677p != null && m2325m(c1677p)) {
                removeView(this.f4068o);
                this.f4058P.remove(this.f4068o);
            }
        }
        p145j.C1677p c1677p2 = this.f4068o;
        if (c1677p2 != null) {
            c1677p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.f4067n == null) {
                android.content.Context context = getContext();
                p145j.C1687u c1687u = new p145j.C1687u(context, null);
                this.f4067n = c1687u;
                c1687u.setSingleLine();
                this.f4067n.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i4 = this.f4077x;
                if (i4 != 0) {
                    this.f4067n.setTextAppearance(context, i4);
                }
                android.content.res.ColorStateList colorStateList = this.f4054L;
                if (colorStateList != null) {
                    this.f4067n.setTextColor(colorStateList);
                }
            }
            if (!m2325m(this.f4067n)) {
                m2318b(this.f4067n, true);
            }
        } else {
            p145j.C1687u c1687u2 = this.f4067n;
            if (c1687u2 != null && m2325m(c1687u2)) {
                removeView(this.f4067n);
                this.f4058P.remove(this.f4067n);
            }
        }
        p145j.C1687u c1687u3 = this.f4067n;
        if (c1687u3 != null) {
            c1687u3.setText(charSequence);
        }
        this.f4052J = charSequence;
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.f4054L = colorStateList;
        p145j.C1687u c1687u = this.f4067n;
        if (c1687u != null) {
            c1687u.setTextColor(colorStateList);
        }
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.f4066m == null) {
                android.content.Context context = getContext();
                p145j.C1687u c1687u = new p145j.C1687u(context, null);
                this.f4066m = c1687u;
                c1687u.setSingleLine();
                this.f4066m.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i4 = this.f4076w;
                if (i4 != 0) {
                    this.f4066m.setTextAppearance(context, i4);
                }
                android.content.res.ColorStateList colorStateList = this.f4053K;
                if (colorStateList != null) {
                    this.f4066m.setTextColor(colorStateList);
                }
            }
            if (!m2325m(this.f4066m)) {
                m2318b(this.f4066m, true);
            }
        } else {
            p145j.C1687u c1687u2 = this.f4066m;
            if (c1687u2 != null && m2325m(c1687u2)) {
                removeView(this.f4066m);
                this.f4058P.remove(this.f4066m);
            }
        }
        p145j.C1687u c1687u3 = this.f4066m;
        if (c1687u3 != null) {
            c1687u3.setText(charSequence);
        }
        this.f4051I = charSequence;
    }

    public void setTitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.f4053K = colorStateList;
        p145j.C1687u c1687u = this.f4066m;
        if (c1687u != null) {
            c1687u.setTextColor(colorStateList);
        }
    }
}
