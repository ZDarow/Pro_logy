package p129f2;

/* renamed from: f2.d0 */
/* loaded from: classes.dex */
public final class C1417d0 extends p129f2.AbstractC1393I {

    /* renamed from: n */
    public final /* synthetic */ p129f2.C1419e0 f5751n;

    public C1417d0(p129f2.C1419e0 c1419e0) {
        this.f5751n = c1419e0;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: f */
    public final boolean mo3155f() {
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i4) {
        p129f2.C1419e0 c1419e0 = this.f5751n;
        p176p1.AbstractC1949a.m3935l(i4, c1419e0.f5756q);
        int i5 = i4 * 2;
        java.lang.Object[] objArr = c1419e0.f5755p;
        java.lang.Object obj = objArr[i5];
        java.util.Objects.requireNonNull(obj);
        java.lang.Object obj2 = objArr[i5 + 1];
        java.util.Objects.requireNonNull(obj2);
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5751n.f5756q;
    }
}
