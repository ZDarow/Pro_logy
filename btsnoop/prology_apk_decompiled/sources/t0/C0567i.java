package t0;

import T.C0095p;
import a0.AbstractC0125e;
import f2.AbstractC0303z;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567i implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8334l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8335m;

    public C0567i(C0095p c0095p, int i4) {
        this.f8334l = (c0095p.f2317e & 1) != 0;
        this.f8335m = AbstractC0125e.o(i4, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0567i c0567i = (C0567i) obj;
        return AbstractC0303z.f5630a.c(this.f8335m, c0567i.f8335m).c(this.f8334l, c0567i.f8334l).e();
    }
}
