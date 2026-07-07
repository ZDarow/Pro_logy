package C;

import android.view.WindowInsets;
import u.C0574b;

/* loaded from: classes.dex */
public class F extends E {

    /* renamed from: n, reason: collision with root package name */
    public C0574b f288n;

    public F(O o2, WindowInsets windowInsets) {
        super(o2, windowInsets);
        this.f288n = null;
    }

    @Override // C.K
    public O b() {
        return O.c(null, this.f282c.consumeStableInsets());
    }

    @Override // C.K
    public O c() {
        return O.c(null, this.f282c.consumeSystemWindowInsets());
    }

    @Override // C.K
    public final C0574b g() {
        if (this.f288n == null) {
            WindowInsets windowInsets = this.f282c;
            this.f288n = C0574b.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f288n;
    }

    @Override // C.K
    public boolean l() {
        return this.f282c.isConsumed();
    }

    @Override // C.K
    public void q(C0574b c0574b) {
        this.f288n = c0574b;
    }
}
