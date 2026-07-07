package p006B;

/* renamed from: B.c */
/* loaded from: classes.dex */
public final class C0020c implements p047L2.InterfaceC0379i, p146j0.InterfaceC1722z, p179q0.InterfaceC1985a0 {

    /* renamed from: l */
    public int f87l;

    /* renamed from: m */
    public java.lang.Object f88m;

    public /* synthetic */ C0020c(int i4, java.lang.Object obj) {
        this.f88m = obj;
        this.f87l = i4;
    }

    @Override // p047L2.InterfaceC0379i
    /* renamed from: E */
    public void mo47E() {
        ((p093X2.C0849j) this.f88m).f3044f.m1681b();
        android.os.AsyncTask.execute(new p093X2.RunnableC0848i(this.f87l, 0, this));
    }

    @Override // p047L2.InterfaceC0379i
    /* renamed from: H */
    public void mo48H(java.lang.Object obj, p047L2.C0378h c0378h) {
        ((p093X2.C0849j) this.f88m).f3042d = c0378h;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: a */
    public void mo49a() {
        androidx.datastore.preferences.protobuf.C1113k c1113k = ((p161m0.C1861r) this.f88m).f7569w;
        if (c1113k != null) {
            throw c1113k;
        }
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: b */
    public boolean mo50b(java.lang.String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: c */
    public int mo51c() {
        if (((android.media.MediaCodecInfo[]) this.f88m) == null) {
            this.f88m = new android.media.MediaCodecList(this.f87l).getCodecInfos();
        }
        return ((android.media.MediaCodecInfo[]) this.f88m).length;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: d */
    public boolean mo52d() {
        p161m0.C1861r c1861r = (p161m0.C1861r) this.f88m;
        if (!c1861r.f7552B) {
            p161m0.C1860q c1860q = (p161m0.C1860q) c1861r.f7562p.get(this.f87l);
            if (c1860q.f7547c.m4023s(c1860q.f7548d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m53e(long j4) {
        int i4 = this.f87l;
        long[] jArr = (long[]) this.f88m;
        if (i4 == jArr.length) {
            this.f88m = java.util.Arrays.copyOf(jArr, i4 * 2);
        }
        long[] jArr2 = (long[]) this.f88m;
        int i5 = this.f87l;
        this.f87l = i5 + 1;
        jArr2[i5] = j4;
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: f */
    public android.media.MediaCodecInfo mo54f(int i4) {
        if (((android.media.MediaCodecInfo[]) this.f88m) == null) {
            this.f88m = new android.media.MediaCodecList(this.f87l).getCodecInfos();
        }
        return ((android.media.MediaCodecInfo[]) this.f88m)[i4];
    }

    /* renamed from: g */
    public long m55g(int i4) {
        if (i4 >= 0 && i4 < this.f87l) {
            return ((long[]) this.f88m)[i4];
        }
        throw new java.lang.IndexOutOfBoundsException("Invalid index " + i4 + ", size is " + this.f87l);
    }

    /* renamed from: h */
    public long m56h(p215y0.C2400l c2400l) {
        p086W.C0798r c0798r = (p086W.C0798r) this.f88m;
        int i4 = 0;
        c2400l.mo634p(c0798r.f2786a, 0, 1, false);
        int i5 = c0798r.f2786a[0] & 255;
        if (i5 == 0) {
            return Long.MIN_VALUE;
        }
        int i6 = 128;
        int i7 = 0;
        while ((i5 & i6) == 0) {
            i6 >>= 1;
            i7++;
        }
        int i8 = i5 & (~i6);
        c2400l.mo634p(c0798r.f2786a, 1, i7, false);
        while (i4 < i7) {
            i4++;
            i8 = (c0798r.f2786a[i4] & 255) + (i8 << 8);
        }
        this.f87l = i7 + 1 + this.f87l;
        return i8;
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: k */
    public boolean mo57k(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: n */
    public int mo58n(long j4) {
        p161m0.C1861r c1861r = (p161m0.C1861r) this.f88m;
        if (c1861r.f7552B) {
            return -3;
        }
        p161m0.C1860q c1860q = (p161m0.C1860q) c1861r.f7562p.get(this.f87l);
        p179q0.C1983Z c1983z = c1860q.f7547c;
        int m4020p = c1983z.m4020p(j4, c1860q.f7548d);
        c1983z.m4009C(m4020p);
        return m4020p;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: o */
    public int mo59o(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        p161m0.C1861r c1861r = (p161m0.C1861r) this.f88m;
        if (c1861r.f7552B) {
            return -3;
        }
        p161m0.C1860q c1860q = (p161m0.C1860q) c1861r.f7562p.get(this.f87l);
        return c1860q.f7547c.m4028x(c0886x, c0921f, i4, c1860q.f7548d);
    }

    @Override // p146j0.InterfaceC1722z
    /* renamed from: r */
    public boolean mo60r() {
        return true;
    }

    public C0020c(p046L1.C0357a c0357a, int i4) {
        p058O1.AbstractC0515s.m1017d(c0357a);
        this.f88m = c0357a;
        this.f87l = i4;
    }

    public C0020c(int i4, p009B2.C0038I[] c0038iArr) {
        this.f87l = i4;
        this.f88m = c0038iArr;
    }

    public C0020c(int i4, boolean z4) {
        switch (i4) {
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                this.f88m = new long[32];
                return;
            default:
                this.f88m = new p086W.C0798r(8);
                return;
        }
    }

    public C0020c(int i4) {
        if (i4 > 0) {
            this.f88m = new java.lang.Object[i4];
            return;
        }
        throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
    }
}
