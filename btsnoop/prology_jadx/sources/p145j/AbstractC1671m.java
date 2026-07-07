package p145j;

/* renamed from: j.m */
/* loaded from: classes.dex */
public abstract class AbstractC1671m extends android.widget.AutoCompleteTextView {

    /* renamed from: n */
    public static final int[] f6970n = {android.R.attr.popupBackground};

    /* renamed from: l */
    public final p145j.C1673n f6971l;

    /* renamed from: m */
    public final p145j.C1685t f6972m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1671m(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.prology.R.attr.autoCompleteTextViewStyle);
        p145j.AbstractC1668k0.m3610a(context);
        p145j.AbstractC1666j0.m3606a(this, getContext());
        android.support.v4.media.session.C1061t m2202q0 = android.support.v4.media.session.C1061t.m2202q0(getContext(), attributeSet, f6970n, com.prology.R.attr.autoCompleteTextViewStyle);
        if (((android.content.res.TypedArray) m2202q0.f3862n).hasValue(0)) {
            setDropDownBackgroundDrawable(m2202q0.m2225g0(0));
        }
        m2202q0.m2243u0();
        p145j.C1673n c1673n = new p145j.C1673n(this);
        this.f6971l = c1673n;
        c1673n.m3613b(attributeSet, com.prology.R.attr.autoCompleteTextViewStyle);
        p145j.C1685t c1685t = new p145j.C1685t(this);
        this.f6972m = c1685t;
        c1685t.m3627d(attributeSet, com.prology.R.attr.autoCompleteTextViewStyle);
        c1685t.m3626b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p145j.C1673n c1673n = this.f6971l;
        if (c1673n != null) {
            c1673n.m3612a();
        }
        p145j.C1685t c1685t = this.f6972m;
        if (c1685t != null) {
            c1685t.m3626b();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        p145j.C1670l0 c1670l0;
        p145j.C1673n c1673n = this.f6971l;
        if (c1673n == null || (c1670l0 = (p145j.C1670l0) c1673n.f6977e) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) c1670l0.f6968c;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        p145j.C1670l0 c1670l0;
        p145j.C1673n c1673n = this.f6971l;
        if (c1673n == null || (c1670l0 = (p145j.C1670l0) c1673n.f6977e) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) c1670l0.f6969d;
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p145j.C1673n c1673n = this.f6971l;
        if (c1673n != null) {
            c1673n.f6973a = -1;
            c1673n.m3615d(null);
            c1673n.m3612a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        p145j.C1673n c1673n = this.f6971l;
        if (c1673n != null) {
            c1673n.m3614c(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p176p1.AbstractC1949a.m3914Q(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(p126f.AbstractC1367a.m3116a(getContext(), i4));
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        p145j.C1673n c1673n = this.f6971l;
        if (c1673n != null) {
            c1673n.m3616e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        p145j.C1673n c1673n = this.f6971l;
        if (c1673n != null) {
            c1673n.m3617f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i4) {
        super.setTextAppearance(context, i4);
        p145j.C1685t c1685t = this.f6972m;
        if (c1685t != null) {
            c1685t.m3628e(context, i4);
        }
    }
}
