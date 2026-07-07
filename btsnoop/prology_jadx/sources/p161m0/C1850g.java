package p161m0;

/* renamed from: m0.g */
/* loaded from: classes.dex */
public final class C1850g implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final p166n0.InterfaceC1893i f7482a;

    /* renamed from: b */
    public final p086W.C0798r f7483b;

    /* renamed from: c */
    public final p086W.C0798r f7484c;

    /* renamed from: d */
    public final int f7485d;

    /* renamed from: e */
    public final java.lang.Object f7486e;

    /* renamed from: f */
    public final p043K2.C0327c f7487f;

    /* renamed from: g */
    public p215y0.InterfaceC2405q f7488g;

    /* renamed from: h */
    public boolean f7489h;

    /* renamed from: i */
    public volatile long f7490i;

    /* renamed from: j */
    public volatile int f7491j;

    /* renamed from: k */
    public boolean f7492k;

    /* renamed from: l */
    public long f7493l;

    /* renamed from: m */
    public long f7494m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C1850g(p161m0.C1854k c1854k, int i4) {
        char c4;
        p166n0.InterfaceC1893i c1888d;
        p166n0.InterfaceC1893i interfaceC1893i;
        this.f7485d = i4;
        java.lang.String str = c1854k.f7512c.f2408m;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                c1888d = new p166n0.C1888d(c1854k, 0);
                interfaceC1893i = c1888d;
                break;
            case 1:
                c1888d = new p166n0.C1889e(c1854k, 1);
                interfaceC1893i = c1888d;
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                c1888d = new p166n0.C1887c(c1854k);
                interfaceC1893i = c1888d;
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                c1888d = c1854k.f7514e.equals("MP4A-LATM") ? new p166n0.C1890f(c1854k) : new p166n0.C1885a(c1854k);
                interfaceC1893i = c1888d;
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                c1888d = new p166n0.C1886b(c1854k);
                interfaceC1893i = c1888d;
                break;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
            case '\f':
            case '\r':
                c1888d = new p054N1.C0467v(c1854k);
                interfaceC1893i = c1888d;
                break;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                c1888d = new p166n0.C1891g(c1854k);
                interfaceC1893i = c1888d;
                break;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                c1888d = new p166n0.C1889e(c1854k, 0);
                interfaceC1893i = c1888d;
                break;
            case '\t':
                c1888d = new p166n0.C1892h(c1854k);
                interfaceC1893i = c1888d;
                break;
            case '\n':
                c1888d = new p166n0.C1894j(c1854k);
                interfaceC1893i = c1888d;
                break;
            case 11:
                c1888d = new p166n0.C1888d(c1854k, 1);
                interfaceC1893i = c1888d;
                break;
            default:
                interfaceC1893i = null;
                break;
        }
        interfaceC1893i.getClass();
        this.f7482a = interfaceC1893i;
        this.f7483b = new p086W.C0798r(65507);
        this.f7484c = new p086W.C0798r();
        this.f7486e = new java.lang.Object();
        this.f7487f = new p043K2.C0327c();
        this.f7490i = -9223372036854775807L;
        this.f7491j = -1;
        this.f7493l = -9223372036854775807L;
        this.f7494m = -9223372036854775807L;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        synchronized (this.f7486e) {
            try {
                if (!this.f7492k) {
                    this.f7492k = true;
                }
                this.f7493l = j4;
                this.f7494m = j5;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f7482a.mo984d(interfaceC2405q, this.f7485d);
        interfaceC2405q.mo637s();
        interfaceC2405q.mo638t(new p002A0.C0004b(-9223372036854775807L));
        this.f7488g = interfaceC2405q;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        throw new java.lang.UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, m0.h] */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        this.f7488g.getClass();
        int read = interfaceC2404p.read(this.f7483b.f2786a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f7483b.m1537G(0);
        this.f7483b.m1536F(read);
        p086W.C0798r c0798r = this.f7483b;
        p161m0.C1852i c1852i = null;
        if (c0798r.m1539a() >= 12) {
            int m1559u = c0798r.m1559u();
            byte b4 = (byte) (m1559u >> 6);
            byte b5 = (byte) (m1559u & 15);
            if (b4 == 2) {
                int m1559u2 = c0798r.m1559u();
                boolean z4 = ((m1559u2 >> 7) & 1) == 1;
                byte b6 = (byte) (m1559u2 & 127);
                int m1531A = c0798r.m1531A();
                long m1561w = c0798r.m1561w();
                int m1546h = c0798r.m1546h();
                byte[] bArr = p161m0.C1852i.f7501g;
                if (b5 > 0) {
                    byte[] bArr2 = new byte[b5 * 4];
                    for (int i4 = 0; i4 < b5; i4++) {
                        c0798r.m1544f(bArr2, i4 * 4, 4);
                    }
                }
                byte[] bArr3 = new byte[c0798r.m1539a()];
                c0798r.m1544f(bArr3, 0, c0798r.m1539a());
                ?? obj = new java.lang.Object();
                obj.f7500f = bArr;
                obj.f7495a = z4;
                obj.f7496b = b6;
                p086W.AbstractC0781a.m1416e(m1531A >= 0 && m1531A <= 65535);
                obj.f7497c = 65535 & m1531A;
                obj.f7498d = m1561w;
                obj.f7499e = m1546h;
                obj.f7500f = bArr3;
                c1852i = new p161m0.C1852i(obj);
            }
        }
        if (c1852i == null) {
            return 0;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - 30;
        p043K2.C0327c c0327c = this.f7487f;
        synchronized (c0327c) {
            if (((java.util.TreeSet) c0327c.f993d).size() >= 5000) {
                throw new java.lang.IllegalStateException("Queue size limit of 5000 reached.");
            }
            int i5 = c1852i.f7504c;
            if (!c0327c.f992c) {
                c0327c.m723d();
                c0327c.f991b = p176p1.AbstractC1949a.m3905F(i5 - 1);
                c0327c.f992c = true;
                c0327c.m721a(new p161m0.C1853j(c1852i, elapsedRealtime));
            } else if (java.lang.Math.abs(p043K2.C0327c.m720b(i5, p161m0.C1852i.m3811a(c0327c.f990a))) >= 1000) {
                c0327c.f991b = p176p1.AbstractC1949a.m3905F(i5 - 1);
                ((java.util.TreeSet) c0327c.f993d).clear();
                c0327c.m721a(new p161m0.C1853j(c1852i, elapsedRealtime));
            } else if (p043K2.C0327c.m720b(i5, c0327c.f991b) > 0) {
                c0327c.m721a(new p161m0.C1853j(c1852i, elapsedRealtime));
            }
        }
        p161m0.C1852i m722c = this.f7487f.m722c(j4);
        if (m722c == null) {
            return 0;
        }
        if (!this.f7489h) {
            if (this.f7490i == -9223372036854775807L) {
                this.f7490i = m722c.f7505d;
            }
            if (this.f7491j == -1) {
                this.f7491j = m722c.f7504c;
            }
            this.f7482a.mo985e(this.f7490i);
            this.f7489h = true;
        }
        synchronized (this.f7486e) {
            try {
                if (this.f7492k) {
                    if (this.f7493l != -9223372036854775807L && this.f7494m != -9223372036854775807L) {
                        this.f7487f.m723d();
                        this.f7482a.mo982b(this.f7493l, this.f7494m);
                        this.f7492k = false;
                        this.f7493l = -9223372036854775807L;
                        this.f7494m = -9223372036854775807L;
                    }
                }
                do {
                    p086W.C0798r c0798r2 = this.f7484c;
                    byte[] bArr4 = m722c.f7507f;
                    c0798r2.getClass();
                    c0798r2.m1535E(bArr4, bArr4.length);
                    this.f7482a.mo983c(this.f7484c, m722c.f7505d, m722c.f7504c, m722c.f7502a);
                    m722c = this.f7487f.m722c(j4);
                } while (m722c != null);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
