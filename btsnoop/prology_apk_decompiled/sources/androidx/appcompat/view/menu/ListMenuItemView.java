package androidx.appcompat.view.menu;

import C.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.prology.R;
import e.AbstractC0248a;
import i.InterfaceC0335p;
import i.MenuItemC0329j;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0335p, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    public LayoutInflater f3747A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3748B;

    /* renamed from: l, reason: collision with root package name */
    public MenuItemC0329j f3749l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f3750m;

    /* renamed from: n, reason: collision with root package name */
    public RadioButton f3751n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f3752o;

    /* renamed from: p, reason: collision with root package name */
    public CheckBox f3753p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f3754q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f3755r;
    public ImageView s;

    /* renamed from: t, reason: collision with root package name */
    public LinearLayout f3756t;

    /* renamed from: u, reason: collision with root package name */
    public final Drawable f3757u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3758v;
    public final Context w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3759x;

    /* renamed from: y, reason: collision with root package name */
    public final Drawable f3760y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f3761z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t q02 = t.q0(getContext(), attributeSet, AbstractC0248a.f5011n, R.attr.listMenuViewStyle);
        this.f3757u = q02.g0(5);
        TypedArray typedArray = (TypedArray) q02.f3735n;
        this.f3758v = typedArray.getResourceId(1, -1);
        this.f3759x = typedArray.getBoolean(7, false);
        this.w = context;
        this.f3760y = q02.g0(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3761z = obtainStyledAttributes.hasValue(0);
        q02.u0();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3747A == null) {
            this.f3747A = LayoutInflater.from(getContext());
        }
        return this.f3747A;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f3755r;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.s;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.s.getLayoutParams();
        rect.top = this.s.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // i.InterfaceC0335p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(i.MenuItemC0329j r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(i.j):void");
    }

    @Override // i.InterfaceC0335p
    public MenuItemC0329j getItemData() {
        return this.f3749l;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = x.f330a;
        setBackground(this.f3757u);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3752o = textView;
        int i4 = this.f3758v;
        if (i4 != -1) {
            textView.setTextAppearance(this.w, i4);
        }
        this.f3754q = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3755r = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3760y);
        }
        this.s = (ImageView) findViewById(R.id.group_divider);
        this.f3756t = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (this.f3750m != null && this.f3759x) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3750m.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f3751n == null && this.f3753p == null) {
            return;
        }
        if ((this.f3749l.f6091x & 4) != 0) {
            if (this.f3751n == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3751n = radioButton;
                LinearLayout linearLayout = this.f3756t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3751n;
            view = this.f3753p;
        } else {
            if (this.f3753p == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3753p = checkBox;
                LinearLayout linearLayout2 = this.f3756t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3753p;
            view = this.f3751n;
        }
        if (z4) {
            compoundButton.setChecked(this.f3749l.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f3753p;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3751n;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f3749l.f6091x & 4) != 0) {
            if (this.f3751n == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3751n = radioButton;
                LinearLayout linearLayout = this.f3756t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3751n;
        } else {
            if (this.f3753p == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3753p = checkBox;
                LinearLayout linearLayout2 = this.f3756t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3753p;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f3748B = z4;
        this.f3759x = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setVisibility((this.f3761z || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3749l.f6083n.getClass();
        boolean z4 = this.f3748B;
        if (z4 || this.f3759x) {
            ImageView imageView = this.f3750m;
            if (imageView == null && drawable == null && !this.f3759x) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3750m = imageView2;
                LinearLayout linearLayout = this.f3756t;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3759x) {
                this.f3750m.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3750m;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3750m.getVisibility() != 0) {
                this.f3750m.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3752o.getVisibility() != 8) {
                this.f3752o.setVisibility(8);
            }
        } else {
            this.f3752o.setText(charSequence);
            if (this.f3752o.getVisibility() != 0) {
                this.f3752o.setVisibility(0);
            }
        }
    }
}
