package U2;

import B2.AbstractC0007h;
import T.C0095p;
import a0.C0118H;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends T2.a {
    @Override // T2.a
    public final void a() {
        int i4;
        C0118H c0118h = (C0118H) this.f2427n;
        c0118h.U();
        C0095p c0095p = c0118h.f3220M;
        Objects.requireNonNull(c0095p);
        int a4 = AbstractC0007h.a(c0095p.f2333v);
        int i5 = c0095p.s;
        int i6 = c0095p.f2331t;
        if (a4 == 2 || a4 == 4) {
            a4 = AbstractC0007h.a(0);
            i4 = i5;
            i5 = i6;
        } else {
            i4 = i6;
        }
        this.f2428o.b(i5, i4, c0118h.v(), AbstractC0007h.g(a4));
    }
}
