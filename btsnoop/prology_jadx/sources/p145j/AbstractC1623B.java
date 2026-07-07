package p145j;

/* renamed from: j.B */
/* loaded from: classes.dex */
public abstract class AbstractC1623B {

    /* renamed from: a */
    public static final android.graphics.Rect f6800a = new android.graphics.Rect();

    /* renamed from: b */
    public static final java.lang.Class f6801b;

    static {
        try {
            f6801b = java.lang.Class.forName("android.graphics.Insets");
        } catch (java.lang.ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m3576a(android.graphics.drawable.Drawable drawable) {
        if (!(drawable instanceof android.graphics.drawable.DrawableContainer)) {
            if (drawable instanceof p201v.InterfaceC2267a) {
                ((p201v.AbstractC2268b) ((p201v.InterfaceC2267a) drawable)).getClass();
                return m3576a(null);
            }
            if (drawable instanceof p145j.C1624C) {
                return m3576a(((p145j.C1624C) drawable).f6802l);
            }
            if (drawable instanceof android.graphics.drawable.ScaleDrawable) {
                return m3576a(((android.graphics.drawable.ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (android.graphics.drawable.Drawable drawable2 : ((android.graphics.drawable.DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m3576a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static android.graphics.Rect m3577b(android.graphics.drawable.Drawable drawable) {
        char c4;
        android.graphics.Insets opticalInsets;
        int i4;
        int i5;
        int i6;
        int i7;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            android.graphics.Rect rect = new android.graphics.Rect();
            i4 = opticalInsets.left;
            rect.left = i4;
            i5 = opticalInsets.right;
            rect.right = i5;
            i6 = opticalInsets.top;
            rect.top = i6;
            i7 = opticalInsets.bottom;
            rect.bottom = i7;
            return rect;
        }
        java.lang.Class cls = f6801b;
        if (cls != null) {
            try {
                boolean z4 = drawable instanceof p201v.InterfaceC2267a;
                java.lang.Object obj = drawable;
                if (z4) {
                    ((p201v.AbstractC2268b) ((p201v.InterfaceC2267a) drawable)).getClass();
                    obj = null;
                }
                java.lang.Object invoke = obj.getClass().getMethod("getOpticalInsets", null).invoke(obj, null);
                if (invoke != null) {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    for (java.lang.reflect.Field field : cls.getFields()) {
                        java.lang.String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                        }
                        c4 = 65535;
                        if (c4 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c4 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c4 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c4 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (java.lang.Exception unused) {
                android.util.Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f6800a;
    }

    /* renamed from: c */
    public static android.graphics.PorterDuff.Mode m3578c(int i4, android.graphics.PorterDuff.Mode mode) {
        if (i4 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
