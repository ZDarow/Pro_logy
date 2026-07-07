package p087W0;

/* renamed from: W0.f */
/* loaded from: classes.dex */
public final class C0811f {

    /* renamed from: A */
    public static final boolean[] f2858A;

    /* renamed from: B */
    public static final int[] f2859B;

    /* renamed from: C */
    public static final int[] f2860C;

    /* renamed from: D */
    public static final int[] f2861D;

    /* renamed from: E */
    public static final int[] f2862E;

    /* renamed from: v */
    public static final int f2863v = m1645c(2, 2, 2, 0);

    /* renamed from: w */
    public static final int f2864w;

    /* renamed from: x */
    public static final int[] f2865x;

    /* renamed from: y */
    public static final int[] f2866y;

    /* renamed from: z */
    public static final int[] f2867z;

    /* renamed from: a */
    public final java.util.ArrayList f2868a = new java.util.ArrayList();

    /* renamed from: b */
    public final android.text.SpannableStringBuilder f2869b = new android.text.SpannableStringBuilder();

    /* renamed from: c */
    public boolean f2870c;

    /* renamed from: d */
    public boolean f2871d;

    /* renamed from: e */
    public int f2872e;

    /* renamed from: f */
    public boolean f2873f;

    /* renamed from: g */
    public int f2874g;

    /* renamed from: h */
    public int f2875h;

    /* renamed from: i */
    public int f2876i;

    /* renamed from: j */
    public int f2877j;

    /* renamed from: k */
    public int f2878k;

    /* renamed from: l */
    public int f2879l;

    /* renamed from: m */
    public int f2880m;

    /* renamed from: n */
    public int f2881n;

    /* renamed from: o */
    public int f2882o;

    /* renamed from: p */
    public int f2883p;

    /* renamed from: q */
    public int f2884q;

    /* renamed from: r */
    public int f2885r;

    /* renamed from: s */
    public int f2886s;

    /* renamed from: t */
    public int f2887t;

    /* renamed from: u */
    public int f2888u;

    static {
        int m1645c = m1645c(0, 0, 0, 0);
        f2864w = m1645c;
        int m1645c2 = m1645c(0, 0, 0, 3);
        f2865x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f2866y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f2867z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f2858A = new boolean[]{false, false, false, true, true, true, false};
        f2859B = new int[]{m1645c, m1645c2, m1645c, m1645c, m1645c2, m1645c, m1645c};
        f2860C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f2861D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f2862E = new int[]{m1645c, m1645c, m1645c, m1645c, m1645c, m1645c2, m1645c2};
    }

    public C0811f() {
        m1648d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m1645c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            p086W.AbstractC0781a.m1418g(r4, r0)
            p086W.AbstractC0781a.m1418g(r5, r0)
            p086W.AbstractC0781a.m1418g(r6, r0)
            p086W.AbstractC0781a.m1418g(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p087W0.C0811f.m1645c(int, int, int, int):int");
    }

    /* renamed from: a */
    public final void m1646a(char c4) {
        android.text.SpannableStringBuilder spannableStringBuilder = this.f2869b;
        if (c4 != '\n') {
            spannableStringBuilder.append(c4);
            return;
        }
        java.util.ArrayList arrayList = this.f2868a;
        arrayList.add(m1647b());
        spannableStringBuilder.clear();
        if (this.f2882o != -1) {
            this.f2882o = 0;
        }
        if (this.f2883p != -1) {
            this.f2883p = 0;
        }
        if (this.f2884q != -1) {
            this.f2884q = 0;
        }
        if (this.f2886s != -1) {
            this.f2886s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f2877j && arrayList.size() < 15) {
                this.f2888u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    /* renamed from: b */
    public final android.text.SpannableString m1647b() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f2869b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f2882o != -1) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), this.f2882o, length, 33);
            }
            if (this.f2883p != -1) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), this.f2883p, length, 33);
            }
            if (this.f2884q != -1) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.f2885r), this.f2884q, length, 33);
            }
            if (this.f2886s != -1) {
                spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.f2887t), this.f2886s, length, 33);
            }
        }
        return new android.text.SpannableString(spannableStringBuilder);
    }

    /* renamed from: d */
    public final void m1648d() {
        this.f2868a.clear();
        this.f2869b.clear();
        this.f2882o = -1;
        this.f2883p = -1;
        this.f2884q = -1;
        this.f2886s = -1;
        this.f2888u = 0;
        this.f2870c = false;
        this.f2871d = false;
        this.f2872e = 4;
        this.f2873f = false;
        this.f2874g = 0;
        this.f2875h = 0;
        this.f2876i = 0;
        this.f2877j = 15;
        this.f2878k = 0;
        this.f2879l = 0;
        this.f2880m = 0;
        int i4 = f2864w;
        this.f2881n = i4;
        this.f2885r = f2863v;
        this.f2887t = i4;
    }

    /* renamed from: e */
    public final void m1649e(boolean z4, boolean z5) {
        int i4 = this.f2882o;
        android.text.SpannableStringBuilder spannableStringBuilder = this.f2869b;
        if (i4 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), this.f2882o, spannableStringBuilder.length(), 33);
                this.f2882o = -1;
            }
        } else if (z4) {
            this.f2882o = spannableStringBuilder.length();
        }
        if (this.f2883p == -1) {
            if (z5) {
                this.f2883p = spannableStringBuilder.length();
            }
        } else {
            if (z5) {
                return;
            }
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), this.f2883p, spannableStringBuilder.length(), 33);
            this.f2883p = -1;
        }
    }

    /* renamed from: f */
    public final void m1650f(int i4, int i5) {
        int i6 = this.f2884q;
        android.text.SpannableStringBuilder spannableStringBuilder = this.f2869b;
        if (i6 != -1 && this.f2885r != i4) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.f2885r), this.f2884q, spannableStringBuilder.length(), 33);
        }
        if (i4 != f2863v) {
            this.f2884q = spannableStringBuilder.length();
            this.f2885r = i4;
        }
        if (this.f2886s != -1 && this.f2887t != i5) {
            spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.f2887t), this.f2886s, spannableStringBuilder.length(), 33);
        }
        if (i5 != f2864w) {
            this.f2886s = spannableStringBuilder.length();
            this.f2887t = i5;
        }
    }
}
