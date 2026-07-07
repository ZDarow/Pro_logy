package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* renamed from: j.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f6723b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0360o f6724c;

    /* renamed from: a, reason: collision with root package name */
    public S f6725a;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, j.o] */
    public static synchronized void b() {
        synchronized (C0360o.class) {
            if (f6724c == null) {
                ?? obj = new Object();
                f6724c = obj;
                obj.f6725a = S.b();
                S s = f6724c.f6725a;
                C2.d dVar = new C2.d();
                synchronized (s) {
                    s.f6623e = dVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, l0 l0Var, int[] iArr) {
        PorterDuff.Mode mode = S.f6616f;
        if (B.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z4 = l0Var.f6709b;
        if (!z4 && !l0Var.f6708a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z4 ? (ColorStateList) l0Var.f6710c : null;
        PorterDuff.Mode mode2 = l0Var.f6708a ? (PorterDuff.Mode) l0Var.f6711d : S.f6616f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = S.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i4) {
        return this.f6725a.c(context, i4);
    }
}
