package p152k1;

/* renamed from: k1.s */
/* loaded from: classes.dex */
public abstract class AbstractC1780s {

    /* renamed from: a */
    public android.support.v4.media.session.C1061t f7293a;

    /* renamed from: b */
    public androidx.recyclerview.widget.RecyclerView f7294b;

    /* renamed from: c */
    public final p094Y.C0886x f7295c;

    /* renamed from: d */
    public final p094Y.C0886x f7296d;

    /* renamed from: e */
    public boolean f7297e;

    /* renamed from: f */
    public int f7298f;

    /* renamed from: g */
    public int f7299g;

    public AbstractC1780s() {
        p152k1.C1779r c1779r = new p152k1.C1779r(this, 0);
        p152k1.C1779r c1779r2 = new p152k1.C1779r(this, 1);
        this.f7295c = new p094Y.C0886x(c1779r);
        this.f7296d = new p094Y.C0886x(c1779r2);
        this.f7297e = false;
    }

    /* renamed from: e */
    public static int m3731e(int i4, int i5, int i6) {
        int mode = android.view.View.MeasureSpec.getMode(i4);
        int size = android.view.View.MeasureSpec.getSize(i4);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? java.lang.Math.max(i5, i6) : size : java.lang.Math.min(size, java.lang.Math.max(i5, i6));
    }

    /* renamed from: v */
    public static void m3732v(android.view.View view) {
        ((p152k1.C1781t) view.getLayoutParams()).getClass();
        throw null;
    }

