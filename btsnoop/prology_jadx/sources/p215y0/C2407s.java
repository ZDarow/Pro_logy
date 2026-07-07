package p215y0;

/* renamed from: y0.s */
/* loaded from: classes.dex */
public final class C2407s {

    /* renamed from: a */
    public final int f9466a;

    /* renamed from: b */
    public final int f9467b;

    /* renamed from: c */
    public final int f9468c;

    /* renamed from: d */
    public final int f9469d;

    /* renamed from: e */
    public final int f9470e;

    /* renamed from: f */
    public final int f9471f;

    /* renamed from: g */
    public final int f9472g;

    /* renamed from: h */
    public final int f9473h;

    /* renamed from: i */
    public final int f9474i;

    /* renamed from: j */
    public final long f9475j;

    /* renamed from: k */
    public final p200u3.C2259m f9476k;

    /* renamed from: l */
    public final p076T.C0664G f9477l;

    public C2407s(byte[] bArr, int i4) {
        p086W.C0797q c0797q = new p086W.C0797q(bArr, bArr.length);
        c0797q.m1526q(i4 * 8);
        this.f9466a = c0797q.m1518i(16);
        this.f9467b = c0797q.m1518i(16);
        this.f9468c = c0797q.m1518i(24);
        this.f9469d = c0797q.m1518i(24);
        int m1518i = c0797q.m1518i(20);
        this.f9470e = m1518i;
        this.f9471f = m4640d(m1518i);
        this.f9472g = c0797q.m1518i(3) + 1;
        int m1518i2 = c0797q.m1518i(5) + 1;
        this.f9473h = m1518i2;
        this.f9474i = m4639a(m1518i2);
        this.f9475j = c0797q.m1520k(36);
        this.f9476k = null;
        this.f9477l = null;
    }

    /* renamed from: a */
    public static int m4639a(int i4) {
        if (i4 == 8) {
            return 1;
        }
        if (i4 == 12) {
            return 2;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 != 20) {
            return i4 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: d */
    public static int m4640d(int i4) {
        switch (i4) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public final long m4641b() {
        long j4 = this.f9475j;
        if (j4 == 0) {
            return -9223372036854775807L;
        }
        return (j4 * 1000000) / this.f9470e;
    }

    /* renamed from: c */
    public final p076T.C0702p m4642c(byte[] bArr, p076T.C0664G c0664g) {
        bArr[4] = Byte.MIN_VALUE;
        int i4 = this.f9469d;
        if (i4 <= 0) {
            i4 = -1;
        }
        p076T.C0664G c0664g2 = this.f9477l;
        if (c0664g2 != null) {
            c0664g = c0664g2.m1187e(c0664g);
        }
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("audio/flac");
        c0701o.f2371m = i4;
        c0701o.f2384z = this.f9472g;
        c0701o.f2350A = this.f9470e;
        c0701o.f2351B = p086W.AbstractC0805y.m1580A(this.f9473h);
        c0701o.f2373o = java.util.Collections.singletonList(bArr);
        c0701o.f2368j = c0664g;
        return new p076T.C0702p(c0701o);
    }

    public C2407s(int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j4, p200u3.C2259m c2259m, p076T.C0664G c0664g) {
        this.f9466a = i4;
        this.f9467b = i5;
        this.f9468c = i6;
        this.f9469d = i7;
        this.f9470e = i8;
        this.f9471f = m4640d(i8);
        this.f9472g = i9;
        this.f9473h = i10;
        this.f9474i = m4639a(i10);
        this.f9475j = j4;
        this.f9476k = c2259m;
        this.f9477l = c0664g;
    }
}
