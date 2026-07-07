package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class LinearLayoutManager extends p152k1.AbstractC1780s {

    /* renamed from: h */
    public final int f4391h;

    /* renamed from: i */
    public p025F1.C0215g f4392i;

    /* renamed from: j */
    public final p021E0.AbstractC0193e f4393j;

    /* renamed from: k */
    public final boolean f4394k;

    /* renamed from: l */
    public final boolean f4395l = false;

    /* renamed from: m */
    public boolean f4396m = false;

    /* renamed from: n */
    public final boolean f4397n = true;

    /* renamed from: o */
    public p152k1.C1772k f4398o = null;

    public LinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i4, int i5) {
        this.f4391h = 1;
        this.f4394k = false;
        p152k1.C1771j c1771j = new p152k1.C1771j(0);
        c1771j.f7279b = -1;
        c1771j.f7280c = Integer.MIN_VALUE;
        c1771j.f7281d = false;
        c1771j.f7282e = false;
        p152k1.C1771j m3733w = p152k1.AbstractC1780s.m3733w(context, attributeSet, i4, i5);
        int i6 = m3733w.f7279b;
        if (i6 != 0 && i6 != 1) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("invalid orientation:", i6));
        }
        mo2697a(null);
        if (i6 != this.f4391h || this.f4393j == null) {
            this.f4393j = p021E0.AbstractC0193e.m548b(this, i6);
            this.f4391h = i6;
            m3737H();
        }
        boolean z4 = m3733w.f7281d;
        mo2697a(null);
        if (z4 != this.f4394k) {
            this.f4394k = z4;
            m3737H();
        }
        mo2679Q(m3733w.f7282e);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: A */
    public final void mo2687A(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo2687A(accessibilityEvent);
        if (m3740p() > 0) {
            android.view.View m2696P = m2696P(0, m3740p(), false);
            if (m2696P != null) {
                ((p152k1.C1781t) m2696P.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            android.view.View m2696P2 = m2696P(m3740p() - 1, -1, false);
            if (m2696P2 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((p152k1.C1781t) m2696P2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: B */
    public final void mo2688B(android.os.Parcelable parcelable) {
        if (parcelable instanceof p152k1.C1772k) {
            this.f4398o = (p152k1.C1772k) parcelable;
            m3737H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k1.k, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [k1.k, android.os.Parcelable, java.lang.Object] */
    @Override // p152k1.AbstractC1780s
    /* renamed from: C */
    public final android.os.Parcelable mo2689C() {
        p152k1.C1772k c1772k = this.f4398o;
        if (c1772k != null) {
            ?? obj = new java.lang.Object();
            obj.f7283l = c1772k.f7283l;
            obj.f7284m = c1772k.f7284m;
            obj.f7285n = c1772k.f7285n;
            return obj;
        }
        ?? obj2 = new java.lang.Object();
        if (m3740p() <= 0) {
            obj2.f7283l = -1;
            return obj2;
        }
        m2693M();
        boolean z4 = this.f4395l;
        obj2.f7285n = z4;
        if (!z4) {
            p152k1.AbstractC1780s.m3732v(m3739o(z4 ? m3740p() - 1 : 0));
            throw null;
        }
        android.view.View m3739o = m3739o(z4 ? 0 : m3740p() - 1);
        obj2.f7284m = this.f4393j.mo553f() - this.f4393j.mo551d(m3739o);
        p152k1.AbstractC1780s.m3732v(m3739o);
        throw null;
    }

    /* renamed from: J */
    public final int m2690J(p152k1.C1753A c1753a) {
        if (m3740p() == 0) {
            return 0;
        }
        m2693M();
        p021E0.AbstractC0193e abstractC0193e = this.f4393j;
        boolean z4 = !this.f4397n;
        return p080U1.AbstractC0748a.m1374g(c1753a, abstractC0193e, m2695O(z4), m2694N(z4), this, this.f4397n);
    }

    /* renamed from: K */
    public final void m2691K(p152k1.C1753A c1753a) {
        if (m3740p() == 0) {
            return;
        }
        m2693M();
        boolean z4 = !this.f4397n;
        android.view.View m2695O = m2695O(z4);
        android.view.View m2694N = m2694N(z4);
        if (m3740p() == 0 || c1753a.m3718a() == 0 || m2695O == null || m2694N == null) {
            return;
        }
        ((p152k1.C1781t) m2695O.getLayoutParams()).getClass();
        throw null;
    }

    /* renamed from: L */
    public final int m2692L(p152k1.C1753A c1753a) {
        if (m3740p() == 0) {
            return 0;
        }
        m2693M();
        p021E0.AbstractC0193e abstractC0193e = this.f4393j;
        boolean z4 = !this.f4397n;
        return p080U1.AbstractC0748a.m1375h(c1753a, abstractC0193e, m2695O(z4), m2694N(z4), this, this.f4397n);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [F1.g, java.lang.Object] */
    /* renamed from: M */
    public final void m2693M() {
        if (this.f4392i == null) {
            this.f4392i = new java.lang.Object();
        }
    }

    /* renamed from: N */
    public final android.view.View m2694N(boolean z4) {
        return this.f4395l ? m2696P(0, m3740p(), z4) : m2696P(m3740p() - 1, -1, z4);
    }

    /* renamed from: O */
    public final android.view.View m2695O(boolean z4) {
        return this.f4395l ? m2696P(m3740p() - 1, -1, z4) : m2696P(0, m3740p(), z4);
    }

    /* renamed from: P */
    public final android.view.View m2696P(int i4, int i5, boolean z4) {
        m2693M();
        int i6 = z4 ? 24579 : 320;
        return this.f4391h == 0 ? this.f7295c.m1712P(i4, i5, i6, 320) : this.f7296d.m1712P(i4, i5, i6, 320);
    }

    /* renamed from: Q */
    public void mo2679Q(boolean z4) {
        mo2697a(null);
        if (this.f4396m == z4) {
            return;
        }
        this.f4396m = z4;
        m3737H();
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: a */
    public final void mo2697a(java.lang.String str) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (this.f4398o != null || (recyclerView = this.f7294b) == null) {
            return;
        }
        recyclerView.m2710b(str);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: b */
    public final boolean mo2698b() {
        return this.f4391h == 0;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: c */
    public final boolean mo2699c() {
        return this.f4391h == 1;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: f */
    public final int mo2700f(p152k1.C1753A c1753a) {
        return m2690J(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: g */
    public final void mo2701g(p152k1.C1753A c1753a) {
        m2691K(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: h */
    public final int mo2702h(p152k1.C1753A c1753a) {
        return m2692L(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: i */
    public final int mo2703i(p152k1.C1753A c1753a) {
        return m2690J(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: j */
    public final void mo2704j(p152k1.C1753A c1753a) {
        m2691K(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: k */
    public final int mo2705k(p152k1.C1753A c1753a) {
        return m2692L(c1753a);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: l */
    public p152k1.C1781t mo2682l() {
        return new p152k1.C1781t(-2, -2);
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: y */
    public final boolean mo2706y() {
        return true;
    }

    @Override // p152k1.AbstractC1780s
    /* renamed from: z */
    public final void mo2707z(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
}
