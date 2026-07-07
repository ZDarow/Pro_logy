package g0;

import B2.AbstractC0007h;
import T.C0094o;
import T.C0095p;
import T.H;
import T.InterfaceC0089j;
import W.y;
import java.io.EOFException;
import java.util.Arrays;
import y0.E;
import y0.F;

/* loaded from: classes.dex */
public final class p implements F {

    /* renamed from: f, reason: collision with root package name */
    public static final C0095p f5738f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0095p f5739g;

    /* renamed from: a, reason: collision with root package name */
    public final F f5740a;

    /* renamed from: b, reason: collision with root package name */
    public final C0095p f5741b;

    /* renamed from: c, reason: collision with root package name */
    public C0095p f5742c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5743d;

    /* renamed from: e, reason: collision with root package name */
    public int f5744e;

    static {
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l("application/id3");
        f5738f = new C0095p(c0094o);
        C0094o c0094o2 = new C0094o();
        c0094o2.f2290l = H.l("application/x-emsg");
        f5739g = new C0095p(c0094o2);
    }

    public p(F f4, int i4) {
        this.f5740a = f4;
        if (i4 == 1) {
            this.f5741b = f5738f;
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException(AbstractC0007h.k("Unknown metadataType: ", i4));
            }
            this.f5741b = f5739g;
        }
        this.f5743d = new byte[0];
        this.f5744e = 0;
    }

    @Override // y0.F
    public final void a(W.r rVar, int i4, int i5) {
        int i6 = this.f5744e + i4;
        byte[] bArr = this.f5743d;
        if (bArr.length < i6) {
            this.f5743d = Arrays.copyOf(bArr, (i6 / 2) + i6);
        }
        rVar.f(this.f5743d, this.f5744e, i4);
        this.f5744e += i4;
    }

    @Override // y0.F
    public final void b(long j4, int i4, int i5, int i6, E e4) {
        this.f5742c.getClass();
        int i7 = this.f5744e - i6;
        W.r rVar = new W.r(Arrays.copyOfRange(this.f5743d, i7 - i5, i7));
        byte[] bArr = this.f5743d;
        System.arraycopy(bArr, i7, bArr, 0, i6);
        this.f5744e = i6;
        String str = this.f5742c.f2325m;
        C0095p c0095p = this.f5741b;
        if (!y.a(str, c0095p.f2325m)) {
            if (!"application/x-emsg".equals(this.f5742c.f2325m)) {
                W.a.A("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f5742c.f2325m);
                return;
            }
            J0.a d02 = I0.b.d0(rVar);
            C0095p b4 = d02.b();
            String str2 = c0095p.f2325m;
            if (b4 == null || !y.a(str2, b4.f2325m)) {
                W.a.A("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + d02.b());
                return;
            }
            byte[] a4 = d02.a();
            a4.getClass();
            rVar = new W.r(a4);
        }
        int a5 = rVar.a();
        F f4 = this.f5740a;
        f4.a(rVar, a5, 0);
        f4.b(j4, i4, a5, 0, e4);
    }

    @Override // y0.F
    public final void c(C0095p c0095p) {
        this.f5742c = c0095p;
        this.f5740a.c(this.f5741b);
    }

    @Override // y0.F
    public final int d(InterfaceC0089j interfaceC0089j, int i4, boolean z4) {
        int i5 = this.f5744e + i4;
        byte[] bArr = this.f5743d;
        if (bArr.length < i5) {
            this.f5743d = Arrays.copyOf(bArr, (i5 / 2) + i5);
        }
        int read = interfaceC0089j.read(this.f5743d, this.f5744e, i4);
        if (read != -1) {
            this.f5744e += read;
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }
}
