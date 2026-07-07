package p184r0;

/* renamed from: r0.d */
/* loaded from: classes.dex */
public final class C2046d implements p215y0.InterfaceC2405q, p184r0.InterfaceC2048f {

    /* renamed from: u */
    public static final p009B2.C0033D f8320u;

    /* renamed from: v */
    public static final p076T.C0706t f8321v;

    /* renamed from: l */
    public final p215y0.InterfaceC2403o f8322l;

    /* renamed from: m */
    public final int f8323m;

    /* renamed from: n */
    public final p076T.C0702p f8324n;

    /* renamed from: o */
    public final android.util.SparseArray f8325o = new android.util.SparseArray();

    /* renamed from: p */
    public boolean f8326p;

    /* renamed from: q */
    public p094Y.C0886x f8327q;

    /* renamed from: r */
    public long f8328r;

    /* renamed from: s */
    public p215y0.InterfaceC2414z f8329s;

    /* renamed from: t */
    public p076T.C0702p[] f8330t;

    /* JADX WARN: Type inference failed for: r0v0, types: [B2.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, T.t] */
    static {
        ?? obj = new java.lang.Object();
        obj.f119b = new p046L1.C0363g(15, false);
        f8320u = obj;
        f8321v = new java.lang.Object();
    }

    public C2046d(p215y0.InterfaceC2403o interfaceC2403o, int i4, p076T.C0702p c0702p) {
        this.f8322l = interfaceC2403o;
        this.f8323m = i4;
        this.f8324n = c0702p;
    }

    /* renamed from: a */
    public final void m4102a(p094Y.C0886x c0886x, long j4, long j5) {
        this.f8327q = c0886x;
        this.f8328r = j5;
        boolean z4 = this.f8326p;
        p215y0.InterfaceC2403o interfaceC2403o = this.f8322l;
        if (!z4) {
            interfaceC2403o.mo35g(this);
            if (j4 != -9223372036854775807L) {
                interfaceC2403o.mo34b(0L, j4);
            }
            this.f8326p = true;
            return;
        }
        if (j4 == -9223372036854775807L) {
            j4 = 0;
        }
        interfaceC2403o.mo34b(0L, j4);
        int i4 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f8325o;
            if (i4 >= sparseArray.size()) {
                return;
            }
            p184r0.C2045c c2045c = (p184r0.C2045c) sparseArray.valueAt(i4);
            if (c0886x == null) {
                c2045c.f8318e = c2045c.f8316c;
            } else {
                c2045c.f8319f = j5;
                p215y0.InterfaceC2387F m1723a0 = c0886x.m1723a0(c2045c.f8314a);
                c2045c.f8318e = m1723a0;
                p076T.C0702p c0702p = c2045c.f8317d;
                if (c0702p != null) {
                    m1723a0.mo1407c(c0702p);
                }
            }
            i4++;
        }
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: s */
    public final void mo637s() {
        android.util.SparseArray sparseArray = this.f8325o;
        p076T.C0702p[] c0702pArr = new p076T.C0702p[sparseArray.size()];
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            p076T.C0702p c0702p = ((p184r0.C2045c) sparseArray.valueAt(i4)).f8317d;
            p086W.AbstractC0781a.m1422k(c0702p);
            c0702pArr[i4] = c0702p;
        }
        this.f8330t = c0702pArr;
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: t */
    public final void mo638t(p215y0.InterfaceC2414z interfaceC2414z) {
        this.f8329s = interfaceC2414z;
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: v */
    public final p215y0.InterfaceC2387F mo640v(int i4, int i5) {
        android.util.SparseArray sparseArray = this.f8325o;
        p184r0.C2045c c2045c = (p184r0.C2045c) sparseArray.get(i4);
        if (c2045c == null) {
            p086W.AbstractC0781a.m1421j(this.f8330t == null);
            c2045c = new p184r0.C2045c(i4, i5, i5 == this.f8323m ? this.f8324n : null);
            p094Y.C0886x c0886x = this.f8327q;
            long j4 = this.f8328r;
            if (c0886x == null) {
                c2045c.f8318e = c2045c.f8316c;
            } else {
                c2045c.f8319f = j4;
                p215y0.InterfaceC2387F m1723a0 = c0886x.m1723a0(i5);
                c2045c.f8318e = m1723a0;
                p076T.C0702p c0702p = c2045c.f8317d;
                if (c0702p != null) {
                    m1723a0.mo1407c(c0702p);
                }
            }
            sparseArray.put(i4, c2045c);
        }
        return c2045c;
    }
}
