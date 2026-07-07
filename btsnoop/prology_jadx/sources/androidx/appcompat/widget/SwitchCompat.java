package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class SwitchCompat extends android.widget.CompoundButton {

    /* renamed from: a0 */
    public static final p145j.C1664i0 f4003a0 = new android.util.Property(java.lang.Float.class, "thumbPos");

    /* renamed from: b0 */
    public static final int[] f4004b0 = {android.R.attr.state_checked};

    /* renamed from: A */
    public java.lang.CharSequence f4005A;

    /* renamed from: B */
    public boolean f4006B;

    /* renamed from: C */
    public int f4007C;

    /* renamed from: D */
    public final int f4008D;

    /* renamed from: E */
    public float f4009E;

    /* renamed from: F */
    public float f4010F;

    /* renamed from: G */
    public final android.view.VelocityTracker f4011G;

    /* renamed from: H */
    public final int f4012H;

    /* renamed from: I */
    public float f4013I;

    /* renamed from: J */
    public int f4014J;

    /* renamed from: K */
    public int f4015K;

    /* renamed from: L */
    public int f4016L;

    /* renamed from: M */
    public int f4017M;

    /* renamed from: N */
    public int f4018N;

    /* renamed from: O */
    public int f4019O;

    /* renamed from: P */
    public int f4020P;

    /* renamed from: Q */
    public final android.text.TextPaint f4021Q;

    /* renamed from: R */
    public final android.content.res.ColorStateList f4022R;

    /* renamed from: S */
    public android.text.StaticLayout f4023S;

    /* renamed from: T */
    public android.text.StaticLayout f4024T;

    /* renamed from: U */
    public final p131g.C1455a f4025U;

    /* renamed from: V */
    public android.animation.ObjectAnimator f4026V;

    /* renamed from: W */
    public final android.graphics.Rect f4027W;

    /* renamed from: l */
    public android.graphics.drawable.Drawable f4028l;

    /* renamed from: m */
    public android.content.res.ColorStateList f4029m;

    /* renamed from: n */
    public android.graphics.PorterDuff.Mode f4030n;

    /* renamed from: o */
    public boolean f4031o;

    /* renamed from: p */
    public boolean f4032p;

    /* renamed from: q */
    public android.graphics.drawable.Drawable f4033q;

    /* renamed from: r */
    public android.content.res.ColorStateList f4034r;

    /* renamed from: s */
    public android.graphics.PorterDuff.Mode f4035s;

    /* renamed from: t */
    public boolean f4036t;

    /* renamed from: u */
    public boolean f4037u;

    /* renamed from: v */
    public int f4038v;

    /* renamed from: w */
    public int f4039w;

    /* renamed from: x */
    public int f4040x;

    /* renamed from: y */
    public boolean f4041y;

    /* renamed from: z */
    public java.lang.CharSequence f4042z;

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
        return this.f4013I > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((p145j.AbstractC1690v0.m3632a(this) ? 1.0f - this.f4013I : this.f4013I) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        android.graphics.drawable.Drawable drawable = this.f4033q;
        if (drawable == null) {
            return 0;
        }
        android.graphics.Rect rect = this.f4027W;
        drawable.getPadding(rect);
        android.graphics.drawable.Drawable drawable2 = this.f4028l;
        android.graphics.Rect m3577b = drawable2 != null ? p145j.AbstractC1623B.m3577b(drawable2) : p145j.AbstractC1623B.f6800a;
        return ((((this.f4014J - this.f4016L) - rect.left) - rect.right) - m3577b.left) - m3577b.right;
    }

    /* renamed from: a */
    public final void m2310a() {
        android.graphics.drawable.Drawable drawable = this.f4028l;
        if (drawable != null) {
            if (this.f4031o || this.f4032p) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f4028l = mutate;
                if (this.f4031o) {
                    mutate.setTintList(this.f4029m);
                }
                if (this.f4032p) {
                    this.f4028l.setTintMode(this.f4030n);
                }
                if (this.f4028l.isStateful()) {
                    this.f4028l.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m2311b() {
        android.graphics.drawable.Drawable drawable = this.f4033q;
        if (drawable != null) {
            if (this.f4036t || this.f4037u) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f4033q = mutate;
                if (this.f4036t) {
                    mutate.setTintList(this.f4034r);
                }
                if (this.f4037u) {
                    this.f4033q.setTintMode(this.f4035s);
                }
                if (this.f4033q.isStateful()) {
                    this.f4033q.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final android.text.StaticLayout m2312c(java.lang.CharSequence charSequence) {
        p131g.C1455a c1455a = this.f4025U;
        if (c1455a != null) {
            charSequence = c1455a.getTransformation(charSequence, this);
        }
        java.lang.CharSequence charSequence2 = charSequence;
        return new android.text.StaticLayout(charSequence2, this.f4021Q, charSequence2 != null ? (int) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(charSequence2, r2)) : 0, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int i4;
        int i5;
        int i6 = this.f4017M;
        int i7 = this.f4018N;
        int i8 = this.f4019O;
        int i9 = this.f4020P;
        int thumbOffset = getThumbOffset() + i6;
        android.graphics.drawable.Drawable drawable = this.f4028l;
        android.graphics.Rect m3577b = drawable != null ? p145j.AbstractC1623B.m3577b(drawable) : p145j.AbstractC1623B.f6800a;
        android.graphics.drawable.Drawable drawable2 = this.f4033q;
        android.graphics.Rect rect = this.f4027W;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (m3577b != null) {
                int i11 = m3577b.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = m3577b.top;
                int i13 = rect.top;
                i4 = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = m3577b.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = m3577b.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i5 = i9 - (i16 - i17);
                    this.f4033q.setBounds(i6, i4, i8, i5);
                }
            } else {
                i4 = i7;
            }
            i5 = i9;
            this.f4033q.setBounds(i6, i4, i8, i5);
        }
        android.graphics.drawable.Drawable drawable3 = this.f4028l;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.f4016L + rect.right;
            this.f4028l.setBounds(i18, i7, i19, i9);
            android.graphics.drawable.Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        android.graphics.drawable.Drawable drawable = this.f4028l;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
        android.graphics.drawable.Drawable drawable2 = this.f4033q;
        if (drawable2 != null) {
            drawable2.setHotspot(f4, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f4028l;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        android.graphics.drawable.Drawable drawable2 = this.f4033q;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!p145j.AbstractC1690v0.m3632a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4014J;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f4040x : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (p145j.AbstractC1690v0.m3632a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4014J;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f4040x : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f4006B;
    }

    public boolean getSplitTrack() {
        return this.f4041y;
    }

    public int getSwitchMinWidth() {
        return this.f4039w;
    }

    public int getSwitchPadding() {
        return this.f4040x;
    }

    public java.lang.CharSequence getTextOff() {
        return this.f4005A;
    }

    public java.lang.CharSequence getTextOn() {
        return this.f4042z;
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
        return this.f4028l;
    }

    public int getThumbTextPadding() {
        return this.f4038v;
    }

    public android.content.res.ColorStateList getThumbTintList() {
        return this.f4029m;
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
        return this.f4030n;
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
        return this.f4033q;
    }

    public android.content.res.ColorStateList getTrackTintList() {
        return this.f4034r;
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
        return this.f4035s;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f4028l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f4033q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.animation.ObjectAnimator objectAnimator = this.f4026V;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f4026V.end();
        this.f4026V = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, f4004b0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int width;
        super.onDraw(canvas);
        android.graphics.drawable.Drawable drawable = this.f4033q;
        android.graphics.Rect rect = this.f4027W;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.f4018N;
        int i5 = this.f4020P;
        int i6 = i4 + rect.top;
        int i7 = i5 - rect.bottom;
        android.graphics.drawable.Drawable drawable2 = this.f4028l;
        if (drawable != null) {
            if (!this.f4041y || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                android.graphics.Rect m3577b = p145j.AbstractC1623B.m3577b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m3577b.left;
                rect.right -= m3577b.right;
                int save = canvas.save();
                canvas.clipRect(rect, android.graphics.Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.text.StaticLayout staticLayout = getTargetCheckedState() ? this.f4023S : this.f4024T;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            android.content.res.ColorStateList colorStateList = this.f4022R;
            android.text.TextPaint textPaint = this.f4021Q;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                android.graphics.Rect bounds = drawable2.getBounds();
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
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (android.os.Build.VERSION.SDK_INT < 30) {
            java.lang.CharSequence charSequence = isChecked() ? this.f4042z : this.f4005A;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return;
            }
            java.lang.CharSequence text = accessibilityNodeInfo.getText();
            if (android.text.TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
        if (this.f4028l != null) {
            android.graphics.drawable.Drawable drawable = this.f4033q;
            android.graphics.Rect rect = this.f4027W;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            android.graphics.Rect m3577b = p145j.AbstractC1623B.m3577b(this.f4028l);
            i8 = java.lang.Math.max(0, m3577b.left - rect.left);
            i12 = java.lang.Math.max(0, m3577b.right - rect.right);
        } else {
            i8 = 0;
        }
        if (p145j.AbstractC1690v0.m3632a(this)) {
            i9 = getPaddingLeft() + i8;
            width = ((this.f4014J + i9) - i8) - i12;
        } else {
            width = (getWidth() - getPaddingRight()) - i12;
            i9 = (width - this.f4014J) + i8 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i13 = this.f4015K;
            int i14 = height - (i13 / 2);
            i10 = i13 + i14;
            i11 = i14;
        } else if (gravity != 80) {
            i11 = getPaddingTop();
            i10 = this.f4015K + i11;
        } else {
            i10 = getHeight() - getPaddingBottom();
            i11 = i10 - this.f4015K;
        }
        this.f4017M = i9;
        this.f4018N = i11;
        this.f4020P = i10;
        this.f4019O = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (this.f4006B) {
            if (this.f4023S == null) {
                this.f4023S = m2312c(this.f4042z);
            }
            if (this.f4024T == null) {
                this.f4024T = m2312c(this.f4005A);
            }
        }
        android.graphics.drawable.Drawable drawable = this.f4028l;
        int i9 = 0;
        android.graphics.Rect rect = this.f4027W;
        if (drawable != null) {
            drawable.getPadding(rect);
            i6 = (this.f4028l.getIntrinsicWidth() - rect.left) - rect.right;
            i7 = this.f4028l.getIntrinsicHeight();
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (this.f4006B) {
            i8 = (this.f4038v * 2) + java.lang.Math.max(this.f4023S.getWidth(), this.f4024T.getWidth());
        } else {
            i8 = 0;
        }
        this.f4016L = java.lang.Math.max(i8, i6);
        android.graphics.drawable.Drawable drawable2 = this.f4033q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i9 = this.f4033q.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i10 = rect.left;
        int i11 = rect.right;
        android.graphics.drawable.Drawable drawable3 = this.f4028l;
        if (drawable3 != null) {
            android.graphics.Rect m3577b = p145j.AbstractC1623B.m3577b(drawable3);
            i10 = java.lang.Math.max(i10, m3577b.left);
            i11 = java.lang.Math.max(i11, m3577b.right);
        }
        int max = java.lang.Math.max(this.f4039w, (this.f4016L * 2) + i10 + i11);
        int max2 = java.lang.Math.max(i9, i7);
        this.f4014J = max;
        this.f4015K = max2;
        super.onMeasure(i4, i5);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        java.lang.CharSequence charSequence = isChecked() ? this.f4042z : this.f4005A;
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
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                java.lang.CharSequence charSequence = this.f4042z;
                if (charSequence == null) {
                    charSequence = getResources().getString(com.prology.R.string.abc_capital_on);
                }
                p011C.AbstractC0132x.m465e(this, charSequence);
            }
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.lang.CharSequence charSequence2 = this.f4005A;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(com.prology.R.string.abc_capital_off);
            }
            p011C.AbstractC0132x.m465e(this, charSequence2);
        }
        if (getWindowToken() != null) {
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            if (isLaidOut()) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, f4003a0, isChecked ? 1.0f : 0.0f);
                this.f4026V = ofFloat;
                ofFloat.setDuration(250L);
                this.f4026V.setAutoCancel(true);
                this.f4026V.start();
                return;
            }
        }
        android.animation.ObjectAnimator objectAnimator = this.f4026V;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p176p1.AbstractC1949a.m3914Q(callback, this));
    }

    public void setShowText(boolean z4) {
        if (this.f4006B != z4) {
            this.f4006B = z4;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z4) {
        this.f4041y = z4;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.f4039w = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.f4040x = i4;
        requestLayout();
    }

    public void setSwitchTypeface(android.graphics.Typeface typeface) {
        android.text.TextPaint textPaint = this.f4021Q;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(java.lang.CharSequence charSequence) {
        this.f4005A = charSequence;
        requestLayout();
        if (isChecked() || android.os.Build.VERSION.SDK_INT < 30) {
            return;
        }
        java.lang.CharSequence charSequence2 = this.f4005A;
        if (charSequence2 == null) {
            charSequence2 = getResources().getString(com.prology.R.string.abc_capital_off);
        }
        p011C.AbstractC0132x.m465e(this, charSequence2);
    }

    public void setTextOn(java.lang.CharSequence charSequence) {
        this.f4042z = charSequence;
        requestLayout();
        if (!isChecked() || android.os.Build.VERSION.SDK_INT < 30) {
            return;
        }
        java.lang.CharSequence charSequence2 = this.f4042z;
        if (charSequence2 == null) {
            charSequence2 = getResources().getString(com.prology.R.string.abc_capital_on);
        }
        p011C.AbstractC0132x.m465e(this, charSequence2);
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f4028l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4028l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f4) {
        this.f4013I = f4;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(p126f.AbstractC1367a.m3116a(getContext(), i4));
    }

    public void setThumbTextPadding(int i4) {
        this.f4038v = i4;
        requestLayout();
    }

    public void setThumbTintList(android.content.res.ColorStateList colorStateList) {
        this.f4029m = colorStateList;
        this.f4031o = true;
        m2310a();
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f4030n = mode;
        this.f4032p = true;
        m2310a();
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f4033q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4033q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(p126f.AbstractC1367a.m3116a(getContext(), i4));
    }

    public void setTrackTintList(android.content.res.ColorStateList colorStateList) {
        this.f4034r = colorStateList;
        this.f4036t = true;
        m2311b();
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f4035s = mode;
        this.f4037u = true;
        m2311b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4028l || drawable == this.f4033q;
    }
}
