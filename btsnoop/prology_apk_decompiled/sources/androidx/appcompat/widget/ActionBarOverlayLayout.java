package androidx.appcompat.widget;

import C.AbstractC0030q;
import C.B;
import C.C;
import C.C0023j;
import C.D;
import C.InterfaceC0021h;
import C.InterfaceC0022i;
import C.K;
import C.O;
import C.r;
import C.w;
import C.x;
import C.z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.prology.R;
import f.AbstractC0266a;
import j.A;
import j.C0347b;
import j.C0350e;
import j.InterfaceC0349d;
import j.RunnableC0348c;
import j.s0;
import java.lang.reflect.Field;
import u.C0574b;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0021h, InterfaceC0022i {
    public static final int[] J = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public O f3780A;

    /* renamed from: B, reason: collision with root package name */
    public O f3781B;

    /* renamed from: C, reason: collision with root package name */
    public O f3782C;

    /* renamed from: D, reason: collision with root package name */
    public OverScroller f3783D;

    /* renamed from: E, reason: collision with root package name */
    public ViewPropertyAnimator f3784E;

    /* renamed from: F, reason: collision with root package name */
    public final C0347b f3785F;

    /* renamed from: G, reason: collision with root package name */
    public final RunnableC0348c f3786G;

    /* renamed from: H, reason: collision with root package name */
    public final RunnableC0348c f3787H;

    /* renamed from: I, reason: collision with root package name */
    public final C0023j f3788I;

    /* renamed from: l, reason: collision with root package name */
    public int f3789l;

    /* renamed from: m, reason: collision with root package name */
    public ContentFrameLayout f3790m;

    /* renamed from: n, reason: collision with root package name */
    public ActionBarContainer f3791n;

    /* renamed from: o, reason: collision with root package name */
    public A f3792o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f3793p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3794q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3795r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3796t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3797u;

    /* renamed from: v, reason: collision with root package name */
    public int f3798v;
    public final Rect w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f3799x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f3800y;

    /* renamed from: z, reason: collision with root package name */
    public O f3801z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new Rect();
        this.f3799x = new Rect();
        this.f3800y = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        O o2 = O.f295b;
        this.f3801z = o2;
        this.f3780A = o2;
        this.f3781B = o2;
        this.f3782C = o2;
        this.f3785F = new C0347b(this);
        this.f3786G = new RunnableC0348c(this, 0);
        this.f3787H = new RunnableC0348c(this, 1);
        i(context);
        this.f3788I = new C0023j(0);
    }

    public static boolean g(View view, Rect rect, boolean z4) {
        boolean z5;
        C0350e c0350e = (C0350e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0350e).leftMargin;
        int i5 = rect.left;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0350e).leftMargin = i5;
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0350e).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0350e).topMargin = i7;
            z5 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c0350e).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c0350e).rightMargin = i9;
            z5 = true;
        }
        if (z4) {
            int i10 = ((ViewGroup.MarginLayoutParams) c0350e).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c0350e).bottomMargin = i11;
                return true;
            }
        }
        return z5;
    }

    @Override // C.InterfaceC0021h
    public final void a(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // C.InterfaceC0021h
    public final void b(ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(viewGroup, i4, i5, i6, i7);
        }
    }

    @Override // C.InterfaceC0021h
    public final void c(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0350e;
    }

    @Override // C.InterfaceC0022i
    public final void d(ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        b(viewGroup, i4, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.f3793p == null || this.f3794q) {
            return;
        }
        if (this.f3791n.getVisibility() == 0) {
            i4 = (int) (this.f3791n.getTranslationY() + this.f3791n.getBottom() + 0.5f);
        } else {
            i4 = 0;
        }
        this.f3793p.setBounds(0, i4, getWidth(), this.f3793p.getIntrinsicHeight() + i4);
        this.f3793p.draw(canvas);
    }

    @Override // C.InterfaceC0021h
    public final void e(int i4, int i5, int i6, int[] iArr) {
    }

    @Override // C.InterfaceC0021h
    public final boolean f(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3791n;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0023j c0023j = this.f3788I;
        return c0023j.f321c | c0023j.f320b;
    }

    public CharSequence getTitle() {
        j();
        return ((s0) this.f3792o).f6740a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f3786G);
        removeCallbacks(this.f3787H);
        ViewPropertyAnimator viewPropertyAnimator = this.f3784E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        this.f3789l = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f3793p = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f3794q = context.getApplicationInfo().targetSdkVersion < 19;
        this.f3783D = new OverScroller(context);
    }

    public final void j() {
        A wrapper;
        if (this.f3790m == null) {
            this.f3790m = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3791n = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof A) {
                wrapper = (A) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f3792o = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        O c4 = O.c(this, windowInsets);
        K k4 = c4.f296a;
        boolean g4 = g(this.f3791n, new Rect(k4.i().f8472a, k4.i().f8473b, k4.i().f8474c, k4.i().f8475d), false);
        Field field = x.f330a;
        Rect rect = this.w;
        r.a(this, c4, rect);
        O k5 = k4.k(rect.left, rect.top, rect.right, rect.bottom);
        this.f3801z = k5;
        boolean z4 = true;
        if (!this.f3780A.equals(k5)) {
            this.f3780A = this.f3801z;
            g4 = true;
        }
        Rect rect2 = this.f3799x;
        if (rect2.equals(rect)) {
            z4 = g4;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return k4.a().f296a.c().f296a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = x.f330a;
        AbstractC0030q.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0350e c0350e = (C0350e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) c0350e).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) c0350e).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f3791n, i4, 0, i5, 0);
        C0350e c0350e = (C0350e) this.f3791n.getLayoutParams();
        int max = Math.max(0, this.f3791n.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0350e).leftMargin + ((ViewGroup.MarginLayoutParams) c0350e).rightMargin);
        int max2 = Math.max(0, this.f3791n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0350e).topMargin + ((ViewGroup.MarginLayoutParams) c0350e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f3791n.getMeasuredState());
        Field field = x.f330a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.f3789l;
            if (this.s && this.f3791n.getTabContainer() != null) {
                measuredHeight += this.f3789l;
            }
        } else {
            measuredHeight = this.f3791n.getVisibility() != 8 ? this.f3791n.getMeasuredHeight() : 0;
        }
        Rect rect = this.w;
        Rect rect2 = this.f3800y;
        rect2.set(rect);
        O o2 = this.f3801z;
        this.f3781B = o2;
        if (this.f3795r || z4) {
            C0574b a4 = C0574b.a(o2.f296a.i().f8472a, this.f3781B.f296a.i().f8473b + measuredHeight, this.f3781B.f296a.i().f8474c, this.f3781B.f296a.i().f8475d);
            O o4 = this.f3781B;
            int i6 = Build.VERSION.SDK_INT;
            D c4 = i6 >= 34 ? new C(o4) : i6 >= 30 ? new B(o4) : i6 >= 29 ? new C.A(o4) : new z(o4);
            c4.d(a4);
            this.f3781B = c4.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f3781B = o2.f296a.k(0, measuredHeight, 0, 0);
        }
        g(this.f3790m, rect2, true);
        if (!this.f3782C.equals(this.f3781B)) {
            O o5 = this.f3781B;
            this.f3782C = o5;
            ContentFrameLayout contentFrameLayout = this.f3790m;
            int i7 = Build.VERSION.SDK_INT;
            WindowInsets b4 = o5.b();
            if (b4 != null) {
                WindowInsets a5 = i7 >= 30 ? w.a(contentFrameLayout, b4) : AbstractC0030q.a(contentFrameLayout, b4);
                if (!a5.equals(b4)) {
                    O.c(contentFrameLayout, a5);
                }
            }
        }
        measureChildWithMargins(this.f3790m, i4, 0, i5, 0);
        C0350e c0350e2 = (C0350e) this.f3790m.getLayoutParams();
        int max3 = Math.max(max, this.f3790m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0350e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0350e2).rightMargin);
        int max4 = Math.max(max2, this.f3790m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0350e2).topMargin + ((ViewGroup.MarginLayoutParams) c0350e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f3790m.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        if (!this.f3796t || !z4) {
            return false;
        }
        this.f3783D.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3783D.getFinalY() > this.f3791n.getHeight()) {
            h();
            this.f3787H.run();
        } else {
            h();
            this.f3786G.run();
        }
        this.f3797u = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f3798v + i5;
        this.f3798v = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f3788I.f320b = i4;
        this.f3798v = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f3791n.getVisibility() != 0) {
            return false;
        }
        return this.f3796t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3796t || this.f3797u) {
            return;
        }
        if (this.f3798v <= this.f3791n.getHeight()) {
            h();
            postDelayed(this.f3786G, 600L);
        } else {
            h();
            postDelayed(this.f3787H, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
    }

    public void setActionBarHideOffset(int i4) {
        h();
        this.f3791n.setTranslationY(-Math.max(0, Math.min(i4, this.f3791n.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0349d interfaceC0349d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.s = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f3796t) {
            this.f3796t = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        j();
        s0 s0Var = (s0) this.f3792o;
        s0Var.f6743d = i4 != 0 ? AbstractC0266a.a(s0Var.f6740a.getContext(), i4) : null;
        s0Var.c();
    }

    public void setLogo(int i4) {
        j();
        s0 s0Var = (s0) this.f3792o;
        s0Var.f6744e = i4 != 0 ? AbstractC0266a.a(s0Var.f6740a.getContext(), i4) : null;
        s0Var.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f3795r = z4;
        this.f3794q = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i4) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((s0) this.f3792o).f6750k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        s0 s0Var = (s0) this.f3792o;
        if (s0Var.f6746g) {
            return;
        }
        s0Var.f6747h = charSequence;
        if ((s0Var.f6741b & 8) != 0) {
            s0Var.f6740a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        s0 s0Var = (s0) this.f3792o;
        s0Var.f6743d = drawable;
        s0Var.c();
    }
}
