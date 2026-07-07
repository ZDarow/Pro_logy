package f2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: f2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0283e extends o0 {

    /* renamed from: l, reason: collision with root package name */
    public final Map f5558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f5559m;

    public C0283e(Z z4, Map map) {
        this.f5559m = z4;
        map.getClass();
        this.f5558l = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0281c c0281c = (C0281c) it;
            if (!c0281c.hasNext()) {
                return;
            }
            c0281c.next();
            c0281c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5558l.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f5558l.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f5558l.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5558l.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5558l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0281c(this, this.f5558l.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i4;
        Collection collection = (Collection) this.f5558l.remove(obj);
        if (collection != null) {
            i4 = collection.size();
            collection.clear();
            this.f5559m.f5537p -= i4;
        } else {
            i4 = 0;
        }
        return i4 > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5558l.size();
    }
}
