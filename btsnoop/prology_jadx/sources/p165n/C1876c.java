package p165n;

/* renamed from: n.c */
/* loaded from: classes.dex */
public final class C1876c implements java.util.Iterator, java.util.Map.Entry {

    /* renamed from: l */
    public int f7621l;

    /* renamed from: m */
    public int f7622m = -1;

    /* renamed from: n */
    public boolean f7623n;

    /* renamed from: o */
    public final /* synthetic */ p165n.C1878e f7624o;

    public C1876c(p165n.C1878e c1878e) {
        this.f7624o = c1878e;
        this.f7621l = c1878e.f7646n - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!this.f7623n) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        int i4 = this.f7622m;
        p165n.C1878e c1878e = this.f7624o;
        return p154k3.AbstractC1803h.m3775a(key, c1878e.m3868e(i4)) && p154k3.AbstractC1803h.m3775a(entry.getValue(), c1878e.m3871h(this.f7622m));
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        if (this.f7623n) {
            return this.f7624o.m3868e(this.f7622m);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.f7623n) {
            return this.f7624o.m3871h(this.f7622m);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7622m < this.f7621l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f7623n) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i4 = this.f7622m;
        p165n.C1878e c1878e = this.f7624o;
        java.lang.Object m3868e = c1878e.m3868e(i4);
        java.lang.Object m3871h = c1878e.m3871h(this.f7622m);
        return (m3868e == null ? 0 : m3868e.hashCode()) ^ (m3871h != null ? m3871h.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f7622m++;
        this.f7623n = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7623n) {
            throw new java.lang.IllegalStateException();
        }
        this.f7624o.m3869f(this.f7622m);
        this.f7622m--;
        this.f7621l--;
        this.f7623n = false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (this.f7623n) {
            return this.f7624o.m3870g(this.f7622m, obj);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
