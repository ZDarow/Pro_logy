package p112c0;

/* renamed from: c0.M */
/* loaded from: classes.dex */
public final class C1214M extends p146j0.AbstractC1717u implements p102a0.InterfaceC0954S {

    /* renamed from: P0 */
    public final android.content.Context f4723P0;

    /* renamed from: Q0 */
    public final p112c0.C1232n f4724Q0;

    /* renamed from: R0 */
    public final p112c0.C1211J f4725R0;

    /* renamed from: S0 */
    public int f4726S0;

    /* renamed from: T0 */
    public boolean f4727T0;

    /* renamed from: U0 */
    public boolean f4728U0;

    /* renamed from: V0 */
    public p076T.C0702p f4729V0;

    /* renamed from: W0 */
    public p076T.C0702p f4730W0;

    /* renamed from: X0 */
    public long f4731X0;

    /* renamed from: Y0 */
    public boolean f4732Y0;

    /* renamed from: Z0 */
    public boolean f4733Z0;

    /* renamed from: a1 */
    public boolean f4734a1;

    /* renamed from: b1 */
    public int f4735b1;

    public C1214M(android.content.Context context, p146j0.InterfaceC1705i interfaceC1705i, android.os.Handler handler, p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E, p112c0.C1211J c1211j) {
        super(1, interfaceC1705i, 44100.0f);
        this.f4723P0 = context.getApplicationContext();
        this.f4725R0 = c1211j;
        this.f4735b1 = -1000;
        this.f4724Q0 = new p112c0.C1232n(handler, surfaceHolderCallbackC0941E);
        c1211j.f4714s = new p043K2.C0339o(24, this);
    }

