package a0;

import android.content.Context;
import java.util.HashMap;
import q0.C0487t;

/* renamed from: a0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0135o implements e2.j {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f3559m;

    public /* synthetic */ C0135o(Context context, int i4) {
        this.f3558l = i4;
        this.f3559m = context;
    }

    @Override // e2.j
    public final Object get() {
        u0.g gVar;
        switch (this.f3558l) {
            case 0:
                return new C0132l(this.f3559m);
            case 1:
                return new C0487t(new B1.d(this.f3559m), new y0.m());
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new t0.q(this.f3559m);
            default:
                Context context = this.f3559m;
                f2.c0 c0Var = u0.g.f8507n;
                synchronized (u0.g.class) {
                    try {
                        if (u0.g.f8512t == null) {
                            j0.c cVar = new j0.c(context);
                            u0.g.f8512t = new u0.g((Context) cVar.f6795n, (HashMap) cVar.f6796o, cVar.f6793l, (W.t) cVar.f6797p, cVar.f6794m);
                        }
                        gVar = u0.g.f8512t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gVar;
        }
    }
}
