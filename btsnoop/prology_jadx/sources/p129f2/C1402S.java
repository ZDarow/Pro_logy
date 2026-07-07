package p129f2;

/* renamed from: f2.S */
/* loaded from: classes.dex */
public final class C1402S extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {

    /* renamed from: l */
    public final java.util.AbstractCollection f5722l;

    /* renamed from: m */
    public final p124e2.InterfaceC1357e f5723m;

    /* JADX WARN: Multi-variable type inference failed */
    public C1402S(java.util.List list, p124e2.InterfaceC1357e interfaceC1357e) {
        list.getClass();
        this.f5722l = (java.util.AbstractCollection) list;
        this.f5723m = interfaceC1357e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i4) {
        return this.f5723m.apply(this.f5722l.get(i4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5722l.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i4) {
        return new p129f2.C1401Q(this, this.f5722l.listIterator(i4), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i4) {
        return this.f5723m.apply(this.f5722l.remove(i4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        this.f5722l.subList(i4, i5).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5722l.size();
    }
}
