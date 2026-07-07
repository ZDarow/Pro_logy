package p145j;

/* renamed from: j.n */
/* loaded from: classes.dex */
public final class C1673n {

    /* renamed from: a */
    public int f6973a;

    /* renamed from: b */
    public final java.lang.Object f6974b;

    /* renamed from: c */
    public final java.lang.Object f6975c;

    /* renamed from: d */
    public java.lang.Object f6976d;

    /* renamed from: e */
    public java.lang.Object f6977e;

    /* renamed from: f */
    public java.lang.Object f6978f;

    public C1673n(android.view.View view) {
        p145j.C1675o c1675o;
        this.f6973a = -1;
        this.f6974b = view;
        android.graphics.PorterDuff.Mode mode = p145j.C1675o.f6981b;
        synchronized (p145j.C1675o.class) {
            try {
                if (p145j.C1675o.f6982c == null) {
                    p145j.C1675o.m3618b();
                }
                c1675o = p145j.C1675o.f6982c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.f6975c = c1675o;
    }

    /* renamed from: a */
    public void m3612a() {
        android.view.View view = (android.view.View) this.f6974b;
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            if (((p145j.C1670l0) this.f6976d) != null) {
                if (((p145j.C1670l0) this.f6978f) == null) {
                    this.f6978f = new java.lang.Object();
                }
                p145j.C1670l0 c1670l0 = (p145j.C1670l0) this.f6978f;
                c1670l0.f6968c = null;
                c1670l0.f6967b = false;
                c1670l0.f6969d = null;
                c1670l0.f6966a = false;
                java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
                android.content.res.ColorStateList m445b = p011C.AbstractC0126r.m445b(view);
                if (m445b != null) {
                    c1670l0.f6967b = true;
                    c1670l0.f6968c = m445b;
                }
                android.graphics.PorterDuff.Mode m446c = p011C.AbstractC0126r.m446c(view);
                if (m446c != null) {
                    c1670l0.f6966a = true;
                    c1670l0.f6969d = m446c;
                }
                if (c1670l0.f6967b || c1670l0.f6966a) {
                    p145j.C1675o.m3619c(background, c1670l0, view.getDrawableState());
                    return;
                }
            }
            p145j.C1670l0 c1670l02 = (p145j.C1670l0) this.f6977e;
            if (c1670l02 != null) {
                p145j.C1675o.m3619c(background, c1670l02, view.getDrawableState());
                return;
            }
            p145j.C1670l0 c1670l03 = (p145j.C1670l0) this.f6976d;
            if (c1670l03 != null) {
                p145j.C1675o.m3619c(background, c1670l03, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public void m3613b(android.util.AttributeSet attributeSet, int i4) {
        android.content.res.ColorStateList m3596f;
        android.view.View view = (android.view.View) this.f6974b;
        android.content.Context context = view.getContext();
        int[] iArr = p121e.AbstractC1299a.f5205u;
        android.support.v4.media.session.C1061t m2202q0 = android.support.v4.media.session.C1061t.m2202q0(context, attributeSet, iArr, i4);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) m2202q0.f3862n;
        android.view.View view2 = (android.view.View) this.f6974b;
        p011C.AbstractC0132x.m463c(view2, view2.getContext(), iArr, attributeSet, (android.content.res.TypedArray) m2202q0.f3862n, i4);
        try {
            if (typedArray.hasValue(0)) {
                this.f6973a = typedArray.getResourceId(0, -1);
                p145j.C1675o c1675o = (p145j.C1675o) this.f6975c;
                android.content.Context context2 = view.getContext();
                int i5 = this.f6973a;
                synchronized (c1675o) {
                    m3596f = c1675o.f6983a.m3596f(context2, i5);
                }
                if (m3596f != null) {
                    m3615d(m3596f);
                }
            }
            if (typedArray.hasValue(1)) {
                p011C.AbstractC0126r.m447d(view, m2202q0.m2222e0(1));
            }
            if (typedArray.hasValue(2)) {
                p011C.AbstractC0126r.m448e(view, p145j.AbstractC1623B.m3578c(typedArray.getInt(2, -1), null));
            }
        } finally {
            m2202q0.m2243u0();
        }
    }

    /* renamed from: c */
    public void m3614c(int i4) {
        android.content.res.ColorStateList colorStateList;
        this.f6973a = i4;
        p145j.C1675o c1675o = (p145j.C1675o) this.f6975c;
        if (c1675o != null) {
            android.content.Context context = ((android.view.View) this.f6974b).getContext();
            synchronized (c1675o) {
                colorStateList = c1675o.f6983a.m3596f(context, i4);
            }
        } else {
            colorStateList = null;
        }
        m3615d(colorStateList);
        m3612a();
    }

    /* renamed from: d */
    public void m3615d(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((p145j.C1670l0) this.f6976d) == null) {
                this.f6976d = new java.lang.Object();
            }
            p145j.C1670l0 c1670l0 = (p145j.C1670l0) this.f6976d;
            c1670l0.f6968c = colorStateList;
            c1670l0.f6967b = true;
        } else {
            this.f6976d = null;
        }
        m3612a();
    }

    /* renamed from: e */
    public void m3616e(android.content.res.ColorStateList colorStateList) {
        if (((p145j.C1670l0) this.f6977e) == null) {
            this.f6977e = new java.lang.Object();
        }
        p145j.C1670l0 c1670l0 = (p145j.C1670l0) this.f6977e;
        c1670l0.f6968c = colorStateList;
        c1670l0.f6967b = true;
        m3612a();
    }

    /* renamed from: f */
    public void m3617f(android.graphics.PorterDuff.Mode mode) {
        if (((p145j.C1670l0) this.f6977e) == null) {
            this.f6977e = new java.lang.Object();
        }
        p145j.C1670l0 c1670l0 = (p145j.C1670l0) this.f6977e;
        c1670l0.f6969d = mode;
        c1670l0.f6966a = true;
        m3612a();
    }

    public C1673n(int[] iArr, p179q0.C2005k0[] c2005k0Arr, int[] iArr2, int[][][] iArr3, p179q0.C2005k0 c2005k0) {
        this.f6974b = iArr;
        this.f6975c = c2005k0Arr;
        this.f6977e = iArr3;
        this.f6976d = iArr2;
        this.f6978f = c2005k0;
        this.f6973a = iArr.length;
    }
}
