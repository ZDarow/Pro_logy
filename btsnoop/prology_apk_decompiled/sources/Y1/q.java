package Y1;

import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: n, reason: collision with root package name */
    public final transient int f3118n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f3119o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f3120p;

    public q(r rVar, int i4, int i5) {
        this.f3120p = rVar;
        this.f3118n = i4;
        this.f3119o = i5;
    }

    @Override // Y1.o
    public final Object[] a() {
        return this.f3120p.a();
    }

    @Override // Y1.o
    public final int b() {
        return this.f3120p.b() + this.f3118n;
    }

    @Override // Y1.o
    public final int c() {
        return this.f3120p.b() + this.f3118n + this.f3119o;
    }

    @Override // Y1.o
    public final boolean d() {
        return true;
    }

    @Override // Y1.r, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final r subList(int i4, int i5) {
        AbstractC0462a.b0(i4, i5, this.f3119o);
        int i6 = this.f3118n;
        return this.f3120p.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC0462a.Z(i4, this.f3119o);
        return this.f3120p.get(i4 + this.f3118n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3119o;
    }
}
