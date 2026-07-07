package p058O1;

/* renamed from: O1.s */
/* loaded from: classes.dex */
public abstract class AbstractC0515s {

    /* renamed from: a */
    public static final java.lang.Object f1527a = new java.lang.Object();

    /* renamed from: b */
    public static boolean f1528b;

    /* renamed from: c */
    public static int f1529c;

    /* renamed from: a */
    public static void m1014a(java.lang.String str, boolean z4) {
        if (!z4) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m1015b(android.os.Handler handler) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            java.lang.String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new java.lang.IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    /* renamed from: c */
    public static void m1016c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
    }

    /* renamed from: d */
    public static void m1017d(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null reference");
        }
    }

    /* renamed from: e */
    public static void m1018e(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    /* renamed from: f */
    public static boolean m1019f(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
