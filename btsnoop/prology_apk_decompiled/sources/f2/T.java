package f2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class T extends AbstractSequentialList implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final AbstractCollection f5530l;

    /* renamed from: m, reason: collision with root package name */
    public final e2.e f5531m;

    /* JADX WARN: Multi-variable type inference failed */
    public T(List list, e2.e eVar) {
        list.getClass();
        this.f5530l = (AbstractCollection) list;
        this.f5531m = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new Q(this, this.f5530l.listIterator(i4), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        this.f5530l.subList(i4, i5).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5530l.size();
    }
}
