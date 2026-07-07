package f2;

/* loaded from: classes.dex */
public final class p0 extends M {

    /* renamed from: o, reason: collision with root package name */
    public final transient Object f5604o;

    public p0(Object obj) {
        obj.getClass();
        this.f5604o = obj;
    }

    @Override // f2.M, f2.AbstractC0276D
    public final I a() {
        return I.o(this.f5604o);
    }

    @Override // f2.AbstractC0276D
    public final int b(int i4, Object[] objArr) {
        objArr[i4] = this.f5604o;
        return i4 + 1;
    }

    @Override // f2.AbstractC0276D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5604o.equals(obj);
    }

    @Override // f2.AbstractC0276D
    public final boolean f() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.P, f2.r0, java.lang.Object] */
    @Override // f2.AbstractC0276D
    /* renamed from: g */
    public final r0 iterator() {
        ?? obj = new Object();
        obj.f5525l = this.f5604o;
        return obj;
    }

    @Override // f2.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5604o.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f5604o.toString() + ']';
    }
}
