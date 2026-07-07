package p129f2;

/* renamed from: f2.H */
/* loaded from: classes.dex */
public final class C1392H extends p129f2.AbstractC1393I {

    /* renamed from: n */
    public final transient int f5701n;

    /* renamed from: o */
    public final transient int f5702o;

    /* renamed from: p */
    public final /* synthetic */ p129f2.AbstractC1393I f5703p;

    public C1392H(p129f2.AbstractC1393I abstractC1393I, int i4, int i5) {
        this.f5703p = abstractC1393I;
        this.f5701n = i4;
        this.f5702o = i5;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: c */
    public final java.lang.Object[] mo3152c() {
        return this.f5703p.mo3152c();
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: d */
    public final int mo3153d() {
        return this.f5703p.mo3154e() + this.f5701n + this.f5702o;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: e */
    public final int mo3154e() {
        return this.f5703p.mo3154e() + this.f5701n;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: f */
    public final boolean mo3155f() {
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i4) {
        p176p1.AbstractC1949a.m3935l(i4, this.f5702o);
        return this.f5703p.get(i4 + this.f5701n);
    }

    @Override // p129f2.AbstractC1393I, p129f2.AbstractC1388D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // p129f2.AbstractC1393I, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p129f2.AbstractC1393I, java.util.List
    /* renamed from: s */
    public final p129f2.AbstractC1393I subList(int i4, int i5) {
        p176p1.AbstractC1949a.m3937n(i4, i5, this.f5702o);
        int i6 = this.f5701n;
        return this.f5703p.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5702o;
    }

    @Override // p129f2.AbstractC1393I, java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i4) {
        return listIterator(i4);
    }
}