    /* renamed from: w */
    public static p152k1.C1771j m3733w(android.content.Context context, android.util.AttributeSet attributeSet, int i4, int i5) {
        p152k1.C1771j c1771j = new p152k1.C1771j(1);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p147j1.AbstractC1723a.f7182a, i4, i5);
        c1771j.f7279b = obtainStyledAttributes.getInt(0, 1);
        c1771j.f7280c = obtainStyledAttributes.getInt(9, 1);
        c1771j.f7281d = obtainStyledAttributes.getBoolean(8, false);
        c1771j.f7282e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c1771j;
    }

    /* renamed from: A */
    public void mo2687A(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7294b;
        io.flutter.plugin.platform.C1580c c1580c = recyclerView.f4437l;
        p152k1.C1753A c1753a = recyclerView.f4434i0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7294b.canScrollVertically(-1) && !this.f7294b.canScrollHorizontally(-1) && !this.f7294b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        this.f7294b.getClass();
    }

    /* renamed from: B */
    public abstract void mo2688B(android.os.Parcelable parcelable);

    /* renamed from: C */
    public abstract android.os.Parcelable mo2689C();

    /* renamed from: D */
    public void mo2727D(int i4) {
    }

    /* renamed from: E */
    public final void m3734E() {
        int m3740p = m3740p() - 1;
        if (m3740p < 0) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.m2709j(m3739o(m3740p));
        throw null;
    }

    /* renamed from: F */
    public final void m3735F(io.flutter.plugin.platform.C1580c c1580c) {
        int size = ((java.util.ArrayList) c1580c.f6566n).size();
        int i4 = size - 1;
        java.util.ArrayList arrayList = (java.util.ArrayList) c1580c.f6566n;
        if (i4 >= 0) {
            arrayList.get(i4).getClass();
            throw new java.lang.ClassCastException();
        }
        arrayList.clear();
        if (size > 0) {
            this.f7294b.invalidate();
        }
    }

    /* renamed from: G */
    public final boolean m3736G(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z4, boolean z5) {
        int m3742s = m3742s();
        int m3744u = m3744u();
        int m3743t = this.f7298f - m3743t();
        int m3741r = this.f7299g - m3741r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i4 = left - m3742s;
        int min = java.lang.Math.min(0, i4);
        int i5 = top - m3744u;
        int min2 = java.lang.Math.min(0, i5);
        int i6 = width - m3743t;
        int max = java.lang.Math.max(0, i6);
        int max2 = java.lang.Math.max(0, height - m3741r);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f7294b;
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = java.lang.Math.min(i4, max);
            }
            max = min;
        } else if (max == 0) {
            max = java.lang.Math.max(min, i6);
        }
        if (min2 == 0) {
            min2 = java.lang.Math.min(i5, max2);
        }
        int[] iArr = {max, min2};
        int i7 = iArr[0];
        int i8 = iArr[1];
        if (z5) {
            android.view.View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int m3742s2 = m3742s();
            int m3744u2 = m3744u();
            int m3743t2 = this.f7298f - m3743t();
            int m3741r2 = this.f7299g - m3741r();
            android.graphics.Rect rect2 = this.f7294b.f4449r;
            int[] iArr2 = androidx.recyclerview.widget.RecyclerView.f4399s0;
            p152k1.C1781t c1781t = (p152k1.C1781t) focusedChild.getLayoutParams();
            android.graphics.Rect rect3 = c1781t.f7300a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((android.view.ViewGroup.MarginLayoutParams) c1781t).leftMargin, (focusedChild.getTop() - rect3.top) - ((android.view.ViewGroup.MarginLayoutParams) c1781t).topMargin, focusedChild.getRight() + rect3.right + ((android.view.ViewGroup.MarginLayoutParams) c1781t).rightMargin, focusedChild.getBottom() + rect3.bottom + ((android.view.ViewGroup.MarginLayoutParams) c1781t).bottomMargin);
            if (rect2.left - i7 >= m3743t2 || rect2.right - i7 <= m3742s2 || rect2.top - i8 >= m3741r2 || rect2.bottom - i8 <= m3744u2) {
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
        recyclerView.m2725r(i7, i8);
        return true;
    }

    /* renamed from: H */
    public final void m3737H() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7294b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: I */
    public final void m3738I(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7294b = null;
            this.f7293a = null;
            this.f7298f = 0;
            this.f7299g = 0;
            return;
        }
        this.f7294b = recyclerView;
        this.f7293a = recyclerView.f4443o;
        this.f7298f = recyclerView.getWidth();
        this.f7299g = recyclerView.getHeight();
    }

    /* renamed from: a */
    public abstract void mo2697a(java.lang.String str);

    /* renamed from: b */
    public abstract boolean mo2698b();

    /* renamed from: c */
    public abstract boolean mo2699c();

    /* renamed from: d */
    public boolean mo2681d(p152k1.C1781t c1781t) {
        return c1781t != null;
    }

    /* renamed from: f */
    public abstract int mo2700f(p152k1.C1753A c1753a);

    /* renamed from: g */
    public abstract void mo2701g(p152k1.C1753A c1753a);

    /* renamed from: h */
    public abstract int mo2702h(p152k1.C1753A c1753a);

    /* renamed from: i */
    public abstract int mo2703i(p152k1.C1753A c1753a);

    /* renamed from: j */
    public abstract void mo2704j(p152k1.C1753A c1753a);

    /* renamed from: k */
    public abstract int mo2705k(p152k1.C1753A c1753a);

    /* renamed from: l */
    public abstract p152k1.C1781t mo2682l();

    /* renamed from: m */
    public p152k1.C1781t mo2683m(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p152k1.C1781t(context, attributeSet);
    }

    /* renamed from: n */
    public p152k1.C1781t mo2684n(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p152k1.C1781t ? new p152k1.C1781t((p152k1.C1781t) layoutParams) : layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new p152k1.C1781t((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new p152k1.C1781t(layoutParams);
    }

    /* renamed from: o */
    public final android.view.View m3739o(int i4) {
        android.support.v4.media.session.C1061t c1061t = this.f7293a;
        if (c1061t == null) {
            return null;
        }
        int i5 = -1;
        if (i4 >= 0) {
            int childCount = ((androidx.recyclerview.widget.RecyclerView) ((p129f2.C1408Y) c1061t.f3861m).f5729m).getChildCount();
            int i6 = i4;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                p028G0.C0235c c0235c = (p028G0.C0235c) c1061t.f3862n;
                int m619C = i4 - (i6 - c0235c.m619C(i6));
                if (m619C == 0) {
                    i5 = i6;
                    while (c0235c.m622F(i5)) {
                        i5++;
                    }
                } else {
                    i6 += m619C;
                }
            }
        }
        return ((androidx.recyclerview.widget.RecyclerView) ((p129f2.C1408Y) c1061t.f3861m).f5729m).getChildAt(i5);
    }

    /* renamed from: p */
    public final int m3740p() {
        android.support.v4.media.session.C1061t c1061t = this.f7293a;
        if (c1061t != null) {
            return ((androidx.recyclerview.widget.RecyclerView) ((p129f2.C1408Y) c1061t.f3861m).f5729m).getChildCount() - ((java.util.ArrayList) c1061t.f3863o).size();
        }
        return 0;
    }

    /* renamed from: q */
    public int mo2685q(io.flutter.plugin.platform.C1580c c1580c, p152k1.C1753A c1753a) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7294b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    /* renamed from: r */
    public final int m3741r() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7294b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: s */
    public final int m3742s() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7294b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: t */
    public final int m3743t() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7294b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: u */
    public final int m3744u() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7294b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: x */
    public int mo2686x(io.flutter.plugin.platform.C1580c c1580c, p152k1.C1753A c1753a) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7294b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    /* renamed from: y */
    public abstract boolean mo2706y();

    /* renamed from: z */
    public abstract void mo2707z(androidx.recyclerview.widget.RecyclerView recyclerView);
}
