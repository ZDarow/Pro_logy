package j0;

import T.C0095p;
import a0.AbstractC0125e;
import a0.C0119I;
import a0.C0126f;
import a0.C0127g;
import a0.C0133m;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import c0.N;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import q0.a0;

/* loaded from: classes.dex */
public abstract class u extends AbstractC0125e {

    /* renamed from: O0, reason: collision with root package name */
    public static final byte[] f6851O0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0, reason: collision with root package name */
    public boolean f6852A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f6853B0;

    /* renamed from: C, reason: collision with root package name */
    public final i f6854C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f6855C0;

    /* renamed from: D, reason: collision with root package name */
    public final v f6856D;

    /* renamed from: D0, reason: collision with root package name */
    public long f6857D0;

    /* renamed from: E, reason: collision with root package name */
    public final float f6858E;

    /* renamed from: E0, reason: collision with root package name */
    public long f6859E0;

    /* renamed from: F, reason: collision with root package name */
    public final Z.f f6860F;
    public boolean F0;

    /* renamed from: G, reason: collision with root package name */
    public final Z.f f6861G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f6862G0;

    /* renamed from: H, reason: collision with root package name */
    public final Z.f f6863H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f6864H0;

    /* renamed from: I, reason: collision with root package name */
    public final g f6865I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f6866I0;
    public final MediaCodec.BufferInfo J;

    /* renamed from: J0, reason: collision with root package name */
    public C0133m f6867J0;

    /* renamed from: K, reason: collision with root package name */
    public final ArrayDeque f6868K;

    /* renamed from: K0, reason: collision with root package name */
    public C0126f f6869K0;

    /* renamed from: L, reason: collision with root package name */
    public final N f6870L;

    /* renamed from: L0, reason: collision with root package name */
    public t f6871L0;

    /* renamed from: M, reason: collision with root package name */
    public C0095p f6872M;

    /* renamed from: M0, reason: collision with root package name */
    public long f6873M0;

    /* renamed from: N, reason: collision with root package name */
    public C0095p f6874N;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f6875N0;

    /* renamed from: O, reason: collision with root package name */
    public K2.o f6876O;

    /* renamed from: P, reason: collision with root package name */
    public K2.o f6877P;

    /* renamed from: Q, reason: collision with root package name */
    public C0119I f6878Q;

    /* renamed from: R, reason: collision with root package name */
    public MediaCrypto f6879R;

    /* renamed from: S, reason: collision with root package name */
    public final long f6880S;

    /* renamed from: T, reason: collision with root package name */
    public float f6881T;

    /* renamed from: U, reason: collision with root package name */
    public float f6882U;

    /* renamed from: V, reason: collision with root package name */
    public j f6883V;

    /* renamed from: W, reason: collision with root package name */
    public C0095p f6884W;

    /* renamed from: X, reason: collision with root package name */
    public MediaFormat f6885X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f6886Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f6887Z;

    /* renamed from: a0, reason: collision with root package name */
    public ArrayDeque f6888a0;

    /* renamed from: b0, reason: collision with root package name */
    public r f6889b0;

    /* renamed from: c0, reason: collision with root package name */
    public m f6890c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f6891d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6892e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f6893f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f6894g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f6895h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f6896i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f6897j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f6898k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f6899l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f6900m0;

    /* renamed from: n0, reason: collision with root package name */
    public long f6901n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f6902o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f6903p0;

