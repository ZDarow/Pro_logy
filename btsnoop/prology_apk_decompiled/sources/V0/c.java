package V0;

import B2.x;
import i0.C0340b;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends Z.g implements d {

    /* renamed from: p, reason: collision with root package name */
    public d f2603p;

    /* renamed from: q, reason: collision with root package name */
    public long f2604q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2605r = 1;
    public Object s;

    public /* synthetic */ c() {
    }

    @Override // V0.d
    public final long B(int i4) {
        d dVar = this.f2603p;
        dVar.getClass();
        return dVar.B(i4) + this.f2604q;
    }

    @Override // V0.d
    public final int Q() {
        d dVar = this.f2603p;
        dVar.getClass();
        return dVar.Q();
    }

    @Override // Z.g
    public final void e() {
        super.e();
        this.f2603p = null;
    }

    @Override // Z.g
    public final void f() {
        switch (this.f2605r) {
            case 0:
                ((C0340b) this.s).k(this);
                return;
            default:
                x xVar = (x) this.s;
                xVar.getClass();
                W0.i iVar = (W0.i) xVar.f214m;
                iVar.getClass();
                e();
                iVar.f2805b.add(this);
                return;
        }
    }

    @Override // V0.d
    public final int g(long j4) {
        d dVar = this.f2603p;
        dVar.getClass();
        return dVar.g(j4 - this.f2604q);
    }

    @Override // V0.d
    public final List w(long j4) {
        d dVar = this.f2603p;
        dVar.getClass();
        return dVar.w(j4 - this.f2604q);
    }

    public c(C0340b c0340b) {
        this.s = c0340b;
    }
}
