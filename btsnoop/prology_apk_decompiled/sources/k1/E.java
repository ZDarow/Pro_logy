package k1;

import C.C0015b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class E extends C0015b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f6949d;

    public E(RecyclerView recyclerView) {
        this.f6949d = recyclerView;
        new D(this);
    }

    @Override // C.C0015b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f6949d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // C.C0015b
    public final void b(View view, D.f fVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f302a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f417a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f6949d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        s layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7028b;
        io.flutter.plugin.platform.c cVar = recyclerView2.f4284l;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f7028b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f7028b.canScrollVertically(1) || layoutManager.f7028b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C0378A c0378a = recyclerView2.f4281i0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(cVar, c0378a), layoutManager.q(cVar, c0378a), false, 0));
    }

    @Override // C.C0015b
    public final boolean c(View view, int i4, Bundle bundle) {
        int u4;
        int s;
        if (super.c(view, i4, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f6949d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        s layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7028b;
        io.flutter.plugin.platform.c cVar = recyclerView2.f4284l;
        if (i4 == 4096) {
            u4 = recyclerView2.canScrollVertically(1) ? (layoutManager.f7033g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f7028b.canScrollHorizontally(1)) {
                s = (layoutManager.f7032f - layoutManager.s()) - layoutManager.t();
            }
            s = 0;
        } else if (i4 != 8192) {
            s = 0;
            u4 = 0;
        } else {
            u4 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f7033g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f7028b.canScrollHorizontally(-1)) {
                s = -((layoutManager.f7032f - layoutManager.s()) - layoutManager.t());
            }
            s = 0;
        }
        if (u4 == 0 && s == 0) {
            return false;
        }
        layoutManager.f7028b.r(s, u4);
        return true;
    }
}
