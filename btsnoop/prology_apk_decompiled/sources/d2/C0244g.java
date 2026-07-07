package d2;

import B2.x;
import N1.l;
import N1.q;
import java.util.concurrent.Executor;

/* renamed from: d2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244g implements InterfaceC0245h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4977a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4978b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f4979c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4980d;

    public C0244g(l lVar, x xVar) {
        this.f4979c = lVar;
        this.f4980d = xVar;
    }

    @Override // d2.InterfaceC0245h
    public final void a(C0246i c0246i) {
        switch (this.f4977a) {
            case 0:
                synchronized (this.f4978b) {
                }
                this.f4979c.execute(new q(5, this, c0246i));
                return;
            case 1:
                if (c0246i.b() || c0246i.f4984d) {
                    return;
                }
                synchronized (this.f4978b) {
                }
                ((l) this.f4979c).execute(new q(6, this, c0246i));
                return;
            default:
                if (c0246i.b()) {
                    synchronized (this.f4978b) {
                    }
                    ((l) this.f4979c).execute(new q(7, this, c0246i));
                    return;
                }
                return;
        }
    }

    public C0244g(l lVar, InterfaceC0239b interfaceC0239b) {
        this.f4979c = lVar;
        this.f4980d = interfaceC0239b;
    }

    public C0244g(Executor executor, InterfaceC0238a interfaceC0238a) {
        this.f4979c = executor;
        this.f4980d = interfaceC0238a;
    }
}
