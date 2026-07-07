package C;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class P extends U1.a {

    /* renamed from: g, reason: collision with root package name */
    public final Window f297g;

    public P(Window window) {
        this.f297g = window;
    }

    @Override // U1.a
    public final void A(boolean z4) {
        Window window = this.f297g;
        if (!z4) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // U1.a
    public final void B(boolean z4) {
        Window window = this.f297g;
        if (!z4) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
