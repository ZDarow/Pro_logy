package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import f2.Y;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public android.support.v4.media.session.t f7027a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f7028b;

    /* renamed from: c, reason: collision with root package name */
    public final Y.x f7029c;

    /* renamed from: d, reason: collision with root package name */
    public final Y.x f7030d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7031e;

    /* renamed from: f, reason: collision with root package name */
    public int f7032f;

    /* renamed from: g, reason: collision with root package name */
    public int f7033g;

    public s() {
        r rVar = new r(this, 0);
        r rVar2 = new r(this, 1);
        this.f7029c = new Y.x(rVar);
        this.f7030d = new Y.x(rVar2);
        this.f7031e = false;
    }

    public static int e(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
    }

    public static void v(View view) {
        ((t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static j w(Context context, AttributeSet attributeSet, int i4, int i5) {
        j jVar = new j(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.a.f6920a, i4, i5);
        jVar.f7013b = obtainStyledAttributes.getInt(0, 1);
        jVar.f7014c = obtainStyledAttributes.getInt(9, 1);
        jVar.f7015d = obtainStyledAttributes.getBoolean(8, false);
        jVar.f7016e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return jVar;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7028b;
        io.flutter.plugin.platform.c cVar = recyclerView.f4284l;
        C0378A c0378a = recyclerView.f4281i0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7028b.canScrollVertically(-1) && !this.f7028b.canScrollHorizontally(-1) && !this.f7028b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        this.f7028b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public void D(int i4) {
    }

    public final void E() {
        int p2 = p() - 1;
        if (p2 < 0) {
            return;
        }
        RecyclerView.j(o(p2));
        throw null;
    }

    public final void F(io.flutter.plugin.platform.c cVar) {
        int size = ((ArrayList) cVar.f6331n).size();
        int i4 = size - 1;
        ArrayList arrayList = (ArrayList) cVar.f6331n;
        if (i4 >= 0) {
            arrayList.get(i4).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        if (size > 0) {
            this.f7028b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        int s = s();
        int u4 = u();
        int t4 = this.f7032f - t();
        int r4 = this.f7033g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i4 = left - s;
        int min = Math.min(0, i4);
        int i5 = top - u4;
        int min2 = Math.min(0, i5);
        int i6 = width - t4;
        int max = Math.max(0, i6);
        int max2 = Math.max(0, height - r4);
        RecyclerView recyclerView2 = this.f7028b;
        Field field = C.x.f330a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i4, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i6);
        }
        if (min2 == 0) {
            min2 = Math.min(i5, max2);
        }
        int[] iArr = {max, min2};
        int i7 = iArr[0];
        int i8 = iArr[1];
        if (z5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s4 = s();
            int u5 = u();
            int t5 = this.f7032f - t();
            int r5 = this.f7033g - r();
            Rect rect2 = this.f7028b.f4296r;
            int[] iArr2 = RecyclerView.f4247s0;
            t tVar = (t) focusedChild.getLayoutParams();
            Rect rect3 = tVar.f7034a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) tVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) tVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) tVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) tVar).bottomMargin);
            if (rect2.left - i7 >= t5 || rect2.right - i7 <= s4 || rect2.top - i8 >= r5 || rect2.bottom - i8 <= u5) {
                return false;
            }
        }
        if (i7 == 0 && i8 == 0) {
            return false;
        }
        if (z4) {
            recyclerView.scrollBy(i7, i8);
            return true;
        }
        recyclerView.r(i7, i8);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f7028b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7028b = null;
            this.f7027a = null;
            this.f7032f = 0;
            this.f7033g = 0;
            return;
        }
        this.f7028b = recyclerView;
        this.f7027a = recyclerView.f4290o;
        this.f7032f = recyclerView.getWidth();
        this.f7033g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(t tVar) {
        return tVar != null;
    }

    public abstract int f(C0378A c0378a);

    public abstract void g(C0378A c0378a);

    public abstract int h(C0378A c0378a);

    public abstract int i(C0378A c0378a);

    public abstract void j(C0378A c0378a);

    public abstract int k(C0378A c0378a);

    public abstract t l();

    public t m(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t ? new t((t) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new t((ViewGroup.MarginLayoutParams) layoutParams) : new t(layoutParams);
    }

    public final View o(int i4) {
        android.support.v4.media.session.t tVar = this.f7027a;
        if (tVar == null) {
            return null;
        }
        int i5 = -1;
        if (i4 >= 0) {
            int childCount = ((RecyclerView) ((Y) tVar.f3734m).f5535m).getChildCount();
            int i6 = i4;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                G0.c cVar = (G0.c) tVar.f3735n;
                int C4 = i4 - (i6 - cVar.C(i6));
                if (C4 == 0) {
                    i5 = i6;
                    while (cVar.F(i5)) {
                        i5++;
                    }
                } else {
                    i6 += C4;
                }
            }
        }
        return ((RecyclerView) ((Y) tVar.f3734m).f5535m).getChildAt(i5);
    }

    public final int p() {
        android.support.v4.media.session.t tVar = this.f7027a;
        if (tVar != null) {
            return ((RecyclerView) ((Y) tVar.f3734m).f5535m).getChildCount() - ((ArrayList) tVar.f3736o).size();
        }
        return 0;
    }

    public int q(io.flutter.plugin.platform.c cVar, C0378A c0378a) {
        RecyclerView recyclerView = this.f7028b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f7028b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f7028b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f7028b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f7028b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(io.flutter.plugin.platform.c cVar, C0378A c0378a) {
        RecyclerView recyclerView = this.f7028b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);
}
