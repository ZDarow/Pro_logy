package j;

import B2.AbstractC0007h;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import f.AbstractC0266a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p1.AbstractC0462a;
import u.AbstractC0575c;
import u.AbstractC0579g;

/* renamed from: j.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0365u extends TextView implements F.c {

    /* renamed from: l, reason: collision with root package name */
    public final C0359n f6767l;

    /* renamed from: m, reason: collision with root package name */
    public final C0364t f6768m;

    /* renamed from: n, reason: collision with root package name */
    public final Y.x f6769n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6770o;

    /* renamed from: p, reason: collision with root package name */
    public Future f6771p;

    public C0365u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void d() {
        Future future = this.f6771p;
        if (future == null) {
            return;
        }
        try {
            this.f6771p = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0462a.y(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0359n c0359n = this.f6767l;
        if (c0359n != null) {
            c0359n.a();
        }
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            c0364t.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (F.c.f545a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            return Math.round(c0364t.f6761i.f6778e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (F.c.f545a) {
            return super.getAutoSizeMinTextSize();
        }
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            return Math.round(c0364t.f6761i.f6777d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (F.c.f545a) {
            return super.getAutoSizeStepGranularity();
        }
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            return Math.round(c0364t.f6761i.f6776c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (F.c.f545a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0364t c0364t = this.f6768m;
        return c0364t != null ? c0364t.f6761i.f6779f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (F.c.f545a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            return c0364t.f6761i.f6774a;
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

    public ColorStateList getSupportBackgroundTintList() {
        l0 l0Var;
        C0359n c0359n = this.f6767l;
        if (c0359n == null || (l0Var = (l0) c0359n.f6719e) == null) {
            return null;
        }
        return (ColorStateList) l0Var.f6710c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l0 l0Var;
        C0359n c0359n = this.f6767l;
        if (c0359n == null || (l0Var = (l0) c0359n.f6719e) == null) {
            return null;
        }
        return (PorterDuff.Mode) l0Var.f6711d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        l0 l0Var = this.f6768m.f6760h;
        if (l0Var != null) {
            return (ColorStateList) l0Var.f6710c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        l0 l0Var = this.f6768m.f6760h;
        if (l0Var != null) {
            return (PorterDuff.Mode) l0Var.f6711d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        Y.x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f6769n) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) xVar.f3066n;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0365u) xVar.f3065m).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public A.b getTextMetricsParamsCompat() {
        return AbstractC0462a.y(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6768m.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i4 >= 30) {
                D.d.c(editorInfo, text);
            } else {
                text.getClass();
                if (i4 >= 30) {
                    D.d.c(editorInfo, text);
                } else {
                    int i5 = editorInfo.initialSelStart;
                    int i6 = editorInfo.initialSelEnd;
                    int i7 = i5 > i6 ? i6 : i5;
                    if (i5 <= i6) {
                        i5 = i6;
                    }
                    int length = text.length();
                    if (i7 < 0 || i5 > length) {
                        U1.a.D(editorInfo, null, 0, 0);
                    } else {
                        int i8 = editorInfo.inputType & 4095;
                        if (i8 == 129 || i8 == 225 || i8 == 18) {
                            U1.a.D(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            U1.a.D(editorInfo, text, i7, i5);
                        } else {
                            int i9 = i5 - i7;
                            int i10 = i9 > 1024 ? 0 : i9;
                            int i11 = 2048 - i10;
                            int min = Math.min(text.length() - i5, i11 - Math.min(i7, (int) (i11 * 0.8d)));
                            int min2 = Math.min(i7, i11 - min);
                            int i12 = i7 - min2;
                            if (Character.isLowSurrogate(text.charAt(i12))) {
                                i12++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i5 + min) - 1))) {
                                min--;
                            }
                            int i13 = min2 + i10;
                            U1.a.D(editorInfo, i10 != i9 ? TextUtils.concat(text.subSequence(i12, i12 + min2), text.subSequence(i5, min + i5)) : text.subSequence(i12, i13 + min + i12), min2, i13);
                        }
                    }
                }
            }
        }
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        C0364t c0364t = this.f6768m;
        if (c0364t == null || F.c.f545a) {
            return;
        }
        c0364t.f6761i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        d();
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        C0364t c0364t = this.f6768m;
        if (c0364t == null || F.c.f545a) {
            return;
        }
        C0369y c0369y = c0364t.f6761i;
        if (c0369y.f6774a != 0) {
            c0369y.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (F.c.f545a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            C0369y c0369y = c0364t.f6761i;
            DisplayMetrics displayMetrics = c0369y.f6783j.getResources().getDisplayMetrics();
            c0369y.i(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (c0369y.g()) {
                c0369y.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (F.c.f545a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            C0369y c0369y = c0364t.f6761i;
            c0369y.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0369y.f6783j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                c0369y.f6779f = C0369y.b(iArr2);
                if (!c0369y.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0369y.f6780g = false;
            }
            if (c0369y.g()) {
                c0369y.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (F.c.f545a) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            C0369y c0369y = c0364t.f6761i;
            if (i4 == 0) {
                c0369y.f6774a = 0;
                c0369y.f6777d = -1.0f;
                c0369y.f6778e = -1.0f;
                c0369y.f6776c = -1.0f;
                c0369y.f6779f = new int[0];
                c0369y.f6775b = false;
                return;
            }
            if (i4 != 1) {
                c0369y.getClass();
                throw new IllegalArgumentException(AbstractC0007h.k("Unknown auto-size text type: ", i4));
            }
            DisplayMetrics displayMetrics = c0369y.f6783j.getResources().getDisplayMetrics();
            c0369y.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0369y.g()) {
                c0369y.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0359n c0359n = this.f6767l;
        if (c0359n != null) {
            c0359n.f6715a = -1;
            c0359n.d(null);
            c0359n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0359n c0359n = this.f6767l;
        if (c0359n != null) {
            c0359n.c(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            c0364t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            c0364t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            c0364t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            c0364t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0462a.Q(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i4);
        } else {
            AbstractC0462a.M(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i4);
        } else {
            AbstractC0462a.N(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (i4 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(A.c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0462a.y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0359n c0359n = this.f6767l;
        if (c0359n != null) {
            c0359n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0359n c0359n = this.f6767l;
        if (c0359n != null) {
            c0359n.f(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j.l0, java.lang.Object] */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0364t c0364t = this.f6768m;
        if (c0364t.f6760h == null) {
            c0364t.f6760h = new Object();
        }
        l0 l0Var = c0364t.f6760h;
        l0Var.f6710c = colorStateList;
        l0Var.f6709b = colorStateList != null;
        c0364t.f6754b = l0Var;
        c0364t.f6755c = l0Var;
        c0364t.f6756d = l0Var;
        c0364t.f6757e = l0Var;
        c0364t.f6758f = l0Var;
        c0364t.f6759g = l0Var;
        c0364t.b();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j.l0, java.lang.Object] */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0364t c0364t = this.f6768m;
        if (c0364t.f6760h == null) {
            c0364t.f6760h = new Object();
        }
        l0 l0Var = c0364t.f6760h;
        l0Var.f6711d = mode;
        l0Var.f6708a = mode != null;
        c0364t.f6754b = l0Var;
        c0364t.f6755c = l0Var;
        c0364t.f6756d = l0Var;
        c0364t.f6757e = l0Var;
        c0364t.f6758f = l0Var;
        c0364t.f6759g = l0Var;
        c0364t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            c0364t.e(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        Y.x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f6769n) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.f3066n = textClassifier;
        }
    }

    public void setTextFuture(Future<A.c> future) {
        this.f6771p = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(A.b bVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bVar.f1b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i4 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i4 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i4 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i4 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i4 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i4 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i4 = 7;
            }
        }
        setTextDirection(i4);
        getPaint().set(bVar.f0a);
        setBreakStrategy(bVar.f2c);
        setHyphenationFrequency(bVar.f3d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f4) {
        boolean z4 = F.c.f545a;
        if (z4) {
            super.setTextSize(i4, f4);
            return;
        }
        C0364t c0364t = this.f6768m;
        if (c0364t == null || z4) {
            return;
        }
        C0369y c0369y = c0364t.f6761i;
        if (c0369y.f6774a != 0) {
            return;
        }
        c0369y.f(f4, i4);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i4) {
        Typeface typeface2;
        if (this.f6770o) {
            return;
        }
        if (typeface == null || i4 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC0579g abstractC0579g = AbstractC0575c.f8476a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i4);
        }
        this.f6770o = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.f6770o = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0365u(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        k0.a(context);
        this.f6770o = false;
        j0.a(this, getContext());
        C0359n c0359n = new C0359n(this);
        this.f6767l = c0359n;
        c0359n.b(attributeSet, i4);
        C0364t c0364t = new C0364t(this);
        this.f6768m = c0364t;
        c0364t.d(attributeSet, i4);
        c0364t.b();
        Y.x xVar = new Y.x((char) 0, 16);
        xVar.f3065m = this;
        this.f6769n = xVar;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? AbstractC0266a.a(context, i4) : null, i5 != 0 ? AbstractC0266a.a(context, i5) : null, i6 != 0 ? AbstractC0266a.a(context, i6) : null, i7 != 0 ? AbstractC0266a.a(context, i7) : null);
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            c0364t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? AbstractC0266a.a(context, i4) : null, i5 != 0 ? AbstractC0266a.a(context, i5) : null, i6 != 0 ? AbstractC0266a.a(context, i6) : null, i7 != 0 ? AbstractC0266a.a(context, i7) : null);
        C0364t c0364t = this.f6768m;
        if (c0364t != null) {
            c0364t.b();
        }
    }
}
