package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements p140i.InterfaceC1524p, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A */
    public android.view.LayoutInflater f3876A;

    /* renamed from: B */
    public boolean f3877B;

    /* renamed from: l */
    public p140i.MenuItemC1518j f3878l;

    /* renamed from: m */
    public android.widget.ImageView f3879m;

    /* renamed from: n */
    public android.widget.RadioButton f3880n;

    /* renamed from: o */
    public android.widget.TextView f3881o;

    /* renamed from: p */
    public android.widget.CheckBox f3882p;

    /* renamed from: q */
    public android.widget.TextView f3883q;

    /* renamed from: r */
    public android.widget.ImageView f3884r;

    /* renamed from: s */
    public android.widget.ImageView f3885s;

    /* renamed from: t */
    public android.widget.LinearLayout f3886t;

    /* renamed from: u */
    public final android.graphics.drawable.Drawable f3887u;

    /* renamed from: v */
    public final int f3888v;

    /* renamed from: w */
    public final android.content.Context f3889w;

    /* renamed from: x */
    public boolean f3890x;

    /* renamed from: y */
    public final android.graphics.drawable.Drawable f3891y;

    /* renamed from: z */
    public final boolean f3892z;

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.support.v4.media.session.C1061t m2202q0 = android.support.v4.media.session.C1061t.m2202q0(getContext(), attributeSet, p121e.AbstractC1299a.f5198n, com.prology.R.attr.listMenuViewStyle);
        this.f3887u = m2202q0.m2225g0(5);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) m2202q0.f3862n;
        this.f3888v = typedArray.getResourceId(1, -1);
        this.f3890x = typedArray.getBoolean(7, false);
        this.f3889w = context;
        this.f3891y = m2202q0.m2225g0(8);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, com.prology.R.attr.dropDownListViewStyle, 0);
        this.f3892z = obtainStyledAttributes.hasValue(0);
        m2202q0.m2243u0();
        obtainStyledAttributes.recycle();
    }

    private android.view.LayoutInflater getInflater() {
        if (this.f3876A == null) {
            this.f3876A = android.view.LayoutInflater.from(getContext());
        }
        return this.f3876A;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        android.widget.ImageView imageView = this.f3884r;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.f3885s;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f3885s.getLayoutParams();
        rect.top = this.f3885s.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // p140i.InterfaceC1524p
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2277c(p140i.MenuItemC1518j r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo2277c(i.j):void");
    }

    @Override // p140i.InterfaceC1524p
    public p140i.MenuItemC1518j getItemData() {
        return this.f3878l;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        setBackground(this.f3887u);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.prology.R.id.title);
        this.f3881o = textView;
        int i4 = this.f3888v;
        if (i4 != -1) {
            textView.setTextAppearance(this.f3889w, i4);
        }
        this.f3883q = (android.widget.TextView) findViewById(com.prology.R.id.shortcut);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.prology.R.id.submenuarrow);
        this.f3884r = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3891y);
        }
        this.f3885s = (android.widget.ImageView) findViewById(com.prology.R.id.group_divider);
        this.f3886t = (android.widget.LinearLayout) findViewById(com.prology.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (this.f3879m != null && this.f3890x) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f3879m.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z4) {
        android.widget.CompoundButton compoundButton;
        android.view.View view;
        if (!z4 && this.f3880n == null && this.f3882p == null) {
            return;
        }
        if ((this.f3878l.f6317x & 4) != 0) {
            if (this.f3880n == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.prology.R.layout.abc_list_menu_item_radio, (android.view.ViewGroup) this, false);
                this.f3880n = radioButton;
                android.widget.LinearLayout linearLayout = this.f3886t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3880n;
            view = this.f3882p;
        } else {
            if (this.f3882p == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(com.prology.R.layout.abc_list_menu_item_checkbox, (android.view.ViewGroup) this, false);
                this.f3882p = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f3886t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3882p;
            view = this.f3880n;
        }
        if (z4) {
            compoundButton.setChecked(this.f3878l.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        android.widget.CheckBox checkBox2 = this.f3882p;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        android.widget.RadioButton radioButton2 = this.f3880n;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        android.widget.CompoundButton compoundButton;
        if ((this.f3878l.f6317x & 4) != 0) {
            if (this.f3880n == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.prology.R.layout.abc_list_menu_item_radio, (android.view.ViewGroup) this, false);
                this.f3880n = radioButton;
                android.widget.LinearLayout linearLayout = this.f3886t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3880n;
        } else {
            if (this.f3882p == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(com.prology.R.layout.abc_list_menu_item_checkbox, (android.view.ViewGroup) this, false);
                this.f3882p = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f3886t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3882p;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f3877B = z4;
        this.f3890x = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        android.widget.ImageView imageView = this.f3885s;
        if (imageView != null) {
            imageView.setVisibility((this.f3892z || !z4) ? 8 : 0);
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f3878l.f6307n.getClass();
        boolean z4 = this.f3877B;
        if (z4 || this.f3890x) {
            android.widget.ImageView imageView = this.f3879m;
            if (imageView == null && drawable == null && !this.f3890x) {
                return;
            }
            if (imageView == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) getInflater().inflate(com.prology.R.layout.abc_list_menu_item_icon, (android.view.ViewGroup) this, false);
                this.f3879m = imageView2;
                android.widget.LinearLayout linearLayout = this.f3886t;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3890x) {
                this.f3879m.setVisibility(8);
                return;
            }
            android.widget.ImageView imageView3 = this.f3879m;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3879m.getVisibility() != 0) {
                this.f3879m.setVisibility(0);
            }
        }
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3881o.getVisibility() != 8) {
                this.f3881o.setVisibility(8);
            }
        } else {
            this.f3881o.setText(charSequence);
            if (this.f3881o.getVisibility() != 0) {
                this.f3881o.setVisibility(0);
            }
        }
    }
}
