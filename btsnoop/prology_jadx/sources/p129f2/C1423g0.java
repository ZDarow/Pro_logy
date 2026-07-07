package p129f2;

/* renamed from: f2.g0 */
/* loaded from: classes.dex */
public final class C1423g0 extends p129f2.AbstractC1393I {

    /* renamed from: n */
    public final transient java.lang.Object[] f5761n;

    /* renamed from: o */
    public final transient int f5762o;

    /* renamed from: p */
    public final transient int f5763p;

    public C1423g0(java.lang.Object[] objArr, int i4, int i5) {
        this.f5761n = objArr;
        this.f5762o = i4;
        this.f5763p = i5;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: f */
    public final boolean mo3155f() {
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i4) {
        p176p1.AbstractC1949a.m3935l(i4, this.f5763p);
        java.lang.Object obj = this.f5761n[(i4 * 2) + this.f5762o];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5763p;
    }
}
