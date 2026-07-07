package p011C;

/* renamed from: C.E */
/* loaded from: classes.dex */
public abstract class AbstractC0095E extends p011C.C0101K {

    /* renamed from: i */
    public static boolean f282i = false;

    /* renamed from: j */
    public static java.lang.reflect.Method f283j;

    /* renamed from: k */
    public static java.lang.Class f284k;

    /* renamed from: l */
    public static java.lang.reflect.Field f285l;

    /* renamed from: m */
    public static java.lang.reflect.Field f286m;

    /* renamed from: c */
    public final android.view.WindowInsets f287c;

    /* renamed from: d */
    public p196u.C2207b[] f288d;

    /* renamed from: e */
    public p196u.C2207b f289e;

    /* renamed from: f */
    public p011C.C0105O f290f;

    /* renamed from: g */
    public p196u.C2207b f291g;

    /* renamed from: h */
    public int f292h;

    public AbstractC0095E(p011C.C0105O c0105o, android.view.WindowInsets windowInsets) {
        super(c0105o);
        this.f289e = null;
        this.f287c = windowInsets;
    }

    /* renamed from: t */
    private p196u.C2207b m358t() {
        p011C.C0105O c0105o = this.f290f;
        return c0105o != null ? c0105o.f302a.mo375g() : p196u.C2207b.f8809e;
    }

