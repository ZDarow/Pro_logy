package C;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import u.C0574b;

/* loaded from: classes.dex */
public abstract class E extends K {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f277i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f278j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f279k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f280l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f281m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f282c;

    /* renamed from: d, reason: collision with root package name */
    public C0574b[] f283d;

    /* renamed from: e, reason: collision with root package name */
    public C0574b f284e;

    /* renamed from: f, reason: collision with root package name */
    public O f285f;

    /* renamed from: g, reason: collision with root package name */
    public C0574b f286g;

    /* renamed from: h, reason: collision with root package name */
    public int f287h;

    public E(O o2, WindowInsets windowInsets) {
        super(o2);
        this.f284e = null;
        this.f282c = windowInsets;
    }

    private C0574b t() {
        O o2 = this.f285f;
        return o2 != null ? o2.f296a.g() : C0574b.f8471e;
    }

    private C0574b u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f277i) {
            w();
        }
        Method method = f278j;
        if (method != null && f279k != null && f280l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f280l.get(f281m.get(invoke));
                if (rect != null) {
                    return C0574b.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void w() {
        try {
            f278j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f279k = cls;
            f280l = cls.getDeclaredField("mVisibleInsets");
            f281m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f280l.setAccessible(true);
            f281m.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f277i = true;
    }

    public static boolean y(int i4, int i5) {
        return (i4 & 6) == (i5 & 6);
    }

    @Override // C.K
    public void d(View view) {
        C0574b u4 = u(view);
        if (u4 == null) {
            u4 = C0574b.f8471e;
        }
        x(u4);
    }

    @Override // C.K
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        E e4 = (E) obj;
        return Objects.equals(this.f286g, e4.f286g) && y(this.f287h, e4.f287h);
    }

    @Override // C.K
    public final C0574b i() {
        if (this.f284e == null) {
            WindowInsets windowInsets = this.f282c;
            this.f284e = C0574b.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f284e;
    }

    @Override // C.K
    public O k(int i4, int i5, int i6, int i7) {
        O c4 = O.c(null, this.f282c);
        int i8 = Build.VERSION.SDK_INT;
        D c5 = i8 >= 34 ? new C(c4) : i8 >= 30 ? new B(c4) : i8 >= 29 ? new A(c4) : new z(c4);
        c5.d(O.a(i(), i4, i5, i6, i7));
        c5.c(O.a(g(), i4, i5, i6, i7));
        return c5.b();
    }

    @Override // C.K
    public boolean m() {
        return this.f282c.isRound();
    }

    @Override // C.K
    @SuppressLint({"WrongConstant"})
    public boolean n(int i4) {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0 && !v(i5)) {
                return false;
            }
        }
        return true;
    }

    @Override // C.K
    public void o(C0574b[] c0574bArr) {
        this.f283d = c0574bArr;
    }

    @Override // C.K
    public void p(O o2) {
        this.f285f = o2;
    }

    @Override // C.K
    public void r(int i4) {
        this.f287h = i4;
    }

    public C0574b s(int i4, boolean z4) {
        C0574b g4;
        int i5;
        C0574b c0574b = C0574b.f8471e;
        if (i4 == 1) {
            return z4 ? C0574b.a(0, Math.max(t().f8473b, i().f8473b), 0, 0) : (this.f287h & 4) != 0 ? c0574b : C0574b.a(0, i().f8473b, 0, 0);
        }
        if (i4 == 2) {
            if (z4) {
                C0574b t4 = t();
                C0574b g5 = g();
                return C0574b.a(Math.max(t4.f8472a, g5.f8472a), 0, Math.max(t4.f8474c, g5.f8474c), Math.max(t4.f8475d, g5.f8475d));
            }
            if ((this.f287h & 2) != 0) {
                return c0574b;
            }
            C0574b i6 = i();
            O o2 = this.f285f;
            g4 = o2 != null ? o2.f296a.g() : null;
            int i7 = i6.f8475d;
            if (g4 != null) {
                i7 = Math.min(i7, g4.f8475d);
            }
            return C0574b.a(i6.f8472a, 0, i6.f8474c, i7);
        }
        if (i4 == 8) {
            C0574b[] c0574bArr = this.f283d;
            g4 = c0574bArr != null ? c0574bArr[3] : null;
            if (g4 != null) {
                return g4;
            }
            C0574b i8 = i();
            C0574b t5 = t();
            int i9 = i8.f8475d;
            if (i9 > t5.f8475d) {
                return C0574b.a(0, 0, 0, i9);
            }
            C0574b c0574b2 = this.f286g;
            return (c0574b2 == null || c0574b2.equals(c0574b) || (i5 = this.f286g.f8475d) <= t5.f8475d) ? c0574b : C0574b.a(0, 0, 0, i5);
        }
        if (i4 == 16) {
            return h();
        }
        if (i4 == 32) {
            return f();
        }
        if (i4 == 64) {
            return j();
        }
        if (i4 != 128) {
            return c0574b;
        }
        O o4 = this.f285f;
        C0019f e4 = o4 != null ? o4.f296a.e() : e();
        if (e4 == null) {
            return c0574b;
        }
        int i10 = Build.VERSION.SDK_INT;
        return C0574b.a(i10 >= 28 ? AbstractC0018e.f(e4.f313a) : 0, i10 >= 28 ? AbstractC0018e.h(e4.f313a) : 0, i10 >= 28 ? AbstractC0018e.g(e4.f313a) : 0, i10 >= 28 ? AbstractC0018e.e(e4.f313a) : 0);
    }

    public boolean v(int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 8 && i4 != 128) {
                return true;
            }
        }
        return !s(i4, false).equals(C0574b.f8471e);
    }

    public void x(C0574b c0574b) {
        this.f286g = c0574b;
    }
}
