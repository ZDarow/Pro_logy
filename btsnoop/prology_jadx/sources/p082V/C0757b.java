package p082V;

/* renamed from: V.b */
/* loaded from: classes.dex */
public final class C0757b {

    /* renamed from: A */
    public static final java.lang.String f2634A;

    /* renamed from: B */
    public static final java.lang.String f2635B;

    /* renamed from: C */
    public static final java.lang.String f2636C;

    /* renamed from: D */
    public static final java.lang.String f2637D;

    /* renamed from: E */
    public static final java.lang.String f2638E;

    /* renamed from: F */
    public static final java.lang.String f2639F;

    /* renamed from: G */
    public static final java.lang.String f2640G;

    /* renamed from: H */
    public static final java.lang.String f2641H;

    /* renamed from: I */
    public static final java.lang.String f2642I;

    /* renamed from: J */
    public static final java.lang.String f2643J;

    /* renamed from: r */
    public static final java.lang.String f2644r;

    /* renamed from: s */
    public static final java.lang.String f2645s;

    /* renamed from: t */
    public static final java.lang.String f2646t;

    /* renamed from: u */
    public static final java.lang.String f2647u;

    /* renamed from: v */
    public static final java.lang.String f2648v;

    /* renamed from: w */
    public static final java.lang.String f2649w;

    /* renamed from: x */
    public static final java.lang.String f2650x;

    /* renamed from: y */
    public static final java.lang.String f2651y;

    /* renamed from: z */
    public static final java.lang.String f2652z;

    /* renamed from: a */
    public final java.lang.CharSequence f2653a;

    /* renamed from: b */
    public final android.text.Layout.Alignment f2654b;

    /* renamed from: c */
    public final android.text.Layout.Alignment f2655c;

    /* renamed from: d */
    public final android.graphics.Bitmap f2656d;

    /* renamed from: e */
    public final float f2657e;

    /* renamed from: f */
    public final int f2658f;

    /* renamed from: g */
    public final int f2659g;

    /* renamed from: h */
    public final float f2660h;

    /* renamed from: i */
    public final int f2661i;

    /* renamed from: j */
    public final float f2662j;

    /* renamed from: k */
    public final float f2663k;

    /* renamed from: l */
    public final boolean f2664l;

    /* renamed from: m */
    public final int f2665m;

    /* renamed from: n */
    public final int f2666n;

    /* renamed from: o */
    public final float f2667o;

    /* renamed from: p */
    public final int f2668p;

    /* renamed from: q */
    public final float f2669q;

    static {
        new p082V.C0757b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i4 = p086W.AbstractC0805y.f2801a;
        f2644r = java.lang.Integer.toString(0, 36);
        f2645s = java.lang.Integer.toString(17, 36);
        f2646t = java.lang.Integer.toString(1, 36);
        f2647u = java.lang.Integer.toString(2, 36);
        f2648v = java.lang.Integer.toString(3, 36);
        f2649w = java.lang.Integer.toString(18, 36);
        f2650x = java.lang.Integer.toString(4, 36);
        f2651y = java.lang.Integer.toString(5, 36);
        f2652z = java.lang.Integer.toString(6, 36);
        f2634A = java.lang.Integer.toString(7, 36);
        f2635B = java.lang.Integer.toString(8, 36);
        f2636C = java.lang.Integer.toString(9, 36);
        f2637D = java.lang.Integer.toString(10, 36);
        f2638E = java.lang.Integer.toString(11, 36);
        f2639F = java.lang.Integer.toString(12, 36);
        f2640G = java.lang.Integer.toString(13, 36);
        f2641H = java.lang.Integer.toString(14, 36);
        f2642I = java.lang.Integer.toString(15, 36);
        f2643J = java.lang.Integer.toString(16, 36);
    }

    public C0757b(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.text.Layout.Alignment alignment2, android.graphics.Bitmap bitmap, float f4, int i4, int i5, float f5, int i6, int i7, float f6, float f7, float f8, boolean z4, int i8, int i9, float f9) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            p086W.AbstractC0781a.m1416e(bitmap == null);
        }
        if (charSequence instanceof android.text.Spanned) {
            this.f2653a = android.text.SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f2653a = charSequence.toString();
        } else {
            this.f2653a = null;
        }
        this.f2654b = alignment;
        this.f2655c = alignment2;
        this.f2656d = bitmap;
        this.f2657e = f4;
        this.f2658f = i4;
        this.f2659g = i5;
        this.f2660h = f5;
        this.f2661i = i6;
        this.f2662j = f7;
        this.f2663k = f8;
        this.f2664l = z4;
        this.f2665m = i8;
        this.f2666n = i7;
        this.f2667o = f6;
        this.f2668p = i9;
        this.f2669q = f9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p082V.C0757b.class != obj.getClass()) {
            return false;
        }
        p082V.C0757b c0757b = (p082V.C0757b) obj;
        if (android.text.TextUtils.equals(this.f2653a, c0757b.f2653a) && this.f2654b == c0757b.f2654b && this.f2655c == c0757b.f2655c) {
            android.graphics.Bitmap bitmap = c0757b.f2656d;
            android.graphics.Bitmap bitmap2 = this.f2656d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f2657e == c0757b.f2657e && this.f2658f == c0757b.f2658f && this.f2659g == c0757b.f2659g && this.f2660h == c0757b.f2660h && this.f2661i == c0757b.f2661i && this.f2662j == c0757b.f2662j && this.f2663k == c0757b.f2663k && this.f2664l == c0757b.f2664l && this.f2665m == c0757b.f2665m && this.f2666n == c0757b.f2666n && this.f2667o == c0757b.f2667o && this.f2668p == c0757b.f2668p && this.f2669q == c0757b.f2669q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f2653a, this.f2654b, this.f2655c, this.f2656d, java.lang.Float.valueOf(this.f2657e), java.lang.Integer.valueOf(this.f2658f), java.lang.Integer.valueOf(this.f2659g), java.lang.Float.valueOf(this.f2660h), java.lang.Integer.valueOf(this.f2661i), java.lang.Float.valueOf(this.f2662j), java.lang.Float.valueOf(this.f2663k), java.lang.Boolean.valueOf(this.f2664l), java.lang.Integer.valueOf(this.f2665m), java.lang.Integer.valueOf(this.f2666n), java.lang.Float.valueOf(this.f2667o), java.lang.Integer.valueOf(this.f2668p), java.lang.Float.valueOf(this.f2669q)});
    }
}
