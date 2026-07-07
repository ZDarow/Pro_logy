package f2;

import java.util.Iterator;
import java.util.ListIterator;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class H extends I {

    /* renamed from: n, reason: collision with root package name */
    public final transient int f5507n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f5508o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I f5509p;

    public H(I i4, int i5, int i6) {
        this.f5509p = i4;
        this.f5507n = i5;
        this.f5508o = i6;
    }

    @Override // f2.AbstractC0276D
    public final Object[] c() {
        return this.f5509p.c();
    }

    @Override // f2.AbstractC0276D
    public final int d() {
        return this.f5509p.e() + this.f5507n + this.f5508o;
    }

    @Override // f2.AbstractC0276D
    public final int e() {
        return this.f5509p.e() + this.f5507n;
    }

    @Override // f2.AbstractC0276D
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC0462a.l(i4, this.f5508o);
        return this.f5509p.get(i4 + this.f5507n);
    }

    @Override // f2.I, f2.AbstractC0276D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // f2.I, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // f2.I, java.util.List
    /* renamed from: s */
    public final I subList(int i4, int i5) {
        AbstractC0462a.n(i4, i5, this.f5508o);
        int i6 = this.f5507n;
        return this.f5509p.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5508o;
    }

    @Override // f2.I, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i4) {
        return listIterator(i4);
    }
}
