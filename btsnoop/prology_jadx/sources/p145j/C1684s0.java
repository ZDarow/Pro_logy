package p145j;

/* renamed from: j.s0 */
/* loaded from: classes.dex */
public final class C1684s0 implements p145j.InterfaceC1622A {

    /* renamed from: a */
    public androidx.appcompat.widget.Toolbar f6998a;

    /* renamed from: b */
    public int f6999b;

    /* renamed from: c */
    public android.view.View f7000c;

    /* renamed from: d */
    public android.graphics.drawable.Drawable f7001d;

    /* renamed from: e */
    public android.graphics.drawable.Drawable f7002e;

    /* renamed from: f */
    public android.graphics.drawable.Drawable f7003f;

    /* renamed from: g */
    public boolean f7004g;

    /* renamed from: h */
    public java.lang.CharSequence f7005h;

    /* renamed from: i */
    public java.lang.CharSequence f7006i;

    /* renamed from: j */
    public java.lang.CharSequence f7007j;

    /* renamed from: k */
    public android.view.Window.Callback f7008k;

    /* renamed from: l */
    public int f7009l;

    /* renamed from: m */
    public android.graphics.drawable.Drawable f7010m;

    /* renamed from: a */
    public final void m3621a(int i4) {
        android.view.View view;
        int i5 = this.f6999b ^ i4;
        this.f6999b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    m3622b();
                }
                int i6 = this.f6999b & 4;
                androidx.appcompat.widget.Toolbar toolbar = this.f6998a;
                if (i6 != 0) {
                    android.graphics.drawable.Drawable drawable = this.f7003f;
                    if (drawable == null) {
                        drawable = this.f7010m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                m3623c();
            }
            int i7 = i5 & 8;
            androidx.appcompat.widget.Toolbar toolbar2 = this.f6998a;
            if (i7 != 0) {
                if ((i4 & 8) != 0) {
                    toolbar2.setTitle(this.f7005h);
                    toolbar2.setSubtitle(this.f7006i);
                } else {
                    toolbar2.setTitle((java.lang.CharSequence) null);
                    toolbar2.setSubtitle((java.lang.CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f7000c) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public final void m3622b() {
        if ((this.f6999b & 4) != 0) {
            boolean isEmpty = android.text.TextUtils.isEmpty(this.f7007j);
            androidx.appcompat.widget.Toolbar toolbar = this.f6998a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f7009l);
            } else {
                toolbar.setNavigationContentDescription(this.f7007j);
            }
        }
    }

    /* renamed from: c */
    public final void m3623c() {
        android.graphics.drawable.Drawable drawable;
        int i4 = this.f6999b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) != 0) {
            drawable = this.f7002e;
            if (drawable == null) {
                drawable = this.f7001d;
            }
        } else {
            drawable = this.f7001d;
        }
        this.f6998a.setLogo(drawable);
    }
}
