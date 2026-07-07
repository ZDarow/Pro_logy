package p011C;

/* renamed from: C.z */
/* loaded from: classes.dex */
public final class C0134z extends p011C.AbstractC0094D {

    /* renamed from: c */
    public static java.lang.reflect.Field f339c = null;

    /* renamed from: d */
    public static boolean f340d = false;

    /* renamed from: e */
    public static java.lang.reflect.Constructor f341e = null;

    /* renamed from: f */
    public static boolean f342f = false;

    /* renamed from: a */
    public android.view.WindowInsets f343a;

    /* renamed from: b */
    public p196u.C2207b f344b;

    public C0134z() {
        this.f343a = m466e();
    }

    /* renamed from: e */
    private static android.view.WindowInsets m466e() {
        if (!f340d) {
            try {
                f339c = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException e4) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f340d = true;
        }
        java.lang.reflect.Field field = f339c;
        if (field != null) {
            try {
                android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new android.view.WindowInsets(windowInsets);
                }
            } catch (java.lang.ReflectiveOperationException e5) {
                android.util.Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
            }
        }
        if (!f342f) {
            try {
                f341e = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException e6) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            f342f = true;
        }
        java.lang.reflect.Constructor constructor = f341e;
        if (constructor != null) {
            try {
                return (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException e7) {
                android.util.Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // p011C.AbstractC0094D
    /* renamed from: b */
    public p011C.C0105O mo354b() {
        m357a();
        p011C.C0105O m396c = p011C.C0105O.m396c(null, this.f343a);
        p011C.C0101K c0101k = m396c.f302a;
        c0101k.mo367o(null);
        c0101k.mo377q(this.f344b);
        return m396c;
    }

    @Override // p011C.AbstractC0094D
    /* renamed from: c */
    public void mo355c(p196u.C2207b c2207b) {
        this.f344b = c2207b;
    }

    @Override // p011C.AbstractC0094D
    /* renamed from: d */
    public void mo356d(p196u.C2207b c2207b) {
        android.view.WindowInsets windowInsets = this.f343a;
        if (windowInsets != null) {
            this.f343a = windowInsets.replaceSystemWindowInsets(c2207b.f8810a, c2207b.f8811b, c2207b.f8812c, c2207b.f8813d);
        }
    }

    public C0134z(p011C.C0105O c0105o) {
        super(c0105o);
        this.f343a = c0105o.m397b();
    }
}
