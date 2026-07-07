package j0;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import f2.c0;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: l, reason: collision with root package name */
    public int f6793l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6794m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f6795n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f6796o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f6797p;

    public c(Context context) {
        String L3;
        TelephonyManager telephonyManager;
        this.f6795n = context == null ? null : context.getApplicationContext();
        int i4 = W.y.f2709a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                L3 = U1.a.L(networkCountryIso);
                int[] a4 = u0.g.a(L3);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                c0 c0Var = u0.g.f8507n;
                hashMap.put(2, (Long) c0Var.get(a4[0]));
                hashMap.put(3, (Long) u0.g.f8508o.get(a4[1]));
                hashMap.put(4, (Long) u0.g.f8509p.get(a4[2]));
                hashMap.put(5, (Long) u0.g.f8510q.get(a4[3]));
                hashMap.put(10, (Long) u0.g.f8511r.get(a4[4]));
                hashMap.put(9, (Long) u0.g.s.get(a4[5]));
                hashMap.put(7, (Long) c0Var.get(a4[0]));
                this.f6796o = hashMap;
                this.f6793l = 2000;
                this.f6797p = W.t.f2700a;
                this.f6794m = true;
            }
        }
        L3 = U1.a.L(Locale.getDefault().getCountry());
        int[] a42 = u0.g.a(L3);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        c0 c0Var2 = u0.g.f8507n;
        hashMap2.put(2, (Long) c0Var2.get(a42[0]));
        hashMap2.put(3, (Long) u0.g.f8508o.get(a42[1]));
        hashMap2.put(4, (Long) u0.g.f8509p.get(a42[2]));
        hashMap2.put(5, (Long) u0.g.f8510q.get(a42[3]));
        hashMap2.put(10, (Long) u0.g.f8511r.get(a42[4]));
        hashMap2.put(9, (Long) u0.g.s.get(a42[5]));
        hashMap2.put(7, (Long) c0Var2.get(a42[0]));
        this.f6796o = hashMap2;
        this.f6793l = 2000;
        this.f6797p = W.t.f2700a;
        this.f6794m = true;
    }

    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i4) {
        f fVar = (f) cVar.f6796o;
        W.a.j(fVar.f6812c == null);
        HandlerThread handlerThread = fVar.f6811b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) cVar.f6795n;
        mediaCodec.setCallback(fVar, handler);
        fVar.f6812c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i4);
        Trace.endSection();
        ((k) cVar.f6797p).d();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        cVar.f6793l = 1;
    }

    public static String d(String str, int i4) {
        StringBuilder sb = new StringBuilder(str);
        if (i4 == 1) {
            sb.append("Audio");
        } else if (i4 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i4);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // j0.j
    public void A(int i4) {
        ((MediaCodec) this.f6795n).setVideoScalingMode(i4);
    }

    @Override // j0.j
    public MediaFormat M() {
        MediaFormat mediaFormat;
        f fVar = (f) this.f6796o;
        synchronized (fVar.f6810a) {
            try {
                mediaFormat = fVar.f6817h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // j0.j
    public void b(int i4, Z.b bVar, long j4, int i5) {
        ((k) this.f6797p).b(i4, bVar, j4, i5);
    }

    @Override // j0.j
    public void c(Bundle bundle) {
        ((k) this.f6797p).c(bundle);
    }

    @Override // j0.j
    public void e(int i4, int i5, long j4, int i6) {
        ((k) this.f6797p).e(i4, i5, j4, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:22:0x0034, B:26:0x003f, B:29:0x0043, B:31:0x0051, B:32:0x0078, B:35:0x006e, B:36:0x007a, B:37:0x007f, B:39:0x0080, B:40:0x0082, B:41:0x0083, B:42:0x0085, B:43:0x0086, B:44:0x0088), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:22:0x0034, B:26:0x003f, B:29:0x0043, B:31:0x0051, B:32:0x0078, B:35:0x006e, B:36:0x007a, B:37:0x007f, B:39:0x0080, B:40:0x0082, B:41:0x0083, B:42:0x0085, B:43:0x0086, B:44:0x0088), top: B:3:0x000e }] */
    @Override // j0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f(android.media.MediaCodec.BufferInfo r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f6797p
            j0.k r0 = (j0.k) r0
            r0.r()
            java.lang.Object r0 = r12.f6796o
            j0.f r0 = (j0.f) r0
            java.lang.Object r1 = r0.f6810a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f6823n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L86
            android.media.MediaCodec$CodecException r2 = r0.f6819j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L83
            android.media.MediaCodec$CryptoException r2 = r0.f6820k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L80
            long r2 = r0.f6821l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L2c
            boolean r2 = r0.f6822m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = r3
            goto L2d
        L2c:
            r2 = r4
        L2d:
            r5 = -1
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L79
        L32:
            r13 = move-exception
            goto L89
        L34:
            W.l r2 = r0.f6814e     // Catch: java.lang.Throwable -> L32
            int r6 = r2.f2673a     // Catch: java.lang.Throwable -> L32
            int r7 = r2.f2674b     // Catch: java.lang.Throwable -> L32
            if (r6 != r7) goto L3d
            r3 = r4
        L3d:
            if (r3 == 0) goto L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L79
        L41:
            if (r6 == r7) goto L7a
            java.lang.Object r3 = r2.f2676d     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r5 = r3[r6]     // Catch: java.lang.Throwable -> L32
            int r6 = r6 + r4
            int r3 = r2.f2675c     // Catch: java.lang.Throwable -> L32
            r3 = r3 & r6
            r2.f2673a = r3     // Catch: java.lang.Throwable -> L32
            if (r5 < 0) goto L6b
            android.media.MediaFormat r2 = r0.f6817h     // Catch: java.lang.Throwable -> L32
            W.a.k(r2)     // Catch: java.lang.Throwable -> L32
            java.util.ArrayDeque r0 = r0.f6815f     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L32
            int r7 = r0.offset     // Catch: java.lang.Throwable -> L32
            int r8 = r0.size     // Catch: java.lang.Throwable -> L32
            long r9 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L32
            int r11 = r0.flags     // Catch: java.lang.Throwable -> L32
            r6 = r13
            r6.set(r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L32
            goto L78
        L6b:
            r13 = -2
            if (r5 != r13) goto L78
            java.util.ArrayDeque r13 = r0.f6816g     // Catch: java.lang.Throwable -> L32
            java.lang.Object r13 = r13.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaFormat r13 = (android.media.MediaFormat) r13     // Catch: java.lang.Throwable -> L32
            r0.f6817h = r13     // Catch: java.lang.Throwable -> L32
        L78:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L79:
            return r5
        L7a:
            java.lang.ArrayIndexOutOfBoundsException r13 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r13.<init>()     // Catch: java.lang.Throwable -> L32
            throw r13     // Catch: java.lang.Throwable -> L32
        L80:
            r0.f6820k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L83:
            r0.f6819j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L86:
            r0.f6823n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.c.f(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // j0.j
    public void flush() {
        ((k) this.f6797p).flush();
        ((MediaCodec) this.f6795n).flush();
        f fVar = (f) this.f6796o;
        synchronized (fVar.f6810a) {
            fVar.f6821l++;
            Handler handler = fVar.f6812c;
            int i4 = W.y.f2709a;
            handler.post(new F2.c(7, fVar));
        }
        ((MediaCodec) this.f6795n).start();
    }

    @Override // j0.j
    public void j(long j4, int i4) {
        ((MediaCodec) this.f6795n).releaseOutputBuffer(i4, j4);
    }

    @Override // j0.j
    public ByteBuffer k(int i4) {
        return ((MediaCodec) this.f6795n).getInputBuffer(i4);
    }

    @Override // j0.j
    public void l(Surface surface) {
        ((MediaCodec) this.f6795n).setOutputSurface(surface);
    }

    @Override // j0.j
    public void o(w0.l lVar, Handler handler) {
        ((MediaCodec) this.f6795n).setOnFrameRenderedListener(new C0372a(this, lVar, 0), handler);
    }

    @Override // j0.j
    public boolean q(s sVar) {
        f fVar = (f) this.f6796o;
        synchronized (fVar.f6810a) {
            fVar.f6824o = sVar;
        }
        return true;
    }

    @Override // j0.j
    public void r(int i4, boolean z4) {
        ((MediaCodec) this.f6795n).releaseOutputBuffer(i4, z4);
    }

    @Override // j0.j
    public void release() {
        try {
            if (this.f6793l == 1) {
                ((k) this.f6797p).l();
                f fVar = (f) this.f6796o;
                synchronized (fVar.f6810a) {
                    fVar.f6822m = true;
                    fVar.f6811b.quit();
                    fVar.a();
                }
            }
            this.f6793l = 2;
            if (this.f6794m) {
                return;
            }
            try {
                int i4 = W.y.f2709a;
                if (i4 >= 30 && i4 < 33) {
                    ((MediaCodec) this.f6795n).stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f6794m) {
                try {
                    int i5 = W.y.f2709a;
                    if (i5 >= 30 && i5 < 33) {
                        ((MediaCodec) this.f6795n).stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // j0.j
    public ByteBuffer u(int i4) {
        return ((MediaCodec) this.f6795n).getOutputBuffer(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:22:0x0034, B:27:0x004e, B:29:0x0042, B:30:0x0050, B:31:0x0055, B:33:0x0056, B:34:0x0058, B:35:0x0059, B:36:0x005b, B:37:0x005c, B:38:0x005e), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:22:0x0034, B:27:0x004e, B:29:0x0042, B:30:0x0050, B:31:0x0055, B:33:0x0056, B:34:0x0058, B:35:0x0059, B:36:0x005b, B:37:0x005c, B:38:0x005e), top: B:3:0x000e }] */
    @Override // j0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int z() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6797p
            j0.k r0 = (j0.k) r0
            r0.r()
            java.lang.Object r0 = r7.f6796o
            j0.f r0 = (j0.f) r0
            java.lang.Object r1 = r0.f6810a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f6823n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L5c
            android.media.MediaCodec$CodecException r2 = r0.f6819j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L59
            android.media.MediaCodec$CryptoException r2 = r0.f6820k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L56
            long r2 = r0.f6821l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L2c
            boolean r2 = r0.f6822m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = r3
            goto L2d
        L2c:
            r2 = r4
        L2d:
            r5 = -1
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L4f
        L32:
            r0 = move-exception
            goto L5f
        L34:
            W.l r0 = r0.f6813d     // Catch: java.lang.Throwable -> L32
            int r2 = r0.f2673a     // Catch: java.lang.Throwable -> L32
            int r6 = r0.f2674b     // Catch: java.lang.Throwable -> L32
            if (r2 != r6) goto L3d
            r3 = r4
        L3d:
            if (r3 == 0) goto L40
            goto L4e
        L40:
            if (r2 == r6) goto L50
            java.lang.Object r3 = r0.f2676d     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r5 = r3[r2]     // Catch: java.lang.Throwable -> L32
            int r2 = r2 + r4
            int r3 = r0.f2675c     // Catch: java.lang.Throwable -> L32
            r2 = r2 & r3
            r0.f2673a = r2     // Catch: java.lang.Throwable -> L32
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L4f:
            return r5
        L50:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L56:
            r0.f6820k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L59:
            r0.f6819j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5c:
            r0.f6823n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.c.z():int");
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, k kVar) {
        this.f6795n = mediaCodec;
        this.f6796o = new f(handlerThread);
        this.f6797p = kVar;
        this.f6793l = 0;
    }
}
