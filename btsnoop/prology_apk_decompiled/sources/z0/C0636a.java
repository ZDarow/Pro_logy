package z0;

import T.I;
import W.y;
import e2.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import y0.F;
import y0.k;
import y0.l;
import y0.o;
import y0.p;
import y0.q;
import y0.z;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636a implements o {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f9215p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f9216q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f9217r;
    public static final byte[] s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f9218t;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9219a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9220b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9221c;

    /* renamed from: d, reason: collision with root package name */
    public long f9222d;

    /* renamed from: e, reason: collision with root package name */
    public int f9223e;

    /* renamed from: f, reason: collision with root package name */
    public int f9224f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9225g;

    /* renamed from: h, reason: collision with root package name */
    public long f9226h;

    /* renamed from: i, reason: collision with root package name */
    public int f9227i;

    /* renamed from: j, reason: collision with root package name */
    public int f9228j;

    /* renamed from: k, reason: collision with root package name */
    public long f9229k;

    /* renamed from: l, reason: collision with root package name */
    public q f9230l;

    /* renamed from: m, reason: collision with root package name */
    public F f9231m;

    /* renamed from: n, reason: collision with root package name */
    public z f9232n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9233o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f9216q = iArr;
        int i4 = y.f2709a;
        Charset charset = d.f5436c;
        f9217r = "#!AMR\n".getBytes(charset);
        s = "#!AMR-WB\n".getBytes(charset);
        f9218t = iArr[8];
    }

    public C0636a(int i4) {
        this.f9220b = (i4 & 2) != 0 ? i4 | 1 : i4;
        this.f9219a = new byte[1];
        this.f9227i = -1;
    }

    public final int a(l lVar) {
        boolean z4;
        lVar.f9091q = 0;
        byte[] bArr = this.f9219a;
        lVar.p(bArr, 0, 1, false);
        byte b4 = bArr[0];
        if ((b4 & 131) > 0) {
            throw I.a(null, "Invalid padding bits for frame header " + ((int) b4));
        }
        int i4 = (b4 >> 3) & 15;
        if (i4 >= 0 && i4 <= 15 && (((z4 = this.f9221c) && (i4 < 10 || i4 > 13)) || (!z4 && (i4 < 12 || i4 > 14)))) {
            return z4 ? f9216q[i4] : f9215p[i4];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f9221c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i4);
        throw I.a(null, sb.toString());
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        this.f9222d = 0L;
        this.f9223e = 0;
        this.f9224f = 0;
        if (j4 != 0) {
            z zVar = this.f9232n;
            if (zVar instanceof k) {
                this.f9229k = (Math.max(0L, j4 - ((k) zVar).f9080b) * 8000000) / r0.f9083e;
                return;
            }
        }
        this.f9229k = 0L;
    }

    public final boolean c(l lVar) {
        lVar.f9091q = 0;
        byte[] bArr = f9217r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.p(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f9221c = false;
            lVar.e(bArr.length);
            return true;
        }
        lVar.f9091q = 0;
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.p(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f9221c = true;
        lVar.e(bArr3.length);
        return true;
    }

    @Override // y0.o
    public final void g(q qVar) {
        this.f9230l = qVar;
        this.f9231m = qVar.v(0, 1);
        qVar.s();
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        return c((l) pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r20, T.C0098t r21) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C0636a.l(y0.p, T.t):int");
    }

    @Override // y0.o
    public final void release() {
    }
}
