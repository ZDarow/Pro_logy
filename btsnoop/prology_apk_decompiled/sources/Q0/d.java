package Q0;

import B2.AbstractC0007h;
import T.I;
import V0.j;
import W.r;
import W.y;
import X.g;
import android.support.v4.media.session.t;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import y0.F;
import y0.G;
import y0.l;
import y0.o;
import y0.p;
import y0.q;

/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f1641e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f1642f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f1643g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f1644h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final UUID f1645i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final Map f1646j0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f1647A;

    /* renamed from: B, reason: collision with root package name */
    public long f1648B;

    /* renamed from: C, reason: collision with root package name */
    public long f1649C;

    /* renamed from: D, reason: collision with root package name */
    public long f1650D;

    /* renamed from: E, reason: collision with root package name */
    public B.c f1651E;

    /* renamed from: F, reason: collision with root package name */
    public B.c f1652F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1653G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1654H;

    /* renamed from: I, reason: collision with root package name */
    public int f1655I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public long f1656K;

    /* renamed from: L, reason: collision with root package name */
    public int f1657L;

    /* renamed from: M, reason: collision with root package name */
    public int f1658M;

    /* renamed from: N, reason: collision with root package name */
    public int[] f1659N;

    /* renamed from: O, reason: collision with root package name */
    public int f1660O;

    /* renamed from: P, reason: collision with root package name */
    public int f1661P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1662Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1663R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1664S;

    /* renamed from: T, reason: collision with root package name */
    public long f1665T;

    /* renamed from: U, reason: collision with root package name */
    public int f1666U;

    /* renamed from: V, reason: collision with root package name */
    public int f1667V;

    /* renamed from: W, reason: collision with root package name */
    public int f1668W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1669X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1670Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f1671Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f1672a;

    /* renamed from: a0, reason: collision with root package name */
    public int f1673a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f1674b;

    /* renamed from: b0, reason: collision with root package name */
    public byte f1675b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f1676c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1677c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1678d;

    /* renamed from: d0, reason: collision with root package name */
    public q f1679d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1680e;

    /* renamed from: f, reason: collision with root package name */
    public final j f1681f;

    /* renamed from: g, reason: collision with root package name */
    public final r f1682g;

    /* renamed from: h, reason: collision with root package name */
    public final r f1683h;

    /* renamed from: i, reason: collision with root package name */
    public final r f1684i;

    /* renamed from: j, reason: collision with root package name */
    public final r f1685j;

    /* renamed from: k, reason: collision with root package name */
    public final r f1686k;

    /* renamed from: l, reason: collision with root package name */
    public final r f1687l;

    /* renamed from: m, reason: collision with root package name */
    public final r f1688m;

    /* renamed from: n, reason: collision with root package name */
    public final r f1689n;

    /* renamed from: o, reason: collision with root package name */
    public final r f1690o;

    /* renamed from: p, reason: collision with root package name */
    public final r f1691p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f1692q;

    /* renamed from: r, reason: collision with root package name */
    public long f1693r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public long f1694t;

    /* renamed from: u, reason: collision with root package name */
    public long f1695u;

    /* renamed from: v, reason: collision with root package name */
    public long f1696v;
    public c w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1697x;

    /* renamed from: y, reason: collision with root package name */
    public int f1698y;

    /* renamed from: z, reason: collision with root package name */
    public long f1699z;

    static {
        int i4 = y.f2709a;
        f1642f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(e2.d.f5436c);
        f1643g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f1644h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f1645i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        AbstractC0007h.p(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC0007h.p(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f1646j0 = Collections.unmodifiableMap(hashMap);
    }

    public d(j jVar, int i4) {
        b bVar = new b();
        this.s = -1L;
        this.f1694t = -9223372036854775807L;
        this.f1695u = -9223372036854775807L;
        this.f1696v = -9223372036854775807L;
        this.f1648B = -1L;
        this.f1649C = -1L;
        this.f1650D = -9223372036854775807L;
        this.f1672a = bVar;
        bVar.f1588d = new K2.o(10, this);
        this.f1681f = jVar;
        this.f1678d = (i4 & 1) == 0;
        this.f1680e = (i4 & 2) == 0;
        this.f1674b = new e();
        this.f1676c = new SparseArray();
        this.f1684i = new r(4);
        this.f1685j = new r(ByteBuffer.allocate(4).putInt(-1).array());
        this.f1686k = new r(4);
        this.f1682g = new r(g.f2863a);
        this.f1683h = new r(4);
        this.f1687l = new r();
        this.f1688m = new r();
        this.f1689n = new r(8);
        this.f1690o = new r();
        this.f1691p = new r();
        this.f1659N = new int[1];
    }

    public static byte[] f(long j4, long j5, String str) {
        W.a.e(j4 != -9223372036854775807L);
        int i4 = (int) (j4 / 3600000000L);
        long j6 = j4 - (i4 * 3600000000L);
        int i5 = (int) (j6 / 60000000);
        long j7 = j6 - (i5 * 60000000);
        int i6 = (int) (j7 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf((int) ((j7 - (i6 * 1000000)) / j5)));
        int i7 = y.f2709a;
        return format.getBytes(e2.d.f5436c);
    }

    public final void a(int i4) {
        if (this.f1651E == null || this.f1652F == null) {
            throw I.a(null, "Element " + i4 + " must be in a Cues");
        }
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        this.f1650D = -9223372036854775807L;
        this.f1655I = 0;
        b bVar = this.f1672a;
        bVar.f1589e = 0;
        bVar.f1586b.clear();
        e eVar = bVar.f1587c;
        eVar.f1702b = 0;
        eVar.f1703c = 0;
        e eVar2 = this.f1674b;
        eVar2.f1702b = 0;
        eVar2.f1703c = 0;
        i();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f1676c;
            if (i4 >= sparseArray.size()) {
                return;
            }
            G g4 = ((c) sparseArray.valueAt(i4)).f1611U;
            if (g4 != null) {
                g4.f9005b = false;
                g4.f9006c = 0;
            }
            i4++;
        }
    }

    public final void c(int i4) {
        if (this.w != null) {
            return;
        }
        throw I.a(null, "Element " + i4 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(Q0.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.d.e(Q0.c, long, int, int, int):void");
    }

    @Override // y0.o
    public final void g(q qVar) {
        this.f1679d0 = qVar;
        if (this.f1680e) {
            qVar = new t(qVar, this.f1681f);
        }
        this.f1679d0 = qVar;
    }

    public final void h(l lVar, int i4) {
        r rVar = this.f1684i;
        if (rVar.f2696c >= i4) {
            return;
        }
        byte[] bArr = rVar.f2694a;
        if (bArr.length < i4) {
            rVar.b(Math.max(bArr.length * 2, i4));
        }
        byte[] bArr2 = rVar.f2694a;
        int i5 = rVar.f2696c;
        lVar.k(bArr2, i5, i4 - i5, false);
        rVar.F(i4);
    }

    public final void i() {
        this.f1666U = 0;
        this.f1667V = 0;
        this.f1668W = 0;
        this.f1669X = false;
        this.f1670Y = false;
        this.f1671Z = false;
        this.f1673a0 = 0;
        this.f1675b0 = (byte) 0;
        this.f1677c0 = false;
        this.f1687l.D(0);
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        B.c cVar = new B.c(3, false);
        l lVar = (l) pVar;
        long j4 = lVar.f9088n;
        long j5 = 1024;
        if (j4 != -1 && j4 <= 1024) {
            j5 = j4;
        }
        int i4 = (int) j5;
        r rVar = (r) cVar.f85m;
        lVar.p(rVar.f2694a, 0, 4, false);
        cVar.f84l = 4;
        for (long w = rVar.w(); w != 440786851; w = ((w << 8) & (-256)) | (rVar.f2694a[0] & 255)) {
            int i5 = cVar.f84l + 1;
            cVar.f84l = i5;
            if (i5 == i4) {
                return false;
            }
            lVar.p(rVar.f2694a, 0, 1, false);
        }
        long h4 = cVar.h(lVar);
        long j6 = cVar.f84l;
        if (h4 == Long.MIN_VALUE) {
            return false;
        }
        if (j4 != -1 && j6 + h4 >= j4) {
            return false;
        }
        while (true) {
            long j7 = cVar.f84l;
            long j8 = j6 + h4;
            if (j7 >= j8) {
                return j7 == j8;
            }
            if (cVar.h(lVar) == Long.MIN_VALUE) {
                return false;
            }
            long h5 = cVar.h(lVar);
            if (h5 < 0 || h5 > 2147483647L) {
                return false;
            }
            if (h5 != 0) {
                int i6 = (int) h5;
                lVar.a(i6, false);
                cVar.f84l += i6;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0dbc, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x1092, code lost:
    
        if (r21 == false) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x1094, code lost:
    
        r0 = ((y0.l) r46).f9089o;
        r11 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x109e, code lost:
    
        if (r11.f1647A == false) goto L791;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x10ad, code lost:
    
        r12 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x10b1, code lost:
    
        if (r11.f1697x == false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x10b3, code lost:
    
        r0 = r11.f1649C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x10b9, code lost:
    
        if (r0 == (-1)) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x10bb, code lost:
    
        r12.f2352a = r0;
        r11.f1649C = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0a69, code lost:
    
        if (r1.o() == r3.getLeastSignificantBits()) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x10c5, code lost:
    
        r10 = r3;
        r0 = r11;
        r2 = r35;
        r3 = r36;
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x10c5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x10a0, code lost:
    
        r11.f1649C = r0;
        r47.f2352a = r11.f1648B;
        r11.f1647A = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x10ab, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x10c1, code lost:
    
        r11 = r45;
        r12 = r47;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:121:0x023d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:130:0x049f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:133:0x0690. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0ad6  */
    /* JADX WARN: Type inference failed for: r0v101, types: [Q0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r10v11, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v20, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r46, T.C0098t r47) {
        /*
            Method dump skipped, instructions count: 5194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.d.l(y0.p, T.t):int");
    }

    public final long m(long j4) {
        long j5 = this.f1694t;
        if (j5 == -9223372036854775807L) {
            throw I.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i4 = y.f2709a;
        return y.U(j4, j5, 1000L, RoundingMode.FLOOR);
    }

    public final int n(l lVar, c cVar, int i4, boolean z4) {
        int d4;
        int d5;
        int i5;
        if ("S_TEXT/UTF8".equals(cVar.f1618b)) {
            o(lVar, f1641e0, i4);
            int i6 = this.f1667V;
            i();
            return i6;
        }
        if ("S_TEXT/ASS".equals(cVar.f1618b)) {
            o(lVar, f1643g0, i4);
            int i7 = this.f1667V;
            i();
            return i7;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f1618b)) {
            o(lVar, f1644h0, i4);
            int i8 = this.f1667V;
            i();
            return i8;
        }
        F f4 = cVar.f1615Y;
        boolean z5 = this.f1669X;
        r rVar = this.f1687l;
        if (!z5) {
            boolean z6 = cVar.f1624h;
            r rVar2 = this.f1684i;
            if (z6) {
                this.f1662Q &= -1073741825;
                if (!this.f1670Y) {
                    lVar.k(rVar2.f2694a, 0, 1, false);
                    this.f1666U++;
                    byte b4 = rVar2.f2694a[0];
                    if ((b4 & 128) == 128) {
                        throw I.a(null, "Extension bit is set in signal byte");
                    }
                    this.f1675b0 = b4;
                    this.f1670Y = true;
                }
                byte b5 = this.f1675b0;
                if ((b5 & 1) == 1) {
                    boolean z7 = (b5 & 2) == 2;
                    this.f1662Q |= 1073741824;
                    if (!this.f1677c0) {
                        r rVar3 = this.f1689n;
                        lVar.k(rVar3.f2694a, 0, 8, false);
                        this.f1666U += 8;
                        this.f1677c0 = true;
                        rVar2.f2694a[0] = (byte) ((z7 ? 128 : 0) | 8);
                        rVar2.G(0);
                        f4.a(rVar2, 1, 1);
                        this.f1667V++;
                        rVar3.G(0);
                        f4.a(rVar3, 8, 1);
                        this.f1667V += 8;
                    }
                    if (z7) {
                        if (!this.f1671Z) {
                            lVar.k(rVar2.f2694a, 0, 1, false);
                            this.f1666U++;
                            rVar2.G(0);
                            this.f1673a0 = rVar2.u();
                            this.f1671Z = true;
                        }
                        int i9 = this.f1673a0 * 4;
                        rVar2.D(i9);
                        lVar.k(rVar2.f2694a, 0, i9, false);
                        this.f1666U += i9;
                        short s = (short) ((this.f1673a0 / 2) + 1);
                        int i10 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f1692q;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.f1692q = ByteBuffer.allocate(i10);
                        }
                        this.f1692q.position(0);
                        this.f1692q.putShort(s);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i5 = this.f1673a0;
                            if (i11 >= i5) {
                                break;
                            }
                            int y4 = rVar2.y();
                            if (i11 % 2 == 0) {
                                this.f1692q.putShort((short) (y4 - i12));
                            } else {
                                this.f1692q.putInt(y4 - i12);
                            }
                            i11++;
                            i12 = y4;
                        }
                        int i13 = (i4 - this.f1666U) - i12;
                        if (i5 % 2 == 1) {
                            this.f1692q.putInt(i13);
                        } else {
                            this.f1692q.putShort((short) i13);
                            this.f1692q.putInt(0);
                        }
                        byte[] array = this.f1692q.array();
                        r rVar4 = this.f1690o;
                        rVar4.E(array, i10);
                        f4.a(rVar4, i10, 1);
                        this.f1667V += i10;
                    }
                }
            } else {
                byte[] bArr = cVar.f1625i;
                if (bArr != null) {
                    rVar.E(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(cVar.f1618b) ? z4 : cVar.f1622f > 0) {
                this.f1662Q |= 268435456;
                this.f1691p.D(0);
                int i14 = (rVar.f2696c + i4) - this.f1666U;
                rVar2.D(4);
                byte[] bArr2 = rVar2.f2694a;
                bArr2[0] = (byte) ((i14 >> 24) & 255);
                bArr2[1] = (byte) ((i14 >> 16) & 255);
                bArr2[2] = (byte) ((i14 >> 8) & 255);
                bArr2[3] = (byte) (i14 & 255);
                f4.a(rVar2, 4, 2);
                this.f1667V += 4;
            }
            this.f1669X = true;
        }
        int i15 = i4 + rVar.f2696c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f1618b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f1618b)) {
            if (cVar.f1611U != null) {
                W.a.j(rVar.f2696c == 0);
                cVar.f1611U.c(lVar);
            }
            while (true) {
                int i16 = this.f1666U;
                if (i16 >= i15) {
                    break;
                }
                int i17 = i15 - i16;
                int a4 = rVar.a();
                if (a4 > 0) {
                    d5 = Math.min(i17, a4);
                    f4.a(rVar, d5, 0);
                } else {
                    d5 = f4.d(lVar, i17, false);
                }
                this.f1666U += d5;
                this.f1667V += d5;
            }
        } else {
            r rVar5 = this.f1683h;
            byte[] bArr3 = rVar5.f2694a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i18 = cVar.f1616Z;
            int i19 = 4 - i18;
            while (this.f1666U < i15) {
                int i20 = this.f1668W;
                if (i20 == 0) {
                    int min = Math.min(i18, rVar.a());
                    lVar.k(bArr3, i19 + min, i18 - min, false);
                    if (min > 0) {
                        rVar.f(bArr3, i19, min);
                    }
                    this.f1666U += i18;
                    rVar5.G(0);
                    this.f1668W = rVar5.y();
                    r rVar6 = this.f1682g;
                    rVar6.G(0);
                    f4.a(rVar6, 4, 0);
                    this.f1667V += 4;
                } else {
                    int a5 = rVar.a();
                    if (a5 > 0) {
                        d4 = Math.min(i20, a5);
                        f4.a(rVar, d4, 0);
                    } else {
                        d4 = f4.d(lVar, i20, false);
                    }
                    this.f1666U += d4;
                    this.f1667V += d4;
                    this.f1668W -= d4;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f1618b)) {
            r rVar7 = this.f1685j;
            rVar7.G(0);
            f4.a(rVar7, 4, 0);
            this.f1667V += 4;
        }
        int i21 = this.f1667V;
        i();
        return i21;
    }

    public final void o(l lVar, byte[] bArr, int i4) {
        int length = bArr.length + i4;
        r rVar = this.f1688m;
        byte[] bArr2 = rVar.f2694a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i4);
            rVar.E(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.k(rVar.f2694a, bArr.length, i4, false);
        rVar.G(0);
        rVar.F(length);
    }

    @Override // y0.o
    public final void release() {
    }
}
