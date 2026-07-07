package a0;

import T.C0094o;
import T.C0095p;
import b0.C0177a;

/* renamed from: a0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0114D implements W.h {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3202l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T.d0 f3203m;

    public /* synthetic */ C0114D(T.d0 d0Var) {
        this.f3203m = d0Var;
    }

    @Override // W.h
    public final void b(Object obj) {
        switch (this.f3202l) {
            case 0:
                ((T.M) obj).m(this.f3203m);
                return;
            default:
                b0.j jVar = (b0.j) obj;
                P2.a aVar = jVar.f4380o;
                T.d0 d0Var = this.f3203m;
                if (aVar != null) {
                    C0095p c0095p = (C0095p) aVar.f1501m;
                    if (c0095p.f2331t == -1) {
                        C0094o a4 = c0095p.a();
                        a4.f2296r = d0Var.f2231a;
                        a4.s = d0Var.f2232b;
                        jVar.f4380o = new P2.a(new C0095p(a4), aVar.f1500l, (String) aVar.f1502n);
                    }
                }
                int i4 = d0Var.f2231a;
                return;
        }
    }

    public /* synthetic */ C0114D(C0177a c0177a, T.d0 d0Var) {
        this.f3203m = d0Var;
    }
}
