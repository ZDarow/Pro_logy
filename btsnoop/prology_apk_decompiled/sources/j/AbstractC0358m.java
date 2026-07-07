package j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import f.AbstractC0266a;
import p1.AbstractC0462a;

/* renamed from: j.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0358m extends AutoCompleteTextView {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f6712n = {R.attr.popupBackground};

    /* renamed from: l, reason: collision with root package name */
    public final C0359n f6713l;

    /* renamed from: m, reason: collision with root package name */
    public final C0364t f6714m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0358m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.prology.R.attr.autoCompleteTextViewStyle);
        k0.a(context);
        j0.a(this, getContext());
        android.support.v4.media.session.t q02 = android.support.v4.media.session.t.q0(getContext(), attributeSet, f6712n, com.prology.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) q02.f3735n).hasValue(0)) {
            setDropDownBackgroundDrawable(q02.g0(0));
        }
        q02.u0();
        C0359n c0359n = new C0359n(this);
        this.f6713l = c0359n;
        c0359n.b(attributeSet, com.prology.R.attr.autoCompleteTextViewStyle);
        C0364t c0364t = new C0364t(this);
        this.f6714m = c0364t;
        c0364t.d(attributeSet, com.prology.R.attr.autoCompleteTextViewStyle);
        c0364t.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0359n c0359n = this.f6713l;
        if (c0359n != null) {
            c0359n.a();
        }
        C0364t c0364t = this.f6714m;
        if (c0364t != null) {
            c0364t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        l0 l0Var;
        C0359n c0359n = this.f6713l;
        if (c0359n == null || (l0Var = (l0) c0359n.f6719e) == null) {
            return null;
        }
        return (ColorStateList) l0Var.f6710c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l0 l0Var;
        C0359n c0359n = this.f6713l;
        if (c0359n == null || (l0Var = (l0) c0359n.f6719e) == null) {
            return null;
        }
        return (PorterDuff.Mode) l0Var.f6711d;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0359n c0359n = this.f6713l;
        if (c0359n != null) {
            c0359n.f6715a = -1;
            c0359n.d(null);
            c0359n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0359n c0359n = this.f6713l;
        if (c0359n != null) {
            c0359n.c(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0462a.Q(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(AbstractC0266a.a(getContext(), i4));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0359n c0359n = this.f6713l;
        if (c0359n != null) {
            c0359n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0359n c0359n = this.f6713l;
        if (c0359n != null) {
            c0359n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0364t c0364t = this.f6714m;
        if (c0364t != null) {
            c0364t.e(context, i4);
        }
    }
}
