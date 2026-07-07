package p129f2;

/* renamed from: f2.c */
/* loaded from: classes.dex */
public class C1414c implements java.util.Iterator {

    /* renamed from: l */
    public final /* synthetic */ int f5740l = 0;

    /* renamed from: m */
    public final java.util.Iterator f5741m;

    /* renamed from: n */
    public java.lang.Object f5742n;

    /* renamed from: o */
    public final /* synthetic */ java.lang.Object f5743o;

    public C1414c(p129f2.C1432l c1432l) {
        java.util.Iterator it;
        this.f5743o = c1432l;
        java.util.Collection collection = c1432l.f5785m;
        this.f5742n = collection;
        if (collection instanceof java.util.List) {
            it = ((java.util.List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f5741m = it;
    }

    /* renamed from: a */
    public void m3205a() {
        p129f2.C1432l c1432l = (p129f2.C1432l) this.f5743o;
        c1432l.m3221b();
        if (c1432l.f5785m != ((java.util.Collection) this.f5742n)) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5740l) {
            case 0:
                return this.f5741m.hasNext();
            case 1:
                return this.f5741m.hasNext();
            default:
                m3205a();
                return this.f5741m.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f5740l) {
            case 0:
                java.util.Map.Entry entry = (java.util.Map.Entry) this.f5741m.next();
                this.f5742n = (java.util.Collection) entry.getValue();
                return ((p129f2.C1416d) this.f5743o).m3206a(entry);
            case 1:
                java.util.Map.Entry entry2 = (java.util.Map.Entry) this.f5741m.next();
                this.f5742n = entry2;
                return entry2.getKey();
            default:
                m3205a();
                return this.f5741m.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5740l) {
            case 0:
                if (!(((java.util.Collection) this.f5742n) != null)) {
                    throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f5741m.remove();
                ((p129f2.C1416d) this.f5743o).f5750o.f5731p -= ((java.util.Collection) this.f5742n).size();
                ((java.util.Collection) this.f5742n).clear();
                this.f5742n = null;
                return;
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) this.f5742n;
                if (!(entry != null)) {
                    throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
                }
                java.util.Collection collection = (java.util.Collection) entry.getValue();
                this.f5741m.remove();
                ((p129f2.C1418e) this.f5743o).f5753m.f5731p -= collection.size();
                collection.clear();
                this.f5742n = null;
                return;
            default:
                this.f5741m.remove();
                p129f2.C1432l c1432l = (p129f2.C1432l) this.f5743o;
                p129f2.C1409Z c1409z = c1432l.f5788p;
                c1409z.f5731p--;
                c1432l.m3222c();
                return;
        }
    }

    public C1414c(p129f2.C1432l c1432l, java.util.ListIterator listIterator) {
        this.f5743o = c1432l;
        this.f5742n = c1432l.f5785m;
        this.f5741m = listIterator;
    }

    public C1414c(p129f2.C1418e c1418e, java.util.Iterator it) {
        this.f5743o = c1418e;
        this.f5741m = it;
    }

    public C1414c(p129f2.C1416d c1416d) {
        this.f5743o = c1416d;
        this.f5741m = c1416d.f5749n.entrySet().iterator();
    }
}
