package p011C;

/* renamed from: C.Q */
/* loaded from: classes.dex */
public class C0107Q extends p080U1.AbstractC0748a {

    /* renamed from: g */
    public final android.view.WindowInsetsController f304g;

    /* renamed from: h */
    public final android.view.Window f305h;

    public C0107Q(android.view.Window window) {
        android.view.WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f304g = insetsController;
        this.f305h = window;
    }

    @Override // p080U1.AbstractC0748a
    /* renamed from: A */
    public final void mo398A(boolean z4) {
        android.view.Window window = this.f305h;
        if (z4) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f304g.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f304g.setSystemBarsAppearance(0, 16);
    }

    @Override // p080U1.AbstractC0748a
    /* renamed from: B */
    public final void mo399B(boolean z4) {
        android.view.Window window = this.f305h;
        if (z4) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f304g.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f304g.setSystemBarsAppearance(0, 8);
    }
}
