package V0;

import B2.x;
import T.C0094o;
import T.C0095p;
import T.C0098t;
import T.H;
import T.I;
import W.r;
import W.y;
import a.AbstractC0110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import y0.F;
import y0.p;
import y0.q;
import y0.w;

/* loaded from: classes.dex */
public final class h implements y0.o {

    /* renamed from: a, reason: collision with root package name */
    public final l f2608a;

    /* renamed from: b, reason: collision with root package name */
    public final C0095p f2609b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2610c;

    /* renamed from: f, reason: collision with root package name */
    public F f2613f;

    /* renamed from: g, reason: collision with root package name */
    public int f2614g;

    /* renamed from: h, reason: collision with root package name */
    public int f2615h;

    /* renamed from: i, reason: collision with root package name */
    public long[] f2616i;

    /* renamed from: j, reason: collision with root package name */
    public long f2617j;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f2612e = y.f2714f;

    /* renamed from: d, reason: collision with root package name */
    public final r f2611d = new r();

    public h(l lVar, C0095p c0095p) {
        this.f2608a = lVar;
        C0094o a4 = c0095p.a();
        a4.f2290l = H.l("application/x-media3-cues");
        a4.f2287i = c0095p.f2325m;
        a4.f2275F = lVar.w();
        this.f2609b = new C0095p(a4);
        this.f2610c = new ArrayList();
        this.f2615h = 0;
        this.f2616i = y.f2715g;
        this.f2617j = -9223372036854775807L;
    }

    public final void a(g gVar) {
        W.a.k(this.f2613f);
        byte[] bArr = gVar.f2607m;
        int length = bArr.length;
        r rVar = this.f2611d;
        rVar.getClass();
        rVar.E(bArr, bArr.length);
        this.f2613f.a(rVar, length, 0);
        this.f2613f.b(gVar.f2606l, 1, length, 0, null);
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        int i4 = this.f2615h;
        W.a.j((i4 == 0 || i4 == 5) ? false : true);
        this.f2617j = j5;
        if (this.f2615h == 2) {
            this.f2615h = 1;
        }
        if (this.f2615h == 4) {
            this.f2615h = 3;
        }
    }

    @Override // y0.o
    public final void g(q qVar) {
        W.a.j(this.f2615h == 0);
        F v4 = qVar.v(0, 3);
        this.f2613f = v4;
        v4.c(this.f2609b);
        qVar.s();
        qVar.t(new w(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f2615h = 1;
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        return true;
    }

    @Override // y0.o
    public final int l(p pVar, C0098t c0098t) {
        int i4 = this.f2615h;
        W.a.j((i4 == 0 || i4 == 5) ? false : true);
        if (this.f2615h == 1) {
            int l4 = ((y0.l) pVar).f9088n != -1 ? AbstractC0110a.l(((y0.l) pVar).f9088n) : 1024;
            if (l4 > this.f2612e.length) {
                this.f2612e = new byte[l4];
            }
            this.f2614g = 0;
            this.f2615h = 2;
        }
        int i5 = this.f2615h;
        ArrayList arrayList = this.f2610c;
        if (i5 == 2) {
            byte[] bArr = this.f2612e;
            if (bArr.length == this.f2614g) {
                this.f2612e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f2612e;
            int i6 = this.f2614g;
            y0.l lVar = (y0.l) pVar;
            int read = lVar.read(bArr2, i6, bArr2.length - i6);
            if (read != -1) {
                this.f2614g += read;
            }
            long j4 = lVar.f9088n;
            if ((j4 != -1 && this.f2614g == j4) || read == -1) {
                try {
                    long j5 = this.f2617j;
                    this.f2608a.h(this.f2612e, 0, this.f2614g, j5 != -9223372036854775807L ? new k(j5, true) : k.f2620c, new x(10, this));
                    Collections.sort(arrayList);
                    this.f2616i = new long[arrayList.size()];
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        this.f2616i[i7] = ((g) arrayList.get(i7)).f2606l;
                    }
                    this.f2612e = y.f2714f;
                    this.f2615h = 4;
                } catch (RuntimeException e4) {
                    throw I.a(e4, "SubtitleParser failed.");
                }
            }
        }
        if (this.f2615h == 3) {
            if (((y0.l) pVar).l(((y0.l) pVar).f9088n != -1 ? AbstractC0110a.l(((y0.l) pVar).f9088n) : 1024) == -1) {
                long j6 = this.f2617j;
                for (int f4 = j6 == -9223372036854775807L ? 0 : y.f(this.f2616i, j6, true); f4 < arrayList.size(); f4++) {
                    a((g) arrayList.get(f4));
                }
                this.f2615h = 4;
            }
        }
        return this.f2615h == 4 ? -1 : 0;
    }

    @Override // y0.o
    public final void release() {
        if (this.f2615h == 5) {
            return;
        }
        this.f2608a.b();
        this.f2615h = 5;
    }
}
