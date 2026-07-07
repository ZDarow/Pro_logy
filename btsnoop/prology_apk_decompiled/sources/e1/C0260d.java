package e1;

/* renamed from: e1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260d implements y0.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f5165a;

    /* renamed from: b, reason: collision with root package name */
    public final C0261e f5166b;

    /* renamed from: c, reason: collision with root package name */
    public final W.r f5167c;

    /* renamed from: d, reason: collision with root package name */
    public final W.r f5168d;

    /* renamed from: e, reason: collision with root package name */
    public final W.q f5169e;

    /* renamed from: f, reason: collision with root package name */
    public y0.q f5170f;

    /* renamed from: g, reason: collision with root package name */
    public long f5171g;

    /* renamed from: h, reason: collision with root package name */
    public long f5172h;

    /* renamed from: i, reason: collision with root package name */
    public int f5173i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5174j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5175k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5176l;

    public C0260d(int i4) {
        this.f5165a = (i4 & 2) != 0 ? i4 | 1 : i4;
        this.f5166b = new C0261e(0, null, true);
        this.f5167c = new W.r(2048);
        this.f5173i = -1;
        this.f5172h = -1L;
        W.r rVar = new W.r(10);
        this.f5168d = rVar;
        byte[] bArr = rVar.f2694a;
        this.f5169e = new W.q(bArr, bArr.length);
    }

    public final int a(y0.l lVar) {
        int i4 = 0;
        while (true) {
            W.r rVar = this.f5168d;
            lVar.p(rVar.f2694a, 0, 10, false);
            rVar.G(0);
            if (rVar.x() != 4801587) {
                break;
            }
            rVar.H(3);
            int t4 = rVar.t();
            i4 += t4 + 10;
            lVar.a(t4, false);
        }
        lVar.f9091q = 0;
        lVar.a(i4, false);
        if (this.f5172h == -1) {
            this.f5172h = i4;
        }
        return i4;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        this.f5175k = false;
        this.f5166b.b();
        this.f5171g = j5;
    }

    @Override // y0.o
    public final void g(y0.q qVar) {
        this.f5170f = qVar;
        this.f5166b.f(qVar, new G(0, 1));
        qVar.s();
    }

    @Override // y0.o
    public final boolean k(y0.p pVar) {
        y0.l lVar = (y0.l) pVar;
        int a4 = a(lVar);
        int i4 = a4;
        int i5 = 0;
        int i6 = 0;
        do {
            W.r rVar = this.f5168d;
            lVar.p(rVar.f2694a, 0, 2, false);
            rVar.G(0);
            if ((rVar.A() & 65526) == 65520) {
                i5++;
                if (i5 >= 4 && i6 > 188) {
                    return true;
                }
                lVar.p(rVar.f2694a, 0, 4, false);
                W.q qVar = this.f5169e;
                qVar.q(14);
                int i7 = qVar.i(13);
                if (i7 <= 6) {
                    i4++;
                    lVar.f9091q = 0;
                    lVar.a(i4, false);
                } else {
                    lVar.a(i7 - 6, false);
                    i6 += i7;
                }
            } else {
                i4++;
                lVar.f9091q = 0;
                lVar.a(i4, false);
            }
            i5 = 0;
            i6 = 0;
        } while (i4 - a4 < 8192);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0095, code lost:
    
        r18.f5174j = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009f, code lost:
    
        throw T.I.a(null, "Malformed ADTS stream");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r19, T.C0098t r20) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0260d.l(y0.p, T.t):int");
    }

    @Override // y0.o
    public final void release() {
    }
}
