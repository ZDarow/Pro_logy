package p129f2;

/* renamed from: f2.p0 */
/* loaded from: classes.dex */
public final class C1441p0 extends p129f2.AbstractC1397M {

    /* renamed from: o */
    public final transient java.lang.Object f5799o;

    public C1441p0(java.lang.Object obj) {
        obj.getClass();
        this.f5799o = obj;
    }

    @Override // p129f2.AbstractC1397M, p129f2.AbstractC1388D
    /* renamed from: a */
    public final p129f2.AbstractC1393I mo3150a() {
        return p129f2.AbstractC1393I.m3166o(this.f5799o);
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: b */
    public final int mo3151b(int i4, java.lang.Object[] objArr) {
        objArr[i4] = this.f5799o;
        return i4 + 1;
    }

    @Override // p129f2.AbstractC1388D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f5799o.equals(obj);
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: f */
    public final boolean mo3155f() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.P, f2.r0, java.lang.Object] */
    @Override // p129f2.AbstractC1388D
    /* renamed from: g */
    public final p129f2.AbstractC1445r0 iterator() {
        ?? obj = new java.lang.Object();
        obj.f5719l = this.f5799o;
        return obj;
    }

    @Override // p129f2.AbstractC1397M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5799o.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return "[" + this.f5799o.toString() + ']';
    }
}
