package p074S1;

/* renamed from: S1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0647a {

    /* renamed from: a */
    public static final java.lang.reflect.Method f2125a;

    /* renamed from: b */
    public static final java.lang.reflect.Method f2126b;

    /* renamed from: c */
    public static final java.lang.reflect.Method f2127c;

    /* renamed from: d */
    public static final java.lang.reflect.Method f2128d;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        android.os.Process.myUid();
        java.lang.reflect.Method method4 = null;
        try {
            method = android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused) {
            method = null;
        }
        f2125a = method;
        try {
            method2 = android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.Exception unused2) {
            method2 = null;
        }
        f2126b = method2;
        try {
            method3 = android.os.WorkSource.class.getMethod("size", null);
        } catch (java.lang.Exception unused3) {
            method3 = null;
        }
        f2127c = method3;
        try {
            android.os.WorkSource.class.getMethod("get", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused4) {
        }
        try {
            android.os.WorkSource.class.getMethod("getName", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused5) {
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            try {
                android.os.WorkSource.class.getMethod("createWorkChain", null);
            } catch (java.lang.Exception e4) {
                android.util.Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e4);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            try {
                java.lang.Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", java.lang.Integer.TYPE, java.lang.String.class);
            } catch (java.lang.Exception e5) {
                android.util.Log.w("WorkSourceUtil", "Missing WorkChain class", e5);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = android.os.WorkSource.class.getMethod("isEmpty", null);
                method4.setAccessible(true);
            } catch (java.lang.Exception unused6) {
            }
        }
        f2128d = method4;
    }
}
