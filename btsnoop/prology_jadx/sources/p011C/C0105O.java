package p011C;

/* renamed from: C.O */
/* loaded from: classes.dex */
public final class C0105O {

    /* renamed from: b */
    public static final p011C.C0105O f301b;

    /* renamed from: a */
    public final p011C.C0101K f302a;

    static {
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            f301b = p011C.C0100J.f298s;
        } else if (i4 >= 30) {
            f301b = p011C.C0099I.f297r;
        } else {
            f301b = p011C.C0101K.f299b;
        }
    }

    public C0105O(android.view.WindowInsets windowInsets) {
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            this.f302a = new p011C.C0100J(this, windowInsets);
            return;
        }
        if (i4 >= 30) {
            this.f302a = new p011C.C0099I(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f302a = new p011C.C0098H(this, windowInsets);
        } else if (i4 >= 28) {
            this.f302a = new p011C.C0097G(this, windowInsets);
        } else {
            this.f302a = new p011C.C0096F(this, windowInsets);
        }
    }

    /* renamed from: a */
    public static p196u.C2207b m395a(p196u.C2207b c2207b, int i4, int i5, int i6, int i7) {
        int max = java.lang.Math.max(0, c2207b.f8810a - i4);
        int max2 = java.lang.Math.max(0, c2207b.f8811b - i5);
        int max3 = java.lang.Math.max(0, c2207b.f8812c - i6);
        int max4 = java.lang.Math.max(0, c2207b.f8813d - i7);
        return (max == i4 && max2 == i5 && max3 == i6 && max4 == i7) ? c2207b : p196u.C2207b.m4386a(max, max2, max3, max4);
    }

    /* renamed from: c */
    public static p011C.C0105O m396c(android.view.View view, android.view.WindowInsets windowInsets) {
        windowInsets.getClass();
        p011C.C0105O c0105o = new p011C.C0105O(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            p011C.C0105O m450a = p011C.AbstractC0127s.m450a(view);
            p011C.C0101K c0101k = c0105o.f302a;
            c0101k.mo368p(m450a);
            c0101k.mo362d(view.getRootView());
            c0101k.mo369r(view.getWindowSystemUiVisibility());
        }
        return c0105o;
    }

    /* renamed from: b */
    public final android.view.WindowInsets m397b() {
        p011C.C0101K c0101k = this.f302a;
        if (c0101k instanceof p011C.AbstractC0095E) {
            return ((p011C.AbstractC0095E) c0101k).f287c;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011C.C0105O)) {
            return false;
        }
        return java.util.Objects.equals(this.f302a, ((p011C.C0105O) obj).f302a);
    }

    public final int hashCode() {
        p011C.C0101K c0101k = this.f302a;
        if (c0101k == null) {
            return 0;
        }
        return c0101k.hashCode();
    }

    public C0105O() {
        this.f302a = new p011C.C0101K(this);
    }
}
