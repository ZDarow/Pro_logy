package androidx.recyclerview.widget;

import B2.AbstractC0007h;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import f2.Y;
import io.flutter.plugin.platform.c;
import k1.C0378A;
import k1.C0387i;
import k1.s;
import k1.t;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f4237p;

    /* renamed from: q, reason: collision with root package name */
    public final Y f4238q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f4237p = -1;
        new SparseIntArray();
        new SparseIntArray();
        Y y4 = new Y(13);
        this.f4238q = y4;
        new Rect();
        int i6 = s.w(context, attributeSet, i4, i5).f7014c;
        if (i6 == this.f4237p) {
            return;
        }
        if (i6 < 1) {
            throw new IllegalArgumentException(AbstractC0007h.k("Span count should be at least 1. Provided ", i6));
        }
        this.f4237p = i6;
        ((SparseIntArray) y4.f5535m).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(c cVar, C0378A c0378a, int i4) {
        boolean z4 = c0378a.f6938c;
        Y y4 = this.f4238q;
        if (!z4) {
            int i5 = this.f4237p;
            y4.getClass();
            return Y.w(i4, i5);
        }
        RecyclerView recyclerView = (RecyclerView) cVar.f6334q;
        if (i4 < 0 || i4 >= recyclerView.f4281i0.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + recyclerView.f4281i0.a() + recyclerView.h());
        }
        int d02 = !recyclerView.f4281i0.f6938c ? i4 : recyclerView.f4288n.d0(i4, 0);
        if (d02 != -1) {
            int i6 = this.f4237p;
            y4.getClass();
            return Y.w(d02, i6);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    @Override // k1.s
    public final boolean d(t tVar) {
        return tVar instanceof C0387i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k1.s
    public final t l() {
        return this.f4239h == 0 ? new t(-2, -1) : new t(-1, -2);
    }

    @Override // k1.s
    public final t m(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @Override // k1.s
    public final t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new t((ViewGroup.MarginLayoutParams) layoutParams) : new t(layoutParams);
    }

    @Override // k1.s
    public final int q(c cVar, C0378A c0378a) {
        if (this.f4239h == 1) {
            return this.f4237p;
        }
        if (c0378a.a() < 1) {
            return 0;
        }
        return R(cVar, c0378a, c0378a.a() - 1) + 1;
    }

    @Override // k1.s
    public final int x(c cVar, C0378A c0378a) {
        if (this.f4239h == 0) {
            return this.f4237p;
        }
        if (c0378a.a() < 1) {
            return 0;
        }
        return R(cVar, c0378a, c0378a.a() - 1) + 1;
    }
}