    /* renamed from: q0, reason: collision with root package name */
    public ByteBuffer f6904q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f6905r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f6906s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f6907t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f6908u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f6909v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f6910w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f6911x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f6912y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f6913z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [Z.f, j0.g] */
    /* JADX WARN: Type inference failed for: r4v6, types: [c0.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, a0.f] */
    public u(int i4, i iVar, float f4) {
        super(i4);
        v vVar = v.f6914m;
        this.f6854C = iVar;
        this.f6856D = vVar;
        this.f6858E = f4;
        this.f6860F = new Z.f(0);
        this.f6861G = new Z.f(0);
        this.f6863H = new Z.f(2);
        ?? fVar = new Z.f(2);
        fVar.w = 32;
        this.f6865I = fVar;
        this.J = new MediaCodec.BufferInfo();
        this.f6881T = 1.0f;
        this.f6882U = 1.0f;
        this.f6880S = -9223372036854775807L;
        this.f6868K = new ArrayDeque();
        this.f6871L0 = t.f6846e;
        fVar.h(0);
        fVar.f3140p.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f4573a = U.d.f2470a;
        obj.f4575c = 0;
        obj.f4574b = 2;
        this.f6870L = obj;
        this.f6887Z = -1.0f;
        this.f6891d0 = 0;
        this.f6911x0 = 0;
        this.f6902o0 = -1;
        this.f6903p0 = -1;
        this.f6901n0 = -9223372036854775807L;
        this.f6857D0 = -9223372036854775807L;
        this.f6859E0 = -9223372036854775807L;
        this.f6873M0 = -9223372036854775807L;
        this.f6912y0 = 0;
        this.f6913z0 = 0;
        this.f6869K0 = new Object();
    }

    @Override // a0.AbstractC0125e
    public void C(float f4, float f5) {
        this.f6881T = f4;
        this.f6882U = f5;
        v0(this.f6884W);
    }

    @Override // a0.AbstractC0125e
    public final int D(C0095p c0095p) {
        try {
            return u0(this.f6856D, c0095p);
        } catch (y e4) {
            throw g(e4, c0095p, false, 4002);
        }
    }

    @Override // a0.AbstractC0125e
    public final int E() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0320, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0326, code lost:
    
