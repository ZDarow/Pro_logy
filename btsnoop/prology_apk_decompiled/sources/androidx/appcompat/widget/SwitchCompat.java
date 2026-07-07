package androidx.appcompat.widget;

import C.x;
import android.R;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import f.AbstractC0266a;
import g.C0304a;
import j.B;
import j.i0;
import j.v0;
import java.lang.reflect.Field;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: a0, reason: collision with root package name */
    public static final i0 f3865a0 = new Property(Float.class, "thumbPos");

    /* renamed from: b0, reason: collision with root package name */
    public static final int[] f3866b0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f3867A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3868B;

    /* renamed from: C, reason: collision with root package name */
    public int f3869C;

    /* renamed from: D, reason: collision with root package name */
    public final int f3870D;

    /* renamed from: E, reason: collision with root package name */
    public float f3871E;

    /* renamed from: F, reason: collision with root package name */
    public float f3872F;

    /* renamed from: G, reason: collision with root package name */
    public final VelocityTracker f3873G;

    /* renamed from: H, reason: collision with root package name */
    public final int f3874H;

    /* renamed from: I, reason: collision with root package name */
    public float f3875I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f3876K;

    /* renamed from: L, reason: collision with root package name */
    public int f3877L;

    /* renamed from: M, reason: collision with root package name */
    public int f3878M;

    /* renamed from: N, reason: collision with root package name */
    public int f3879N;

    /* renamed from: O, reason: collision with root package name */
    public int f3880O;

    /* renamed from: P, reason: collision with root package name */
    public int f3881P;

    /* renamed from: Q, reason: collision with root package name */
    public final TextPaint f3882Q;

    /* renamed from: R, reason: collision with root package name */
    public final ColorStateList f3883R;

    /* renamed from: S, reason: collision with root package name */
    public StaticLayout f3884S;

    /* renamed from: T, reason: collision with root package name */
    public StaticLayout f3885T;

    /* renamed from: U, reason: collision with root package name */
    public final C0304a f3886U;

    /* renamed from: V, reason: collision with root package name */
    public ObjectAnimator f3887V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f3888W;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3889l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f3890m;

    /* renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f3891n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3892o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3893p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f3894q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f3895r;
    public PorterDuff.Mode s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3896t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3897u;

    /* renamed from: v, reason: collision with root package name */
    public int f3898v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public int f3899x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3900y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f3901z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        if (r4 != null) goto L40;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, g.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private boolean getTargetCheckedState() {
        return this.f3875I > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((v0.a(this) ? 1.0f - this.f3875I : this.f3875I) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3894q;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3888W;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3889l;
        Rect b4 = drawable2 != null ? B.b(drawable2) : B.f6553a;
        return ((((this.J - this.f3877L) - rect.left) - rect.right) - b4.left) - b4.right;
    }

    public final void a() {
        Drawable drawable = this.f3889l;
        if (drawable != null) {
            if (this.f3892o || this.f3893p) {
                Drawable mutate = drawable.mutate();
                this.f3889l = mutate;
                if (this.f3892o) {
                    mutate.setTintList(this.f3890m);
                }
                if (this.f3893p) {
                    this.f3889l.setTintMode(this.f3891n);
                }
                if (this.f3889l.isStateful()) {
                    this.f3889l.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f3894q;
        if (drawable != null) {
            if (this.f3896t || this.f3897u) {
                Drawable mutate = drawable.mutate();
                this.f3894q = mutate;
                if (this.f3896t) {
                    mutate.setTintList(this.f3895r);
                }
                if (this.f3897u) {
                    this.f3894q.setTintMode(this.s);
                }
                if (this.f3894q.isStateful()) {
                    this.f3894q.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0304a c0304a = this.f3886U;
        if (c0304a != null) {
            charSequence = c0304a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f3882Q, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        int i5;
        int i6 = this.f3878M;
        int i7 = this.f3879N;
        int i8 = this.f3880O;
        int i9 = this.f3881P;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.f3889l;
        Rect b4 = drawable != null ? B.b(drawable) : B.f6553a;
        Drawable drawable2 = this.f3894q;
        Rect rect = this.f3888W;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (b4 != null) {
                int i11 = b4.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = b4.top;
                int i13 = rect.top;
                i4 = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = b4.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = b4.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i5 = i9 - (i16 - i17);
                    this.f3894q.setBounds(i6, i4, i8, i5);
                }
            } else {
                i4 = i7;
            }
            i5 = i9;
            this.f3894q.setBounds(i6, i4, i8, i5);
        }
        Drawable drawable3 = this.f3889l;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.f3877L + rect.right;
            this.f3889l.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f3889l;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
        Drawable drawable2 = this.f3894q;
        if (drawable2 != null) {
            drawable2.setHotspot(f4, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3889l;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3894q;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!v0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.J;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3899x : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (v0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.J;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3899x : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f3868B;
    }

    public boolean getSplitTrack() {
        return this.f3900y;
    }

    public int getSwitchMinWidth() {
        return this.w;
    }

    public int getSwitchPadding() {
        return this.f3899x;
    }

    public CharSequence getTextOff() {
        return this.f3867A;
    }

    public CharSequence getTextOn() {
        return this.f3901z;
    }

    public Drawable getThumbDrawable() {
        return this.f3889l;
    }

    public int getThumbTextPadding() {
        return this.f3898v;
    }

    public ColorStateList getThumbTintList() {
        return this.f3890m;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3891n;
    }

    public Drawable getTrackDrawable() {
        return this.f3894q;
    }

    public ColorStateList getTrackTintList() {
        return this.f3895r;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.s;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3889l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3894q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3887V;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3887V.end();
        this.f3887V = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3866b0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3894q;
        Rect rect = this.f3888W;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.f3879N;
        int i5 = this.f3881P;
        int i6 = i4 + rect.top;
        int i7 = i5 - rect.bottom;
        Drawable drawable2 = this.f3889l;
        if (drawable != null) {
            if (!this.f3900y || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b4 = B.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b4.left;
                rect.right -= b4.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3884S : this.f3885T;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3883R;
            TextPaint textPaint = this.f3882Q;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i6 + i7) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3901z : this.f3867A;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int width;
        int i9;
        int i10;
        int i11;
        super.onLayout(z4, i4, i5, i6, i7);
        int i12 = 0;
        if (this.f3889l != null) {
            Drawable drawable = this.f3894q;
            Rect rect = this.f3888W;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b4 = B.b(this.f3889l);
            i8 = Math.max(0, b4.left - rect.left);
            i12 = Math.max(0, b4.right - rect.right);
        } else {
            i8 = 0;
        }
        if (v0.a(this)) {
            i9 = getPaddingLeft() + i8;
            width = ((this.J + i9) - i8) - i12;
        } else {
            width = (getWidth() - getPaddingRight()) - i12;
            i9 = (width - this.J) + i8 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i13 = this.f3876K;
            int i14 = height - (i13 / 2);
            i10 = i13 + i14;
            i11 = i14;
        } else if (gravity != 80) {
            i11 = getPaddingTop();
            i10 = this.f3876K + i11;
        } else {
            i10 = getHeight() - getPaddingBottom();
            i11 = i10 - this.f3876K;
        }
        this.f3878M = i9;
        this.f3879N = i11;
        this.f3881P = i10;
        this.f3880O = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (this.f3868B) {
            if (this.f3884S == null) {
                this.f3884S = c(this.f3901z);
            }
            if (this.f3885T == null) {
                this.f3885T = c(this.f3867A);
            }
        }
        Drawable drawable = this.f3889l;
        int i9 = 0;
        Rect rect = this.f3888W;
        if (drawable != null) {
            drawable.getPadding(rect);
            i6 = (this.f3889l.getIntrinsicWidth() - rect.left) - rect.right;
            i7 = this.f3889l.getIntrinsicHeight();
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (this.f3868B) {
            i8 = (this.f3898v * 2) + Math.max(this.f3884S.getWidth(), this.f3885T.getWidth());
        } else {
            i8 = 0;
        }
        this.f3877L = Math.max(i8, i6);
        Drawable drawable2 = this.f3894q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i9 = this.f3894q.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i10 = rect.left;
        int i11 = rect.right;
        Drawable drawable3 = this.f3889l;
        if (drawable3 != null) {
            Rect b4 = B.b(drawable3);
            i10 = Math.max(i10, b4.left);
            i11 = Math.max(i11, b4.right);
        }
        int max = Math.max(this.w, (this.f3877L * 2) + i10 + i11);
        int max2 = Math.max(i9, i7);
        this.J = max;
        this.f3876K = max2;
        super.onMeasure(i4, i5);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3901z : this.f3867A;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        super.setChecked(z4);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence charSequence = this.f3901z;
                if (charSequence == null) {
                    charSequence = getResources().getString(com.prology.R.string.abc_capital_on);
                }
                x.e(this, charSequence);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.f3867A;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(com.prology.R.string.abc_capital_off);
            }
            x.e(this, charSequence2);
        }
        if (getWindowToken() != null) {
            Field field = x.f330a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f3865a0, isChecked ? 1.0f : 0.0f);
                this.f3887V = ofFloat;
                ofFloat.setDuration(250L);
                this.f3887V.setAutoCancel(true);
                this.f3887V.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f3887V;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0462a.Q(callback, this));
    }

    public void setShowText(boolean z4) {
        if (this.f3868B != z4) {
            this.f3868B = z4;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z4) {
        this.f3900y = z4;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.w = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.f3899x = i4;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3882Q;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f3867A = charSequence;
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence charSequence2 = this.f3867A;
        if (charSequence2 == null) {
            charSequence2 = getResources().getString(com.prology.R.string.abc_capital_off);
        }
        x.e(this, charSequence2);
    }

    public void setTextOn(CharSequence charSequence) {
        this.f3901z = charSequence;
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence charSequence2 = this.f3901z;
        if (charSequence2 == null) {
            charSequence2 = getResources().getString(com.prology.R.string.abc_capital_on);
        }
        x.e(this, charSequence2);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3889l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3889l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f4) {
        this.f3875I = f4;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(AbstractC0266a.a(getContext(), i4));
    }

    public void setThumbTextPadding(int i4) {
        this.f3898v = i4;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3890m = colorStateList;
        this.f3892o = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3891n = mode;
        this.f3893p = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3894q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3894q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(AbstractC0266a.a(getContext(), i4));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3895r = colorStateList;
        this.f3896t = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.s = mode;
        this.f3897u = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3889l || drawable == this.f3894q;
    }
}
