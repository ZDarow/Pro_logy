package p054N1;

/* renamed from: N1.v */
/* loaded from: classes.dex */
public final class C0467v implements p119d2.InterfaceC1282a, p166n0.InterfaceC1893i {

    /* renamed from: l */
    public long f1360l;

    /* renamed from: m */
    public long f1361m;

    /* renamed from: n */
    public int f1362n;

    /* renamed from: o */
    public final java.lang.Object f1363o;

    /* renamed from: p */
    public java.lang.Object f1364p;

    public C0467v(p054N1.C0449d c0449d, int i4, p054N1.C0447b c0447b, long j4, long j5) {
        this.f1363o = c0449d;
        this.f1362n = i4;
        this.f1364p = c0447b;
        this.f1360l = j4;
        this.f1361m = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p058O1.C0500d m981a(p054N1.C0460o r4, com.google.android.gms.common.internal.AbstractC1253a r5, int r6) {
        /*
            O1.y r5 = r5.f4920F
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            O1.d r5 = r5.f1541o
        L9:
            if (r5 == 0) goto L36
            boolean r1 = r5.f1465m
            if (r1 == 0) goto L36
            int[] r1 = r5.f1467o
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f1469q
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L36
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L36
            r3 = r1[r2]
            if (r3 != r6) goto L33
        L2b:
            int r4 = r4.f1344n
            int r6 = r5.f1468p
            if (r4 >= r6) goto L32
            return r5
        L32:
            return r0
        L33:
            int r2 = r2 + 1
            goto L24
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p054N1.C0467v.m981a(N1.o, com.google.android.gms.common.internal.a, int):O1.d");
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public void mo982b(long j4, long j5) {
        this.f1360l = j4;
        this.f1361m = j5;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    public void mo983c(p086W.C0798r c0798r, long j4, int i4, boolean z4) {
        int m3811a;
        ((p215y0.InterfaceC2387F) this.f1364p).getClass();
        int i5 = this.f1362n;
        if (i5 != -1 && i4 != (m3811a = p161m0.C1852i.m3811a(i5))) {
            int i6 = p086W.AbstractC0805y.f2801a;
            java.util.Locale locale = java.util.Locale.US;
            android.util.Log.w("RtpPcmReader", "Received RTP packet with unexpected sequence number. Expected: " + m3811a + "; received: " + i4 + ".");
        }
        long m1363K = p080U1.AbstractC0748a.m1363K(this.f1361m, j4, this.f1360l, ((p161m0.C1854k) this.f1363o).f7511b);
        int m1539a = c0798r.m1539a();
        ((p215y0.InterfaceC2387F) this.f1364p).mo1405a(c0798r, m1539a, 0);
        ((p215y0.InterfaceC2387F) this.f1364p).mo1406b(m1363K, 1, m1539a, 0, null);
        this.f1362n = i4;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 1);
        this.f1364p = mo640v;
        mo640v.mo1407c(((p161m0.C1854k) this.f1363o).f7512c);
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public void mo985e(long j4) {
        this.f1360l = j4;
    }

    @Override // p119d2.InterfaceC1282a
    /* renamed from: f */
    public void mo107f(p119d2.C1290i c1290i) {
        int i4;
        int i5;
        int i6;
        java.lang.Exception exc;
        int i7;
        long j4;
        int i8;
        if (((p054N1.C0449d) this.f1363o).m954a()) {
            p058O1.C0505i c0505i = (p058O1.C0505i) p058O1.C0504h.m1003b().f1497a;
            if (c0505i == null || c0505i.f1499m) {
                p054N1.C0460o c0460o = (p054N1.C0460o) ((p054N1.C0449d) this.f1363o).f1318u.get((p054N1.C0447b) this.f1364p);
                if (c0460o != null) {
                    p050M1.InterfaceC0419c interfaceC0419c = c0460o.f1334d;
                    if (interfaceC0419c instanceof com.google.android.gms.common.internal.AbstractC1253a) {
                        com.google.android.gms.common.internal.AbstractC1253a abstractC1253a = (com.google.android.gms.common.internal.AbstractC1253a) interfaceC0419c;
                        long j5 = 0;
                        int i9 = 0;
                        boolean z4 = this.f1360l > 0;
                        int i10 = abstractC1253a.f4915A;
                        if (c0505i != null) {
                            z4 &= c0505i.f1500n;
                            int i11 = c0505i.f1501o;
                            int i12 = c0505i.f1502p;
                            i4 = c0505i.f1498l;
                            if (abstractC1253a.f4920F != null && !abstractC1253a.mo884a()) {
                                p058O1.C0500d m981a = m981a(c0460o, abstractC1253a, this.f1362n);
                                if (m981a == null) {
                                    return;
                                }
                                boolean z5 = m981a.f1466n && this.f1360l > 0;
                                i12 = m981a.f1468p;
                                z4 = z5;
                            }
                            i6 = i11;
                            i5 = i12;
                        } else {
                            i4 = 0;
                            i5 = 100;
                            i6 = 5000;
                        }
                        p054N1.C0449d c0449d = (p054N1.C0449d) this.f1363o;
                        if (c1290i.m3025b()) {
                            i7 = 0;
                        } else {
                            if (c1290i.f5171d) {
                                i9 = 100;
                            } else {
                                synchronized (c1290i.f5168a) {
                                    exc = c1290i.f5173f;
                                }
                                if (exc instanceof p050M1.C0420d) {
                                    com.google.android.gms.common.api.Status status = ((p050M1.C0420d) exc).f1198l;
                                    i9 = status.f4910l;
                                    p046L1.C0357a c0357a = status.f4913o;
                                    if (c0357a != null) {
                                        i7 = c0357a.f1094m;
                                    }
                                } else {
                                    i9 = 101;
                                }
                            }
                            i7 = -1;
                        }
                        if (z4) {
                            j5 = this.f1360l;
                            long j6 = this.f1361m;
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            i8 = (int) (android.os.SystemClock.elapsedRealtime() - j6);
                            j4 = currentTimeMillis;
                        } else {
                            j4 = 0;
                            i8 = -1;
                        }
                        c0449d.getClass();
                        p054N1.C0468w c0468w = new p054N1.C0468w(new p058O1.C0503g(this.f1362n, i9, i7, j5, j4, null, null, i10, i8), i4, i6, i5);
                        p088W1.HandlerC0820f handlerC0820f = c0449d.f1321x;
                        handlerC0820f.sendMessage(handlerC0820f.obtainMessage(18, c0468w));
                    }
                }
            }
        }
    }

    public C0467v(p161m0.C1854k c1854k) {
        this.f1363o = c1854k;
        this.f1360l = -9223372036854775807L;
        this.f1361m = 0L;
        this.f1362n = -1;
    }
}
