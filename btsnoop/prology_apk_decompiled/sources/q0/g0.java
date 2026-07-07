package q0;

import T.C0094o;
import T.C0095p;
import T.C0098t;
import T.C0099u;
import T.C0101w;
import T.C0102x;
import T.C0103y;
import T.C0104z;
import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 extends AbstractC0469a {

    /* renamed from: u, reason: collision with root package name */
    public static final C0095p f7846u;

    /* renamed from: v, reason: collision with root package name */
    public static final T.B f7847v;
    public static final byte[] w;
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public T.B f7848t;

    /* JADX WARN: Type inference failed for: r11v0, types: [T.u, T.v] */
    static {
        C0094o c0094o = new C0094o();
        c0094o.f2290l = T.H.l("audio/raw");
        c0094o.f2302z = 2;
        c0094o.f2270A = 44100;
        c0094o.f2271B = 2;
        C0095p c0095p = new C0095p(c0094o);
        f7846u = c0095p;
        C0098t c0098t = new C0098t();
        f2.G g4 = f2.I.f5510m;
        f2.c0 c0Var = f2.c0.f5550p;
        List emptyList = Collections.emptyList();
        f2.c0 c0Var2 = f2.c0.f5550p;
        C0101w c0101w = new C0101w();
        C0104z c0104z = C0104z.f2370a;
        Uri uri = Uri.EMPTY;
        f7847v = new T.B("SilenceMediaSource", new C0099u(c0098t), uri != null ? new C0103y(uri, c0095p.f2325m, null, emptyList, c0Var2, null, -9223372036854775807L) : null, new C0102x(c0101w), T.E.f2095y, c0104z);
        w = new byte[4096];
    }

    public g0(long j4, T.B b4) {
        W.a.e(j4 >= 0);
        this.s = j4;
        this.f7848t = b4;
    }

    @Override // q0.AbstractC0469a
    public final InterfaceC0467D b(F f4, u0.e eVar, long j4) {
        return new e0(this.s);
    }

    @Override // q0.AbstractC0469a
    public final synchronized T.B h() {
        return this.f7848t;
    }

    @Override // q0.AbstractC0469a
    public final void j() {
    }

    @Override // q0.AbstractC0469a
    public final void m(Y.C c4) {
        n(new h0(this.s, true, false, h()));
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
    }

    @Override // q0.AbstractC0469a
    public final void r() {
    }

    @Override // q0.AbstractC0469a
    public final synchronized void u(T.B b4) {
        this.f7848t = b4;
    }
}
