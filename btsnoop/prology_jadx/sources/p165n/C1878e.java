package p165n;

/* renamed from: n.e */
/* loaded from: classes.dex */
public final class C1878e extends p165n.C1883j implements java.util.Map {

    /* renamed from: o */
    public androidx.datastore.preferences.protobuf.C1094a0 f7626o;

    /* renamed from: p */
    public p165n.C1875b f7627p;

    /* renamed from: q */
    public p165n.C1877d f7628q;

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        androidx.datastore.preferences.protobuf.C1094a0 c1094a0 = this.f7626o;
        if (c1094a0 != null) {
            return c1094a0;
        }
        androidx.datastore.preferences.protobuf.C1094a0 c1094a02 = new androidx.datastore.preferences.protobuf.C1094a0(this, 1);
        this.f7626o = c1094a02;
        return c1094a02;
    }

    /* renamed from: i */
    public final boolean m3856i(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m3857j(java.util.Collection collection) {
        int i4 = this.f7646n;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i4 != this.f7646n;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        p165n.C1875b c1875b = this.f7627p;
        if (c1875b != null) {
            return c1875b;
        }
        p165n.C1875b c1875b2 = new p165n.C1875b(this);
        this.f7627p = c1875b2;
        return c1875b2;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.f7646n;
        int i4 = this.f7646n;
        int[] iArr = this.f7644l;
        if (iArr.length < size) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, size);
            p154k3.AbstractC1803h.m3778d(copyOf, "copyOf(this, newSize)");
            this.f7644l = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.f7645m, size * 2);
            p154k3.AbstractC1803h.m3778d(copyOf2, "copyOf(this, newSize)");
            this.f7645m = copyOf2;
        }
        if (this.f7646n != i4) {
            throw new java.util.ConcurrentModificationException();
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        p165n.C1877d c1877d = this.f7628q;
        if (c1877d != null) {
            return c1877d;
        }
        p165n.C1877d c1877d2 = new p165n.C1877d(this);
        this.f7628q = c1877d2;
        return c1877d2;
    }
}
