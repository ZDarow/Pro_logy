package androidx.appcompat.widget;

import C.x;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.prology.R;
import e.AbstractC0248a;
import f.AbstractC0266a;
import j.v0;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: l, reason: collision with root package name */
    public int f3770l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3771m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3772n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f3773o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3774p;

    /* renamed from: q, reason: collision with root package name */
    public View f3775q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f3776r;
    public TextView s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f3777t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3778u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3779v;
    public boolean w;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0248a.f5001d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0266a.a(context, resourceId);
        Field field = x.f330a;
        setBackground(drawable);
        this.f3778u = obtainStyledAttributes.getResourceId(5, 0);
        this.f3779v = obtainStyledAttributes.getResourceId(4, 0);
        this.f3770l = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i4, int i5, int i6, boolean z4) {
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

    public final void a() {
        if (this.f3776r == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3776r = linearLayout;
            this.s = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3777t = (TextView) this.f3776r.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f3778u;
            if (i4 != 0) {
                this.s.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f3779v;
            if (i5 != 0) {
                this.f3777t.setTextAppearance(getContext(), i5);
            }
        }
        this.s.setText(this.f3773o);
        this.f3777t.setText(this.f3774p);
        boolean isEmpty = TextUtils.isEmpty(this.f3773o);
        boolean isEmpty2 = TextUtils.isEmpty(this.f3774p);
        this.f3777t.setVisibility(!isEmpty2 ? 0 : 8);
        this.f3776r.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f3776r.getParent() == null) {
            addView(this.f3776r);
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
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f3770l;
    }

    public CharSequence getSubtitle() {
        return this.f3774p;
    }

    public CharSequence getTitle() {
        return this.f3773o;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0248a.f4998a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3772n = false;
        }
        if (!this.f3772n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3772n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3772n = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f3773o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean a4 = v0.a(this);
        int paddingRight = a4 ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f3776r;
        if (linearLayout != null && this.f3775q == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f3776r, paddingRight, paddingTop, paddingTop2, a4);
        }
        View view = this.f3775q;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, a4);
        }
        if (a4) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i4);
        int i6 = this.f3770l;
        if (i6 <= 0) {
            i6 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i7 = i6 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f3776r;
        if (linearLayout != null && this.f3775q == null) {
            if (this.w) {
                this.f3776r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f3776r.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f3776r.setVisibility(z4 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f3775q;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                i7 = Math.min(i10, i7);
            }
            this.f3775q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i7, i11));
        }
        if (this.f3770l > 0) {
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
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3771m = false;
        }
        if (!this.f3771m) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3771m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3771m = false;
        }
        return true;
    }

    public void setContentHeight(int i4) {
        this.f3770l = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3775q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3775q = view;
        if (view != null && (linearLayout = this.f3776r) != null) {
            removeView(linearLayout);
            this.f3776r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3774p = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3773o = charSequence;
        a();
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.w) {
            requestLayout();
        }
        this.w = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
