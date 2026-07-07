package p145j;

/* renamed from: j.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC1690v0 {
    static {
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static boolean m3632a(android.view.View view) {
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        return view.getLayoutDirection() == 1;
    }
}
