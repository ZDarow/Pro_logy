package c0;

import T.C0084e;
import T.C0085f;
import T.C0094o;
import T.C0095p;
import a0.C0119I;
import a0.C0127g;
import a0.S;
import a0.SurfaceHolderCallbackC0115E;
import a0.l0;
import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import f2.c0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class M extends j0.u implements S {

    /* renamed from: P0, reason: collision with root package name */
    public final Context f4559P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final C0215n f4560Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final J f4561R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f4562S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f4563T0;
    public boolean U0;

    /* renamed from: V0, reason: collision with root package name */
    public C0095p f4564V0;

    /* renamed from: W0, reason: collision with root package name */
    public C0095p f4565W0;

    /* renamed from: X0, reason: collision with root package name */
    public long f4566X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f4567Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f4568Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f4569a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f4570b1;

    public M(Context context, j0.i iVar, Handler handler, SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E, J j4) {
        super(1, iVar, 44100.0f);
        this.f4559P0 = context.getApplicationContext();
        this.f4561R0 = j4;
        this.f4570b1 = -1000;
        this.f4560Q0 = new C0215n(handler, surfaceHolderCallbackC0115E);
        j4.s = new K2.o(24, this);
    }

    public final void A0() {
        long j4;
        ArrayDeque arrayDeque;
        long y4;
        long j5;
        boolean n4 = n();
        J j6 = this.f4561R0;
        if (!j6.l() || j6.f4509N) {
            j4 = Long.MIN_VALUE;
        } else {
            long min = Math.min(j6.f4538i.a(n4), W.y.S(j6.h(), j6.f4553u.f4474e));
            while (true) {
                arrayDeque = j6.f4540j;
                if (arrayDeque.isEmpty() || min < ((D) arrayDeque.getFirst()).f4484c) {
                    break;
                } else {
                    j6.f4499C = (D) arrayDeque.remove();
                }
            }
            long j7 = min - j6.f4499C.f4484c;
            boolean isEmpty = arrayDeque.isEmpty();
            android.support.v4.media.session.t tVar = j6.f4524b;
            if (isEmpty) {
                U.g gVar = (U.g) tVar.f3736o;
                if (gVar.a()) {
                    if (gVar.f2512o >= 1024) {
                        long j8 = gVar.f2511n;
                        gVar.f2507j.getClass();
                        long j9 = j8 - ((r3.f2488k * r3.f2479b) * 2);
                        int i4 = gVar.f2505h.f2466a;
                        int i5 = gVar.f2504g.f2466a;
                        j5 = i4 == i5 ? W.y.U(j7, j9, gVar.f2512o, RoundingMode.FLOOR) : W.y.U(j7, j9 * i4, gVar.f2512o * i5, RoundingMode.FLOOR);
                    } else {
                        j5 = (long) (gVar.f2500c * j7);
                    }
                    j7 = j5;
                }
                y4 = j6.f4499C.f4483b + j7;
            } else {
                D d4 = (D) arrayDeque.getFirst();
                y4 = d4.f4483b - W.y.y(d4.f4484c - min, j6.f4499C.f4482a.f2127a);
            }
            long j10 = ((O) tVar.f3735n).f4584q;
            j4 = W.y.S(j10, j6.f4553u.f4474e) + y4;
            long j11 = j6.f4541j0;
            if (j10 > j11) {
                long S3 = W.y.S(j10 - j11, j6.f4553u.f4474e);
                j6.f4541j0 = j10;
                j6.f4543k0 += S3;
                if (j6.f4545l0 == null) {
                    j6.f4545l0 = new Handler(Looper.myLooper());
                }
                j6.f4545l0.removeCallbacksAndMessages(null);
                j6.f4545l0.postDelayed(new F2.c(4, j6), 100L);
            }
        }
        if (j4 != Long.MIN_VALUE) {
            if (!this.f4567Y0) {
                j4 = Math.max(this.f4566X0, j4);
            }
            this.f4566X0 = j4;
            this.f4567Y0 = false;
        }
    }

    @Override // j0.u
    public final C0127g G(j0.m mVar, C0095p c0095p, C0095p c0095p2) {
        C0127g b4 = mVar.b(c0095p, c0095p2);
        boolean z4 = this.f6877P == null && t0(c0095p2);
        int i4 = b4.f3482e;
        if (z4) {
            i4 |= 32768;
        }
        if (z0(mVar, c0095p2) > this.f4562S0) {
            i4 |= 64;
        }
        int i5 = i4;
        return new C0127g(mVar.f6833a, c0095p, c0095p2, i5 == 0 ? b4.f3481d : 0, i5);
    }

    @Override // j0.u
    public final float R(float f4, C0095p[] c0095pArr) {
        int i4 = -1;
        for (C0095p c0095p : c0095pArr) {
            int i5 = c0095p.f2304B;
            if (i5 != -1) {
                i4 = Math.max(i4, i5);
            }
        }
        if (i4 == -1) {
            return -1.0f;
        }
        return f4 * i4;
    }

    @Override // j0.u
    public final ArrayList S(j0.v vVar, C0095p c0095p, boolean z4) {
        c0 g4;
        if (c0095p.f2325m == null) {
            g4 = c0.f5550p;
        } else {
            if (this.f4561R0.f(c0095p) != 0) {
                List e4 = j0.B.e("audio/raw", false, false);
                j0.m mVar = e4.isEmpty() ? null : (j0.m) e4.get(0);
                if (mVar != null) {
                    g4 = f2.I.o(mVar);
                }
            }
            g4 = j0.B.g(vVar, c0095p, z4, false);
        }
        Pattern pattern = j0.B.f6785a;
        ArrayList arrayList = new ArrayList(g4);
        Collections.sort(arrayList, new j0.w(new B2.x(26, c0095p)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if ("AXON 7 mini".equals(r2) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    @Override // j0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j0.h T(j0.m r12, T.C0095p r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.M.T(j0.m, T.p, android.media.MediaCrypto, float):j0.h");
    }

    @Override // j0.u
    public final void U(Z.f fVar) {
        C0095p c0095p;
        C c4;
        if (W.y.f2709a < 29 || (c0095p = fVar.f3138n) == null || !Objects.equals(c0095p.f2325m, "audio/opus") || !this.f6907t0) {
            return;
        }
        ByteBuffer byteBuffer = fVar.s;
        byteBuffer.getClass();
        C0095p c0095p2 = fVar.f3138n;
        c0095p2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i4 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            J j4 = this.f4561R0;
            AudioTrack audioTrack = j4.w;
            if (audioTrack == null || !J.m(audioTrack) || (c4 = j4.f4553u) == null || !c4.f4480k) {
                return;
            }
            j4.w.setOffloadDelayPadding(c0095p2.f2306D, i4);
        }
    }

    @Override // j0.u
    public final void Z(Exception exc) {
        W.a.o("MediaCodecAudioRenderer", "Audio codec error", exc);
        C0215n c0215n = this.f4560Q0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new RunnableC0214m(c0215n, exc, 3));
        }
    }

    @Override // a0.S
    public final void a(T.K k4) {
        J j4 = this.f4561R0;
        j4.getClass();
        j4.f4500D = new T.K(W.y.i(k4.f2127a, 0.1f, 8.0f), W.y.i(k4.f2128b, 0.1f, 8.0f));
        if (j4.t()) {
            j4.s();
            return;
        }
        D d4 = new D(k4, -9223372036854775807L, -9223372036854775807L);
        if (j4.l()) {
            j4.f4498B = d4;
        } else {
            j4.f4499C = d4;
        }
    }

    @Override // j0.u
    public final void a0(long j4, long j5, String str) {
        C0215n c0215n = this.f4560Q0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new RunnableC0214m(c0215n, str, j4, j5));
        }
    }

    @Override // a0.S
    public final T.K b() {
        return this.f4561R0.f4500D;
    }

    @Override // j0.u
    public final void b0(String str) {
        C0215n c0215n = this.f4560Q0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new RunnableC0214m(c0215n, str, 7));
        }
    }

    @Override // a0.S
    public final boolean c() {
        boolean z4 = this.f4569a1;
        this.f4569a1 = false;
        return z4;
    }

    @Override // j0.u
    public final C0127g c0(Y.x xVar) {
        C0095p c0095p = (C0095p) xVar.f3066n;
        c0095p.getClass();
        this.f4564V0 = c0095p;
        C0127g c02 = super.c0(xVar);
        C0215n c0215n = this.f4560Q0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new RunnableC0214m(c0215n, c0095p, c02));
        }
        return c02;
    }

    @Override // a0.AbstractC0125e, a0.h0
    public final void d(int i4, Object obj) {
        J j4 = this.f4561R0;
        if (i4 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (j4.f4511P != floatValue) {
                j4.f4511P = floatValue;
                if (j4.l()) {
                    if (W.y.f2709a >= 21) {
                        j4.w.setVolume(j4.f4511P);
                        return;
                    }
                    AudioTrack audioTrack = j4.w;
                    float f4 = j4.f4511P;
                    audioTrack.setStereoVolume(f4, f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 3) {
            C0084e c0084e = (C0084e) obj;
            c0084e.getClass();
            if (j4.f4497A.equals(c0084e)) {
                return;
            }
            j4.f4497A = c0084e;
            if (j4.f4529d0) {
                return;
            }
            C0210i c0210i = j4.f4556y;
            if (c0210i != null) {
                c0210i.f4619i = c0084e;
                c0210i.a(C0206e.b(c0210i.f4611a, c0084e, c0210i.f4618h));
            }
            j4.d();
            return;
        }
        if (i4 == 6) {
            C0085f c0085f = (C0085f) obj;
            c0085f.getClass();
            if (j4.f4525b0.equals(c0085f)) {
                return;
            }
            if (j4.w != null) {
                j4.f4525b0.getClass();
            }
            j4.f4525b0 = c0085f;
            return;
        }
        if (i4 == 12) {
            if (W.y.f2709a >= 23) {
                L.a(j4, obj);
                return;
            }
            return;
        }
        if (i4 == 16) {
            obj.getClass();
            this.f4570b1 = ((Integer) obj).intValue();
            j0.j jVar = this.f6883V;
            if (jVar != null && W.y.f2709a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f4570b1));
                jVar.c(bundle);
                return;
            }
            return;
        }
        if (i4 == 9) {
            obj.getClass();
            j4.f4501E = ((Boolean) obj).booleanValue();
            D d4 = new D(j4.t() ? T.K.f2126d : j4.f4500D, -9223372036854775807L, -9223372036854775807L);
            if (j4.l()) {
                j4.f4498B = d4;
                return;
            } else {
                j4.f4499C = d4;
                return;
            }
        }
        if (i4 != 10) {
            if (i4 == 11) {
                this.f6878Q = (C0119I) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        if (j4.f4523a0 != intValue) {
            j4.f4523a0 = intValue;
            j4.f4521Z = intValue != 0;
            j4.d();
        }
    }

    @Override // j0.u
    public final void d0(C0095p c0095p, MediaFormat mediaFormat) {
        int i4;
        C0095p c0095p2 = this.f4565W0;
        boolean z4 = true;
        int[] iArr = null;
        if (c0095p2 != null) {
            c0095p = c0095p2;
        } else if (this.f6883V != null) {
            mediaFormat.getClass();
            int A4 = "audio/raw".equals(c0095p.f2325m) ? c0095p.f2305C : (W.y.f2709a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? W.y.A(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            C0094o c0094o = new C0094o();
            c0094o.f2290l = T.H.l("audio/raw");
            c0094o.f2271B = A4;
            c0094o.f2272C = c0095p.f2306D;
            c0094o.f2273D = c0095p.f2307E;
            c0094o.f2288j = c0095p.f2323k;
            c0094o.f2279a = c0095p.f2313a;
            c0094o.f2280b = c0095p.f2314b;
            c0094o.f2281c = f2.I.j(c0095p.f2315c);
            c0094o.f2282d = c0095p.f2316d;
            c0094o.f2283e = c0095p.f2317e;
            c0094o.f2284f = c0095p.f2318f;
            c0094o.f2302z = mediaFormat.getInteger("channel-count");
            c0094o.f2270A = mediaFormat.getInteger("sample-rate");
            C0095p c0095p3 = new C0095p(c0094o);
            boolean z5 = this.f4563T0;
            int i5 = c0095p3.f2303A;
            if (z5 && i5 == 6 && (i4 = c0095p.f2303A) < 6) {
                iArr = new int[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr[i6] = i6;
                }
            } else if (this.U0) {
                if (i5 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i5 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i5 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i5 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i5 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            c0095p = c0095p3;
        }
        try {
            int i7 = W.y.f2709a;
            J j4 = this.f4561R0;
            if (i7 >= 29) {
                if (this.f6907t0) {
                    l0 l0Var = this.f3424o;
                    l0Var.getClass();
                    if (l0Var.f3540a != 0) {
                        l0 l0Var2 = this.f3424o;
                        l0Var2.getClass();
                        int i8 = l0Var2.f3540a;
                        j4.getClass();
                        if (i7 < 29) {
                            z4 = false;
                        }
                        W.a.j(z4);
                        j4.f4544l = i8;
                    }
                }
                j4.getClass();
                if (i7 < 29) {
                    z4 = false;
                }
                W.a.j(z4);
                j4.f4544l = 0;
            }
            j4.b(c0095p, iArr);
        } catch (C0216o e4) {
            throw g(e4, e4.f4633l, false, 5001);
        }
    }

    @Override // a0.S
    public final long e() {
        if (this.s == 2) {
            A0();
        }
        return this.f4566X0;
    }

    @Override // j0.u
    public final void e0() {
        this.f4561R0.getClass();
    }

    @Override // j0.u
    public final void g0() {
        this.f4561R0.f4508M = true;
    }

    @Override // a0.AbstractC0125e
    public final S k() {
        return this;
    }

    @Override // j0.u
    public final boolean k0(long j4, long j5, j0.j jVar, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, C0095p c0095p) {
        int i7;
        int i8;
        byteBuffer.getClass();
        if (this.f4565W0 != null && (i5 & 2) != 0) {
            jVar.getClass();
            jVar.r(i4, false);
            return true;
        }
        J j7 = this.f4561R0;
        if (z4) {
            if (jVar != null) {
                jVar.r(i4, false);
            }
            this.f6869K0.f3451f += i6;
            j7.f4508M = true;
            return true;
        }
        try {
            if (!j7.i(j6, byteBuffer, i6)) {
                return false;
            }
            if (jVar != null) {
                jVar.r(i4, false);
            }
            this.f6869K0.f3450e += i6;
            return true;
        } catch (C0217p e4) {
            C0095p c0095p2 = this.f4564V0;
            if (this.f6907t0) {
                l0 l0Var = this.f3424o;
                l0Var.getClass();
                if (l0Var.f3540a != 0) {
                    i8 = 5004;
                    throw g(e4, c0095p2, e4.f4635m, i8);
                }
            }
            i8 = 5001;
            throw g(e4, c0095p2, e4.f4635m, i8);
        } catch (r e5) {
            if (this.f6907t0) {
                l0 l0Var2 = this.f3424o;
                l0Var2.getClass();
                if (l0Var2.f3540a != 0) {
                    i7 = 5003;
                    throw g(e5, c0095p, e5.f4637m, i7);
                }
            }
            i7 = 5002;
            throw g(e5, c0095p, e5.f4637m, i7);
        }
    }

    @Override // a0.AbstractC0125e
    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    @Override // a0.AbstractC0125e
    public final boolean n() {
        if (this.f6862G0) {
            J j4 = this.f4561R0;
            if (!j4.l() || (j4.f4517V && !j4.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // j0.u
    public final void n0() {
        try {
            J j4 = this.f4561R0;
            if (!j4.f4517V && j4.l() && j4.c()) {
                j4.p();
                j4.f4517V = true;
            }
        } catch (r e4) {
            throw g(e4, e4.f4638n, e4.f4637m, this.f6907t0 ? 5003 : 5002);
        }
    }

    @Override // j0.u, a0.AbstractC0125e
    public final boolean p() {
        return this.f4561R0.j() || super.p();
    }

    @Override // j0.u, a0.AbstractC0125e
    public final void q() {
        C0215n c0215n = this.f4560Q0;
        this.f4568Z0 = true;
        this.f4564V0 = null;
        try {
            this.f4561R0.d();
            try {
                super.q();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.q();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, a0.f] */
    @Override // a0.AbstractC0125e
    public final void r(boolean z4, boolean z5) {
        ?? obj = new Object();
        this.f6869K0 = obj;
        C0215n c0215n = this.f4560Q0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new RunnableC0214m(c0215n, (Object) obj, 0));
        }
        l0 l0Var = this.f3424o;
        l0Var.getClass();
        boolean z6 = l0Var.f3541b;
        J j4 = this.f4561R0;
        if (z6) {
            j4.getClass();
            W.a.j(W.y.f2709a >= 21);
            W.a.j(j4.f4521Z);
            if (!j4.f4529d0) {
                j4.f4529d0 = true;
                j4.d();
            }
        } else if (j4.f4529d0) {
            j4.f4529d0 = false;
            j4.d();
        }
        b0.l lVar = this.f3426q;
        lVar.getClass();
        j4.f4551r = lVar;
        W.t tVar = this.f3427r;
        tVar.getClass();
        j4.f4538i.J = tVar;
    }

    @Override // j0.u, a0.AbstractC0125e
    public final void s(long j4, boolean z4) {
        super.s(j4, z4);
        this.f4561R0.d();
        this.f4566X0 = j4;
        this.f4569a1 = false;
        this.f4567Y0 = true;
    }

    @Override // a0.AbstractC0125e
    public final void t() {
        C0208g c0208g;
        C0210i c0210i = this.f4561R0.f4556y;
        if (c0210i == null || !c0210i.f4620j) {
            return;
        }
        c0210i.f4617g = null;
        int i4 = W.y.f2709a;
        Context context = c0210i.f4611a;
        if (i4 >= 23 && (c0208g = c0210i.f4614d) != null) {
            AbstractC0207f.b(context, c0208g);
        }
        S2.g gVar = c0210i.f4615e;
        if (gVar != null) {
            context.unregisterReceiver(gVar);
        }
        C0209h c0209h = c0210i.f4616f;
        if (c0209h != null) {
            c0209h.f4608a.unregisterContentObserver(c0209h);
        }
        c0210i.f4620j = false;
    }

    @Override // j0.u
    public final boolean t0(C0095p c0095p) {
        l0 l0Var = this.f3424o;
        l0Var.getClass();
        if (l0Var.f3540a != 0) {
            int y02 = y0(c0095p);
            if ((y02 & 512) != 0) {
                l0 l0Var2 = this.f3424o;
                l0Var2.getClass();
                if (l0Var2.f3540a == 2 || (y02 & 1024) != 0 || (c0095p.f2306D == 0 && c0095p.f2307E == 0)) {
                    return true;
                }
            }
        }
        return this.f4561R0.f(c0095p) != 0;
    }

    @Override // a0.AbstractC0125e
    public final void u() {
        J j4 = this.f4561R0;
        this.f4569a1 = false;
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
            if (this.f4568Z0) {
                this.f4568Z0 = false;
                j4.r();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if ((r6.isEmpty() ? null : (j0.m) r6.get(0)) != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0112  */
    @Override // j0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u0(j0.v r17, T.C0095p r18) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.M.u0(j0.v, T.p):int");
    }

    @Override // a0.AbstractC0125e
    public final void v() {
        this.f4561R0.o();
    }

    @Override // a0.AbstractC0125e
    public final void w() {
        A0();
        J j4 = this.f4561R0;
        j4.f4520Y = false;
        if (j4.l()) {
            v vVar = j4.f4538i;
            vVar.d();
            if (vVar.f4683y == -9223372036854775807L) {
                u uVar = vVar.f4666f;
                uVar.getClass();
                uVar.a();
            } else {
                vVar.f4652A = vVar.b();
                if (!J.m(j4.w)) {
                    return;
                }
            }
            j4.w.pause();
        }
    }

    public final int y0(C0095p c0095p) {
        C0213l e4 = this.f4561R0.e(c0095p);
        if (!e4.f4626a) {
            return 0;
        }
        int i4 = e4.f4627b ? 1536 : 512;
        return e4.f4628c ? i4 | 2048 : i4;
    }

    public final int z0(j0.m mVar, C0095p c0095p) {
        int i4;
        if (!"OMX.google.raw.decoder".equals(mVar.f6833a) || (i4 = W.y.f2709a) >= 24 || (i4 == 23 && W.y.L(this.f4559P0))) {
            return c0095p.f2326n;
        }
        return -1;
    }
}
