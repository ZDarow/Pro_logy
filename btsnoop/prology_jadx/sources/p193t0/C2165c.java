package p193t0;

/* renamed from: t0.c */
/* loaded from: classes.dex */
public final class C2165c extends p193t0.AbstractC2166d {

    /* renamed from: g */
    public final p197u0.InterfaceC2217d f8611g;

    /* renamed from: h */
    public final long f8612h;

    /* renamed from: i */
    public final long f8613i;

    /* renamed from: j */
    public final long f8614j;

    /* renamed from: k */
    public final int f8615k;

    /* renamed from: l */
    public final int f8616l;

    /* renamed from: m */
    public final float f8617m;

    /* renamed from: n */
    public final float f8618n;

    /* renamed from: o */
    public final p129f2.AbstractC1393I f8619o;

    /* renamed from: p */
    public final p086W.C0800t f8620p;

    /* renamed from: q */
    public float f8621q;

    /* renamed from: r */
    public int f8622r;

    /* renamed from: s */
    public int f8623s;

    /* renamed from: t */
    public long f8624t;

    /* renamed from: u */
    public p184r0.AbstractC2054l f8625u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2165c(p076T.C0678V c0678v, int[] iArr, p197u0.InterfaceC2217d interfaceC2217d, long j4, long j5, long j6, p129f2.AbstractC1393I abstractC1393I) {
        super(c0678v, iArr);
        p086W.C0800t c0800t = p086W.C0800t.f2792a;
        if (j6 < j4) {
            p086W.AbstractC0781a.m1410A("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j6 = j4;
        }
        this.f8611g = interfaceC2217d;
        this.f8612h = j4 * 1000;
        this.f8613i = j5 * 1000;
        this.f8614j = j6 * 1000;
        this.f8615k = 1279;
        this.f8616l = 719;
        this.f8617m = 0.7f;
        this.f8618n = 0.75f;
        this.f8619o = p129f2.AbstractC1393I.m3162j(abstractC1393I);
        this.f8620p = c0800t;
        this.f8621q = 1.0f;
        this.f8623s = 0;
        this.f8624t = -9223372036854775807L;
    }

    /* renamed from: v */
    public static void m4287v(java.util.ArrayList arrayList, long[] jArr) {
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += j5;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            p129f2.C1390F c1390f = (p129f2.C1390F) arrayList.get(i4);
            if (c1390f != null) {
                c1390f.m3145a(new p193t0.C2163a(j4, jArr[i4]));
            }
        }
    }

