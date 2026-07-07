package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* renamed from: l */
    public boolean f3893l;

    /* renamed from: m */
    public android.view.View f3894m;

    /* renamed from: n */
    public android.view.View f3895n;

    /* renamed from: o */
    public android.graphics.drawable.Drawable f3896o;

    /* renamed from: p */
    public android.graphics.drawable.Drawable f3897p;

    /* renamed from: q */
    public android.graphics.drawable.Drawable f3898q;

    /* renamed from: r */
    public final boolean f3899r;

    /* renamed from: s */
    public boolean f3900s;

    /* renamed from: t */
    public final int f3901t;

    public ActionBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p145j.C1647a c1647a = new p145j.C1647a(this);
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        setBackground(c1647a);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p121e.AbstractC1299a.f5185a);
        boolean z4 = false;
        this.f3896o = obtainStyledAttributes.getDrawable(0);
        this.f3897p = obtainStyledAttributes.getDrawable(2);
        this.f3901t = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == com.prology.R.id.split_action_bar) {
            this.f3899r = true;
            this.f3898q = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f3899r ? !(this.f3896o != null || this.f3897p != null) : this.f3898q == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f3896o;
        if (drawable != null && drawable.isStateful()) {
            this.f3896o.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable2 = this.f3897p;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3897p.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable3 = this.f3898q;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3898q.setState(getDrawableState());
    }

    public android.view.View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f3896o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f3897p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable3 = this.f3898q;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3894m = findViewById(com.prology.R.id.action_bar);
        this.f3895n = findViewById(com.prology.R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f3893l || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        boolean z5 = true;
        if (this.f3899r) {
            android.graphics.drawable.Drawable drawable = this.f3898q;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f3896o == null) {
                z5 = false;
            } else if (this.f3894m.getVisibility() == 0) {
                this.f3896o.setBounds(this.f3894m.getLeft(), this.f3894m.getTop(), this.f3894m.getRight(), this.f3894m.getBottom());
            } else {
                android.view.View view = this.f3895n;
                if (view == null || view.getVisibility() != 0) {
                    this.f3896o.setBounds(0, 0, 0, 0);
                } else {
                    this.f3896o.setBounds(this.f3895n.getLeft(), this.f3895n.getTop(), this.f3895n.getRight(), this.f3895n.getBottom());
                }
            }
            this.f3900s = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f3894m == null && android.view.View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f3901t) >= 0) {
            i5 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i6, android.view.View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f3894m == null) {
            return;
        }
        android.view.View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f3896o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3896o);
        }
        this.f3896o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            android.view.View view = this.f3894m;
            if (view != null) {
                this.f3896o.setBounds(view.getLeft(), this.f3894m.getTop(), this.f3894m.getRight(), this.f3894m.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f3899r ? !(this.f3896o != null || this.f3897p != null) : this.f3898q == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f3898q;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3898q);
        }
        this.f3898q = drawable;
        boolean z4 = this.f3899r;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f3898q) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f3896o != null || this.f3897p != null) : this.f3898q == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f3897p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3897p);
        }
        this.f3897p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3900s && this.f3897p != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f3899r ? !(this.f3896o != null || this.f3897p != null) : this.f3898q == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(p145j.AbstractC1641U abstractC1641U) {
    }

    public void setTransitioning(boolean z4) {
        this.f3893l = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        android.graphics.drawable.Drawable drawable = this.f3896o;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.f3897p;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        android.graphics.drawable.Drawable drawable3 = this.f3898q;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f3896o;
        boolean z4 = this.f3899r;
        return (drawable == drawable2 && !z4) || (drawable == this.f3897p && this.f3900s) || ((drawable == this.f3898q && z4) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
