package r0;

import T.C0095p;
import Y.B;
import Y.x;
import a.AbstractC0110a;

/* loaded from: classes.dex */
public final class k extends AbstractC0503e {

    /* renamed from: u, reason: collision with root package name */
    public final C0502d f8060u;

    /* renamed from: v, reason: collision with root package name */
    public x f8061v;
    public long w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f8062x;

    public k(Y.h hVar, Y.l lVar, C0095p c0095p, int i4, Object obj, C0502d c0502d) {
        super(hVar, lVar, 2, c0095p, i4, obj, -9223372036854775807L, -9223372036854775807L);
        this.f8060u = c0502d;
    }

    @Override // u0.k
    public final void b() {
        if (this.w == 0) {
            this.f8060u.a(this.f8061v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            Y.l a4 = this.f8021m.a(this.w);
            B b4 = this.f8027t;
            y0.l lVar = new y0.l(b4, a4.f3033e, b4.b(a4));
            while (!this.f8062x) {
                try {
                    int l4 = this.f8060u.f8012l.l(lVar, C0502d.f8011v);
                    boolean z4 = false;
                    W.a.j(l4 != 1);
                    if (l4 == 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        break;
                    }
                } finally {
                    this.w = lVar.f9089o - this.f8021m.f3033e;
                }
            }
        } finally {
            AbstractC0110a.m(this.f8027t);
        }
    }

    @Override // u0.k
    public final void c() {
        this.f8062x = true;
    }
}
