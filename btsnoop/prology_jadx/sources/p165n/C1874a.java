package p165n;

/* renamed from: n.a */
/* loaded from: classes.dex */
public final class C1874a implements java.util.Iterator {

    /* renamed from: l */
    public int f7615l;

    /* renamed from: m */
    public int f7616m;

    /* renamed from: n */
    public boolean f7617n;

    /* renamed from: o */
    public final /* synthetic */ int f7618o;

    /* renamed from: p */
    public final /* synthetic */ java.lang.Object f7619p;

    public C1874a(int i4) {
        this.f7615l = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7616m < this.f7615l;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object m3868e;
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i4 = this.f7616m;
        switch (this.f7618o) {
            case 0:
                m3868e = ((p165n.C1878e) this.f7619p).m3868e(i4);
                break;
            case 1:
                m3868e = ((p165n.C1878e) this.f7619p).m3871h(i4);
                break;
            default:
                m3868e = ((p165n.C1879f) this.f7619p).f7630m[i4];
                break;
        }
        this.f7616m++;
        this.f7617n = true;
        return m3868e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7617n) {
            throw new java.lang.IllegalStateException("Call next() before removing an element.");
        }
        int i4 = this.f7616m - 1;
        this.f7616m = i4;
        switch (this.f7618o) {
            case 0:
                ((p165n.C1878e) this.f7619p).m3869f(i4);
                break;
            case 1:
                ((p165n.C1878e) this.f7619p).m3869f(i4);
                break;
            default:
                ((p165n.C1879f) this.f7619p).m3858a(i4);
                break;
        }
        this.f7615l--;
        this.f7617n = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1874a(p165n.C1879f c1879f) {
        this(c1879f.f7631n);
        this.f7618o = 2;
        this.f7619p = c1879f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1874a(p165n.C1878e c1878e, int i4) {
        this(c1878e.f7646n);
        this.f7618o = i4;
        switch (i4) {
            case 1:
                this.f7619p = c1878e;
                this(c1878e.f7646n);
                return;
            default:
                this.f7619p = c1878e;
                return;
        }
    }
}
