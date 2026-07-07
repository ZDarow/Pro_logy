package f2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class n0 extends m0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f5597l).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f5597l.iterator();
        it.getClass();
        e2.g gVar = this.f5598m;
        gVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (gVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.m0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new m0(((SortedSet) this.f5597l).headSet(obj), this.f5598m);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f5597l;
        while (true) {
            Object last = sortedSet.last();
            if (this.f5598m.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.m0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new m0(((SortedSet) this.f5597l).subSet(obj, obj2), this.f5598m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.m0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new m0(((SortedSet) this.f5597l).tailSet(obj), this.f5598m);
    }
}
