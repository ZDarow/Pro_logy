package p129f2;

/* renamed from: f2.f0 */
/* loaded from: classes.dex */
public final class C1421f0 extends p129f2.AbstractC1397M {

    /* renamed from: o */
    public final transient p129f2.C1425h0 f5758o;

    /* renamed from: p */
    public final transient p129f2.C1423g0 f5759p;

    public C1421f0(p129f2.C1425h0 c1425h0, p129f2.C1423g0 c1423g0) {
        this.f5758o = c1425h0;
        this.f5759p = c1423g0;
    }

    @Override // p129f2.AbstractC1397M, p129f2.AbstractC1388D
    /* renamed from: a */
    public final p129f2.AbstractC1393I mo3150a() {
        return this.f5759p;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: b */
    public final int mo3151b(int i4, java.lang.Object[] objArr) {
        return this.f5759p.mo3151b(i4, objArr);
    }

    @Override // p129f2.AbstractC1388D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f5758o.get(obj) != null;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: f */
    public final boolean mo3155f() {
        return true;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: g */
    public final p129f2.AbstractC1445r0 iterator() {
        return this.f5759p.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5758o.f5770q;
    }
}
