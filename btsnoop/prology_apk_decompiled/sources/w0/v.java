package w0;

import C.C0016c;
import W.y;
import a0.C0118H;
import b0.C0177a;
import c0.C0215n;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0215n f8883l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8884m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f8885n;

    public /* synthetic */ v(C0215n c0215n, Object obj, long j4) {
        this.f8883l = c0215n;
        this.f8884m = obj;
        this.f8885n = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0215n c0215n = this.f8883l;
        c0215n.getClass();
        int i4 = y.f2709a;
        C0118H c0118h = c0215n.f4632b.f3204a;
        b0.e eVar = c0118h.f3257r;
        C0177a J = eVar.J();
        long j4 = this.f8885n;
        Object obj = this.f8884m;
        eVar.K(J, 26, new B2.x(J, obj, j4));
        if (c0118h.f3222O == obj) {
            c0118h.f3251l.e(26, new C0016c(16));
        }
    }
}
