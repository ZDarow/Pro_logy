package y0;

import T.C0094o;
import T.C0095p;
import T.H;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f9104a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9105b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9106c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9107d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9108e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9109f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9110g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9111h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9112i;

    /* renamed from: j, reason: collision with root package name */
    public final long f9113j;

    /* renamed from: k, reason: collision with root package name */
    public final u3.m f9114k;

    /* renamed from: l, reason: collision with root package name */
    public final T.G f9115l;

    public s(byte[] bArr, int i4) {
        W.q qVar = new W.q(bArr, bArr.length);
        qVar.q(i4 * 8);
        this.f9104a = qVar.i(16);
        this.f9105b = qVar.i(16);
        this.f9106c = qVar.i(24);
        this.f9107d = qVar.i(24);
        int i5 = qVar.i(20);
        this.f9108e = i5;
        this.f9109f = d(i5);
        this.f9110g = qVar.i(3) + 1;
        int i6 = qVar.i(5) + 1;
        this.f9111h = i6;
        this.f9112i = a(i6);
        this.f9113j = qVar.k(36);
        this.f9114k = null;
        this.f9115l = null;
    }

    public static int a(int i4) {
        if (i4 == 8) {
            return 1;
        }
        if (i4 == 12) {
            return 2;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 != 20) {
            return i4 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i4) {
        switch (i4) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j4 = this.f9113j;
        if (j4 == 0) {
            return -9223372036854775807L;
        }
        return (j4 * 1000000) / this.f9108e;
    }

    public final C0095p c(byte[] bArr, T.G g4) {
        bArr[4] = Byte.MIN_VALUE;
        int i4 = this.f9107d;
        if (i4 <= 0) {
            i4 = -1;
        }
        T.G g5 = this.f9115l;
        if (g5 != null) {
            g4 = g5.e(g4);
        }
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l("audio/flac");
        c0094o.f2291m = i4;
        c0094o.f2302z = this.f9110g;
        c0094o.f2270A = this.f9108e;
        c0094o.f2271B = W.y.A(this.f9111h);
        c0094o.f2293o = Collections.singletonList(bArr);
        c0094o.f2288j = g4;
        return new C0095p(c0094o);
    }

    public s(int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j4, u3.m mVar, T.G g4) {
        this.f9104a = i4;
        this.f9105b = i5;
        this.f9106c = i6;
        this.f9107d = i7;
        this.f9108e = i8;
        this.f9109f = d(i8);
        this.f9110g = i9;
        this.f9111h = i10;
        this.f9112i = a(i10);
        this.f9113j = j4;
        this.f9114k = mVar;
        this.f9115l = g4;
    }
}
