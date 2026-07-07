package androidx.recyclerview.widget;

import B2.AbstractC0007h;
import E0.e;
import F1.g;
import U1.a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import k1.C0378A;
import k1.j;
import k1.k;
import k1.s;
import k1.t;

/* loaded from: classes.dex */
public class LinearLayoutManager extends s {

    /* renamed from: h, reason: collision with root package name */
    public final int f4239h;

    /* renamed from: i, reason: collision with root package name */
    public g f4240i;

    /* renamed from: j, reason: collision with root package name */
    public final e f4241j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4242k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4243l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4244m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4245n = true;

    /* renamed from: o, reason: collision with root package name */
    public k f4246o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f4239h = 1;
        this.f4242k = false;
        j jVar = new j(0);
        jVar.f7013b = -1;
        jVar.f7014c = Integer.MIN_VALUE;
        jVar.f7015d = false;
        jVar.f7016e = false;
        j w = s.w(context, attributeSet, i4, i5);
        int i6 = w.f7013b;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(AbstractC0007h.k("invalid orientation:", i6));
        }
        a(null);
        if (i6 != this.f4239h || this.f4241j == null) {
            this.f4241j = e.b(this, i6);
            this.f4239h = i6;
            H();
        }
        boolean z4 = w.f7015d;
        a(null);
        if (z4 != this.f4242k) {
            this.f4242k = z4;
            H();
        }
        Q(w.f7016e);
    }

    @Override // k1.s
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P3 = P(0, p(), false);
            if (P3 != null) {
                ((t) P3.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P4 = P(p() - 1, -1, false);
            if (P4 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((t) P4.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // k1.s
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof k) {
            this.f4246o = (k) parcelable;
            H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k1.k, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [k1.k, android.os.Parcelable, java.lang.Object] */
    @Override // k1.s
    public final Parcelable C() {
        k kVar = this.f4246o;
        if (kVar != null) {
            ?? obj = new Object();
            obj.f7017l = kVar.f7017l;
            obj.f7018m = kVar.f7018m;
            obj.f7019n = kVar.f7019n;
            return obj;
        }
        ?? obj2 = new Object();
        if (p() <= 0) {
            obj2.f7017l = -1;
            return obj2;
        }
        M();
        boolean z4 = this.f4243l;
        obj2.f7019n = z4;
        if (!z4) {
            s.v(o(z4 ? p() - 1 : 0));
            throw null;
        }
        View o2 = o(z4 ? 0 : p() - 1);
        obj2.f7018m = this.f4241j.f() - this.f4241j.d(o2);
        s.v(o2);
        throw null;
    }

    public final int J(C0378A c0378a) {
        if (p() == 0) {
            return 0;
        }
        M();
        e eVar = this.f4241j;
        boolean z4 = !this.f4245n;
        return a.g(c0378a, eVar, O(z4), N(z4), this, this.f4245n);
    }

    public final void K(C0378A c0378a) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z4 = !this.f4245n;
        View O3 = O(z4);
        View N3 = N(z4);
        if (p() == 0 || c0378a.a() == 0 || O3 == null || N3 == null) {
            return;
        }
        ((t) O3.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(C0378A c0378a) {
        if (p() == 0) {
            return 0;
        }
        M();
        e eVar = this.f4241j;
        boolean z4 = !this.f4245n;
        return a.h(c0378a, eVar, O(z4), N(z4), this, this.f4245n);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [F1.g, java.lang.Object] */
    public final void M() {
        if (this.f4240i == null) {
            this.f4240i = new Object();
        }
    }

    public final View N(boolean z4) {
        return this.f4243l ? P(0, p(), z4) : P(p() - 1, -1, z4);
    }

    public final View O(boolean z4) {
        return this.f4243l ? P(p() - 1, -1, z4) : P(0, p(), z4);
    }

    public final View P(int i4, int i5, boolean z4) {
        M();
        int i6 = z4 ? 24579 : 320;
        return this.f4239h == 0 ? this.f7029c.P(i4, i5, i6, 320) : this.f7030d.P(i4, i5, i6, 320);
    }

    public void Q(boolean z4) {
        a(null);
        if (this.f4244m == z4) {
            return;
        }
        this.f4244m = z4;
        H();
    }

    @Override // k1.s
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f4246o != null || (recyclerView = this.f7028b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // k1.s
    public final boolean b() {
        return this.f4239h == 0;
    }

    @Override // k1.s
    public final boolean c() {
        return this.f4239h == 1;
    }

    @Override // k1.s
    public final int f(C0378A c0378a) {
        return J(c0378a);
    }

    @Override // k1.s
    public final void g(C0378A c0378a) {
        K(c0378a);
    }

    @Override // k1.s
    public final int h(C0378A c0378a) {
        return L(c0378a);
    }

    @Override // k1.s
    public final int i(C0378A c0378a) {
        return J(c0378a);
    }

    @Override // k1.s
    public final void j(C0378A c0378a) {
        K(c0378a);
    }

    @Override // k1.s
    public final int k(C0378A c0378a) {
        return L(c0378a);
    }

    @Override // k1.s
    public t l() {
        return new t(-2, -2);
    }

    @Override // k1.s
    public final boolean y() {
        return true;
    }

    @Override // k1.s
    public final void z(RecyclerView recyclerView) {
    }
}
