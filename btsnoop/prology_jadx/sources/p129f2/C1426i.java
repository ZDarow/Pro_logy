package p129f2;

/* renamed from: f2.i */
/* loaded from: classes.dex */
public class C1426i extends p129f2.C1416d implements java.util.SortedMap {

    /* renamed from: p */
    public java.util.SortedSet f5771p;

    /* renamed from: q */
    public final /* synthetic */ p129f2.C1409Z f5772q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426i(p129f2.C1409Z c1409z, java.util.SortedMap sortedMap) {
        super(c1409z, sortedMap);
        this.f5772q = c1409z;
    }

    /* renamed from: b */
    public java.util.SortedSet mo3207b() {
        return new p129f2.C1428j(this.f5772q, mo3209d());
    }

    @Override // p129f2.C1416d, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public java.util.SortedSet keySet() {
        java.util.SortedSet sortedSet = this.f5771p;
        if (sortedSet != null) {
            return sortedSet;
        }
        java.util.SortedSet mo3207b = mo3207b();
        this.f5771p = mo3207b;
        return mo3207b;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return mo3209d().comparator();
    }

    /* renamed from: d */
    public java.util.SortedMap mo3209d() {
        return (java.util.SortedMap) this.f5749n;
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return mo3209d().firstKey();
    }

    public java.util.SortedMap headMap(java.lang.Object obj) {
        return new p129f2.C1426i(this.f5772q, mo3209d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return mo3209d().lastKey();
    }

    public java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return new p129f2.C1426i(this.f5772q, mo3209d().subMap(obj, obj2));
    }

    public java.util.SortedMap tailMap(java.lang.Object obj) {
        return new p129f2.C1426i(this.f5772q, mo3209d().tailMap(obj));
    }
}
