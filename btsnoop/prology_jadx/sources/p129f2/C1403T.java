package p129f2;

/* renamed from: f2.T */
/* loaded from: classes.dex */
public final class C1403T extends java.util.AbstractSequentialList implements java.io.Serializable {

    /* renamed from: l */
    public final java.util.AbstractCollection f5724l;

    /* renamed from: m */
    public final p124e2.InterfaceC1357e f5725m;

    /* JADX WARN: Multi-variable type inference failed */
    public C1403T(java.util.List list, p124e2.InterfaceC1357e interfaceC1357e) {
        list.getClass();
        this.f5724l = (java.util.AbstractCollection) list;
        this.f5725m = interfaceC1357e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i4) {
        return new p129f2.C1401Q(this, this.f5724l.listIterator(i4), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        this.f5724l.subList(i4, i5).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5724l.size();
    }
}
