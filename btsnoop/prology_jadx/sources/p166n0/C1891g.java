package p166n0;

/* renamed from: n0.g */
/* loaded from: classes.dex */
public final class C1891g implements p166n0.InterfaceC1893i {

    /* renamed from: l */
    public int f7706l;

    /* renamed from: m */
    public int f7707m;

    /* renamed from: n */
    public int f7708n;

    /* renamed from: o */
    public long f7709o;

    /* renamed from: p */
    public long f7710p;

    /* renamed from: q */
    public final java.lang.Object f7711q;

    /* renamed from: r */
    public java.lang.Object f7712r;

    public C1891g(p161m0.C1854k c1854k) {
        this.f7711q = c1854k;
        this.f7709o = -9223372036854775807L;
        this.f7707m = -1;
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public void mo982b(long j4, long j5) {
        this.f7709o = j4;
        this.f7710p = j5;
        this.f7708n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if ((r24.m1543e() >> 6) == 0) goto L26;
     */
    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo983c(p086W.C0798r r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.f7712r
            y0.F r5 = (p215y0.InterfaceC2387F) r5
            p086W.AbstractC0781a.m1422k(r5)
            int r5 = r0.f7707m
            r6 = -1
            if (r5 == r6) goto L3e
            int r5 = p161m0.C1852i.m3811a(r5)
            if (r2 == r5) goto L3e
            int r7 = p086W.AbstractC0805y.f2801a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Received RTP packet with unexpected sequence number. Expected: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = "; received: "
            r7.append(r5)
            r7.append(r2)
            java.lang.String r5 = ". Dropping packet."
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "RtpMpeg4Reader"
            p086W.AbstractC0781a.m1410A(r7, r5)
        L3e:
            int r5 = r24.m1539a()
            java.lang.Object r7 = r0.f7712r
            y0.F r7 = (p215y0.InterfaceC2387F) r7
            r8 = 0
            r7.mo1405a(r1, r5, r8)
            int r7 = r0.f7708n
            if (r7 != 0) goto L88
            byte[] r7 = r1.f2786a
            byte[] r9 = new byte[r3]
            r9 = {x00c6: FILL_ARRAY_DATA , data: [0, 0, 1, -74} // fill-array
            if (r7 == 0) goto L80
            r10 = r8
        L58:
            int r11 = r7.length
            int r11 = r11 + (-3)
            if (r10 >= r11) goto L6c
            r11 = r8
        L5e:
            if (r11 >= r3) goto L6d
            int r12 = r10 + r11
            r12 = r7[r12]
            r13 = r9[r11]
            if (r12 == r13) goto L6a
            int r10 = r10 + r4
            goto L58
        L6a:
            int r11 = r11 + r4
            goto L5e
        L6c:
            r10 = r6
        L6d:
            if (r10 == r6) goto L7c
            int r10 = r10 + r3
            r1.m1537G(r10)
            int r1 = r24.m1543e()
            int r1 = r1 >> 6
            if (r1 != 0) goto L7c
            goto L7d
        L7c:
            r4 = r8
        L7d:
            r0.f7706l = r4
            goto L88
        L80:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "array"
            r1.<init>(r2)
            throw r1
        L88:
            int r1 = r0.f7708n
            int r1 = r1 + r5
            r0.f7708n = r1
            if (r28 == 0) goto Lc2
            long r3 = r0.f7709o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = r25
            if (r1 != 0) goto L9e
            r0.f7709o = r3
        L9e:
            long r9 = r0.f7710p
            long r13 = r0.f7709o
            r15 = 90000(0x15f90, float:1.26117E-40)
            r11 = r25
            long r17 = p080U1.AbstractC0748a.m1363K(r9, r11, r13, r15)
            java.lang.Object r1 = r0.f7712r
            r16 = r1
            y0.F r16 = (p215y0.InterfaceC2387F) r16
            int r1 = r0.f7706l
            int r3 = r0.f7708n
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.mo1406b(r17, r19, r20, r21, r22)
            r0.f7708n = r8
        Lc2:
            r0.f7707m = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p166n0.C1891g.mo983c(W.r, long, int, boolean):void");
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 2);
        this.f7712r = mo640v;
        int i5 = p086W.AbstractC0805y.f2801a;
        mo640v.mo1407c(((p161m0.C1854k) this.f7711q).f7512c);
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public void mo985e(long j4) {
    }

    public C1891g(int i4, int i5, p076T.C0702p c0702p, int i6, java.lang.Object obj, long j4, long j5) {
        this.f7706l = i4;
        this.f7707m = i5;
        this.f7711q = c0702p;
        this.f7708n = i6;
        this.f7712r = obj;
        this.f7709o = j4;
        this.f7710p = j5;
    }
}
