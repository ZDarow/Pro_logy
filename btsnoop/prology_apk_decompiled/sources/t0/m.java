package t0;

import T.V;
import a0.AbstractC0125e;
import f2.AbstractC0303z;
import f2.I;
import f2.a0;
import f2.c0;
import f2.j0;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class m extends o implements Comparable {

    /* renamed from: p, reason: collision with root package name */
    public final int f8352p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f8353q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8354r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8355t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8356u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8357v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f8358x;

    public m(int i4, V v4, int i5, C0569k c0569k, int i6, String str) {
        super(i4, v4, i5);
        int i7;
        int i8 = 0;
        this.f8353q = AbstractC0125e.o(i6, false);
        int i9 = this.f8362o.f2317e;
        c0569k.getClass();
        this.f8354r = (i9 & 1) != 0;
        this.s = (i9 & 2) != 0;
        c0 c0Var = c0569k.f2208n;
        c0 o2 = c0Var.isEmpty() ? I.o("") : c0Var;
        int i10 = 0;
        while (true) {
            if (i10 >= o2.size()) {
                i10 = Integer.MAX_VALUE;
                i7 = 0;
                break;
            } else {
                i7 = q.c(this.f8362o, (String) o2.get(i10), false);
                if (i7 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f8355t = i10;
        this.f8356u = i7;
        int b4 = q.b(this.f8362o.f2318f, c0569k.f2209o);
        this.f8357v = b4;
        this.f8358x = (this.f8362o.f2318f & 1088) != 0;
        int c4 = q.c(this.f8362o, str, q.f(str) == null);
        this.w = c4;
        boolean z4 = i7 > 0 || (c0Var.isEmpty() && b4 > 0) || this.f8354r || (this.s && c4 > 0);
        if (AbstractC0125e.o(i6, c0569k.w) && z4) {
            i8 = 1;
        }
        this.f8352p = i8;
    }

    @Override // t0.o
    public final int a() {
        return this.f8352p;
    }

    @Override // t0.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        AbstractC0303z c4 = AbstractC0303z.f5630a.c(this.f8353q, mVar.f8353q);
        Integer valueOf = Integer.valueOf(this.f8355t);
        Integer valueOf2 = Integer.valueOf(mVar.f8355t);
        Comparator comparator = a0.f5544l;
        comparator.getClass();
        j0 j0Var = j0.f5586l;
        AbstractC0303z b4 = c4.b(valueOf, valueOf2, j0Var);
        int i4 = this.f8356u;
        AbstractC0303z a4 = b4.a(i4, mVar.f8356u);
        int i5 = this.f8357v;
        AbstractC0303z c5 = a4.a(i5, mVar.f8357v).c(this.f8354r, mVar.f8354r);
        Boolean valueOf3 = Boolean.valueOf(this.s);
        Boolean valueOf4 = Boolean.valueOf(mVar.s);
        if (i4 != 0) {
            comparator = j0Var;
        }
        AbstractC0303z a5 = c5.b(valueOf3, valueOf4, comparator).a(this.w, mVar.w);
        if (i5 == 0) {
            a5 = a5.d(this.f8358x, mVar.f8358x);
        }
        return a5.e();
    }
}
