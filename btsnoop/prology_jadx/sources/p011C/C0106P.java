package p011C;

/* renamed from: C.P */
/* loaded from: classes.dex */
public final class C0106P extends p080U1.AbstractC0748a {

    /* renamed from: g */
    public final android.view.Window f303g;

    public C0106P(android.view.Window window) {
        this.f303g = window;
    }

    @Override // p080U1.AbstractC0748a
    /* renamed from: A */
    public final void mo398A(boolean z4) {
        android.view.Window window = this.f303g;
        if (!z4) {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // p080U1.AbstractC0748a
    /* renamed from: B */
    public final void mo399B(boolean z4) {
        android.view.Window window = this.f303g;
        if (!z4) {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
