package androidx.recyclerview.widget;

import A0.c;
import C.C0020g;
import C.r;
import C.x;
import F.b;
import L1.g;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import f2.Y;
import j1.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import k1.B;
import k1.C;
import k1.C0378A;
import k1.C0384f;
import k1.E;
import k1.I;
import k1.RunnableC0386h;
import k1.m;
import k1.n;
import k1.o;
import k1.p;
import k1.q;
import k1.s;
import k1.u;
import k1.v;
import k1.w;
import k1.y;
import k1.z;
import k3.h;
import y.AbstractC0616c;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f4247s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0, reason: collision with root package name */
    public static final int[] f4248t0 = {R.attr.clipToPadding};

    /* renamed from: u0, reason: collision with root package name */
    public static final Class[] f4249u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final m f4250v0;

    /* renamed from: A, reason: collision with root package name */
    public int f4251A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4252B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4253C;

    /* renamed from: D, reason: collision with root package name */
    public int f4254D;

    /* renamed from: E, reason: collision with root package name */
    public final AccessibilityManager f4255E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4256F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4257G;

    /* renamed from: H, reason: collision with root package name */
    public int f4258H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4259I;
    public p J;

    /* renamed from: K, reason: collision with root package name */
    public EdgeEffect f4260K;

    /* renamed from: L, reason: collision with root package name */
    public EdgeEffect f4261L;

    /* renamed from: M, reason: collision with root package name */
    public EdgeEffect f4262M;

    /* renamed from: N, reason: collision with root package name */
    public EdgeEffect f4263N;

    /* renamed from: O, reason: collision with root package name */
    public q f4264O;

    /* renamed from: P, reason: collision with root package name */
    public int f4265P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4266Q;

    /* renamed from: R, reason: collision with root package name */
    public VelocityTracker f4267R;

    /* renamed from: S, reason: collision with root package name */
    public int f4268S;

    /* renamed from: T, reason: collision with root package name */
    public int f4269T;

    /* renamed from: U, reason: collision with root package name */
    public int f4270U;

    /* renamed from: V, reason: collision with root package name */
    public int f4271V;

    /* renamed from: W, reason: collision with root package name */
    public int f4272W;

    /* renamed from: a0, reason: collision with root package name */
    public final int f4273a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f4274b0;

    /* renamed from: c0, reason: collision with root package name */
    public final float f4275c0;

    /* renamed from: d0, reason: collision with root package name */
    public final float f4276d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4277e0;

    /* renamed from: f0, reason: collision with root package name */
    public final C f4278f0;

    /* renamed from: g0, reason: collision with root package name */
    public RunnableC0386h f4279g0;

    /* renamed from: h0, reason: collision with root package name */
    public final c f4280h0;

    /* renamed from: i0, reason: collision with root package name */
    public final C0378A f4281i0;

    /* renamed from: j0, reason: collision with root package name */
    public ArrayList f4282j0;

    /* renamed from: k0, reason: collision with root package name */
    public final g f4283k0;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.c f4284l;

    /* renamed from: l0, reason: collision with root package name */
    public E f4285l0;

    /* renamed from: m, reason: collision with root package name */
    public z f4286m;

    /* renamed from: m0, reason: collision with root package name */
    public C0020g f4287m0;

    /* renamed from: n, reason: collision with root package name */
    public final t f4288n;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f4289n0;

    /* renamed from: o, reason: collision with root package name */
    public final t f4290o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f4291o0;

    /* renamed from: p, reason: collision with root package name */
    public final g f4292p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f4293p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4294q;

    /* renamed from: q0, reason: collision with root package name */
    public final ArrayList f4295q0;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f4296r;

    /* renamed from: r0, reason: collision with root package name */
    public final b f4297r0;
    public final Rect s;

    /* renamed from: t, reason: collision with root package name */
    public s f4298t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4299u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f4300v;
    public C0384f w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4301x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4302y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4303z;

    /* JADX WARN: Type inference failed for: r0v6, types: [k1.m, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        f4249u0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4250v0 = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [k1.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [k1.q, java.lang.Object, k1.b] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, A0.c] */
    /* JADX WARN: Type inference failed for: r1v17, types: [k1.A, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        char c4;
        int i4;
        TypedArray typedArray;
        char c5;
        Constructor constructor;
        this.f4284l = new io.flutter.plugin.platform.c(this);
        this.f4292p = new g(26);
        this.f4296r = new Rect();
        this.s = new Rect();
        new RectF();
        this.f4299u = new ArrayList();
        this.f4300v = new ArrayList();
        this.f4251A = 0;
        this.f4256F = false;
        this.f4257G = false;
        this.f4258H = 0;
        this.f4259I = 0;
        this.J = new Object();
        ?? obj = new Object();
        Object[] objArr = null;
        obj.f7021a = null;
        obj.f7022b = new ArrayList();
        obj.f7023c = 250L;
        obj.f7024d = 250L;
        obj.f6964e = new ArrayList();
        obj.f6965f = new ArrayList();
        obj.f6966g = new ArrayList();
        obj.f6967h = new ArrayList();
        obj.f6968i = new ArrayList();
        obj.f6969j = new ArrayList();
        obj.f6970k = new ArrayList();
        obj.f6971l = new ArrayList();
        obj.f6972m = new ArrayList();
        obj.f6973n = new ArrayList();
        obj.f6974o = new ArrayList();
        this.f4264O = obj;
        this.f4265P = 0;
        this.f4266Q = -1;
        this.f4275c0 = Float.MIN_VALUE;
        this.f4276d0 = Float.MIN_VALUE;
        boolean z4 = true;
        this.f4277e0 = true;
        this.f4278f0 = new C(this);
        this.f4280h0 = new Object();
        ?? obj2 = new Object();
        obj2.f6936a = 0;
        obj2.f6937b = false;
        obj2.f6938c = false;
        obj2.f6939d = false;
        obj2.f6940e = false;
        this.f4281i0 = obj2;
        g gVar = new g(25, false);
        this.f4283k0 = gVar;
        this.f4289n0 = new int[2];
        this.f4291o0 = new int[2];
        this.f4293p0 = new int[2];
        this.f4295q0 = new ArrayList();
        this.f4297r0 = new b(10, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4248t0, 0, 0);
            this.f4294q = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f4294q = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4272W = viewConfiguration.getScaledTouchSlop();
        this.f4275c0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f4276d0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f4273a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4274b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4264O.f7021a = gVar;
        this.f4288n = new t(new F1.g(this));
        this.f4290o = new t(new Y(14, this));
        Field field = x.f330a;
        if (C.t.a(this) == 0) {
            C.t.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f4255E = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new E(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f6920a, 0, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                c4 = 3;
                i4 = 4;
                typedArray = obtainStyledAttributes2;
                c5 = 2;
                new C0384f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.prology.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.prology.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.prology.R.dimen.fastscroll_margin));
            } else {
                c4 = 3;
                i4 = 4;
                typedArray = obtainStyledAttributes2;
                c5 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(s.class);
                        try {
                            constructor = asSubclass.getConstructor(f4249u0);
                            Object[] objArr2 = new Object[i4];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[c5] = 0;
                            objArr2[c4] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e4) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e5) {
                                e5.initCause(e4);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e5);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((s) constructor.newInstance(objArr));
                    } catch (ClassCastException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e6);
                    } catch (ClassNotFoundException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e7);
                    } catch (IllegalAccessException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e8);
                    } catch (InstantiationException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e9);
                    } catch (InvocationTargetException e10) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e10);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f4247s0, 0, 0);
            z4 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z4);
    }

    private C0020g getScrollingChildHelper() {
        if (this.f4287m0 == null) {
            this.f4287m0 = new C0020g(this);
        }
        return this.f4287m0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((k1.t) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i5) {
        s sVar = this.f4298t;
        if (sVar != null) {
            sVar.getClass();
        }
        super.addFocusables(arrayList, i4, i5);
    }

    public final void b(String str) {
        if (this.f4258H > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f4259I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i4, int i5) {
        boolean z4;
        EdgeEffect edgeEffect = this.f4260K;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            z4 = false;
        } else {
            this.f4260K.onRelease();
            z4 = this.f4260K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4262M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.f4262M.onRelease();
            z4 |= this.f4262M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4261L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f4261L.onRelease();
            z4 |= this.f4261L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4263N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f4263N.onRelease();
            z4 |= this.f4263N.isFinished();
        }
        if (z4) {
            Field field = x.f330a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof k1.t) && this.f4298t.d((k1.t) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        s sVar = this.f4298t;
        if (sVar != null && sVar.b()) {
            return this.f4298t.f(this.f4281i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        s sVar = this.f4298t;
        if (sVar != null && sVar.b()) {
            this.f4298t.g(this.f4281i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        s sVar = this.f4298t;
        if (sVar != null && sVar.b()) {
            return this.f4298t.h(this.f4281i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        s sVar = this.f4298t;
        if (sVar != null && sVar.c()) {
            return this.f4298t.i(this.f4281i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        s sVar = this.f4298t;
        if (sVar != null && sVar.c()) {
            this.f4298t.j(this.f4281i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        s sVar = this.f4298t;
        if (sVar != null && sVar.c()) {
            return this.f4298t.k(this.f4281i0);
        }
        return 0;
    }

    public final void d() {
        t tVar = this.f4288n;
        if (!this.f4303z || this.f4256F) {
            int i4 = AbstractC0616c.f8989a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) tVar.f3736o).size() > 0) {
            tVar.getClass();
            if (((ArrayList) tVar.f3736o).size() > 0) {
                int i5 = AbstractC0616c.f8989a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return getScrollingChildHelper().a(f4, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.f4299u;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C0384f c0384f = (C0384f) arrayList.get(i4);
            if (c0384f.f6991l != c0384f.f6993n.getWidth() || c0384f.f6992m != c0384f.f6993n.getHeight()) {
                c0384f.f6991l = c0384f.f6993n.getWidth();
                c0384f.f6992m = c0384f.f6993n.getHeight();
                c0384f.e(0);
            } else if (c0384f.f7000v != 0) {
                if (c0384f.f6994o) {
                    int i5 = c0384f.f6991l;
                    int i6 = c0384f.f6983d;
                    int i7 = i5 - i6;
                    int i8 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0384f.f6981b;
                    stateListDrawable.setBounds(0, 0, i6, 0);
                    int i9 = c0384f.f6992m;
                    Drawable drawable = c0384f.f6982c;
                    drawable.setBounds(0, 0, c0384f.f6984e, i9);
                    RecyclerView recyclerView = c0384f.f6993n;
                    Field field = x.f330a;
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
                if (c0384f.f6995p) {
                    int i10 = c0384f.f6992m;
                    int i11 = c0384f.f6987h;
                    int i12 = i10 - i11;
                    StateListDrawable stateListDrawable2 = c0384f.f6985f;
                    stateListDrawable2.setBounds(0, 0, 0, i11);
                    int i13 = c0384f.f6991l;
                    Drawable drawable2 = c0384f.f6986g;
                    drawable2.setBounds(0, 0, i13, c0384f.f6988i);
                    canvas.translate(0.0f, i12);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i12);
                }
            }
        }
        EdgeEffect edgeEffect = this.f4260K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4294q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4260K;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4261L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4294q) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4261L;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4262M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4294q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4262M;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4263N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4294q) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4263N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(save4);
        }
        if ((z4 || this.f4264O == null || arrayList.size() <= 0 || !this.f4264O.b()) ? z4 : true) {
            Field field2 = x.f330a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public final void e(int i4, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = x.f330a;
        setMeasuredDimension(s.e(i4, paddingRight, getMinimumWidth()), s.e(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, i6, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i4) {
        int i5;
        this.f4298t.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i4);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i4);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view == null || i(view) == null) {
                return findNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f4296r;
            char c4 = 0;
            rect.set(0, 0, width, height);
            int width2 = findNextFocus.getWidth();
            int height2 = findNextFocus.getHeight();
            Rect rect2 = this.s;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect2);
            RecyclerView recyclerView = this.f4298t.f7028b;
            Field field = x.f330a;
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
                                    throw new IllegalArgumentException("Invalid direction: " + i4 + h());
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

    public final boolean g(int[] iArr, int i4) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i4, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        s sVar = this.f4298t;
        if (sVar != null) {
            return sVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        s sVar = this.f4298t;
        if (sVar != null) {
            return sVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public n getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        s sVar = this.f4298t;
        if (sVar == null) {
            return super.getBaseline();
        }
        sVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4294q;
    }

    public E getCompatAccessibilityDelegate() {
        return this.f4285l0;
    }

    public p getEdgeEffectFactory() {
        return this.J;
    }

    public q getItemAnimator() {
        return this.f4264O;
    }

    public int getItemDecorationCount() {
        return this.f4299u.size();
    }

    public s getLayoutManager() {
        return this.f4298t;
    }

    public int getMaxFlingVelocity() {
        return this.f4274b0;
    }

    public int getMinFlingVelocity() {
        return this.f4273a0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public u getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4277e0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [k1.x, java.lang.Object] */
    public k1.x getRecycledViewPool() {
        io.flutter.plugin.platform.c cVar = this.f4284l;
        if (((k1.x) cVar.f6333p) == null) {
            ?? obj = new Object();
            obj.f7036a = new SparseArray();
            obj.f7037b = 0;
            cVar.f6333p = obj;
        }
        return (k1.x) cVar.f6333p;
    }

    public int getScrollState() {
        return this.f4265P;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f4298t + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View i(android.view.View r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i(android.view.View):android.view.View");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f4301x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f317d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f4303z || this.f4256F || ((ArrayList) this.f4288n.f3736o).size() > 0;
    }

    public final void m() {
        int j02 = this.f4290o.j0();
        for (int i4 = 0; i4 < j02; i4++) {
            ((k1.t) this.f4290o.i0(i4).getLayoutParams()).f7035b = true;
        }
        ArrayList arrayList = (ArrayList) this.f4284l.f6332o;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4266Q) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f4266Q = motionEvent.getPointerId(i4);
            int x3 = (int) (motionEvent.getX(i4) + 0.5f);
            this.f4270U = x3;
            this.f4268S = x3;
            int y4 = (int) (motionEvent.getY(i4) + 0.5f);
            this.f4271V = y4;
            this.f4269T = y4;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f4296r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof k1.t) {
            k1.t tVar = (k1.t) layoutParams;
            if (!tVar.f7035b) {
                int i4 = rect.left;
                Rect rect2 = tVar.f7034a;
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
        this.f4298t.G(this, view, this.f4296r, !this.f4303z, view2 == null);
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
            r5.f4258H = r0
            r1 = 1
            r5.f4301x = r1
            boolean r2 = r5.f4303z
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = r1
        L14:
            r5.f4303z = r0
            k1.s r0 = r5.f4298t
            if (r0 == 0) goto L1c
            r0.f7031e = r1
        L1c:
            java.lang.ThreadLocal r0 = k1.RunnableC0386h.f7006p
            java.lang.Object r1 = r0.get()
            k1.h r1 = (k1.RunnableC0386h) r1
            r5.f4279g0 = r1
            if (r1 != 0) goto L64
            k1.h r1 = new k1.h
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7008l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f7011o = r2
            r5.f4279g0 = r1
            java.lang.reflect.Field r1 = C.x.f330a
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
            k1.h r2 = r5.f4279g0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f7010n = r3
            r0.set(r2)
        L64:
            k1.h r0 = r5.f4279g0
            java.util.ArrayList r0 = r0.f7008l
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        q qVar = this.f4264O;
        if (qVar != null) {
            qVar.a();
        }
        setScrollState(0);
        C c4 = this.f4278f0;
        c4.f6947r.removeCallbacks(c4);
        c4.f6943n.abortAnimation();
        this.f4301x = false;
        s sVar = this.f4298t;
        if (sVar != null) {
            sVar.f7031e = false;
            sVar.z(this);
        }
        this.f4295q0.clear();
        removeCallbacks(this.f4297r0);
        this.f4292p.getClass();
        do {
            B.c cVar = I.f6963a;
            int i4 = cVar.f84l;
            obj = null;
            if (i4 > 0) {
                int i5 = i4 - 1;
                Object[] objArr = (Object[]) cVar.f85m;
                Object obj2 = objArr[i5];
                h.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i5] = null;
                cVar.f84l--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC0386h runnableC0386h = this.f4279g0;
        if (runnableC0386h != null) {
            runnableC0386h.f7008l.remove(this);
            this.f4279g0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f4299u;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0384f) arrayList.get(i4)).getClass();
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
            k1.s r0 = r5.f4298t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4252B
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
            k1.s r0 = r5.f4298t
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            k1.s r3 = r5.f4298t
            boolean r3 = r3.b()
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
            k1.s r3 = r5.f4298t
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            k1.s r3 = r5.f4298t
            boolean r3 = r3.b()
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
            float r2 = r5.f4275c0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4276d0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.q(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.f4252B) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.w = null;
        }
        ArrayList arrayList = this.f4300v;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0384f c0384f = (C0384f) arrayList.get(i4);
            if (c0384f.c(motionEvent) && action != 3) {
                this.w = c0384f;
                p();
                setScrollState(0);
                return true;
            }
        }
        s sVar = this.f4298t;
        if (sVar == null) {
            return false;
        }
        boolean b4 = sVar.b();
        boolean c4 = this.f4298t.c();
        if (this.f4267R == null) {
            this.f4267R = VelocityTracker.obtain();
        }
        this.f4267R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4253C) {
                this.f4253C = false;
            }
            this.f4266Q = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f4270U = x3;
            this.f4268S = x3;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.f4271V = y4;
            this.f4269T = y4;
            if (this.f4265P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f4293p0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i5 = b4;
            if (c4) {
                i5 = (b4 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i5, 0);
        } else if (actionMasked == 1) {
            this.f4267R.clear();
            s(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4266Q);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4266Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4265P != 1) {
                int i6 = x4 - this.f4268S;
                int i7 = y5 - this.f4269T;
                if (b4 == 0 || Math.abs(i6) <= this.f4272W) {
                    z4 = false;
                } else {
                    this.f4270U = x4;
                    z4 = true;
                }
                if (c4 && Math.abs(i7) > this.f4272W) {
                    this.f4271V = y5;
                    z4 = true;
                }
                if (z4) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f4266Q = motionEvent.getPointerId(actionIndex);
            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4270U = x5;
            this.f4268S = x5;
            int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4271V = y6;
            this.f4269T = y6;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f4265P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8 = AbstractC0616c.f8989a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f4303z = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        s sVar = this.f4298t;
        if (sVar == null) {
            e(i4, i5);
            return;
        }
        if (sVar.y()) {
            View.MeasureSpec.getMode(i4);
            View.MeasureSpec.getMode(i5);
            this.f4298t.f7028b.e(i4, i5);
        } else {
            if (this.f4302y) {
                this.f4298t.f7028b.e(i4, i5);
                return;
            }
            C0378A c0378a = this.f4281i0;
            if (c0378a.f6940e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c0378a.getClass();
            this.f4251A++;
            this.f4298t.f7028b.e(i4, i5);
            if (this.f4251A < 1) {
                this.f4251A = 1;
            }
            this.f4251A--;
            c0378a.f6938c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (this.f4258H > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f4286m = zVar;
        super.onRestoreInstanceState(zVar.f698l);
        s sVar = this.f4298t;
        if (sVar == null || (parcelable2 = this.f4286m.f7038n) == null) {
            return;
        }
        sVar.B(parcelable2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k1.z, android.os.Parcelable, H.c] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? cVar = new H.c(super.onSaveInstanceState());
        z zVar = this.f4286m;
        if (zVar != null) {
            cVar.f7038n = zVar.f7038n;
        } else {
            s sVar = this.f4298t;
            if (sVar != null) {
                cVar.f7038n = sVar.C();
            } else {
                cVar.f7038n = null;
            }
        }
        return cVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        this.f4263N = null;
        this.f4261L = null;
        this.f4262M = null;
        this.f4260K = null;
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

    public final void p() {
        VelocityTracker velocityTracker = this.f4267R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z4 = false;
        s(0);
        EdgeEffect edgeEffect = this.f4260K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = this.f4260K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4261L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 |= this.f4261L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4262M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 |= this.f4262M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4263N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 |= this.f4263N.isFinished();
        }
        if (z4) {
            Field field = x.f330a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r11, int r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q(int, int, android.view.MotionEvent):void");
    }

    public final void r(int i4, int i5) {
        int i6;
        s sVar = this.f4298t;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4252B) {
            return;
        }
        int i7 = !sVar.b() ? 0 : i4;
        int i8 = !this.f4298t.c() ? 0 : i5;
        if (i7 == 0 && i8 == 0) {
            return;
        }
        C c4 = this.f4278f0;
        c4.getClass();
        int abs = Math.abs(i7);
        int abs2 = Math.abs(i8);
        boolean z4 = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i8 * i8) + (i7 * i7));
        RecyclerView recyclerView = c4.f6947r;
        int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i9 = width / 2;
        float f4 = width;
        float f5 = i9;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f4) - 0.5f) * 0.47123894f)) * f5) + f5;
        if (sqrt > 0) {
            i6 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z4) {
                abs = abs2;
            }
            i6 = (int) (((abs / f4) + 1.0f) * 300.0f);
        }
        int min = Math.min(i6, 2000);
        m mVar = f4250v0;
        if (c4.f6944o != mVar) {
            c4.f6944o = mVar;
            c4.f6943n = new OverScroller(recyclerView.getContext(), mVar);
        }
        recyclerView.setScrollState(2);
        c4.f6942m = 0;
        c4.f6941l = 0;
        c4.f6943n.startScroll(0, 0, i7, i8, min);
        c4.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f4298t.getClass();
        if (this.f4258H <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f4298t.G(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.f4300v;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0384f) arrayList.get(i4)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4251A != 0 || this.f4252B) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i4) {
        getScrollingChildHelper().h(i4);
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i5) {
        s sVar = this.f4298t;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4252B) {
            return;
        }
        boolean b4 = sVar.b();
        boolean c4 = this.f4298t.c();
        if (b4 || c4) {
            if (!b4) {
                i4 = 0;
            }
            if (!c4) {
                i5 = 0;
            }
            q(i4, i5, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f4258H <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f4254D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(E e4) {
        this.f4285l0 = e4;
        x.d(this, e4);
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [k1.x, java.lang.Object] */
    public void setAdapter(n nVar) {
        setLayoutFrozen(false);
        q qVar = this.f4264O;
        if (qVar != null) {
            qVar.a();
        }
        s sVar = this.f4298t;
        io.flutter.plugin.platform.c cVar = this.f4284l;
        if (sVar != null) {
            sVar.E();
            this.f4298t.F(cVar);
        }
        ((ArrayList) cVar.f6331n).clear();
        ArrayList arrayList = (ArrayList) cVar.f6332o;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        c cVar2 = ((RecyclerView) cVar.f6334q).f4280h0;
        cVar2.getClass();
        cVar2.f9c = 0;
        t tVar = this.f4288n;
        tVar.v0((ArrayList) tVar.f3736o);
        tVar.v0((ArrayList) tVar.f3735n);
        ((ArrayList) cVar.f6331n).clear();
        ArrayList arrayList2 = (ArrayList) cVar.f6332o;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            arrayList2.get(size2).getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        RecyclerView recyclerView = (RecyclerView) cVar.f6334q;
        c cVar3 = recyclerView.f4280h0;
        cVar3.getClass();
        cVar3.f9c = 0;
        if (((k1.x) cVar.f6333p) == null) {
            ?? obj = new Object();
            obj.f7036a = new SparseArray();
            obj.f7037b = 0;
            cVar.f6333p = obj;
        }
        k1.x xVar = (k1.x) cVar.f6333p;
        if (xVar.f7037b == 0) {
            SparseArray sparseArray = xVar.f7036a;
            if (sparseArray.size() > 0) {
                ((w) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f4281i0.f6937b = true;
        this.f4257G = this.f4257G;
        this.f4256F = true;
        int j02 = this.f4290o.j0();
        for (int i4 = 0; i4 < j02; i4++) {
            j(this.f4290o.i0(i4));
        }
        m();
        int size3 = arrayList2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            if (arrayList2.get(i5) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            arrayList2.get(size4).getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        c cVar4 = recyclerView.f4280h0;
        cVar4.getClass();
        cVar4.f9c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(o oVar) {
        if (oVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f4294q) {
            this.f4263N = null;
            this.f4261L = null;
            this.f4262M = null;
            this.f4260K = null;
        }
        this.f4294q = z4;
        super.setClipToPadding(z4);
        if (this.f4303z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(p pVar) {
        pVar.getClass();
        this.J = pVar;
        this.f4263N = null;
        this.f4261L = null;
        this.f4262M = null;
        this.f4260K = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.f4302y = z4;
    }

    public void setItemAnimator(q qVar) {
        q qVar2 = this.f4264O;
        if (qVar2 != null) {
            qVar2.a();
            this.f4264O.f7021a = null;
        }
        this.f4264O = qVar;
        if (qVar != null) {
            qVar.f7021a = this.f4283k0;
        }
    }

    public void setItemViewCacheSize(int i4) {
        io.flutter.plugin.platform.c cVar = this.f4284l;
        cVar.f6329l = i4;
        cVar.d();
    }

    public void setLayoutFrozen(boolean z4) {
        if (z4 != this.f4252B) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z4) {
                this.f4252B = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4252B = true;
            this.f4253C = true;
            setScrollState(0);
            C c4 = this.f4278f0;
            c4.f6947r.removeCallbacks(c4);
            c4.f6943n.abortAnimation();
        }
    }

    public void setLayoutManager(s sVar) {
        Y y4;
        if (sVar == this.f4298t) {
            return;
        }
        setScrollState(0);
        C c4 = this.f4278f0;
        c4.f6947r.removeCallbacks(c4);
        c4.f6943n.abortAnimation();
        s sVar2 = this.f4298t;
        io.flutter.plugin.platform.c cVar = this.f4284l;
        if (sVar2 != null) {
            q qVar = this.f4264O;
            if (qVar != null) {
                qVar.a();
            }
            this.f4298t.E();
            this.f4298t.F(cVar);
            ((ArrayList) cVar.f6331n).clear();
            ArrayList arrayList = (ArrayList) cVar.f6332o;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            arrayList.clear();
            c cVar2 = ((RecyclerView) cVar.f6334q).f4280h0;
            cVar2.getClass();
            cVar2.f9c = 0;
            if (this.f4301x) {
                s sVar3 = this.f4298t;
                sVar3.f7031e = false;
                sVar3.z(this);
            }
            this.f4298t.I(null);
            this.f4298t = null;
        } else {
            ((ArrayList) cVar.f6331n).clear();
            ArrayList arrayList2 = (ArrayList) cVar.f6332o;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                arrayList2.get(size2).getClass();
                throw new ClassCastException();
            }
            arrayList2.clear();
            c cVar3 = ((RecyclerView) cVar.f6334q).f4280h0;
            cVar3.getClass();
            cVar3.f9c = 0;
        }
        t tVar = this.f4290o;
        ((G0.c) tVar.f3735n).G();
        ArrayList arrayList3 = (ArrayList) tVar.f3736o;
        int size3 = arrayList3.size() - 1;
        while (true) {
            y4 = (Y) tVar.f3734m;
            if (size3 < 0) {
                break;
            }
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = (RecyclerView) y4.f5535m;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4298t = sVar;
        if (sVar != null) {
            if (sVar.f7028b != null) {
                throw new IllegalArgumentException("LayoutManager " + sVar + " is already attached to a RecyclerView:" + sVar.f7028b.h());
            }
            sVar.I(this);
            if (this.f4301x) {
                this.f4298t.f7031e = true;
            }
        }
        cVar.d();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0020g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f317d) {
            Field field = x.f330a;
            r.f(scrollingChildHelper.f316c);
        }
        scrollingChildHelper.f317d = z4;
    }

    public void setOnFlingListener(u uVar) {
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f4277e0 = z4;
    }

    public void setRecycledViewPool(k1.x xVar) {
        io.flutter.plugin.platform.c cVar = this.f4284l;
        if (((k1.x) cVar.f6333p) != null) {
            r1.f7037b--;
        }
        cVar.f6333p = xVar;
        if (xVar != null) {
            ((RecyclerView) cVar.f6334q).getAdapter();
        }
    }

    public void setRecyclerListener(y yVar) {
    }

    public void setScrollState(int i4) {
        if (i4 == this.f4265P) {
            return;
        }
        this.f4265P = i4;
        if (i4 != 2) {
            C c4 = this.f4278f0;
            c4.f6947r.removeCallbacks(c4);
            c4.f6943n.abortAnimation();
        }
        s sVar = this.f4298t;
        if (sVar != null) {
            sVar.D(i4);
        }
        ArrayList arrayList = this.f4282j0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v) this.f4282j0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.f4272W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.f4272W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(B b4) {
        this.f4284l.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        s sVar = this.f4298t;
        if (sVar != null) {
            return sVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }
}
