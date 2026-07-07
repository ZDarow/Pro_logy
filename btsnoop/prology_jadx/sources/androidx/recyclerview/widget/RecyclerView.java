package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class RecyclerView extends android.view.ViewGroup {

    /* renamed from: s0 */
    public static final int[] f4399s0 = {android.R.attr.nestedScrollingEnabled};

    /* renamed from: t0 */
    public static final int[] f4400t0 = {android.R.attr.clipToPadding};

    /* renamed from: u0 */
    public static final java.lang.Class[] f4401u0;

    /* renamed from: v0 */
    public static final p152k1.InterpolatorC1774m f4402v0;

    /* renamed from: A */
    public int f4403A;

    /* renamed from: B */
    public boolean f4404B;

    /* renamed from: C */
    public boolean f4405C;

    /* renamed from: D */
    public int f4406D;

    /* renamed from: E */
    public final android.view.accessibility.AccessibilityManager f4407E;

    /* renamed from: F */
    public boolean f4408F;

    /* renamed from: G */
    public boolean f4409G;

    /* renamed from: H */
    public int f4410H;

    /* renamed from: I */
    public final int f4411I;

    /* renamed from: J */
    public p152k1.C1777p f4412J;

    /* renamed from: K */
    public android.widget.EdgeEffect f4413K;

    /* renamed from: L */
    public android.widget.EdgeEffect f4414L;

    /* renamed from: M */
    public android.widget.EdgeEffect f4415M;

    /* renamed from: N */
    public android.widget.EdgeEffect f4416N;

    /* renamed from: O */
    public p152k1.AbstractC1778q f4417O;

    /* renamed from: P */
    public int f4418P;

    /* renamed from: Q */
    public int f4419Q;

    /* renamed from: R */
    public android.view.VelocityTracker f4420R;

    /* renamed from: S */
    public int f4421S;

    /* renamed from: T */
    public int f4422T;

    /* renamed from: U */
    public int f4423U;

    /* renamed from: V */
    public int f4424V;

    /* renamed from: W */
    public int f4425W;

    /* renamed from: a0 */
    public final int f4426a0;

    /* renamed from: b0 */
    public final int f4427b0;

    /* renamed from: c0 */
    public final float f4428c0;

    /* renamed from: d0 */
    public final float f4429d0;

    /* renamed from: e0 */
    public boolean f4430e0;

    /* renamed from: f0 */
    public final p152k1.RunnableC1755C f4431f0;

    /* renamed from: g0 */
    public p152k1.RunnableC1769h f4432g0;

    /* renamed from: h0 */
    public final p002A0.C0005c f4433h0;

    /* renamed from: i0 */
    public final p152k1.C1753A f4434i0;

    /* renamed from: j0 */
    public java.util.ArrayList f4435j0;

    /* renamed from: k0 */
    public final p046L1.C0363g f4436k0;

    /* renamed from: l */
    public final io.flutter.plugin.platform.C1580c f4437l;

    /* renamed from: l0 */
    public p152k1.C1757E f4438l0;

    /* renamed from: m */
    public p152k1.C1787z f4439m;

    /* renamed from: m0 */
    public p011C.C0115g f4440m0;

    /* renamed from: n */
    public final android.support.v4.media.session.C1061t f4441n;

    /* renamed from: n0 */
    public final int[] f4442n0;

    /* renamed from: o */
    public final android.support.v4.media.session.C1061t f4443o;

    /* renamed from: o0 */
    public final int[] f4444o0;

    /* renamed from: p */
    public final p046L1.C0363g f4445p;

    /* renamed from: p0 */
    public final int[] f4446p0;

    /* renamed from: q */
    public boolean f4447q;

    /* renamed from: q0 */
    public final java.util.ArrayList f4448q0;

    /* renamed from: r */
    public final android.graphics.Rect f4449r;

    /* renamed from: r0 */
    public final p024F.RunnableC0199b f4450r0;

    /* renamed from: s */
    public final android.graphics.Rect f4451s;

    /* renamed from: t */
    public p152k1.AbstractC1780s f4452t;

    /* renamed from: u */
    public final java.util.ArrayList f4453u;

    /* renamed from: v */
    public final java.util.ArrayList f4454v;

    /* renamed from: w */
    public p152k1.C1767f f4455w;

    /* renamed from: x */
    public boolean f4456x;

    /* renamed from: y */
    public boolean f4457y;

    /* renamed from: z */
    public boolean f4458z;

    /* JADX WARN: Type inference failed for: r0v6, types: [k1.m, java.lang.Object] */
    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        f4401u0 = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, cls, cls};
        f4402v0 = new java.lang.Object();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [k1.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [k1.q, java.lang.Object, k1.b] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, A0.c] */
    /* JADX WARN: Type inference failed for: r1v17, types: [k1.A, java.lang.Object] */
    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        char c4;
        int i4;
        android.content.res.TypedArray typedArray;
        char c5;
        java.lang.reflect.Constructor constructor;
        this.f4437l = new io.flutter.plugin.platform.C1580c(this);
        this.f4445p = new p046L1.C0363g(26);
        this.f4449r = new android.graphics.Rect();
        this.f4451s = new android.graphics.Rect();
        new android.graphics.RectF();
        this.f4453u = new java.util.ArrayList();
        this.f4454v = new java.util.ArrayList();
        this.f4403A = 0;
        this.f4408F = false;
        this.f4409G = false;
        this.f4410H = 0;
        this.f4411I = 0;
        this.f4412J = new java.lang.Object();
        ?? obj = new java.lang.Object();
        java.lang.Object[] objArr = null;
        obj.f7287a = null;
        obj.f7288b = new java.util.ArrayList();
        obj.f7289c = 250L;
        obj.f7290d = 250L;
        obj.f7228e = new java.util.ArrayList();
        obj.f7229f = new java.util.ArrayList();
        obj.f7230g = new java.util.ArrayList();
        obj.f7231h = new java.util.ArrayList();
        obj.f7232i = new java.util.ArrayList();
        obj.f7233j = new java.util.ArrayList();
        obj.f7234k = new java.util.ArrayList();
        obj.f7235l = new java.util.ArrayList();
        obj.f7236m = new java.util.ArrayList();
        obj.f7237n = new java.util.ArrayList();
        obj.f7238o = new java.util.ArrayList();
        this.f4417O = obj;
        this.f4418P = 0;
        this.f4419Q = -1;
        this.f4428c0 = Float.MIN_VALUE;
        this.f4429d0 = Float.MIN_VALUE;
        boolean z4 = true;
        this.f4430e0 = true;
        this.f4431f0 = new p152k1.RunnableC1755C(this);
        this.f4433h0 = new java.lang.Object();
        ?? obj2 = new java.lang.Object();
        obj2.f7199a = 0;
        obj2.f7200b = false;
        obj2.f7201c = false;
        obj2.f7202d = false;
        obj2.f7203e = false;
        this.f4434i0 = obj2;
        p046L1.C0363g c0363g = new p046L1.C0363g(25, false);
        this.f4436k0 = c0363g;
        this.f4442n0 = new int[2];
        this.f4444o0 = new int[2];
        this.f4446p0 = new int[2];
        this.f4448q0 = new java.util.ArrayList();
        this.f4450r0 = new p024F.RunnableC0199b(10, this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4400t0, 0, 0);
            this.f4447q = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f4447q = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f4425W = viewConfiguration.getScaledTouchSlop();
        this.f4428c0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f4429d0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f4426a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4427b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4417O.f7287a = c0363g;
        this.f4441n = new android.support.v4.media.session.C1061t(new p025F1.C0215g(this));
        this.f4443o = new android.support.v4.media.session.C1061t(new p129f2.C1408Y(14, this));
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        if (p011C.AbstractC0128t.m451a(this) == 0) {
            p011C.AbstractC0128t.m452b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f4407E = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new p152k1.C1757E(this));
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p147j1.AbstractC1723a.f7182a, 0, 0);
            java.lang.String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                android.graphics.drawable.StateListDrawable stateListDrawable = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                android.graphics.drawable.Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables." + m2716h());
                }
                android.content.res.Resources resources = getContext().getResources();
                c4 = 3;
                i4 = 4;
                typedArray = obtainStyledAttributes2;
                c5 = 2;
                new p152k1.C1767f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.prology.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.prology.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.prology.R.dimen.fastscroll_margin));
            } else {
                c4 = 3;
                i4 = 4;
                typedArray = obtainStyledAttributes2;
                c5 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                java.lang.String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = androidx.recyclerview.widget.RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        java.lang.Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(p152k1.AbstractC1780s.class);
                        try {
                            constructor = asSubclass.getConstructor(f4401u0);
                            java.lang.Object[] objArr2 = new java.lang.Object[i4];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[c5] = 0;
                            objArr2[c4] = 0;
                            objArr = objArr2;
                        } catch (java.lang.NoSuchMethodException e4) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (java.lang.NoSuchMethodException e5) {
                                e5.initCause(e4);
                                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e5);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((p152k1.AbstractC1780s) constructor.newInstance(objArr));
                    } catch (java.lang.ClassCastException e6) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e6);
                    } catch (java.lang.ClassNotFoundException e7) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e7);
                    } catch (java.lang.IllegalAccessException e8) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e8);
                    } catch (java.lang.InstantiationException e9) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e9);
                    } catch (java.lang.reflect.InvocationTargetException e10) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e10);
                    }
                }
            }
            android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f4399s0, 0, 0);
            z4 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z4);
    }

    private p011C.C0115g getScrollingChildHelper() {
        if (this.f4440m0 == null) {
            this.f4440m0 = new p011C.C0115g(this);
        }
        return this.f4440m0;
    }

    /* renamed from: j */
    public static void m2709j(android.view.View view) {
        if (view == null) {
            return;
        }
        ((p152k1.C1781t) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i4, int i5) {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null) {
            abstractC1780s.getClass();
        }
        super.addFocusables(arrayList, i4, i5);
    }

    /* renamed from: b */
    public final void m2710b(java.lang.String str) {
        if (this.f4410H > 0) {
            if (str != null) {
                throw new java.lang.IllegalStateException(str);
            }
            throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m2716h());
        }
        if (this.f4411I > 0) {
            android.util.Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new java.lang.IllegalStateException("" + m2716h()));
        }
    }

    /* renamed from: c */
    public final void m2711c(int i4, int i5) {
        boolean z4;
        android.widget.EdgeEffect edgeEffect = this.f4413K;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            z4 = false;
        } else {
            this.f4413K.onRelease();
            z4 = this.f4413K.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.f4415M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.f4415M.onRelease();
            z4 |= this.f4415M.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.f4414L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f4414L.onRelease();
            z4 |= this.f4414L.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f4416N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f4416N.onRelease();
            z4 |= this.f4416N.isFinished();
        }
        if (z4) {
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p152k1.C1781t) && this.f4452t.mo2681d((p152k1.C1781t) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null && abstractC1780s.mo2698b()) {
            return this.f4452t.mo2700f(this.f4434i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null && abstractC1780s.mo2698b()) {
            this.f4452t.mo2701g(this.f4434i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null && abstractC1780s.mo2698b()) {
            return this.f4452t.mo2702h(this.f4434i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null && abstractC1780s.mo2699c()) {
            return this.f4452t.mo2703i(this.f4434i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null && abstractC1780s.mo2699c()) {
            this.f4452t.mo2704j(this.f4434i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null && abstractC1780s.mo2699c()) {
            return this.f4452t.mo2705k(this.f4434i0);
        }
        return 0;
    }

    /* renamed from: d */
    public final void m2712d() {
        android.support.v4.media.session.C1061t c1061t = this.f4441n;
        if (!this.f4458z || this.f4408F) {
            int i4 = p214y.AbstractC2381c.f9348a;
            android.os.Trace.beginSection("RV FullInvalidate");
            android.util.Log.e("RecyclerView", "No adapter attached; skipping layout");
            android.os.Trace.endSection();
            return;
        }
        if (((java.util.ArrayList) c1061t.f3863o).size() > 0) {
            c1061t.getClass();
            if (((java.util.ArrayList) c1061t.f3863o).size() > 0) {
                int i5 = p214y.AbstractC2381c.f9348a;
                android.os.Trace.beginSection("RV FullInvalidate");
                android.util.Log.e("RecyclerView", "No adapter attached; skipping layout");
                android.os.Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return getScrollingChildHelper().m418a(f4, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().m419b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m420c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().m421d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(android.util.SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        java.util.ArrayList arrayList = this.f4453u;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            p152k1.C1767f c1767f = (p152k1.C1767f) arrayList.get(i4);
            if (c1767f.f7255l != c1767f.f7257n.getWidth() || c1767f.f7256m != c1767f.f7257n.getHeight()) {
                c1767f.f7255l = c1767f.f7257n.getWidth();
                c1767f.f7256m = c1767f.f7257n.getHeight();
                c1767f.m3727e(0);
            } else if (c1767f.f7265v != 0) {
                if (c1767f.f7258o) {
                    int i5 = c1767f.f7255l;
                    int i6 = c1767f.f7247d;
                    int i7 = i5 - i6;
                    int i8 = 0 - (0 / 2);
                    android.graphics.drawable.StateListDrawable stateListDrawable = c1767f.f7245b;
                    stateListDrawable.setBounds(0, 0, i6, 0);
                    int i9 = c1767f.f7256m;
                    android.graphics.drawable.Drawable drawable = c1767f.f7246c;
                    drawable.setBounds(0, 0, c1767f.f7248e, i9);
                    androidx.recyclerview.widget.RecyclerView recyclerView = c1767f.f7257n;
                    java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i6, i8);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i6, -i8);
                    } else {
                        canvas.translate(i7, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i8);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i7, -i8);
                    }
                }
                if (c1767f.f7259p) {
                    int i10 = c1767f.f7256m;
                    int i11 = c1767f.f7251h;
                    int i12 = i10 - i11;
                    android.graphics.drawable.StateListDrawable stateListDrawable2 = c1767f.f7249f;
                    stateListDrawable2.setBounds(0, 0, 0, i11);
                    int i13 = c1767f.f7255l;
                    android.graphics.drawable.Drawable drawable2 = c1767f.f7250g;
                    drawable2.setBounds(0, 0, i13, c1767f.f7252i);
                    canvas.translate(0.0f, i12);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i12);
                }
            }
        }
        android.widget.EdgeEffect edgeEffect = this.f4413K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4447q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.f4413K;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        android.widget.EdgeEffect edgeEffect3 = this.f4414L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4447q) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.f4414L;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.f4415M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4447q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.f4415M;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.f4416N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4447q) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            android.widget.EdgeEffect edgeEffect8 = this.f4416N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(save4);
        }
        if ((z4 || this.f4417O == null || arrayList.size() <= 0 || !this.f4417O.mo3722b()) ? z4 : true) {
            java.lang.reflect.Field field2 = p011C.AbstractC0132x.f336a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    /* renamed from: e */
    public final void m2713e(int i4, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        setMeasuredDimension(p152k1.AbstractC1780s.m3731e(i4, paddingRight, getMinimumWidth()), p152k1.AbstractC1780s.m3731e(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* renamed from: f */
    public final boolean m2714f(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m420c(i4, i5, i6, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View view, int i4) {
        int i5;
        this.f4452t.getClass();
        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, view, i4);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i4);
            }
            m2722o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && m2717i(findNextFocus) != null) {
            if (view == null || m2717i(view) == null) {
                return findNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            android.graphics.Rect rect = this.f4449r;
            char c4 = 0;
            rect.set(0, 0, width, height);
            int width2 = findNextFocus.getWidth();
            int height2 = findNextFocus.getHeight();
            android.graphics.Rect rect2 = this.f4451s;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect2);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f4452t.f7294b;
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            int i6 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                i5 = 1;
            } else {
                int i9 = rect.right;
                int i10 = rect2.right;
                i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
            }
            int i11 = rect.top;
            int i12 = rect2.top;
            if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                c4 = 1;
            } else {
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if ((i13 > i14 || i11 >= i14) && i11 > i12) {
                    c4 = 65535;
                }
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 17) {
                        if (i4 != 33) {
                            if (i4 != 66) {
                                if (i4 != 130) {
                                    throw new java.lang.IllegalArgumentException("Invalid direction: " + i4 + m2716h());
                                }
                                if (c4 > 0) {
                                    return findNextFocus;
                                }
                            } else if (i5 > 0) {
                                return findNextFocus;
                            }
                        } else if (c4 < 0) {
                            return findNextFocus;
                        }
                    } else if (i5 < 0) {
                        return findNextFocus;
                    }
                } else {
                    if (c4 > 0) {
                        return findNextFocus;
                    }
                    if (c4 == 0 && i5 * i6 >= 0) {
                        return findNextFocus;
                    }
                }
            } else {
                if (c4 < 0) {
                    return findNextFocus;
                }
                if (c4 == 0 && i5 * i6 <= 0) {
                    return findNextFocus;
                }
            }
        }
        return super.focusSearch(view, i4);
    }

    /* renamed from: g */
    public final boolean m2715g(int[] iArr, int i4) {
        return getScrollingChildHelper().m421d(0, 0, 0, 0, iArr, i4, null);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null) {
            return abstractC1780s.mo2682l();
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + m2716h());
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null) {
            return abstractC1780s.mo2683m(getContext(), attributeSet);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + m2716h());
    }

    public p152k1.AbstractC1775n getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s == null) {
            return super.getBaseline();
        }
        abstractC1780s.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4447q;
    }

    public p152k1.C1757E getCompatAccessibilityDelegate() {
        return this.f4438l0;
    }

    public p152k1.C1777p getEdgeEffectFactory() {
        return this.f4412J;
    }

    public p152k1.AbstractC1778q getItemAnimator() {
        return this.f4417O;
    }

    public int getItemDecorationCount() {
        return this.f4453u.size();
    }

    public p152k1.AbstractC1780s getLayoutManager() {
        return this.f4452t;
    }

    public int getMaxFlingVelocity() {
        return this.f4427b0;
    }

    public int getMinFlingVelocity() {
        return this.f4426a0;
    }

    public long getNanoTime() {
        return java.lang.System.nanoTime();
    }

    public p152k1.AbstractC1782u getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4430e0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [k1.x, java.lang.Object] */
    public p152k1.C1785x getRecycledViewPool() {
        io.flutter.plugin.platform.C1580c c1580c = this.f4437l;
        if (((p152k1.C1785x) c1580c.f6568p) == null) {
            ?? obj = new java.lang.Object();
            obj.f7302a = new android.util.SparseArray();
            obj.f7303b = 0;
            c1580c.f6568p = obj;
        }
        return (p152k1.C1785x) c1580c.f6568p;
    }

    public int getScrollState() {
        return this.f4418P;
    }

    /* renamed from: h */
    public final java.lang.String m2716h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f4452t + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m423f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m2717i(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m2717i(android.view.View):android.view.View");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f4456x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f323d;
    }

    /* renamed from: k */
    public final boolean m2718k() {
        return getScrollingChildHelper().m423f(1);
    }

    /* renamed from: l */
    public final boolean m2719l() {
        return !this.f4458z || this.f4408F || ((java.util.ArrayList) this.f4441n.f3863o).size() > 0;
    }

    /* renamed from: m */
    public final void m2720m() {
        int m2229j0 = this.f4443o.m2229j0();
        for (int i4 = 0; i4 < m2229j0; i4++) {
            ((p152k1.C1781t) this.f4443o.m2227i0(i4).getLayoutParams()).f7301b = true;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f4437l.f6567o;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new java.lang.ClassCastException();
    }

    /* renamed from: n */
    public final void m2721n(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4419Q) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f4419Q = motionEvent.getPointerId(i4);
            int x3 = (int) (motionEvent.getX(i4) + 0.5f);
            this.f4423U = x3;
            this.f4421S = x3;
            int y4 = (int) (motionEvent.getY(i4) + 0.5f);
            this.f4424V = y4;
            this.f4422T = y4;
        }
    }

    /* renamed from: o */
    public final void m2722o(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        android.graphics.Rect rect = this.f4449r;
        rect.set(0, 0, width, height);
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p152k1.C1781t) {
            p152k1.C1781t c1781t = (p152k1.C1781t) layoutParams;
            if (!c1781t.f7301b) {
                int i4 = rect.left;
                android.graphics.Rect rect2 = c1781t.f7300a;
                rect.left = i4 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f4452t.m3736G(this, view, this.f4449r, !this.f4458z, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [k1.h, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f4410H = r0
            r1 = 1
            r5.f4456x = r1
            boolean r2 = r5.f4458z
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = r1
        L14:
            r5.f4458z = r0
            k1.s r0 = r5.f4452t
            if (r0 == 0) goto L1c
            r0.f7297e = r1
        L1c:
            java.lang.ThreadLocal r0 = p152k1.RunnableC1769h.f7272p
            java.lang.Object r1 = r0.get()
            k1.h r1 = (p152k1.RunnableC1769h) r1
            r5.f4432g0 = r1
            if (r1 != 0) goto L64
            k1.h r1 = new k1.h
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7274l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7277o = r2
            r5.f4432g0 = r1
            java.lang.reflect.Field r1 = p011C.AbstractC0132x.f336a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L56
            if (r1 == 0) goto L56
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L56
            goto L58
        L56:
            r1 = 1114636288(0x42700000, float:60.0)
        L58:
            k1.h r2 = r5.f4432g0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f7276n = r3
            r0.set(r2)
        L64:
            k1.h r0 = r5.f4432g0
            java.util.ArrayList r0 = r0.f7274l
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        java.lang.Object obj;
        super.onDetachedFromWindow();
        p152k1.AbstractC1778q abstractC1778q = this.f4417O;
        if (abstractC1778q != null) {
            abstractC1778q.mo3721a();
        }
        setScrollState(0);
        p152k1.RunnableC1755C runnableC1755C = this.f4431f0;
        runnableC1755C.f7210r.removeCallbacks(runnableC1755C);
        runnableC1755C.f7206n.abortAnimation();
        this.f4456x = false;
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null) {
            abstractC1780s.f7297e = false;
            abstractC1780s.mo2707z(this);
        }
        this.f4448q0.clear();
        removeCallbacks(this.f4450r0);
        this.f4445p.getClass();
        do {
            p006B.C0020c c0020c = p152k1.AbstractC1761I.f7227a;
            int i4 = c0020c.f87l;
            obj = null;
            if (i4 > 0) {
                int i5 = i4 - 1;
                java.lang.Object[] objArr = (java.lang.Object[]) c0020c.f88m;
                java.lang.Object obj2 = objArr[i5];
                p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i5] = null;
                c0020c.f87l--;
                obj = obj2;
            }
        } while (obj != null);
        p152k1.RunnableC1769h runnableC1769h = this.f4432g0;
        if (runnableC1769h != null) {
            runnableC1769h.f7274l.remove(this);
            this.f4432g0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.ArrayList arrayList = this.f4453u;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p152k1.C1767f) arrayList.get(i4)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            k1.s r0 = r5.f4452t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4404B
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            k1.s r0 = r5.f4452t
            boolean r0 = r0.mo2699c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            k1.s r3 = r5.f4452t
            boolean r3 = r3.mo2698b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            k1.s r3 = r5.f4452t
            boolean r3 = r3.mo2699c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            k1.s r3 = r5.f4452t
            boolean r3 = r3.mo2698b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f4428c0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4429d0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m2724q(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z4;
        if (this.f4404B) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f4455w = null;
        }
        java.util.ArrayList arrayList = this.f4454v;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            p152k1.C1767f c1767f = (p152k1.C1767f) arrayList.get(i4);
            if (c1767f.m3726c(motionEvent) && action != 3) {
                this.f4455w = c1767f;
                m2723p();
                setScrollState(0);
                return true;
            }
        }
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s == null) {
            return false;
        }
        boolean mo2698b = abstractC1780s.mo2698b();
        boolean mo2699c = this.f4452t.mo2699c();
        if (this.f4420R == null) {
            this.f4420R = android.view.VelocityTracker.obtain();
        }
        this.f4420R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4405C) {
                this.f4405C = false;
            }
            this.f4419Q = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f4423U = x3;
            this.f4421S = x3;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.f4424V = y4;
            this.f4422T = y4;
            if (this.f4418P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f4446p0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i5 = mo2698b;
            if (mo2699c) {
                i5 = (mo2698b ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m424g(i5, 0);
        } else if (actionMasked == 1) {
            this.f4420R.clear();
            m2726s(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4419Q);
            if (findPointerIndex < 0) {
                android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4419Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4418P != 1) {
                int i6 = x4 - this.f4421S;
                int i7 = y5 - this.f4422T;
                if (mo2698b == 0 || java.lang.Math.abs(i6) <= this.f4425W) {
                    z4 = false;
                } else {
                    this.f4423U = x4;
                    z4 = true;
                }
                if (mo2699c && java.lang.Math.abs(i7) > this.f4425W) {
                    this.f4424V = y5;
                    z4 = true;
                }
                if (z4) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m2723p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f4419Q = motionEvent.getPointerId(actionIndex);
            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4423U = x5;
            this.f4421S = x5;
            int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4424V = y6;
            this.f4422T = y6;
        } else if (actionMasked == 6) {
            m2721n(motionEvent);
        }
        return this.f4418P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8 = p214y.AbstractC2381c.f9348a;
        android.os.Trace.beginSection("RV OnLayout");
        android.util.Log.e("RecyclerView", "No adapter attached; skipping layout");
        android.os.Trace.endSection();
        this.f4458z = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s == null) {
            m2713e(i4, i5);
            return;
        }
        if (abstractC1780s.mo2706y()) {
            android.view.View.MeasureSpec.getMode(i4);
            android.view.View.MeasureSpec.getMode(i5);
            this.f4452t.f7294b.m2713e(i4, i5);
        } else {
            if (this.f4457y) {
                this.f4452t.f7294b.m2713e(i4, i5);
                return;
            }
            p152k1.C1753A c1753a = this.f4434i0;
            if (c1753a.f7203e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c1753a.getClass();
            this.f4403A++;
            this.f4452t.f7294b.m2713e(i4, i5);
            if (this.f4403A < 1) {
                this.f4403A = 1;
            }
            this.f4403A--;
            c1753a.f7201c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, android.graphics.Rect rect) {
        if (this.f4410H > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof p152k1.C1787z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p152k1.C1787z c1787z = (p152k1.C1787z) parcelable;
        this.f4439m = c1787z;
        super.onRestoreInstanceState(c1787z.f709l);
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s == null || (parcelable2 = this.f4439m.f7304n) == null) {
            return;
        }
        abstractC1780s.mo2688B(parcelable2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k1.z, android.os.Parcelable, H.c] */
    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        ?? abstractC0243c = new p031H.AbstractC0243c(super.onSaveInstanceState());
        p152k1.C1787z c1787z = this.f4439m;
        if (c1787z != null) {
            abstractC0243c.f7304n = c1787z.f7304n;
        } else {
            p152k1.AbstractC1780s abstractC1780s = this.f4452t;
            if (abstractC1780s != null) {
                abstractC0243c.f7304n = abstractC1780s.mo2689C();
            } else {
                abstractC0243c.f7304n = null;
            }
        }
        return abstractC0243c;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        this.f4416N = null;
        this.f4414L = null;
        this.f4415M = null;
        this.f4413K = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m2723p() {
        android.view.VelocityTracker velocityTracker = this.f4420R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z4 = false;
        m2726s(0);
        android.widget.EdgeEffect edgeEffect = this.f4413K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = this.f4413K.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.f4414L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 |= this.f4414L.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.f4415M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 |= this.f4415M.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f4416N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 |= this.f4416N.isFinished();
        }
        if (z4) {
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2724q(int r11, int r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m2724q(int, int, android.view.MotionEvent):void");
    }

    /* renamed from: r */
    public final void m2725r(int i4, int i5) {
        int i6;
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s == null) {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4404B) {
            return;
        }
        int i7 = !abstractC1780s.mo2698b() ? 0 : i4;
        int i8 = !this.f4452t.mo2699c() ? 0 : i5;
        if (i7 == 0 && i8 == 0) {
            return;
        }
        p152k1.RunnableC1755C runnableC1755C = this.f4431f0;
        runnableC1755C.getClass();
        int abs = java.lang.Math.abs(i7);
        int abs2 = java.lang.Math.abs(i8);
        boolean z4 = abs > abs2;
        int sqrt = (int) java.lang.Math.sqrt(0);
        int sqrt2 = (int) java.lang.Math.sqrt((i8 * i8) + (i7 * i7));
        androidx.recyclerview.widget.RecyclerView recyclerView = runnableC1755C.f7210r;
        int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i9 = width / 2;
        float f4 = width;
        float f5 = i9;
        float sin = (((float) java.lang.Math.sin((java.lang.Math.min(1.0f, (sqrt2 * 1.0f) / f4) - 0.5f) * 0.47123894f)) * f5) + f5;
        if (sqrt > 0) {
            i6 = java.lang.Math.round(java.lang.Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z4) {
                abs = abs2;
            }
            i6 = (int) (((abs / f4) + 1.0f) * 300.0f);
        }
        int min = java.lang.Math.min(i6, 2000);
        p152k1.InterpolatorC1774m interpolatorC1774m = f4402v0;
        if (runnableC1755C.f7207o != interpolatorC1774m) {
            runnableC1755C.f7207o = interpolatorC1774m;
            runnableC1755C.f7206n = new android.widget.OverScroller(recyclerView.getContext(), interpolatorC1774m);
        }
        recyclerView.setScrollState(2);
        runnableC1755C.f7205m = 0;
        runnableC1755C.f7204l = 0;
        runnableC1755C.f7206n.startScroll(0, 0, i7, i8, min);
        runnableC1755C.m3719a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View view, boolean z4) {
        m2709j(view);
        view.clearAnimation();
        m2709j(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View view, android.view.View view2) {
        this.f4452t.getClass();
        if (this.f4410H <= 0 && view2 != null) {
            m2722o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z4) {
        return this.f4452t.m3736G(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        java.util.ArrayList arrayList = this.f4454v;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p152k1.C1767f) arrayList.get(i4)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4403A != 0 || this.f4404B) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: s */
    public final void m2726s(int i4) {
        getScrollingChildHelper().m425h(i4);
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i5) {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4404B) {
            return;
        }
        boolean mo2698b = abstractC1780s.mo2698b();
        boolean mo2699c = this.f4452t.mo2699c();
        if (mo2698b || mo2699c) {
            if (!mo2698b) {
                i4 = 0;
            }
            if (!mo2699c) {
                i5 = 0;
            }
            m2724q(i4, i5, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        android.util.Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f4410H <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f4406D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(p152k1.C1757E c1757e) {
        this.f4438l0 = c1757e;
        p011C.AbstractC0132x.m464d(this, c1757e);
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [k1.x, java.lang.Object] */
    public void setAdapter(p152k1.AbstractC1775n abstractC1775n) {
        setLayoutFrozen(false);
        p152k1.AbstractC1778q abstractC1778q = this.f4417O;
        if (abstractC1778q != null) {
            abstractC1778q.mo3721a();
        }
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        io.flutter.plugin.platform.C1580c c1580c = this.f4437l;
        if (abstractC1780s != null) {
            abstractC1780s.m3734E();
            this.f4452t.m3735F(c1580c);
        }
        ((java.util.ArrayList) c1580c.f6566n).clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) c1580c.f6567o;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            throw new java.lang.ClassCastException();
        }
        arrayList.clear();
        p002A0.C0005c c0005c = ((androidx.recyclerview.widget.RecyclerView) c1580c.f6569q).f4433h0;
        c0005c.getClass();
        c0005c.f9c = 0;
        android.support.v4.media.session.C1061t c1061t = this.f4441n;
        c1061t.m2244v0((java.util.ArrayList) c1061t.f3863o);
        c1061t.m2244v0((java.util.ArrayList) c1061t.f3862n);
        ((java.util.ArrayList) c1580c.f6566n).clear();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) c1580c.f6567o;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            arrayList2.get(size2).getClass();
            throw new java.lang.ClassCastException();
        }
        arrayList2.clear();
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) c1580c.f6569q;
        p002A0.C0005c c0005c2 = recyclerView.f4433h0;
        c0005c2.getClass();
        c0005c2.f9c = 0;
        if (((p152k1.C1785x) c1580c.f6568p) == null) {
            ?? obj = new java.lang.Object();
            obj.f7302a = new android.util.SparseArray();
            obj.f7303b = 0;
            c1580c.f6568p = obj;
        }
        p152k1.C1785x c1785x = (p152k1.C1785x) c1580c.f6568p;
        if (c1785x.f7303b == 0) {
            android.util.SparseArray sparseArray = c1785x.f7302a;
            if (sparseArray.size() > 0) {
                ((p152k1.AbstractC1784w) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f4434i0.f7200b = true;
        this.f4409G = this.f4409G;
        this.f4408F = true;
        int m2229j0 = this.f4443o.m2229j0();
        for (int i4 = 0; i4 < m2229j0; i4++) {
            m2709j(this.f4443o.m2227i0(i4));
        }
        m2720m();
        int size3 = arrayList2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            if (arrayList2.get(i5) != null) {
                throw new java.lang.ClassCastException();
            }
        }
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            arrayList2.get(size4).getClass();
            throw new java.lang.ClassCastException();
        }
        arrayList2.clear();
        p002A0.C0005c c0005c3 = recyclerView.f4433h0;
        c0005c3.getClass();
        c0005c3.f9c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(p152k1.InterfaceC1776o interfaceC1776o) {
        if (interfaceC1776o == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f4447q) {
            this.f4416N = null;
            this.f4414L = null;
            this.f4415M = null;
            this.f4413K = null;
        }
        this.f4447q = z4;
        super.setClipToPadding(z4);
        if (this.f4458z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(p152k1.C1777p c1777p) {
        c1777p.getClass();
        this.f4412J = c1777p;
        this.f4416N = null;
        this.f4414L = null;
        this.f4415M = null;
        this.f4413K = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.f4457y = z4;
    }

    public void setItemAnimator(p152k1.AbstractC1778q abstractC1778q) {
        p152k1.AbstractC1778q abstractC1778q2 = this.f4417O;
        if (abstractC1778q2 != null) {
            abstractC1778q2.mo3721a();
            this.f4417O.f7287a = null;
        }
        this.f4417O = abstractC1778q;
        if (abstractC1778q != null) {
            abstractC1778q.f7287a = this.f4436k0;
        }
    }

    public void setItemViewCacheSize(int i4) {
        io.flutter.plugin.platform.C1580c c1580c = this.f4437l;
        c1580c.f6564l = i4;
        c1580c.m3504d();
    }

    public void setLayoutFrozen(boolean z4) {
        if (z4 != this.f4404B) {
            m2710b("Do not setLayoutFrozen in layout or scroll");
            if (!z4) {
                this.f4404B = false;
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4404B = true;
            this.f4405C = true;
            setScrollState(0);
            p152k1.RunnableC1755C runnableC1755C = this.f4431f0;
            runnableC1755C.f7210r.removeCallbacks(runnableC1755C);
            runnableC1755C.f7206n.abortAnimation();
        }
    }

    public void setLayoutManager(p152k1.AbstractC1780s abstractC1780s) {
        p129f2.C1408Y c1408y;
        if (abstractC1780s == this.f4452t) {
            return;
        }
        setScrollState(0);
        p152k1.RunnableC1755C runnableC1755C = this.f4431f0;
        runnableC1755C.f7210r.removeCallbacks(runnableC1755C);
        runnableC1755C.f7206n.abortAnimation();
        p152k1.AbstractC1780s abstractC1780s2 = this.f4452t;
        io.flutter.plugin.platform.C1580c c1580c = this.f4437l;
        if (abstractC1780s2 != null) {
            p152k1.AbstractC1778q abstractC1778q = this.f4417O;
            if (abstractC1778q != null) {
                abstractC1778q.mo3721a();
            }
            this.f4452t.m3734E();
            this.f4452t.m3735F(c1580c);
            ((java.util.ArrayList) c1580c.f6566n).clear();
            java.util.ArrayList arrayList = (java.util.ArrayList) c1580c.f6567o;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size).getClass();
                throw new java.lang.ClassCastException();
            }
            arrayList.clear();
            p002A0.C0005c c0005c = ((androidx.recyclerview.widget.RecyclerView) c1580c.f6569q).f4433h0;
            c0005c.getClass();
            c0005c.f9c = 0;
            if (this.f4456x) {
                p152k1.AbstractC1780s abstractC1780s3 = this.f4452t;
                abstractC1780s3.f7297e = false;
                abstractC1780s3.mo2707z(this);
            }
            this.f4452t.m3738I(null);
            this.f4452t = null;
        } else {
            ((java.util.ArrayList) c1580c.f6566n).clear();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) c1580c.f6567o;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                arrayList2.get(size2).getClass();
                throw new java.lang.ClassCastException();
            }
            arrayList2.clear();
            p002A0.C0005c c0005c2 = ((androidx.recyclerview.widget.RecyclerView) c1580c.f6569q).f4433h0;
            c0005c2.getClass();
            c0005c2.f9c = 0;
        }
        android.support.v4.media.session.C1061t c1061t = this.f4443o;
        ((p028G0.C0235c) c1061t.f3862n).m623G();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) c1061t.f3863o;
        int size3 = arrayList3.size() - 1;
        while (true) {
            c1408y = (p129f2.C1408Y) c1061t.f3861m;
            if (size3 < 0) {
                break;
            }
            m2709j((android.view.View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) c1408y.f5729m;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = recyclerView.getChildAt(i4);
            m2709j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4452t = abstractC1780s;
        if (abstractC1780s != null) {
            if (abstractC1780s.f7294b != null) {
                throw new java.lang.IllegalArgumentException("LayoutManager " + abstractC1780s + " is already attached to a RecyclerView:" + abstractC1780s.f7294b.m2716h());
            }
            abstractC1780s.m3738I(this);
            if (this.f4456x) {
                this.f4452t.f7297e = true;
            }
        }
        c1580c.m3504d();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        p011C.C0115g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f323d) {
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            p011C.AbstractC0126r.m449f(scrollingChildHelper.f322c);
        }
        scrollingChildHelper.f323d = z4;
    }

    public void setOnFlingListener(p152k1.AbstractC1782u abstractC1782u) {
    }

    @java.lang.Deprecated
    public void setOnScrollListener(p152k1.AbstractC1783v abstractC1783v) {
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f4430e0 = z4;
    }

    public void setRecycledViewPool(p152k1.C1785x c1785x) {
        io.flutter.plugin.platform.C1580c c1580c = this.f4437l;
        if (((p152k1.C1785x) c1580c.f6568p) != null) {
            r1.f7303b--;
        }
        c1580c.f6568p = c1785x;
        if (c1785x != null) {
            ((androidx.recyclerview.widget.RecyclerView) c1580c.f6569q).getAdapter();
        }
    }

    public void setRecyclerListener(p152k1.InterfaceC1786y interfaceC1786y) {
    }

    public void setScrollState(int i4) {
        if (i4 == this.f4418P) {
            return;
        }
        this.f4418P = i4;
        if (i4 != 2) {
            p152k1.RunnableC1755C runnableC1755C = this.f4431f0;
            runnableC1755C.f7210r.removeCallbacks(runnableC1755C);
            runnableC1755C.f7206n.abortAnimation();
        }
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null) {
            abstractC1780s.mo2727D(i4);
        }
        java.util.ArrayList arrayList = this.f4435j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p152k1.AbstractC1783v) this.f4435j0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i4) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.f4425W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            android.util.Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.f4425W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(p152k1.AbstractC1754B abstractC1754B) {
        this.f4437l.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().m424g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m425h(0);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        p152k1.AbstractC1780s abstractC1780s = this.f4452t;
        if (abstractC1780s != null) {
            return abstractC1780s.mo2684n(layoutParams);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + m2716h());
    }
}
