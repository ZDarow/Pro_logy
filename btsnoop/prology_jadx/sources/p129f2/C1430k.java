package p129f2;

/* renamed from: f2.k */
/* loaded from: classes.dex */
public final class C1430k extends p129f2.C1414c implements java.util.ListIterator {

    /* renamed from: p */
    public final /* synthetic */ p129f2.C1432l f5782p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430k(p129f2.C1432l c1432l) {
        super(c1432l);
        this.f5782p = c1432l;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        p129f2.C1432l c1432l = this.f5782p;
        boolean isEmpty = c1432l.isEmpty();
        m3219b().add(obj);
        c1432l.f5789q.f5731p++;
        if (isEmpty) {
            c1432l.m3220a();
        }
    }

    /* renamed from: b */
    public final java.util.ListIterator m3219b() {
        m3205a();
        return (java.util.ListIterator) this.f5741m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m3219b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m3219b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return m3219b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m3219b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        m3219b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430k(p129f2.C1432l c1432l, int i4) {
        super(c1432l, ((java.util.List) c1432l.f5785m).listIterator(i4));
        this.f5782p = c1432l;
    }
}
