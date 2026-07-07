package j;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import i.MenuC0328i;
import i.MenuItemC0329j;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class P extends M implements N {

    /* renamed from: K, reason: collision with root package name */
    public static final Method f6615K;
    public f2.Y J;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f6615K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // j.N
    public final void g(MenuC0328i menuC0328i, MenuItemC0329j menuItemC0329j) {
        f2.Y y4 = this.J;
        if (y4 != null) {
            y4.g(menuC0328i, menuItemC0329j);
        }
    }

    @Override // j.N
    public final void j(MenuC0328i menuC0328i, MenuItemC0329j menuItemC0329j) {
        f2.Y y4 = this.J;
        if (y4 != null) {
            y4.j(menuC0328i, menuItemC0329j);
        }
    }
}
