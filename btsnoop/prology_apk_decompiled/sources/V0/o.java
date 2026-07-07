package V0;

import B2.AbstractC0007h;
import T.C0094o;
import T.C0095p;
import T.H;
import T.InterfaceC0089j;
import W.r;
import W.y;
import java.io.EOFException;
import y0.E;
import y0.F;

/* loaded from: classes.dex */
public final class o implements F {

    /* renamed from: a, reason: collision with root package name */
    public final F f2629a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2630b;

    /* renamed from: g, reason: collision with root package name */
    public l f2635g;

    /* renamed from: h, reason: collision with root package name */
    public C0095p f2636h;

    /* renamed from: d, reason: collision with root package name */
    public int f2632d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2633e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f2634f = y.f2714f;

    /* renamed from: c, reason: collision with root package name */
    public final r f2631c = new r();

    public o(F f4, j jVar) {
        this.f2629a = f4;
        this.f2630b = jVar;
    }

    @Override // y0.F
    public final void a(r rVar, int i4, int i5) {
        if (this.f2635g == null) {
            this.f2629a.a(rVar, i4, i5);
            return;
        }
        e(i4);
        rVar.f(this.f2634f, this.f2633e, i4);
        this.f2633e += i4;
    }

    @Override // y0.F
    public final void b(long j4, int i4, int i5, int i6, E e4) {
        if (this.f2635g == null) {
            this.f2629a.b(j4, i4, i5, i6, e4);
            return;
        }
        W.a.d("DRM on subtitles is not supported", e4 == null);
        int i7 = (this.f2633e - i6) - i5;
        this.f2635g.h(this.f2634f, i7, i5, k.f2620c, new n(this, j4, i4));
        int i8 = i7 + i5;
        this.f2632d = i8;
        if (i8 == this.f2633e) {
            this.f2632d = 0;
            this.f2633e = 0;
        }
    }

    @Override // y0.F
    public final void c(C0095p c0095p) {
        c0095p.f2325m.getClass();
        String str = c0095p.f2325m;
        W.a.e(H.g(str) == 3);
        boolean equals = c0095p.equals(this.f2636h);
        j jVar = this.f2630b;
        if (!equals) {
            this.f2636h = c0095p;
            this.f2635g = jVar.o(c0095p) ? jVar.d(c0095p) : null;
        }
        l lVar = this.f2635g;
        F f4 = this.f2629a;
        if (lVar == null) {
            f4.c(c0095p);
            return;
        }
        C0094o a4 = c0095p.a();
        a4.f2290l = H.l("application/x-media3-cues");
        a4.f2287i = str;
        a4.f2295q = Long.MAX_VALUE;
        a4.f2275F = jVar.e(c0095p);
        AbstractC0007h.q(a4, f4);
    }

    @Override // y0.F
    public final int d(InterfaceC0089j interfaceC0089j, int i4, boolean z4) {
        if (this.f2635g == null) {
            return this.f2629a.d(interfaceC0089j, i4, z4);
        }
        e(i4);
        int read = interfaceC0089j.read(this.f2634f, this.f2633e, i4);
        if (read != -1) {
            this.f2633e += read;
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    public final void e(int i4) {
        int length = this.f2634f.length;
        int i5 = this.f2633e;
        if (length - i5 >= i4) {
            return;
        }
        int i6 = i5 - this.f2632d;
        int max = Math.max(i6 * 2, i4 + i6);
        byte[] bArr = this.f2634f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f2632d, bArr2, 0, i6);
        this.f2632d = 0;
        this.f2633e = i6;
        this.f2634f = bArr2;
    }
}
