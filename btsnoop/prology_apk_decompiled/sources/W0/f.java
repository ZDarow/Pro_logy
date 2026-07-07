package W0;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: A, reason: collision with root package name */
    public static final boolean[] f2764A;

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f2765B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2766C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2767D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f2768E;

    /* renamed from: v, reason: collision with root package name */
    public static final int f2769v = c(2, 2, 2, 0);
    public static final int w;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2770x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2771y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f2772z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2773a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f2774b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2775c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2776d;

    /* renamed from: e, reason: collision with root package name */
    public int f2777e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2778f;

    /* renamed from: g, reason: collision with root package name */
    public int f2779g;

    /* renamed from: h, reason: collision with root package name */
    public int f2780h;

    /* renamed from: i, reason: collision with root package name */
    public int f2781i;

    /* renamed from: j, reason: collision with root package name */
    public int f2782j;

    /* renamed from: k, reason: collision with root package name */
    public int f2783k;

    /* renamed from: l, reason: collision with root package name */
    public int f2784l;

    /* renamed from: m, reason: collision with root package name */
    public int f2785m;

    /* renamed from: n, reason: collision with root package name */
    public int f2786n;

    /* renamed from: o, reason: collision with root package name */
    public int f2787o;

    /* renamed from: p, reason: collision with root package name */
    public int f2788p;

    /* renamed from: q, reason: collision with root package name */
    public int f2789q;

    /* renamed from: r, reason: collision with root package name */
    public int f2790r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f2791t;

    /* renamed from: u, reason: collision with root package name */
    public int f2792u;

    static {
        int c4 = c(0, 0, 0, 0);
        w = c4;
        int c5 = c(0, 0, 0, 3);
        f2770x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f2771y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f2772z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f2764A = new boolean[]{false, false, false, true, true, true, false};
        f2765B = new int[]{c4, c5, c4, c4, c5, c4, c4};
        f2766C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f2767D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f2768E = new int[]{c4, c4, c4, c4, c4, c5, c5};
    }

    public f() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            W.a.g(r4, r0)
            W.a.g(r5, r0)
            W.a.g(r6, r0)
            W.a.g(r7, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: W0.f.c(int, int, int, int):int");
    }

    public final void a(char c4) {
        SpannableStringBuilder spannableStringBuilder = this.f2774b;
        if (c4 != '\n') {
            spannableStringBuilder.append(c4);
            return;
        }
        ArrayList arrayList = this.f2773a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f2787o != -1) {
            this.f2787o = 0;
        }
        if (this.f2788p != -1) {
            this.f2788p = 0;
        }
        if (this.f2789q != -1) {
            this.f2789q = 0;
        }
        if (this.s != -1) {
            this.s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f2782j && arrayList.size() < 15) {
                this.f2792u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f2774b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f2787o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2787o, length, 33);
            }
            if (this.f2788p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2788p, length, 33);
            }
            if (this.f2789q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2790r), this.f2789q, length, 33);
            }
            if (this.s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f2791t), this.s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f2773a.clear();
        this.f2774b.clear();
        this.f2787o = -1;
        this.f2788p = -1;
        this.f2789q = -1;
        this.s = -1;
        this.f2792u = 0;
        this.f2775c = false;
        this.f2776d = false;
        this.f2777e = 4;
        this.f2778f = false;
        this.f2779g = 0;
        this.f2780h = 0;
        this.f2781i = 0;
        this.f2782j = 15;
        this.f2783k = 0;
        this.f2784l = 0;
        this.f2785m = 0;
        int i4 = w;
        this.f2786n = i4;
        this.f2790r = f2769v;
        this.f2791t = i4;
    }

    public final void e(boolean z4, boolean z5) {
        int i4 = this.f2787o;
        SpannableStringBuilder spannableStringBuilder = this.f2774b;
        if (i4 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2787o, spannableStringBuilder.length(), 33);
                this.f2787o = -1;
            }
        } else if (z4) {
            this.f2787o = spannableStringBuilder.length();
        }
        if (this.f2788p == -1) {
            if (z5) {
                this.f2788p = spannableStringBuilder.length();
            }
        } else {
            if (z5) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2788p, spannableStringBuilder.length(), 33);
            this.f2788p = -1;
        }
    }

    public final void f(int i4, int i5) {
        int i6 = this.f2789q;
        SpannableStringBuilder spannableStringBuilder = this.f2774b;
        if (i6 != -1 && this.f2790r != i4) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2790r), this.f2789q, spannableStringBuilder.length(), 33);
        }
        if (i4 != f2769v) {
            this.f2789q = spannableStringBuilder.length();
            this.f2790r = i4;
        }
        if (this.s != -1 && this.f2791t != i5) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f2791t), this.s, spannableStringBuilder.length(), 33);
        }
        if (i5 != w) {
            this.s = spannableStringBuilder.length();
            this.f2791t = i5;
        }
    }
}
