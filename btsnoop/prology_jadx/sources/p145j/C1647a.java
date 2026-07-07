package p145j;

/* renamed from: j.a */
/* loaded from: classes.dex */
public final class C1647a extends android.graphics.drawable.Drawable {

    /* renamed from: a */
    public final androidx.appcompat.widget.ActionBarContainer f6892a;

    public C1647a(androidx.appcompat.widget.ActionBarContainer actionBarContainer) {
        this.f6892a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f6892a;
        if (actionBarContainer.f3899r) {
            android.graphics.drawable.Drawable drawable = actionBarContainer.f3898q;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = actionBarContainer.f3896o;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.graphics.drawable.Drawable drawable3 = actionBarContainer.f3897p;
        if (drawable3 == null || !actionBarContainer.f3900s) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f6892a;
        if (actionBarContainer.f3899r) {
            android.graphics.drawable.Drawable drawable = actionBarContainer.f3898q;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = actionBarContainer.f3896o;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
