package p129f2;

/* renamed from: f2.N */
/* loaded from: classes.dex */
public final class C1398N extends p129f2.AbstractC1445r0 {

    /* renamed from: l */
    public int f5711l;

    /* renamed from: m */
    public java.lang.Object f5712m;

    /* renamed from: n */
    public final /* synthetic */ int f5713n;

    /* renamed from: o */
    public final java.util.Iterator f5714o;

    /* renamed from: p */
    public final /* synthetic */ java.lang.Object f5715p;

    public C1398N() {
        this.f5711l = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.lang.Object next;
        int i4 = this.f5711l;
        if (i4 == 4) {
            throw new java.lang.IllegalStateException();
        }
        int m781b = p044L.AbstractC0352j.m781b(i4);
        if (m781b == 0) {
            return true;
        }
        if (m781b == 2) {
            return false;
        }
        this.f5711l = 4;
        switch (this.f5713n) {
            case 0:
                do {
                    java.util.Iterator it = this.f5714o;
                    if (!it.hasNext()) {
                        this.f5711l = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((p124e2.InterfaceC1359g) this.f5715p).apply(next));
            default:
                do {
                    java.util.Iterator it2 = this.f5714o;
                    if (!it2.hasNext()) {
                        this.f5711l = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((p129f2.C1433l0) this.f5715p).f5791m.contains(next));
        }
        this.f5712m = next;
        if (this.f5711l == 3) {
            return false;
        }
        this.f5711l = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f5711l = 2;
        java.lang.Object obj = this.f5712m;
        this.f5712m = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1398N(java.util.Iterator it, p124e2.InterfaceC1359g interfaceC1359g) {
        this();
        this.f5713n = 0;
        this.f5714o = it;
        this.f5715p = interfaceC1359g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1398N(p129f2.C1433l0 c1433l0) {
        this();
        this.f5713n = 1;
        this.f5715p = c1433l0;
        this.f5714o = c1433l0.f5790l.iterator();
    }
}