        r26.f6908u0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0322 A[LOOP:0: B:23:0x0096->B:120:0x0322, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0320 A[EDGE_INSN: B:121:0x0320->B:103:0x0320 BREAK  A[LOOP:0: B:23:0x0096->B:120:0x0322], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(long r27, long r29) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u.F(long, long):boolean");
    }

    public abstract C0127g G(m mVar, C0095p c0095p, C0095p c0095p2);

    public l H(IllegalStateException illegalStateException, m mVar) {
        return new l(illegalStateException, mVar);
    }

    public final void I() {
        this.f6909v0 = false;
        this.f6865I.e();
        this.f6863H.e();
        this.f6908u0 = false;
        this.f6907t0 = false;
        N n4 = this.f6870L;
        n4.getClass();
        n4.f4573a = U.d.f2470a;
        n4.f4575c = 0;
        n4.f4574b = 2;
    }

    public final boolean J() {
        if (this.f6852A0) {
            this.f6912y0 = 1;
            if (this.f6893f0 || this.f6895h0) {
                this.f6913z0 = 3;
                return false;
            }
            this.f6913z0 = 2;
        } else {
            w0();
        }
        return true;
    }

    public final boolean K(long j4, long j5) {
        boolean z4;
        boolean z5;
        MediaCodec.BufferInfo bufferInfo;
        boolean k02;
        int f4;
        j jVar = this.f6883V;
        jVar.getClass();
        boolean z6 = this.f6903p0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.J;
        if (!z6) {
            if (this.f6896i0 && this.f6853B0) {
                try {
                    f4 = jVar.f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    j0();
                    if (this.f6862G0) {
                        m0();
                    }
                    return false;
                }
            } else {
                f4 = jVar.f(bufferInfo2);
            }
            if (f4 < 0) {
                if (f4 != -2) {
                    if (this.f6900m0 && (this.F0 || this.f6912y0 == 2)) {
                        j0();
                    }
                    return false;
                }
                this.f6855C0 = true;
                j jVar2 = this.f6883V;
                jVar2.getClass();
                MediaFormat M3 = jVar2.M();
                if (this.f6891d0 != 0 && M3.getInteger("width") == 32 && M3.getInteger("height") == 32) {
                    this.f6899l0 = true;
                } else {
                    this.f6885X = M3;
                    this.f6886Y = true;
                }
                return true;
            }
            if (this.f6899l0) {
                this.f6899l0 = false;
                jVar.r(f4, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                j0();
                return false;
            }
            this.f6903p0 = f4;
            ByteBuffer u4 = jVar.u(f4);
            this.f6904q0 = u4;
            if (u4 != null) {
                u4.position(bufferInfo2.offset);
                this.f6904q0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f6897j0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.f6857D0 != -9223372036854775807L) {
                bufferInfo2.presentationTimeUs = this.f6859E0;
            }
            long j6 = bufferInfo2.presentationTimeUs;
            this.f6905r0 = j6 < this.w;
            long j7 = this.f6859E0;
            this.f6906s0 = j7 != -9223372036854775807L && j7 <= j6;
            x0(j6);
        }
        if (this.f6896i0 && this.f6853B0) {
            try {
                ByteBuffer byteBuffer = this.f6904q0;
                int i4 = this.f6903p0;
                int i5 = bufferInfo2.flags;
                long j8 = bufferInfo2.presentationTimeUs;
                boolean z7 = this.f6905r0;
                boolean z8 = this.f6906s0;
                C0095p c0095p = this.f6874N;
                c0095p.getClass();
                z4 = true;
                z5 = false;
                try {
                    k02 = k0(j4, j5, jVar, byteBuffer, i4, i5, 1, j8, z7, z8, c0095p);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    j0();
                    if (this.f6862G0) {
                        m0();
                    }
                    return z5;
                }
            } catch (IllegalStateException unused3) {
                z5 = false;
            }
        } else {
            z4 = true;
            z5 = false;
            ByteBuffer byteBuffer2 = this.f6904q0;
            int i6 = this.f6903p0;
            int i7 = bufferInfo2.flags;
            long j9 = bufferInfo2.presentationTimeUs;
            boolean z9 = this.f6905r0;
            boolean z10 = this.f6906s0;
            C0095p c0095p2 = this.f6874N;
            c0095p2.getClass();
            bufferInfo = bufferInfo2;
            k02 = k0(j4, j5, jVar, byteBuffer2, i6, i7, 1, j9, z9, z10, c0095p2);
        }
        if (k02) {
            f0(bufferInfo.presentationTimeUs);
            boolean z11 = (bufferInfo.flags & 4) != 0 ? z4 : z5;
            this.f6903p0 = -1;
            this.f6904q0 = null;
            if (!z11) {
                return z4;
            }
            j0();
        }
        return z5;
    }

    public final boolean L() {
        j jVar = this.f6883V;
        if (jVar == null || this.f6912y0 == 2 || this.F0) {
            return false;
        }
        int i4 = this.f6902o0;
        Z.f fVar = this.f6861G;
        if (i4 < 0) {
            int z4 = jVar.z();
            this.f6902o0 = z4;
            if (z4 < 0) {
                return false;
            }
            fVar.f3140p = jVar.k(z4);
            fVar.e();
        }
        if (this.f6912y0 == 1) {
            if (!this.f6900m0) {
                this.f6853B0 = true;
                jVar.e(this.f6902o0, 0, 0L, 4);
                this.f6902o0 = -1;
                fVar.f3140p = null;
            }
            this.f6912y0 = 2;
            return false;
        }
        if (this.f6898k0) {
            this.f6898k0 = false;
            ByteBuffer byteBuffer = fVar.f3140p;
            byteBuffer.getClass();
            byteBuffer.put(f6851O0);
            jVar.e(this.f6902o0, 38, 0L, 0);
            this.f6902o0 = -1;
            fVar.f3140p = null;
            this.f6852A0 = true;
            return true;
        }
        if (this.f6911x0 == 1) {
            int i5 = 0;
            while (true) {
                C0095p c0095p = this.f6884W;
                c0095p.getClass();
                if (i5 >= c0095p.f2328p.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f6884W.f2328p.get(i5);
                ByteBuffer byteBuffer2 = fVar.f3140p;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i5++;
            }
            this.f6911x0 = 2;
        }
        ByteBuffer byteBuffer3 = fVar.f3140p;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        Y.x xVar = this.f3423n;
        xVar.N();
        try {
            int y4 = y(xVar, fVar, 0);
            if (y4 == -3) {
                if (m()) {
                    this.f6859E0 = this.f6857D0;
                }
                return false;
            }
            if (y4 == -5) {
                if (this.f6911x0 == 2) {
                    fVar.e();
                    this.f6911x0 = 1;
                }
                c0(xVar);
                return true;
            }
            if (fVar.c(4)) {
                this.f6859E0 = this.f6857D0;
                if (this.f6911x0 == 2) {
                    fVar.e();
                    this.f6911x0 = 1;
                }
                this.F0 = true;
                if (!this.f6852A0) {
                    j0();
                    return false;
                }
                try {
                    if (!this.f6900m0) {
                        this.f6853B0 = true;
                        jVar.e(this.f6902o0, 0, 0L, 4);
                        this.f6902o0 = -1;
                        fVar.f3140p = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e4) {
                    throw g(e4, this.f6872M, false, W.y.w(e4.getErrorCode()));
                }
            }
            if (!this.f6852A0 && !fVar.c(1)) {
                fVar.e();
                if (this.f6911x0 == 2) {
                    this.f6911x0 = 1;
                }
                return true;
            }
            boolean c4 = fVar.c(1073741824);
            if (c4) {
                Z.b bVar = fVar.f3139o;
                if (position == 0) {
                    bVar.getClass();
                } else {
                    if (bVar.f3131d == null) {
                        int[] iArr = new int[1];
                        bVar.f3131d = iArr;
                        bVar.f3136i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = bVar.f3131d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.f6892e0 && !c4) {
                ByteBuffer byteBuffer4 = fVar.f3140p;
                byteBuffer4.getClass();
                int position2 = byteBuffer4.position();
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    int i8 = i6 + 1;
                    if (i8 >= position2) {
                        byteBuffer4.clear();
                        break;
                    }
                    int i9 = byteBuffer4.get(i6) & 255;
                    if (i7 == 3) {
                        if (i9 == 1 && (byteBuffer4.get(i8) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer4.duplicate();
                            duplicate.position(i6 - 3);
                            duplicate.limit(position2);
                            byteBuffer4.position(0);
                            byteBuffer4.put(duplicate);
                            break;
                        }
                    } else if (i9 == 0) {
                        i7++;
                    }
                    if (i9 != 0) {
                        i7 = 0;
                    }
                    i6 = i8;
                }
                ByteBuffer byteBuffer5 = fVar.f3140p;
                byteBuffer5.getClass();
                if (byteBuffer5.position() == 0) {
                    return true;
                }
                this.f6892e0 = false;
            }
            long j4 = fVar.f3142r;
            if (this.f6864H0) {
                ArrayDeque arrayDeque = this.f6868K;
                if (arrayDeque.isEmpty()) {
                    S0.g gVar = this.f6871L0.f6850d;
                    C0095p c0095p2 = this.f6872M;
                    c0095p2.getClass();
                    gVar.a(j4, c0095p2);
                } else {
                    S0.g gVar2 = ((t) arrayDeque.peekLast()).f6850d;
                    C0095p c0095p3 = this.f6872M;
                    c0095p3.getClass();
                    gVar2.a(j4, c0095p3);
                }
                this.f6864H0 = false;
            }
            this.f6857D0 = Math.max(this.f6857D0, j4);
            if (m() || fVar.c(536870912)) {
                this.f6859E0 = this.f6857D0;
            }
            fVar.i();
            if (fVar.c(268435456)) {
                U(fVar);
            }
            h0(fVar);
            int P3 = P(fVar);
            try {
                if (c4) {
                    jVar.b(this.f6902o0, fVar.f3139o, j4, P3);
                } else {
                    int i10 = this.f6902o0;
                    ByteBuffer byteBuffer6 = fVar.f3140p;
                    byteBuffer6.getClass();
                    jVar.e(i10, byteBuffer6.limit(), j4, P3);
                }
                this.f6902o0 = -1;
                fVar.f3140p = null;
                this.f6852A0 = true;
                this.f6911x0 = 0;
                this.f6869K0.f3448c++;
                return true;
            } catch (MediaCodec.CryptoException e5) {
                throw g(e5, this.f6872M, false, W.y.w(e5.getErrorCode()));
            }
        } catch (Z.e e6) {
            Z(e6);
            l0(0);
            M();
            return true;
        }
    }

    public final void M() {
        try {
            j jVar = this.f6883V;
            W.a.k(jVar);
            jVar.flush();
        } finally {
            o0();
        }
    }

    public final boolean N() {
        if (this.f6883V == null) {
            return false;
        }
        int i4 = this.f6913z0;
        if (i4 == 3 || this.f6893f0 || ((this.f6894g0 && !this.f6855C0) || (this.f6895h0 && this.f6853B0))) {
            m0();
            return true;
        }
        if (i4 == 2) {
            int i5 = W.y.f2709a;
            W.a.j(i5 >= 23);
            if (i5 >= 23) {
                try {
                    w0();
                } catch (C0133m e4) {
                    W.a.B("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
                    m0();
                    return true;
                }
            }
        }
        M();
        return false;
    }

    public final List O(boolean z4) {
        C0095p c0095p = this.f6872M;
        c0095p.getClass();
        v vVar = this.f6856D;
        ArrayList S3 = S(vVar, c0095p, z4);
        if (S3.isEmpty() && z4) {
            S3 = S(vVar, c0095p, false);
            if (!S3.isEmpty()) {
                W.a.A("MediaCodecRenderer", "Drm session requires secure decoder for " + c0095p.f2325m + ", but no secure decoder available. Trying to proceed with " + S3 + ".");
            }
        }
        return S3;
    }

    public int P(Z.f fVar) {
        return 0;
    }

    public boolean Q() {
        return false;
    }

    public abstract float R(float f4, C0095p[] c0095pArr);

    public abstract ArrayList S(v vVar, C0095p c0095p, boolean z4);

    public abstract h T(m mVar, C0095p c0095p, MediaCrypto mediaCrypto, float f4);

    public abstract void U(Z.f fVar);

    /* JADX WARN: Code restructure failed: missing block: B:256:0x0435, code lost:
    
        if ("stvm8".equals(r4) == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0445, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0425  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(j0.m r19, android.media.MediaCrypto r20) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u.V(j0.m, android.media.MediaCrypto):void");
    }

    public final boolean W(long j4, long j5) {
        C0095p c0095p;
        return j5 < j4 && ((c0095p = this.f6874N) == null || !Objects.equals(c0095p.f2325m, "audio/opus") || j4 - j5 > 80000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r6 != 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        if (r1.p() != null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u.X():void");
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z4) {
        String str;
        C0095p c0095p = this.f6872M;
        c0095p.getClass();
        if (this.f6888a0 == null) {
            try {
                List O3 = O(z4);
                this.f6888a0 = new ArrayDeque();
                if (!O3.isEmpty()) {
                    this.f6888a0.add((m) O3.get(0));
                }
                this.f6889b0 = null;
            } catch (y e4) {
                throw new r(c0095p, e4, z4, -49998);
            }
        }
        if (this.f6888a0.isEmpty()) {
            throw new r(c0095p, null, z4, -49999);
        }
        ArrayDeque arrayDeque = this.f6888a0;
        arrayDeque.getClass();
        while (this.f6883V == null) {
            m mVar = (m) arrayDeque.peekFirst();
            mVar.getClass();
            if (!s0(mVar)) {
                return;
            }
            try {
                V(mVar, mediaCrypto);
            } catch (Exception e5) {
                W.a.B("MediaCodecRenderer", "Failed to initialize decoder: " + mVar, e5);
                arrayDeque.removeFirst();
                String str2 = "Decoder init failed: " + mVar.f6833a + ", " + c0095p;
                if (W.y.f2709a >= 21) {
                    str = e5 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e5).getDiagnosticInfo() : null;
                } else {
                    str = null;
                }
                r rVar = new r(str2, e5, c0095p.f2325m, z4, mVar, str);
                Z(rVar);
                r rVar2 = this.f6889b0;
                if (rVar2 == null) {
                    this.f6889b0 = rVar;
                } else {
                    this.f6889b0 = new r(rVar2.getMessage(), rVar2.getCause(), rVar2.f6841l, rVar2.f6842m, rVar2.f6843n, rVar2.f6844o);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f6889b0;
                }
            }
        }
        this.f6888a0 = null;
    }

    public abstract void Z(Exception exc);

    public abstract void a0(long j4, long j5, String str);

    public abstract void b0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0150, code lost:
    
        if (J() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r4.L(r3) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010b, code lost:
    
        if (J() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013e, code lost:
    
        if (J() == false) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0.C0127g c0(Y.x r13) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u.c0(Y.x):a0.g");
    }

    public abstract void d0(C0095p c0095p, MediaFormat mediaFormat);

    public void e0() {
    }

    public void f0(long j4) {
        this.f6873M0 = j4;
        while (true) {
            ArrayDeque arrayDeque = this.f6868K;
            if (arrayDeque.isEmpty() || j4 < ((t) arrayDeque.peek()).f6847a) {
                return;
            }
            t tVar = (t) arrayDeque.poll();
            tVar.getClass();
            r0(tVar);
            g0();
        }
    }

    public abstract void g0();

    public void h0(Z.f fVar) {
    }

    public void i0(C0095p c0095p) {
    }

    public final void j0() {
        int i4 = this.f6913z0;
        if (i4 == 1) {
            M();
            return;
        }
        if (i4 == 2) {
            M();
            w0();
        } else if (i4 != 3) {
            this.f6862G0 = true;
            n0();
        } else {
            m0();
            X();
        }
    }

    public abstract boolean k0(long j4, long j5, j jVar, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, C0095p c0095p);

    public final boolean l0(int i4) {
        Y.x xVar = this.f3423n;
        xVar.N();
        Z.f fVar = this.f6860F;
        fVar.e();
        int y4 = y(xVar, fVar, i4 | 4);
        if (y4 == -5) {
            c0(xVar);
            return true;
        }
        if (y4 != -4 || !fVar.c(4)) {
            return false;
        }
        this.F0 = true;
        j0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0() {
        try {
            j jVar = this.f6883V;
            if (jVar != null) {
                jVar.release();
                this.f6869K0.f3447b++;
                m mVar = this.f6890c0;
                mVar.getClass();
                b0(mVar.f6833a);
            }
            this.f6883V = null;
            try {
                MediaCrypto mediaCrypto = this.f6879R;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f6883V = null;
            try {
                MediaCrypto mediaCrypto2 = this.f6879R;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void n0() {
    }

    public void o0() {
        this.f6902o0 = -1;
        this.f6861G.f3140p = null;
        this.f6903p0 = -1;
        this.f6904q0 = null;
        this.f6901n0 = -9223372036854775807L;
        this.f6853B0 = false;
        this.f6852A0 = false;
        this.f6898k0 = false;
        this.f6899l0 = false;
        this.f6905r0 = false;
        this.f6906s0 = false;
        this.f6857D0 = -9223372036854775807L;
        this.f6859E0 = -9223372036854775807L;
        this.f6873M0 = -9223372036854775807L;
        this.f6912y0 = 0;
        this.f6913z0 = 0;
        this.f6911x0 = this.f6910w0 ? 1 : 0;
    }

    @Override // a0.AbstractC0125e
    public boolean p() {
        boolean d4;
        if (this.f6872M == null) {
            return false;
        }
        if (m()) {
            d4 = this.f3432y;
        } else {
            a0 a0Var = this.f3428t;
            a0Var.getClass();
            d4 = a0Var.d();
        }
        if (!d4) {
            if (!(this.f6903p0 >= 0)) {
                if (this.f6901n0 == -9223372036854775807L) {
                    return false;
                }
                this.f3427r.getClass();
                if (SystemClock.elapsedRealtime() >= this.f6901n0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void p0() {
        o0();
        this.f6867J0 = null;
        this.f6888a0 = null;
        this.f6890c0 = null;
        this.f6884W = null;
        this.f6885X = null;
        this.f6886Y = false;
        this.f6855C0 = false;
        this.f6887Z = -1.0f;
        this.f6891d0 = 0;
        this.f6892e0 = false;
        this.f6893f0 = false;
        this.f6894g0 = false;
        this.f6895h0 = false;
        this.f6896i0 = false;
        this.f6897j0 = false;
        this.f6900m0 = false;
        this.f6910w0 = false;
        this.f6911x0 = 0;
    }

    @Override // a0.AbstractC0125e
    public void q() {
        this.f6872M = null;
        r0(t.f6846e);
        this.f6868K.clear();
        N();
    }

    public final void q0(K2.o oVar) {
        K2.o oVar2 = this.f6876O;
        if (oVar2 != oVar) {
            if (oVar != null) {
                oVar.e(null);
            }
            if (oVar2 != null) {
                oVar2.K(null);
            }
        }
        this.f6876O = oVar;
    }

    public final void r0(t tVar) {
        this.f6871L0 = tVar;
        if (tVar.f6849c != -9223372036854775807L) {
            this.f6875N0 = true;
            e0();
        }
    }

    @Override // a0.AbstractC0125e
    public void s(long j4, boolean z4) {
        this.F0 = false;
        this.f6862G0 = false;
        this.f6866I0 = false;
        if (this.f6907t0) {
            this.f6865I.e();
            this.f6863H.e();
            this.f6908u0 = false;
            N n4 = this.f6870L;
            n4.getClass();
            n4.f4573a = U.d.f2470a;
            n4.f4575c = 0;
            n4.f4574b = 2;
        } else if (N()) {
            X();
        }
        if (this.f6871L0.f6850d.i() > 0) {
            this.f6864H0 = true;
        }
        this.f6871L0.f6850d.c();
        this.f6868K.clear();
    }

    public boolean s0(m mVar) {
        return true;
    }

    public boolean t0(C0095p c0095p) {
        return false;
    }

    public abstract int u0(v vVar, C0095p c0095p);

    public final boolean v0(C0095p c0095p) {
        if (W.y.f2709a >= 23 && this.f6883V != null && this.f6913z0 != 3 && this.s != 0) {
            float f4 = this.f6882U;
            c0095p.getClass();
            C0095p[] c0095pArr = this.f3429u;
            c0095pArr.getClass();
            float R3 = R(f4, c0095pArr);
            float f5 = this.f6887Z;
            if (f5 == R3) {
                return true;
            }
            if (R3 == -1.0f) {
                if (this.f6852A0) {
                    this.f6912y0 = 1;
                    this.f6913z0 = 3;
                    return false;
                }
                m0();
                X();
                return false;
            }
            if (f5 == -1.0f && R3 <= this.f6858E) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", R3);
            j jVar = this.f6883V;
            jVar.getClass();
            jVar.c(bundle);
            this.f6887Z = R3;
        }
        return true;
    }

    public final void w0() {
        K2.o oVar = this.f6877P;
        oVar.getClass();
        Z.a o2 = oVar.o();
        if (o2 instanceof f0.j) {
            try {
                MediaCrypto mediaCrypto = this.f6879R;
                mediaCrypto.getClass();
                ((f0.j) o2).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e4) {
                throw g(e4, this.f6872M, false, 6006);
            }
        }
        q0(this.f6877P);
        this.f6912y0 = 0;
        this.f6913z0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r7 >= r5) goto L13;
     */
    @Override // a0.AbstractC0125e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(T.C0095p[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            j0.t r1 = r0.f6871L0
            long r1 = r1.f6849c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            j0.t r1 = new j0.t
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.r0(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.f6868K
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.f6857D0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.f6873M0
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            j0.t r1 = new j0.t
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.r0(r1)
            j0.t r1 = r0.f6871L0
            long r1 = r1.f6849c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L63
            r12.g0()
            goto L63
        L55:
            j0.t r9 = new j0.t
            long r3 = r0.f6857D0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u.x(T.p[], long, long):void");
    }

    public final void x0(long j4) {
        C0095p c0095p = (C0095p) this.f6871L0.f6850d.g(j4);
        if (c0095p == null && this.f6875N0 && this.f6885X != null) {
            c0095p = (C0095p) this.f6871L0.f6850d.f();
        }
        if (c0095p != null) {
            this.f6874N = c0095p;
        } else if (!this.f6886Y || this.f6874N == null) {
            return;
        }
        C0095p c0095p2 = this.f6874N;
        c0095p2.getClass();
        d0(c0095p2, this.f6885X);
        this.f6886Y = false;
        this.f6875N0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[LOOP:1: B:33:0x0050->B:42:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[EDGE_INSN: B:43:0x0076->B:44:0x0076 BREAK  A[LOOP:1: B:33:0x0050->B:42:0x0075], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096 A[LOOP:2: B:45:0x0076->B:54:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097 A[EDGE_INSN: B:55:0x0097->B:56:0x0097 BREAK  A[LOOP:2: B:45:0x0076->B:54:0x0096], SYNTHETIC] */
    @Override // a0.AbstractC0125e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.u.z(long, long):void");
    }
}
