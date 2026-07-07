package V2;

import B2.AbstractC0007h;
import T.C0095p;
import T.d0;
import a0.C0118H;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends T2.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f2638p;

    @Override // T2.a
    public final void a() {
        C0118H c0118h = (C0118H) this.f2427n;
        c0118h.U();
        d0 d0Var = c0118h.f3238c0;
        int i4 = d0Var.f2231a;
        int i5 = 1;
        int i6 = d0Var.f2232b;
        if (i4 != 0 && i6 != 0 && !this.f2638p) {
            c0118h.U();
            C0095p c0095p = c0118h.f3220M;
            Objects.requireNonNull(c0095p);
            try {
                i5 = AbstractC0007h.a(c0095p.f2333v);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f2428o.b(i4, i6, c0118h.v(), AbstractC0007h.g(i5));
    }
}
