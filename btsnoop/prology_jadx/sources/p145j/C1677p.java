package p145j;

/* renamed from: j.p */
/* loaded from: classes.dex */
public final class C1677p extends android.widget.ImageButton {

    /* renamed from: l */
    public final p145j.C1673n f6987l;

    /* renamed from: m */
    public final p094Y.C0886x f6988m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677p(android.content.Context context) {
        super(context, null, com.prology.R.attr.toolbarNavigationButtonStyle);
        p145j.AbstractC1668k0.m3610a(context);
        p145j.AbstractC1666j0.m3606a(this, getContext());
        p145j.C1673n c1673n = new p145j.C1673n(this);
        this.f6987l = c1673n;
        c1673n.m3613b(null, com.prology.R.attr.toolbarNavigationButtonStyle);
        p094Y.C0886x c0886x = new p094Y.C0886x(15, this);
        this.f6988m = c0886x;
        c0886x.m1716T(com.prology.R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p145j.C1673n c1673n = this.f6987l;
        if (c1673n != null) {
            c1673n.m3612a();
        }
        p094Y.C0886x c0886x = this.f6988m;
        if (c0886x != null) {
            c0886x.m1709M();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        p145j.C1670l0 c1670l0;
        p145j.C1673n c1673n = this.f6987l;
        if (c1673n == null || (c1670l0 = (p145j.C1670l0) c1673n.f6977e) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) c1670l0.f6968c;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        p145j.C1670l0 c1670l0;
        p145j.C1673n c1673n = this.f6987l;
        if (c1673n == null || (c1670l0 = (p145j.C1670l0) c1673n.f6977e) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) c1670l0.f6969d;
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
        p145j.C1670l0 c1670l0;
        p094Y.C0886x c0886x = this.f6988m;
        if (c0886x == null || (c1670l0 = (p145j.C1670l0) c0886x.f3176n) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) c1670l0.f6968c;
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
        p145j.C1670l0 c1670l0;
        p094Y.C0886x c0886x = this.f6988m;
        if (c0886x == null || (c1670l0 = (p145j.C1670l0) c0886x.f3176n) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) c1670l0.f6969d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((android.widget.ImageView) this.f6988m.f3175m).getBackground() instanceof android.graphics.drawable.RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p145j.C1673n c1673n = this.f6987l;
        if (c1673n != null) {
            c1673n.f6973a = -1;
            c1673n.m3615d(null);
            c1673n.m3612a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        p145j.C1673n c1673n = this.f6987l;
        if (c1673n != null) {
            c1673n.m3614c(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p094Y.C0886x c0886x = this.f6988m;
        if (c0886x != null) {
            c0886x.m1709M();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        p094Y.C0886x c0886x = this.f6988m;
        if (c0886x != null) {
            c0886x.m1709M();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        p094Y.C0886x c0886x = this.f6988m;
        android.widget.ImageView imageView = (android.widget.ImageView) c0886x.f3175m;
        if (i4 != 0) {
            android.graphics.drawable.Drawable m3116a = p126f.AbstractC1367a.m3116a(imageView.getContext(), i4);
            if (m3116a != null) {
                android.graphics.Rect rect = p145j.AbstractC1623B.f6800a;
            }
            imageView.setImageDrawable(m3116a);
        } else {
            imageView.setImageDrawable(null);
        }
        c0886x.m1709M();
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        p094Y.C0886x c0886x = this.f6988m;
        if (c0886x != null) {
            c0886x.m1709M();
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        p145j.C1673n c1673n = this.f6987l;
        if (c1673n != null) {
            c1673n.m3616e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        p145j.C1673n c1673n = this.f6987l;
        if (c1673n != null) {
            c1673n.m3617f(mode);
        }
    }

    public void setSupportImageTintList(android.content.res.ColorStateList colorStateList) {
        p094Y.C0886x c0886x = this.f6988m;
        if (c0886x != null) {
            if (((p145j.C1670l0) c0886x.f3176n) == null) {
                c0886x.f3176n = new java.lang.Object();
            }
            p145j.C1670l0 c1670l0 = (p145j.C1670l0) c0886x.f3176n;
            c1670l0.f6968c = colorStateList;
            c1670l0.f6967b = true;
            c0886x.m1709M();
        }
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode) {
        p094Y.C0886x c0886x = this.f6988m;
        if (c0886x != null) {
            if (((p145j.C1670l0) c0886x.f3176n) == null) {
                c0886x.f3176n = new java.lang.Object();
            }
            p145j.C1670l0 c1670l0 = (p145j.C1670l0) c0886x.f3176n;
            c1670l0.f6969d = mode;
            c1670l0.f6966a = true;
            c0886x.m1709M();
        }
    }
}
