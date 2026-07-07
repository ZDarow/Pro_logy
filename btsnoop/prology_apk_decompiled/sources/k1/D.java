package k1;

import C.C0015b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class D extends C0015b {

    /* renamed from: d, reason: collision with root package name */
    public final E f6948d;

    public D(E e4) {
        this.f6948d = e4;
    }

    @Override // C.C0015b
    public final void b(View view, D.f fVar) {
        this.f302a.onInitializeAccessibilityNodeInfo(view, fVar.f417a);
        E e4 = this.f6948d;
        if (e4.f6949d.l()) {
            return;
        }
        RecyclerView recyclerView = e4.f6949d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // C.C0015b
    public final boolean c(View view, int i4, Bundle bundle) {
        if (super.c(view, i4, bundle)) {
            return true;
        }
        E e4 = this.f6948d;
        if (!e4.f6949d.l()) {
            RecyclerView recyclerView = e4.f6949d;
            if (recyclerView.getLayoutManager() != null) {
                io.flutter.plugin.platform.c cVar = recyclerView.getLayoutManager().f7028b.f4284l;
            }
        }
        return false;
    }
}
