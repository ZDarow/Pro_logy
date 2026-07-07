package C;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class Q extends U1.a {

    /* renamed from: g, reason: collision with root package name */
    public final WindowInsetsController f298g;

    /* renamed from: h, reason: collision with root package name */
    public final Window f299h;

    public Q(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f298g = insetsController;
        this.f299h = window;
    }

    @Override // U1.a
    public final void A(boolean z4) {
        Window window = this.f299h;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f298g.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f298g.setSystemBarsAppearance(0, 16);
    }

    @Override // U1.a
    public final void B(boolean z4) {
        Window window = this.f299h;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f298g.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f298g.setSystemBarsAppearance(0, 8);
    }
}
