package a0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class k0 extends AbstractC0121a {

    /* renamed from: e, reason: collision with root package name */
    public final int f3530e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3531f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3532g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f3533h;

    /* renamed from: i, reason: collision with root package name */
    public final T.U[] f3534i;

    /* renamed from: j, reason: collision with root package name */
    public final Object[] f3535j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f3536k;

    public k0(T.U[] uArr, Object[] objArr, q0.d0 d0Var) {
        super(d0Var);
        int length = uArr.length;
        this.f3534i = uArr;
        this.f3532g = new int[length];
        this.f3533h = new int[length];
        this.f3535j = objArr;
        this.f3536k = new HashMap();
        int length2 = uArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < length2) {
            T.U u4 = uArr[i4];
            this.f3534i[i7] = u4;
            this.f3533h[i7] = i5;
            this.f3532g[i7] = i6;
            i5 += u4.o();
            i6 += this.f3534i[i7].h();
            this.f3536k.put(objArr[i7], Integer.valueOf(i7));
            i4++;
            i7++;
        }
        this.f3530e = i5;
        this.f3531f = i6;
    }

    @Override // T.U
    public final int h() {
        return this.f3531f;
    }

    @Override // T.U
    public final int o() {
        return this.f3530e;
    }

    @Override // a0.AbstractC0121a
    public final int q(Object obj) {
        Integer num = (Integer) this.f3536k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // a0.AbstractC0121a
    public final int r(int i4) {
        return W.y.e(this.f3532g, i4 + 1, false, false);
    }

    @Override // a0.AbstractC0121a
    public final int s(int i4) {
        return W.y.e(this.f3533h, i4 + 1, false, false);
    }

    @Override // a0.AbstractC0121a
    public final Object t(int i4) {
        return this.f3535j[i4];
    }

    @Override // a0.AbstractC0121a
    public final int u(int i4) {
        return this.f3532g[i4];
    }

    @Override // a0.AbstractC0121a
    public final int v(int i4) {
        return this.f3533h[i4];
    }

    @Override // a0.AbstractC0121a
    public final T.U y(int i4) {
        return this.f3534i[i4];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0(java.util.ArrayList r7, q0.d0 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            T.U[] r0 = new T.U[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            a0.X r4 = (a0.X) r4
            int r5 = r3 + 1
            T.U r4 = r4.b()
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
            a0.X r3 = (a0.X) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.k0.<init>(java.util.ArrayList, q0.d0):void");
    }
}
