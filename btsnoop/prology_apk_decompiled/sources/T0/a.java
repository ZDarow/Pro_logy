package T0;

import java.math.BigInteger;
import y0.C0617A;
import y0.y;
import y0.z;

/* loaded from: classes.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f2371a;

    public a(b bVar) {
        this.f2371a = bVar;
    }

    @Override // y0.z
    public final boolean c() {
        return true;
    }

    @Override // y0.z
    public final y f(long j4) {
        b bVar = this.f2371a;
        BigInteger valueOf = BigInteger.valueOf((bVar.f2375o.f2410i * j4) / 1000000);
        long j5 = bVar.f2374n;
        long j6 = bVar.f2373m;
        C0617A c0617a = new C0617A(j4, W.y.k((valueOf.multiply(BigInteger.valueOf(j5 - j6)).divide(BigInteger.valueOf(bVar.f2377q)).longValue() + j6) - 30000, bVar.f2373m, j5 - 1));
        return new y(c0617a, c0617a);
    }

    @Override // y0.z
    public final long i() {
        return (this.f2371a.f2377q * 1000000) / r0.f2375o.f2410i;
    }
}
