package g0;

import java.util.List;
import r0.AbstractC0500b;

/* loaded from: classes.dex */
public final class f extends AbstractC0500b {

    /* renamed from: o, reason: collision with root package name */
    public final List f5650o;

    /* renamed from: p, reason: collision with root package name */
    public final long f5651p;

    public f(long j4, List list) {
        super(0L, list.size() - 1);
        this.f5651p = j4;
        this.f5650o = list;
    }

    @Override // r0.n
    public final long b() {
        a();
        h0.g gVar = (h0.g) this.f5650o.get((int) this.f8003n);
        return this.f5651p + gVar.f5885p + gVar.f5883n;
    }

    @Override // r0.n
    public final long c() {
        a();
        return this.f5651p + ((h0.g) this.f5650o.get((int) this.f8003n)).f5885p;
    }
}
