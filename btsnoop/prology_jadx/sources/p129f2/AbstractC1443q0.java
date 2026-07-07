package p129f2;

/* renamed from: f2.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC1443q0 implements java.util.Iterator {

    /* renamed from: l */
    public final java.util.Iterator f5802l;

    public AbstractC1443q0(java.util.Iterator it) {
        it.getClass();
        this.f5802l = it;
    }

    /* renamed from: a */
    public abstract java.lang.Object mo3180a(java.lang.Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5802l.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return mo3180a(this.f5802l.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5802l.remove();
    }
}
