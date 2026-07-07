package C;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class I extends H {

    /* renamed from: r, reason: collision with root package name */
    public static final O f292r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f292r = O.c(null, windowInsets);
    }

    public I(O o2, WindowInsets windowInsets) {
        super(o2, windowInsets);
    }

    @Override // C.E, C.K
    public final void d(View view) {
    }

    @Override // C.E, C.K
    public boolean n(int i4) {
        boolean isVisible;
        isVisible = this.f282c.isVisible(L.a(i4));
        return isVisible;
    }
}
