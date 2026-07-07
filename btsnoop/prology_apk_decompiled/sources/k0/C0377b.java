package k0;

import B2.x;
import T.C0095p;
import T.D;
import T.E;
import T.F;
import T.G;
import W.k;
import W.y;
import Z.f;
import a0.AbstractC0125e;
import a0.C0118H;
import a0.SurfaceHolderCallbackC0115E;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import p1.AbstractC0462a;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377b extends AbstractC0125e implements Handler.Callback {

    /* renamed from: C, reason: collision with root package name */
    public final C0376a f6927C;

    /* renamed from: D, reason: collision with root package name */
    public final SurfaceHolderCallbackC0115E f6928D;

    /* renamed from: E, reason: collision with root package name */
    public final Handler f6929E;

    /* renamed from: F, reason: collision with root package name */
    public final H0.a f6930F;

    /* renamed from: G, reason: collision with root package name */
    public AbstractC0462a f6931G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6932H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f6933I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public G f6934K;

    /* renamed from: L, reason: collision with root package name */
    public long f6935L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [Z.f, H0.a] */
    public C0377b(SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E, Looper looper) {
        super(5);
        C0376a c0376a = C0376a.f6926a;
        this.f6928D = surfaceHolderCallbackC0115E;
        this.f6929E = looper == null ? null : new Handler(looper, this);
        this.f6927C = c0376a;
        this.f6930F = new f(1);
        this.f6935L = -9223372036854775807L;
    }

    @Override // a0.AbstractC0125e
    public final int D(C0095p c0095p) {
        if (this.f6927C.b(c0095p)) {
            return AbstractC0125e.f(c0095p.J == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC0125e.f(0, 0, 0, 0);
    }

    public final void F(G g4, ArrayList arrayList) {
        int i4 = 0;
        while (true) {
            F[] fArr = g4.f2118l;
            if (i4 >= fArr.length) {
                return;
            }
            C0095p b4 = fArr[i4].b();
            if (b4 != null) {
                C0376a c0376a = this.f6927C;
                if (c0376a.b(b4)) {
                    AbstractC0462a a4 = c0376a.a(b4);
                    byte[] a5 = fArr[i4].a();
                    a5.getClass();
                    H0.a aVar = this.f6930F;
                    aVar.e();
                    aVar.h(a5.length);
                    aVar.f3140p.put(a5);
                    aVar.i();
                    G u4 = a4.u(aVar);
                    if (u4 != null) {
                        F(u4, arrayList);
                    }
                    i4++;
                }
            }
            arrayList.add(fArr[i4]);
            i4++;
        }
    }

    public final long G(long j4) {
        W.a.j(j4 != -9223372036854775807L);
        W.a.j(this.f6935L != -9223372036854775807L);
        return j4 - this.f6935L;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        G g4 = (G) message.obj;
        SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E = this.f6928D;
        C0118H c0118h = surfaceHolderCallbackC0115E.f3204a;
        D a4 = c0118h.f3240d0.a();
        int i4 = 0;
        while (true) {
            F[] fArr = g4.f2118l;
            if (i4 >= fArr.length) {
                break;
            }
            fArr[i4].c(a4);
            i4++;
        }
        c0118h.f3240d0 = new E(a4);
        E l4 = c0118h.l();
        boolean equals = l4.equals(c0118h.f3219L);
        k kVar = c0118h.f3251l;
        if (!equals) {
            c0118h.f3219L = l4;
            kVar.c(14, new x(17, surfaceHolderCallbackC0115E));
        }
        kVar.c(28, new x(18, g4));
        kVar.b();
        return true;
    }

    @Override // a0.AbstractC0125e
    public final String l() {
        return "MetadataRenderer";
    }

    @Override // a0.AbstractC0125e
    public final boolean n() {
        return this.f6933I;
    }

    @Override // a0.AbstractC0125e
    public final boolean p() {
        return true;
    }

    @Override // a0.AbstractC0125e
    public final void q() {
        this.f6934K = null;
        this.f6931G = null;
        this.f6935L = -9223372036854775807L;
    }

    @Override // a0.AbstractC0125e
    public final void s(long j4, boolean z4) {
        this.f6934K = null;
        this.f6932H = false;
        this.f6933I = false;
    }

    @Override // a0.AbstractC0125e
    public final void x(C0095p[] c0095pArr, long j4, long j5) {
        this.f6931G = this.f6927C.a(c0095pArr[0]);
        G g4 = this.f6934K;
        if (g4 != null) {
            long j6 = this.f6935L;
            long j7 = g4.f2119m;
            long j8 = (j6 + j7) - j5;
            if (j7 != j8) {
                g4 = new G(j8, g4.f2118l);
            }
            this.f6934K = g4;
        }
        this.f6935L = j5;
    }

    @Override // a0.AbstractC0125e
    public final void z(long j4, long j5) {
        boolean z4 = true;
        while (z4) {
            int i4 = 0;
            if (!this.f6932H && this.f6934K == null) {
                H0.a aVar = this.f6930F;
                aVar.e();
                Y.x xVar = this.f3423n;
                xVar.N();
                int y4 = y(xVar, aVar, 0);
                if (y4 == -4) {
                    if (aVar.c(4)) {
                        this.f6932H = true;
                    } else if (aVar.f3142r >= this.w) {
                        aVar.f699u = this.J;
                        aVar.i();
                        AbstractC0462a abstractC0462a = this.f6931G;
                        int i5 = y.f2709a;
                        G u4 = abstractC0462a.u(aVar);
                        if (u4 != null) {
                            ArrayList arrayList = new ArrayList(u4.f2118l.length);
                            F(u4, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f6934K = new G(G(aVar.f3142r), (F[]) arrayList.toArray(new F[0]));
                            }
                        }
                    }
                } else if (y4 == -5) {
                    C0095p c0095p = (C0095p) xVar.f3066n;
                    c0095p.getClass();
                    this.J = c0095p.f2330r;
                }
            }
            G g4 = this.f6934K;
            if (g4 == null || g4.f2119m > G(j4)) {
                z4 = false;
            } else {
                G g5 = this.f6934K;
                Handler handler = this.f6929E;
                if (handler != null) {
                    handler.obtainMessage(1, g5).sendToTarget();
                } else {
                    SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E = this.f6928D;
                    C0118H c0118h = surfaceHolderCallbackC0115E.f3204a;
                    D a4 = c0118h.f3240d0.a();
                    while (true) {
                        F[] fArr = g5.f2118l;
                        if (i4 >= fArr.length) {
                            break;
                        }
                        fArr[i4].c(a4);
                        i4++;
                    }
                    c0118h.f3240d0 = new E(a4);
                    E l4 = c0118h.l();
                    boolean equals = l4.equals(c0118h.f3219L);
                    k kVar = c0118h.f3251l;
                    if (!equals) {
                        c0118h.f3219L = l4;
                        kVar.c(14, new x(17, surfaceHolderCallbackC0115E));
                    }
                    kVar.c(28, new x(18, g5));
                    kVar.b();
                }
                this.f6934K = null;
                z4 = true;
            }
            if (this.f6932H && this.f6934K == null) {
                this.f6933I = true;
            }
        }
    }
}
