package C;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;
import u.C0574b;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: b, reason: collision with root package name */
    public static final O f295b;

    /* renamed from: a, reason: collision with root package name */
    public final K f296a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            f295b = J.s;
        } else if (i4 >= 30) {
            f295b = I.f292r;
        } else {
            f295b = K.f293b;
        }
    }

    public O(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            this.f296a = new J(this, windowInsets);
            return;
        }
        if (i4 >= 30) {
            this.f296a = new I(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f296a = new H(this, windowInsets);
        } else if (i4 >= 28) {
            this.f296a = new G(this, windowInsets);
        } else {
            this.f296a = new F(this, windowInsets);
        }
    }

    public static C0574b a(C0574b c0574b, int i4, int i5, int i6, int i7) {
        int max = Math.max(0, c0574b.f8472a - i4);
        int max2 = Math.max(0, c0574b.f8473b - i5);
        int max3 = Math.max(0, c0574b.f8474c - i6);
        int max4 = Math.max(0, c0574b.f8475d - i7);
        return (max == i4 && max2 == i5 && max3 == i6 && max4 == i7) ? c0574b : C0574b.a(max, max2, max3, max4);
    }

    public static O c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        O o2 = new O(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = x.f330a;
            O a4 = AbstractC0031s.a(view);
            K k4 = o2.f296a;
            k4.p(a4);
            k4.d(view.getRootView());
            k4.r(view.getWindowSystemUiVisibility());
        }
        return o2;
    }

    public final WindowInsets b() {
        K k4 = this.f296a;
        if (k4 instanceof E) {
            return ((E) k4).f282c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        return Objects.equals(this.f296a, ((O) obj).f296a);
    }

    public final int hashCode() {
        K k4 = this.f296a;
        if (k4 == null) {
            return 0;
        }
        return k4.hashCode();
    }

    public O() {
        this.f296a = new K(this);
    }
}
