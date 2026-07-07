package f1;

import a.AbstractC0110a;
import y0.F;
import y0.l;
import y0.o;
import y0.p;
import y0.q;

/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270d implements o {

    /* renamed from: a, reason: collision with root package name */
    public q f5482a;

    /* renamed from: b, reason: collision with root package name */
    public F f5483b;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0268b f5486e;

    /* renamed from: c, reason: collision with root package name */
    public int f5484c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f5485d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f5487f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f5488g = -1;

    @Override // y0.o
    public final void b(long j4, long j5) {
        this.f5484c = j4 == 0 ? 0 : 4;
        InterfaceC0268b interfaceC0268b = this.f5486e;
        if (interfaceC0268b != null) {
            interfaceC0268b.a(j5);
        }
    }

    @Override // y0.o
    public final void g(q qVar) {
        this.f5482a = qVar;
        this.f5483b = qVar.v(0, 1);
        qVar.s();
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        return AbstractC0110a.i((l) pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b9  */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r25, T.C0098t r26) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0270d.l(y0.p, T.t):int");
    }

    @Override // y0.o
    public final void release() {
    }
}
