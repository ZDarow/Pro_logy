package p077T0;

/* renamed from: T0.e */
/* loaded from: classes.dex */
public final class C0717e implements p094Y.InterfaceC0869g {

    /* renamed from: l */
    public int f2474l;

    /* renamed from: m */
    public int f2475m;

    /* renamed from: n */
    public boolean f2476n;

    /* renamed from: o */
    public final java.lang.Object f2477o;

    /* renamed from: p */
    public java.lang.Object f2478p;

    public C0717e(int i4) {
        switch (i4) {
            case 1:
                this.f2477o = new p094Y.C0886x(0, (byte) 0);
                this.f2474l = 8000;
                this.f2475m = 8000;
                return;
            default:
                this.f2477o = new p077T0.C0718f();
                this.f2478p = new p086W.C0798r(new byte[65025], 0);
                this.f2474l = -1;
                return;
        }
    }

    @Override // p094Y.InterfaceC0869g
    /* renamed from: a */
    public p094Y.InterfaceC0870h mo104a() {
        return new p094Y.C0878p((java.lang.String) this.f2478p, this.f2474l, this.f2475m, this.f2476n, (p094Y.C0886x) this.f2477o);
    }

    /* renamed from: b */
    public int m1307b(int i4) {
        int i5;
        int i6 = 0;
        this.f2475m = 0;
        do {
            int i7 = this.f2475m;
            int i8 = i4 + i7;
            p077T0.C0718f c0718f = (p077T0.C0718f) this.f2477o;
            if (i8 >= c0718f.f2481c) {
                break;
            }
            int[] iArr = c0718f.f2484f;
            this.f2475m = i7 + 1;
            i5 = iArr[i7 + i4];
            i6 += i5;
        } while (i5 == 255);
        return i6;
    }

    /* renamed from: c */
    public boolean m1308c(p215y0.C2400l c2400l) {
        int i4;
        p086W.AbstractC0781a.m1421j(c2400l != null);
        boolean z4 = this.f2476n;
        p086W.C0798r c0798r = (p086W.C0798r) this.f2478p;
        if (z4) {
            this.f2476n = false;
            c0798r.m1534D(0);
        }
        while (!this.f2476n) {
            int i5 = this.f2474l;
            p077T0.C0718f c0718f = (p077T0.C0718f) this.f2477o;
            if (i5 < 0) {
                if (c0718f.m1311b(c2400l, -1L) && c0718f.m1310a(c2400l, true)) {
                    int i6 = c0718f.f2482d;
                    if ((c0718f.f2479a & 1) == 1 && c0798r.f2788c == 0) {
                        i6 += m1307b(0);
                        i4 = this.f2475m;
                    } else {
                        i4 = 0;
                    }
                    try {
                        c2400l.mo628e(i6);
                        this.f2474l = i4;
                    } catch (java.io.EOFException unused) {
                    }
                }
                return false;
            }
            int m1307b = m1307b(this.f2474l);
            int i7 = this.f2474l + this.f2475m;
            if (m1307b > 0) {
                c0798r.m1540b(c0798r.f2788c + m1307b);
                try {
                    c2400l.mo631k(c0798r.f2786a, c0798r.f2788c, m1307b, false);
                    c0798r.m1536F(c0798r.f2788c + m1307b);
                    this.f2476n = c0718f.f2484f[i7 + (-1)] != 255;
                } catch (java.io.EOFException unused2) {
                    return false;
                }
            }
            if (i7 == c0718f.f2481c) {
                i7 = -1;
            }
            this.f2474l = i7;
        }
        return true;
    }

    /* renamed from: d */
    public void m1309d(java.util.HashMap hashMap) {
        p094Y.C0886x c0886x = (p094Y.C0886x) this.f2477o;
        synchronized (c0886x) {
            c0886x.f3176n = null;
            ((java.util.HashMap) c0886x.f3175m).clear();
            ((java.util.HashMap) c0886x.f3175m).putAll(hashMap);
        }
    }
}
