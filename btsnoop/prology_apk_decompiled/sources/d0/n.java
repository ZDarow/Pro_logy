package d0;

import T.C0095p;
import T.G;
import T.I;
import T.InterfaceC0089j;
import W.r;
import W.y;
import Y.x;
import android.os.Handler;
import q0.W;
import q0.Z;
import y0.E;
import y0.F;

/* loaded from: classes.dex */
public final class n implements F {

    /* renamed from: a, reason: collision with root package name */
    public final Z f4912a;

    /* renamed from: b, reason: collision with root package name */
    public final x f4913b = new x((char) 0, 4);

    /* renamed from: c, reason: collision with root package name */
    public final H0.a f4914c = new Z.f(1);

    /* renamed from: d, reason: collision with root package name */
    public long f4915d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4916e;

    /* JADX WARN: Type inference failed for: r2v3, types: [Z.f, H0.a] */
    public n(o oVar, u0.e eVar) {
        this.f4916e = oVar;
        this.f4912a = new Z(eVar, null, null);
    }

    @Override // y0.F
    public final void a(r rVar, int i4, int i5) {
        this.f4912a.a(rVar, i4, 0);
    }

    @Override // y0.F
    public final void b(long j4, int i4, int i5, int i6, E e4) {
        long e5;
        long j5;
        this.f4912a.b(j4, i4, i5, i6, e4);
        while (this.f4912a.s(false)) {
            H0.a aVar = this.f4914c;
            aVar.e();
            if (this.f4912a.x(this.f4913b, aVar, 0, false) == -4) {
                aVar.i();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j6 = aVar.f3142r;
                G u4 = this.f4916e.f4919n.u(aVar);
                if (u4 != null) {
                    J0.a aVar2 = (J0.a) u4.f2118l[0];
                    String str = aVar2.f891l;
                    String str2 = aVar2.f892m;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j5 = y.P(y.p(aVar2.f895p));
                        } catch (I unused) {
                            j5 = -9223372036854775807L;
                        }
                        if (j5 != -9223372036854775807L) {
                            m mVar = new m(j6, j5);
                            Handler handler = this.f4916e.f4920o;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        Z z4 = this.f4912a;
        W w = z4.f7784a;
        synchronized (z4) {
            int i7 = z4.s;
            e5 = i7 == 0 ? -1L : z4.e(i7);
        }
        w.b(e5);
    }

    @Override // y0.F
    public final void c(C0095p c0095p) {
        this.f4912a.c(c0095p);
    }

    @Override // y0.F
    public final int d(InterfaceC0089j interfaceC0089j, int i4, boolean z4) {
        return this.f4912a.d(interfaceC0089j, i4, z4);
    }
}
