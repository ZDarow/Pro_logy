package f2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279a implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public final Iterator f5539l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5540m = null;

    /* renamed from: n, reason: collision with root package name */
    public Collection f5541n = null;

    /* renamed from: o, reason: collision with root package name */
    public Iterator f5542o = O.f5522l;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f5543p;

    public C0279a(Z z4) {
        this.f5543p = z4;
        this.f5539l = z4.f5536o.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5539l.hasNext() || this.f5542o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f5542o.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f5539l.next();
            this.f5540m = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f5541n = collection;
            this.f5542o = collection.iterator();
        }
        return this.f5542o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5542o.remove();
        Collection collection = this.f5541n;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f5539l.remove();
        }
        Z z4 = this.f5543p;
        z4.f5537p--;
    }
}
