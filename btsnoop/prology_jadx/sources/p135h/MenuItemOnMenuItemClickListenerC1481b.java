package p135h;

/* renamed from: h.b */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1481b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: c */
    public static final java.lang.Class[] f6022c = {android.view.MenuItem.class};

    /* renamed from: a */
    public java.lang.Object f6023a;

    /* renamed from: b */
    public java.lang.reflect.Method f6024b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.reflect.Method method = this.f6024b;
        try {
            java.lang.Class<?> returnType = method.getReturnType();
            java.lang.Class<?> cls = java.lang.Boolean.TYPE;
            java.lang.Object obj = this.f6023a;
            if (returnType == cls) {
                return ((java.lang.Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (java.lang.Exception e4) {
            throw new java.lang.RuntimeException(e4);
        }
    }
}
