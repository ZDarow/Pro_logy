package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.prology.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n.AbstractC0445h;
import n.C0444g;
import n.C0446i;
import o.AbstractC0454a;
import o1.AbstractC0458a;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: g, reason: collision with root package name */
    public static S f6617g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f6619a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f6620b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f6621c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6622d;

    /* renamed from: e, reason: collision with root package name */
    public C2.d f6623e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f6616f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final Q f6618h = new C0446i(6);

    public static synchronized S b() {
        S s;
        synchronized (S.class) {
            try {
                if (f6617g == null) {
                    f6617g = new S();
                }
                s = f6617g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (S.class) {
            Q q4 = f6618h;
            q4.getClass();
            int i5 = (31 + i4) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) q4.a(Integer.valueOf(mode.hashCode() + i5));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i4, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i4) {
        Drawable drawable;
        Object obj;
        if (this.f6621c == null) {
            this.f6621c = new TypedValue();
        }
        TypedValue typedValue = this.f6621c;
        context.getResources().getValue(i4, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C0444g c0444g = (C0444g) this.f6620b.get(context);
            drawable = null;
            if (c0444g != null) {
                int b4 = AbstractC0454a.b(c0444g.f7354m, c0444g.f7356o, j4);
                if (b4 < 0 || (obj = c0444g.f7355n[b4]) == AbstractC0445h.f7357a) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b5 = AbstractC0454a.b(c0444g.f7354m, c0444g.f7356o, j4);
                        if (b5 >= 0) {
                            Object[] objArr = c0444g.f7355n;
                            Object obj2 = objArr[b5];
                            Object obj3 = AbstractC0445h.f7357a;
                            if (obj2 != obj3) {
                                objArr[b5] = obj3;
                                c0444g.f7353l = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f6623e != null) {
            if (i4 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i4 == R.drawable.abc_ratingbar_material) {
                layerDrawable = C2.d.f(this, context, R.dimen.abc_star_big);
            } else if (i4 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C2.d.f(this, context, R.dimen.abc_star_medium);
            } else if (i4 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C2.d.f(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        C0444g c0444g2 = (C0444g) this.f6620b.get(context);
                        if (c0444g2 == null) {
                            c0444g2 = new C0444g();
                            this.f6620b.put(context, c0444g2);
                        }
                        c0444g2.a(j4, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i4) {
        return d(context, i4);
    }

    public final synchronized Drawable d(Context context, int i4) {
        Drawable a4;
        try {
            if (!this.f6622d) {
                this.f6622d = true;
                Drawable c4 = c(context, R.drawable.abc_vector_test);
                if (c4 == null || (!(c4 instanceof AbstractC0458a) && !"android.graphics.drawable.VectorDrawable".equals(c4.getClass().getName()))) {
                    this.f6622d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a4 = a(context, i4);
            if (a4 == null) {
                a4 = context.getDrawable(i4);
            }
            if (a4 != null) {
                a4 = g(context, i4, a4);
            }
            if (a4 != null) {
                Rect rect = B.f6553a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a4;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, n.k] */
    public final synchronized ColorStateList f(Context context, int i4) {
        ColorStateList colorStateList;
        int i5;
        n.k kVar;
        Object obj;
        WeakHashMap weakHashMap = this.f6619a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (kVar = (n.k) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a4 = AbstractC0454a.a(kVar.f7370n, i4, kVar.f7368l);
            if (a4 < 0 || (obj = kVar.f7369m[a4]) == AbstractC0445h.f7358b) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            C2.d dVar = this.f6623e;
            if (dVar != null) {
                colorStateList2 = dVar.g(context, i4);
            }
            if (colorStateList2 != null) {
                if (this.f6619a == null) {
                    this.f6619a = new WeakHashMap();
                }
                n.k kVar2 = (n.k) this.f6619a.get(context);
                n.k kVar3 = kVar2;
                if (kVar2 == null) {
                    ?? obj2 = new Object();
                    int i6 = 4;
                    while (true) {
                        i5 = 40;
                        if (i6 >= 32) {
                            break;
                        }
                        int i7 = (1 << i6) - 12;
                        if (40 <= i7) {
                            i5 = i7;
                            break;
                        }
                        i6++;
                    }
                    int i8 = i5 / 4;
                    obj2.f7368l = new int[i8];
                    obj2.f7369m = new Object[i8];
                    this.f6619a.put(context, obj2);
                    kVar3 = obj2;
                }
                kVar3.a(i4, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.S.g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
