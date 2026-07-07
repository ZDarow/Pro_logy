package f2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class N extends r0 {

    /* renamed from: l, reason: collision with root package name */
    public int f5517l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5518m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5519n;

    /* renamed from: o, reason: collision with root package name */
    public final Iterator f5520o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5521p;

    public N() {
        this.f5517l = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i4 = this.f5517l;
        if (i4 == 4) {
            throw new IllegalStateException();
        }
        int b4 = L.j.b(i4);
        if (b4 == 0) {
            return true;
        }
        if (b4 == 2) {
            return false;
        }
        this.f5517l = 4;
        switch (this.f5519n) {
            case 0:
                do {
                    Iterator it = this.f5520o;
                    if (!it.hasNext()) {
                        this.f5517l = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((e2.g) this.f5521p).apply(next));
            default:
                do {
                    Iterator it2 = this.f5520o;
                    if (!it2.hasNext()) {
                        this.f5517l = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((l0) this.f5521p).f5596m.contains(next));
        }
        this.f5518m = next;
        if (this.f5517l == 3) {
            return false;
        }
        this.f5517l = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5517l = 2;
        Object obj = this.f5518m;
        this.f5518m = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(Iterator it, e2.g gVar) {
        this();
        this.f5519n = 0;
        this.f5520o = it;
        this.f5521p = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(l0 l0Var) {
        this();
        this.f5519n = 1;
        this.f5521p = l0Var;
        this.f5520o = l0Var.f5595l.iterator();
    }
}