    /* renamed from: A0 */
    public final void m2872A0() {
        long j4;
        java.util.ArrayDeque arrayDeque;
        long m1630y;
        long j5;
        boolean mo1990n = mo1990n();
        p112c0.C1211J c1211j = this.f4725R0;
        if (!c1211j.m2861l() || c1211j.f4671N) {
            j4 = Long.MIN_VALUE;
        } else {
            long min = java.lang.Math.min(c1211j.f4700i.m2916a(mo1990n), p086W.AbstractC0805y.m1598S(c1211j.m2857h(), c1211j.f4716u.f4635e));
            while (true) {
                arrayDeque = c1211j.f4702j;
                if (arrayDeque.isEmpty() || min < ((p112c0.C1205D) arrayDeque.getFirst()).f4645c) {
                    break;
                } else {
                    c1211j.f4660C = (p112c0.C1205D) arrayDeque.remove();
                }
            }
            long j6 = min - c1211j.f4660C.f4645c;
            boolean isEmpty = arrayDeque.isEmpty();
            android.support.v4.media.session.C1061t c1061t = c1211j.f4686b;
            if (isEmpty) {
                p079U.C0746g c0746g = (p079U.C0746g) c1061t.f3863o;
                if (c0746g.mo1337a()) {
                    if (c0746g.f2600o >= 1024) {
                        long j7 = c0746g.f2599n;
                        c0746g.f2595j.getClass();
                        long j8 = j7 - ((r3.f2575k * r3.f2566b) * 2);
                        int i4 = c0746g.f2593h.f2553a;
                        int i5 = c0746g.f2592g.f2553a;
                        j5 = i4 == i5 ? p086W.AbstractC0805y.m1600U(j6, j8, c0746g.f2600o, java.math.RoundingMode.FLOOR) : p086W.AbstractC0805y.m1600U(j6, j8 * i4, c0746g.f2600o * i5, java.math.RoundingMode.FLOOR);
                    } else {
                        j5 = (long) (c0746g.f2588c * j6);
                    }
                    j6 = j5;
                }
                m1630y = c1211j.f4660C.f4644b + j6;
            } else {
                p112c0.C1205D c1205d = (p112c0.C1205D) arrayDeque.getFirst();
                m1630y = c1205d.f4644b - p086W.AbstractC0805y.m1630y(c1205d.f4645c - min, c1211j.f4660C.f4643a.f2207a);
            }
            long j9 = ((p112c0.C1216O) c1061t.f3862n).f4749q;
            j4 = p086W.AbstractC0805y.m1598S(j9, c1211j.f4716u.f4635e) + m1630y;
            long j10 = c1211j.f4703j0;
            if (j9 > j10) {
                long m1598S = p086W.AbstractC0805y.m1598S(j9 - j10, c1211j.f4716u.f4635e);
                c1211j.f4703j0 = j9;
                c1211j.f4705k0 += m1598S;
                if (c1211j.f4707l0 == null) {
                    c1211j.f4707l0 = new android.os.Handler(android.os.Looper.myLooper());
                }
                c1211j.f4707l0.removeCallbacksAndMessages(null);
                c1211j.f4707l0.postDelayed(new p026F2.RunnableC0226c(4, c1211j), 100L);
            }
        }
        if (j4 != Long.MIN_VALUE) {
            if (!this.f4732Y0) {
                j4 = java.lang.Math.max(this.f4731X0, j4);
            }
            this.f4731X0 = j4;
            this.f4732Y0 = false;
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: G */
    public final p102a0.C0974g mo2873G(p146j0.C1709m c1709m, p076T.C0702p c0702p, p076T.C0702p c0702p2) {
        p102a0.C0974g m3662b = c1709m.m3662b(c0702p, c0702p2);
        boolean z4 = this.f7139P == null && mo2887t0(c0702p2);
        int i4 = m3662b.f3603e;
        if (z4) {
            i4 |= 32768;
        }
        if (m2890z0(c1709m, c0702p2) > this.f4726S0) {
            i4 |= 64;
        }
        int i5 = i4;
        return new p102a0.C0974g(c1709m.f7093a, c0702p, c0702p2, i5 == 0 ? m3662b.f3602d : 0, i5);
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: R */
    public final float mo2874R(float f4, p076T.C0702p[] c0702pArr) {
        int i4 = -1;
        for (p076T.C0702p c0702p : c0702pArr) {
            int i5 = c0702p.f2386B;
            if (i5 != -1) {
                i4 = java.lang.Math.max(i4, i5);
            }
        }
        if (i4 == -1) {
            return -1.0f;
        }
        return f4 * i4;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: S */
    public final java.util.ArrayList mo2875S(p146j0.C1718v c1718v, p076T.C0702p c0702p, boolean z4) {
        p129f2.C1415c0 m3649g;
        if (c0702p.f2408m == null) {
            m3649g = p129f2.C1415c0.f5744p;
        } else {
            if (this.f4725R0.m2855f(c0702p) != 0) {
                java.util.List m3647e = p146j0.AbstractC1696B.m3647e("audio/raw", false, false);
                p146j0.C1709m c1709m = m3647e.isEmpty() ? null : (p146j0.C1709m) m3647e.get(0);
                if (c1709m != null) {
                    m3649g = p129f2.AbstractC1393I.m3166o(c1709m);
                }
            }
            m3649g = p146j0.AbstractC1696B.m3649g(c1718v, c0702p, z4, false);
        }
        java.util.regex.Pattern pattern = p146j0.AbstractC1696B.f7043a;
        java.util.ArrayList arrayList = new java.util.ArrayList(m3649g);
        java.util.Collections.sort(arrayList, new p146j0.C1719w(new p009B2.C0067x(26, c0702p)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if ("AXON 7 mini".equals(r2) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    @Override // p146j0.AbstractC1717u
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p146j0.C1704h mo2876T(p146j0.C1709m r12, p076T.C0702p r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1214M.mo2876T(j0.m, T.p, android.media.MediaCrypto, float):j0.h");
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: U */
    public final void mo2877U(p098Z.C0921f c0921f) {
        p076T.C0702p c0702p;
        p112c0.C1204C c1204c;
        if (p086W.AbstractC0805y.f2801a < 29 || (c0702p = c0921f.f3249n) == null || !java.util.Objects.equals(c0702p.f2408m, "audio/opus") || !this.f7169t0) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = c0921f.f3254s;
        byteBuffer.getClass();
        p076T.C0702p c0702p2 = c0921f.f3249n;
        c0702p2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i4 = (int) ((byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            p112c0.C1211J c1211j = this.f4725R0;
            android.media.AudioTrack audioTrack = c1211j.f4718w;
            if (audioTrack == null || !p112c0.C1211J.m2849m(audioTrack) || (c1204c = c1211j.f4716u) == null || !c1204c.f4641k) {
                return;
            }
            c1211j.f4718w.setOffloadDelayPadding(c0702p2.f2388D, i4);
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: Z */
    public final void mo2878Z(java.lang.Exception exc) {
        p086W.AbstractC0781a.m1426o("MediaCodecAudioRenderer", "Audio codec error", exc);
        p112c0.C1232n c1232n = this.f4724Q0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p112c0.RunnableC1231m(c1232n, exc, 3));
        }
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: a */
    public final void mo1931a(p076T.C0668K c0668k) {
        p112c0.C1211J c1211j = this.f4725R0;
        c1211j.getClass();
        c1211j.f4661D = new p076T.C0668K(p086W.AbstractC0805y.m1614i(c0668k.f2207a, 0.1f, 8.0f), p086W.AbstractC0805y.m1614i(c0668k.f2208b, 0.1f, 8.0f));
        if (c1211j.m2868t()) {
            c1211j.m2867s();
            return;
        }
        p112c0.C1205D c1205d = new p112c0.C1205D(c0668k, -9223372036854775807L, -9223372036854775807L);
        if (c1211j.m2861l()) {
            c1211j.f4659B = c1205d;
        } else {
            c1211j.f4660C = c1205d;
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: a0 */
    public final void mo2879a0(long j4, long j5, java.lang.String str) {
        p112c0.C1232n c1232n = this.f4724Q0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p112c0.RunnableC1231m(c1232n, str, j4, j5));
        }
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: b */
    public final p076T.C0668K mo1932b() {
        return this.f4725R0.f4661D;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: b0 */
    public final void mo2880b0(java.lang.String str) {
        p112c0.C1232n c1232n = this.f4724Q0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p112c0.RunnableC1231m(c1232n, str, 7));
        }
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: c */
    public final boolean mo1933c() {
        boolean z4 = this.f4734a1;
        this.f4734a1 = false;
        return z4;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: c0 */
    public final p102a0.C0974g mo2881c0(p094Y.C0886x c0886x) {
        p076T.C0702p c0702p = (p076T.C0702p) c0886x.f3176n;
        c0702p.getClass();
        this.f4729V0 = c0702p;
        p102a0.C0974g mo2881c0 = super.mo2881c0(c0886x);
        p112c0.C1232n c1232n = this.f4724Q0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p112c0.RunnableC1231m(c1232n, c0702p, mo2881c0));
        }
        return mo2881c0;
    }

    @Override // p102a0.AbstractC0970e, p102a0.InterfaceC0977h0
    /* renamed from: d */
    public final void mo1824d(int i4, java.lang.Object obj) {
        p112c0.C1211J c1211j = this.f4725R0;
        if (i4 == 2) {
            obj.getClass();
            float floatValue = ((java.lang.Float) obj).floatValue();
            if (c1211j.f4673P != floatValue) {
                c1211j.f4673P = floatValue;
                if (c1211j.m2861l()) {
                    if (p086W.AbstractC0805y.f2801a >= 21) {
                        c1211j.f4718w.setVolume(c1211j.f4673P);
                        return;
                    }
                    android.media.AudioTrack audioTrack = c1211j.f4718w;
                    float f4 = c1211j.f4673P;
                    audioTrack.setStereoVolume(f4, f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 3) {
            p076T.C0691e c0691e = (p076T.C0691e) obj;
            c0691e.getClass();
            if (c1211j.f4658A.equals(c0691e)) {
                return;
            }
            c1211j.f4658A = c0691e;
            if (c1211j.f4691d0) {
                return;
            }
            p112c0.C1227i c1227i = c1211j.f4720y;
            if (c1227i != null) {
                c1227i.f4785i = c0691e;
                c1227i.m2909a(p112c0.C1223e.m2903b(c1227i.f4777a, c0691e, c1227i.f4784h));
            }
            c1211j.m2853d();
            return;
        }
        if (i4 == 6) {
            p076T.C0692f c0692f = (p076T.C0692f) obj;
            c0692f.getClass();
            if (c1211j.f4687b0.equals(c0692f)) {
                return;
            }
            if (c1211j.f4718w != null) {
                c1211j.f4687b0.getClass();
            }
            c1211j.f4687b0 = c0692f;
            return;
        }
        if (i4 == 12) {
            if (p086W.AbstractC0805y.f2801a >= 23) {
                p112c0.AbstractC1213L.m2871a(c1211j, obj);
                return;
            }
            return;
        }
        if (i4 == 16) {
            obj.getClass();
            this.f4735b1 = ((java.lang.Integer) obj).intValue();
            p146j0.InterfaceC1706j interfaceC1706j = this.f7145V;
            if (interfaceC1706j != null && p086W.AbstractC0805y.f2801a >= 35) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("importance", java.lang.Math.max(0, -this.f4735b1));
                interfaceC1706j.mo2219c(bundle);
                return;
            }
            return;
        }
        if (i4 == 9) {
            obj.getClass();
            c1211j.f4662E = ((java.lang.Boolean) obj).booleanValue();
            p112c0.C1205D c1205d = new p112c0.C1205D(c1211j.m2868t() ? p076T.C0668K.f2206d : c1211j.f4661D, -9223372036854775807L, -9223372036854775807L);
            if (c1211j.m2861l()) {
                c1211j.f4659B = c1205d;
                return;
            } else {
                c1211j.f4660C = c1205d;
                return;
            }
        }
        if (i4 != 10) {
            if (i4 == 11) {
                this.f7140Q = (p102a0.C0945I) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int intValue = ((java.lang.Integer) obj).intValue();
        if (c1211j.f4685a0 != intValue) {
            c1211j.f4685a0 = intValue;
            c1211j.f4683Z = intValue != 0;
            c1211j.m2853d();
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: d0 */
    public final void mo2882d0(p076T.C0702p c0702p, android.media.MediaFormat mediaFormat) {
        int i4;
        p076T.C0702p c0702p2 = this.f4730W0;
        boolean z4 = true;
        int[] iArr = null;
        if (c0702p2 != null) {
            c0702p = c0702p2;
        } else if (this.f7145V != null) {
            mediaFormat.getClass();
            int m1580A = "audio/raw".equals(c0702p.f2408m) ? c0702p.f2387C : (p086W.AbstractC0805y.f2801a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? p086W.AbstractC0805y.m1580A(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            p076T.C0701o c0701o = new p076T.C0701o();
            c0701o.f2370l = p076T.AbstractC0665H.m1201l("audio/raw");
            c0701o.f2351B = m1580A;
            c0701o.f2352C = c0702p.f2388D;
            c0701o.f2353D = c0702p.f2389E;
            c0701o.f2368j = c0702p.f2406k;
            c0701o.f2359a = c0702p.f2396a;
            c0701o.f2360b = c0702p.f2397b;
            c0701o.f2361c = p129f2.AbstractC1393I.m3162j(c0702p.f2398c);
            c0701o.f2362d = c0702p.f2399d;
            c0701o.f2363e = c0702p.f2400e;
            c0701o.f2364f = c0702p.f2401f;
            c0701o.f2384z = mediaFormat.getInteger("channel-count");
            c0701o.f2350A = mediaFormat.getInteger("sample-rate");
            p076T.C0702p c0702p3 = new p076T.C0702p(c0701o);
            boolean z5 = this.f4727T0;
            int i5 = c0702p3.f2385A;
            if (z5 && i5 == 6 && (i4 = c0702p.f2385A) < 6) {
                iArr = new int[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr[i6] = i6;
                }
            } else if (this.f4728U0) {
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
            c0702p = c0702p3;
        }
        try {
            int i7 = p086W.AbstractC0805y.f2801a;
            p112c0.C1211J c1211j = this.f4725R0;
            if (i7 >= 29) {
                if (this.f7169t0) {
                    p102a0.C0985l0 c0985l0 = this.f3542o;
                    c0985l0.getClass();
                    if (c0985l0.f3662a != 0) {
                        p102a0.C0985l0 c0985l02 = this.f3542o;
                        c0985l02.getClass();
                        int i8 = c0985l02.f3662a;
                        c1211j.getClass();
                        if (i7 < 29) {
                            z4 = false;
                        }
                        p086W.AbstractC0781a.m1421j(z4);
                        c1211j.f4706l = i8;
                    }
                }
                c1211j.getClass();
                if (i7 < 29) {
                    z4 = false;
                }
                p086W.AbstractC0781a.m1421j(z4);
                c1211j.f4706l = 0;
            }
            c1211j.m2851b(c0702p, iArr);
        } catch (p112c0.C1233o e4) {
            throw m1985g(e4, e4.f4799l, false, 5001);
        }
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: e */
    public final long mo1934e() {
        if (this.f3546s == 2) {
            m2872A0();
        }
        return this.f4731X0;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: e0 */
    public final void mo2883e0() {
        this.f4725R0.getClass();
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: g0 */
    public final void mo2884g0() {
        this.f4725R0.f4670M = true;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: k */
    public final p102a0.InterfaceC0954S mo1987k() {
        return this;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: k0 */
    public final boolean mo2885k0(long j4, long j5, p146j0.InterfaceC1706j interfaceC1706j, java.nio.ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, p076T.C0702p c0702p) {
        int i7;
        int i8;
        byteBuffer.getClass();
        if (this.f4730W0 != null && (i5 & 2) != 0) {
            interfaceC1706j.getClass();
            interfaceC1706j.mo2238r(i4, false);
            return true;
        }
        p112c0.C1211J c1211j = this.f4725R0;
        if (z4) {
            if (interfaceC1706j != null) {
                interfaceC1706j.mo2238r(i4, false);
            }
            this.f7131K0.f3571f += i6;
            c1211j.f4670M = true;
            return true;
        }
        try {
            if (!c1211j.m2858i(j6, byteBuffer, i6)) {
                return false;
            }
            if (interfaceC1706j != null) {
                interfaceC1706j.mo2238r(i4, false);
            }
            this.f7131K0.f3570e += i6;
            return true;
        } catch (p112c0.C1234p e4) {
            p076T.C0702p c0702p2 = this.f4729V0;
            if (this.f7169t0) {
                p102a0.C0985l0 c0985l0 = this.f3542o;
                c0985l0.getClass();
                if (c0985l0.f3662a != 0) {
                    i8 = 5004;
                    throw m1985g(e4, c0702p2, e4.f4801m, i8);
                }
            }
            i8 = 5001;
            throw m1985g(e4, c0702p2, e4.f4801m, i8);
        } catch (p112c0.C1236r e5) {
            if (this.f7169t0) {
                p102a0.C0985l0 c0985l02 = this.f3542o;
                c0985l02.getClass();
                if (c0985l02.f3662a != 0) {
                    i7 = 5003;
                    throw m1985g(e5, c0702p, e5.f4803m, i7);
                }
            }
            i7 = 5002;
            throw m1985g(e5, c0702p, e5.f4803m, i7);
        }
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: l */
    public final java.lang.String mo1988l() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: n */
    public final boolean mo1990n() {
        if (this.f7123G0) {
            p112c0.C1211J c1211j = this.f4725R0;
            if (!c1211j.m2861l() || (c1211j.f4679V && !c1211j.m2859j())) {
                return true;
            }
        }
        return false;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: n0 */
    public final void mo2886n0() {
        try {
            p112c0.C1211J c1211j = this.f4725R0;
            if (!c1211j.f4679V && c1211j.m2861l() && c1211j.m2852c()) {
                c1211j.m2864p();
                c1211j.f4679V = true;
            }
        } catch (p112c0.C1236r e4) {
            throw m1985g(e4, e4.f4804n, e4.f4803m, this.f7169t0 ? 5003 : 5002);
        }
    }

    @Override // p146j0.AbstractC1717u, p102a0.AbstractC0970e
    /* renamed from: p */
    public final boolean mo1991p() {
        return this.f4725R0.m2859j() || super.mo1991p();
    }

    @Override // p146j0.AbstractC1717u, p102a0.AbstractC0970e
    /* renamed from: q */
    public final void mo1992q() {
        p112c0.C1232n c1232n = this.f4724Q0;
        this.f4733Z0 = true;
        this.f4729V0 = null;
        try {
            this.f4725R0.m2853d();
            try {
                super.mo1992q();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                super.mo1992q();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, a0.f] */
    @Override // p102a0.AbstractC0970e
    /* renamed from: r */
    public final void mo1993r(boolean z4, boolean z5) {
        ?? obj = new java.lang.Object();
        this.f7131K0 = obj;
        p112c0.C1232n c1232n = this.f4724Q0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p112c0.RunnableC1231m(c1232n, (java.lang.Object) obj, 0));
        }
        p102a0.C0985l0 c0985l0 = this.f3542o;
        c0985l0.getClass();
        boolean z6 = c0985l0.f3663b;
        p112c0.C1211J c1211j = this.f4725R0;
        if (z6) {
            c1211j.getClass();
            p086W.AbstractC0781a.m1421j(p086W.AbstractC0805y.f2801a >= 21);
            p086W.AbstractC0781a.m1421j(c1211j.f4683Z);
            if (!c1211j.f4691d0) {
                c1211j.f4691d0 = true;
                c1211j.m2853d();
            }
        } else if (c1211j.f4691d0) {
            c1211j.f4691d0 = false;
            c1211j.m2853d();
        }
        p107b0.C1177l c1177l = this.f3544q;
        c1177l.getClass();
        c1211j.f4713r = c1177l;
        p086W.C0800t c0800t = this.f3545r;
        c0800t.getClass();
        c1211j.f4700i.f4827J = c0800t;
    }

    @Override // p146j0.AbstractC1717u, p102a0.AbstractC0970e
    /* renamed from: s */
    public final void mo1994s(long j4, boolean z4) {
        super.mo1994s(j4, z4);
        this.f4725R0.m2853d();
        this.f4731X0 = j4;
        this.f4734a1 = false;
        this.f4732Y0 = true;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: t */
    public final void mo1995t() {
        p112c0.C1225g c1225g;
        p112c0.C1227i c1227i = this.f4725R0.f4720y;
        if (c1227i == null || !c1227i.f4786j) {
            return;
        }
        c1227i.f4783g = null;
        int i4 = p086W.AbstractC0805y.f2801a;
        android.content.Context context = c1227i.f4777a;
        if (i4 >= 23 && (c1225g = c1227i.f4780d) != null) {
            p112c0.AbstractC1224f.m2908b(context, c1225g);
        }
        p075S2.C0654g c0654g = c1227i.f4781e;
        if (c0654g != null) {
            context.unregisterReceiver(c0654g);
        }
        p112c0.C1226h c1226h = c1227i.f4782f;
        if (c1226h != null) {
            c1226h.f4774a.unregisterContentObserver(c1226h);
        }
        c1227i.f4786j = false;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: t0 */
    public final boolean mo2887t0(p076T.C0702p c0702p) {
        p102a0.C0985l0 c0985l0 = this.f3542o;
        c0985l0.getClass();
        if (c0985l0.f3662a != 0) {
            int m2889y0 = m2889y0(c0702p);
            if ((m2889y0 & 512) != 0) {
                p102a0.C0985l0 c0985l02 = this.f3542o;
                c0985l02.getClass();
                if (c0985l02.f3662a == 2 || (m2889y0 & 1024) != 0 || (c0702p.f2388D == 0 && c0702p.f2389E == 0)) {
                    return true;
                }
            }
        }
        return this.f4725R0.m2855f(c0702p) != 0;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: u */
    public final void mo1996u() {
        p112c0.C1211J c1211j = this.f4725R0;
        this.f4734a1 = false;
        try {
            try {
                m3687I();
                m3705m0();
                p043K2.C0339o c0339o = this.f7139P;
                if (c0339o != null) {
                    c0339o.m752K(null);
                }
                this.f7139P = null;
            } catch (java.lang.Throwable th) {
                p043K2.C0339o c0339o2 = this.f7139P;
                if (c0339o2 != null) {
                    c0339o2.m752K(null);
                }
                this.f7139P = null;
                throw th;
            }
        } finally {
            if (this.f4733Z0) {
                this.f4733Z0 = false;
                c1211j.m2866r();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if ((r6.isEmpty() ? null : (p146j0.C1709m) r6.get(0)) != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0112  */
    @Override // p146j0.AbstractC1717u
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo2888u0(p146j0.C1718v r17, p076T.C0702p r18) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1214M.mo2888u0(j0.v, T.p):int");
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: v */
    public final void mo1997v() {
        this.f4725R0.m2863o();
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: w */
    public final void mo1998w() {
        m2872A0();
        p112c0.C1211J c1211j = this.f4725R0;
        c1211j.f4682Y = false;
        if (c1211j.m2861l()) {
            p112c0.C1240v c1240v = c1211j.f4700i;
            c1240v.m2919d();
            if (c1240v.f4852y == -9223372036854775807L) {
                p112c0.C1239u c1239u = c1240v.f4833f;
                c1239u.getClass();
                c1239u.m2914a();
            } else {
                c1240v.f4818A = c1240v.m2917b();
                if (!p112c0.C1211J.m2849m(c1211j.f4718w)) {
                    return;
                }
            }
            c1211j.f4718w.pause();
        }
    }

    /* renamed from: y0 */
    public final int m2889y0(p076T.C0702p c0702p) {
        p112c0.C1230l m2854e = this.f4725R0.m2854e(c0702p);
        if (!m2854e.f4792a) {
            return 0;
        }
        int i4 = m2854e.f4793b ? 1536 : 512;
        return m2854e.f4794c ? i4 | 2048 : i4;
    }

    /* renamed from: z0 */
    public final int m2890z0(p146j0.C1709m c1709m, p076T.C0702p c0702p) {
        int i4;
        if (!"OMX.google.raw.decoder".equals(c1709m.f7093a) || (i4 = p086W.AbstractC0805y.f2801a) >= 24 || (i4 == 23 && p086W.AbstractC0805y.m1591L(this.f4723P0))) {
            return c0702p.f2409n;
        }
        return -1;
    }
}
