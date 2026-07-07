package p123e1;

/* renamed from: e1.p */
/* loaded from: classes.dex */
public final class C1342p {

    /* renamed from: a */
    public final p215y0.InterfaceC2387F f5478a;

    /* renamed from: b */
    public final boolean f5479b;

    /* renamed from: c */
    public final boolean f5480c;

    /* renamed from: f */
    public final p086W.C0797q f5483f;

    /* renamed from: g */
    public byte[] f5484g;

    /* renamed from: h */
    public int f5485h;

    /* renamed from: i */
    public int f5486i;

    /* renamed from: j */
    public long f5487j;

    /* renamed from: l */
    public long f5489l;

    /* renamed from: p */
    public long f5493p;

    /* renamed from: q */
    public long f5494q;

    /* renamed from: r */
    public boolean f5495r;

    /* renamed from: s */
    public boolean f5496s;

    /* renamed from: d */
    public final android.util.SparseArray f5481d = new android.util.SparseArray();

    /* renamed from: e */
    public final android.util.SparseArray f5482e = new android.util.SparseArray();

    /* renamed from: m */
    public p123e1.C1341o f5490m = new java.lang.Object();

    /* renamed from: n */
    public p123e1.C1341o f5491n = new java.lang.Object();

    /* renamed from: k */
    public boolean f5488k = false;

    /* renamed from: o */
    public boolean f5492o = false;

    /* JADX WARN: Type inference failed for: r1v3, types: [e1.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [e1.o, java.lang.Object] */
    public C1342p(p215y0.InterfaceC2387F interfaceC2387F, boolean z4, boolean z5) {
        this.f5478a = interfaceC2387F;
        this.f5479b = z4;
        this.f5480c = z5;
        byte[] bArr = new byte[128];
        this.f5484g = bArr;
        this.f5483f = new p086W.C0797q(bArr, 0, 0);
        p123e1.C1341o c1341o = this.f5491n;
        c1341o.f5463b = false;
        c1341o.f5462a = false;
    }

    /* renamed from: a */
    public final void m3104a() {
        boolean z4;
        int i4;
        boolean z5 = false;
        if (this.f5479b) {
            p123e1.C1341o c1341o = this.f5491n;
            z4 = c1341o.f5463b && ((i4 = c1341o.f5466e) == 7 || i4 == 2);
        } else {
            z4 = this.f5496s;
        }
        boolean z6 = this.f5495r;
        int i5 = this.f5486i;
        if (i5 == 5 || (z4 && i5 == 1)) {
            z5 = true;
        }
        this.f5495r = z6 | z5;
    }
}
