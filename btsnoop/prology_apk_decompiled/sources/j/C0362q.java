package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;
import f.AbstractC0266a;

/* renamed from: j.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0362q extends ImageView {

    /* renamed from: l, reason: collision with root package name */
    public final C0359n f6733l;

    /* renamed from: m, reason: collision with root package name */
    public final Y.x f6734m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0362q(Context context, int i4) {
        super(context, null, i4);
        k0.a(context);
        j0.a(this, getContext());
        C0359n c0359n = new C0359n(this);
        this.f6733l = c0359n;
        c0359n.b(null, i4);
        Y.x xVar = new Y.x(15, this);
        this.f6734m = xVar;
        xVar.T(i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0359n c0359n = this.f6733l;
        if (c0359n != null) {
            c0359n.a();
        }
        Y.x xVar = this.f6734m;
        if (xVar != null) {
            xVar.M();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        l0 l0Var;
        C0359n c0359n = this.f6733l;
        if (c0359n == null || (l0Var = (l0) c0359n.f6719e) == null) {
            return null;
        }
        return (ColorStateList) l0Var.f6710c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l0 l0Var;
        C0359n c0359n = this.f6733l;
        if (c0359n == null || (l0Var = (l0) c0359n.f6719e) == null) {
            return null;
        }
        return (PorterDuff.Mode) l0Var.f6711d;
    }

    public ColorStateList getSupportImageTintList() {
        l0 l0Var;
        Y.x xVar = this.f6734m;
        if (xVar == null || (l0Var = (l0) xVar.f3066n) == null) {
            return null;
        }
        return (ColorStateList) l0Var.f6710c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        l0 l0Var;
        Y.x xVar = this.f6734m;
        if (xVar == null || (l0Var = (l0) xVar.f3066n) == null) {
            return null;
        }
        return (PorterDuff.Mode) l0Var.f6711d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f6734m.f3065m).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0359n c0359n = this.f6733l;
        if (c0359n != null) {
            c0359n.f6715a = -1;
            c0359n.d(null);
            c0359n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0359n c0359n = this.f6733l;
        if (c0359n != null) {
            c0359n.c(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        Y.x xVar = this.f6734m;
        if (xVar != null) {
            xVar.M();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        Y.x xVar = this.f6734m;
        if (xVar != null) {
            xVar.M();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        Y.x xVar = this.f6734m;
        if (xVar != null) {
            ImageView imageView = (ImageView) xVar.f3065m;
            if (i4 != 0) {
                Drawable a4 = AbstractC0266a.a(imageView.getContext(), i4);
                if (a4 != null) {
                    Rect rect = B.f6553a;
                }
                imageView.setImageDrawable(a4);
            } else {
                imageView.setImageDrawable(null);
            }
            xVar.M();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        Y.x xVar = this.f6734m;
        if (xVar != null) {
            xVar.M();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0359n c0359n = this.f6733l;
        if (c0359n != null) {
            c0359n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0359n c0359n = this.f6733l;
        if (c0359n != null) {
            c0359n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        Y.x xVar = this.f6734m;
        if (xVar != null) {
            if (((l0) xVar.f3066n) == null) {
                xVar.f3066n = new Object();
            }
            l0 l0Var = (l0) xVar.f3066n;
            l0Var.f6710c = colorStateList;
            l0Var.f6709b = true;
            xVar.M();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        Y.x xVar = this.f6734m;
        if (xVar != null) {
            if (((l0) xVar.f3066n) == null) {
                xVar.f3066n = new Object();
            }
            l0 l0Var = (l0) xVar.f3066n;
            l0Var.f6711d = mode;
            l0Var.f6708a = true;
            xVar.M();
        }
    }
}
