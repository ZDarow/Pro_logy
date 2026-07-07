package p129f2;

/* renamed from: f2.j */
/* loaded from: classes.dex */
public class C1428j extends p129f2.C1418e implements java.util.SortedSet {

    /* renamed from: n */
    public final /* synthetic */ p129f2.C1409Z f5780n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1428j(p129f2.C1409Z c1409z, java.util.SortedMap sortedMap) {
        super(c1409z, sortedMap);
        this.f5780n = c1409z;
    }

    /* renamed from: a */
    public java.util.SortedMap mo3212a() {
        return (java.util.SortedMap) this.f5752l;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return mo3212a().comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return mo3212a().firstKey();
    }

    public java.util.SortedSet headSet(java.lang.Object obj) {
        return new p129f2.C1428j(this.f5780n, mo3212a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        return mo3212a().lastKey();
    }

    public java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new p129f2.C1428j(this.f5780n, mo3212a().subMap(obj, obj2));
    }

    public java.util.SortedSet tailSet(java.lang.Object obj) {
        return new p129f2.C1428j(this.f5780n, mo3212a().tailMap(obj));
    }
}
