package androidx.core.widget;

import B2.r;
import C.C0015b;
import C.C0017d;
import C.C0020g;
import C.C0023j;
import C.C0026m;
import C.InterfaceC0022i;
import C.x;
import E.a;
import F.e;
import F.g;
import F.h;
import F.j;
import a.AbstractC0110a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0022i {

    /* renamed from: N, reason: collision with root package name */
    public static final float f3962N = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: O, reason: collision with root package name */
    public static final g f3963O = new C0015b();

    /* renamed from: P, reason: collision with root package name */
    public static final int[] f3964P = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final int f3965A;

    /* renamed from: B, reason: collision with root package name */
    public final int f3966B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3967C;

    /* renamed from: D, reason: collision with root package name */
    public int f3968D;

    /* renamed from: E, reason: collision with root package name */
    public final int[] f3969E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f3970F;

    /* renamed from: G, reason: collision with root package name */
    public int f3971G;

    /* renamed from: H, reason: collision with root package name */
    public int f3972H;

    /* renamed from: I, reason: collision with root package name */
    public j f3973I;
    public final C0023j J;

    /* renamed from: K, reason: collision with root package name */
    public final C0020g f3974K;

    /* renamed from: L, reason: collision with root package name */
    public float f3975L;

    /* renamed from: M, reason: collision with root package name */
    public final C0017d f3976M;

    /* renamed from: l, reason: collision with root package name */
    public final float f3977l;

    /* renamed from: m, reason: collision with root package name */
    public long f3978m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f3979n;

    /* renamed from: o, reason: collision with root package name */
    public final OverScroller f3980o;

    /* renamed from: p, reason: collision with root package name */
    public final EdgeEffect f3981p;

    /* renamed from: q, reason: collision with root package name */
    public final EdgeEffect f3982q;

    /* renamed from: r, reason: collision with root package name */
    public C0026m f3983r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3984t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3985u;

    /* renamed from: v, reason: collision with root package name */
    public View f3986v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public VelocityTracker f3987x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3988y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3989z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.prology.R.attr.nestedScrollViewStyle);
        this.f3979n = new Rect();
        this.f3984t = true;
        this.f3985u = false;
        this.f3986v = null;
        this.w = false;
        this.f3989z = true;
        this.f3968D = -1;
        this.f3969E = new int[2];
        this.f3970F = new int[2];
        this.f3976M = new C0017d(getContext(), new r(8, this));
        int i4 = Build.VERSION.SDK_INT;
        this.f3981p = i4 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f3982q = i4 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f3977l = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f3980o = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3965A = viewConfiguration.getScaledTouchSlop();
        this.f3966B = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3967C = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3964P, com.prology.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.J = new C0023j(0);
        this.f3974K = new C0020g(this);
        setNestedScrollingEnabled(true);
        x.d(this, f3963O);
    }

    private C0026m getScrollFeedbackProvider() {
        if (this.f3983r == null) {
            this.f3983r = new C0026m(this);
        }
        return this.f3983r;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // C.InterfaceC0021h
    public final void a(View view, View view2, int i4, int i5) {
        C0023j c0023j = this.J;
        if (i5 == 1) {
            c0023j.f321c = i4;
        } else {
            c0023j.f320b = i4;
        }
        u(2, i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // C.InterfaceC0021h
    public final void b(ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8) {
        m(i7, i8, null);
    }

    @Override // C.InterfaceC0021h
    public final void c(View view, int i4) {
        C0023j c0023j = this.J;
        if (i4 == 1) {
            c0023j.f321c = 0;
        } else {
            c0023j.f320b = 0;
        }
        w(i4);
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
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // C.InterfaceC0022i
    public final void d(ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        m(i7, i8, iArr);
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
            android.graphics.Rect r0 = r6.f3979n
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
            r6.p(r3)
            goto Lc9
        L68:
            r6.p(r5)
            goto Lc9
        L6c:
            boolean r7 = r6.j(r3)
            goto Lca
        L71:
            boolean r7 = r6.j(r5)
            goto Lca
        L76:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L7d
            r3 = r5
        L7d:
            r6.p(r3)
            goto Lc9
        L81:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L8c
            boolean r7 = r6.j(r3)
            goto Lca
        L8c:
            boolean r7 = r6.g(r3)
            goto Lca
        L91:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L9c
            boolean r7 = r6.j(r5)
            goto Lca
        L9c:
            boolean r7 = r6.g(r5)
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
        return this.f3974K.a(f4, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f3974K.b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f3974K.c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f3974K.d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f3981p;
        int i5 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
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
        EdgeEffect edgeEffect2 = this.f3982q;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
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

    @Override // C.InterfaceC0021h
    public final void e(int i4, int i5, int i6, int[] iArr) {
        this.f3974K.c(i4, i5, i6, iArr, null);
    }

    @Override // C.InterfaceC0021h
    public final boolean f(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    public final boolean g(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f3979n;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i4);
        }
        if (findFocus == null || !findFocus.isFocused() || l(findFocus, 0, getHeight())) {
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
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
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
        C0023j c0023j = this.J;
        return c0023j.f321c | c0023j.f320b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
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
        if (this.f3975L == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3975L = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3975L;
    }

    public final int h(Rect rect) {
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
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3974K.f(0);
    }

    public final void i(int i4) {
        if (getChildCount() > 0) {
            this.f3980o.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f3972H = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.f3980o.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3974K.f317d;
    }

    public final boolean j(int i4) {
        int childCount;
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f3979n;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i4, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i4, int i5) {
        Rect rect = this.f3979n;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i4 >= getScrollY() && rect.top - i4 <= getScrollY() + i5;
    }

    public final void m(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3974K.d(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3968D) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.s = (int) motionEvent.getY(i4);
            this.f3968D = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f3987x;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i4, int i5, int i6, int i7) {
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
                if (z5 && !this.f3974K.f(1)) {
                    this.f3980o.springBack(i5, i7, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i7);
                return z4 || z5;
            }
            i7 = 0;
        }
        z5 = true;
        if (z5) {
            this.f3980o.springBack(i5, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i7);
        if (z4) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3985u = false;
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
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.w) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f3968D;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y4 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y4 - this.s) > this.f3965A && (2 & getNestedScrollAxes()) == 0) {
                                this.w = true;
                                this.s = y4;
                                if (this.f3987x == null) {
                                    this.f3987x = VelocityTracker.obtain();
                                }
                                this.f3987x.addMovement(motionEvent);
                                this.f3971G = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.w = false;
            this.f3968D = -1;
            VelocityTracker velocityTracker = this.f3987x;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3987x = null;
            }
            if (this.f3980o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y5 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y5 >= childAt.getTop() - scrollY && y5 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    this.s = y5;
                    this.f3968D = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f3987x;
                    if (velocityTracker2 == null) {
                        this.f3987x = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f3987x.addMovement(motionEvent);
                    this.f3980o.computeScrollOffset();
                    if (!v(motionEvent) && this.f3980o.isFinished()) {
                        z4 = false;
                    }
                    this.w = z4;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f3980o.isFinished()) {
                z4 = false;
            }
            this.w = z4;
            VelocityTracker velocityTracker3 = this.f3987x;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f3987x = null;
            }
        }
        return this.w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z4, i4, i5, i6, i7);
        int i9 = 0;
        this.f3984t = false;
        View view = this.f3986v;
        if (view != null && k(view, this)) {
            View view2 = this.f3986v;
            Rect rect = this.f3979n;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h4 = h(rect);
            if (h4 != 0) {
                scrollBy(0, h4);
            }
        }
        this.f3986v = null;
        if (!this.f3985u) {
            if (this.f3973I != null) {
                scrollTo(getScrollX(), this.f3973I.f565l);
                this.f3973I = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
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
        this.f3985u = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f3988y && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        i((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        return this.f3974K.b(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        this.f3974K.c(i4, i5, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        m(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i4, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f3973I = jVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, F.j, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f565l = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f3979n;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h4 = h(rect);
        if (h4 != 0) {
            if (this.f3989z) {
                t(0, h4, false);
            } else {
                scrollBy(0, h4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
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

    public final void p(int i4) {
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f3979n;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
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
        q(i4, i5, i6);
    }

    public final boolean q(int i4, int i5, int i6) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z5 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
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
        View view3 = view == null ? this : view;
        if (i5 < scrollY || i6 > i7) {
            r(z5 ? i5 - scrollY : i6 - i7, -1, null, 0, 1, true);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(int r22, int r23, android.view.MotionEvent r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f3984t) {
            this.f3986v = view2;
        } else {
            Rect rect = this.f3979n;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h4 = h(rect);
            if (h4 != 0) {
                scrollBy(0, h4);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h4 = h(rect);
        boolean z5 = h4 != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, h4);
            } else {
                t(0, h4, false);
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f3987x) != null) {
            velocityTracker.recycle();
            this.f3987x = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3984t = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        float B4 = AbstractC0110a.B(edgeEffect) * getHeight();
        float abs = Math.abs(-i4) * 0.35f;
        float f4 = this.f3977l * 0.015f;
        double log = Math.log(abs / f4);
        double d4 = f3962N;
        return ((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * ((double) f4))) < B4;
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
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
        if (z4 != this.f3988y) {
            this.f3988y = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0020g c0020g = this.f3974K;
        if (c0020g.f317d) {
            Field field = x.f330a;
            C.r.f(c0020g.f316c);
        }
        c0020g.f317d = z4;
    }

    public void setOnScrollChangeListener(h hVar) {
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f3989z = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.f3974K.g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i4, int i5, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3978m > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3980o.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z4) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f3972H = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f3980o.isFinished()) {
                this.f3980o.abortAnimation();
                w(1);
            }
            scrollBy(i4, i5);
        }
        this.f3978m = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i4, int i5) {
        this.f3974K.g(2, i5);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f3981p;
        if (AbstractC0110a.B(edgeEffect) != 0.0f) {
            AbstractC0110a.I(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f3982q;
        if (AbstractC0110a.B(edgeEffect2) == 0.0f) {
            return z4;
        }
        AbstractC0110a.I(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i4) {
        this.f3974K.h(i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
