package e1;

import T.C0098t;
import T.I;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class E implements y0.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f5119a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5120b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5121c;

    /* renamed from: d, reason: collision with root package name */
    public final W.r f5122d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f5123e;

    /* renamed from: f, reason: collision with root package name */
    public final C0262f f5124f;

    /* renamed from: g, reason: collision with root package name */
    public final V0.j f5125g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f5126h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f5127i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f5128j;

    /* renamed from: k, reason: collision with root package name */
    public final y f5129k;

    /* renamed from: l, reason: collision with root package name */
    public D0.b f5130l;

    /* renamed from: m, reason: collision with root package name */
    public y0.q f5131m;

    /* renamed from: n, reason: collision with root package name */
    public int f5132n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5133o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5134p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5135q;

    /* renamed from: r, reason: collision with root package name */
    public H f5136r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f5137t;

    public E(int i4, int i5, V0.j jVar, W.w wVar, C0262f c0262f) {
        this.f5124f = c0262f;
        this.f5119a = i4;
        this.f5120b = i5;
        this.f5125g = jVar;
        if (i4 == 1 || i4 == 2) {
            this.f5121c = Collections.singletonList(wVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f5121c = arrayList;
            arrayList.add(wVar);
        }
        this.f5122d = new W.r(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f5127i = sparseBooleanArray;
        this.f5128j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f5126h = sparseArray;
        this.f5123e = new SparseIntArray();
        this.f5129k = new y(1);
        this.f5131m = y0.q.f9103k;
        this.f5137t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i6 = 0; i6 < size; i6++) {
            sparseArray.put(sparseArray2.keyAt(i6), (H) sparseArray2.valueAt(i6));
        }
        sparseArray.put(0, new C(new Y.x(this)));
        this.f5136r = null;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        D0.b bVar;
        long j6;
        W.a.j(this.f5119a != 2);
        List list = this.f5121c;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            W.w wVar = (W.w) list.get(i4);
            synchronized (wVar) {
                j6 = wVar.f2705b;
            }
            boolean z4 = j6 == -9223372036854775807L;
            if (!z4) {
                long d4 = wVar.d();
                z4 = (d4 == -9223372036854775807L || d4 == 0 || d4 == j5) ? false : true;
            }
            if (z4) {
                wVar.f(j5);
            }
        }
        if (j5 != 0 && (bVar = this.f5130l) != null) {
            bVar.d(j5);
        }
        this.f5122d.D(0);
        this.f5123e.clear();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f5126h;
            if (i5 >= sparseArray.size()) {
                this.s = 0;
                return;
            } else {
                ((H) sparseArray.valueAt(i5)).b();
                i5++;
            }
        }
    }

    @Override // y0.o
    public final void g(y0.q qVar) {
        if ((this.f5120b & 1) == 0) {
            qVar = new android.support.v4.media.session.t(qVar, this.f5125g);
        }
        this.f5131m = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(y0.p r7) {
        /*
            r6 = this;
            W.r r0 = r6.f5122d
            byte[] r0 = r0.f2694a
            y0.l r7 = (y0.l) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.p(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.e(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.E.k(y0.p):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v22, types: [y0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [P2.a, y0.i, java.lang.Object] */
    @Override // y0.o
    public final int l(y0.p pVar, C0098t c0098t) {
        ?? r22;
        int i4;
        long j4;
        int i5;
        int i6;
        int i7;
        long j5;
        long j6;
        long j7 = ((y0.l) pVar).f9088n;
        int i8 = this.f5119a;
        Object[] objArr = i8 == 2;
        if (this.f5133o) {
            y yVar = this.f5129k;
            if (j7 != -1 && objArr != true && !yVar.f5419d) {
                int i9 = this.f5137t;
                if (i9 <= 0) {
                    yVar.a((y0.l) pVar);
                    return 0;
                }
                boolean z4 = yVar.f5421f;
                W.r rVar = yVar.f5418c;
                if (!z4) {
                    y0.l lVar = (y0.l) pVar;
                    long j8 = lVar.f9088n;
                    int min = (int) Math.min(112800, j8);
                    long j9 = j8 - min;
                    if (lVar.f9089o == j9) {
                        rVar.D(min);
                        lVar.f9091q = 0;
                        lVar.p(rVar.f2694a, 0, min, false);
                        int i10 = rVar.f2695b;
                        int i11 = rVar.f2696c;
                        int i12 = i11 - 188;
                        while (true) {
                            if (i12 < i10) {
                                j6 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = rVar.f2694a;
                            int i13 = -4;
                            int i14 = 0;
                            while (true) {
                                if (i13 > 4) {
                                    break;
                                }
                                int i15 = (i13 * 188) + i12;
                                if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                                    i14 = 0;
                                } else {
                                    i14++;
                                    if (i14 == 5) {
                                        long I3 = AbstractC0462a.I(rVar, i12, i9);
                                        if (I3 != -9223372036854775807L) {
                                            j6 = I3;
                                            break;
                                        }
                                    }
                                }
                                i13++;
                            }
                            i12--;
                        }
                        yVar.f5423h = j6;
                        yVar.f5421f = true;
                        return 0;
                    }
                    c0098t.f2352a = j9;
                } else {
                    if (yVar.f5423h == -9223372036854775807L) {
                        yVar.a((y0.l) pVar);
                        return 0;
                    }
                    if (yVar.f5420e) {
                        long j10 = yVar.f5422g;
                        if (j10 == -9223372036854775807L) {
                            yVar.a((y0.l) pVar);
                            return 0;
                        }
                        W.w wVar = yVar.f5417b;
                        yVar.f5424i = wVar.c(yVar.f5423h) - wVar.b(j10);
                        yVar.a((y0.l) pVar);
                        return 0;
                    }
                    y0.l lVar2 = (y0.l) pVar;
                    int min2 = (int) Math.min(112800, lVar2.f9088n);
                    long j11 = 0;
                    if (lVar2.f9089o == j11) {
                        rVar.D(min2);
                        lVar2.f9091q = 0;
                        lVar2.p(rVar.f2694a, 0, min2, false);
                        int i16 = rVar.f2695b;
                        int i17 = rVar.f2696c;
                        while (true) {
                            if (i16 >= i17) {
                                j5 = -9223372036854775807L;
                                break;
                            }
                            if (rVar.f2694a[i16] == 71) {
                                long I4 = AbstractC0462a.I(rVar, i16, i9);
                                if (I4 != -9223372036854775807L) {
                                    j5 = I4;
                                    break;
                                }
                            }
                            i16++;
                        }
                        yVar.f5422g = j5;
                        yVar.f5420e = true;
                        return 0;
                    }
                    c0098t.f2352a = j11;
                }
                return 1;
            }
            if (this.f5134p) {
                i4 = i8;
                j4 = j7;
            } else {
                this.f5134p = true;
                long j12 = yVar.f5424i;
                if (j12 != -9223372036854775807L) {
                    int i18 = this.f5137t;
                    ?? obj = new Object();
                    W.w wVar2 = yVar.f5417b;
                    ?? obj2 = new Object();
                    obj2.f1500l = i18;
                    obj2.f1501m = wVar2;
                    obj2.f1502n = new W.r();
                    i4 = i8;
                    j4 = j7;
                    D0.b bVar = new D0.b(obj, obj2, j12, j12 + 1, 0L, j7, 188L, 940);
                    this.f5130l = bVar;
                    this.f5131m.t(bVar.f421a);
                } else {
                    i4 = i8;
                    j4 = j7;
                    this.f5131m.t(new A0.b(j12));
                }
            }
            if (this.f5135q) {
                this.f5135q = false;
                b(0L, 0L);
                if (((y0.l) pVar).f9089o != 0) {
                    c0098t.f2352a = 0L;
                    return 1;
                }
            }
            r22 = 1;
            r22 = 1;
            D0.b bVar2 = this.f5130l;
            if (bVar2 != null && bVar2.f423c != null) {
                return bVar2.b((y0.l) pVar, c0098t);
            }
        } else {
            r22 = 1;
            i4 = i8;
            j4 = j7;
        }
        W.r rVar2 = this.f5122d;
        byte[] bArr2 = rVar2.f2694a;
        if (9400 - rVar2.f2695b < 188) {
            int a4 = rVar2.a();
            if (a4 > 0) {
                System.arraycopy(bArr2, rVar2.f2695b, bArr2, 0, a4);
            }
            rVar2.E(bArr2, a4);
        }
        while (true) {
            int a5 = rVar2.a();
            SparseArray sparseArray = this.f5126h;
            if (a5 >= 188) {
                int i19 = rVar2.f2695b;
                int i20 = rVar2.f2696c;
                byte[] bArr3 = rVar2.f2694a;
                int i21 = i19;
                while (i21 < i20 && bArr3[i21] != 71) {
                    i21++;
                }
                rVar2.G(i21);
                int i22 = i21 + 188;
                if (i22 > i20) {
                    int i23 = (i21 - i19) + this.s;
                    this.s = i23;
                    i5 = i4;
                    i6 = 2;
                    if (i5 == 2 && i23 > 376) {
                        throw I.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                    i7 = 0;
                } else {
                    i5 = i4;
                    i6 = 2;
                    i7 = 0;
                    this.s = 0;
                }
                int i24 = rVar2.f2696c;
                if (i22 > i24) {
                    return i7;
                }
                int h4 = rVar2.h();
                if ((8388608 & h4) != 0) {
                    rVar2.G(i22);
                    return i7;
                }
                int i25 = (4194304 & h4) != 0 ? r22 : 0;
                int i26 = (2096896 & h4) >> 8;
                boolean z5 = (h4 & 32) != 0 ? r22 : false;
                H h5 = (h4 & 16) != 0 ? (H) sparseArray.get(i26) : null;
                if (h5 == null) {
                    rVar2.G(i22);
                    return 0;
                }
                if (i5 != i6) {
                    int i27 = h4 & 15;
                    SparseIntArray sparseIntArray = this.f5123e;
                    int i28 = sparseIntArray.get(i26, i27 - 1);
                    sparseIntArray.put(i26, i27);
                    if (i28 == i27) {
                        rVar2.G(i22);
                        return 0;
                    }
                    if (i27 != ((i28 + r22) & 15)) {
                        h5.b();
                    }
                }
                if (z5) {
                    int u4 = rVar2.u();
                    i25 |= (rVar2.u() & 64) != 0 ? i6 : 0;
                    rVar2.H(u4 - r22);
                }
                boolean z6 = this.f5133o;
                if (i5 == i6 || z6 || !this.f5128j.get(i26, false)) {
                    rVar2.F(i22);
                    h5.c(i25, rVar2);
                    rVar2.F(i24);
                }
                if (i5 != i6 && !z6 && this.f5133o && j4 != -1) {
                    this.f5135q = r22;
                }
                rVar2.G(i22);
                return 0;
            }
            int i29 = rVar2.f2696c;
            int read = ((y0.l) pVar).read(bArr2, i29, 9400 - i29);
            if (read == -1) {
                for (int i30 = 0; i30 < sparseArray.size(); i30++) {
                    H h6 = (H) sparseArray.valueAt(i30);
                    if (h6 instanceof x) {
                        x xVar = (x) h6;
                        if (xVar.f5406c == 3 && xVar.f5413j == -1 && (objArr == false || !(xVar.f5404a instanceof k))) {
                            xVar.c(r22, new W.r());
                        }
                    }
                }
                return -1;
            }
            rVar2.F(i29 + read);
        }
    }

    @Override // y0.o
    public final void release() {
    }
}
