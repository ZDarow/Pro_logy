package f2;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: f2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0281c implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5546l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final Iterator f5547m;

    /* renamed from: n, reason: collision with root package name */
    public Object f5548n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5549o;

    public C0281c(C0290l c0290l) {
        Iterator it;
        this.f5549o = c0290l;
        Collection collection = c0290l.f5590m;
        this.f5548n = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f5547m = it;
    }

    public void a() {
        C0290l c0290l = (C0290l) this.f5549o;
        c0290l.b();
        if (c0290l.f5590m != ((Collection) this.f5548n)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5546l) {
            case 0:
                return this.f5547m.hasNext();
            case 1:
                return this.f5547m.hasNext();
            default:
                a();
                return this.f5547m.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5546l) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f5547m.next();
                this.f5548n = (Collection) entry.getValue();
                return ((C0282d) this.f5549o).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f5547m.next();
                this.f5548n = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f5547m.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5546l) {
            case 0:
                if (!(((Collection) this.f5548n) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f5547m.remove();
                ((C0282d) this.f5549o).f5556o.f5537p -= ((Collection) this.f5548n).size();
                ((Collection) this.f5548n).clear();
                this.f5548n = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f5548n;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f5547m.remove();
                ((C0283e) this.f5549o).f5559m.f5537p -= collection.size();
                collection.clear();
                this.f5548n = null;
                return;
            default:
                this.f5547m.remove();
                C0290l c0290l = (C0290l) this.f5549o;
                Z z4 = c0290l.f5593p;
                z4.f5537p--;
                c0290l.c();
                return;
        }
    }

    public C0281c(C0290l c0290l, ListIterator listIterator) {
        this.f5549o = c0290l;
        this.f5548n = c0290l.f5590m;
        this.f5547m = listIterator;
    }

    public C0281c(C0283e c0283e, Iterator it) {
        this.f5549o = c0283e;
        this.f5547m = it;
    }

    public C0281c(C0282d c0282d) {
        this.f5549o = c0282d;
        this.f5547m = c0282d.f5555n.entrySet().iterator();
    }
}
