package n0;

import T.I;
import W.r;
import W.y;
import java.util.Locale;
import java.util.TreeMap;
import m0.C0428i;
import m0.C0430k;
import y0.F;
import y0.q;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7405l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7406m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f7407n;

    /* renamed from: o, reason: collision with root package name */
    public Object f7408o;

    /* renamed from: p, reason: collision with root package name */
    public Object f7409p;

    /* renamed from: q, reason: collision with root package name */
    public int f7410q;

    /* renamed from: r, reason: collision with root package name */
    public long f7411r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f7412t;

    /* renamed from: u, reason: collision with root package name */
    public long f7413u;

    public e(String str, String str2, long j4, int i4, int i5, int i6, int[] iArr, TreeMap treeMap) {
        this.f7405l = 2;
        this.f7406m = str;
        this.f7407n = str2;
        this.f7411r = j4;
        this.f7413u = 0L;
        this.f7410q = i4;
        this.s = i5;
        this.f7412t = i6;
        this.f7408o = iArr;
        this.f7409p = treeMap;
    }

    private final void a(long j4) {
    }

    private final void f(long j4) {
    }

    @Override // n0.i
    public void b(long j4, long j5) {
        switch (this.f7405l) {
            case 0:
                this.f7411r = j4;
                this.f7412t = 0;
                this.f7413u = j5;
                return;
            default:
                this.f7411r = j4;
                this.f7412t = 0;
                this.f7413u = j5;
                return;
        }
    }

    @Override // n0.i
    public void c(r rVar, long j4, int i4, boolean z4) {
        int i5;
        Object obj = this.f7406m;
        int i6 = 1;
        switch (this.f7405l) {
            case 0:
                try {
                    int i7 = rVar.f2694a[0] & 31;
                    W.a.k((F) this.f7409p);
                    if (i7 > 0 && i7 < 24) {
                        int a4 = rVar.a();
                        this.f7412t = g() + this.f7412t;
                        ((F) this.f7409p).a(rVar, a4, 0);
                        this.f7412t += a4;
                        this.f7410q = (rVar.f2694a[0] & 31) == 5 ? 1 : 0;
                    } else if (i7 == 24) {
                        rVar.u();
                        while (rVar.a() > 4) {
                            int A4 = rVar.A();
                            this.f7412t = g() + this.f7412t;
                            ((F) this.f7409p).a(rVar, A4, 0);
                            this.f7412t += A4;
                        }
                        this.f7410q = 0;
                    } else {
                        if (i7 != 28) {
                            throw I.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i7)), null);
                        }
                        byte[] bArr = rVar.f2694a;
                        byte b4 = bArr[0];
                        byte b5 = bArr[1];
                        int i8 = (b4 & 224) | (b5 & 31);
                        boolean z5 = (b5 & 128) > 0;
                        boolean z6 = (b5 & 64) > 0;
                        r rVar2 = (r) obj;
                        if (z5) {
                            this.f7412t = g() + this.f7412t;
                            byte[] bArr2 = rVar.f2694a;
                            i5 = 1;
                            bArr2[1] = (byte) i8;
                            rVar2.getClass();
                            rVar2.E(bArr2, bArr2.length);
                            rVar2.G(1);
                        } else {
                            i5 = 1;
                            int a5 = C0428i.a(this.s);
                            if (i4 != a5) {
                                int i9 = y.f2709a;
                                Locale locale = Locale.US;
                                W.a.A("RtpH264Reader", "Received RTP packet with unexpected sequence number. Expected: " + a5 + "; received: " + i4 + ". Dropping packet.");
                            } else {
                                byte[] bArr3 = rVar.f2694a;
                                rVar2.getClass();
                                rVar2.E(bArr3, bArr3.length);
                                rVar2.G(2);
                            }
                        }
                        int a6 = rVar2.a();
                        ((F) this.f7409p).a(rVar2, a6, 0);
                        this.f7412t += a6;
                        if (z6) {
                            this.f7410q = (i8 & 31) == 5 ? i5 : 0;
                        }
                    }
                    if (z4) {
                        if (this.f7411r == -9223372036854775807L) {
                            this.f7411r = j4;
                        }
                        ((F) this.f7409p).b(U1.a.K(this.f7413u, j4, this.f7411r, 90000), this.f7410q, this.f7412t, 0, null);
                        this.f7412t = 0;
                    }
                    this.s = i4;
                    return;
                } catch (IndexOutOfBoundsException e4) {
                    throw I.b(null, e4);
                }
            default:
                byte[] bArr4 = rVar.f2694a;
                if (bArr4.length == 0) {
                    throw I.b("Empty RTP data packet.", null);
                }
                int i10 = (bArr4[0] >> 1) & 63;
                W.a.k((F) this.f7409p);
                r rVar3 = (r) this.f7407n;
                if (i10 >= 0 && i10 < 48) {
                    int a7 = rVar.a();
                    int i11 = this.f7412t;
                    rVar3.G(0);
                    int a8 = rVar3.a();
                    F f4 = (F) this.f7409p;
                    f4.getClass();
                    f4.a(rVar3, a8, 0);
                    this.f7412t = a8 + i11;
                    ((F) this.f7409p).a(rVar, a7, 0);
                    this.f7412t += a7;
                    int i12 = (rVar.f2694a[0] >> 1) & 63;
                    if (i12 != 19 && i12 != 20) {
                        i6 = 0;
                    }
                    this.f7410q = i6;
                } else {
                    if (i10 == 48) {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (i10 != 49) {
                        throw I.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i10)), null);
                    }
                    byte[] bArr5 = rVar.f2694a;
                    if (bArr5.length < 3) {
                        throw I.b("Malformed FU header.", null);
                    }
                    int i13 = bArr5[1] & 7;
                    byte b6 = bArr5[2];
                    int i14 = b6 & 63;
                    boolean z7 = (b6 & 128) > 0;
                    boolean z8 = (b6 & 64) > 0;
                    r rVar4 = (r) obj;
                    if (z7) {
                        int i15 = this.f7412t;
                        rVar3.G(0);
                        int a9 = rVar3.a();
                        F f5 = (F) this.f7409p;
                        f5.getClass();
                        f5.a(rVar3, a9, 0);
                        this.f7412t = a9 + i15;
                        byte[] bArr6 = rVar.f2694a;
                        bArr6[1] = (byte) ((i14 << 1) & 127);
                        bArr6[2] = (byte) i13;
                        rVar4.getClass();
                        rVar4.E(bArr6, bArr6.length);
                        rVar4.G(1);
                    } else {
                        int i16 = (this.s + 1) % 65535;
                        if (i4 != i16) {
                            int i17 = y.f2709a;
                            Locale locale2 = Locale.US;
                            W.a.A("RtpH265Reader", "Received RTP packet with unexpected sequence number. Expected: " + i16 + "; received: " + i4 + ". Dropping packet.");
                        } else {
                            rVar4.getClass();
                            rVar4.E(bArr5, bArr5.length);
                            rVar4.G(3);
                        }
                    }
                    int a10 = rVar4.a();
                    ((F) this.f7409p).a(rVar4, a10, 0);
                    this.f7412t += a10;
                    if (z8) {
                        this.f7410q = (i14 == 19 || i14 == 20) ? 1 : 0;
                    }
                }
                if (z4) {
                    if (this.f7411r == -9223372036854775807L) {
                        this.f7411r = j4;
                    }
                    ((F) this.f7409p).b(U1.a.K(this.f7413u, j4, this.f7411r, 90000), this.f7410q, this.f7412t, 0, null);
                    this.f7412t = 0;
                }
                this.s = i4;
                return;
        }
    }

    @Override // n0.i
    public void d(q qVar, int i4) {
        switch (this.f7405l) {
            case 0:
                F v4 = qVar.v(i4, 2);
                this.f7409p = v4;
                int i5 = y.f2709a;
                v4.c(((C0430k) this.f7408o).f7239c);
                return;
            default:
                F v5 = qVar.v(i4, 2);
                this.f7409p = v5;
                v5.c(((C0430k) this.f7408o).f7239c);
                return;
        }
    }

    @Override // n0.i
    public void e(long j4) {
        int i4 = this.f7405l;
    }

    public int g() {
        r rVar = (r) this.f7407n;
        rVar.G(0);
        int a4 = rVar.a();
        F f4 = (F) this.f7409p;
        f4.getClass();
        f4.a(rVar, a4, 0);
        return a4;
    }

    public e(C0430k c0430k, int i4) {
        this.f7405l = i4;
        switch (i4) {
            case 1:
                this.f7406m = new r();
                this.f7407n = new r(X.g.f2863a);
                this.f7408o = c0430k;
                this.f7411r = -9223372036854775807L;
                this.s = -1;
                return;
            default:
                this.f7407n = new r(X.g.f2863a);
                this.f7408o = c0430k;
                this.f7406m = new r();
                this.f7411r = -9223372036854775807L;
                this.s = -1;
                return;
        }
    }
}
