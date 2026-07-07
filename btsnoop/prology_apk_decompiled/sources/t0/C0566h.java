package t0;

import T.V;
import a0.AbstractC0125e;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566h extends o implements Comparable {

    /* renamed from: p, reason: collision with root package name */
    public final int f8332p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8333q;

    public C0566h(int i4, V v4, int i5, C0569k c0569k, int i6) {
        super(i4, v4, i5);
        this.f8332p = AbstractC0125e.o(i6, c0569k.w) ? 1 : 0;
        this.f8333q = this.f8362o.b();
    }

    @Override // t0.o
    public final int a() {
        return this.f8332p;
    }

    @Override // t0.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f8333q, ((C0566h) obj).f8333q);
    }
}
