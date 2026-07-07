package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends p152k1.AbstractC1780s {

    /* renamed from: h */
    public final int f4459h;

    /* renamed from: i */
    public final p123e1.C1325G[] f4460i;

    /* renamed from: j */
    public final p021E0.AbstractC0193e f4461j;

    /* renamed from: k */
    public final p021E0.AbstractC0193e f4462k;

    /* renamed from: l */
    public final int f4463l;

    /* renamed from: m */
    public final boolean f4464m;

    /* renamed from: n */
    public final boolean f4465n = false;

    /* renamed from: o */
    public final p056O.C0479g f4466o;

    /* renamed from: p */
    public final int f4467p;

    /* renamed from: q */
    public p152k1.C1760H f4468q;

    /* renamed from: r */
    public final boolean f4469r;

    /* renamed from: s */
    public final p024F.RunnableC0199b f4470s;

    /* JADX WARN: Type inference failed for: r1v0, types: [O.g, java.lang.Object] */
    public StaggeredGridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i4, int i5) {
        this.f4459h = -1;
        this.f4464m = false;
        ?? obj = new java.lang.Object();
        this.f4466o = obj;
        this.f4467p = 2;
        new android.graphics.Rect();
        new p025F1.C0215g(this);
        this.f4469r = true;
        this.f4470s = new p024F.RunnableC0199b(11, this);
        p152k1.C1771j m3733w = p152k1.AbstractC1780s.m3733w(context, attributeSet, i4, i5);
        int i6 = m3733w.f7279b;
        if (i6 != 0 && i6 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation.");
        }
        mo2697a(null);
        if (i6 != this.f4463l) {
            this.f4463l = i6;
            p021E0.AbstractC0193e abstractC0193e = this.f4461j;
            this.f4461j = this.f4462k;
            this.f4462k = abstractC0193e;
            m3737H();
        }
        int i7 = m3733w.f7280c;
        mo2697a(null);
        if (i7 != this.f4459h) {
            obj.f1395a = null;
            m3737H();
            this.f4459h = i7;
            new java.util.BitSet(this.f4459h);
            this.f4460i = new p123e1.C1325G[this.f4459h];
            for (int i8 = 0; i8 < this.f4459h; i8++) {
                this.f4460i[i8] = new p123e1.C1325G(this, i8);
            }
            m3737H();
        }
        boolean z4 = m3733w.f7281d;
        mo2697a(null);
        p152k1.C1760H c1760h = this.f4468q;
        if (c1760h != null && c1760h.f7224s != z4) {
            c1760h.f7224s = z4;
        }
        this.f4464m = z4;
        m3737H();
        p011C.C0118j c0118j = new p011C.C0118j(6);
        c0118j.f326b = 0;
        c0118j.f327c = 0;
        this.f4461j = p021E0.AbstractC0193e.m548b(this, this.f4463l);
        this.f4462k = p021E0.AbstractC0193e.m548b(this, 1 - this.f4463l);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: A */
    public final void mo2687A(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo2687A(accessibilityEvent);
        if (m3740p() > 0) {
            android.view.View m2733O = m2733O(false);
            android.view.View m2732N = m2732N(false);
            if (m2733O == null || m2732N == null) {
                return;
            }
            ((p152k1.C1781t) m2733O.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: B */
    public final void mo2688B(android.os.Parcelable parcelable) {
        if (parcelable instanceof p152k1.C1760H) {
            this.f4468q = (p152k1.C1760H) parcelable;
            m3737H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k1.H, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [k1.H, android.os.Parcelable, java.lang.Object] */
    @Override // p152k1.AbstractC1780s
    /* renamed from: C */
    public final android.os.Parcelable mo2689C() {
        p152k1.C1760H c1760h = this.f4468q;
        if (c1760h != null) {
            ?? obj = new java.lang.Object();
            obj.f7219n = c1760h.f7219n;
            obj.f7217l = c1760h.f7217l;
            obj.f7218m = c1760h.f7218m;
            obj.f7220o = c1760h.f7220o;
            obj.f7221p = c1760h.f7221p;
            obj.f7222q = c1760h.f7222q;
            obj.f7224s = c1760h.f7224s;
            obj.f7225t = c1760h.f7225t;
            obj.f7226u = c1760h.f7226u;
            obj.f7223r = c1760h.f7223r;
            return obj;
        }
        ?? obj2 = new java.lang.Object();
        obj2.f7224s = this.f4464m;
        obj2.f7225t = false;
        obj2.f7226u = false;
        obj2.f7221p = 0;
        if (m3740p() > 0) {
            m2734P();
            obj2.f7217l = 0;
            android.view.View m2732N = this.f4465n ? m2732N(true) : m2733O(true);
            if (m2732N != null) {
                ((p152k1.C1781t) m2732N.getLayoutParams()).getClass();
                throw null;
            }
            obj2.f7218m = -1;
            int i4 = this.f4459h;
            obj2.f7219n = i4;
            obj2.f7220o = new int[i4];
            for (int i5 = 0; i5 < this.f4459h; i5++) {
                p123e1.C1325G c1325g = this.f4460i[i5];
                int i6 = c1325g.f5329a;
                if (i6 == Integer.MIN_VALUE) {
                    if (((java.util.ArrayList) c1325g.f5332d).size() == 0) {
                        i6 = Integer.MIN_VALUE;
                    } else {
                        android.view.View view = (android.view.View) ((java.util.ArrayList) c1325g.f5332d).get(0);
                        p152k1.C1758F c1758f = (p152k1.C1758F) view.getLayoutParams();
                        c1325g.f5329a = ((androidx.recyclerview.widget.StaggeredGridLayoutManager) c1325g.f5333e).f4461j.mo552e(view);
                        c1758f.getClass();
                        i6 = c1325g.f5329a;
                    }
                }
                if (i6 != Integer.MIN_VALUE) {
                    i6 -= this.f4461j.mo556i();
                }
                obj2.f7220o[i5] = i6;
            }
        } else {
            obj2.f7217l = -1;
            obj2.f7218m = -1;
            obj2.f7219n = 0;
        }
        return obj2;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: D */
    public final void mo2727D(int i4) {
        if (i4 == 0) {
            m2728J();
        }
    }

    /* renamed from: J */
    public final boolean m2728J() {
        int i4 = this.f4459h;
        boolean z4 = this.f4465n;
        if (m3740p() == 0 || this.f4467p == 0 || !this.f7297e) {
            return false;
        }
        if (z4) {
            m2735Q();
            m2734P();
        } else {
            m2734P();
            m2735Q();
        }
        int m3740p = m3740p();
        int i5 = m3740p - 1;
        new java.util.BitSet(i4).set(0, i4, true);
        if (this.f4463l == 1) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f7294b;
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z4) {
            m3740p = -1;
        } else {
            i5 = 0;
        }
        if (i5 == m3740p) {
            return false;
        }
        ((p152k1.C1758F) m3739o(i5).getLayoutParams()).getClass();
        throw null;
    }

    /* renamed from: K */
    public final int m2729K(p152k1.C1753A c1753a) {
        if (m3740p() == 0) {
            return 0;
        }
        p021E0.AbstractC0193e abstractC0193e = this.f4461j;
        boolean z4 = !this.f4469r;
        return p080U1.AbstractC0748a.m1374g(c1753a, abstractC0193e, m2733O(z4), m2732N(z4), this, this.f4469r);
    }

    /* renamed from: L */
    public final void m2730L(p152k1.C1753A c1753a) {
        if (m3740p() == 0) {
            return;
        }
        boolean z4 = !this.f4469r;
        android.view.View m2733O = m2733O(z4);
        android.view.View m2732N = m2732N(z4);
        if (m3740p() == 0 || c1753a.m3718a() == 0 || m2733O == null || m2732N == null) {
            return;
        }
        ((p152k1.C1781t) m2733O.getLayoutParams()).getClass();
        throw null;
    }

    /* renamed from: M */
    public final int m2731M(p152k1.C1753A c1753a) {
        if (m3740p() == 0) {
            return 0;
        }
        p021E0.AbstractC0193e abstractC0193e = this.f4461j;
        boolean z4 = !this.f4469r;
        return p080U1.AbstractC0748a.m1375h(c1753a, abstractC0193e, m2733O(z4), m2732N(z4), this, this.f4469r);
    }

    /* renamed from: N */
    public final android.view.View m2732N(boolean z4) {
        int mo556i = this.f4461j.mo556i();
        int mo553f = this.f4461j.mo553f();
        android.view.View view = null;
        for (int m3740p = m3740p() - 1; m3740p >= 0; m3740p--) {
            android.view.View m3739o = m3739o(m3740p);
            int mo552e = this.f4461j.mo552e(m3739o);
            int mo551d = this.f4461j.mo551d(m3739o);
            if (mo551d > mo556i && mo552e < mo553f) {
                if (mo551d <= mo553f || !z4) {
                    return m3739o;
                }
                if (view == null) {
                    view = m3739o;
                }
            }
        }
        return view;
    }

    /* renamed from: O */
    public final android.view.View m2733O(boolean z4) {
        int mo556i = this.f4461j.mo556i();
        int mo553f = this.f4461j.mo553f();
        int m3740p = m3740p();
        android.view.View view = null;
        for (int i4 = 0; i4 < m3740p; i4++) {
            android.view.View m3739o = m3739o(i4);
            int mo552e = this.f4461j.mo552e(m3739o);
            if (this.f4461j.mo551d(m3739o) > mo556i && mo552e < mo553f) {
                if (mo552e >= mo556i || !z4) {
                    return m3739o;
                }
                if (view == null) {
                    view = m3739o;
                }
            }
        }
        return view;
    }

    /* renamed from: P */
    public final void m2734P() {
        if (m3740p() == 0) {
            return;
        }
        p152k1.AbstractC1780s.m3732v(m3739o(0));
        throw null;
    }

    /* renamed from: Q */
    public final void m2735Q() {
        int m3740p = m3740p();
        if (m3740p == 0) {
            return;
        }
        p152k1.AbstractC1780s.m3732v(m3739o(m3740p - 1));
        throw null;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: a */
    public final void mo2697a(java.lang.String str) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (this.f4468q != null || (recyclerView = this.f7294b) == null) {
            return;
        }
        recyclerView.m2710b(str);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: b */
    public final boolean mo2698b() {
        return this.f4463l == 0;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: c */
    public final boolean mo2699c() {
        return this.f4463l == 1;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: d */
    public final boolean mo2681d(p152k1.C1781t c1781t) {
        return c1781t instanceof p152k1.C1758F;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: f */
    public final int mo2700f(p152k1.C1753A c1753a) {
        return m2729K(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: g */
    public final void mo2701g(p152k1.C1753A c1753a) {
        m2730L(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: h */
    public final int mo2702h(p152k1.C1753A c1753a) {
        return m2731M(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: i */
    public final int mo2703i(p152k1.C1753A c1753a) {
        return m2729K(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: j */
    public final void mo2704j(p152k1.C1753A c1753a) {
        m2730L(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: k */
    public final int mo2705k(p152k1.C1753A c1753a) {
        return m2731M(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: l */
    public final p152k1.C1781t mo2682l() {
        return this.f4463l == 0 ? new p152k1.C1781t(-2, -1) : new p152k1.C1781t(-1, -2);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: m */
    public final p152k1.C1781t mo2683m(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p152k1.C1781t(context, attributeSet);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: n */
    public final p152k1.C1781t mo2684n(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new p152k1.C1781t((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new p152k1.C1781t(layoutParams);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: q */
    public final int mo2685q(io.flutter.plugin.platform.C1580c c1580c, p152k1.C1753A c1753a) {
        if (this.f4463l == 1) {
            return this.f4459h;
        }
        super.mo2685q(c1580c, c1753a);
        return 1;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: x */
    public final int mo2686x(io.flutter.plugin.platform.C1580c c1580c, p152k1.C1753A c1753a) {
        if (this.f4463l == 0) {
            return this.f4459h;
        }
        super.mo2686x(c1580c, c1753a);
        return 1;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: y */
    public final boolean mo2706y() {
        return this.f4467p != 0;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: z */
    public final void mo2707z(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f7294b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f4470s);
        }
        for (int i4 = 0; i4 < this.f4459h; i4++) {
            p123e1.C1325G c1325g = this.f4460i[i4];
            ((java.util.ArrayList) c1325g.f5332d).clear();
            c1325g.f5329a = Integer.MIN_VALUE;
            c1325g.f5330b = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
