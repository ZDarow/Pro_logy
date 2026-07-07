package n0;

import T.C0095p;
import W.y;
import m0.C0430k;
import y0.F;
import y0.q;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: l, reason: collision with root package name */
    public int f7421l;

    /* renamed from: m, reason: collision with root package name */
    public int f7422m;

    /* renamed from: n, reason: collision with root package name */
    public int f7423n;

    /* renamed from: o, reason: collision with root package name */
    public long f7424o;

    /* renamed from: p, reason: collision with root package name */
    public long f7425p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f7426q;

    /* renamed from: r, reason: collision with root package name */
    public Object f7427r;

    public g(C0430k c0430k) {
        this.f7426q = c0430k;
        this.f7424o = -9223372036854775807L;
        this.f7422m = -1;
    }

    @Override // n0.i
    public void b(long j4, long j5) {
        this.f7424o = j4;
        this.f7425p = j5;
        this.f7423n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if ((r24.e() >> 6) == 0) goto L26;
     */
    @Override // n0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(W.r r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.f7427r
            y0.F r5 = (y0.F) r5
            W.a.k(r5)
            int r5 = r0.f7422m
            r6 = -1
            if (r5 == r6) goto L3e
            int r5 = m0.C0428i.a(r5)
            if (r2 == r5) goto L3e
            int r7 = W.y.f2709a
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
            W.a.A(r7, r5)
        L3e:
            int r5 = r24.a()
            java.lang.Object r7 = r0.f7427r
            y0.F r7 = (y0.F) r7
            r8 = 0
            r7.a(r1, r5, r8)
            int r7 = r0.f7423n
            if (r7 != 0) goto L88
            byte[] r7 = r1.f2694a
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
            r1.G(r10)
            int r1 = r24.e()
            int r1 = r1 >> 6
            if (r1 != 0) goto L7c
            goto L7d
        L7c:
            r4 = r8
        L7d:
            r0.f7421l = r4
            goto L88
        L80:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "array"
            r1.<init>(r2)
            throw r1
        L88:
            int r1 = r0.f7423n
            int r1 = r1 + r5
            r0.f7423n = r1
            if (r28 == 0) goto Lc2
            long r3 = r0.f7424o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = r25
            if (r1 != 0) goto L9e
            r0.f7424o = r3
        L9e:
            long r9 = r0.f7425p
            long r13 = r0.f7424o
            r15 = 90000(0x15f90, float:1.26117E-40)
            r11 = r25
            long r17 = U1.a.K(r9, r11, r13, r15)
            java.lang.Object r1 = r0.f7427r
            r16 = r1
            y0.F r16 = (y0.F) r16
            int r1 = r0.f7421l
            int r3 = r0.f7423n
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.b(r17, r19, r20, r21, r22)
            r0.f7423n = r8
        Lc2:
            r0.f7422m = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.g.c(W.r, long, int, boolean):void");
    }

    @Override // n0.i
    public void d(q qVar, int i4) {
        F v4 = qVar.v(i4, 2);
        this.f7427r = v4;
        int i5 = y.f2709a;
        v4.c(((C0430k) this.f7426q).f7239c);
    }

    @Override // n0.i
    public void e(long j4) {
    }

    public g(int i4, int i5, C0095p c0095p, int i6, Object obj, long j4, long j5) {
        this.f7421l = i4;
        this.f7422m = i5;
        this.f7426q = c0095p;
        this.f7423n = i6;
        this.f7427r = obj;
        this.f7424o = j4;
        this.f7425p = j5;
    }
}
