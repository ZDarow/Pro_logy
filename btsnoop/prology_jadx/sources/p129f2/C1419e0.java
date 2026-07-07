package p129f2;

/* renamed from: f2.e0 */
/* loaded from: classes.dex */
public final class C1419e0 extends p129f2.AbstractC1397M {

    /* renamed from: o */
    public final transient p129f2.C1425h0 f5754o;

    /* renamed from: p */
    public final transient java.lang.Object[] f5755p;

    /* renamed from: q */
    public final transient int f5756q;

    public C1419e0(p129f2.C1425h0 c1425h0, java.lang.Object[] objArr, int i4) {
        this.f5754o = c1425h0;
        this.f5755p = objArr;
        this.f5756q = i4;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: b */
    public final int mo3151b(int i4, java.lang.Object[] objArr) {
        return mo3150a().mo3151b(i4, objArr);
    }

    @Override // p129f2.AbstractC1388D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        return value != null && value.equals(this.f5754o.get(key));
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: f */
    public final boolean mo3155f() {
        return true;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: g */
    public final p129f2.AbstractC1445r0 iterator() {
        return mo3150a().listIterator(0);
    }

    @Override // p129f2.AbstractC1397M
    /* renamed from: k */
    public final p129f2.AbstractC1393I mo3179k() {
        return new p129f2.C1417d0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5756q;
    }
}
