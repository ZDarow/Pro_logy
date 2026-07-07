package m0;

import T.C0103y;
import T.U;
import android.net.Uri;
import f2.Y;
import java.util.ArrayList;
import javax.net.SocketFactory;
import q0.AbstractC0469a;
import q0.InterfaceC0467D;
import q0.h0;

/* loaded from: classes.dex */
public final class u extends AbstractC0469a {

    /* renamed from: A, reason: collision with root package name */
    public T.B f7297A;
    public final L1.g s;

    /* renamed from: t, reason: collision with root package name */
    public final String f7298t = "AndroidXMedia3/1.4.1";

    /* renamed from: u, reason: collision with root package name */
    public final Uri f7299u;

    /* renamed from: v, reason: collision with root package name */
    public final SocketFactory f7300v;
    public long w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7301x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7302y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7303z;

    static {
        T.C.a("media3.exoplayer.rtsp");
    }

    public u(T.B b4, L1.g gVar, SocketFactory socketFactory) {
        this.f7297A = b4;
        this.s = gVar;
        C0103y c0103y = b4.f2067b;
        c0103y.getClass();
        this.f7299u = c0103y.f2364a;
        this.f7300v = socketFactory;
        this.w = -9223372036854775807L;
        this.f7303z = true;
    }

    @Override // q0.AbstractC0469a
    public final InterfaceC0467D b(q0.F f4, u0.e eVar, long j4) {
        Y y4 = new Y(17, this);
        return new r(eVar, this.s, this.f7299u, y4, this.f7298t, this.f7300v);
    }

    @Override // q0.AbstractC0469a
    public final synchronized T.B h() {
        return this.f7297A;
    }

    @Override // q0.AbstractC0469a
    public final void j() {
    }

    @Override // q0.AbstractC0469a
    public final void m(Y.C c4) {
        v();
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
        r rVar = (r) interfaceC0467D;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = rVar.f7287p;
            if (i4 >= arrayList.size()) {
                W.y.h(rVar.f7286o);
                rVar.f7278C = true;
                return;
            }
            q qVar = (q) arrayList.get(i4);
            if (!qVar.f7274e) {
                qVar.f7271b.e(null);
                qVar.f7272c.y();
                qVar.f7274e = true;
            }
            i4++;
        }
    }

    @Override // q0.AbstractC0469a
    public final void r() {
    }

    @Override // q0.AbstractC0469a
    public final synchronized void u(T.B b4) {
        this.f7297A = b4;
    }

    public final void v() {
        U h0Var = new h0(this.w, this.f7301x, this.f7302y, h());
        if (this.f7303z) {
            h0Var = new s(h0Var, 0);
        }
        n(h0Var);
    }
}
