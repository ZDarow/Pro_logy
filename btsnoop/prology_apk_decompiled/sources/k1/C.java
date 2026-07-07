package k1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class C implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public int f6941l;

    /* renamed from: m, reason: collision with root package name */
    public int f6942m;

    /* renamed from: n, reason: collision with root package name */
    public OverScroller f6943n;

    /* renamed from: o, reason: collision with root package name */
    public Interpolator f6944o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6945p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6946q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f6947r;

    public C(RecyclerView recyclerView) {
        this.f6947r = recyclerView;
        m mVar = RecyclerView.f4250v0;
        this.f6944o = mVar;
        this.f6945p = false;
        this.f6946q = false;
        this.f6943n = new OverScroller(recyclerView.getContext(), mVar);
    }

    public final void a() {
        if (this.f6945p) {
            this.f6946q = true;
            return;
        }
        RecyclerView recyclerView = this.f6947r;
        recyclerView.removeCallbacks(this);
        Field field = C.x.f330a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f6947r;
        if (recyclerView.f4298t == null) {
            recyclerView.removeCallbacks(this);
            this.f6943n.abortAnimation();
            return;
        }
        this.f6946q = false;
        this.f6945p = true;
        recyclerView.d();
        OverScroller overScroller = this.f6943n;
        recyclerView.f4298t.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.f6941l;
            int i5 = currY - this.f6942m;
            this.f6941l = currX;
            this.f6942m = currY;
            RecyclerView recyclerView2 = this.f6947r;
            int[] iArr = recyclerView.f4291o0;
            if (recyclerView2.f(i4, i5, 1, iArr, null)) {
                i4 -= iArr[0];
                i5 -= iArr[1];
            }
            if (!recyclerView.f4299u.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i4, i5);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z4 = (i4 == 0 && i5 == 0) || (i4 != 0 && recyclerView.f4298t.b() && i4 == 0) || (i5 != 0 && recyclerView.f4298t.c() && i5 == 0);
            if (overScroller.isFinished() || !(z4 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                A0.c cVar = recyclerView.f4280h0;
                cVar.getClass();
                cVar.f9c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0386h runnableC0386h = recyclerView.f4279g0;
                if (runnableC0386h != null) {
                    runnableC0386h.a(recyclerView, i4, i5);
                }
            }
        }
        this.f6945p = false;
        if (this.f6946q) {
            a();
        }
    }
}