    /* renamed from: u */
    private p196u.C2207b m359u(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f282i) {
            m360w();
        }
        java.lang.reflect.Method method = f283j;
        if (method != null && f284k != null && f285l != null) {
            try {
                java.lang.Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new java.lang.NullPointerException());
                    return null;
                }
                android.graphics.Rect rect = (android.graphics.Rect) f285l.get(f286m.get(invoke));
                if (rect != null) {
                    return p196u.C2207b.m4386a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (java.lang.ReflectiveOperationException e4) {
                android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    /* renamed from: w */
    private static void m360w() {
        try {
            f283j = android.view.View.class.getDeclaredMethod("getViewRootImpl", null);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            f284k = cls;
            f285l = cls.getDeclaredField("mVisibleInsets");
            f286m = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f285l.setAccessible(true);
            f286m.setAccessible(true);
        } catch (java.lang.ReflectiveOperationException e4) {
            android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f282i = true;
    }

    /* renamed from: y */
    public static boolean m361y(int i4, int i5) {
        return (i4 & 6) == (i5 & 6);
    }

    @Override // p011C.C0101K
    /* renamed from: d */
    public void mo362d(android.view.View view) {
        p196u.C2207b m359u = m359u(view);
        if (m359u == null) {
            m359u = p196u.C2207b.f8809e;
        }
        m372x(m359u);
    }

    @Override // p011C.C0101K
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        p011C.AbstractC0095E abstractC0095E = (p011C.AbstractC0095E) obj;
        return java.util.Objects.equals(this.f291g, abstractC0095E.f291g) && m361y(this.f292h, abstractC0095E.f292h);
    }

    @Override // p011C.C0101K
    /* renamed from: i */
    public final p196u.C2207b mo363i() {
        if (this.f289e == null) {
            android.view.WindowInsets windowInsets = this.f287c;
            this.f289e = p196u.C2207b.m4386a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f289e;
    }

    @Override // p011C.C0101K
    /* renamed from: k */
    public p011C.C0105O mo364k(int i4, int i5, int i6, int i7) {
        p011C.C0105O m396c = p011C.C0105O.m396c(null, this.f287c);
        int i8 = android.os.Build.VERSION.SDK_INT;
        p011C.AbstractC0094D c0093c = i8 >= 34 ? new p011C.C0093C(m396c) : i8 >= 30 ? new p011C.C0092B(m396c) : i8 >= 29 ? new p011C.C0091A(m396c) : new p011C.C0134z(m396c);
        c0093c.mo356d(p011C.C0105O.m395a(mo363i(), i4, i5, i6, i7));
        c0093c.mo355c(p011C.C0105O.m395a(mo375g(), i4, i5, i6, i7));
        return c0093c.mo354b();
    }

    @Override // p011C.C0101K
    /* renamed from: m */
    public boolean mo365m() {
        return this.f287c.isRound();
    }

    @Override // p011C.C0101K
    @android.annotation.SuppressLint({"WrongConstant"})
    /* renamed from: n */
    public boolean mo366n(int i4) {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0 && !m371v(i5)) {
                return false;
            }
        }
        return true;
    }

    @Override // p011C.C0101K
    /* renamed from: o */
    public void mo367o(p196u.C2207b[] c2207bArr) {
        this.f288d = c2207bArr;
    }

    @Override // p011C.C0101K
    /* renamed from: p */
    public void mo368p(p011C.C0105O c0105o) {
        this.f290f = c0105o;
    }

    @Override // p011C.C0101K
    /* renamed from: r */
    public void mo369r(int i4) {
        this.f292h = i4;
    }

    /* renamed from: s */
    public p196u.C2207b m370s(int i4, boolean z4) {
        p196u.C2207b mo375g;
        int i5;
        p196u.C2207b c2207b = p196u.C2207b.f8809e;
        if (i4 == 1) {
            return z4 ? p196u.C2207b.m4386a(0, java.lang.Math.max(m358t().f8811b, mo363i().f8811b), 0, 0) : (this.f292h & 4) != 0 ? c2207b : p196u.C2207b.m4386a(0, mo363i().f8811b, 0, 0);
        }
        if (i4 == 2) {
            if (z4) {
                p196u.C2207b m358t = m358t();
                p196u.C2207b mo375g2 = mo375g();
                return p196u.C2207b.m4386a(java.lang.Math.max(m358t.f8810a, mo375g2.f8810a), 0, java.lang.Math.max(m358t.f8812c, mo375g2.f8812c), java.lang.Math.max(m358t.f8813d, mo375g2.f8813d));
            }
            if ((this.f292h & 2) != 0) {
                return c2207b;
            }
            p196u.C2207b mo363i = mo363i();
            p011C.C0105O c0105o = this.f290f;
            mo375g = c0105o != null ? c0105o.f302a.mo375g() : null;
            int i6 = mo363i.f8813d;
            if (mo375g != null) {
                i6 = java.lang.Math.min(i6, mo375g.f8813d);
            }
            return p196u.C2207b.m4386a(mo363i.f8810a, 0, mo363i.f8812c, i6);
        }
        if (i4 == 8) {
            p196u.C2207b[] c2207bArr = this.f288d;
            mo375g = c2207bArr != null ? c2207bArr[3] : null;
            if (mo375g != null) {
                return mo375g;
            }
            p196u.C2207b mo363i2 = mo363i();
            p196u.C2207b m358t2 = m358t();
            int i7 = mo363i2.f8813d;
            if (i7 > m358t2.f8813d) {
                return p196u.C2207b.m4386a(0, 0, 0, i7);
            }
            p196u.C2207b c2207b2 = this.f291g;
            return (c2207b2 == null || c2207b2.equals(c2207b) || (i5 = this.f291g.f8813d) <= m358t2.f8813d) ? c2207b : p196u.C2207b.m4386a(0, 0, 0, i5);
        }
        if (i4 == 16) {
            return mo381h();
        }
        if (i4 == 32) {
            return mo380f();
        }
        if (i4 == 64) {
            return mo382j();
        }
        if (i4 != 128) {
            return c2207b;
        }
        p011C.C0105O c0105o2 = this.f290f;
        p011C.C0114f mo379e = c0105o2 != null ? c0105o2.f302a.mo379e() : mo379e();
        if (mo379e == null) {
            return c2207b;
        }
        int i8 = android.os.Build.VERSION.SDK_INT;
        return p196u.C2207b.m4386a(i8 >= 28 ? p011C.AbstractC0113e.m409f(mo379e.f319a) : 0, i8 >= 28 ? p011C.AbstractC0113e.m411h(mo379e.f319a) : 0, i8 >= 28 ? p011C.AbstractC0113e.m410g(mo379e.f319a) : 0, i8 >= 28 ? p011C.AbstractC0113e.m408e(mo379e.f319a) : 0);
    }

    /* renamed from: v */
    public boolean m371v(int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 8 && i4 != 128) {
                return true;
            }
        }
        return !m370s(i4, false).equals(p196u.C2207b.f8809e);
    }

    /* renamed from: x */
    public void m372x(p196u.C2207b c2207b) {
        this.f291g = c2207b;
    }
}
