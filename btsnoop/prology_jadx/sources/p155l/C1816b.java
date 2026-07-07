package p155l;

/* renamed from: l.b */
/* loaded from: classes.dex */
public final class C1816b extends p155l.AbstractC1819e implements java.util.Iterator {

    /* renamed from: l */
    public p155l.C1817c f7377l;

    /* renamed from: m */
    public p155l.C1817c f7378m;

    /* renamed from: n */
    public final /* synthetic */ int f7379n;

    public C1816b(p155l.C1817c c1817c, p155l.C1817c c1817c2, int i4) {
        this.f7379n = i4;
        this.f7377l = c1817c2;
        this.f7378m = c1817c;
    }

    @Override // p155l.AbstractC1819e
    /* renamed from: a */
    public final void mo3794a(p155l.C1817c c1817c) {
        p155l.C1817c c1817c2;
        p155l.C1817c c1817c3 = null;
        if (this.f7377l == c1817c && c1817c == this.f7378m) {
            this.f7378m = null;
            this.f7377l = null;
        }
        p155l.C1817c c1817c4 = this.f7377l;
        if (c1817c4 == c1817c) {
            switch (this.f7379n) {
                case 0:
                    c1817c2 = c1817c4.f7383o;
                    break;
                default:
                    c1817c2 = c1817c4.f7382n;
                    break;
            }
            this.f7377l = c1817c2;
        }
        p155l.C1817c c1817c5 = this.f7378m;
        if (c1817c5 == c1817c) {
            p155l.C1817c c1817c6 = this.f7377l;
            if (c1817c5 != c1817c6 && c1817c6 != null) {
                c1817c3 = m3795b(c1817c5);
            }
            this.f7378m = c1817c3;
        }
    }

    /* renamed from: b */
    public final p155l.C1817c m3795b(p155l.C1817c c1817c) {
        switch (this.f7379n) {
            case 0:
                return c1817c.f7382n;
            default:
                return c1817c.f7383o;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7378m != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        p155l.C1817c c1817c = this.f7378m;
        p155l.C1817c c1817c2 = this.f7377l;
        this.f7378m = (c1817c == c1817c2 || c1817c2 == null) ? null : m3795b(c1817c);
        return c1817c;
    }
}
