package androidx.appcompat.widget;

import C.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.prology.R;
import e.AbstractC0248a;
import f.AbstractC0266a;
import f2.Y;
import h.d;
import i.MenuC0328i;
import i.MenuItemC0329j;
import j.A;
import j.C0351f;
import j.C0354i;
import j.C0361p;
import j.C0362q;
import j.C0365u;
import j.T;
import j.n0;
import j.o0;
import j.p0;
import j.q0;
import j.r0;
import j.s0;
import j.v0;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f3902A;

    /* renamed from: B, reason: collision with root package name */
    public int f3903B;

    /* renamed from: C, reason: collision with root package name */
    public int f3904C;

    /* renamed from: D, reason: collision with root package name */
    public int f3905D;

    /* renamed from: E, reason: collision with root package name */
    public T f3906E;

    /* renamed from: F, reason: collision with root package name */
    public int f3907F;

    /* renamed from: G, reason: collision with root package name */
    public int f3908G;

    /* renamed from: H, reason: collision with root package name */
    public final int f3909H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f3910I;
    public CharSequence J;

    /* renamed from: K, reason: collision with root package name */
    public ColorStateList f3911K;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f3912L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f3913M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3914N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f3915O;

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f3916P;

    /* renamed from: Q, reason: collision with root package name */
    public final int[] f3917Q;

    /* renamed from: R, reason: collision with root package name */
    public final Y f3918R;

    /* renamed from: S, reason: collision with root package name */
    public s0 f3919S;

    /* renamed from: T, reason: collision with root package name */
    public o0 f3920T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3921U;

    /* renamed from: V, reason: collision with root package name */
    public final F.b f3922V;

    /* renamed from: l, reason: collision with root package name */
    public ActionMenuView f3923l;

    /* renamed from: m, reason: collision with root package name */
    public C0365u f3924m;

    /* renamed from: n, reason: collision with root package name */
    public C0365u f3925n;

    /* renamed from: o, reason: collision with root package name */
    public C0361p f3926o;

    /* renamed from: p, reason: collision with root package name */
    public C0362q f3927p;

    /* renamed from: q, reason: collision with root package name */
    public final Drawable f3928q;

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f3929r;
    public C0361p s;

    /* renamed from: t, reason: collision with root package name */
    public View f3930t;

    /* renamed from: u, reason: collision with root package name */
    public Context f3931u;

    /* renamed from: v, reason: collision with root package name */
    public int f3932v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public int f3933x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3934y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3935z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f3909H = 8388627;
        this.f3915O = new ArrayList();
        this.f3916P = new ArrayList();
        this.f3917Q = new int[2];
        this.f3918R = new Y(11, this);
        this.f3922V = new F.b(8, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0248a.f5016t;
        t q02 = t.q0(context2, attributeSet, iArr, R.attr.toolbarStyle);
        x.c(this, context, iArr, attributeSet, (TypedArray) q02.f3735n, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) q02.f3735n;
        this.w = typedArray.getResourceId(28, 0);
        this.f3933x = typedArray.getResourceId(19, 0);
        this.f3909H = typedArray.getInteger(0, 8388627);
        this.f3934y = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f3905D = dimensionPixelOffset;
        this.f3904C = dimensionPixelOffset;
        this.f3903B = dimensionPixelOffset;
        this.f3902A = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f3902A = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f3903B = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f3904C = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f3905D = dimensionPixelOffset5;
        }
        this.f3935z = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        T t4 = this.f3906E;
        t4.f6631h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            t4.f6628e = dimensionPixelSize;
            t4.f6624a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            t4.f6629f = dimensionPixelSize2;
            t4.f6625b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            t4.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f3907F = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f3908G = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f3928q = q02.g0(4);
        this.f3929r = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f3931u = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable g02 = q02.g0(16);
        if (g02 != null) {
            setNavigationIcon(g02);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable g03 = q02.g0(11);
        if (g03 != null) {
            setLogo(g03);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(q02.e0(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(q02.e0(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        q02.u0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.p0, android.view.ViewGroup$MarginLayoutParams] */
    public static p0 g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f6732b = 0;
        marginLayoutParams.f6731a = 8388627;
        return marginLayoutParams;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static p0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof p0;
        if (z4) {
            p0 p0Var = (p0) layoutParams;
            p0 p0Var2 = new p0(p0Var);
            p0Var2.f6732b = 0;
            p0Var2.f6732b = p0Var.f6732b;
            return p0Var2;
        }
        if (z4) {
            p0 p0Var3 = new p0((p0) layoutParams);
            p0Var3.f6732b = 0;
            return p0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            p0 p0Var4 = new p0(layoutParams);
            p0Var4.f6732b = 0;
            return p0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        p0 p0Var5 = new p0(marginLayoutParams);
        p0Var5.f6732b = 0;
        ((ViewGroup.MarginLayoutParams) p0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) p0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) p0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) p0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return p0Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i4, ArrayList arrayList) {
        Field field = x.f330a;
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        arrayList.clear();
        if (!z4) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                p0 p0Var = (p0) childAt.getLayoutParams();
                if (p0Var.f6732b == 0 && r(childAt) && i(p0Var.f6731a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            p0 p0Var2 = (p0) childAt2.getLayoutParams();
            if (p0Var2.f6732b == 0 && r(childAt2) && i(p0Var2.f6731a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p0 g4 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (p0) layoutParams;
        g4.f6732b = 1;
        if (!z4 || this.f3930t == null) {
            addView(view, g4);
        } else {
            view.setLayoutParams(g4);
            this.f3916P.add(view);
        }
    }

    public final void c() {
        if (this.s == null) {
            C0361p c0361p = new C0361p(getContext());
            this.s = c0361p;
            c0361p.setImageDrawable(this.f3928q);
            this.s.setContentDescription(this.f3929r);
            p0 g4 = g();
            g4.f6731a = (this.f3934y & 112) | 8388611;
            g4.f6732b = 2;
            this.s.setLayoutParams(g4);
            this.s.setOnClickListener(new n0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof p0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j.T, java.lang.Object] */
    public final void d() {
        if (this.f3906E == null) {
            ?? obj = new Object();
            obj.f6624a = 0;
            obj.f6625b = 0;
            obj.f6626c = Integer.MIN_VALUE;
            obj.f6627d = Integer.MIN_VALUE;
            obj.f6628e = 0;
            obj.f6629f = 0;
            obj.f6630g = false;
            obj.f6631h = false;
            this.f3906E = obj;
        }
    }

    public final void e() {
        if (this.f3923l == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f3923l = actionMenuView;
            actionMenuView.setPopupTheme(this.f3932v);
            this.f3923l.setOnMenuItemClickListener(this.f3918R);
            this.f3923l.getClass();
            p0 g4 = g();
            g4.f6731a = (this.f3934y & 112) | 8388613;
            this.f3923l.setLayoutParams(g4);
            b(this.f3923l, false);
        }
        ActionMenuView actionMenuView2 = this.f3923l;
        if (actionMenuView2.f3802A == null) {
            MenuC0328i menuC0328i = (MenuC0328i) actionMenuView2.getMenu();
            if (this.f3920T == null) {
                this.f3920T = new o0(this);
            }
            this.f3923l.setExpandedActionViewsExclusive(true);
            menuC0328i.b(this.f3920T, this.f3931u);
        }
    }

    public final void f() {
        if (this.f3926o == null) {
            this.f3926o = new C0361p(getContext());
            p0 g4 = g();
            g4.f6731a = (this.f3934y & 112) | 8388611;
            this.f3926o.setLayoutParams(g4);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0361p c0361p = this.s;
        if (c0361p != null) {
            return c0361p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0361p c0361p = this.s;
        if (c0361p != null) {
            return c0361p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        T t4 = this.f3906E;
        if (t4 != null) {
            return t4.f6630g ? t4.f6624a : t4.f6625b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f3908G;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        T t4 = this.f3906E;
        if (t4 != null) {
            return t4.f6624a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        T t4 = this.f3906E;
        if (t4 != null) {
            return t4.f6625b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        T t4 = this.f3906E;
        if (t4 != null) {
            return t4.f6630g ? t4.f6625b : t4.f6624a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f3907F;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0328i menuC0328i;
        ActionMenuView actionMenuView = this.f3923l;
        return (actionMenuView == null || (menuC0328i = actionMenuView.f3802A) == null || !menuC0328i.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3908G, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = x.f330a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = x.f330a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3907F, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0362q c0362q = this.f3927p;
        if (c0362q != null) {
            return c0362q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0362q c0362q = this.f3927p;
        if (c0362q != null) {
            return c0362q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f3923l.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0361p c0361p = this.f3926o;
        if (c0361p != null) {
            return c0361p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0361p c0361p = this.f3926o;
        if (c0361p != null) {
            return c0361p.getDrawable();
        }
        return null;
    }

    public C0354i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f3923l.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3931u;
    }

    public int getPopupTheme() {
        return this.f3932v;
    }

    public CharSequence getSubtitle() {
        return this.J;
    }

    public final TextView getSubtitleTextView() {
        return this.f3925n;
    }

    public CharSequence getTitle() {
        return this.f3910I;
    }

    public int getTitleMarginBottom() {
        return this.f3905D;
    }

    public int getTitleMarginEnd() {
        return this.f3903B;
    }

    public int getTitleMarginStart() {
        return this.f3902A;
    }

    public int getTitleMarginTop() {
        return this.f3904C;
    }

    public final TextView getTitleTextView() {
        return this.f3924m;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j.s0, java.lang.Object] */
    public A getWrapper() {
        Drawable drawable;
        if (this.f3919S == null) {
            ?? obj = new Object();
            obj.f6751l = 0;
            obj.f6740a = this;
            obj.f6747h = getTitle();
            obj.f6748i = getSubtitle();
            obj.f6746g = obj.f6747h != null;
            obj.f6745f = getNavigationIcon();
            t q02 = t.q0(getContext(), null, AbstractC0248a.f4998a, R.attr.actionBarStyle);
            obj.f6752m = q02.g0(15);
            TypedArray typedArray = (TypedArray) q02.f3735n;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f6746g = true;
                obj.f6747h = text;
                if ((obj.f6741b & 8) != 0) {
                    obj.f6740a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f6748i = text2;
                if ((obj.f6741b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable g02 = q02.g0(20);
            if (g02 != null) {
                obj.f6744e = g02;
                obj.c();
            }
            Drawable g03 = q02.g0(17);
            if (g03 != null) {
                obj.f6743d = g03;
                obj.c();
            }
            if (obj.f6745f == null && (drawable = obj.f6752m) != null) {
                obj.f6745f = drawable;
                int i4 = obj.f6741b & 4;
                Toolbar toolbar = obj.f6740a;
                if (i4 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f6742c;
                if (view != null && (obj.f6741b & 16) != 0) {
                    removeView(view);
                }
                obj.f6742c = inflate;
                if (inflate != null && (obj.f6741b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f6741b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f3906E.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.w = resourceId2;
                C0365u c0365u = this.f3924m;
                if (c0365u != null) {
                    c0365u.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f3933x = resourceId3;
                C0365u c0365u2 = this.f3925n;
                if (c0365u2 != null) {
                    c0365u2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            q02.u0();
            if (R.string.abc_action_bar_up_description != obj.f6751l) {
                obj.f6751l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i5 = obj.f6751l;
                    obj.f6749j = i5 != 0 ? getContext().getString(i5) : null;
                    obj.b();
                }
            }
            obj.f6749j = getNavigationContentDescription();
            setNavigationOnClickListener(new n0((s0) obj));
            this.f3919S = obj;
        }
        return this.f3919S;
    }

    public final int i(int i4) {
        Field field = x.f330a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int j(View view, int i4) {
        p0 p0Var = (p0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int i6 = p0Var.f6731a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f3909H & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
        if (i7 < i8) {
            i7 = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
            int i10 = ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
            if (i9 < i10) {
                i7 = Math.max(0, i7 - (i10 - i9));
            }
        }
        return paddingTop + i7;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f3916P.contains(view);
    }

    public final int n(View view, int i4, int i5, int[] iArr) {
        p0 p0Var = (p0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) p0Var).leftMargin - iArr[0];
        int max = Math.max(0, i6) + i4;
        iArr[0] = Math.max(0, -i6);
        int j4 = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j4, max + measuredWidth, view.getMeasuredHeight() + j4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + max;
    }

    public final int o(View view, int i4, int i5, int[] iArr) {
        p0 p0Var = (p0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin - iArr[1];
        int max = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int j4 = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j4, max, view.getMeasuredHeight() + j4);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3922V);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3914N = false;
        }
        if (!this.f3914N) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3914N = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3914N = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean a4 = v0.a(this);
        int i13 = !a4 ? 1 : 0;
        int i14 = 0;
        if (r(this.f3926o)) {
            q(this.f3926o, i4, 0, i5, this.f3935z);
            i6 = k(this.f3926o) + this.f3926o.getMeasuredWidth();
            i7 = Math.max(0, l(this.f3926o) + this.f3926o.getMeasuredHeight());
            i8 = View.combineMeasuredStates(0, this.f3926o.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (r(this.s)) {
            q(this.s, i4, 0, i5, this.f3935z);
            i6 = k(this.s) + this.s.getMeasuredWidth();
            i7 = Math.max(i7, l(this.s) + this.s.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.s.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        int max2 = Math.max(0, currentContentInsetStart - i6);
        int[] iArr = this.f3917Q;
        iArr[a4 ? 1 : 0] = max2;
        if (r(this.f3923l)) {
            q(this.f3923l, i4, max, i5, this.f3935z);
            i9 = k(this.f3923l) + this.f3923l.getMeasuredWidth();
            i7 = Math.max(i7, l(this.f3923l) + this.f3923l.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f3923l.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i9);
        iArr[i13] = Math.max(0, currentContentInsetEnd - i9);
        if (r(this.f3930t)) {
            max3 += p(this.f3930t, i4, max3, i5, 0, iArr);
            i7 = Math.max(i7, l(this.f3930t) + this.f3930t.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f3930t.getMeasuredState());
        }
        if (r(this.f3927p)) {
            max3 += p(this.f3927p, i4, max3, i5, 0, iArr);
            i7 = Math.max(i7, l(this.f3927p) + this.f3927p.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f3927p.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (((p0) childAt.getLayoutParams()).f6732b == 0 && r(childAt)) {
                max3 += p(childAt, i4, max3, i5, 0, iArr);
                i7 = Math.max(i7, l(childAt) + childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
            }
        }
        int i16 = this.f3904C + this.f3905D;
        int i17 = this.f3902A + this.f3903B;
        if (r(this.f3924m)) {
            p(this.f3924m, i4, max3 + i17, i5, i16, iArr);
            int k4 = k(this.f3924m) + this.f3924m.getMeasuredWidth();
            i10 = l(this.f3924m) + this.f3924m.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i8, this.f3924m.getMeasuredState());
            i12 = k4;
        } else {
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        if (r(this.f3925n)) {
            i12 = Math.max(i12, p(this.f3925n, i4, max3 + i17, i5, i10 + i16, iArr));
            i10 += l(this.f3925n) + this.f3925n.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, this.f3925n.getMeasuredState());
        }
        int max4 = Math.max(i7, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i12, getSuggestedMinimumWidth()), i4, (-16777216) & i11);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, i11 << 16);
        if (this.f3921U) {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = getChildAt(i18);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i14);
        }
        i14 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i14);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof r0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r0 r0Var = (r0) parcelable;
        super.onRestoreInstanceState(r0Var.f698l);
        ActionMenuView actionMenuView = this.f3923l;
        MenuC0328i menuC0328i = actionMenuView != null ? actionMenuView.f3802A : null;
        int i4 = r0Var.f6735n;
        if (i4 != 0 && this.f3920T != null && menuC0328i != null && (findItem = menuC0328i.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (r0Var.f6736o) {
            F.b bVar = this.f3922V;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        d();
        T t4 = this.f3906E;
        boolean z4 = i4 == 1;
        if (z4 == t4.f6630g) {
            return;
        }
        t4.f6630g = z4;
        if (!t4.f6631h) {
            t4.f6624a = t4.f6628e;
            t4.f6625b = t4.f6629f;
            return;
        }
        if (z4) {
            int i5 = t4.f6627d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = t4.f6628e;
            }
            t4.f6624a = i5;
            int i6 = t4.f6626c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = t4.f6629f;
            }
            t4.f6625b = i6;
            return;
        }
        int i7 = t4.f6626c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = t4.f6628e;
        }
        t4.f6624a = i7;
        int i8 = t4.f6627d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = t4.f6629f;
        }
        t4.f6625b = i8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.r0, android.os.Parcelable, H.c] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0354i c0354i;
        C0351f c0351f;
        MenuItemC0329j menuItemC0329j;
        ?? cVar = new H.c(super.onSaveInstanceState());
        o0 o0Var = this.f3920T;
        if (o0Var != null && (menuItemC0329j = o0Var.f6727m) != null) {
            cVar.f6735n = menuItemC0329j.f6070a;
        }
        ActionMenuView actionMenuView = this.f3923l;
        cVar.f6736o = (actionMenuView == null || (c0354i = actionMenuView.f3805D) == null || (c0351f = c0354i.f6676C) == null || !c0351f.b()) ? false : true;
        return cVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3913M = false;
        }
        if (!this.f3913M) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3913M = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3913M = false;
        }
        return true;
    }

    public final int p(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(AbstractC0266a.a(getContext(), i4));
    }

    public void setCollapsible(boolean z4) {
        this.f3921U = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f3908G) {
            this.f3908G = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f3907F) {
            this.f3907F = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(AbstractC0266a.a(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(AbstractC0266a.a(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f3926o.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(q0 q0Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f3923l.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f3932v != i4) {
            this.f3932v = i4;
            if (i4 == 0) {
                this.f3931u = getContext();
            } else {
                this.f3931u = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f3905D = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f3903B = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f3902A = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f3904C = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.p0, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f6731a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0248a.f4999b);
        marginLayoutParams.f6731a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f6732b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0361p c0361p = this.s;
        if (c0361p != null) {
            c0361p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.s.setImageDrawable(drawable);
        } else {
            C0361p c0361p = this.s;
            if (c0361p != null) {
                c0361p.setImageDrawable(this.f3928q);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f3927p == null) {
                this.f3927p = new C0362q(getContext(), 0);
            }
            if (!m(this.f3927p)) {
                b(this.f3927p, true);
            }
        } else {
            C0362q c0362q = this.f3927p;
            if (c0362q != null && m(c0362q)) {
                removeView(this.f3927p);
                this.f3916P.remove(this.f3927p);
            }
        }
        C0362q c0362q2 = this.f3927p;
        if (c0362q2 != null) {
            c0362q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f3927p == null) {
            this.f3927p = new C0362q(getContext(), 0);
        }
        C0362q c0362q = this.f3927p;
        if (c0362q != null) {
            c0362q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0361p c0361p = this.f3926o;
        if (c0361p != null) {
            c0361p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f3926o)) {
                b(this.f3926o, true);
            }
        } else {
            C0361p c0361p = this.f3926o;
            if (c0361p != null && m(c0361p)) {
                removeView(this.f3926o);
                this.f3916P.remove(this.f3926o);
            }
        }
        C0361p c0361p2 = this.f3926o;
        if (c0361p2 != null) {
            c0361p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3925n == null) {
                Context context = getContext();
                C0365u c0365u = new C0365u(context, null);
                this.f3925n = c0365u;
                c0365u.setSingleLine();
                this.f3925n.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f3933x;
                if (i4 != 0) {
                    this.f3925n.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f3912L;
                if (colorStateList != null) {
                    this.f3925n.setTextColor(colorStateList);
                }
            }
            if (!m(this.f3925n)) {
                b(this.f3925n, true);
            }
        } else {
            C0365u c0365u2 = this.f3925n;
            if (c0365u2 != null && m(c0365u2)) {
                removeView(this.f3925n);
                this.f3916P.remove(this.f3925n);
            }
        }
        C0365u c0365u3 = this.f3925n;
        if (c0365u3 != null) {
            c0365u3.setText(charSequence);
        }
        this.J = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3912L = colorStateList;
        C0365u c0365u = this.f3925n;
        if (c0365u != null) {
            c0365u.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3924m == null) {
                Context context = getContext();
                C0365u c0365u = new C0365u(context, null);
                this.f3924m = c0365u;
                c0365u.setSingleLine();
                this.f3924m.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.w;
                if (i4 != 0) {
                    this.f3924m.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f3911K;
                if (colorStateList != null) {
                    this.f3924m.setTextColor(colorStateList);
                }
            }
            if (!m(this.f3924m)) {
                b(this.f3924m, true);
            }
        } else {
            C0365u c0365u2 = this.f3924m;
            if (c0365u2 != null && m(c0365u2)) {
                removeView(this.f3924m);
                this.f3916P.remove(this.f3924m);
            }
        }
        C0365u c0365u3 = this.f3924m;
        if (c0365u3 != null) {
            c0365u3.setText(charSequence);
        }
        this.f3910I = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3911K = colorStateList;
        C0365u c0365u = this.f3924m;
        if (c0365u != null) {
            c0365u.setTextColor(colorStateList);
        }
    }
}
