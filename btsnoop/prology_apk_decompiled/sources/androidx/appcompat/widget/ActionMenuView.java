package androidx.appcompat.widget;

import L1.g;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import f2.Y;
import i.InterfaceC0327h;
import i.MenuC0328i;
import i.MenuItemC0329j;
import j.C0351f;
import j.C0353h;
import j.C0354i;
import j.C0356k;
import j.G;
import j.H;
import j.InterfaceC0355j;
import j.InterfaceC0357l;
import j.v0;

/* loaded from: classes.dex */
public class ActionMenuView extends H implements InterfaceC0327h {

    /* renamed from: A, reason: collision with root package name */
    public MenuC0328i f3802A;

    /* renamed from: B, reason: collision with root package name */
    public Context f3803B;

    /* renamed from: C, reason: collision with root package name */
    public int f3804C;

    /* renamed from: D, reason: collision with root package name */
    public C0354i f3805D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3806E;

    /* renamed from: F, reason: collision with root package name */
    public int f3807F;

    /* renamed from: G, reason: collision with root package name */
    public final int f3808G;

    /* renamed from: H, reason: collision with root package name */
    public final int f3809H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC0357l f3810I;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f3808G = (int) (56.0f * f4);
        this.f3809H = (int) (f4 * 4.0f);
        this.f3803B = context;
        this.f3804C = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.k, android.widget.LinearLayout$LayoutParams] */
    public static C0356k h() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f6701a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j.k, android.widget.LinearLayout$LayoutParams] */
    public static C0356k i(ViewGroup.LayoutParams layoutParams) {
        C0356k c0356k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0356k) {
            C0356k c0356k2 = (C0356k) layoutParams;
            ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c0356k2);
            layoutParams2.f6701a = c0356k2.f6701a;
            c0356k = layoutParams2;
        } else {
            c0356k = new LinearLayout.LayoutParams(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0356k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0356k).gravity = 16;
        }
        return c0356k;
    }

    @Override // i.InterfaceC0327h
    public final boolean a(MenuItemC0329j menuItemC0329j) {
        return this.f3802A.p(menuItemC0329j, null, 0);
    }

    @Override // j.H, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0356k;
    }

    @Override // j.H
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ G generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    @Override // j.H
    /* renamed from: e */
    public final G generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // j.H
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ G generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // j.H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // j.H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3802A == null) {
            Context context = getContext();
            MenuC0328i menuC0328i = new MenuC0328i(context);
            this.f3802A = menuC0328i;
            menuC0328i.f6053e = new Y(10, this);
            C0354i c0354i = new C0354i(context);
            this.f3805D = c0354i;
            c0354i.f6690v = true;
            c0354i.w = true;
            c0354i.f6685p = new g(22, false);
            this.f3802A.b(c0354i, this.f3803B);
            C0354i c0354i2 = this.f3805D;
            c0354i2.f6687r = this;
            this.f3802A = c0354i2.f6683n;
        }
        return this.f3802A;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0354i c0354i = this.f3805D;
        C0353h c0353h = c0354i.s;
        if (c0353h != null) {
            return c0353h.getDrawable();
        }
        if (c0354i.f6689u) {
            return c0354i.f6688t;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3804C;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i4) {
        boolean z4 = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof InterfaceC0355j)) {
            z4 = ((InterfaceC0355j) childAt).a();
        }
        return (i4 <= 0 || !(childAt2 instanceof InterfaceC0355j)) ? z4 : z4 | ((InterfaceC0355j) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0354i c0354i = this.f3805D;
        if (c0354i != null) {
            c0354i.h();
            C0351f c0351f = this.f3805D.f6676C;
            if (c0351f == null || !c0351f.b()) {
                return;
            }
            this.f3805D.i();
            this.f3805D.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0354i c0354i = this.f3805D;
        if (c0354i != null) {
            c0354i.i();
            C0351f c0351f = c0354i.f6677D;
            if (c0351f == null || !c0351f.b()) {
                return;
            }
            c0351f.f6104i.dismiss();
        }
    }

    @Override // j.H, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int width;
        int i8;
        if (!this.f3806E) {
            super.onLayout(z4, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i6 - i4;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a4 = v0.a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0356k c0356k = (C0356k) childAt.getLayoutParams();
                if (c0356k.f6701a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a4) {
                        i8 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0356k).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0356k).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0356k).leftMargin) + ((LinearLayout.LayoutParams) c0356k).rightMargin;
                    j(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        int max = Math.max(0, i17 > 0 ? paddingRight / i17 : 0);
        if (a4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                C0356k c0356k2 = (C0356k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0356k2.f6701a) {
                    int i19 = width2 - ((LinearLayout.LayoutParams) c0356k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0356k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            C0356k c0356k3 = (C0356k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0356k3.f6701a) {
                int i22 = paddingLeft + ((LinearLayout.LayoutParams) c0356k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0356k3).rightMargin + max + i22;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // j.H, android.view.View
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
        MenuC0328i menuC0328i;
        boolean z6 = this.f3806E;
        boolean z7 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.f3806E = z7;
        if (z6 != z7) {
            this.f3807F = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f3806E && (menuC0328i = this.f3802A) != null && size != this.f3807F) {
            this.f3807F = size;
            menuC0328i.o(true);
        }
        int childCount = getChildCount();
        if (!this.f3806E || childCount <= 0) {
            for (int i14 = 0; i14 < childCount; i14++) {
                C0356k c0356k = (C0356k) getChildAt(i14).getLayoutParams();
                ((LinearLayout.LayoutParams) c0356k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0356k).leftMargin = 0;
            }
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i4);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.f3808G;
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
            i6 = this.f3809H;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = i15;
            if (childAt.getVisibility() == 8) {
                i11 = mode;
                i12 = paddingBottom;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i27 = i21 + 1;
                if (z9) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C0356k c0356k2 = (C0356k) childAt.getLayoutParams();
                c0356k2.f6706f = false;
                c0356k2.f6703c = 0;
                c0356k2.f6702b = 0;
                c0356k2.f6704d = false;
                ((LinearLayout.LayoutParams) c0356k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0356k2).rightMargin = 0;
                c0356k2.f6705e = z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = c0356k2.f6701a ? 1 : i17;
                C0356k c0356k3 = (C0356k) childAt.getLayoutParams();
                i11 = mode;
                i12 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z9 ? (ActionMenuItemView) childAt : null;
                boolean z10 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i28 <= 0 || (z10 && i28 < 2)) {
                    i13 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i28 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i13 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i13++;
                    }
                    if (z10 && i13 < 2) {
                        i13 = 2;
                    }
                }
                c0356k3.f6704d = !c0356k3.f6701a && z10;
                c0356k3.f6702b = i13;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i19, 1073741824), makeMeasureSpec);
                i22 = Math.max(i22, i13);
                if (c0356k2.f6704d) {
                    i24++;
                }
                if (c0356k2.f6701a) {
                    z8 = true;
                }
                i17 -= i13;
                i20 = Math.max(i20, childAt.getMeasuredHeight());
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
                C0356k c0356k4 = (C0356k) getChildAt(i34).getLayoutParams();
                boolean z13 = z12;
                if (c0356k4.f6704d) {
                    int i35 = c0356k4.f6702b;
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
                View childAt2 = getChildAt(i37);
                C0356k c0356k5 = (C0356k) childAt2.getLayoutParams();
                int i38 = i20;
                int i39 = childMeasureSpec;
                int i40 = childCount2;
                long j6 = 1 << i37;
                if ((j5 & j6) != 0) {
                    if (z11 && c0356k5.f6705e) {
                        r4 = 1;
                        r4 = 1;
                        if (i17 == 1) {
                            childAt2.setPadding(i6 + i19, 0, i6, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0356k5.f6702b += r4;
                    c0356k5.f6706f = r4;
                    i17--;
                } else if (c0356k5.f6702b == i36) {
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
            float bitCount = Long.bitCount(j4);
            if (!z14) {
                if ((j4 & 1) != 0 && !((C0356k) getChildAt(0).getLayoutParams()).f6705e) {
                    bitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j4 & (1 << i44)) != 0 && !((C0356k) getChildAt(i44).getLayoutParams()).f6705e) {
                    bitCount -= 0.5f;
                }
            }
            int i45 = bitCount > 0.0f ? (int) ((i17 * i19) / bitCount) : 0;
            boolean z15 = z4;
            i7 = i43;
            for (int i46 = 0; i46 < i7; i46++) {
                if ((j4 & (1 << i46)) != 0) {
                    View childAt3 = getChildAt(i46);
                    C0356k c0356k6 = (C0356k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0356k6.f6703c = i45;
                        c0356k6.f6706f = true;
                        if (i46 == 0 && !c0356k6.f6705e) {
                            ((LinearLayout.LayoutParams) c0356k6).leftMargin = (-i45) / 2;
                        }
                        z15 = true;
                    } else {
                        if (c0356k6.f6701a) {
                            c0356k6.f6703c = i45;
                            c0356k6.f6706f = true;
                            ((LinearLayout.LayoutParams) c0356k6).rightMargin = (-i45) / 2;
                            z15 = true;
                        } else {
                            if (i46 != 0) {
                                ((LinearLayout.LayoutParams) c0356k6).leftMargin = i45 / 2;
                            }
                            if (i46 != i7 - 1) {
                                ((LinearLayout.LayoutParams) c0356k6).rightMargin = i45 / 2;
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
                View childAt4 = getChildAt(i47);
                C0356k c0356k7 = (C0356k) childAt4.getLayoutParams();
                if (c0356k7.f6706f) {
                    i10 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0356k7.f6702b * i19) + c0356k7.f6703c, 1073741824), i10);
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
        this.f3805D.f6674A = z4;
    }

    public void setOnMenuItemClickListener(InterfaceC0357l interfaceC0357l) {
        this.f3810I = interfaceC0357l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0354i c0354i = this.f3805D;
        C0353h c0353h = c0354i.s;
        if (c0353h != null) {
            c0353h.setImageDrawable(drawable);
        } else {
            c0354i.f6689u = true;
            c0354i.f6688t = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
    }

    public void setPopupTheme(int i4) {
        if (this.f3804C != i4) {
            this.f3804C = i4;
            if (i4 == 0) {
                this.f3803B = getContext();
            } else {
                this.f3803B = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(C0354i c0354i) {
        this.f3805D = c0354i;
        c0354i.f6687r = this;
        this.f3802A = c0354i.f6683n;
    }

    @Override // j.H, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
