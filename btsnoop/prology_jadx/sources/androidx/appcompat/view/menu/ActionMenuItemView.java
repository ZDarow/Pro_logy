package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ActionMenuItemView extends p145j.C1687u implements p140i.InterfaceC1524p, android.view.View.OnClickListener, p145j.InterfaceC1665j {

    /* renamed from: A */
    public final int f3864A;

    /* renamed from: q */
    public p140i.MenuItemC1518j f3865q;

    /* renamed from: r */
    public java.lang.CharSequence f3866r;

    /* renamed from: s */
    public android.graphics.drawable.Drawable f3867s;

    /* renamed from: t */
    public p140i.InterfaceC1516h f3868t;

    /* renamed from: u */
    public p140i.ViewOnTouchListenerC1509a f3869u;

    /* renamed from: v */
    public p140i.AbstractC1510b f3870v;

    /* renamed from: w */
    public boolean f3871w;

    /* renamed from: x */
    public boolean f3872x;

    /* renamed from: y */
    public final int f3873y;

    /* renamed from: z */
    public int f3874z;

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        android.content.res.Resources resources = context.getResources();
        this.f3871w = m2278e();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p121e.AbstractC1299a.f5187c, 0, 0);
        this.f3873y = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f3864A = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3874z = -1;
        setSaveEnabled(false);
    }

    @Override // p145j.InterfaceC1665j
    /* renamed from: a */
    public final boolean mo2275a() {
        return !android.text.TextUtils.isEmpty(getText());
    }

    @Override // p145j.InterfaceC1665j
    /* renamed from: b */
    public final boolean mo2276b() {
        return !android.text.TextUtils.isEmpty(getText()) && this.f3865q.getIcon() == null;
    }

    @Override // p140i.InterfaceC1524p
    /* renamed from: c */
    public final void mo2277c(p140i.MenuItemC1518j menuItemC1518j) {
        this.f3865q = menuItemC1518j;
        setIcon(menuItemC1518j.getIcon());
        setTitle(menuItemC1518j.getTitleCondensed());
        setId(menuItemC1518j.f6294a);
        setVisibility(menuItemC1518j.isVisible() ? 0 : 8);
        setEnabled(menuItemC1518j.isEnabled());
        if (menuItemC1518j.hasSubMenu() && this.f3869u == null) {
            this.f3869u = new p140i.ViewOnTouchListenerC1509a(this);
        }
    }

    /* renamed from: e */
    public final boolean m2278e() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        return i4 >= 480 || (i4 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    public final void m2279f() {
        boolean z4 = true;
        boolean z5 = !android.text.TextUtils.isEmpty(this.f3866r);
        if (this.f3867s != null && ((this.f3865q.f6318y & 4) != 4 || (!this.f3871w && !this.f3872x))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f3866r : null);
        java.lang.CharSequence charSequence = this.f3865q.f6310q;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f3865q.f6298e);
        } else {
            setContentDescription(charSequence);
        }
        java.lang.CharSequence charSequence2 = this.f3865q.f6311r;
        if (android.text.TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z6 ? null : this.f3865q.f6298e);
        } else {
            setTooltipText(charSequence2);
        }
    }

    @Override // p140i.InterfaceC1524p
    public p140i.MenuItemC1518j getItemData() {
        return this.f3865q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p140i.InterfaceC1516h interfaceC1516h = this.f3868t;
        if (interfaceC1516h != null) {
            interfaceC1516h.mo2280a(this.f3865q);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3871w = m2278e();
        m2279f();
    }

    @Override // p145j.C1687u, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean isEmpty = android.text.TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.f3874z) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = android.view.View.MeasureSpec.getMode(i4);
        int size = android.view.View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f3873y;
        int min = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < min) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (!isEmpty || this.f3867s == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3867s.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        p140i.ViewOnTouchListenerC1509a viewOnTouchListenerC1509a;
        if (this.f3865q.hasSubMenu() && (viewOnTouchListenerC1509a = this.f3869u) != null && viewOnTouchListenerC1509a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f3872x != z4) {
            this.f3872x = z4;
            p140i.MenuItemC1518j menuItemC1518j = this.f3865q;
            if (menuItemC1518j != null) {
                p140i.MenuC1517i menuC1517i = menuItemC1518j.f6307n;
                menuC1517i.f6282k = true;
                menuC1517i.m3373o(true);
            }
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f3867s = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f3864A;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        m2279f();
    }

    public void setItemInvoker(p140i.InterfaceC1516h interfaceC1516h) {
        this.f3868t = interfaceC1516h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i5, int i6, int i7) {
        this.f3874z = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(p140i.AbstractC1510b abstractC1510b) {
        this.f3870v = abstractC1510b;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f3866r = charSequence;
        m2279f();
    }
}
