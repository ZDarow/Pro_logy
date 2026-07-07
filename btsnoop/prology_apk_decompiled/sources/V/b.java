package V;

import W.y;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public static final String f2546A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f2547B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f2548C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f2549D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f2550E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f2551F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f2552G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f2553H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f2554I;
    public static final String J;

    /* renamed from: r, reason: collision with root package name */
    public static final String f2555r;
    public static final String s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f2556t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f2557u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f2558v;
    public static final String w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f2559x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f2560y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f2561z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2562a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f2563b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f2564c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f2565d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2566e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2567f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2568g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2569h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2570i;

    /* renamed from: j, reason: collision with root package name */
    public final float f2571j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2572k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2573l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2574m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2575n;

    /* renamed from: o, reason: collision with root package name */
    public final float f2576o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2577p;

    /* renamed from: q, reason: collision with root package name */
    public final float f2578q;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i4 = y.f2709a;
        f2555r = Integer.toString(0, 36);
        s = Integer.toString(17, 36);
        f2556t = Integer.toString(1, 36);
        f2557u = Integer.toString(2, 36);
        f2558v = Integer.toString(3, 36);
        w = Integer.toString(18, 36);
        f2559x = Integer.toString(4, 36);
        f2560y = Integer.toString(5, 36);
        f2561z = Integer.toString(6, 36);
        f2546A = Integer.toString(7, 36);
        f2547B = Integer.toString(8, 36);
        f2548C = Integer.toString(9, 36);
        f2549D = Integer.toString(10, 36);
        f2550E = Integer.toString(11, 36);
        f2551F = Integer.toString(12, 36);
        f2552G = Integer.toString(13, 36);
        f2553H = Integer.toString(14, 36);
        f2554I = Integer.toString(15, 36);
        J = Integer.toString(16, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f4, int i4, int i5, float f5, int i6, int i7, float f6, float f7, float f8, boolean z4, int i8, int i9, float f9) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            W.a.e(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f2562a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f2562a = charSequence.toString();
        } else {
            this.f2562a = null;
        }
        this.f2563b = alignment;
        this.f2564c = alignment2;
        this.f2565d = bitmap;
        this.f2566e = f4;
        this.f2567f = i4;
        this.f2568g = i5;
        this.f2569h = f5;
        this.f2570i = i6;
        this.f2571j = f7;
        this.f2572k = f8;
        this.f2573l = z4;
        this.f2574m = i8;
        this.f2575n = i7;
        this.f2576o = f6;
        this.f2577p = i9;
        this.f2578q = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f2562a, bVar.f2562a) && this.f2563b == bVar.f2563b && this.f2564c == bVar.f2564c) {
            Bitmap bitmap = bVar.f2565d;
            Bitmap bitmap2 = this.f2565d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f2566e == bVar.f2566e && this.f2567f == bVar.f2567f && this.f2568g == bVar.f2568g && this.f2569h == bVar.f2569h && this.f2570i == bVar.f2570i && this.f2571j == bVar.f2571j && this.f2572k == bVar.f2572k && this.f2573l == bVar.f2573l && this.f2574m == bVar.f2574m && this.f2575n == bVar.f2575n && this.f2576o == bVar.f2576o && this.f2577p == bVar.f2577p && this.f2578q == bVar.f2578q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2562a, this.f2563b, this.f2564c, this.f2565d, Float.valueOf(this.f2566e), Integer.valueOf(this.f2567f), Integer.valueOf(this.f2568g), Float.valueOf(this.f2569h), Integer.valueOf(this.f2570i), Float.valueOf(this.f2571j), Float.valueOf(this.f2572k), Boolean.valueOf(this.f2573l), Integer.valueOf(this.f2574m), Integer.valueOf(this.f2575n), Float.valueOf(this.f2576o), Integer.valueOf(this.f2577p), Float.valueOf(this.f2578q)});
    }
}
