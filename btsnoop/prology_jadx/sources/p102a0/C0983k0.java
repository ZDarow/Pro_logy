package p102a0;

/* renamed from: a0.k0 */
/* loaded from: classes.dex */
public final class C0983k0 extends p102a0.AbstractC0962a {

    /* renamed from: e */
    public final int f3652e;

    /* renamed from: f */
    public final int f3653f;

    /* renamed from: g */
    public final int[] f3654g;

    /* renamed from: h */
    public final int[] f3655h;

    /* renamed from: i */
    public final p076T.AbstractC0677U[] f3656i;

    /* renamed from: j */
    public final java.lang.Object[] f3657j;

    /* renamed from: k */
    public final java.util.HashMap f3658k;

    public C0983k0(p076T.AbstractC0677U[] abstractC0677UArr, java.lang.Object[] objArr, p179q0.C1991d0 c1991d0) {
        super(c1991d0);
        int length = abstractC0677UArr.length;
        this.f3656i = abstractC0677UArr;
        this.f3654g = new int[length];
        this.f3655h = new int[length];
        this.f3657j = objArr;
        this.f3658k = new java.util.HashMap();
        int length2 = abstractC0677UArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < length2) {
            p076T.AbstractC0677U abstractC0677U = abstractC0677UArr[i4];
            this.f3656i[i7] = abstractC0677U;
            this.f3655h[i7] = i5;
            this.f3654g[i7] = i6;
            i5 += abstractC0677U.mo1236o();
            i6 += this.f3656i[i7].mo1233h();
            this.f3658k.put(objArr[i7], java.lang.Integer.valueOf(i7));
            i4++;
            i7++;
        }
        this.f3652e = i5;
        this.f3653f = i6;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: h */
    public final int mo1233h() {
        return this.f3653f;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: o */
    public final int mo1236o() {
        return this.f3652e;
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: q */
    public final int mo1963q(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) this.f3658k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: r */
    public final int mo1964r(int i4) {
        return p086W.AbstractC0805y.m1610e(this.f3654g, i4 + 1, false, false);
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: s */
    public final int mo1965s(int i4) {
        return p086W.AbstractC0805y.m1610e(this.f3655h, i4 + 1, false, false);
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: t */
    public final java.lang.Object mo1966t(int i4) {
        return this.f3657j[i4];
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: u */
    public final int mo1967u(int i4) {
        return this.f3654g[i4];
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: v */
    public final int mo1968v(int i4) {
        return this.f3655h[i4];
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: y */
    public final p076T.AbstractC0677U mo1971y(int i4) {
        return this.f3656i[i4];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0983k0(java.util.ArrayList r7, p179q0.C1991d0 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            T.U[] r0 = new p076T.AbstractC0677U[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            a0.X r4 = (p102a0.InterfaceC0959X) r4
            int r5 = r3 + 1
            T.U r4 = r4.mo1826b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            a0.X r3 = (p102a0.InterfaceC0959X) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.mo1825a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p102a0.C0983k0.<init>(java.util.ArrayList, q0.d0):void");
    }
}
