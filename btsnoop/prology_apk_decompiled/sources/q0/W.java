package q0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final u0.e f7768a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7769b;

    /* renamed from: c, reason: collision with root package name */
    public final W.r f7770c;

    /* renamed from: d, reason: collision with root package name */
    public S0.e f7771d;

    /* renamed from: e, reason: collision with root package name */
    public S0.e f7772e;

    /* renamed from: f, reason: collision with root package name */
    public S0.e f7773f;

    /* renamed from: g, reason: collision with root package name */
    public long f7774g;

    public W(u0.e eVar) {
        this.f7768a = eVar;
        int i4 = eVar.f8501b;
        this.f7769b = i4;
        this.f7770c = new W.r(32);
        S0.e eVar2 = new S0.e(0L, i4);
        this.f7771d = eVar2;
        this.f7772e = eVar2;
        this.f7773f = eVar2;
    }

    public static S0.e d(S0.e eVar, long j4, ByteBuffer byteBuffer, int i4) {
        while (j4 >= eVar.f1897m) {
            eVar = (S0.e) eVar.f1899o;
        }
        while (i4 > 0) {
            int min = Math.min(i4, (int) (eVar.f1897m - j4));
            u0.a aVar = (u0.a) eVar.f1898n;
            byteBuffer.put(aVar.f8491a, ((int) (j4 - eVar.f1896l)) + aVar.f8492b, min);
            i4 -= min;
            j4 += min;
            if (j4 == eVar.f1897m) {
                eVar = (S0.e) eVar.f1899o;
            }
        }
        return eVar;
    }

    public static S0.e e(S0.e eVar, long j4, byte[] bArr, int i4) {
        while (j4 >= eVar.f1897m) {
            eVar = (S0.e) eVar.f1899o;
        }
        int i5 = i4;
        while (i5 > 0) {
            int min = Math.min(i5, (int) (eVar.f1897m - j4));
            u0.a aVar = (u0.a) eVar.f1898n;
            System.arraycopy(aVar.f8491a, ((int) (j4 - eVar.f1896l)) + aVar.f8492b, bArr, i4 - i5, min);
            i5 -= min;
            j4 += min;
            if (j4 == eVar.f1897m) {
                eVar = (S0.e) eVar.f1899o;
            }
        }
        return eVar;
    }

    public static S0.e f(S0.e eVar, Z.f fVar, i0.g gVar, W.r rVar) {
        int i4;
        if (fVar.c(1073741824)) {
            long j4 = gVar.f6148b;
            rVar.D(1);
            S0.e e4 = e(eVar, j4, rVar.f2694a, 1);
            long j5 = j4 + 1;
            byte b4 = rVar.f2694a[0];
            boolean z4 = (b4 & 128) != 0;
            int i5 = b4 & Byte.MAX_VALUE;
            Z.b bVar = fVar.f3139o;
            byte[] bArr = bVar.f3128a;
            if (bArr == null) {
                bVar.f3128a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            eVar = e(e4, j5, bVar.f3128a, i5);
            long j6 = j5 + i5;
            if (z4) {
                rVar.D(2);
                eVar = e(eVar, j6, rVar.f2694a, 2);
                j6 += 2;
                i4 = rVar.A();
            } else {
                i4 = 1;
            }
            int[] iArr = bVar.f3131d;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = bVar.f3132e;
            if (iArr2 == null || iArr2.length < i4) {
                iArr2 = new int[i4];
            }
            if (z4) {
                int i6 = i4 * 6;
                rVar.D(i6);
                eVar = e(eVar, j6, rVar.f2694a, i6);
                j6 += i6;
                rVar.G(0);
                for (int i7 = 0; i7 < i4; i7++) {
                    iArr[i7] = rVar.A();
                    iArr2[i7] = rVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gVar.f6147a - ((int) (j6 - gVar.f6148b));
            }
            y0.E e5 = (y0.E) gVar.f6149c;
            int i8 = W.y.f2709a;
            byte[] bArr2 = e5.f9001b;
            byte[] bArr3 = bVar.f3128a;
            bVar.f3133f = i4;
            bVar.f3131d = iArr;
            bVar.f3132e = iArr2;
            bVar.f3129b = bArr2;
            bVar.f3128a = bArr3;
            int i9 = e5.f9000a;
            bVar.f3130c = i9;
            int i10 = e5.f9002c;
            bVar.f3134g = i10;
            int i11 = e5.f9003d;
            bVar.f3135h = i11;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f3136i;
            cryptoInfo.numSubSamples = i4;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i9;
            if (W.y.f2709a >= 24) {
                Y.x xVar = bVar.f3137j;
                xVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) xVar.f3066n;
                pattern.set(i10, i11);
                ((MediaCodec.CryptoInfo) xVar.f3065m).setPattern(pattern);
            }
            long j7 = gVar.f6148b;
            int i12 = (int) (j6 - j7);
            gVar.f6148b = j7 + i12;
            gVar.f6147a -= i12;
        }
        if (!fVar.c(268435456)) {
            fVar.h(gVar.f6147a);
            return d(eVar, gVar.f6148b, fVar.f3140p, gVar.f6147a);
        }
        rVar.D(4);
        S0.e e6 = e(eVar, gVar.f6148b, rVar.f2694a, 4);
        int y4 = rVar.y();
        gVar.f6148b += 4;
        gVar.f6147a -= 4;
        fVar.h(y4);
        S0.e d4 = d(e6, gVar.f6148b, fVar.f3140p, y4);
        gVar.f6148b += y4;
        int i13 = gVar.f6147a - y4;
        gVar.f6147a = i13;
        ByteBuffer byteBuffer = fVar.s;
        if (byteBuffer == null || byteBuffer.capacity() < i13) {
            fVar.s = ByteBuffer.allocate(i13);
        } else {
            fVar.s.clear();
        }
        return d(d4, gVar.f6148b, fVar.s, gVar.f6147a);
    }

    public final void a(S0.e eVar) {
        if (((u0.a) eVar.f1898n) == null) {
            return;
        }
        u0.e eVar2 = this.f7768a;
        synchronized (eVar2) {
            S0.e eVar3 = eVar;
            while (eVar3 != null) {
                try {
                    u0.a[] aVarArr = eVar2.f8505f;
                    int i4 = eVar2.f8504e;
                    eVar2.f8504e = i4 + 1;
                    u0.a aVar = (u0.a) eVar3.f1898n;
                    aVar.getClass();
                    aVarArr[i4] = aVar;
                    eVar2.f8503d--;
                    eVar3 = (S0.e) eVar3.f1899o;
                    if (eVar3 == null || ((u0.a) eVar3.f1898n) == null) {
                        eVar3 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar2.notifyAll();
        }
        eVar.f1898n = null;
        eVar.f1899o = null;
    }

    public final void b(long j4) {
        S0.e eVar;
        if (j4 == -1) {
            return;
        }
        while (true) {
            eVar = this.f7771d;
            if (j4 < eVar.f1897m) {
                break;
            }
            u0.e eVar2 = this.f7768a;
            u0.a aVar = (u0.a) eVar.f1898n;
            synchronized (eVar2) {
                u0.a[] aVarArr = eVar2.f8505f;
                int i4 = eVar2.f8504e;
                eVar2.f8504e = i4 + 1;
                aVarArr[i4] = aVar;
                eVar2.f8503d--;
                eVar2.notifyAll();
            }
            S0.e eVar3 = this.f7771d;
            eVar3.f1898n = null;
            S0.e eVar4 = (S0.e) eVar3.f1899o;
            eVar3.f1899o = null;
            this.f7771d = eVar4;
        }
        if (this.f7772e.f1896l < eVar.f1896l) {
            this.f7772e = eVar;
        }
    }

    public final int c(int i4) {
        u0.a aVar;
        S0.e eVar = this.f7773f;
        if (((u0.a) eVar.f1898n) == null) {
            u0.e eVar2 = this.f7768a;
            synchronized (eVar2) {
                try {
                    int i5 = eVar2.f8503d + 1;
                    eVar2.f8503d = i5;
                    int i6 = eVar2.f8504e;
                    if (i6 > 0) {
                        u0.a[] aVarArr = eVar2.f8505f;
                        int i7 = i6 - 1;
                        eVar2.f8504e = i7;
                        aVar = aVarArr[i7];
                        aVar.getClass();
                        eVar2.f8505f[eVar2.f8504e] = null;
                    } else {
                        u0.a aVar2 = new u0.a(new byte[eVar2.f8501b], 0);
                        u0.a[] aVarArr2 = eVar2.f8505f;
                        if (i5 > aVarArr2.length) {
                            eVar2.f8505f = (u0.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            S0.e eVar3 = new S0.e(this.f7773f.f1897m, this.f7769b);
            eVar.f1898n = aVar;
            eVar.f1899o = eVar3;
        }
        return Math.min(i4, (int) (this.f7773f.f1897m - this.f7774g));
    }
}
