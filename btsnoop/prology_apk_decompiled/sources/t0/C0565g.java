package t0;

import T.C0095p;
import T.V;
import T.W;
import W.y;
import a0.AbstractC0125e;
import android.text.TextUtils;
import f2.AbstractC0303z;
import f2.a0;
import f2.b0;
import f2.c0;
import f2.j0;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565g extends o implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final int f8315A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f8316B;

    /* renamed from: C, reason: collision with root package name */
    public final int f8317C;

    /* renamed from: D, reason: collision with root package name */
    public final int f8318D;

    /* renamed from: E, reason: collision with root package name */
    public final int f8319E;

    /* renamed from: F, reason: collision with root package name */
    public final int f8320F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f8321G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f8322H;

    /* renamed from: p, reason: collision with root package name */
    public final int f8323p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f8324q;

    /* renamed from: r, reason: collision with root package name */
    public final String f8325r;
    public final C0569k s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8326t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8327u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8328v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f8329x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f8330y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8331z;

    public C0565g(int i4, V v4, int i5, C0569k c0569k, int i6, boolean z4, C0564f c0564f, int i7) {
        super(i4, v4, i5);
        int i8;
        int i9;
        int i10;
        boolean z5;
        this.s = c0569k;
        int i11 = c0569k.f8346u ? 24 : 16;
        int i12 = 0;
        this.f8329x = false;
        this.f8325r = q.f(this.f8362o.f2316d);
        this.f8326t = AbstractC0125e.o(i6, false);
        int i13 = 0;
        while (true) {
            c0 c0Var = c0569k.f2203i;
            i8 = Integer.MAX_VALUE;
            if (i13 >= c0Var.size()) {
                i9 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                i9 = q.c(this.f8362o, (String) c0Var.get(i13), false);
                if (i9 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f8328v = i13;
        this.f8327u = i9;
        this.w = q.b(this.f8362o.f2318f, 0);
        C0095p c0095p = this.f8362o;
        int i14 = c0095p.f2318f;
        this.f8330y = i14 == 0 || (i14 & 1) != 0;
        this.f8316B = (c0095p.f2317e & 1) != 0;
        int i15 = c0095p.f2303A;
        this.f8317C = i15;
        this.f8318D = c0095p.f2304B;
        int i16 = c0095p.f2321i;
        this.f8319E = i16;
        this.f8324q = (i16 == -1 || i16 <= c0569k.f2205k) && (i15 == -1 || i15 <= c0569k.f2204j) && c0564f.apply(c0095p);
        String[] D4 = y.D();
        int i17 = 0;
        while (true) {
            if (i17 >= D4.length) {
                i10 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                i10 = q.c(this.f8362o, D4[i17], false);
                if (i10 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f8331z = i17;
        this.f8315A = i10;
        int i18 = 0;
        while (true) {
            c0 c0Var2 = c0569k.f2206l;
            if (i18 < c0Var2.size()) {
                String str = this.f8362o.f2325m;
                if (str != null && str.equals(c0Var2.get(i18))) {
                    i8 = i18;
                    break;
                }
                i18++;
            } else {
                break;
            }
        }
        this.f8320F = i8;
        this.f8321G = AbstractC0125e.i(i6) == 128;
        this.f8322H = AbstractC0125e.j(i6) == 64;
        C0569k c0569k2 = this.s;
        if (AbstractC0125e.o(i6, c0569k2.w) && ((z5 = this.f8324q) || c0569k2.f8345t)) {
            W w = c0569k2.f2207m;
            int i19 = w.f2175a;
            C0095p c0095p2 = this.f8362o;
            if (i19 != 2 || q.g(c0569k2, i6, c0095p2)) {
                i12 = (!AbstractC0125e.o(i6, false) || !z5 || c0095p2.f2321i == -1 || (!c0569k2.f8348x && z4) || w.f2175a == 2 || (i11 & i6) == 0) ? 1 : 2;
            }
        }
        this.f8323p = i12;
    }

    @Override // t0.o
    public final int a() {
        return this.f8323p;
    }

    @Override // t0.o
    public final boolean b(o oVar) {
        int i4;
        String str;
        C0565g c0565g = (C0565g) oVar;
        this.s.getClass();
        C0095p c0095p = this.f8362o;
        int i5 = c0095p.f2303A;
        if (i5 != -1) {
            C0095p c0095p2 = c0565g.f8362o;
            if (i5 == c0095p2.f2303A && ((this.f8329x || ((str = c0095p.f2325m) != null && TextUtils.equals(str, c0095p2.f2325m))) && (i4 = c0095p.f2304B) != -1 && i4 == c0095p2.f2304B)) {
                if (this.f8321G == c0565g.f8321G && this.f8322H == c0565g.f8322H) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0565g c0565g) {
        boolean z4 = this.f8326t;
        boolean z5 = this.f8324q;
        b0 a4 = (z5 && z4) ? q.f8376j : q.f8376j.a();
        AbstractC0303z c4 = AbstractC0303z.f5630a.c(z4, c0565g.f8326t);
        Integer valueOf = Integer.valueOf(this.f8328v);
        Integer valueOf2 = Integer.valueOf(c0565g.f8328v);
        a0.f5544l.getClass();
        j0 j0Var = j0.f5586l;
        AbstractC0303z b4 = c4.b(valueOf, valueOf2, j0Var).a(this.f8327u, c0565g.f8327u).a(this.w, c0565g.w).c(this.f8316B, c0565g.f8316B).c(this.f8330y, c0565g.f8330y).b(Integer.valueOf(this.f8331z), Integer.valueOf(c0565g.f8331z), j0Var).a(this.f8315A, c0565g.f8315A).c(z5, c0565g.f8324q).b(Integer.valueOf(this.f8320F), Integer.valueOf(c0565g.f8320F), j0Var);
        this.s.getClass();
        AbstractC0303z b5 = b4.c(this.f8321G, c0565g.f8321G).c(this.f8322H, c0565g.f8322H).b(Integer.valueOf(this.f8317C), Integer.valueOf(c0565g.f8317C), a4).b(Integer.valueOf(this.f8318D), Integer.valueOf(c0565g.f8318D), a4);
        if (y.a(this.f8325r, c0565g.f8325r)) {
            b5 = b5.b(Integer.valueOf(this.f8319E), Integer.valueOf(c0565g.f8319E), a4);
        }
        return b5.e();
    }
}
