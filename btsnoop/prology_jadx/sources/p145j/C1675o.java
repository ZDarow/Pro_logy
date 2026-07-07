package p145j;

/* renamed from: j.o */
/* loaded from: classes.dex */
public final class C1675o {

    /* renamed from: b */
    public static final android.graphics.PorterDuff.Mode f6981b = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static p145j.C1675o f6982c;

    /* renamed from: a */
    public p145j.C1639S f6983a;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, j.o] */
    /* renamed from: b */
    public static synchronized void m3618b() {
        synchronized (p145j.C1675o.class) {
            if (f6982c == null) {
                ?? obj = new java.lang.Object();
                f6982c = obj;
                obj.f6983a = p145j.C1639S.m3591b();
                p145j.C1639S c1639s = f6982c.f6983a;
                p013C2.C0139d c0139d = new p013C2.C0139d();
                synchronized (c1639s) {
                    c1639s.f6877e = c0139d;
                }
            }
        }
    }

    /* renamed from: c */
    public static void m3619c(android.graphics.drawable.Drawable drawable, p145j.C1670l0 c1670l0, int[] iArr) {
        android.graphics.PorterDuff.Mode mode = p145j.C1639S.f6870f;
        if (p145j.AbstractC1623B.m3576a(drawable) && drawable.mutate() != drawable) {
            android.util.Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z4 = c1670l0.f6967b;
        if (!z4 && !c1670l0.f6966a) {
            drawable.clearColorFilter();
            return;
        }
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = null;
        android.content.res.ColorStateList colorStateList = z4 ? (android.content.res.ColorStateList) c1670l0.f6968c : null;
        android.graphics.PorterDuff.Mode mode2 = c1670l0.f6966a ? (android.graphics.PorterDuff.Mode) c1670l0.f6969d : p145j.C1639S.f6870f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = p145j.C1639S.m3592e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    /* renamed from: a */
    public final synchronized android.graphics.drawable.Drawable m3620a(android.content.Context context, int i4) {
        return this.f6983a.m3594c(context, i4);
    }
}
