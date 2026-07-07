package p206w0;

/* renamed from: w0.d */
/* loaded from: classes.dex */
public abstract class AbstractC2308d {

    /* renamed from: a */
    public static java.lang.reflect.Constructor f9104a;

    /* renamed from: b */
    public static java.lang.reflect.Method f9105b;

    /* renamed from: c */
    public static java.lang.reflect.Method f9106c;

    /* renamed from: d */
    public static java.lang.Class f9107d;

    /* renamed from: e */
    public static java.lang.reflect.Method f9108e;

    /* renamed from: f */
    public static java.lang.reflect.Method f9109f;

    /* renamed from: g */
    public static java.lang.reflect.Method f9110g;

    /* renamed from: a */
    public static void m4487a() {
        if (f9104a == null || f9105b == null || f9106c == null) {
            java.lang.Class<?> cls = java.lang.Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f9104a = cls.getConstructor(null);
            f9105b = cls.getMethod("setRotationDegrees", java.lang.Float.TYPE);
            f9106c = cls.getMethod("build", null);
        }
    }
}
