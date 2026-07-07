package T0;

import T.C0094o;
import T.C0095p;
import T.G;
import T.H;
import T.I;
import T2.n;
import W.q;
import W.r;
import java.util.ArrayList;
import java.util.Arrays;
import w0.C0591a;
import y0.AbstractC0619b;
import y0.x;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: n, reason: collision with root package name */
    public j f2420n;

    /* renamed from: o, reason: collision with root package name */
    public int f2421o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2422p;

    /* renamed from: q, reason: collision with root package name */
    public x f2423q;

    /* renamed from: r, reason: collision with root package name */
    public C0591a f2424r;

    @Override // T0.i
    public final void a(long j4) {
        this.f2408g = j4;
        this.f2422p = j4 != 0;
        x xVar = this.f2423q;
        this.f2421o = xVar != null ? xVar.f9138e : 0;
    }

    @Override // T0.i
    public final long b(r rVar) {
        byte b4 = rVar.f2694a[0];
        if ((b4 & 1) == 1) {
            return -1L;
        }
        j jVar = this.f2420n;
        W.a.k(jVar);
        boolean z4 = ((n[]) jVar.f2419p)[(b4 >> 1) & (255 >>> (8 - jVar.f2415l))].f2455a;
        x xVar = (x) jVar.f2416m;
        int i4 = !z4 ? xVar.f9138e : xVar.f9139f;
        long j4 = this.f2422p ? (this.f2421o + i4) / 4 : 0;
        byte[] bArr = rVar.f2694a;
        int length = bArr.length;
        int i5 = rVar.f2696c + 4;
        if (length < i5) {
            byte[] copyOf = Arrays.copyOf(bArr, i5);
            rVar.E(copyOf, copyOf.length);
        } else {
            rVar.F(i5);
        }
        byte[] bArr2 = rVar.f2694a;
        int i6 = rVar.f2696c;
        bArr2[i6 - 4] = (byte) (j4 & 255);
        bArr2[i6 - 3] = (byte) ((j4 >>> 8) & 255);
        bArr2[i6 - 2] = (byte) ((j4 >>> 16) & 255);
        bArr2[i6 - 1] = (byte) ((j4 >>> 24) & 255);
        this.f2422p = true;
        this.f2421o = i4;
        return j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [T2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [y0.x, java.lang.Object] */
    @Override // T0.i
    public final boolean c(r rVar, long j4, B1.d dVar) {
        j jVar;
        x xVar;
        x xVar2;
        byte[] bArr;
        long j5;
        if (this.f2420n != null) {
            ((C0095p) dVar.f96m).getClass();
            return false;
        }
        x xVar3 = this.f2423q;
        int i4 = 4;
        if (xVar3 == null) {
            AbstractC0619b.w(1, rVar, false);
            rVar.m();
            int u4 = rVar.u();
            int m4 = rVar.m();
            int j6 = rVar.j();
            if (j6 <= 0) {
                j6 = -1;
            }
            int j7 = rVar.j();
            int i5 = j7 <= 0 ? -1 : j7;
            rVar.j();
            int u5 = rVar.u();
            int pow = (int) Math.pow(2.0d, u5 & 15);
            int pow2 = (int) Math.pow(2.0d, (u5 & 240) >> 4);
            rVar.u();
            ?? copyOf = Arrays.copyOf(rVar.f2694a, rVar.f2696c);
            ?? obj = new Object();
            obj.f9134a = u4;
            obj.f9135b = m4;
            obj.f9136c = j6;
            obj.f9137d = i5;
            obj.f9138e = pow;
            obj.f9139f = pow2;
            obj.f9140g = copyOf;
            this.f2423q = obj;
        } else {
            C0591a c0591a = this.f2424r;
            if (c0591a == null) {
                this.f2424r = AbstractC0619b.v(rVar, true, true);
            } else {
                int i6 = rVar.f2696c;
                byte[] bArr2 = new byte[i6];
                System.arraycopy(rVar.f2694a, 0, bArr2, 0, i6);
                int i7 = 5;
                AbstractC0619b.w(5, rVar, false);
                int u6 = rVar.u() + 1;
                q qVar = new q(rVar.f2694a);
                qVar.t(rVar.f2695b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = 2;
                    int i10 = 16;
                    if (i8 >= u6) {
                        x xVar4 = xVar3;
                        byte[] bArr3 = bArr2;
                        int i11 = 6;
                        int i12 = qVar.i(6) + 1;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (qVar.i(16) != 0) {
                                throw I.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i14 = qVar.i(6) + 1;
                        int i15 = 0;
                        while (true) {
                            int i16 = 3;
                            if (i15 < i14) {
                                int i17 = qVar.i(i10);
                                if (i17 == 0) {
                                    int i18 = 8;
                                    qVar.t(8);
                                    qVar.t(16);
                                    qVar.t(16);
                                    qVar.t(6);
                                    qVar.t(8);
                                    int i19 = qVar.i(4) + 1;
                                    int i20 = 0;
                                    while (i20 < i19) {
                                        qVar.t(i18);
                                        i20++;
                                        i18 = 8;
                                    }
                                } else {
                                    if (i17 != 1) {
                                        throw I.a(null, "floor type greater than 1 not decodable: " + i17);
                                    }
                                    int i21 = qVar.i(5);
                                    int[] iArr = new int[i21];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < i21; i23++) {
                                        int i24 = qVar.i(4);
                                        iArr[i23] = i24;
                                        if (i24 > i22) {
                                            i22 = i24;
                                        }
                                    }
                                    int i25 = i22 + 1;
                                    int[] iArr2 = new int[i25];
                                    int i26 = 0;
                                    while (i26 < i25) {
                                        iArr2[i26] = qVar.i(i16) + 1;
                                        int i27 = qVar.i(i9);
                                        int i28 = 8;
                                        if (i27 > 0) {
                                            qVar.t(8);
                                        }
                                        int i29 = 0;
                                        while (i29 < (1 << i27)) {
                                            qVar.t(i28);
                                            i29++;
                                            i28 = 8;
                                        }
                                        i26++;
                                        i16 = 3;
                                        i9 = 2;
                                    }
                                    qVar.t(i9);
                                    int i30 = qVar.i(4);
                                    int i31 = 0;
                                    int i32 = 0;
                                    for (int i33 = 0; i33 < i21; i33++) {
                                        i31 += iArr2[iArr[i33]];
                                        while (i32 < i31) {
                                            qVar.t(i30);
                                            i32++;
                                        }
                                    }
                                }
                                i15++;
                                i11 = 6;
                                i10 = 16;
                                i9 = 2;
                            } else {
                                int i34 = qVar.i(i11) + 1;
                                int i35 = 0;
                                while (i35 < i34) {
                                    if (qVar.i(16) > 2) {
                                        throw I.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    qVar.t(24);
                                    qVar.t(24);
                                    qVar.t(24);
                                    int i36 = qVar.i(i11) + 1;
                                    int i37 = 8;
                                    qVar.t(8);
                                    int[] iArr3 = new int[i36];
                                    for (int i38 = 0; i38 < i36; i38++) {
                                        iArr3[i38] = ((qVar.h() ? qVar.i(5) : 0) * 8) + qVar.i(3);
                                    }
                                    int i39 = 0;
                                    while (i39 < i36) {
                                        int i40 = 0;
                                        while (i40 < i37) {
                                            if ((iArr3[i39] & (1 << i40)) != 0) {
                                                qVar.t(i37);
                                            }
                                            i40++;
                                            i37 = 8;
                                        }
                                        i39++;
                                        i37 = 8;
                                    }
                                    i35++;
                                    i11 = 6;
                                }
                                int i41 = qVar.i(i11) + 1;
                                int i42 = 0;
                                while (i42 < i41) {
                                    int i43 = qVar.i(16);
                                    if (i43 != 0) {
                                        W.a.n("VorbisUtil", "mapping type other than 0 not supported: " + i43);
                                        xVar = xVar4;
                                    } else {
                                        int i44 = qVar.h() ? qVar.i(4) + 1 : 1;
                                        boolean h4 = qVar.h();
                                        xVar = xVar4;
                                        int i45 = xVar.f9134a;
                                        if (h4) {
                                            int i46 = qVar.i(8) + 1;
                                            for (int i47 = 0; i47 < i46; i47++) {
                                                int i48 = i45 - 1;
                                                qVar.t(AbstractC0619b.n(i48));
                                                qVar.t(AbstractC0619b.n(i48));
                                            }
                                        }
                                        if (qVar.i(2) != 0) {
                                            throw I.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i44 > 1) {
                                            for (int i49 = 0; i49 < i45; i49++) {
                                                qVar.t(4);
                                            }
                                        }
                                        for (int i50 = 0; i50 < i44; i50++) {
                                            qVar.t(8);
                                            qVar.t(8);
                                            qVar.t(8);
                                        }
                                    }
                                    i42++;
                                    xVar4 = xVar;
                                }
                                x xVar5 = xVar4;
                                int i51 = qVar.i(6);
                                int i52 = i51 + 1;
                                n[] nVarArr = new n[i52];
                                for (int i53 = 0; i53 < i52; i53++) {
                                    boolean h5 = qVar.h();
                                    qVar.i(16);
                                    qVar.i(16);
                                    qVar.i(8);
                                    ?? obj2 = new Object();
                                    obj2.f2455a = h5;
                                    nVarArr[i53] = obj2;
                                }
                                if (!qVar.h()) {
                                    throw I.a(null, "framing bit after modes not set as expected");
                                }
                                jVar = new j(xVar5, c0591a, bArr3, nVarArr, AbstractC0619b.n(i51));
                            }
                        }
                    } else {
                        if (qVar.i(24) != 5653314) {
                            throw I.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((qVar.f2688c * 8) + qVar.f2690e));
                        }
                        int i54 = qVar.i(16);
                        int i55 = qVar.i(24);
                        if (qVar.h()) {
                            qVar.t(i7);
                            for (int i56 = 0; i56 < i55; i56 += qVar.i(AbstractC0619b.n(i55 - i56))) {
                            }
                        } else {
                            boolean h6 = qVar.h();
                            for (int i57 = 0; i57 < i55; i57++) {
                                if (!h6) {
                                    qVar.t(i7);
                                } else if (qVar.h()) {
                                    qVar.t(i7);
                                }
                            }
                        }
                        int i58 = qVar.i(i4);
                        if (i58 > 2) {
                            throw I.a(null, "lookup type greater than 2 not decodable: " + i58);
                        }
                        if (i58 == 1 || i58 == 2) {
                            qVar.t(32);
                            qVar.t(32);
                            int i59 = qVar.i(i4) + 1;
                            qVar.t(1);
                            if (i58 != 1) {
                                xVar2 = xVar3;
                                bArr = bArr2;
                                j5 = i55 * i54;
                            } else if (i54 != 0) {
                                xVar2 = xVar3;
                                bArr = bArr2;
                                j5 = (long) Math.floor(Math.pow(i55, 1.0d / i54));
                            } else {
                                xVar2 = xVar3;
                                bArr = bArr2;
                                j5 = 0;
                            }
                            qVar.t((int) (j5 * i59));
                        } else {
                            xVar2 = xVar3;
                            bArr = bArr2;
                        }
                        i8++;
                        xVar3 = xVar2;
                        bArr2 = bArr;
                        i4 = 4;
                        i7 = 5;
                    }
                }
            }
        }
        jVar = null;
        this.f2420n = jVar;
        if (jVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        x xVar6 = (x) jVar.f2416m;
        arrayList.add((byte[]) xVar6.f9140g);
        arrayList.add((byte[]) jVar.f2418o);
        G s = AbstractC0619b.s(f2.I.k((String[]) ((C0591a) jVar.f2417n).f8747l));
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l("audio/vorbis");
        c0094o.f2285g = xVar6.f9137d;
        c0094o.f2286h = xVar6.f9136c;
        c0094o.f2302z = xVar6.f9134a;
        c0094o.f2270A = xVar6.f9135b;
        c0094o.f2293o = arrayList;
        c0094o.f2288j = s;
        dVar.f96m = new C0095p(c0094o);
        return true;
    }

    @Override // T0.i
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f2420n = null;
            this.f2423q = null;
            this.f2424r = null;
        }
        this.f2421o = 0;
        this.f2422p = false;
    }
}
