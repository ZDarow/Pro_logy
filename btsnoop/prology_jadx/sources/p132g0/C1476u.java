package p132g0;

/* renamed from: g0.u */
/* loaded from: classes.dex */
public final class C1476u implements p215y0.InterfaceC2403o {

    /* renamed from: i */
    public static final java.util.regex.Pattern f6011i = java.util.regex.Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j */
    public static final java.util.regex.Pattern f6012j = java.util.regex.Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    public final java.lang.String f6013a;

    /* renamed from: b */
    public final p086W.C0803w f6014b;

    /* renamed from: d */
    public final p046L1.C0363g f6016d;

    /* renamed from: e */
    public final boolean f6017e;

    /* renamed from: f */
    public p215y0.InterfaceC2405q f6018f;

    /* renamed from: h */
    public int f6020h;

    /* renamed from: c */
    public final p086W.C0798r f6015c = new p086W.C0798r();

    /* renamed from: g */
    public byte[] f6019g = new byte[1024];

    public C1476u(java.lang.String str, p086W.C0803w c0803w, p046L1.C0363g c0363g, boolean z4) {
        this.f6013a = str;
        this.f6014b = c0803w;
        this.f6016d = c0363g;
        this.f6017e = z4;
    }

    /* renamed from: a */
    public final p215y0.InterfaceC2387F m3304a(long j4) {
        p215y0.InterfaceC2387F mo640v = this.f6018f.mo640v(0, 3);
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("text/vtt");
        c0701o.f2362d = this.f6013a;
        c0701o.f2375q = j4;
        p009B2.AbstractC0051h.m158q(c0701o, mo640v);
        this.f6018f.mo637s();
        return mo640v;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        throw new java.lang.IllegalStateException();
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f6018f = this.f6017e ? new android.support.v4.media.session.C1061t(interfaceC2405q, this.f6016d) : interfaceC2405q;
        interfaceC2405q.mo638t(new p002A0.C0004b(-9223372036854775807L));
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
        c2400l.mo634p(this.f6019g, 0, 6, false);
        byte[] bArr = this.f6019g;
        p086W.C0798r c0798r = this.f6015c;
        c0798r.m1535E(bArr, 6);
        if (p118d1.AbstractC1281j.m3017a(c0798r)) {
            return true;
        }
        c2400l.mo634p(this.f6019g, 6, 3, false);
        c0798r.m1535E(this.f6019g, 9);
        return p118d1.AbstractC1281j.m3017a(c0798r);
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        java.lang.String m1547i;
        this.f6018f.getClass();
        int i4 = (int) ((p215y0.C2400l) interfaceC2404p).f9449n;
        int i5 = this.f6020h;
        byte[] bArr = this.f6019g;
        if (i5 == bArr.length) {
            this.f6019g = java.util.Arrays.copyOf(bArr, ((i4 != -1 ? i4 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f6019g;
        int i6 = this.f6020h;
        int read = ((p215y0.C2400l) interfaceC2404p).read(bArr2, i6, bArr2.length - i6);
        if (read != -1) {
            int i7 = this.f6020h + read;
            this.f6020h = i7;
            if (i4 == -1 || i7 != i4) {
                return 0;
            }
        }
        p086W.C0798r c0798r = new p086W.C0798r(this.f6019g);
        p118d1.AbstractC1281j.m3020d(c0798r);
        java.lang.String m1547i2 = c0798r.m1547i(p124e2.AbstractC1356d.f5630c);
        long j4 = 0;
        long j5 = 0;
        while (true) {
            java.util.regex.Matcher matcher = null;
            if (android.text.TextUtils.isEmpty(m1547i2)) {
                while (true) {
                    java.lang.String m1547i3 = c0798r.m1547i(p124e2.AbstractC1356d.f5630c);
                    if (m1547i3 == null) {
                        break;
                    }
                    if (p118d1.AbstractC1281j.f5160a.matcher(m1547i3).matches()) {
                        do {
                            m1547i = c0798r.m1547i(p124e2.AbstractC1356d.f5630c);
                            if (m1547i != null) {
                            }
                        } while (!m1547i.isEmpty());
                    } else {
                        java.util.regex.Matcher matcher2 = p118d1.AbstractC1280i.f5156a.matcher(m1547i3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    m3304a(0L);
                    return -1;
                }
                java.lang.String group = matcher.group(1);
                group.getClass();
                long m3019c = p118d1.AbstractC1281j.m3019c(group);
                long m1574b = this.f6014b.m1574b(((((j4 + m3019c) - j5) * 90000) / 1000000) % 8589934592L);
                p215y0.InterfaceC2387F m3304a = m3304a(m1574b - m3019c);
                byte[] bArr3 = this.f6019g;
                int i8 = this.f6020h;
                p086W.C0798r c0798r2 = this.f6015c;
                c0798r2.m1535E(bArr3, i8);
                m3304a.mo1405a(c0798r2, this.f6020h, 0);
                m3304a.mo1406b(m1574b, 1, this.f6020h, 0, null);
                return -1;
            }
            if (m1547i2.startsWith("X-TIMESTAMP-MAP")) {
                java.util.regex.Matcher matcher3 = f6011i.matcher(m1547i2);
                if (!matcher3.find()) {
                    throw p076T.C0666I.m1202a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(m1547i2));
                }
                java.util.regex.Matcher matcher4 = f6012j.matcher(m1547i2);
                if (!matcher4.find()) {
                    throw p076T.C0666I.m1202a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(m1547i2));
                }
                java.lang.String group2 = matcher3.group(1);
                group2.getClass();
                j5 = p118d1.AbstractC1281j.m3019c(group2);
                java.lang.String group3 = matcher4.group(1);
                group3.getClass();
                j4 = (java.lang.Long.parseLong(group3) * 1000000) / 90000;
            }
            m1547i2 = c0798r.m1547i(p124e2.AbstractC1356d.f5630c);
        }
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
