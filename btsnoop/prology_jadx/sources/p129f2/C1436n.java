package p129f2;

/* renamed from: f2.n */
/* loaded from: classes.dex */
public final class C1436n extends java.util.AbstractCollection {

    /* renamed from: l */
    public final /* synthetic */ int f5794l;

    /* renamed from: m */
    public final java.lang.Object f5795m;

    public /* synthetic */ C1436n(int i4, java.io.Serializable serializable) {
        this.f5794l = i4;
        this.f5795m = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f5794l) {
            case 0:
                ((p129f2.C1409Z) this.f5795m).m3202c();
                return;
            case 1:
                ((p129f2.C1449v) this.f5795m).clear();
                return;
            default:
                ((p129f2.C1416d) this.f5795m).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        switch (this.f5794l) {
            case 0:
                return ((p129f2.C1409Z) this.f5795m).mo3171b(obj);
            case 1:
            default:
                return super.contains(obj);
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return ((p129f2.C1416d) this.f5795m).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f5794l) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return ((p129f2.C1416d) this.f5795m).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f5794l) {
            case 0:
                return new p129f2.C1410a((p129f2.C1409Z) this.f5795m);
            case 1:
                p129f2.C1449v c1449v = (p129f2.C1449v) this.f5795m;
                java.util.Map m3248c = c1449v.m3248c();
                return m3248c != null ? m3248c.values().iterator() : new p129f2.C1446s(c1449v, 2);
            default:
                return new p129f2.AbstractC1443q0(((p129f2.C1416d) this.f5795m).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        switch (this.f5794l) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    return super.remove(obj);
                } catch (java.lang.UnsupportedOperationException unused) {
                    p129f2.C1416d c1416d = (p129f2.C1416d) this.f5795m;
                    for (java.util.Map.Entry entry : c1416d.entrySet()) {
                        if (p101a.AbstractC0936a.m1814v(obj, entry.getValue())) {
                            c1416d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        switch (this.f5794l) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (java.lang.UnsupportedOperationException unused) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    p129f2.C1416d c1416d = (p129f2.C1416d) this.f5795m;
                    for (java.util.Map.Entry entry : c1416d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1416d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        switch (this.f5794l) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (java.lang.UnsupportedOperationException unused) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    p129f2.C1416d c1416d = (p129f2.C1416d) this.f5795m;
                    for (java.util.Map.Entry entry : c1416d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1416d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f5794l) {
            case 0:
                return ((p129f2.C1409Z) this.f5795m).f5731p;
            case 1:
                return ((p129f2.C1449v) this.f5795m).size();
            default:
                return ((p129f2.C1416d) this.f5795m).f5749n.size();
        }
    }

    public C1436n(p129f2.C1416d c1416d) {
        this.f5794l = 2;
        this.f5795m = c1416d;
    }
}
