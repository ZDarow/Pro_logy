package w0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: w0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0594d {

    /* renamed from: a, reason: collision with root package name */
    public static Constructor f8749a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f8750b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f8751c;

    /* renamed from: d, reason: collision with root package name */
    public static Class f8752d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f8753e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f8754f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f8755g;

    public static void a() {
        if (f8749a == null || f8750b == null || f8751c == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f8749a = cls.getConstructor(null);
            f8750b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f8751c = cls.getMethod("build", null);
        }
    }
}
