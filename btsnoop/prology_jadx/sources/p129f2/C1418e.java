package p129f2;

/* renamed from: f2.e */
/* loaded from: classes.dex */
public class C1418e extends p129f2.AbstractC1439o0 {

    /* renamed from: l */
    public final java.util.Map f5752l;

    /* renamed from: m */
    public final /* synthetic */ p129f2.C1409Z f5753m;

    public C1418e(p129f2.C1409Z c1409z, java.util.Map map) {
        this.f5753m = c1409z;
        map.getClass();
        this.f5752l = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        java.util.Iterator it = iterator();
        while (true) {
            p129f2.C1414c c1414c = (p129f2.C1414c) it;
            if (!c1414c.hasNext()) {
                return;
            }
            c1414c.next();
            c1414c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f5752l.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.f5752l.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.f5752l.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5752l.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5752l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new p129f2.C1414c(this, this.f5752l.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int i4;
        java.util.Collection collection = (java.util.Collection) this.f5752l.remove(obj);
        if (collection != null) {
            i4 = collection.size();
            collection.clear();
            this.f5753m.f5731p -= i4;
        } else {
            i4 = 0;
        }
        return i4 > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5752l.size();
    }
}
