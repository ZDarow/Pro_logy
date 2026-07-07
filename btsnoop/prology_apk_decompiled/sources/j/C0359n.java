package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e.AbstractC0248a;
import java.lang.reflect.Field;

/* renamed from: j.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359n {

    /* renamed from: a, reason: collision with root package name */
    public int f6715a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6716b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6717c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6718d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6719e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6720f;

    public C0359n(View view) {
        C0360o c0360o;
        this.f6715a = -1;
        this.f6716b = view;
        PorterDuff.Mode mode = C0360o.f6723b;
        synchronized (C0360o.class) {
            try {
                if (C0360o.f6724c == null) {
                    C0360o.b();
                }
                c0360o = C0360o.f6724c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6717c = c0360o;
    }

    public void a() {
        View view = (View) this.f6716b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((l0) this.f6718d) != null) {
                if (((l0) this.f6720f) == null) {
                    this.f6720f = new Object();
                }
                l0 l0Var = (l0) this.f6720f;
                l0Var.f6710c = null;
                l0Var.f6709b = false;
                l0Var.f6711d = null;
                l0Var.f6708a = false;
                Field field = C.x.f330a;
                ColorStateList b4 = C.r.b(view);
                if (b4 != null) {
                    l0Var.f6709b = true;
                    l0Var.f6710c = b4;
                }
                PorterDuff.Mode c4 = C.r.c(view);
                if (c4 != null) {
                    l0Var.f6708a = true;
                    l0Var.f6711d = c4;
                }
                if (l0Var.f6709b || l0Var.f6708a) {
                    C0360o.c(background, l0Var, view.getDrawableState());
                    return;
                }
            }
            l0 l0Var2 = (l0) this.f6719e;
            if (l0Var2 != null) {
                C0360o.c(background, l0Var2, view.getDrawableState());
                return;
            }
            l0 l0Var3 = (l0) this.f6718d;
            if (l0Var3 != null) {
                C0360o.c(background, l0Var3, view.getDrawableState());
            }
        }
    }

    public void b(AttributeSet attributeSet, int i4) {
        ColorStateList f4;
        View view = (View) this.f6716b;
        Context context = view.getContext();
        int[] iArr = AbstractC0248a.f5017u;
        android.support.v4.media.session.t q02 = android.support.v4.media.session.t.q0(context, attributeSet, iArr, i4);
        TypedArray typedArray = (TypedArray) q02.f3735n;
        View view2 = (View) this.f6716b;
        C.x.c(view2, view2.getContext(), iArr, attributeSet, (TypedArray) q02.f3735n, i4);
        try {
            if (typedArray.hasValue(0)) {
                this.f6715a = typedArray.getResourceId(0, -1);
                C0360o c0360o = (C0360o) this.f6717c;
                Context context2 = view.getContext();
                int i5 = this.f6715a;
                synchronized (c0360o) {
                    f4 = c0360o.f6725a.f(context2, i5);
                }
                if (f4 != null) {
                    d(f4);
                }
            }
            if (typedArray.hasValue(1)) {
                C.r.d(view, q02.e0(1));
            }
            if (typedArray.hasValue(2)) {
                C.r.e(view, B.c(typedArray.getInt(2, -1), null));
            }
        } finally {
            q02.u0();
        }
    }

    public void c(int i4) {
        ColorStateList colorStateList;
        this.f6715a = i4;
        C0360o c0360o = (C0360o) this.f6717c;
        if (c0360o != null) {
            Context context = ((View) this.f6716b).getContext();
            synchronized (c0360o) {
                colorStateList = c0360o.f6725a.f(context, i4);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((l0) this.f6718d) == null) {
                this.f6718d = new Object();
            }
            l0 l0Var = (l0) this.f6718d;
            l0Var.f6710c = colorStateList;
            l0Var.f6709b = true;
        } else {
            this.f6718d = null;
        }
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (((l0) this.f6719e) == null) {
            this.f6719e = new Object();
        }
        l0 l0Var = (l0) this.f6719e;
        l0Var.f6710c = colorStateList;
        l0Var.f6709b = true;
        a();
    }

    public void f(PorterDuff.Mode mode) {
        if (((l0) this.f6719e) == null) {
            this.f6719e = new Object();
        }
        l0 l0Var = (l0) this.f6719e;
        l0Var.f6711d = mode;
        l0Var.f6708a = true;
        a();
    }

    public C0359n(int[] iArr, q0.k0[] k0VarArr, int[] iArr2, int[][][] iArr3, q0.k0 k0Var) {
        this.f6716b = iArr;
        this.f6717c = k0VarArr;
        this.f6719e = iArr3;
        this.f6718d = iArr2;
        this.f6720f = k0Var;
        this.f6715a = iArr.length;
    }
}
