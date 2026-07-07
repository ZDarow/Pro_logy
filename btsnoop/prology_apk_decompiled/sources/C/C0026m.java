package C;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* renamed from: C.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0025l f323a;

    public C0026m(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f323a = new C0024k(nestedScrollView);
        } else {
            this.f323a = new L1.g(1, false);
        }
    }
}
