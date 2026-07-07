package androidx.recyclerview.widget;

import C.C0023j;
import C.x;
import E0.e;
import F.b;
import O.g;
import U1.a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import e1.G;
import io.flutter.plugin.platform.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.BitSet;
import k1.C0378A;
import k1.F;
import k1.H;
import k1.j;
import k1.s;
import k1.t;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends s {

    /* renamed from: h, reason: collision with root package name */
    public final int f4304h;

    /* renamed from: i, reason: collision with root package name */
    public final G[] f4305i;

    /* renamed from: j, reason: collision with root package name */
    public final e f4306j;

    /* renamed from: k, reason: collision with root package name */
    public final e f4307k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4308l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4309m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4310n = false;

    /* renamed from: o, reason: collision with root package name */
    public final g f4311o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4312p;

    /* renamed from: q, reason: collision with root package name */
    public H f4313q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4314r;
    public final b s;

    /* JADX WARN: Type inference failed for: r1v0, types: [O.g, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f4304h = -1;
        this.f4309m = false;
        ?? obj = new Object();
        this.f4311o = obj;
        this.f4312p = 2;
        new Rect();
        new F1.g(this);
        this.f4314r = true;
        this.s = new b(11, this);
        j w = s.w(context, attributeSet, i4, i5);
        int i6 = w.f7013b;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i6 != this.f4308l) {
            this.f4308l = i6;
            e eVar = this.f4306j;
            this.f4306j = this.f4307k;
            this.f4307k = eVar;
            H();
        }
        int i7 = w.f7014c;
        a(null);
        if (i7 != this.f4304h) {
            obj.f1349a = null;
            H();
            this.f4304h = i7;
            new BitSet(this.f4304h);
            this.f4305i = new G[this.f4304h];
            for (int i8 = 0; i8 < this.f4304h; i8++) {
                this.f4305i[i8] = new G(this, i8);
            }
            H();
        }
        boolean z4 = w.f7015d;
        a(null);
        H h4 = this.f4313q;
        if (h4 != null && h4.s != z4) {
            h4.s = z4;
        }
        this.f4309m = z4;
        H();
        C0023j c0023j = new C0023j(6);
        c0023j.f320b = 0;
        c0023j.f321c = 0;
        this.f4306j = e.b(this, this.f4308l);
        this.f4307k = e.b(this, 1 - this.f4308l);
    }

    @Override // k1.s
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O3 = O(false);
            View N3 = N(false);
            if (O3 == null || N3 == null) {
                return;
            }
            ((t) O3.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // k1.s
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof H) {
            this.f4313q = (H) parcelable;
            H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k1.H, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [k1.H, android.os.Parcelable, java.lang.Object] */
    @Override // k1.s
    public final Parcelable C() {
        H h4 = this.f4313q;
        if (h4 != null) {
            ?? obj = new Object();
            obj.f6956n = h4.f6956n;
            obj.f6954l = h4.f6954l;
            obj.f6955m = h4.f6955m;
            obj.f6957o = h4.f6957o;
            obj.f6958p = h4.f6958p;
            obj.f6959q = h4.f6959q;
            obj.s = h4.s;
            obj.f6961t = h4.f6961t;
            obj.f6962u = h4.f6962u;
            obj.f6960r = h4.f6960r;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.s = this.f4309m;
        obj2.f6961t = false;
        obj2.f6962u = false;
        obj2.f6958p = 0;
        if (p() > 0) {
            P();
            obj2.f6954l = 0;
            View N3 = this.f4310n ? N(true) : O(true);
            if (N3 != null) {
                ((t) N3.getLayoutParams()).getClass();
                throw null;
            }
            obj2.f6955m = -1;
            int i4 = this.f4304h;
            obj2.f6956n = i4;
            obj2.f6957o = new int[i4];
            for (int i5 = 0; i5 < this.f4304h; i5++) {
                G g4 = this.f4305i[i5];
                int i6 = g4.f5140a;
                if (i6 == Integer.MIN_VALUE) {
                    if (((ArrayList) g4.f5143d).size() == 0) {
                        i6 = Integer.MIN_VALUE;
                    } else {
                        View view = (View) ((ArrayList) g4.f5143d).get(0);
                        F f4 = (F) view.getLayoutParams();
                        g4.f5140a = ((StaggeredGridLayoutManager) g4.f5144e).f4306j.e(view);
                        f4.getClass();
                        i6 = g4.f5140a;
                    }
                }
                if (i6 != Integer.MIN_VALUE) {
                    i6 -= this.f4306j.i();
                }
                obj2.f6957o[i5] = i6;
            }
        } else {
            obj2.f6954l = -1;
            obj2.f6955m = -1;
            obj2.f6956n = 0;
        }
        return obj2;
    }

    @Override // k1.s
    public final void D(int i4) {
        if (i4 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i4 = this.f4304h;
        boolean z4 = this.f4310n;
        if (p() == 0 || this.f4312p == 0 || !this.f7031e) {
            return false;
        }
        if (z4) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p2 = p();
        int i5 = p2 - 1;
        new BitSet(i4).set(0, i4, true);
        if (this.f4308l == 1) {
            RecyclerView recyclerView = this.f7028b;
            Field field = x.f330a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z4) {
            p2 = -1;
        } else {
            i5 = 0;
        }
        if (i5 == p2) {
            return false;
        }
        ((F) o(i5).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(C0378A c0378a) {
        if (p() == 0) {
            return 0;
        }
        e eVar = this.f4306j;
        boolean z4 = !this.f4314r;
        return a.g(c0378a, eVar, O(z4), N(z4), this, this.f4314r);
    }

    public final void L(C0378A c0378a) {
        if (p() == 0) {
            return;
        }
        boolean z4 = !this.f4314r;
        View O3 = O(z4);
        View N3 = N(z4);
        if (p() == 0 || c0378a.a() == 0 || O3 == null || N3 == null) {
            return;
        }
        ((t) O3.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(C0378A c0378a) {
        if (p() == 0) {
            return 0;
        }
        e eVar = this.f4306j;
        boolean z4 = !this.f4314r;
        return a.h(c0378a, eVar, O(z4), N(z4), this, this.f4314r);
    }

    public final View N(boolean z4) {
        int i4 = this.f4306j.i();
        int f4 = this.f4306j.f();
        View view = null;
        for (int p2 = p() - 1; p2 >= 0; p2--) {
            View o2 = o(p2);
            int e4 = this.f4306j.e(o2);
            int d4 = this.f4306j.d(o2);
            if (d4 > i4 && e4 < f4) {
                if (d4 <= f4 || !z4) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final View O(boolean z4) {
        int i4 = this.f4306j.i();
        int f4 = this.f4306j.f();
        int p2 = p();
        View view = null;
        for (int i5 = 0; i5 < p2; i5++) {
            View o2 = o(i5);
            int e4 = this.f4306j.e(o2);
            if (this.f4306j.d(o2) > i4 && e4 < f4) {
                if (e4 >= i4 || !z4) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        s.v(o(0));
        throw null;
    }

    public final void Q() {
        int p2 = p();
        if (p2 == 0) {
            return;
        }
        s.v(o(p2 - 1));
        throw null;
    }

    @Override // k1.s
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f4313q != null || (recyclerView = this.f7028b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // k1.s
    public final boolean b() {
        return this.f4308l == 0;
    }

    @Override // k1.s
    public final boolean c() {
        return this.f4308l == 1;
    }

    @Override // k1.s
    public final boolean d(t tVar) {
        return tVar instanceof F;
    }

    @Override // k1.s
    public final int f(C0378A c0378a) {
        return K(c0378a);
    }

    @Override // k1.s
    public final void g(C0378A c0378a) {
        L(c0378a);
    }

    @Override // k1.s
    public final int h(C0378A c0378a) {
        return M(c0378a);
    }

    @Override // k1.s
    public final int i(C0378A c0378a) {
        return K(c0378a);
    }

    @Override // k1.s
    public final void j(C0378A c0378a) {
        L(c0378a);
    }

    @Override // k1.s
    public final int k(C0378A c0378a) {
        return M(c0378a);
    }

    @Override // k1.s
    public final t l() {
        return this.f4308l == 0 ? new t(-2, -1) : new t(-1, -2);
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
        if (this.f4308l == 1) {
            return this.f4304h;
        }
        super.q(cVar, c0378a);
        return 1;
    }

    @Override // k1.s
    public final int x(c cVar, C0378A c0378a) {
        if (this.f4308l == 0) {
            return this.f4304h;
        }
        super.x(cVar, c0378a);
        return 1;
    }

    @Override // k1.s
    public final boolean y() {
        return this.f4312p != 0;
    }

    @Override // k1.s
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7028b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.s);
        }
        for (int i4 = 0; i4 < this.f4304h; i4++) {
            G g4 = this.f4305i[i4];
            ((ArrayList) g4.f5143d).clear();
            g4.f5140a = Integer.MIN_VALUE;
            g4.f5141b = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
