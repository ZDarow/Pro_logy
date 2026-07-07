package androidx.core.widget;

/* loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements p011C.InterfaceC0117i {

    /* renamed from: N */
    public static final float f4106N = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));

    /* renamed from: O */
    public static final p024F.C0204g f4107O = new p011C.C0110b();

    /* renamed from: P */
    public static final int[] f4108P = {android.R.attr.fillViewport};

    /* renamed from: A */
    public final int f4109A;

    /* renamed from: B */
    public final int f4110B;

    /* renamed from: C */
    public final int f4111C;

    /* renamed from: D */
    public int f4112D;

    /* renamed from: E */
    public final int[] f4113E;

    /* renamed from: F */
    public final int[] f4114F;

    /* renamed from: G */
    public int f4115G;

    /* renamed from: H */
    public int f4116H;

    /* renamed from: I */
    public p024F.C0207j f4117I;

    /* renamed from: J */
    public final p011C.C0118j f4118J;

    /* renamed from: K */
    public final p011C.C0115g f4119K;

    /* renamed from: L */
    public float f4120L;

    /* renamed from: M */
    public final p011C.C0112d f4121M;

    /* renamed from: l */
    public final float f4122l;

    /* renamed from: m */
    public long f4123m;

    /* renamed from: n */
    public final android.graphics.Rect f4124n;

    /* renamed from: o */
    public final android.widget.OverScroller f4125o;

    /* renamed from: p */
    public final android.widget.EdgeEffect f4126p;

    /* renamed from: q */
    public final android.widget.EdgeEffect f4127q;

    /* renamed from: r */
    public p011C.C0121m f4128r;

    /* renamed from: s */
    public int f4129s;

    /* renamed from: t */
    public boolean f4130t;

    /* renamed from: u */
    public boolean f4131u;

    /* renamed from: v */
    public android.view.View f4132v;

    /* renamed from: w */
    public boolean f4133w;

    /* renamed from: x */
    public android.view.VelocityTracker f4134x;

    /* renamed from: y */
    public boolean f4135y;

    /* renamed from: z */
    public boolean f4136z;

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.prology.R.attr.nestedScrollViewStyle);
        this.f4124n = new android.graphics.Rect();
        this.f4130t = true;
        this.f4131u = false;
        this.f4132v = null;
        this.f4133w = false;
        this.f4136z = true;
        this.f4112D = -1;
        this.f4113E = new int[2];
        this.f4114F = new int[2];
        this.f4121M = new p011C.C0112d(getContext(), new p009B2.C0061r(8, this));
        int i4 = android.os.Build.VERSION.SDK_INT;
        this.f4126p = i4 >= 31 ? p024F.AbstractC0202e.m562a(context, attributeSet) : new android.widget.EdgeEffect(context);
        this.f4127q = i4 >= 31 ? p024F.AbstractC0202e.m562a(context, attributeSet) : new android.widget.EdgeEffect(context);
        this.f4122l = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4125o = new android.widget.OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.f4109A = viewConfiguration.getScaledTouchSlop();
        this.f4110B = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4111C = viewConfiguration.getScaledMaximumFlingVelocity();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4108P, com.prology.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f4118J = new p011C.C0118j(0);
        this.f4119K = new p011C.C0115g(this);
        setNestedScrollingEnabled(true);
        p011C.AbstractC0132x.m464d(this, f4107O);
    }

    private p011C.C0121m getScrollFeedbackProvider() {
        if (this.f4128r == null) {
            this.f4128r = new p011C.C0121m(this);
        }
        return this.f4128r;
    }

    /* renamed from: k */
    public static boolean m2335k(android.view.View view, androidx.core.widget.NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        java.lang.Object parent = view.getParent();
        return (parent instanceof android.view.ViewGroup) && m2335k((android.view.View) parent, nestedScrollView);
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: a */
    public final void mo426a(android.view.View view, android.view.View view2, int i4, int i5) {
        p011C.C0118j c0118j = this.f4118J;
        if (i5 == 1) {
            c0118j.f327c = i4;
        } else {
            c0118j.f326b = i4;
        }
        m2349u(2, i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: b */
    public final void mo427b(android.view.ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8) {
        m2341m(i7, i8, null);
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: c */
    public final void mo428c(android.view.View view, int i4) {
        p011C.C0118j c0118j = this.f4118J;
        if (i4 == 1) {
            c0118j.f327c = 0;
        } else {
            c0118j.f326b = 0;
        }
        m2351w(i4);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return java.lang.Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        android.view.View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = java.lang.Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // p011C.InterfaceC0117i
    /* renamed from: d */
    public final void mo431d(android.view.ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        m2341m(i7, i8, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyEvent(r7)
            r1 = 1
            if (r0 != 0) goto Lce
            android.graphics.Rect r0 = r6.f4124n
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r2 = 0
            r3 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto La1
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r0 = r0.getHeight()
            int r5 = r4.topMargin
            int r0 = r0 + r5
            int r4 = r4.bottomMargin
            int r0 = r0 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            if (r0 <= r4) goto La1
            int r0 = r7.getAction()
            if (r0 != 0) goto Lc9
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L91
            r4 = 20
            if (r0 == r4) goto L81
            r4 = 62
            if (r0 == r4) goto L76
            r7 = 92
            if (r0 == r7) goto L71
            r7 = 93
            if (r0 == r7) goto L6c
            r7 = 122(0x7a, float:1.71E-43)
            if (r0 == r7) goto L68
            r7 = 123(0x7b, float:1.72E-43)
            if (r0 == r7) goto L63
            goto Lc9
        L63:
            r6.m2344p(r3)
            goto Lc9
        L68:
            r6.m2344p(r5)
            goto Lc9
        L6c:
            boolean r7 = r6.m2339j(r3)
            goto Lca
        L71:
            boolean r7 = r6.m2339j(r5)
            goto Lca
        L76:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L7d
            r3 = r5
        L7d:
            r6.m2344p(r3)
            goto Lc9
        L81:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L8c
            boolean r7 = r6.m2339j(r3)
            goto Lca
        L8c:
            boolean r7 = r6.m2336g(r3)
            goto Lca
        L91:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L9c
            boolean r7 = r6.m2339j(r5)
            goto Lca
        L9c:
            boolean r7 = r6.m2336g(r5)
            goto Lca
        La1:
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto Lc9
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto Lc9
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto Lb5
            r7 = 0
        Lb5:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto Lc9
            if (r7 == r6) goto Lc9
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto Lc9
            r7 = r1
            goto Lca
        Lc9:
            r7 = r2
        Lca:
            if (r7 == 0) goto Lcd
            goto Lce
        Lcd:
            r1 = r2
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return this.f4119K.m418a(f4, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f4119K.m419b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f4119K.m420c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f4119K.m421d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        android.widget.EdgeEffect edgeEffect = this.f4126p;
        int i5 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = java.lang.Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i4, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        android.widget.EdgeEffect edgeEffect2 = this.f4127q;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = java.lang.Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i5 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i5 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: e */
    public final void mo429e(int i4, int i5, int i6, int[] iArr) {
        this.f4119K.m420c(i4, i5, i6, iArr, null);
    }

    @Override // p011C.InterfaceC0116h
    /* renamed from: f */
    public final boolean mo430f(android.view.View view, android.view.View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    /* renamed from: g */
    public final boolean m2336g(int i4) {
        android.view.View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2340l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                maxScrollAmount = java.lang.Math.min((childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2346r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            android.graphics.Rect rect = this.f4124n;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            m2346r(m2337h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i4);
        }
        if (findFocus == null || !findFocus.isFocused() || m2340l(findFocus, 0, getHeight())) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p011C.C0118j c0118j = this.f4118J;
        return c0118j.f327c | c0118j.f326b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        return java.lang.Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f4120L == 0.0f) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.Context context = getContext();
            if (!context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new java.lang.IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4120L = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4120L;
    }

    /* renamed from: h */
    public final int m2337h(android.graphics.Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return java.lang.Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return java.lang.Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4119K.m423f(0);
    }

    /* renamed from: i */
    public final void m2338i(int i4) {
        if (getChildCount() > 0) {
            this.f4125o.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2349u(2, 1);
            this.f4116H = getScrollY();
            postInvalidateOnAnimation();
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                p020E.AbstractC0188a.m542a(this, java.lang.Math.abs(this.f4125o.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4119K.f323d;
    }

    /* renamed from: j */
    public final boolean m2339j(int i4) {
        int childCount;
        boolean z4 = i4 == 130;
        int height = getHeight();
        android.graphics.Rect rect = this.f4124n;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            android.view.View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m2345q(i4, rect.top, rect.bottom);
    }

    /* renamed from: l */
    public final boolean m2340l(android.view.View view, int i4, int i5) {
        android.graphics.Rect rect = this.f4124n;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i4 >= getScrollY() && rect.top - i4 <= getScrollY() + i5;
    }

    /* renamed from: m */
    public final void m2341m(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4119K.m421d(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(android.view.View view, int i4, int i5) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft(), layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(android.view.View view, int i4, int i5, int i6, int i7) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void m2342n(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4112D) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f4129s = (int) motionEvent.getY(i4);
            this.f4112D = motionEvent.getPointerId(i4);
            android.view.VelocityTracker velocityTracker = this.f4134x;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: o */
    public final boolean m2343o(int i4, int i5, int i6, int i7) {
        boolean z4;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i6 + i4;
        if (i5 <= 0 && i5 >= 0) {
            z4 = false;
        } else {
            i5 = 0;
            z4 = true;
        }
        if (i8 <= i7) {
            if (i8 >= 0) {
                i7 = i8;
                z5 = false;
                if (z5 && !this.f4119K.m423f(1)) {
                    this.f4125o.springBack(i5, i7, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i7);
                return z4 || z5;
            }
            i7 = 0;
        }
        z5 = true;
        if (z5) {
            this.f4125o.springBack(i5, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i7);
        if (z4) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4131u = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x00d7, code lost:
    
        if (r5 >= 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02af  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f4133w) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f4112D;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            android.util.Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y4 = (int) motionEvent.getY(findPointerIndex);
                            if (java.lang.Math.abs(y4 - this.f4129s) > this.f4109A && (2 & getNestedScrollAxes()) == 0) {
                                this.f4133w = true;
                                this.f4129s = y4;
                                if (this.f4134x == null) {
                                    this.f4134x = android.view.VelocityTracker.obtain();
                                }
                                this.f4134x.addMovement(motionEvent);
                                this.f4115G = 0;
                                android.view.ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        m2342n(motionEvent);
                    }
                }
            }
            this.f4133w = false;
            this.f4112D = -1;
            android.view.VelocityTracker velocityTracker = this.f4134x;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4134x = null;
            }
            if (this.f4125o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m2351w(0);
        } else {
            int y5 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                android.view.View childAt = getChildAt(0);
                if (y5 >= childAt.getTop() - scrollY && y5 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    this.f4129s = y5;
                    this.f4112D = motionEvent.getPointerId(0);
                    android.view.VelocityTracker velocityTracker2 = this.f4134x;
                    if (velocityTracker2 == null) {
                        this.f4134x = android.view.VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f4134x.addMovement(motionEvent);
                    this.f4125o.computeScrollOffset();
                    if (!m2350v(motionEvent) && this.f4125o.isFinished()) {
                        z4 = false;
                    }
                    this.f4133w = z4;
                    m2349u(2, 0);
                }
            }
            if (!m2350v(motionEvent) && this.f4125o.isFinished()) {
                z4 = false;
            }
            this.f4133w = z4;
            android.view.VelocityTracker velocityTracker3 = this.f4134x;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f4134x = null;
            }
        }
        return this.f4133w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z4, i4, i5, i6, i7);
        int i9 = 0;
        this.f4130t = false;
        android.view.View view = this.f4132v;
        if (view != null && m2335k(view, this)) {
            android.view.View view2 = this.f4132v;
            android.graphics.Rect rect = this.f4124n;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m2337h = m2337h(rect);
            if (m2337h != 0) {
                scrollBy(0, m2337h);
            }
        }
        this.f4132v = null;
        if (!this.f4131u) {
            if (this.f4117I != null) {
                scrollTo(getScrollX(), this.f4117I.f575l);
                this.f4117I = null;
            }
            if (getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i8 = 0;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i8 && scrollY >= 0) {
                i9 = paddingTop + scrollY > i8 ? i8 - paddingTop : scrollY;
            }
            if (i9 != scrollY) {
                scrollTo(getScrollX(), i9);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4131u = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f4135y && android.view.View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(android.view.ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f4, float f5, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        m2338i((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f4, float f5) {
        return this.f4119K.m419b(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i4, int i5, int[] iArr) {
        this.f4119K.m420c(i4, i5, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i4, int i5, int i6, int i7) {
        m2341m(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i4) {
        mo426a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, android.graphics.Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        android.view.View findNextFocus = rect == null ? android.view.FocusFinder.getInstance().findNextFocus(this, null, i4) : android.view.FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (findNextFocus != null && m2340l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i4, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof p024F.C0207j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p024F.C0207j c0207j = (p024F.C0207j) parcelable;
        super.onRestoreInstanceState(c0207j.getSuperState());
        this.f4117I = c0207j;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, F.j, android.os.Parcelable] */
    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        ?? baseSavedState = new android.view.View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f575l = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        android.view.View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m2340l(findFocus, 0, i7)) {
            return;
        }
        android.graphics.Rect rect = this.f4124n;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int m2337h = m2337h(rect);
        if (m2337h != 0) {
            if (this.f4136z) {
                m2348t(0, m2337h, false);
            } else {
                scrollBy(0, m2337h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i4) {
        return mo430f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        mo428c(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m2344p(int i4) {
        boolean z4 = i4 == 130;
        int height = getHeight();
        android.graphics.Rect rect = this.f4124n;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                android.view.View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        m2345q(i4, i5, i6);
    }

    /* renamed from: q */
    public final boolean m2345q(int i4, int i5, int i6) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z5 = i4 == 33;
        java.util.ArrayList<android.view.View> focusables = getFocusables(2);
        int size = focusables.size();
        android.view.View view = null;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            android.view.View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z7 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z6 = z7;
                } else {
                    boolean z8 = (z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom());
                    if (z6) {
                        if (z7) {
                            if (!z8) {
                            }
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z6 = true;
                    } else {
                        if (!z8) {
                        }
                        view = view2;
                    }
                }
            }
        }
        android.view.View view3 = view == null ? this : view;
        if (i5 < scrollY || i6 > i7) {
            m2346r(z5 ? i5 - scrollY : i6 - i7, -1, null, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i4);
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2346r(int r22, int r23, android.view.MotionEvent r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m2346r(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View view, android.view.View view2) {
        if (this.f4130t) {
            this.f4132v = view2;
        } else {
            android.graphics.Rect rect = this.f4124n;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m2337h = m2337h(rect);
            if (m2337h != 0) {
                scrollBy(0, m2337h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m2337h = m2337h(rect);
        boolean z5 = m2337h != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, m2337h);
            } else {
                m2348t(0, m2337h, false);
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        android.view.VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f4134x) != null) {
            velocityTracker.recycle();
            this.f4134x = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4130t = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean m2347s(android.widget.EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        float m1764B = p101a.AbstractC0936a.m1764B(edgeEffect) * getHeight();
        float abs = java.lang.Math.abs(-i4) * 0.35f;
        float f4 = this.f4122l * 0.015f;
        double log = java.lang.Math.log(abs / f4);
        double d4 = f4106N;
        return ((float) (java.lang.Math.exp((d4 / (d4 - 1.0d)) * log) * ((double) f4))) < m1764B;
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i4 < 0) {
                i4 = 0;
            } else if (width + i4 > width2) {
                i4 = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i4 == getScrollX() && i5 == getScrollY()) {
                return;
            }
            super.scrollTo(i4, i5);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f4135y) {
            this.f4135y = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        p011C.C0115g c0115g = this.f4119K;
        if (c0115g.f323d) {
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            p011C.AbstractC0126r.m449f(c0115g.f322c);
        }
        c0115g.f323d = z4;
    }

    public void setOnScrollChangeListener(p024F.InterfaceC0205h interfaceC0205h) {
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f4136z = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.f4119K.m424g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m2351w(0);
    }

    /* renamed from: t */
    public final void m2348t(int i4, int i5, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (android.view.animation.AnimationUtils.currentAnimationTimeMillis() - this.f4123m > 250) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4125o.startScroll(getScrollX(), scrollY, 0, java.lang.Math.max(0, java.lang.Math.min(i5 + scrollY, java.lang.Math.max(0, height - height2))) - scrollY, 250);
            if (z4) {
                m2349u(2, 1);
            } else {
                m2351w(1);
            }
            this.f4116H = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4125o.isFinished()) {
                this.f4125o.abortAnimation();
                m2351w(1);
            }
            scrollBy(i4, i5);
        }
        this.f4123m = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: u */
    public final void m2349u(int i4, int i5) {
        this.f4119K.m424g(2, i5);
    }

    /* renamed from: v */
    public final boolean m2350v(android.view.MotionEvent motionEvent) {
        boolean z4;
        android.widget.EdgeEffect edgeEffect = this.f4126p;
        if (p101a.AbstractC0936a.m1764B(edgeEffect) != 0.0f) {
            p101a.AbstractC0936a.m1771I(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        android.widget.EdgeEffect edgeEffect2 = this.f4127q;
        if (p101a.AbstractC0936a.m1764B(edgeEffect2) == 0.0f) {
            return z4;
        }
        p101a.AbstractC0936a.m1771I(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: w */
    public final void m2351w(int i4) {
        this.f4119K.m425h(i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i4, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }
}
