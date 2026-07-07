package w0;

import B2.I;
import T.C0088i;
import T.C0094o;
import T.C0095p;
import T.H;
import T.d0;
import W.y;
import a0.AbstractC0125e;
import a0.C0116F;
import a0.C0119I;
import a0.C0126f;
import a0.C0127g;
import a0.SurfaceHolderCallbackC0115E;
import a0.l0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import c0.C0215n;
import f2.c0;
import j0.B;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class m extends j0.u {

    /* renamed from: v1, reason: collision with root package name */
    public static final int[] f8796v1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: w1, reason: collision with root package name */
    public static boolean f8797w1;

    /* renamed from: x1, reason: collision with root package name */
    public static boolean f8798x1;

    /* renamed from: P0, reason: collision with root package name */
    public final Context f8799P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final boolean f8800Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final C0215n f8801R0;

    /* renamed from: S0, reason: collision with root package name */
    public final int f8802S0;

    /* renamed from: T0, reason: collision with root package name */
    public final boolean f8803T0;
    public final p U0;

    /* renamed from: V0, reason: collision with root package name */
    public final I f8804V0;

    /* renamed from: W0, reason: collision with root package name */
    public A0.c f8805W0;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f8806X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f8807Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public C0596f f8808Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f8809a1;

    /* renamed from: b1, reason: collision with root package name */
    public List f8810b1;

    /* renamed from: c1, reason: collision with root package name */
    public Surface f8811c1;

    /* renamed from: d1, reason: collision with root package name */
    public o f8812d1;

    /* renamed from: e1, reason: collision with root package name */
    public W.s f8813e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f8814f1;
    public int g1;

    /* renamed from: h1, reason: collision with root package name */
    public long f8815h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f8816i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f8817j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f8818k1;

    /* renamed from: l1, reason: collision with root package name */
    public long f8819l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f8820m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f8821n1;

    /* renamed from: o1, reason: collision with root package name */
    public d0 f8822o1;

    /* renamed from: p1, reason: collision with root package name */
    public d0 f8823p1;

    /* renamed from: q1, reason: collision with root package name */
    public int f8824q1;

    /* renamed from: r1, reason: collision with root package name */
    public boolean f8825r1;

    /* renamed from: s1, reason: collision with root package name */
    public int f8826s1;
    public l t1;

    /* renamed from: u1, reason: collision with root package name */
    public C0116F f8827u1;

    public m(Context context, j0.i iVar, Handler handler, SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E) {
        super(2, iVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f8799P0 = applicationContext;
        this.f8802S0 = 50;
        this.f8801R0 = new C0215n(handler, surfaceHolderCallbackC0115E);
        this.f8800Q0 = true;
        this.U0 = new p(applicationContext, this);
        this.f8804V0 = new I();
        this.f8803T0 = "NVIDIA".equals(y.f2711c);
        this.f8813e1 = W.s.f2697c;
        this.g1 = 1;
        this.f8822o1 = d0.f2230e;
        this.f8826s1 = 0;
        this.f8823p1 = null;
        this.f8824q1 = -1000;
    }

    public static List A0(Context context, j0.v vVar, C0095p c0095p, boolean z4, boolean z5) {
        List e4;
        String str = c0095p.f2325m;
        if (str == null) {
            return c0.f5550p;
        }
        if (y.f2709a >= 26 && "video/dolby-vision".equals(str) && !k.a(context)) {
            String b4 = B.b(c0095p);
            if (b4 == null) {
                e4 = c0.f5550p;
            } else {
                vVar.getClass();
                e4 = B.e(b4, z4, z5);
            }
            if (!e4.isEmpty()) {
                return e4;
            }
        }
        return B.g(vVar, c0095p, z4, z5);
    }

    public static int B0(j0.m mVar, C0095p c0095p) {
        if (c0095p.f2326n == -1) {
            return z0(mVar, c0095p);
        }
        List list = c0095p.f2328p;
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += ((byte[]) list.get(i5)).length;
        }
        return c0095p.f2326n + i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x074f, code lost:
    
        if (r14.equals("A10-70L") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x08b7, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L662;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.m.y0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0070, code lost:
    
        if (r9.equals("video/hevc") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int z0(j0.m r11, T.C0095p r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.m.z0(j0.m, T.p):int");
    }

    @Override // j0.u, a0.AbstractC0125e
    public final void C(float f4, float f5) {
        super.C(f4, f5);
        C0596f c0596f = this.f8808Z0;
        if (c0596f == null) {
            p pVar = this.U0;
            if (f4 == pVar.f8847j) {
                return;
            }
            pVar.f8847j = f4;
            s sVar = pVar.f8839b;
            sVar.f8862i = f4;
            sVar.f8866m = 0L;
            sVar.f8869p = -1L;
            sVar.f8867n = -1L;
            sVar.d(false);
            return;
        }
        t tVar = c0596f.f8767j.f8771c;
        tVar.getClass();
        W.a.e(f4 > 0.0f);
        p pVar2 = tVar.f8872b;
        if (f4 == pVar2.f8847j) {
            return;
        }
        pVar2.f8847j = f4;
        s sVar2 = pVar2.f8839b;
        sVar2.f8862i = f4;
        sVar2.f8866m = 0L;
        sVar2.f8869p = -1L;
        sVar2.f8867n = -1L;
        sVar2.d(false);
    }

    public final void C0() {
        if (this.f8816i1 > 0) {
            this.f3427r.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = elapsedRealtime - this.f8815h1;
            int i4 = this.f8816i1;
            C0215n c0215n = this.f8801R0;
            Handler handler = c0215n.f4631a;
            if (handler != null) {
                handler.post(new u(c0215n, i4, j4));
            }
            this.f8816i1 = 0;
            this.f8815h1 = elapsedRealtime;
        }
    }

    public final void D0(d0 d0Var) {
        if (d0Var.equals(d0.f2230e) || d0Var.equals(this.f8823p1)) {
            return;
        }
        this.f8823p1 = d0Var;
        this.f8801R0.b(d0Var);
    }

    public final void E0() {
        int i4;
        j0.j jVar;
        if (!this.f8825r1 || (i4 = y.f2709a) < 23 || (jVar = this.f6883V) == null) {
            return;
        }
        this.t1 = new l(this, jVar);
        if (i4 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            jVar.c(bundle);
        }
    }

    public final void F0() {
        Surface surface = this.f8811c1;
        o oVar = this.f8812d1;
        if (surface == oVar) {
            this.f8811c1 = null;
        }
        if (oVar != null) {
            oVar.release();
            this.f8812d1 = null;
        }
    }

    @Override // j0.u
    public final C0127g G(j0.m mVar, C0095p c0095p, C0095p c0095p2) {
        C0127g b4 = mVar.b(c0095p, c0095p2);
        A0.c cVar = this.f8805W0;
        cVar.getClass();
        int i4 = c0095p2.s;
        int i5 = cVar.f7a;
        int i6 = b4.f3482e;
        if (i4 > i5 || c0095p2.f2331t > cVar.f8b) {
            i6 |= 256;
        }
        if (B0(mVar, c0095p2) > cVar.f9c) {
            i6 |= 64;
        }
        int i7 = i6;
        return new C0127g(mVar.f6833a, c0095p, c0095p2, i7 != 0 ? 0 : b4.f3481d, i7);
    }

    public final void G0(j0.j jVar, int i4) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jVar.r(i4, true);
        Trace.endSection();
        this.f6869K0.f3450e++;
        this.f8817j1 = 0;
        if (this.f8808Z0 == null) {
            D0(this.f8822o1);
            p pVar = this.U0;
            boolean z4 = pVar.f8841d != 3;
            pVar.f8841d = 3;
            pVar.f8848k.getClass();
            pVar.f8843f = y.M(SystemClock.elapsedRealtime());
            if (!z4 || (surface = this.f8811c1) == null) {
                return;
            }
            C0215n c0215n = this.f8801R0;
            Handler handler = c0215n.f4631a;
            if (handler != null) {
                handler.post(new v(c0215n, surface, SystemClock.elapsedRealtime()));
            }
            this.f8814f1 = true;
        }
    }

    @Override // j0.u
    public final j0.l H(IllegalStateException illegalStateException, j0.m mVar) {
        Surface surface = this.f8811c1;
        j0.l lVar = new j0.l(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return lVar;
    }

    public final void H0(j0.j jVar, int i4, long j4) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jVar.j(j4, i4);
        Trace.endSection();
        this.f6869K0.f3450e++;
        this.f8817j1 = 0;
        if (this.f8808Z0 == null) {
            D0(this.f8822o1);
            p pVar = this.U0;
            boolean z4 = pVar.f8841d != 3;
            pVar.f8841d = 3;
            pVar.f8848k.getClass();
            pVar.f8843f = y.M(SystemClock.elapsedRealtime());
            if (!z4 || (surface = this.f8811c1) == null) {
                return;
            }
            C0215n c0215n = this.f8801R0;
            Handler handler = c0215n.f4631a;
            if (handler != null) {
                handler.post(new v(c0215n, surface, SystemClock.elapsedRealtime()));
            }
            this.f8814f1 = true;
        }
    }

    public final boolean I0(j0.m mVar) {
        return y.f2709a >= 23 && !this.f8825r1 && !y0(mVar.f6833a) && (!mVar.f6838f || o.d(this.f8799P0));
    }

    public final void J0(j0.j jVar, int i4) {
        Trace.beginSection("skipVideoBuffer");
        jVar.r(i4, false);
        Trace.endSection();
        this.f6869K0.f3451f++;
    }

    public final void K0(int i4, int i5) {
        C0126f c0126f = this.f6869K0;
        c0126f.f3453h += i4;
        int i6 = i4 + i5;
        c0126f.f3452g += i6;
        this.f8816i1 += i6;
        int i7 = this.f8817j1 + i6;
        this.f8817j1 = i7;
        c0126f.f3454i = Math.max(i7, c0126f.f3454i);
        int i8 = this.f8802S0;
        if (i8 <= 0 || this.f8816i1 < i8) {
            return;
        }
        C0();
    }

    public final void L0(long j4) {
        C0126f c0126f = this.f6869K0;
        c0126f.f3456k += j4;
        c0126f.f3457l++;
        this.f8819l1 += j4;
        this.f8820m1++;
    }

    @Override // j0.u
    public final int P(Z.f fVar) {
        return (y.f2709a < 34 || !this.f8825r1 || fVar.f3142r >= this.w) ? 0 : 32;
    }

    @Override // j0.u
    public final boolean Q() {
        return this.f8825r1 && y.f2709a < 23;
    }

    @Override // j0.u
    public final float R(float f4, C0095p[] c0095pArr) {
        float f5 = -1.0f;
        for (C0095p c0095p : c0095pArr) {
            float f6 = c0095p.f2332u;
            if (f6 != -1.0f) {
                f5 = Math.max(f5, f6);
            }
        }
        if (f5 == -1.0f) {
            return -1.0f;
        }
        return f5 * f4;
    }

    @Override // j0.u
    public final ArrayList S(j0.v vVar, C0095p c0095p, boolean z4) {
        List A02 = A0(this.f8799P0, vVar, c0095p, z4, this.f8825r1);
        Pattern pattern = B.f6785a;
        ArrayList arrayList = new ArrayList(A02);
        Collections.sort(arrayList, new j0.w(new B2.x(26, c0095p)));
        return arrayList;
    }

    @Override // j0.u
    public final j0.h T(j0.m mVar, C0095p c0095p, MediaCrypto mediaCrypto, float f4) {
        boolean z4;
        int i4;
        int i5;
        C0088i c0088i;
        int i6;
        A0.c cVar;
        Point point;
        float f5;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        boolean z5;
        int i7;
        char c4;
        boolean z6;
        Pair d4;
        int z02;
        o oVar = this.f8812d1;
        boolean z7 = mVar.f6838f;
        if (oVar != null && oVar.f8835l != z7) {
            F0();
        }
        String str = mVar.f6835c;
        C0095p[] c0095pArr = this.f3429u;
        c0095pArr.getClass();
        int i8 = c0095p.s;
        int B02 = B0(mVar, c0095p);
        int length = c0095pArr.length;
        float f6 = c0095p.f2332u;
        int i9 = c0095p.s;
        C0088i c0088i2 = c0095p.f2336z;
        int i10 = c0095p.f2331t;
        if (length == 1) {
            if (B02 != -1 && (z02 = z0(mVar, c0095p)) != -1) {
                B02 = Math.min((int) (B02 * 1.5f), z02);
            }
            cVar = new A0.c(i8, i10, B02);
            z4 = z7;
            i4 = i10;
            i5 = i9;
            c0088i = c0088i2;
        } else {
            int length2 = c0095pArr.length;
            int i11 = i10;
            int i12 = 0;
            boolean z8 = false;
            while (i12 < length2) {
                C0095p c0095p2 = c0095pArr[i12];
                C0095p[] c0095pArr2 = c0095pArr;
                if (c0088i2 != null && c0095p2.f2336z == null) {
                    C0094o a4 = c0095p2.a();
                    a4.f2301y = c0088i2;
                    c0095p2 = new C0095p(a4);
                }
                if (mVar.b(c0095p, c0095p2).f3481d != 0) {
                    int i13 = c0095p2.f2331t;
                    i7 = length2;
                    int i14 = c0095p2.s;
                    z5 = z7;
                    c4 = 65535;
                    z8 |= i14 == -1 || i13 == -1;
                    i8 = Math.max(i8, i14);
                    i11 = Math.max(i11, i13);
                    B02 = Math.max(B02, B0(mVar, c0095p2));
                } else {
                    z5 = z7;
                    i7 = length2;
                    c4 = 65535;
                }
                i12++;
                c0095pArr = c0095pArr2;
                length2 = i7;
                z7 = z5;
            }
            z4 = z7;
            int i15 = i11;
            if (z8) {
                W.a.A("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i8 + "x" + i15);
                boolean z9 = i10 > i9;
                int i16 = z9 ? i10 : i9;
                int i17 = z9 ? i9 : i10;
                c0088i = c0088i2;
                float f7 = i17 / i16;
                int[] iArr = f8796v1;
                i4 = i10;
                i5 = i9;
                int i18 = 0;
                while (i18 < 9) {
                    int i19 = iArr[i18];
                    int[] iArr2 = iArr;
                    int i20 = (int) (i19 * f7);
                    if (i19 <= i16 || i20 <= i17) {
                        break;
                    }
                    int i21 = i17;
                    int i22 = i16;
                    if (y.f2709a >= 21) {
                        int i23 = z9 ? i20 : i19;
                        if (!z9) {
                            i19 = i20;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f6836d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f5 = f7;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f5 = f7;
                            point2 = new Point(y.g(i23, widthAlignment) * widthAlignment, y.g(i19, heightAlignment) * heightAlignment);
                        }
                        if (point2 != null) {
                            Point point3 = point2;
                            if (mVar.f(point2.x, point2.y, f6)) {
                                point = point3;
                                break;
                            }
                        } else {
                            continue;
                        }
                        i18++;
                        iArr = iArr2;
                        i17 = i21;
                        i16 = i22;
                        f7 = f5;
                    } else {
                        f5 = f7;
                        try {
                            int g4 = y.g(i19, 16) * 16;
                            int g5 = y.g(i20, 16) * 16;
                            if (g4 * g5 <= B.j()) {
                                int i24 = z9 ? g5 : g4;
                                if (!z9) {
                                    g4 = g5;
                                }
                                point = new Point(i24, g4);
                            } else {
                                i18++;
                                iArr = iArr2;
                                i17 = i21;
                                i16 = i22;
                                f7 = f5;
                            }
                        } catch (j0.y unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i8 = Math.max(i8, point.x);
                    i6 = Math.max(i15, point.y);
                    C0094o a5 = c0095p.a();
                    a5.f2296r = i8;
                    a5.s = i6;
                    B02 = Math.max(B02, z0(mVar, new C0095p(a5)));
                    W.a.A("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i8 + "x" + i6);
                    cVar = new A0.c(i8, i6, B02);
                }
            } else {
                i4 = i10;
                i5 = i9;
                c0088i = c0088i2;
            }
            i6 = i15;
            cVar = new A0.c(i8, i6, B02);
        }
        this.f8805W0 = cVar;
        int i25 = this.f8825r1 ? this.f8826s1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i5);
        mediaFormat.setInteger("height", i4);
        W.a.z(mediaFormat, c0095p.f2328p);
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        W.a.v(mediaFormat, "rotation-degrees", c0095p.f2333v);
        if (c0088i != null) {
            C0088i c0088i3 = c0088i;
            W.a.v(mediaFormat, "color-transfer", c0088i3.f2253c);
            W.a.v(mediaFormat, "color-standard", c0088i3.f2251a);
            W.a.v(mediaFormat, "color-range", c0088i3.f2252b);
            byte[] bArr = c0088i3.f2254d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c0095p.f2325m) && (d4 = B.d(c0095p)) != null) {
            W.a.v(mediaFormat, "profile", ((Integer) d4.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.f7a);
        mediaFormat.setInteger("max-height", cVar.f8b);
        W.a.v(mediaFormat, "max-input-size", cVar.f9c);
        int i26 = y.f2709a;
        if (i26 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f4 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f4);
            }
        }
        if (this.f8803T0) {
            z6 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z6 = true;
        }
        if (i25 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z6);
            mediaFormat.setInteger("audio-session-id", i25);
        }
        if (i26 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f8824q1));
        }
        if (this.f8811c1 == null) {
            if (!I0(mVar)) {
                throw new IllegalStateException();
            }
            if (this.f8812d1 == null) {
                this.f8812d1 = o.e(this.f8799P0, z4);
            }
            this.f8811c1 = this.f8812d1;
        }
        C0596f c0596f = this.f8808Z0;
        if (c0596f != null && !y.J(c0596f.f8758a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.f8808Z0 == null) {
            return new j0.h(mVar, mediaFormat, c0095p, this.f8811c1, mediaCrypto);
        }
        W.a.j(false);
        W.a.k(null);
        throw null;
    }

    @Override // j0.u
    public final void U(Z.f fVar) {
        if (this.f8807Y0) {
            ByteBuffer byteBuffer = fVar.s;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b4 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s4 = byteBuffer.getShort();
                byte b5 = byteBuffer.get();
                byte b6 = byteBuffer.get();
                byteBuffer.position(0);
                if (b4 == -75 && s == 60 && s4 == 1 && b5 == 4) {
                    if (b6 == 0 || b6 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        j0.j jVar = this.f6883V;
                        jVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        jVar.c(bundle);
                    }
                }
            }
        }
    }

    @Override // j0.u
    public final void Z(Exception exc) {
        W.a.o("MediaCodecVideoRenderer", "Video codec error", exc);
        C0215n c0215n = this.f8801R0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new u(c0215n, exc, 3));
        }
    }

    @Override // j0.u
    public final void a0(long j4, long j5, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C0215n c0215n = this.f8801R0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new u(c0215n, str, j4, j5));
        }
        this.f8806X0 = y0(str);
        j0.m mVar = this.f6890c0;
        mVar.getClass();
        boolean z4 = false;
        if (y.f2709a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f6834b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f6836d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i4].profile == 16384) {
                    z4 = true;
                    break;
                }
                i4++;
            }
        }
        this.f8807Y0 = z4;
        E0();
    }

    @Override // j0.u
    public final void b0(String str) {
        C0215n c0215n = this.f8801R0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new u(c0215n, str, 5));
        }
    }

    @Override // j0.u
    public final C0127g c0(Y.x xVar) {
        C0127g c02 = super.c0(xVar);
        C0095p c0095p = (C0095p) xVar.f3066n;
        c0095p.getClass();
        C0215n c0215n = this.f8801R0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new W.m(c0215n, c0095p, c02, 16));
        }
        return c02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [android.view.Surface] */
    @Override // a0.AbstractC0125e, a0.h0
    public final void d(int i4, Object obj) {
        Handler handler;
        p pVar = this.U0;
        if (i4 == 1) {
            o oVar = obj instanceof Surface ? (Surface) obj : null;
            if (oVar == null) {
                o oVar2 = this.f8812d1;
                if (oVar2 != null) {
                    oVar = oVar2;
                } else {
                    j0.m mVar = this.f6890c0;
                    if (mVar != null && I0(mVar)) {
                        oVar = o.e(this.f8799P0, mVar.f6838f);
                        this.f8812d1 = oVar;
                    }
                }
            }
            Surface surface = this.f8811c1;
            C0215n c0215n = this.f8801R0;
            if (surface == oVar) {
                if (oVar == null || oVar == this.f8812d1) {
                    return;
                }
                d0 d0Var = this.f8823p1;
                if (d0Var != null) {
                    c0215n.b(d0Var);
                }
                Surface surface2 = this.f8811c1;
                if (surface2 == null || !this.f8814f1 || (handler = c0215n.f4631a) == null) {
                    return;
                }
                handler.post(new v(c0215n, surface2, SystemClock.elapsedRealtime()));
                return;
            }
            this.f8811c1 = oVar;
            if (this.f8808Z0 == null) {
                s sVar = pVar.f8839b;
                sVar.getClass();
                o oVar3 = oVar instanceof o ? null : oVar;
                if (sVar.f8858e != oVar3) {
                    sVar.b();
                    sVar.f8858e = oVar3;
                    sVar.d(true);
                }
                pVar.c(1);
            }
            this.f8814f1 = false;
            int i5 = this.s;
            j0.j jVar = this.f6883V;
            if (jVar != null && this.f8808Z0 == null) {
                if (y.f2709a < 23 || oVar == null || this.f8806X0) {
                    m0();
                    X();
                } else {
                    jVar.l(oVar);
                }
            }
            if (oVar == null || oVar == this.f8812d1) {
                this.f8823p1 = null;
                C0596f c0596f = this.f8808Z0;
                if (c0596f != null) {
                    C0597g c0597g = c0596f.f8767j;
                    c0597g.getClass();
                    int i6 = W.s.f2697c.f2698a;
                    c0597g.f8778j = null;
                }
            } else {
                d0 d0Var2 = this.f8823p1;
                if (d0Var2 != null) {
                    c0215n.b(d0Var2);
                }
                if (i5 == 2) {
                    pVar.b(true);
                }
            }
            E0();
            return;
        }
        if (i4 == 7) {
            obj.getClass();
            C0116F c0116f = (C0116F) obj;
            this.f8827u1 = c0116f;
            C0596f c0596f2 = this.f8808Z0;
            if (c0596f2 != null) {
                c0596f2.f8767j.f8776h = c0116f;
                return;
            }
            return;
        }
        if (i4 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f8826s1 != intValue) {
                this.f8826s1 = intValue;
                if (this.f8825r1) {
                    m0();
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 16) {
            obj.getClass();
            this.f8824q1 = ((Integer) obj).intValue();
            j0.j jVar2 = this.f6883V;
            if (jVar2 != null && y.f2709a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f8824q1));
                jVar2.c(bundle);
                return;
            }
            return;
        }
        if (i4 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.g1 = intValue2;
            j0.j jVar3 = this.f6883V;
            if (jVar3 != null) {
                jVar3.A(intValue2);
                return;
            }
            return;
        }
        if (i4 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            s sVar2 = pVar.f8839b;
            if (sVar2.f8863j == intValue3) {
                return;
            }
            sVar2.f8863j = intValue3;
            sVar2.d(true);
            return;
        }
        if (i4 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f8810b1 = list;
            C0596f c0596f3 = this.f8808Z0;
            if (c0596f3 != null) {
                ArrayList arrayList = c0596f3.f8760c;
                if (arrayList.equals(list)) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(list);
                c0596f3.c();
                return;
            }
            return;
        }
        if (i4 != 14) {
            if (i4 == 11) {
                this.f6878Q = (C0119I) obj;
                return;
            }
            return;
        }
        obj.getClass();
        W.s sVar3 = (W.s) obj;
        if (sVar3.f2698a == 0 || sVar3.f2699b == 0) {
            return;
        }
        this.f8813e1 = sVar3;
        C0596f c0596f4 = this.f8808Z0;
        if (c0596f4 != null) {
            Surface surface3 = this.f8811c1;
            W.a.k(surface3);
            c0596f4.e(surface3, sVar3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        if (r9.f8808Z0 == null) goto L36;
     */
    @Override // j0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(T.C0095p r10, android.media.MediaFormat r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.m.d0(T.p, android.media.MediaFormat):void");
    }

    @Override // j0.u
    public final void f0(long j4) {
        super.f0(j4);
        if (this.f8825r1) {
            return;
        }
        this.f8818k1--;
    }

    @Override // j0.u
    public final void g0() {
        if (this.f8808Z0 != null) {
            long j4 = this.f6871L0.f6849c;
        } else {
            this.U0.c(2);
        }
        E0();
    }

    @Override // a0.AbstractC0125e
    public final void h() {
        C0596f c0596f = this.f8808Z0;
        if (c0596f != null) {
            p pVar = c0596f.f8767j.f8770b;
            if (pVar.f8841d == 0) {
                pVar.f8841d = 1;
                return;
            }
            return;
        }
        p pVar2 = this.U0;
        if (pVar2.f8841d == 0) {
            pVar2.f8841d = 1;
        }
    }

    @Override // j0.u
    public final void h0(Z.f fVar) {
        Surface surface;
        boolean z4 = this.f8825r1;
        if (!z4) {
            this.f8818k1++;
        }
        if (y.f2709a >= 23 || !z4) {
            return;
        }
        long j4 = fVar.f3142r;
        x0(j4);
        D0(this.f8822o1);
        this.f6869K0.f3450e++;
        p pVar = this.U0;
        boolean z5 = pVar.f8841d != 3;
        pVar.f8841d = 3;
        pVar.f8848k.getClass();
        pVar.f8843f = y.M(SystemClock.elapsedRealtime());
        if (z5 && (surface = this.f8811c1) != null) {
            C0215n c0215n = this.f8801R0;
            Handler handler = c0215n.f4631a;
            if (handler != null) {
                handler.post(new v(c0215n, surface, SystemClock.elapsedRealtime()));
            }
            this.f8814f1 = true;
        }
        f0(j4);
    }

    @Override // j0.u
    public final void i0(C0095p c0095p) {
        C0596f c0596f = this.f8808Z0;
        if (c0596f == null) {
            return;
        }
        try {
            c0596f.b(c0095p);
            throw null;
        } catch (x e4) {
            throw g(e4, c0095p, false, 7000);
        }
    }

    @Override // j0.u
    public final boolean k0(long j4, long j5, j0.j jVar, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, C0095p c0095p) {
        jVar.getClass();
        j0.t tVar = this.f6871L0;
        long j7 = j6 - tVar.f6849c;
        int a4 = this.U0.a(j6, j4, j5, tVar.f6848b, z5, this.f8804V0);
        if (a4 == 4) {
            return false;
        }
        if (z4 && !z5) {
            J0(jVar, i4);
            return true;
        }
        Surface surface = this.f8811c1;
        o oVar = this.f8812d1;
        I i7 = this.f8804V0;
        if (surface == oVar && this.f8808Z0 == null) {
            if (i7.f122a >= 30000) {
                return false;
            }
            J0(jVar, i4);
            L0(i7.f122a);
            return true;
        }
        C0596f c0596f = this.f8808Z0;
        if (c0596f != null) {
            try {
                c0596f.d(j4, j5);
                C0596f c0596f2 = this.f8808Z0;
                c0596f2.getClass();
                W.a.j(false);
                W.a.j(c0596f2.f8759b != -1);
                long j8 = c0596f2.f8764g;
                if (j8 != -9223372036854775807L) {
                    C0597g c0597g = c0596f2.f8767j;
                    if (c0597g.f8779k == 0) {
                        long j9 = c0597g.f8771c.f8880j;
                        if (j9 != -9223372036854775807L && j9 >= j8) {
                            c0596f2.c();
                            c0596f2.f8764g = -9223372036854775807L;
                        }
                    }
                    return false;
                }
                W.a.k(null);
                throw null;
            } catch (x e4) {
                throw g(e4, e4.f8887l, false, 7001);
            }
        }
        if (a4 == 0) {
            this.f3427r.getClass();
            long nanoTime = System.nanoTime();
            C0116F c0116f = this.f8827u1;
            if (c0116f != null) {
                c0116f.c(j7, nanoTime);
            }
            if (y.f2709a >= 21) {
                H0(jVar, i4, nanoTime);
            } else {
                G0(jVar, i4);
            }
            L0(i7.f122a);
            return true;
        }
        if (a4 != 1) {
            if (a4 == 2) {
                Trace.beginSection("dropVideoBuffer");
                jVar.r(i4, false);
                Trace.endSection();
                K0(0, 1);
                L0(i7.f122a);
                return true;
            }
            if (a4 != 3) {
                if (a4 == 5) {
                    return false;
                }
                throw new IllegalStateException(String.valueOf(a4));
            }
            J0(jVar, i4);
            L0(i7.f122a);
            return true;
        }
        long j10 = i7.f123b;
        long j11 = i7.f122a;
        if (y.f2709a >= 21) {
            if (j10 == this.f8821n1) {
                J0(jVar, i4);
            } else {
                C0116F c0116f2 = this.f8827u1;
                if (c0116f2 != null) {
                    c0116f2.c(j7, j10);
                }
                H0(jVar, i4, j10);
            }
            L0(j11);
            this.f8821n1 = j10;
        } else {
            if (j11 >= 30000) {
                return false;
            }
            if (j11 > 11000) {
                try {
                    Thread.sleep((j11 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            C0116F c0116f3 = this.f8827u1;
            if (c0116f3 != null) {
                c0116f3.c(j7, j10);
            }
            G0(jVar, i4);
            L0(j11);
        }
        return true;
    }

    @Override // a0.AbstractC0125e
    public final String l() {
        return "MediaCodecVideoRenderer";
    }

    @Override // a0.AbstractC0125e
    public final boolean n() {
        return this.f6862G0 && this.f8808Z0 == null;
    }

    @Override // j0.u
    public final void o0() {
        super.o0();
        this.f8818k1 = 0;
    }

    @Override // j0.u, a0.AbstractC0125e
    public final boolean p() {
        o oVar;
        boolean z4 = super.p() && this.f8808Z0 == null;
        if (z4 && (((oVar = this.f8812d1) != null && this.f8811c1 == oVar) || this.f6883V == null || this.f8825r1)) {
            return true;
        }
        p pVar = this.U0;
        if (z4 && pVar.f8841d == 3) {
            pVar.f8845h = -9223372036854775807L;
        } else {
            if (pVar.f8845h == -9223372036854775807L) {
                return false;
            }
            pVar.f8848k.getClass();
            if (SystemClock.elapsedRealtime() >= pVar.f8845h) {
                pVar.f8845h = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    @Override // j0.u, a0.AbstractC0125e
    public final void q() {
        C0215n c0215n = this.f8801R0;
        this.f8823p1 = null;
        C0596f c0596f = this.f8808Z0;
        if (c0596f != null) {
            c0596f.f8767j.f8770b.c(0);
        } else {
            this.U0.c(0);
        }
        E0();
        this.f8814f1 = false;
        this.t1 = null;
        try {
            super.q();
            C0126f c0126f = this.f6869K0;
            c0215n.getClass();
            synchronized (c0126f) {
            }
            Handler handler = c0215n.f4631a;
            if (handler != null) {
                handler.post(new W.m(17, c0215n, c0126f));
            }
            c0215n.b(d0.f2230e);
        } catch (Throwable th) {
            C0126f c0126f2 = this.f6869K0;
            c0215n.getClass();
            synchronized (c0126f2) {
                Handler handler2 = c0215n.f4631a;
                if (handler2 != null) {
                    handler2.post(new W.m(17, c0215n, c0126f2));
                }
                c0215n.b(d0.f2230e);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, a0.f] */
    @Override // a0.AbstractC0125e
    public final void r(boolean z4, boolean z5) {
        this.f6869K0 = new Object();
        l0 l0Var = this.f3424o;
        l0Var.getClass();
        boolean z6 = l0Var.f3541b;
        W.a.j((z6 && this.f8826s1 == 0) ? false : true);
        if (this.f8825r1 != z6) {
            this.f8825r1 = z6;
            m0();
        }
        C0126f c0126f = this.f6869K0;
        C0215n c0215n = this.f8801R0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new u(c0215n, c0126f, 4));
        }
        boolean z7 = this.f8809a1;
        p pVar = this.U0;
        if (!z7) {
            if ((this.f8810b1 != null || !this.f8800Q0) && this.f8808Z0 == null) {
                N1.r rVar = new N1.r(this.f8799P0, pVar);
                W.t tVar = this.f3427r;
                tVar.getClass();
                rVar.f1312f = tVar;
                W.a.j(!rVar.f1307a);
                if (((C0593c) rVar.f1311e) == null) {
                    if (((C0592b) rVar.f1310d) == null) {
                        rVar.f1310d = new Object();
                    }
                    rVar.f1311e = new C0593c((C0592b) rVar.f1310d);
                }
                C0597g c0597g = new C0597g(rVar);
                rVar.f1307a = true;
                this.f8808Z0 = c0597g.f8769a;
            }
            this.f8809a1 = true;
        }
        C0596f c0596f = this.f8808Z0;
        if (c0596f == null) {
            W.t tVar2 = this.f3427r;
            tVar2.getClass();
            pVar.f8848k = tVar2;
            pVar.f8841d = z5 ? 1 : 0;
            return;
        }
        C0591a c0591a = new C0591a(this);
        j2.a aVar = j2.a.f6921l;
        c0596f.f8765h = c0591a;
        c0596f.f8766i = aVar;
        C0116F c0116f = this.f8827u1;
        if (c0116f != null) {
            c0596f.f8767j.f8776h = c0116f;
        }
        if (this.f8811c1 != null && !this.f8813e1.equals(W.s.f2697c)) {
            this.f8808Z0.e(this.f8811c1, this.f8813e1);
        }
        C0596f c0596f2 = this.f8808Z0;
        float f4 = this.f6881T;
        t tVar3 = c0596f2.f8767j.f8771c;
        tVar3.getClass();
        W.a.e(f4 > 0.0f);
        p pVar2 = tVar3.f8872b;
        if (f4 != pVar2.f8847j) {
            pVar2.f8847j = f4;
            s sVar = pVar2.f8839b;
            sVar.f8862i = f4;
            sVar.f8866m = 0L;
            sVar.f8869p = -1L;
            sVar.f8867n = -1L;
            sVar.d(false);
        }
        List list = this.f8810b1;
        if (list != null) {
            C0596f c0596f3 = this.f8808Z0;
            ArrayList arrayList = c0596f3.f8760c;
            if (!arrayList.equals(list)) {
                arrayList.clear();
                arrayList.addAll(list);
                c0596f3.c();
            }
        }
        this.f8808Z0.f8767j.f8770b.f8841d = z5 ? 1 : 0;
    }

    @Override // j0.u, a0.AbstractC0125e
    public final void s(long j4, boolean z4) {
        C0596f c0596f = this.f8808Z0;
        if (c0596f != null) {
            c0596f.a(true);
            C0596f c0596f2 = this.f8808Z0;
            long j5 = this.f6871L0.f6849c;
            c0596f2.getClass();
        }
        super.s(j4, z4);
        C0596f c0596f3 = this.f8808Z0;
        p pVar = this.U0;
        if (c0596f3 == null) {
            s sVar = pVar.f8839b;
            sVar.f8866m = 0L;
            sVar.f8869p = -1L;
            sVar.f8867n = -1L;
            pVar.f8844g = -9223372036854775807L;
            pVar.f8842e = -9223372036854775807L;
            pVar.c(1);
            pVar.f8845h = -9223372036854775807L;
        }
        if (z4) {
            pVar.b(false);
        }
        E0();
        this.f8817j1 = 0;
    }

    @Override // j0.u
    public final boolean s0(j0.m mVar) {
        return this.f8811c1 != null || I0(mVar);
    }

    @Override // a0.AbstractC0125e
    public final void t() {
        C0596f c0596f = this.f8808Z0;
        if (c0596f == null || !this.f8800Q0) {
            return;
        }
        C0597g c0597g = c0596f.f8767j;
        if (c0597g.f8780l == 2) {
            return;
        }
        W.v vVar = c0597g.f8777i;
        if (vVar != null) {
            vVar.f2703a.removeCallbacksAndMessages(null);
        }
        c0597g.f8778j = null;
        c0597g.f8780l = 2;
    }

    @Override // a0.AbstractC0125e
    public final void u() {
        try {
            try {
                I();
                m0();
                K2.o oVar = this.f6877P;
                if (oVar != null) {
                    oVar.K(null);
                }
                this.f6877P = null;
            } catch (Throwable th) {
                K2.o oVar2 = this.f6877P;
                if (oVar2 != null) {
                    oVar2.K(null);
                }
                this.f6877P = null;
                throw th;
            }
        } finally {
            this.f8809a1 = false;
            if (this.f8812d1 != null) {
                F0();
            }
        }
    }

    @Override // j0.u
    public final int u0(j0.v vVar, C0095p c0095p) {
        boolean z4;
        int i4 = 26;
        int i5 = 0;
        if (!H.k(c0095p.f2325m)) {
            return AbstractC0125e.f(0, 0, 0, 0);
        }
        boolean z5 = c0095p.f2329q != null;
        Context context = this.f8799P0;
        List A02 = A0(context, vVar, c0095p, z5, false);
        if (z5 && A02.isEmpty()) {
            A02 = A0(context, vVar, c0095p, false, false);
        }
        if (A02.isEmpty()) {
            return AbstractC0125e.f(1, 0, 0, 0);
        }
        int i6 = c0095p.J;
        if (i6 != 0 && i6 != 2) {
            return AbstractC0125e.f(2, 0, 0, 0);
        }
        j0.m mVar = (j0.m) A02.get(0);
        boolean d4 = mVar.d(c0095p);
        if (!d4) {
            for (int i7 = 1; i7 < A02.size(); i7++) {
                j0.m mVar2 = (j0.m) A02.get(i7);
                if (mVar2.d(c0095p)) {
                    d4 = true;
                    z4 = false;
                    mVar = mVar2;
                    break;
                }
            }
        }
        z4 = true;
        int i8 = d4 ? 4 : 3;
        int i9 = mVar.e(c0095p) ? 16 : 8;
        int i10 = mVar.f6839g ? 64 : 0;
        int i11 = z4 ? 128 : 0;
        if (y.f2709a >= 26 && "video/dolby-vision".equals(c0095p.f2325m) && !k.a(context)) {
            i11 = 256;
        }
        if (d4) {
            List A03 = A0(context, vVar, c0095p, z5, true);
            if (!A03.isEmpty()) {
                Pattern pattern = B.f6785a;
                ArrayList arrayList = new ArrayList(A03);
                Collections.sort(arrayList, new j0.w(new B2.x(i4, c0095p)));
                j0.m mVar3 = (j0.m) arrayList.get(0);
                if (mVar3.d(c0095p) && mVar3.e(c0095p)) {
                    i5 = 32;
                }
            }
        }
        return i8 | i9 | i5 | i10 | i11;
    }

    @Override // a0.AbstractC0125e
    public final void v() {
        this.f8816i1 = 0;
        this.f3427r.getClass();
        this.f8815h1 = SystemClock.elapsedRealtime();
        this.f8819l1 = 0L;
        this.f8820m1 = 0;
        C0596f c0596f = this.f8808Z0;
        if (c0596f != null) {
            c0596f.f8767j.f8770b.d();
        } else {
            this.U0.d();
        }
    }

    @Override // a0.AbstractC0125e
    public final void w() {
        C0();
        int i4 = this.f8820m1;
        if (i4 != 0) {
            long j4 = this.f8819l1;
            C0215n c0215n = this.f8801R0;
            Handler handler = c0215n.f4631a;
            if (handler != null) {
                handler.post(new u(c0215n, j4, i4));
            }
            this.f8819l1 = 0L;
            this.f8820m1 = 0;
        }
        C0596f c0596f = this.f8808Z0;
        if (c0596f != null) {
            c0596f.f8767j.f8770b.e();
        } else {
            this.U0.e();
        }
    }

    @Override // j0.u, a0.AbstractC0125e
    public final void z(long j4, long j5) {
        super.z(j4, j5);
        C0596f c0596f = this.f8808Z0;
        if (c0596f != null) {
            try {
                c0596f.d(j4, j5);
            } catch (x e4) {
                throw g(e4, e4.f8887l, false, 7001);
            }
        }
    }
}
