package f2;

/* loaded from: classes.dex */
public final class f0 extends M {

    /* renamed from: o, reason: collision with root package name */
    public final transient h0 f5564o;

    /* renamed from: p, reason: collision with root package name */
    public final transient g0 f5565p;

    public f0(h0 h0Var, g0 g0Var) {
        this.f5564o = h0Var;
        this.f5565p = g0Var;
    }

    @Override // f2.M, f2.AbstractC0276D
    public final I a() {
        return this.f5565p;
    }

    @Override // f2.AbstractC0276D
    public final int b(int i4, Object[] objArr) {
        return this.f5565p.b(i4, objArr);
    }

    @Override // f2.AbstractC0276D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5564o.get(obj) != null;
    }

    @Override // f2.AbstractC0276D
    public final boolean f() {
        return true;
    }

    @Override // f2.AbstractC0276D
    /* renamed from: g */
    public final r0 iterator() {
        return this.f5565p.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5564o.f5576q;
    }
}
