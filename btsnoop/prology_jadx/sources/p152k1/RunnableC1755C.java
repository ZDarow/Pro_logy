package p152k1;

/* renamed from: k1.C */
/* loaded from: classes.dex */
public final class RunnableC1755C implements java.lang.Runnable {

    /* renamed from: l */
    public int f7204l;

    /* renamed from: m */
    public int f7205m;

    /* renamed from: n */
    public android.widget.OverScroller f7206n;

    /* renamed from: o */
    public android.view.animation.Interpolator f7207o;

    /* renamed from: p */
    public boolean f7208p;

    /* renamed from: q */
    public boolean f7209q;

    /* renamed from: r */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f7210r;

    public RunnableC1755C(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f7210r = recyclerView;
        p152k1.InterpolatorC1774m interpolatorC1774m = androidx.recyclerview.widget.RecyclerView.f4402v0;
        this.f7207o = interpolatorC1774m;
        this.f7208p = false;
        this.f7209q = false;
        this.f7206n = new android.widget.OverScroller(recyclerView.getContext(), interpolatorC1774m);
    }

    /* renamed from: a */
    public final void m3719a() {
        if (this.f7208p) {
            this.f7209q = true;
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7210r;
        recyclerView.removeCallbacks(this);
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7210r;
        if (recyclerView.f4452t == null) {
            recyclerView.removeCallbacks(this);
            this.f7206n.abortAnimation();
            return;
        }
        this.f7209q = false;
        this.f7208p = true;
        recyclerView.m2712d();
        android.widget.OverScroller overScroller = this.f7206n;
        recyclerView.f4452t.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.f7204l;
            int i5 = currY - this.f7205m;
            this.f7204l = currX;
            this.f7205m = currY;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f7210r;
            int[] iArr = recyclerView.f4444o0;
            if (recyclerView2.m2714f(i4, i5, 1, iArr, null)) {
                i4 -= iArr[0];
                i5 -= iArr[1];
            }
            if (!recyclerView.f4453u.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m2711c(i4, i5);
            }
            recyclerView.m2715g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z4 = (i4 == 0 && i5 == 0) || (i4 != 0 && recyclerView.f4452t.mo2698b() && i4 == 0) || (i5 != 0 && recyclerView.f4452t.mo2699c() && i5 == 0);
            if (overScroller.isFinished() || !(z4 || recyclerView.m2718k())) {
                recyclerView.setScrollState(0);
                p002A0.C0005c c0005c = recyclerView.f4433h0;
                c0005c.getClass();
                c0005c.f9c = 0;
                recyclerView.m2726s(1);
            } else {
                m3719a();
                p152k1.RunnableC1769h runnableC1769h = recyclerView.f4432g0;
                if (runnableC1769h != null) {
                    runnableC1769h.m3729a(recyclerView, i4, i5);
                }
            }
        }
        this.f7208p = false;
        if (this.f7209q) {
            m3719a();
        }
    }
}
