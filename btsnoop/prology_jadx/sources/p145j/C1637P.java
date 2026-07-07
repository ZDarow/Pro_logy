package p145j;

/* renamed from: j.P */
/* loaded from: classes.dex */
public final class C1637P extends p145j.AbstractC1634M implements p145j.InterfaceC1635N {

    /* renamed from: K */
    public static final java.lang.reflect.Method f6868K;

    /* renamed from: J */
    public p129f2.C1408Y f6869J;

    static {
        try {
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                f6868K = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", java.lang.Boolean.TYPE);
            }
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p145j.InterfaceC1635N
    /* renamed from: g */
    public final void mo3193g(p140i.MenuC1517i menuC1517i, p140i.MenuItemC1518j menuItemC1518j) {
        p129f2.C1408Y c1408y = this.f6869J;
        if (c1408y != null) {
            c1408y.mo3193g(menuC1517i, menuItemC1518j);
        }
    }

    @Override // p145j.InterfaceC1635N
    /* renamed from: j */
    public final void mo3194j(p140i.MenuC1517i menuC1517i, p140i.MenuItemC1518j menuItemC1518j) {
        p129f2.C1408Y c1408y = this.f6869J;
        if (c1408y != null) {
            c1408y.mo3194j(menuC1517i, menuItemC1518j);
        }
    }
}