    /* renamed from: x */
    public static long m4288x(java.util.List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        p184r0.AbstractC2054l abstractC2054l = (p184r0.AbstractC2054l) p129f2.AbstractC1444r.m3232l(list);
        long j4 = abstractC2054l.f8337r;
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j5 = abstractC2054l.f8338s;
        if (j5 != -9223372036854775807L) {
            return j5 - j4;
        }
        return -9223372036854775807L;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: e */
    public final int mo3268e() {
        return this.f8623s;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: g */
    public final int mo3269g() {
        return this.f8622r;
    }

    @Override // p193t0.AbstractC2166d, p193t0.InterfaceC2181s
    /* renamed from: i */
    public final void mo3975i() {
        this.f8624t = -9223372036854775807L;
        this.f8625u = null;
    }

    @Override // p193t0.AbstractC2166d, p193t0.InterfaceC2181s
    /* renamed from: j */
    public final void mo3976j(float f4) {
        this.f8621q = f4;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: l */
    public final java.lang.Object mo3270l() {
        return null;
    }

    @Override // p193t0.AbstractC2166d, p193t0.InterfaceC2181s
    /* renamed from: n */
    public final int mo3979n(long j4, java.util.List list) {
        int i4;
        int i5;
        this.f8620p.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j5 = this.f8624t;
        if (j5 != -9223372036854775807L && elapsedRealtime - j5 < 1000 && (list.isEmpty() || ((p184r0.AbstractC2054l) p129f2.AbstractC1444r.m3232l(list)).equals(this.f8625u))) {
            return list.size();
        }
        this.f8624t = elapsedRealtime;
        this.f8625u = list.isEmpty() ? null : (p184r0.AbstractC2054l) p129f2.AbstractC1444r.m3232l(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long m1582C = p086W.AbstractC0805y.m1582C(((p184r0.AbstractC2054l) list.get(size - 1)).f8337r - j4, this.f8621q);
        long j6 = this.f8614j;
        if (m1582C < j6) {
            return size;
        }
        m4288x(list);
        p076T.C0702p c0702p = this.f8629d[m4289w(elapsedRealtime)];
        for (int i6 = 0; i6 < size; i6++) {
            p184r0.AbstractC2054l abstractC2054l = (p184r0.AbstractC2054l) list.get(i6);
            p076T.C0702p c0702p2 = abstractC2054l.f8334o;
            if (p086W.AbstractC0805y.m1582C(abstractC2054l.f8337r - j4, this.f8621q) >= j6 && c0702p2.f2404i < c0702p.f2404i && (i4 = c0702p2.f2415t) != -1 && i4 <= this.f8616l && (i5 = c0702p2.f2414s) != -1 && i5 <= this.f8615k && i4 < c0702p.f2415t) {
                return i6;
            }
        }
        return size;
    }

    @Override // p193t0.AbstractC2166d, p193t0.InterfaceC2181s
    /* renamed from: r */
    public final void mo3983r() {
        this.f8625u = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    @Override // p193t0.InterfaceC2181s
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3271s(long r14, long r16, long r18, java.util.List r20, p184r0.InterfaceC2056n[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            W.t r2 = r0.f8620p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f8622r
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.f8622r
            r1 = r1[r4]
            long r4 = r1.mo2992b()
            long r6 = r1.mo2993c()
        L25:
            long r4 = r4 - r6
            goto L43
        L27:
            int r4 = r1.length
            r5 = 0
        L29:
            if (r5 >= r4) goto L3f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3c
            long r4 = r6.mo2992b()
            long r6 = r6.mo2993c()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = m4288x(r20)
        L43:
            int r1 = r0.f8623s
            if (r1 != 0) goto L51
            r1 = 1
            r0.f8623s = r1
            int r1 = r13.m4289w(r2)
            r0.f8622r = r1
            return
        L51:
            int r6 = r0.f8622r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = r8
            goto L68
        L5c:
            java.lang.Object r7 = p129f2.AbstractC1444r.m3232l(r20)
            r0.l r7 = (p184r0.AbstractC2054l) r7
            T.p r7 = r7.f8334o
            int r7 = r13.mo3981p(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = p129f2.AbstractC1444r.m3232l(r20)
            r0.l r1 = (p184r0.AbstractC2054l) r1
            int r1 = r1.f8335p
            r6 = r7
        L73:
            int r7 = r13.m4289w(r2)
            if (r7 == r6) goto Lb7
            boolean r2 = r13.mo3980o(r2, r6)
            if (r2 != 0) goto Lb7
            T.p[] r2 = r0.f8629d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f8612h
            if (r10 != 0) goto L91
            goto La3
        L91:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L98
            long r4 = r18 - r4
            goto L9a
        L98:
            r4 = r18
        L9a:
            float r4 = (float) r4
            float r5 = r0.f8618n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La3:
            int r2 = r2.f2404i
            int r3 = r3.f2404i
            if (r2 <= r3) goto Lae
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lae
            goto Lb6
        Lae:
            if (r2 >= r3) goto Lb7
            long r2 = r0.f8613i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb7
        Lb6:
            r7 = r6
        Lb7:
            if (r7 != r6) goto Lba
            goto Lbb
        Lba:
            r1 = 3
        Lbb:
            r0.f8623s = r1
            r0.f8622r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p193t0.C2165c.mo3271s(long, long, long, java.util.List, r0.n[]):void");
    }

    /* renamed from: w */
    public final int m4289w(long j4) {
        long j5;
        p197u0.C2220g c2220g = (p197u0.C2220g) this.f8611g;
        synchronized (c2220g) {
            j5 = c2220g.f8864k;
        }
        long j6 = ((float) j5) * this.f8617m;
        this.f8611g.getClass();
        long j7 = ((float) j6) / this.f8621q;
        if (!this.f8619o.isEmpty()) {
            int i4 = 1;
            while (i4 < this.f8619o.size() - 1 && ((p193t0.C2163a) this.f8619o.get(i4)).f8609a < j7) {
                i4++;
            }
            p193t0.C2163a c2163a = (p193t0.C2163a) this.f8619o.get(i4 - 1);
            p193t0.C2163a c2163a2 = (p193t0.C2163a) this.f8619o.get(i4);
            long j8 = c2163a.f8609a;
            float f4 = ((float) (j7 - j8)) / ((float) (c2163a2.f8609a - j8));
            j7 = c2163a.f8610b + (f4 * ((float) (c2163a2.f8610b - r1)));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f8627b; i6++) {
            if (j4 == Long.MIN_VALUE || !mo3980o(j4, i6)) {
                if (mo3974h(i6).f2404i <= j7) {
                    return i6;
                }
                i5 = i6;
            }
        }
        return i5;
    }
}
