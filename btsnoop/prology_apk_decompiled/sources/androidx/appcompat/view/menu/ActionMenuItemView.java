package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import e.AbstractC0248a;
import i.AbstractC0321b;
import i.InterfaceC0327h;
import i.InterfaceC0335p;
import i.MenuC0328i;
import i.MenuItemC0329j;
import i.ViewOnTouchListenerC0320a;
import j.C0365u;
import j.InterfaceC0355j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0365u implements InterfaceC0335p, View.OnClickListener, InterfaceC0355j {

    /* renamed from: A, reason: collision with root package name */
    public final int f3737A;

    /* renamed from: q, reason: collision with root package name */
    public MenuItemC0329j f3738q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3739r;
    public Drawable s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0327h f3740t;

    /* renamed from: u, reason: collision with root package name */
    public ViewOnTouchListenerC0320a f3741u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0321b f3742v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3743x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3744y;

    /* renamed from: z, reason: collision with root package name */
    public int f3745z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.w = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0248a.f5000c, 0, 0);
        this.f3744y = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f3737A = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3745z = -1;
        setSaveEnabled(false);
    }

    @Override // j.InterfaceC0355j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // j.InterfaceC0355j
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f3738q.getIcon() == null;
    }

    @Override // i.InterfaceC0335p
    public final void c(MenuItemC0329j menuItemC0329j) {
        this.f3738q = menuItemC0329j;
        setIcon(menuItemC0329j.getIcon());
        setTitle(menuItemC0329j.getTitleCondensed());
        setId(menuItemC0329j.f6070a);
        setVisibility(menuItemC0329j.isVisible() ? 0 : 8);
        setEnabled(menuItemC0329j.isEnabled());
        if (menuItemC0329j.hasSubMenu() && this.f3741u == null) {
            this.f3741u = new ViewOnTouchListenerC0320a(this);
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        return i4 >= 480 || (i4 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f3739r);
        if (this.s != null && ((this.f3738q.f6092y & 4) != 4 || (!this.w && !this.f3743x))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f3739r : null);
        CharSequence charSequence = this.f3738q.f6086q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f3738q.f6074e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3738q.f6087r;
        if (TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z6 ? null : this.f3738q.f6074e);
        } else {
            setTooltipText(charSequence2);
        }
    }

    @Override // i.InterfaceC0335p
    public MenuItemC0329j getItemData() {
        return this.f3738q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0327h interfaceC0327h = this.f3740t;
        if (interfaceC0327h != null) {
            interfaceC0327h.a(this.f3738q);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w = e();
        f();
    }

    @Override // j.C0365u, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.f3745z) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f3744y;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (!isEmpty || this.s == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.s.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0320a viewOnTouchListenerC0320a;
        if (this.f3738q.hasSubMenu() && (viewOnTouchListenerC0320a = this.f3741u) != null && viewOnTouchListenerC0320a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f3743x != z4) {
            this.f3743x = z4;
            MenuItemC0329j menuItemC0329j = this.f3738q;
            if (menuItemC0329j != null) {
                MenuC0328i menuC0328i = menuItemC0329j.f6083n;
                menuC0328i.f6059k = true;
                menuC0328i.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.s = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f3737A;
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
        f();
    }

    public void setItemInvoker(InterfaceC0327h interfaceC0327h) {
        this.f3740t = interfaceC0327h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i5, int i6, int i7) {
        this.f3745z = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(AbstractC0321b abstractC0321b) {
        this.f3742v = abstractC0321b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3739r = charSequence;
        f();
    }
}
