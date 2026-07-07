package p193t0;

/* renamed from: t0.j */
/* loaded from: classes.dex */
public final class C2172j extends p076T.C0680X {

    /* renamed from: r */
    public boolean f8660r;

    /* renamed from: s */
    public boolean f8661s;

    /* renamed from: t */
    public boolean f8662t;

    /* renamed from: u */
    public boolean f8663u;

    /* renamed from: v */
    public boolean f8664v;

    /* renamed from: w */
    public boolean f8665w;

    /* renamed from: x */
    public boolean f8666x;

    /* renamed from: y */
    public final android.util.SparseArray f8667y;

    /* renamed from: z */
    public final android.util.SparseBooleanArray f8668z;

    public C2172j(android.content.Context context) {
        android.view.accessibility.CaptioningManager captioningManager;
        java.lang.String locale;
        android.graphics.Point point;
        java.lang.String m1584E;
        java.lang.String[] split;
        int i4 = p086W.AbstractC0805y.f2801a;
        if ((i4 >= 23 || android.os.Looper.myLooper() != null) && (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f2272o = 1088;
            java.util.Locale locale2 = captioningManager.getLocale();
            if (locale2 != null) {
                if (i4 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                this.f2271n = p129f2.AbstractC1393I.m3166o(locale);
            }
        }
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && p086W.AbstractC0805y.m1591L(context)) {
            if (i4 < 28) {
                m1584E = p086W.AbstractC0805y.m1584E("sys.display-size");
            } else {
                m1584E = p086W.AbstractC0805y.m1584E("vendor.display-size");
            }
            if (!android.text.TextUtils.isEmpty(m1584E)) {
                try {
                    split = m1584E.trim().split("x", -1);
                } catch (java.lang.NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = java.lang.Integer.parseInt(split[0]);
                    int parseInt2 = java.lang.Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new android.graphics.Point(parseInt, parseInt2);
                        mo1261b(point.x, point.y);
                        this.f8667y = new android.util.SparseArray();
                        this.f8668z = new android.util.SparseBooleanArray();
                        m4293c();
                    }
                }
                p086W.AbstractC0781a.m1425n("Util", "Invalid display size: " + m1584E);
            }
            if ("Sony".equals(p086W.AbstractC0805y.f2803c) && p086W.AbstractC0805y.f2804d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new android.graphics.Point(3840, 2160);
                mo1261b(point.x, point.y);
                this.f8667y = new android.util.SparseArray();
                this.f8668z = new android.util.SparseBooleanArray();
                m4293c();
            }
        }
        point = new android.graphics.Point();
        if (i4 >= 23) {
            android.view.Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        mo1261b(point.x, point.y);
        this.f8667y = new android.util.SparseArray();
        this.f8668z = new android.util.SparseBooleanArray();
        m4293c();
    }

    @Override // p076T.C0680X
    /* renamed from: b */
    public final p076T.C0680X mo1261b(int i4, int i5) {
        super.mo1261b(i4, i5);
        return this;
    }

    /* renamed from: c */
    public final void m4293c() {
        this.f8660r = true;
        this.f8661s = true;
        this.f8662t = true;
        this.f8663u = true;
        this.f8664v = true;
        this.f8665w = true;
        this.f8666x = true;
    }

    public C2172j(p193t0.C2173k c2173k) {
        m1260a(c2173k);
        this.f8660r = c2173k.f8670r;
        this.f8661s = c2173k.f8671s;
        this.f8662t = c2173k.f8672t;
        this.f8663u = c2173k.f8673u;
        this.f8664v = c2173k.f8674v;
        this.f8665w = c2173k.f8675w;
        this.f8666x = c2173k.f8676x;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int i4 = 0;
        while (true) {
            android.util.SparseArray sparseArray2 = c2173k.f8677y;
            if (i4 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i4), new java.util.HashMap((java.util.Map) sparseArray2.valueAt(i4)));
                i4++;
            } else {
                this.f8667y = sparseArray;
                this.f8668z = c2173k.f8678z.clone();
                return;
            }
        }
    }

    public C2172j() {
        this.f8667y = new android.util.SparseArray();
        this.f8668z = new android.util.SparseBooleanArray();
        m4293c();
    }
}
