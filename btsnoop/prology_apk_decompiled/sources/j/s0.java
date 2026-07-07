package j;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class s0 implements A {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f6740a;

    /* renamed from: b, reason: collision with root package name */
    public int f6741b;

    /* renamed from: c, reason: collision with root package name */
    public View f6742c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f6743d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f6744e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f6745f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6746g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f6747h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f6748i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f6749j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f6750k;

    /* renamed from: l, reason: collision with root package name */
    public int f6751l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f6752m;

    public final void a(int i4) {
        View view;
        int i5 = this.f6741b ^ i4;
        this.f6741b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    b();
                }
                int i6 = this.f6741b & 4;
                Toolbar toolbar = this.f6740a;
                if (i6 != 0) {
                    Drawable drawable = this.f6745f;
                    if (drawable == null) {
                        drawable = this.f6752m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            int i7 = i5 & 8;
            Toolbar toolbar2 = this.f6740a;
            if (i7 != 0) {
                if ((i4 & 8) != 0) {
                    toolbar2.setTitle(this.f6747h);
                    toolbar2.setSubtitle(this.f6748i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f6742c) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f6741b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f6749j);
            Toolbar toolbar = this.f6740a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f6751l);
            } else {
                toolbar.setNavigationContentDescription(this.f6749j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i4 = this.f6741b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) != 0) {
            drawable = this.f6744e;
            if (drawable == null) {
                drawable = this.f6743d;
            }
        } else {
            drawable = this.f6743d;
        }
        this.f6740a.setLogo(drawable);
    }
}
