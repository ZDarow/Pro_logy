package p129f2;

/* renamed from: f2.Q */
/* loaded from: classes.dex */
public final class C1401Q extends p129f2.AbstractC1443q0 implements java.util.ListIterator {

    /* renamed from: m */
    public final /* synthetic */ int f5720m;

    /* renamed from: n */
    public final /* synthetic */ java.util.AbstractList f5721n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1401Q(java.util.AbstractList abstractList, java.util.ListIterator listIterator, int i4) {
        super(listIterator);
        this.f5720m = i4;
        this.f5721n = abstractList;
    }

    @Override // p129f2.AbstractC1443q0
    /* renamed from: a */
    public final java.lang.Object mo3180a(java.lang.Object obj) {
        switch (this.f5720m) {
            case 0:
                return ((p129f2.C1402S) this.f5721n).f5723m.apply(obj);
            default:
                return ((p129f2.C1403T) this.f5721n).f5725m.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((java.util.ListIterator) this.f5802l).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((java.util.ListIterator) this.f5802l).nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return mo3180a(((java.util.ListIterator) this.f5802l).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((java.util.ListIterator) this.f5802l).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
