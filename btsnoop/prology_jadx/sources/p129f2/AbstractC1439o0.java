package p129f2;

/* renamed from: f2.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC1439o0 extends java.util.AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        boolean z4 = false;
        if (!(collection instanceof java.util.Set) || collection.size() <= size()) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                z4 |= remove(it.next());
            }
        } else {
            java.util.Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    z4 = true;
                }
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
