package p196u;

/* renamed from: u.e */
/* loaded from: classes.dex */
public final class C2210e extends p196u.C2209d {
    @Override // p196u.C2209d
    /* renamed from: s */
    public final android.graphics.Typeface mo4399s(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f8821m, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.f8827s.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e4) {
            throw new java.lang.RuntimeException(e4);
        }
    }

    @Override // p196u.C2209d
    /* renamed from: y */
    public final java.lang.reflect.Method mo4403y(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass();
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, java.lang.String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
