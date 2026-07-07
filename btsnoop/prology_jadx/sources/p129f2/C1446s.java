package p129f2;

/* renamed from: f2.s */
/* loaded from: classes.dex */
public final class C1446s implements java.util.Iterator {

    /* renamed from: l */
    public int f5803l;

    /* renamed from: m */
    public int f5804m;

    /* renamed from: n */
    public int f5805n;

    /* renamed from: o */
    public final /* synthetic */ p129f2.C1449v f5806o;

    /* renamed from: p */
    public final /* synthetic */ int f5807p;

    /* renamed from: q */
    public final /* synthetic */ p129f2.C1449v f5808q;

    public C1446s(p129f2.C1449v c1449v, int i4) {
        this.f5807p = i4;
        this.f5808q = c1449v;
        this.f5806o = c1449v;
        this.f5803l = c1449v.f5819p;
        this.f5804m = c1449v.isEmpty() ? -1 : 0;
        this.f5805n = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5804m >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object obj;
        p129f2.C1449v c1449v = this.f5806o;
        if (c1449v.f5819p != this.f5803l) {
            throw new java.util.ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i4 = this.f5804m;
        this.f5805n = i4;
        switch (this.f5807p) {
            case 0:
                obj = this.f5808q.m3255j()[i4];
                break;
            case 1:
                obj = new p129f2.C1448u(this.f5808q, i4);
                break;
            default:
                obj = this.f5808q.m3256k()[i4];
                break;
        }
        int i5 = this.f5804m + 1;
        if (i5 >= c1449v.f5820q) {
            i5 = -1;
        }
        this.f5804m = i5;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        p129f2.C1449v c1449v = this.f5806o;
        int i4 = c1449v.f5819p;
        int i5 = this.f5803l;
        if (i4 != i5) {
            throw new java.util.ConcurrentModificationException();
        }
        int i6 = this.f5805n;
        if (i6 < 0) {
            throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f5803l = i5 + 32;
        c1449v.remove(c1449v.m3255j()[i6]);
        this.f5804m--;
        this.f5805n = -1;
    }
}
