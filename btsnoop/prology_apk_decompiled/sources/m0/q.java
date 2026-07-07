package m0;

import B2.AbstractC0007h;
import q0.Z;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f7270a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.n f7271b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f7272c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7273d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f7275f;

    public q(r rVar, v vVar, int i4, InterfaceC0423d interfaceC0423d) {
        this.f7275f = rVar;
        this.f7271b = new u0.n(AbstractC0007h.k("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ", i4));
        Z z4 = new Z(rVar.f7283l, null, null);
        this.f7272c = z4;
        this.f7270a = new p(rVar, vVar, i4, z4, interfaceC0423d);
        z4.f7789f = rVar.f7285n;
    }

    public final void a() {
        if (this.f7273d) {
            return;
        }
        this.f7270a.f7267b.f7207u = true;
        this.f7273d = true;
        r.v(this.f7275f);
    }

    public final void b() {
        this.f7271b.f(this.f7270a.f7267b, this.f7275f.f7285n, 0);
    }
}
