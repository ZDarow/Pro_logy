package p145j;

/* renamed from: j.u */
/* loaded from: classes.dex */
public class C1687u extends android.widget.TextView implements p024F.InterfaceC0200c {

    /* renamed from: l */
    public final p145j.C1673n f7025l;

    /* renamed from: m */
    public final p145j.C1685t f7026m;

    /* renamed from: n */
    public final p094Y.C0886x f7027n;

    /* renamed from: o */
    public boolean f7028o;

    /* renamed from: p */
    public java.util.concurrent.Future f7029p;

    public C1687u(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    /* renamed from: d */
    public final void m3630d() {
        java.util.concurrent.Future future = this.f7029p;
        if (future == null) {
            return;
        }
        try {
            this.f7029p = null;
            if (future.get() != null) {
                throw new java.lang.ClassCastException();
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            p176p1.AbstractC1949a.m3946y(this);
            throw null;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p145j.C1673n c1673n = this.f7025l;
        if (c1673n != null) {
            c1673n.m3612a();
        }
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            c1685t.m3626b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p024F.InterfaceC0200c.f555a) {
            return super.getAutoSizeMaxTextSize();
        }
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            return java.lang.Math.round(c1685t.f7019i.f7036e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p024F.InterfaceC0200c.f555a) {
            return super.getAutoSizeMinTextSize();
        }
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            return java.lang.Math.round(c1685t.f7019i.f7035d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p024F.InterfaceC0200c.f555a) {
            return super.getAutoSizeStepGranularity();
        }
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            return java.lang.Math.round(c1685t.f7019i.f7034c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p024F.InterfaceC0200c.f555a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p145j.C1685t c1685t = this.f7026m;
        return c1685t != null ? c1685t.f7019i.f7037f : new int[0];
    }

    @Override // android.widget.TextView
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (p024F.InterfaceC0200c.f555a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            return c1685t.f7019i.f7032a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        p145j.C1670l0 c1670l0;
        p145j.C1673n c1673n = this.f7025l;
        if (c1673n == null || (c1670l0 = (p145j.C1670l0) c1673n.f6977e) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) c1670l0.f6968c;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        p145j.C1670l0 c1670l0;
        p145j.C1673n c1673n = this.f7025l;
        if (c1673n == null || (c1670l0 = (p145j.C1670l0) c1673n.f6977e) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) c1670l0.f6969d;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        p145j.C1670l0 c1670l0 = this.f7026m.f7018h;
        if (c1670l0 != null) {
            return (android.content.res.ColorStateList) c1670l0.f6968c;
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        p145j.C1670l0 c1670l0 = this.f7026m.f7018h;
        if (c1670l0 != null) {
            return (android.graphics.PorterDuff.Mode) c1670l0.f6969d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        m3630d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        p094Y.C0886x c0886x;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (c0886x = this.f7027n) == null) {
            return super.getTextClassifier();
        }
        android.view.textclassifier.TextClassifier textClassifier = (android.view.textclassifier.TextClassifier) c0886x.f3176n;
        if (textClassifier != null) {
            return textClassifier;
        }
        android.view.textclassifier.TextClassificationManager textClassificationManager = (android.view.textclassifier.TextClassificationManager) ((p145j.C1687u) c0886x.f3175m).getContext().getSystemService(android.view.textclassifier.TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : android.view.textclassifier.TextClassifier.NO_OP;
    }

    public p001A.C0001b getTextMetricsParamsCompat() {
        return p176p1.AbstractC1949a.m3946y(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f7026m.getClass();
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 < 30 && onCreateInputConnection != null) {
            java.lang.CharSequence text = getText();
            if (i4 >= 30) {
                p015D.AbstractC0155d.m516c(editorInfo, text);
            } else {
                text.getClass();
                if (i4 >= 30) {
                    p015D.AbstractC0155d.m516c(editorInfo, text);
                } else {
                    int i5 = editorInfo.initialSelStart;
                    int i6 = editorInfo.initialSelEnd;
                    int i7 = i5 > i6 ? i6 : i5;
                    if (i5 <= i6) {
                        i5 = i6;
                    }
                    int length = text.length();
                    if (i7 < 0 || i5 > length) {
                        p080U1.AbstractC0748a.m1356D(editorInfo, null, 0, 0);
                    } else {
                        int i8 = editorInfo.inputType & 4095;
                        if (i8 == 129 || i8 == 225 || i8 == 18) {
                            p080U1.AbstractC0748a.m1356D(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            p080U1.AbstractC0748a.m1356D(editorInfo, text, i7, i5);
                        } else {
                            int i9 = i5 - i7;
                            int i10 = i9 > 1024 ? 0 : i9;
                            int i11 = 2048 - i10;
                            int min = java.lang.Math.min(text.length() - i5, i11 - java.lang.Math.min(i7, (int) (i11 * 0.8d)));
                            int min2 = java.lang.Math.min(i7, i11 - min);
                            int i12 = i7 - min2;
                            if (java.lang.Character.isLowSurrogate(text.charAt(i12))) {
                                i12++;
                                min2--;
                            }
                            if (java.lang.Character.isHighSurrogate(text.charAt((i5 + min) - 1))) {
                                min--;
                            }
                            int i13 = min2 + i10;
                            p080U1.AbstractC0748a.m1356D(editorInfo, i10 != i9 ? android.text.TextUtils.concat(text.subSequence(i12, i12 + min2), text.subSequence(i5, min + i5)) : text.subSequence(i12, i13 + min + i12), min2, i13);
                        }
                    }
                }
            }
        }
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t == null || p024F.InterfaceC0200c.f555a) {
            return;
        }
        c1685t.f7019i.m3637a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        m3630d();
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t == null || p024F.InterfaceC0200c.f555a) {
            return;
        }
        p145j.C1693y c1693y = c1685t.f7019i;
        if (c1693y.f7032a != 0) {
            c1693y.m3637a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (p024F.InterfaceC0200c.f555a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            p145j.C1693y c1693y = c1685t.f7019i;
            android.util.DisplayMetrics displayMetrics = c1693y.f7041j.getResources().getDisplayMetrics();
            c1693y.m3642i(android.util.TypedValue.applyDimension(i7, i4, displayMetrics), android.util.TypedValue.applyDimension(i7, i5, displayMetrics), android.util.TypedValue.applyDimension(i7, i6, displayMetrics));
            if (c1693y.m3640g()) {
                c1693y.m3637a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (p024F.InterfaceC0200c.f555a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            p145j.C1693y c1693y = c1685t.f7019i;
            c1693y.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = java.util.Arrays.copyOf(iArr, length);
                } else {
                    android.util.DisplayMetrics displayMetrics = c1693y.f7041j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = java.lang.Math.round(android.util.TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                c1693y.f7037f = p145j.C1693y.m3634b(iArr2);
                if (!c1693y.m3641h()) {
                    throw new java.lang.IllegalArgumentException("None of the preset sizes is valid: " + java.util.Arrays.toString(iArr));
                }
            } else {
                c1693y.f7038g = false;
            }
            if (c1693y.m3640g()) {
                c1693y.m3637a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (p024F.InterfaceC0200c.f555a) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            p145j.C1693y c1693y = c1685t.f7019i;
            if (i4 == 0) {
                c1693y.f7032a = 0;
                c1693y.f7035d = -1.0f;
                c1693y.f7036e = -1.0f;
                c1693y.f7034c = -1.0f;
                c1693y.f7037f = new int[0];
                c1693y.f7033b = false;
                return;
            }
            if (i4 != 1) {
                c1693y.getClass();
                throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Unknown auto-size text type: ", i4));
            }
            android.util.DisplayMetrics displayMetrics = c1693y.f7041j.getResources().getDisplayMetrics();
            c1693y.m3642i(android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics), android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1693y.m3640g()) {
                c1693y.m3637a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p145j.C1673n c1673n = this.f7025l;
        if (c1673n != null) {
            c1673n.f6973a = -1;
            c1673n.m3615d(null);
            c1673n.m3612a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        p145j.C1673n c1673n = this.f7025l;
        if (c1673n != null) {
            c1673n.m3614c(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            c1685t.m3626b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            c1685t.m3626b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            c1685t.m3626b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            c1685t.m3626b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p176p1.AbstractC1949a.m3914Q(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i4);
        } else {
            p176p1.AbstractC1949a.m3910M(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i4);
        } else {
            p176p1.AbstractC1949a.m3911N(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i4 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(p001A.AbstractC0002c abstractC0002c) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        p176p1.AbstractC1949a.m3946y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        p145j.C1673n c1673n = this.f7025l;
        if (c1673n != null) {
            c1673n.m3616e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        p145j.C1673n c1673n = this.f7025l;
        if (c1673n != null) {
            c1673n.m3617f(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j.l0, java.lang.Object] */
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t.f7018h == null) {
            c1685t.f7018h = new java.lang.Object();
        }
        p145j.C1670l0 c1670l0 = c1685t.f7018h;
        c1670l0.f6968c = colorStateList;
        c1670l0.f6967b = colorStateList != null;
        c1685t.f7012b = c1670l0;
        c1685t.f7013c = c1670l0;
        c1685t.f7014d = c1670l0;
        c1685t.f7015e = c1670l0;
        c1685t.f7016f = c1670l0;
        c1685t.f7017g = c1670l0;
        c1685t.m3626b();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j.l0, java.lang.Object] */
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t.f7018h == null) {
            c1685t.f7018h = new java.lang.Object();
        }
        p145j.C1670l0 c1670l0 = c1685t.f7018h;
        c1670l0.f6969d = mode;
        c1670l0.f6966a = mode != null;
        c1685t.f7012b = c1670l0;
        c1685t.f7013c = c1670l0;
        c1685t.f7014d = c1670l0;
        c1685t.f7015e = c1670l0;
        c1685t.f7016f = c1670l0;
        c1685t.f7017g = c1670l0;
        c1685t.m3626b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i4) {
        super.setTextAppearance(context, i4);
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            c1685t.m3628e(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        p094Y.C0886x c0886x;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (c0886x = this.f7027n) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0886x.f3176n = textClassifier;
        }
    }

    public void setTextFuture(java.util.concurrent.Future<p001A.AbstractC0002c> future) {
        this.f7029p = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(p001A.C0001b c0001b) {
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        android.text.TextDirectionHeuristic textDirectionHeuristic2 = c0001b.f1b;
        android.text.TextDirectionHeuristic textDirectionHeuristic3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i4 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.ANYRTL_LTR) {
                i4 = 2;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.LTR) {
                i4 = 3;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.RTL) {
                i4 = 4;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.LOCALE) {
                i4 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i4 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i4 = 7;
            }
        }
        setTextDirection(i4);
        getPaint().set(c0001b.f0a);
        setBreakStrategy(c0001b.f2c);
        setHyphenationFrequency(c0001b.f3d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f4) {
        boolean z4 = p024F.InterfaceC0200c.f555a;
        if (z4) {
            super.setTextSize(i4, f4);
            return;
        }
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t == null || z4) {
            return;
        }
        p145j.C1693y c1693y = c1685t.f7019i;
        if (c1693y.f7032a != 0) {
            return;
        }
        c1693y.m3639f(f4, i4);
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface, int i4) {
        android.graphics.Typeface typeface2;
        if (this.f7028o) {
            return;
        }
        if (typeface == null || i4 <= 0) {
            typeface2 = null;
        } else {
            android.content.Context context = getContext();
            p196u.AbstractC2212g abstractC2212g = p196u.AbstractC2208c.f8814a;
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context cannot be null");
            }
            typeface2 = android.graphics.Typeface.create(typeface, i4);
        }
        this.f7028o = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.f7028o = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687u(android.content.Context context, android.util.AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        p145j.AbstractC1668k0.m3610a(context);
        this.f7028o = false;
        p145j.AbstractC1666j0.m3606a(this, getContext());
        p145j.C1673n c1673n = new p145j.C1673n(this);
        this.f7025l = c1673n;
        c1673n.m3613b(attributeSet, i4);
        p145j.C1685t c1685t = new p145j.C1685t(this);
        this.f7026m = c1685t;
        c1685t.m3627d(attributeSet, i4);
        c1685t.m3626b();
        p094Y.C0886x c0886x = new p094Y.C0886x((char) 0, 16);
        c0886x.f3175m = this;
        this.f7027n = c0886x;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        android.content.Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? p126f.AbstractC1367a.m3116a(context, i4) : null, i5 != 0 ? p126f.AbstractC1367a.m3116a(context, i5) : null, i6 != 0 ? p126f.AbstractC1367a.m3116a(context, i6) : null, i7 != 0 ? p126f.AbstractC1367a.m3116a(context, i7) : null);
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            c1685t.m3626b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        android.content.Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? p126f.AbstractC1367a.m3116a(context, i4) : null, i5 != 0 ? p126f.AbstractC1367a.m3116a(context, i5) : null, i6 != 0 ? p126f.AbstractC1367a.m3116a(context, i6) : null, i7 != 0 ? p126f.AbstractC1367a.m3116a(context, i7) : null);
        p145j.C1685t c1685t = this.f7026m;
        if (c1685t != null) {
            c1685t.m3626b();
        }
    }
}
