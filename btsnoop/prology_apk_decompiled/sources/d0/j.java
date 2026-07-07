package d0;

import r0.AbstractC0500b;

/* loaded from: classes.dex */
public final class j extends AbstractC0500b {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4887o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final Object f4888p;

    public j(p0.b bVar, int i4) {
        super(i4, bVar.f7604k - 1);
        this.f4888p = bVar;
    }

    @Override // r0.n
    public final long b() {
        switch (this.f4887o) {
            case 0:
                a();
                return ((i) this.f4888p).e(this.f8003n);
            default:
                return ((p0.b) this.f4888p).b((int) this.f8003n) + c();
        }
    }

    @Override // r0.n
    public final long c() {
        switch (this.f4887o) {
            case 0:
                a();
                return ((i) this.f4888p).f(this.f8003n);
            default:
                a();
                return ((p0.b) this.f4888p).f7608o[(int) this.f8003n];
        }
    }

    public j(i iVar, long j4, long j5) {
        super(j4, j5);
        this.f4888p = iVar;
    }
}
