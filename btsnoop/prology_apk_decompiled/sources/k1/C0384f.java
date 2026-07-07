package k1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: k1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384f {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f6978x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f6979y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f6980a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f6981b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f6982c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6983d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6984e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f6985f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f6986g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6987h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6988i;

    /* renamed from: j, reason: collision with root package name */
    public float f6989j;

    /* renamed from: k, reason: collision with root package name */
    public float f6990k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f6993n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f6999u;

    /* renamed from: v, reason: collision with root package name */
    public int f7000v;
    public final F.b w;

    /* renamed from: l, reason: collision with root package name */
    public int f6991l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f6992m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6994o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6995p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f6996q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f6997r = 0;
    public final int[] s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f6998t = new int[2];

    public C0384f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6999u = ofFloat;
        this.f7000v = 0;
        F.b bVar = new F.b(9, this);
        this.w = bVar;
        Object obj = new Object();
        this.f6981b = stateListDrawable;
        this.f6982c = drawable;
        this.f6985f = stateListDrawable2;
        this.f6986g = drawable2;
        this.f6983d = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f6984e = Math.max(i4, drawable.getIntrinsicWidth());
        this.f6987h = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f6988i = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f6980a = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0382d(this));
        ofFloat.addUpdateListener(new C0383e(this));
        RecyclerView recyclerView2 = this.f6993n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            s sVar = recyclerView2.f4298t;
            if (sVar != null) {
                sVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f4299u;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f6993n;
            recyclerView3.f4300v.remove(this);
            if (recyclerView3.w == this) {
                recyclerView3.w = null;
            }
            ArrayList arrayList2 = this.f6993n.f4282j0;
            if (arrayList2 != null) {
                arrayList2.remove(obj);
            }
            this.f6993n.removeCallbacks(bVar);
        }
        this.f6993n = recyclerView;
        if (recyclerView != null) {
            s sVar2 = recyclerView.f4298t;
            if (sVar2 != null) {
                sVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f4299u;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f6993n.f4300v.add(this);
            RecyclerView recyclerView4 = this.f6993n;
            if (recyclerView4.f4282j0 == null) {
                recyclerView4.f4282j0 = new ArrayList();
            }
            recyclerView4.f4282j0.add(obj);
        }
    }

    public static int d(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
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

    public final boolean a(float f4, float f5) {
        return f5 >= ((float) (this.f6992m - this.f6987h)) && f4 >= ((float) (0 - (0 / 2))) && f4 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f4, float f5) {
        RecyclerView recyclerView = this.f6993n;
        Field field = C.x.f330a;
        boolean z4 = recyclerView.getLayoutDirection() == 1;
        int i4 = this.f6983d;
        if (z4) {
            if (f4 > i4 / 2) {
                return false;
            }
        } else if (f4 < this.f6991l - i4) {
            return false;
        }
        int i5 = 0 / 2;
        return f5 >= ((float) (0 - i5)) && f5 <= ((float) (i5 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i4 = this.f6996q;
        if (i4 == 1) {
            boolean b4 = b(motionEvent.getX(), motionEvent.getY());
            boolean a4 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b4 && !a4) {
                return false;
            }
            if (a4) {
                this.f6997r = 1;
                this.f6990k = (int) motionEvent.getX();
            } else if (b4) {
                this.f6997r = 2;
                this.f6989j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i4 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i4) {
        F.b bVar = this.w;
        StateListDrawable stateListDrawable = this.f6981b;
        if (i4 == 2 && this.f6996q != 2) {
            stateListDrawable.setState(f6978x);
            this.f6993n.removeCallbacks(bVar);
        }
        if (i4 == 0) {
            this.f6993n.invalidate();
        } else {
            f();
        }
        if (this.f6996q == 2 && i4 != 2) {
            stateListDrawable.setState(f6979y);
            this.f6993n.removeCallbacks(bVar);
            this.f6993n.postDelayed(bVar, 1200);
        } else if (i4 == 1) {
            this.f6993n.removeCallbacks(bVar);
            this.f6993n.postDelayed(bVar, 1500);
        }
        this.f6996q = i4;
    }

    public final void f() {
        int i4 = this.f7000v;
        ValueAnimator valueAnimator = this.f6999u;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7000v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
