package r0;

import T.C0095p;
import T.InterfaceC0089j;
import W.r;
import W.y;
import y0.E;
import y0.F;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501c implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f8004a;

    /* renamed from: b, reason: collision with root package name */
    public final C0095p f8005b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.n f8006c = new y0.n();

    /* renamed from: d, reason: collision with root package name */
    public C0095p f8007d;

    /* renamed from: e, reason: collision with root package name */
    public F f8008e;

    /* renamed from: f, reason: collision with root package name */
    public long f8009f;

    public C0501c(int i4, int i5, C0095p c0095p) {
        this.f8004a = i5;
        this.f8005b = c0095p;
    }

    @Override // y0.F
    public final void a(r rVar, int i4, int i5) {
        F f4 = this.f8008e;
        int i6 = y.f2709a;
        f4.a(rVar, i4, 0);
    }

    @Override // y0.F
    public final void b(long j4, int i4, int i5, int i6, E e4) {
        long j5 = this.f8009f;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            this.f8008e = this.f8006c;
        }
        F f4 = this.f8008e;
        int i7 = y.f2709a;
        f4.b(j4, i4, i5, i6, e4);
    }

    @Override // y0.F
    public final void c(C0095p c0095p) {
        C0095p c0095p2 = this.f8005b;
        if (c0095p2 != null) {
            c0095p = c0095p.d(c0095p2);
        }
        this.f8007d = c0095p;
        F f4 = this.f8008e;
        int i4 = y.f2709a;
        f4.c(c0095p);
    }

    @Override // y0.F
    public final int d(InterfaceC0089j interfaceC0089j, int i4, boolean z4) {
        F f4 = this.f8008e;
        int i5 = y.f2709a;
        return f4.d(interfaceC0089j, i4, z4);
    }
}
