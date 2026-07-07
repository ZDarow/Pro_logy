package p152k1;

/* renamed from: k1.f */
/* loaded from: classes.dex */
public final class C1767f {

    /* renamed from: x */
    public static final int[] f7242x = {android.R.attr.state_pressed};

    /* renamed from: y */
    public static final int[] f7243y = new int[0];

    /* renamed from: a */
    public final int f7244a;

    /* renamed from: b */
    public final android.graphics.drawable.StateListDrawable f7245b;

    /* renamed from: c */
    public final android.graphics.drawable.Drawable f7246c;

    /* renamed from: d */
    public final int f7247d;

    /* renamed from: e */
    public final int f7248e;

    /* renamed from: f */
    public final android.graphics.drawable.StateListDrawable f7249f;

    /* renamed from: g */
    public final android.graphics.drawable.Drawable f7250g;

    /* renamed from: h */
    public final int f7251h;

    /* renamed from: i */
    public final int f7252i;

    /* renamed from: j */
    public float f7253j;

    /* renamed from: k */
    public float f7254k;

    /* renamed from: n */
    public final androidx.recyclerview.widget.RecyclerView f7257n;

    /* renamed from: u */
    public final android.animation.ValueAnimator f7264u;

    /* renamed from: v */
    public int f7265v;

    /* renamed from: w */
    public final p024F.RunnableC0199b f7266w;

    /* renamed from: l */
    public int f7255l = 0;

    /* renamed from: m */
    public int f7256m = 0;

    /* renamed from: o */
    public final boolean f7258o = false;

    /* renamed from: p */
    public final boolean f7259p = false;

    /* renamed from: q */
    public int f7260q = 0;

    /* renamed from: r */
    public int f7261r = 0;

    /* renamed from: s */
    public final int[] f7262s = new int[2];

    /* renamed from: t */
    public final int[] f7263t = new int[2];

    public C1767f(androidx.recyclerview.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i4, int i5, int i6) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7264u = ofFloat;
        this.f7265v = 0;
        p024F.RunnableC0199b runnableC0199b = new p024F.RunnableC0199b(9, this);
        this.f7266w = runnableC0199b;
        java.lang.Object obj = new java.lang.Object();
        this.f7245b = stateListDrawable;
        this.f7246c = drawable;
        this.f7249f = stateListDrawable2;
        this.f7250g = drawable2;
        this.f7247d = java.lang.Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f7248e = java.lang.Math.max(i4, drawable.getIntrinsicWidth());
        this.f7251h = java.lang.Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f7252i = java.lang.Math.max(i4, drawable2.getIntrinsicWidth());
        this.f7244a = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new p152k1.C1765d(this));
        ofFloat.addUpdateListener(new p152k1.C1766e(this));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f7257n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            p152k1.AbstractC1780s abstractC1780s = recyclerView2.f4452t;
            if (abstractC1780s != null) {
                abstractC1780s.mo2697a("Cannot remove item decoration during a scroll  or layout");
            }
            java.util.ArrayList arrayList = recyclerView2.f4453u;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m2720m();
            recyclerView2.requestLayout();
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f7257n;
            recyclerView3.f4454v.remove(this);
            if (recyclerView3.f4455w == this) {
                recyclerView3.f4455w = null;
            }
            java.util.ArrayList arrayList2 = this.f7257n.f4435j0;
            if (arrayList2 != null) {
                arrayList2.remove(obj);
            }
            this.f7257n.removeCallbacks(runnableC0199b);
        }
        this.f7257n = recyclerView;
        if (recyclerView != null) {
            p152k1.AbstractC1780s abstractC1780s2 = recyclerView.f4452t;
            if (abstractC1780s2 != null) {
                abstractC1780s2.mo2697a("Cannot add item decoration during a scroll  or layout");
            }
            java.util.ArrayList arrayList3 = recyclerView.f4453u;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m2720m();
            recyclerView.requestLayout();
            this.f7257n.f4454v.add(this);
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f7257n;
            if (recyclerView4.f4435j0 == null) {
                recyclerView4.f4435j0 = new java.util.ArrayList();
            }
            recyclerView4.f4435j0.add(obj);
        }
    }

    /* renamed from: d */
    public static int m3723d(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i4 - i6;
        int i9 = (int) (((f5 - f4) / i7) * i8);
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    /* renamed from: a */
    public final boolean m3724a(float f4, float f5) {
        return f5 >= ((float) (this.f7256m - this.f7251h)) && f4 >= ((float) (0 - (0 / 2))) && f4 <= ((float) ((0 / 2) + 0));
    }

    /* renamed from: b */
    public final boolean m3725b(float f4, float f5) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f7257n;
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        boolean z4 = recyclerView.getLayoutDirection() == 1;
        int i4 = this.f7247d;
        if (z4) {
            if (f4 > i4 / 2) {
                return false;
            }
        } else if (f4 < this.f7255l - i4) {
            return false;
        }
        int i5 = 0 / 2;
        return f5 >= ((float) (0 - i5)) && f5 <= ((float) (i5 + 0));
    }

    /* renamed from: c */
    public final boolean m3726c(android.view.MotionEvent motionEvent) {
        int i4 = this.f7260q;
        if (i4 == 1) {
            boolean m3725b = m3725b(motionEvent.getX(), motionEvent.getY());
            boolean m3724a = m3724a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m3725b && !m3724a) {
                return false;
            }
            if (m3724a) {
                this.f7261r = 1;
                this.f7254k = (int) motionEvent.getX();
            } else if (m3725b) {
                this.f7261r = 2;
                this.f7253j = (int) motionEvent.getY();
            }
            m3727e(2);
        } else if (i4 != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void m3727e(int i4) {
        p024F.RunnableC0199b runnableC0199b = this.f7266w;
        android.graphics.drawable.StateListDrawable stateListDrawable = this.f7245b;
        if (i4 == 2 && this.f7260q != 2) {
            stateListDrawable.setState(f7242x);
            this.f7257n.removeCallbacks(runnableC0199b);
        }
        if (i4 == 0) {
            this.f7257n.invalidate();
        } else {
            m3728f();
        }
        if (this.f7260q == 2 && i4 != 2) {
            stateListDrawable.setState(f7243y);
            this.f7257n.removeCallbacks(runnableC0199b);
            this.f7257n.postDelayed(runnableC0199b, 1200);
        } else if (i4 == 1) {
            this.f7257n.removeCallbacks(runnableC0199b);
            this.f7257n.postDelayed(runnableC0199b, 1500);
        }
        this.f7260q = i4;
    }

    /* renamed from: f */
    public final void m3728f() {
        int i4 = this.f7265v;
        android.animation.ValueAnimator valueAnimator = this.f7264u;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7265v = 1;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
