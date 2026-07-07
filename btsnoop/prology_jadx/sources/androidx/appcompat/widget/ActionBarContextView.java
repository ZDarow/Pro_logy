package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContextView extends android.view.ViewGroup {

    /* renamed from: l */
    public int f3902l;

    /* renamed from: m */
    public boolean f3903m;

    /* renamed from: n */
    public boolean f3904n;

    /* renamed from: o */
    public java.lang.CharSequence f3905o;

    /* renamed from: p */
    public java.lang.CharSequence f3906p;

    /* renamed from: q */
    public android.view.View f3907q;

    /* renamed from: r */
    public android.widget.LinearLayout f3908r;

    /* renamed from: s */
    public android.widget.TextView f3909s;

    /* renamed from: t */
    public android.widget.TextView f3910t;

    /* renamed from: u */
    public final int f3911u;

    /* renamed from: v */
    public final int f3912v;

    /* renamed from: w */
    public boolean f3913w;

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.prology.R.attr.actionModeStyle);
        int resourceId;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(com.prology.R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new android.view.ContextThemeWrapper(context, typedValue.resourceId);
        }
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p121e.AbstractC1299a.f5188d, com.prology.R.attr.actionModeStyle, 0);
        android.graphics.drawable.Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : p126f.AbstractC1367a.m3116a(context, resourceId);
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        setBackground(drawable);
        this.f3911u = obtainStyledAttributes.getResourceId(5, 0);
        this.f3912v = obtainStyledAttributes.getResourceId(4, 0);
        this.f3902l = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, com.prology.R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static int m2281b(android.view.View view, int i4, int i5, int i6, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z4) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public final void m2282a() {
        if (this.f3908r == null) {
            android.view.LayoutInflater.from(getContext()).inflate(com.prology.R.layout.abc_action_bar_title_item, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.f3908r = linearLayout;
            this.f3909s = (android.widget.TextView) linearLayout.findViewById(com.prology.R.id.action_bar_title);
            this.f3910t = (android.widget.TextView) this.f3908r.findViewById(com.prology.R.id.action_bar_subtitle);
            int i4 = this.f3911u;
            if (i4 != 0) {
                this.f3909s.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f3912v;
            if (i5 != 0) {
                this.f3910t.setTextAppearance(getContext(), i5);
            }
        }
        this.f3909s.setText(this.f3905o);
        this.f3910t.setText(this.f3906p);
        boolean isEmpty = android.text.TextUtils.isEmpty(this.f3905o);
        boolean isEmpty2 = android.text.TextUtils.isEmpty(this.f3906p);
        this.f3910t.setVisibility(!isEmpty2 ? 0 : 8);
        this.f3908r.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f3908r.getParent() == null) {
            addView(this.f3908r);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            super.setVisibility(i4);
        }
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f3902l;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.f3906p;
    }

    public java.lang.CharSequence getTitle() {
        return this.f3905o;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, p121e.AbstractC1299a.f5185a, com.prology.R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3904n = false;
        }
        if (!this.f3904n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3904n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3904n = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f3905o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean m3632a = p145j.AbstractC1690v0.m3632a(this);
        int paddingRight = m3632a ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        android.widget.LinearLayout linearLayout = this.f3908r;
        if (linearLayout != null && this.f3907q == null && linearLayout.getVisibility() != 8) {
            paddingRight += m2281b(this.f3908r, paddingRight, paddingTop, paddingTop2, m3632a);
        }
        android.view.View view = this.f3907q;
        if (view != null) {
            m2281b(view, paddingRight, paddingTop, paddingTop2, m3632a);
        }
        if (m3632a) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        if (android.view.View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (android.view.View.MeasureSpec.getMode(i5) == 0) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = android.view.View.MeasureSpec.getSize(i4);
        int i6 = this.f3902l;
        if (i6 <= 0) {
            i6 = android.view.View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i7 = i6 - paddingBottom;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        android.widget.LinearLayout linearLayout = this.f3908r;
        if (linearLayout != null && this.f3907q == null) {
            if (this.f3913w) {
                this.f3908r.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f3908r.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f3908r.setVisibility(z4 ? 0 : 8);
            } else {
                linearLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = java.lang.Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        android.view.View view = this.f3907q;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = java.lang.Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                i7 = java.lang.Math.min(i10, i7);
            }
            this.f3907q.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), android.view.View.MeasureSpec.makeMeasureSpec(i7, i11));
        }
        if (this.f3902l > 0) {
            setMeasuredDimension(size, i6);
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3903m = false;
        }
        if (!this.f3903m) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3903m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3903m = false;
        }
        return true;
    }

    public void setContentHeight(int i4) {
        this.f3902l = i4;
    }

    public void setCustomView(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.f3907q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3907q = view;
        if (view != null && (linearLayout = this.f3908r) != null) {
            removeView(linearLayout);
            this.f3908r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.f3906p = charSequence;
        m2282a();
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f3905o = charSequence;
        m2282a();
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f3913w) {
            requestLayout();
        }
        this.f3913w = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
