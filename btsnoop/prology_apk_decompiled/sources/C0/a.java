package C0;

import T.C0098t;
import y0.B;
import y0.o;
import y0.p;
import y0.q;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f339a;

    /* renamed from: b, reason: collision with root package name */
    public final o f340b;

    public a(int i4, byte b4) {
        this.f339a = i4;
        switch (i4) {
            case 1:
                this.f340b = new B(35152, 2, "image/png");
                return;
            default:
                this.f340b = new B(16973, 2, "image/bmp");
                return;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        switch (this.f339a) {
            case 0:
                ((B) this.f340b).b(j4, j5);
                return;
            case 1:
                ((B) this.f340b).b(j4, j5);
                return;
            default:
                this.f340b.b(j4, j5);
                return;
        }
    }

    @Override // y0.o
    public final void g(q qVar) {
        switch (this.f339a) {
            case 0:
                ((B) this.f340b).g(qVar);
                return;
            case 1:
                ((B) this.f340b).g(qVar);
                return;
            default:
                this.f340b.g(qVar);
                return;
        }
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        switch (this.f339a) {
            case 0:
                return ((B) this.f340b).k(pVar);
            case 1:
                return ((B) this.f340b).k(pVar);
            default:
                return this.f340b.k(pVar);
        }
    }

    @Override // y0.o
    public final int l(p pVar, C0098t c0098t) {
        switch (this.f339a) {
            case 0:
                return ((B) this.f340b).l(pVar, c0098t);
            case 1:
                return ((B) this.f340b).l(pVar, c0098t);
            default:
                return this.f340b.l(pVar, c0098t);
        }
    }

    @Override // y0.o
    public final void release() {
        switch (this.f339a) {
            case 0:
            case 1:
                return;
            default:
                this.f340b.release();
                return;
        }
    }

    public a(int i4) {
        this.f339a = 2;
        if ((i4 & 1) != 0) {
            this.f340b = new B(65496, 2, "image/jpeg");
        } else {
            this.f340b = new G0.a();
        }
    }
}
