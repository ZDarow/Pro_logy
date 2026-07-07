package g0;

import T.C0092m;
import T.C0094o;
import T.C0095p;
import T.F;
import T.H;
import W.w;
import W.y;
import a.AbstractC0110a;
import android.net.Uri;
import android.text.TextUtils;
import e1.C0257a;
import e1.C0259c;
import e1.C0260d;
import e1.C0262f;
import e1.E;
import f2.G;
import f2.I;
import f2.c0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class k extends r0.l {

    /* renamed from: W, reason: collision with root package name */
    public static final AtomicInteger f5676W = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final Y.h f5677A;

    /* renamed from: B, reason: collision with root package name */
    public final Y.l f5678B;

    /* renamed from: C, reason: collision with root package name */
    public final C0306b f5679C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f5680D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f5681E;

    /* renamed from: F, reason: collision with root package name */
    public final w f5682F;

    /* renamed from: G, reason: collision with root package name */
    public final C0307c f5683G;

    /* renamed from: H, reason: collision with root package name */
    public final List f5684H;

    /* renamed from: I, reason: collision with root package name */
    public final C0092m f5685I;
    public final M0.h J;

    /* renamed from: K, reason: collision with root package name */
    public final W.r f5686K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f5687L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f5688M;

    /* renamed from: N, reason: collision with root package name */
    public C0306b f5689N;

    /* renamed from: O, reason: collision with root package name */
    public r f5690O;

    /* renamed from: P, reason: collision with root package name */
    public int f5691P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5692Q;

    /* renamed from: R, reason: collision with root package name */
    public volatile boolean f5693R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5694S;

    /* renamed from: T, reason: collision with root package name */
    public c0 f5695T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f5696U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f5697V;

    /* renamed from: v, reason: collision with root package name */
    public final int f5698v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public final Uri f5699x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f5700y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5701z;

    public k(C0307c c0307c, Y.h hVar, Y.l lVar, C0095p c0095p, boolean z4, Y.h hVar2, Y.l lVar2, boolean z5, Uri uri, List list, int i4, Object obj, long j4, long j5, long j6, int i5, boolean z6, int i6, boolean z7, boolean z8, w wVar, C0092m c0092m, C0306b c0306b, M0.h hVar3, W.r rVar, boolean z9, b0.l lVar3) {
        super(hVar, lVar, c0095p, i4, obj, j4, j5, j6);
        this.f5687L = z4;
        this.f5701z = i5;
        this.f5697V = z6;
        this.w = i6;
        this.f5678B = lVar2;
        this.f5677A = hVar2;
        this.f5692Q = lVar2 != null;
        this.f5688M = z5;
        this.f5699x = uri;
        this.f5680D = z8;
        this.f5682F = wVar;
        this.f5681E = z7;
        this.f5683G = c0307c;
        this.f5684H = list;
        this.f5685I = c0092m;
        this.f5679C = c0306b;
        this.J = hVar3;
        this.f5686K = rVar;
        this.f5700y = z9;
        G g4 = I.f5510m;
        this.f5695T = c0.f5550p;
        this.f5698v = f5676W.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (U1.a.I(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // u0.k
    public final void b() {
        C0306b c0306b;
        this.f5690O.getClass();
        if (this.f5689N == null && (c0306b = this.f5679C) != null) {
            y0.o d4 = c0306b.f5640a.d();
            if ((d4 instanceof E) || (d4 instanceof S0.n)) {
                this.f5689N = this.f5679C;
                this.f5692Q = false;
            }
        }
        if (this.f5692Q) {
            Y.h hVar = this.f5677A;
            hVar.getClass();
            Y.l lVar = this.f5678B;
            lVar.getClass();
            e(hVar, lVar, this.f5688M, false);
            this.f5691P = 0;
            this.f5692Q = false;
        }
        if (this.f5693R) {
            return;
        }
        if (!this.f5681E) {
            e(this.f8027t, this.f8021m, this.f5687L, true);
        }
        this.f5694S = !this.f5693R;
    }

    @Override // u0.k
    public final void c() {
        this.f5693R = true;
    }

    @Override // r0.l
    public final boolean d() {
        throw null;
    }

    public final void e(Y.h hVar, Y.l lVar, boolean z4, boolean z5) {
        Y.l a4;
        long j4;
        long j5;
        if (z4) {
            r0 = this.f5691P != 0;
            a4 = lVar;
        } else {
            a4 = lVar.a(this.f5691P);
        }
        try {
            y0.l h4 = h(hVar, a4, z5);
            if (r0) {
                h4.e(this.f5691P);
            }
            while (!this.f5693R) {
                try {
                    try {
                        if (this.f5689N.f5640a.l(h4, C0306b.f5639f) != 0) {
                            break;
                        }
                    } catch (EOFException e4) {
                        if ((this.f8023o.f2318f & 16384) == 0) {
                            throw e4;
                        }
                        this.f5689N.f5640a.b(0L, 0L);
                        j4 = h4.f9089o;
                        j5 = lVar.f3033e;
                    }
                } catch (Throwable th) {
                    this.f5691P = (int) (h4.f9089o - lVar.f3033e);
                    throw th;
                }
            }
            j4 = h4.f9089o;
            j5 = lVar.f3033e;
            this.f5691P = (int) (j4 - j5);
        } finally {
            AbstractC0110a.m(hVar);
        }
    }

    public final int g(int i4) {
        W.a.j(!this.f5700y);
        if (i4 >= this.f5695T.size()) {
            return 0;
        }
        return ((Integer) this.f5695T.get(i4)).intValue();
    }

    public final y0.l h(Y.h hVar, Y.l lVar, boolean z4) {
        int i4;
        long j4;
        long j5;
        w wVar;
        long j6;
        C0306b c0306b;
        ArrayList arrayList;
        y0.o c0257a;
        boolean z5;
        V0.j jVar;
        boolean z6;
        int i5;
        V0.j jVar2;
        int i6;
        y0.o dVar;
        long b4 = hVar.b(lVar);
        long j7 = this.f8026r;
        w wVar2 = this.f5682F;
        if (z4) {
            try {
                wVar2.g(j7, this.f5680D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e4) {
                throw new IOException(e4);
            }
        }
        y0.l lVar2 = new y0.l(hVar, lVar.f3033e, b4);
        if (this.f5689N == null) {
            W.r rVar = this.f5686K;
            lVar2.f9091q = 0;
            try {
                rVar.D(10);
                lVar2.p(rVar.f2694a, 0, 10, false);
                if (rVar.x() == 4801587) {
                    rVar.H(3);
                    int t4 = rVar.t();
                    int i7 = t4 + 10;
                    byte[] bArr = rVar.f2694a;
                    if (i7 > bArr.length) {
                        rVar.D(i7);
                        System.arraycopy(bArr, 0, rVar.f2694a, 0, 10);
                    }
                    lVar2.p(rVar.f2694a, 10, t4, false);
                    T.G d02 = this.J.d0(rVar.f2694a, t4);
                    if (d02 != null) {
                        for (F f4 : d02.f2118l) {
                            if (f4 instanceof M0.m) {
                                M0.m mVar = (M0.m) f4;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f1152m)) {
                                    System.arraycopy(mVar.f1153n, 0, rVar.f2694a, 0, 8);
                                    rVar.G(0);
                                    rVar.F(8);
                                    j4 = rVar.o() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j4 = -9223372036854775807L;
            lVar2.f9091q = 0;
            C0306b c0306b2 = this.f5679C;
            if (c0306b2 == null) {
                Map y4 = hVar.y();
                C0307c c0307c = this.f5683G;
                c0307c.getClass();
                C0095p c0095p = this.f8023o;
                int A4 = AbstractC0462a.A(c0095p.f2325m);
                List list = (List) y4.get("Content-Type");
                int A5 = AbstractC0462a.A((list == null || list.isEmpty()) ? null : (String) list.get(0));
                int B4 = AbstractC0462a.B(lVar.f3029a);
                ArrayList arrayList2 = new ArrayList(7);
                C0307c.a(A4, arrayList2);
                C0307c.a(A5, arrayList2);
                C0307c.a(B4, arrayList2);
                int[] iArr = C0307c.f5645d;
                int i8 = 0;
                for (int i9 = 7; i8 < i9; i9 = 7) {
                    C0307c.a(iArr[i8], arrayList2);
                    i8++;
                }
                lVar2.f9091q = 0;
                int i10 = 0;
                y0.o oVar = null;
                while (true) {
                    int size = arrayList2.size();
                    w wVar3 = this.f5682F;
                    if (i10 >= size) {
                        j5 = j7;
                        wVar = wVar2;
                        j6 = j4;
                        i4 = 0;
                        oVar.getClass();
                        c0306b = new C0306b(oVar, c0095p, wVar3, c0307c.f5646b, c0307c.f5647c);
                        break;
                    }
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    j5 = j7;
                    if (intValue == 0) {
                        wVar = wVar2;
                        j6 = j4;
                        arrayList = arrayList2;
                        c0257a = new C0257a();
                    } else if (intValue == 1) {
                        wVar = wVar2;
                        j6 = j4;
                        arrayList = arrayList2;
                        c0257a = new C0259c();
                    } else if (intValue == 2) {
                        wVar = wVar2;
                        j6 = j4;
                        arrayList = arrayList2;
                        c0257a = new C0260d(0);
                    } else if (intValue != 7) {
                        V0.j jVar3 = V0.j.f2619c;
                        List list2 = this.f5684H;
                        arrayList = arrayList2;
                        if (intValue == 8) {
                            wVar = wVar2;
                            j6 = j4;
                            V0.j jVar4 = c0307c.f5646b;
                            boolean z7 = c0307c.f5647c;
                            T.G g4 = c0095p.f2323k;
                            if (g4 != null) {
                                int i11 = 0;
                                V0.j jVar5 = jVar4;
                                while (true) {
                                    F[] fArr = g4.f2118l;
                                    jVar = jVar5;
                                    if (i11 >= fArr.length) {
                                        break;
                                    }
                                    F f5 = fArr[i11];
                                    if (f5 instanceof t) {
                                        z6 = !((t) f5).f5803n.isEmpty();
                                        break;
                                    }
                                    i11++;
                                    jVar5 = jVar;
                                }
                            } else {
                                jVar = jVar4;
                            }
                            z6 = false;
                            int i12 = z6 ? 4 : 0;
                            if (z7) {
                                i5 = i12;
                                jVar2 = jVar;
                            } else {
                                i5 = i12 | 32;
                                jVar2 = jVar3;
                            }
                            if (list2 == null) {
                                list2 = c0.f5550p;
                            }
                            c0257a = new S0.n(jVar2, i5, wVar3, null, list2, null);
                        } else if (intValue == 11) {
                            wVar = wVar2;
                            V0.j jVar6 = c0307c.f5646b;
                            boolean z8 = c0307c.f5647c;
                            if (list2 != null) {
                                i6 = 48;
                            } else {
                                C0094o c0094o = new C0094o();
                                c0094o.f2290l = H.l("application/cea-608");
                                list2 = Collections.singletonList(new C0095p(c0094o));
                                i6 = 16;
                            }
                            String str = c0095p.f2322j;
                            j6 = j4;
                            if (!TextUtils.isEmpty(str)) {
                                if (H.a(str, "audio/mp4a-latm") == null) {
                                    i6 |= 2;
                                }
                                if (H.a(str, "video/avc") == null) {
                                    i6 |= 4;
                                }
                            }
                            c0257a = new E(2, !z8 ? 1 : 0, !z8 ? jVar3 : jVar6, wVar3, new C0262f(i6, list2));
                        } else if (intValue != 13) {
                            wVar = wVar2;
                            j6 = j4;
                            c0257a = null;
                        } else {
                            wVar = wVar2;
                            c0257a = new u(c0095p.f2316d, wVar3, c0307c.f5646b, c0307c.f5647c);
                            j6 = j4;
                        }
                    } else {
                        wVar = wVar2;
                        j6 = j4;
                        arrayList = arrayList2;
                        c0257a = new R0.d(0L, 0);
                    }
                    c0257a.getClass();
                    try {
                        z5 = c0257a.k(lVar2);
                        i4 = 0;
                        lVar2.f9091q = 0;
                    } catch (EOFException unused3) {
                        i4 = 0;
                        lVar2.f9091q = 0;
                        z5 = false;
                    } catch (Throwable th) {
                        lVar2.f9091q = 0;
                        throw th;
                    }
                    if (z5) {
                        c0306b = new C0306b(c0257a, c0095p, wVar3, c0307c.f5646b, c0307c.f5647c);
                        break;
                    }
                    if (oVar == null && (intValue == A4 || intValue == A5 || intValue == B4 || intValue == 11)) {
                        oVar = c0257a;
                    }
                    i10++;
                    arrayList2 = arrayList;
                    j7 = j5;
                    wVar2 = wVar;
                    j4 = j6;
                }
            } else {
                y0.o oVar2 = c0306b2.f5640a;
                y0.o d4 = oVar2.d();
                W.a.j(!((d4 instanceof E) || (d4 instanceof S0.n)));
                W.a.i("Can't recreate wrapped extractors. Outer type: " + oVar2.getClass(), oVar2.d() == oVar2);
                boolean z9 = oVar2 instanceof u;
                L1.g gVar = c0306b2.f5643d;
                if (z9) {
                    dVar = new u(c0306b2.f5641b.f2316d, c0306b2.f5642c, gVar, c0306b2.f5644e);
                } else if (oVar2 instanceof C0260d) {
                    dVar = new C0260d(0);
                } else if (oVar2 instanceof C0257a) {
                    dVar = new C0257a();
                } else if (oVar2 instanceof C0259c) {
                    dVar = new C0259c();
                } else {
                    if (!(oVar2 instanceof R0.d)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(oVar2.getClass().getSimpleName()));
                    }
                    dVar = new R0.d(0);
                }
                c0306b = new C0306b(dVar, c0306b2.f5641b, c0306b2.f5642c, gVar, c0306b2.f5644e);
                j5 = j7;
                wVar = wVar2;
                j6 = j4;
                i4 = 0;
            }
            this.f5689N = c0306b;
            y0.o d5 = c0306b.f5640a.d();
            if ((((d5 instanceof C0260d) || (d5 instanceof C0257a) || (d5 instanceof C0259c) || (d5 instanceof R0.d)) ? 1 : i4) != 0) {
                r rVar2 = this.f5690O;
                long b5 = j6 != -9223372036854775807L ? wVar.b(j6) : j5;
                if (rVar2.f5779g0 != b5) {
                    rVar2.f5779g0 = b5;
                    q[] qVarArr = rVar2.f5754G;
                    int length = qVarArr.length;
                    for (int i13 = i4; i13 < length; i13++) {
                        q qVar = qVarArr[i13];
                        if (qVar.f7782F != b5) {
                            qVar.f7782F = b5;
                            qVar.f7807z = true;
                        }
                    }
                }
            } else {
                r rVar3 = this.f5690O;
                if (rVar3.f5779g0 != 0) {
                    rVar3.f5779g0 = 0L;
                    q[] qVarArr2 = rVar3.f5754G;
                    int length2 = qVarArr2.length;
                    for (int i14 = i4; i14 < length2; i14++) {
                        q qVar2 = qVarArr2[i14];
                        if (qVar2.f7782F != 0) {
                            qVar2.f7782F = 0L;
                            qVar2.f7807z = true;
                        }
                    }
                }
            }
            this.f5690O.f5756I.clear();
            this.f5689N.f5640a.g(this.f5690O);
        } else {
            i4 = 0;
        }
        r rVar4 = this.f5690O;
        C0092m c0092m = rVar4.f5780h0;
        C0092m c0092m2 = this.f5685I;
        if (!y.a(c0092m, c0092m2)) {
            rVar4.f5780h0 = c0092m2;
            while (true) {
                q[] qVarArr3 = rVar4.f5754G;
                if (i4 >= qVarArr3.length) {
                    break;
                }
                if (rVar4.f5772Z[i4]) {
                    q qVar3 = qVarArr3[i4];
                    qVar3.f5746I = c0092m2;
                    qVar3.f7807z = true;
                }
                i4++;
            }
        }
        return lVar2;
    }
}
