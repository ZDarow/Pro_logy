package f2;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q0 implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public final Iterator f5607l;

    public q0(Iterator it) {
        it.getClass();
        this.f5607l = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5607l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f5607l.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5607l.remove();
    }
}
