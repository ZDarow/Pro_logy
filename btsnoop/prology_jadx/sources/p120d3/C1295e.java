package p120d3;

/* renamed from: d3.e */
/* loaded from: classes.dex */
public final class C1295e {

    /* renamed from: a */
    public java.lang.reflect.Method f5178a;

    /* renamed from: b */
    public java.lang.reflect.Method f5179b;

    /* renamed from: c */
    public java.lang.reflect.Method f5180c;

    public C1295e(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
        this.f5178a = method;
        this.f5179b = method2;
        this.f5180c = method3;
    }

    /* renamed from: a */
    public static void m3038a() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            throw new java.lang.UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
