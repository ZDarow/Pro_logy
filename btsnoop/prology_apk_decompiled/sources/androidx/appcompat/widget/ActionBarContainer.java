package androidx.appcompat.widget;

import C.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.prology.R;
import e.AbstractC0248a;
import j.C0346a;
import j.U;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public boolean f3762l;

    /* renamed from: m, reason: collision with root package name */
    public View f3763m;

    /* renamed from: n, reason: collision with root package name */
    public View f3764n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f3765o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f3766p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f3767q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3768r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3769t;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0346a c0346a = new C0346a(this);
        Field field = x.f330a;
        setBackground(c0346a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0248a.f4998a);
        boolean z4 = false;
        this.f3765o = obtainStyledAttributes.getDrawable(0);
        this.f3766p = obtainStyledAttributes.getDrawable(2);
        this.f3769t = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3768r = true;
            this.f3767q = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f3768r ? !(this.f3765o != null || this.f3766p != null) : this.f3767q == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3765o;
        if (drawable != null && drawable.isStateful()) {
            this.f3765o.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3766p;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3766p.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3767q;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3767q.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3765o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3766p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3767q;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3763m = findViewById(R.id.action_bar);
        this.f3764n = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3762l || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        boolean z5 = true;
        if (this.f3768r) {
            Drawable drawable = this.f3767q;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f3765o == null) {
                z5 = false;
            } else if (this.f3763m.getVisibility() == 0) {
                this.f3765o.setBounds(this.f3763m.getLeft(), this.f3763m.getTop(), this.f3763m.getRight(), this.f3763m.getBottom());
            } else {
                View view = this.f3764n;
                if (view == null || view.getVisibility() != 0) {
                    this.f3765o.setBounds(0, 0, 0, 0);
                } else {
                    this.f3765o.setBounds(this.f3764n.getLeft(), this.f3764n.getTop(), this.f3764n.getRight(), this.f3764n.getBottom());
                }
            }
            this.s = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f3763m == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f3769t) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f3763m == null) {
            return;
        }
        View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3765o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3765o);
        }
        this.f3765o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3763m;
            if (view != null) {
                this.f3765o.setBounds(view.getLeft(), this.f3763m.getTop(), this.f3763m.getRight(), this.f3763m.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f3768r ? !(this.f3765o != null || this.f3766p != null) : this.f3767q == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3767q;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3767q);
        }
        this.f3767q = drawable;
        boolean z4 = this.f3768r;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f3767q) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f3765o != null || this.f3766p != null) : this.f3767q == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f3766p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3766p);
        }
        this.f3766p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.s && this.f3766p != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f3768r ? !(this.f3765o != null || this.f3766p != null) : this.f3767q == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(U u4) {
    }

    public void setTransitioning(boolean z4) {
        this.f3762l = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f3765o;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f3766p;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f3767q;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3765o;
        boolean z4 = this.f3768r;
        return (drawable == drawable2 && !z4) || (drawable == this.f3766p && this.s) || ((drawable == this.f3767q && z4) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
