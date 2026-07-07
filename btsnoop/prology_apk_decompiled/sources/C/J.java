package C;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class J extends I {
    public static final O s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = O.c(null, windowInsets);
    }

    public J(O o2, WindowInsets windowInsets) {
        super(o2, windowInsets);
    }

    @Override // C.I, C.E, C.K
    public boolean n(int i4) {
        boolean isVisible;
        isVisible = this.f282c.isVisible(N.a(i4));
        return isVisible;
    }
}
