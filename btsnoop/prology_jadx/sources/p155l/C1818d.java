package p155l;

/* renamed from: l.d */
/* loaded from: classes.dex */
public final class C1818d extends p155l.AbstractC1819e implements java.util.Iterator {

    /* renamed from: l */
    public p155l.C1817c f7384l;

    /* renamed from: m */
    public boolean f7385m = true;

    /* renamed from: n */
    public final /* synthetic */ p155l.C1820f f7386n;

    public C1818d(p155l.C1820f c1820f) {
        this.f7386n = c1820f;
    }

    @Override // p155l.AbstractC1819e
    /* renamed from: a */
    public final void mo3794a(p155l.C1817c c1817c) {
        p155l.C1817c c1817c2 = this.f7384l;
        if (c1817c == c1817c2) {
            p155l.C1817c c1817c3 = c1817c2.f7383o;
            this.f7384l = c1817c3;
            this.f7385m = c1817c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7385m) {
            return this.f7386n.f7387l != null;
        }
        p155l.C1817c c1817c = this.f7384l;
        return (c1817c == null || c1817c.f7382n == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f7385m) {
            this.f7385m = false;
            this.f7384l = this.f7386n.f7387l;
        } else {
            p155l.C1817c c1817c = this.f7384l;
            this.f7384l = c1817c != null ? c1817c.f7382n : null;
        }
        return this.f7384l;
    }
}
