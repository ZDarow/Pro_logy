package p145j;

/* renamed from: j.S */
/* loaded from: classes.dex */
public final class C1639S {

    /* renamed from: g */
    public static p145j.C1639S f6871g;

    /* renamed from: a */
    public java.util.WeakHashMap f6873a;

    /* renamed from: b */
    public final java.util.WeakHashMap f6874b = new java.util.WeakHashMap(0);

    /* renamed from: c */
    public android.util.TypedValue f6875c;

    /* renamed from: d */
    public boolean f6876d;

    /* renamed from: e */
    public p013C2.C0139d f6877e;

    /* renamed from: f */
    public static final android.graphics.PorterDuff.Mode f6870f = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    public static final p145j.C1638Q f6872h = new p165n.C1882i(6);

    /* renamed from: b */
    public static synchronized p145j.C1639S m3591b() {
        p145j.C1639S c1639s;
        synchronized (p145j.C1639S.class) {
            try {
                if (f6871g == null) {
                    f6871g = new p145j.C1639S();
                }
                c1639s = f6871g;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c1639s;
    }

    /* renamed from: e */
    public static synchronized android.graphics.PorterDuffColorFilter m3592e(int i4, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        synchronized (p145j.C1639S.class) {
            p145j.C1638Q c1638q = f6872h;
            c1638q.getClass();
            int i5 = (31 + i4) * 31;
            porterDuffColorFilter = (android.graphics.PorterDuffColorFilter) c1638q.m3862a(java.lang.Integer.valueOf(mode.hashCode() + i5));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(i4, mode);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    public final android.graphics.drawable.Drawable m3593a(android.content.Context context, int i4) {
        android.graphics.drawable.Drawable drawable;
        java.lang.Object obj;
        if (this.f6875c == null) {
            this.f6875c = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.f6875c;
        context.getResources().getValue(i4, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            p165n.C1880g c1880g = (p165n.C1880g) this.f6874b.get(context);
            drawable = null;
            if (c1880g != null) {
                int m3884b = p170o.AbstractC1926a.m3884b(c1880g.f7633m, c1880g.f7635o, j4);
                if (m3884b < 0 || (obj = c1880g.f7634n[m3884b]) == p165n.AbstractC1881h.f7636a) {
                    obj = null;
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
                if (weakReference != null) {
                    android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int m3884b2 = p170o.AbstractC1926a.m3884b(c1880g.f7633m, c1880g.f7635o, j4);
                        if (m3884b2 >= 0) {
                            java.lang.Object[] objArr = c1880g.f7634n;
                            java.lang.Object obj2 = objArr[m3884b2];
                            java.lang.Object obj3 = p165n.AbstractC1881h.f7636a;
                            if (obj2 != obj3) {
                                objArr[m3884b2] = obj3;
                                c1880g.f7632l = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        android.graphics.drawable.LayerDrawable layerDrawable = null;
        if (this.f6877e != null) {
            if (i4 == com.prology.R.drawable.abc_cab_background_top_material) {
                layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{m3594c(context, com.prology.R.drawable.abc_cab_background_internal_bg), m3594c(context, com.prology.R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i4 == com.prology.R.drawable.abc_ratingbar_material) {
                layerDrawable = p013C2.C0139d.m477f(this, context, com.prology.R.dimen.abc_star_big);
            } else if (i4 == com.prology.R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = p013C2.C0139d.m477f(this, context, com.prology.R.dimen.abc_star_medium);
            } else if (i4 == com.prology.R.drawable.abc_ratingbar_small_material) {
                layerDrawable = p013C2.C0139d.m477f(this, context, com.prology.R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    android.graphics.drawable.Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        p165n.C1880g c1880g2 = (p165n.C1880g) this.f6874b.get(context);
                        if (c1880g2 == null) {
                            c1880g2 = new p165n.C1880g();
                            this.f6874b.put(context, c1880g2);
                        }
                        c1880g2.m3859a(j4, new java.lang.ref.WeakReference(constantState2));
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    /* renamed from: c */
    public final synchronized android.graphics.drawable.Drawable m3594c(android.content.Context context, int i4) {
        return m3595d(context, i4);
    }

    /* renamed from: d */
    public final synchronized android.graphics.drawable.Drawable m3595d(android.content.Context context, int i4) {
        android.graphics.drawable.Drawable m3593a;
        try {
            if (!this.f6876d) {
                this.f6876d = true;
                android.graphics.drawable.Drawable m3594c = m3594c(context, com.prology.R.drawable.abc_vector_test);
                if (m3594c == null || (!(m3594c instanceof p172o1.AbstractC1930a) && !"android.graphics.drawable.VectorDrawable".equals(m3594c.getClass().getName()))) {
                    this.f6876d = false;
                    throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            m3593a = m3593a(context, i4);
            if (m3593a == null) {
                m3593a = context.getDrawable(i4);
            }
            if (m3593a != null) {
                m3593a = m3597g(context, i4, m3593a);
            }
            if (m3593a != null) {
                android.graphics.Rect rect = p145j.AbstractC1623B.f6800a;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return m3593a;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, n.k] */
    /* renamed from: f */
    public final synchronized android.content.res.ColorStateList m3596f(android.content.Context context, int i4) {
        android.content.res.ColorStateList colorStateList;
        int i5;
        p165n.C1884k c1884k;
        java.lang.Object obj;
        java.util.WeakHashMap weakHashMap = this.f6873a;
        android.content.res.ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (c1884k = (p165n.C1884k) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int m3883a = p170o.AbstractC1926a.m3883a(c1884k.f7649n, i4, c1884k.f7647l);
            if (m3883a < 0 || (obj = c1884k.f7648m[m3883a]) == p165n.AbstractC1881h.f7637b) {
                obj = null;
            }
            colorStateList = (android.content.res.ColorStateList) obj;
        }
        if (colorStateList == null) {
            p013C2.C0139d c0139d = this.f6877e;
            if (c0139d != null) {
                colorStateList2 = c0139d.m482g(context, i4);
            }
            if (colorStateList2 != null) {
                if (this.f6873a == null) {
                    this.f6873a = new java.util.WeakHashMap();
                }
                p165n.C1884k c1884k2 = (p165n.C1884k) this.f6873a.get(context);
                p165n.C1884k c1884k3 = c1884k2;
                if (c1884k2 == null) {
                    ?? obj2 = new java.lang.Object();
                    int i6 = 4;
                    while (true) {
                        i5 = 40;
                        if (i6 >= 32) {
                            break;
                        }
                        int i7 = (1 << i6) - 12;
                        if (40 <= i7) {
                            i5 = i7;
                            break;
                        }
                        i6++;
                    }
                    int i8 = i5 / 4;
                    obj2.f7647l = new int[i8];
                    obj2.f7648m = new java.lang.Object[i8];
                    this.f6873a.put(context, obj2);
                    c1884k3 = obj2;
                }
                c1884k3.m3872a(i4, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m3597g(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p145j.C1639S.m3597g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
