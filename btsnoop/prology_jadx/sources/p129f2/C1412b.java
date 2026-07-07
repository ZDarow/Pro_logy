package p129f2;

/* renamed from: f2.b */
/* loaded from: classes.dex */
public final class C1412b extends p129f2.AbstractC1439o0 {

    /* renamed from: l */
    public final /* synthetic */ p129f2.C1416d f5739l;

    public C1412b(p129f2.C1416d c1416d) {
        this.f5739l = c1416d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5739l.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.util.Set entrySet = this.f5739l.f5749n.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5739l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new p129f2.C1414c(this.f5739l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.lang.Object obj2;
        if (!contains(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Objects.requireNonNull(entry);
        p129f2.C1409Z c1409z = this.f5739l.f5750o;
        java.lang.Object key = entry.getKey();
        java.util.Map map = c1409z.f5730o;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            obj2 = null;
        }
        java.util.Collection collection = (java.util.Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        c1409z.f5731p -= size;
        return true;
    }

    @Override // p129f2.AbstractC1439o0, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.Iterator it = collection.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                z4 |= remove(it.next());
            }
            return z4;
        }
    }

    @Override // p129f2.AbstractC1439o0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSet = new java.util.HashSet(p129f2.AbstractC1444r.m3223b(collection.size()));
            for (java.lang.Object obj : collection) {
                if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                    hashSet.add(((java.util.Map.Entry) obj).getKey());
                }
            }
            return this.f5739l.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5739l.f5749n.size();
    }
}
