package p146j0;

/* renamed from: j0.c */
/* loaded from: classes.dex */
public final class C1699c implements p146j0.InterfaceC1706j {

    /* renamed from: l */
    public int f7051l;

    /* renamed from: m */
    public boolean f7052m;

    /* renamed from: n */
    public final java.lang.Object f7053n;

    /* renamed from: o */
    public final java.lang.Object f7054o;

    /* renamed from: p */
    public final java.lang.Object f7055p;

    public C1699c(android.content.Context context) {
        java.lang.String m1364L;
        android.telephony.TelephonyManager telephonyManager;
        this.f7053n = context == null ? null : context.getApplicationContext();
        int i4 = p086W.AbstractC0805y.f2801a;
        if (context != null && (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) != null) {
            java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!android.text.TextUtils.isEmpty(networkCountryIso)) {
                m1364L = p080U1.AbstractC0748a.m1364L(networkCountryIso);
                int[] m4425a = p197u0.C2220g.m4425a(m1364L);
                java.util.HashMap hashMap = new java.util.HashMap(8);
                hashMap.put(0, 1000000L);
                p129f2.C1415c0 c1415c0 = p197u0.C2220g.f8847n;
                hashMap.put(2, (java.lang.Long) c1415c0.get(m4425a[0]));
                hashMap.put(3, (java.lang.Long) p197u0.C2220g.f8848o.get(m4425a[1]));
                hashMap.put(4, (java.lang.Long) p197u0.C2220g.f8849p.get(m4425a[2]));
                hashMap.put(5, (java.lang.Long) p197u0.C2220g.f8850q.get(m4425a[3]));
                hashMap.put(10, (java.lang.Long) p197u0.C2220g.f8851r.get(m4425a[4]));
                hashMap.put(9, (java.lang.Long) p197u0.C2220g.f8852s.get(m4425a[5]));
                hashMap.put(7, (java.lang.Long) c1415c0.get(m4425a[0]));
                this.f7054o = hashMap;
                this.f7051l = 2000;
                this.f7055p = p086W.C0800t.f2792a;
                this.f7052m = true;
            }
        }
        m1364L = p080U1.AbstractC0748a.m1364L(java.util.Locale.getDefault().getCountry());
        int[] m4425a2 = p197u0.C2220g.m4425a(m1364L);
        java.util.HashMap hashMap2 = new java.util.HashMap(8);
        hashMap2.put(0, 1000000L);
        p129f2.C1415c0 c1415c02 = p197u0.C2220g.f8847n;
        hashMap2.put(2, (java.lang.Long) c1415c02.get(m4425a2[0]));
        hashMap2.put(3, (java.lang.Long) p197u0.C2220g.f8848o.get(m4425a2[1]));
        hashMap2.put(4, (java.lang.Long) p197u0.C2220g.f8849p.get(m4425a2[2]));
        hashMap2.put(5, (java.lang.Long) p197u0.C2220g.f8850q.get(m4425a2[3]));
        hashMap2.put(10, (java.lang.Long) p197u0.C2220g.f8851r.get(m4425a2[4]));
        hashMap2.put(9, (java.lang.Long) p197u0.C2220g.f8852s.get(m4425a2[5]));
        hashMap2.put(7, (java.lang.Long) c1415c02.get(m4425a2[0]));
        this.f7054o = hashMap2;
        this.f7051l = 2000;
        this.f7055p = p086W.C0800t.f2792a;
        this.f7052m = true;
    }

    /* renamed from: a */
    public static void m3653a(p146j0.C1699c c1699c, android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i4) {
        p146j0.C1702f c1702f = (p146j0.C1702f) c1699c.f7054o;
        p086W.AbstractC0781a.m1421j(c1702f.f7071c == null);
        android.os.HandlerThread handlerThread = c1702f.f7070b;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        android.media.MediaCodec mediaCodec = (android.media.MediaCodec) c1699c.f7053n;
        mediaCodec.setCallback(c1702f, handler);
        c1702f.f7071c = handler;
        android.os.Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i4);
        android.os.Trace.endSection();
        ((p146j0.InterfaceC1707k) c1699c.f7055p).mo3191d();
        android.os.Trace.beginSection("startCodec");
        mediaCodec.start();
        android.os.Trace.endSection();
        c1699c.f7051l = 1;
    }

    /* renamed from: d */
    public static java.lang.String m3654d(java.lang.String str, int i4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
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

    @Override // p146j0.InterfaceC1706j
    /* renamed from: A */
    public void mo2204A(int i4) {
        ((android.media.MediaCodec) this.f7053n).setVideoScalingMode(i4);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: M */
    public android.media.MediaFormat mo2208M() {
        android.media.MediaFormat mediaFormat;
        p146j0.C1702f c1702f = (p146j0.C1702f) this.f7054o;
        synchronized (c1702f.f7069a) {
            try {
                mediaFormat = c1702f.f7076h;
                if (mediaFormat == null) {
                    throw new java.lang.IllegalStateException();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: b */
    public void mo2218b(int i4, p098Z.C0917b c0917b, long j4, int i5) {
        ((p146j0.InterfaceC1707k) this.f7055p).mo3189b(i4, c0917b, j4, i5);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: c */
    public void mo2219c(android.os.Bundle bundle) {
        ((p146j0.InterfaceC1707k) this.f7055p).mo3190c(bundle);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: e */
    public void mo2221e(int i4, int i5, long j4, int i6) {
        ((p146j0.InterfaceC1707k) this.f7055p).mo3192e(i4, i5, j4, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:22:0x0034, B:26:0x003f, B:29:0x0043, B:31:0x0051, B:32:0x0078, B:35:0x006e, B:36:0x007a, B:37:0x007f, B:39:0x0080, B:40:0x0082, B:41:0x0083, B:42:0x0085, B:43:0x0086, B:44:0x0088), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:22:0x0034, B:26:0x003f, B:29:0x0043, B:31:0x0051, B:32:0x0078, B:35:0x006e, B:36:0x007a, B:37:0x007f, B:39:0x0080, B:40:0x0082, B:41:0x0083, B:42:0x0085, B:43:0x0086, B:44:0x0088), top: B:3:0x000e }] */
    @Override // p146j0.InterfaceC1706j
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo2223f(android.media.MediaCodec.BufferInfo r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f7055p
            j0.k r0 = (p146j0.InterfaceC1707k) r0
            r0.mo3197r()
            java.lang.Object r0 = r12.f7054o
            j0.f r0 = (p146j0.C1702f) r0
            java.lang.Object r1 = r0.f7069a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f7082n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L86
            android.media.MediaCodec$CodecException r2 = r0.f7078j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L83
            android.media.MediaCodec$CryptoException r2 = r0.f7079k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L80
            long r2 = r0.f7080l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L2c
            boolean r2 = r0.f7081m     // Catch: java.lang.Throwable -> L32
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
            W.l r2 = r0.f7073e     // Catch: java.lang.Throwable -> L32
            int r6 = r2.f2765a     // Catch: java.lang.Throwable -> L32
            int r7 = r2.f2766b     // Catch: java.lang.Throwable -> L32
            if (r6 != r7) goto L3d
            r3 = r4
        L3d:
            if (r3 == 0) goto L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L79
        L41:
            if (r6 == r7) goto L7a
            java.lang.Object r3 = r2.f2768d     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r5 = r3[r6]     // Catch: java.lang.Throwable -> L32
            int r6 = r6 + r4
            int r3 = r2.f2767c     // Catch: java.lang.Throwable -> L32
            r3 = r3 & r6
            r2.f2765a = r3     // Catch: java.lang.Throwable -> L32
            if (r5 < 0) goto L6b
            android.media.MediaFormat r2 = r0.f7076h     // Catch: java.lang.Throwable -> L32
            p086W.AbstractC0781a.m1422k(r2)     // Catch: java.lang.Throwable -> L32
            java.util.ArrayDeque r0 = r0.f7074f     // Catch: java.lang.Throwable -> L32
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
            java.util.ArrayDeque r13 = r0.f7075g     // Catch: java.lang.Throwable -> L32
            java.lang.Object r13 = r13.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaFormat r13 = (android.media.MediaFormat) r13     // Catch: java.lang.Throwable -> L32
            r0.f7076h = r13     // Catch: java.lang.Throwable -> L32
        L78:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L79:
            return r5
        L7a:
            java.lang.ArrayIndexOutOfBoundsException r13 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r13.<init>()     // Catch: java.lang.Throwable -> L32
            throw r13     // Catch: java.lang.Throwable -> L32
        L80:
            r0.f7079k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L83:
            r0.f7078j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L86:
            r0.f7082n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p146j0.C1699c.mo2223f(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // p146j0.InterfaceC1706j
    public void flush() {
        ((p146j0.InterfaceC1707k) this.f7055p).flush();
        ((android.media.MediaCodec) this.f7053n).flush();
        p146j0.C1702f c1702f = (p146j0.C1702f) this.f7054o;
        synchronized (c1702f.f7069a) {
            c1702f.f7080l++;
            android.os.Handler handler = c1702f.f7071c;
            int i4 = p086W.AbstractC0805y.f2801a;
            handler.post(new p026F2.RunnableC0226c(7, c1702f));
        }
        ((android.media.MediaCodec) this.f7053n).start();
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: j */
    public void mo2228j(long j4, int i4) {
        ((android.media.MediaCodec) this.f7053n).releaseOutputBuffer(i4, j4);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: k */
    public java.nio.ByteBuffer mo2230k(int i4) {
        return ((android.media.MediaCodec) this.f7053n).getInputBuffer(i4);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: l */
    public void mo2232l(android.view.Surface surface) {
        ((android.media.MediaCodec) this.f7053n).setOutputSurface(surface);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: o */
    public void mo2235o(p206w0.C2316l c2316l, android.os.Handler handler) {
        ((android.media.MediaCodec) this.f7053n).setOnFrameRenderedListener(new p146j0.C1697a(this, c2316l, 0), handler);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: q */
    public boolean mo3655q(p146j0.C1715s c1715s) {
        p146j0.C1702f c1702f = (p146j0.C1702f) this.f7054o;
        synchronized (c1702f.f7069a) {
            c1702f.f7083o = c1715s;
        }
        return true;
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: r */
    public void mo2238r(int i4, boolean z4) {
        ((android.media.MediaCodec) this.f7053n).releaseOutputBuffer(i4, z4);
    }

    @Override // p146j0.InterfaceC1706j
    public void release() {
        try {
            if (this.f7051l == 1) {
                ((p146j0.InterfaceC1707k) this.f7055p).mo3195l();
                p146j0.C1702f c1702f = (p146j0.C1702f) this.f7054o;
                synchronized (c1702f.f7069a) {
                    c1702f.f7081m = true;
                    c1702f.f7070b.quit();
                    c1702f.m3657a();
                }
            }
            this.f7051l = 2;
            if (this.f7052m) {
                return;
            }
            try {
                int i4 = p086W.AbstractC0805y.f2801a;
                if (i4 >= 30 && i4 < 33) {
                    ((android.media.MediaCodec) this.f7053n).stop();
                }
            } finally {
            }
        } catch (java.lang.Throwable th) {
            if (!this.f7052m) {
                try {
                    int i5 = p086W.AbstractC0805y.f2801a;
                    if (i5 >= 30 && i5 < 33) {
                        ((android.media.MediaCodec) this.f7053n).stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: u */
    public java.nio.ByteBuffer mo2242u(int i4) {
        return ((android.media.MediaCodec) this.f7053n).getOutputBuffer(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:22:0x0034, B:27:0x004e, B:29:0x0042, B:30:0x0050, B:31:0x0055, B:33:0x0056, B:34:0x0058, B:35:0x0059, B:36:0x005b, B:37:0x005c, B:38:0x005e), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:22:0x0034, B:27:0x004e, B:29:0x0042, B:30:0x0050, B:31:0x0055, B:33:0x0056, B:34:0x0058, B:35:0x0059, B:36:0x005b, B:37:0x005c, B:38:0x005e), top: B:3:0x000e }] */
    @Override // p146j0.InterfaceC1706j
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo2247z() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7055p
            j0.k r0 = (p146j0.InterfaceC1707k) r0
            r0.mo3197r()
            java.lang.Object r0 = r7.f7054o
            j0.f r0 = (p146j0.C1702f) r0
            java.lang.Object r1 = r0.f7069a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f7082n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L5c
            android.media.MediaCodec$CodecException r2 = r0.f7078j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L59
            android.media.MediaCodec$CryptoException r2 = r0.f7079k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L56
            long r2 = r0.f7080l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L2c
            boolean r2 = r0.f7081m     // Catch: java.lang.Throwable -> L32
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
            W.l r0 = r0.f7072d     // Catch: java.lang.Throwable -> L32
            int r2 = r0.f2765a     // Catch: java.lang.Throwable -> L32
            int r6 = r0.f2766b     // Catch: java.lang.Throwable -> L32
            if (r2 != r6) goto L3d
            r3 = r4
        L3d:
            if (r3 == 0) goto L40
            goto L4e
        L40:
            if (r2 == r6) goto L50
            java.lang.Object r3 = r0.f2768d     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r5 = r3[r2]     // Catch: java.lang.Throwable -> L32
            int r2 = r2 + r4
            int r3 = r0.f2767c     // Catch: java.lang.Throwable -> L32
            r2 = r2 & r3
            r0.f2765a = r2     // Catch: java.lang.Throwable -> L32
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L4f:
            return r5
        L50:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L56:
            r0.f7079k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L59:
            r0.f7078j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5c:
            r0.f7082n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p146j0.C1699c.mo2247z():int");
    }

    public C1699c(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, p146j0.InterfaceC1707k interfaceC1707k) {
        this.f7053n = mediaCodec;
        this.f7054o = new p146j0.C1702f(handlerThread);
        this.f7055p = interfaceC1707k;
        this.f7051l = 0;
    }
}
