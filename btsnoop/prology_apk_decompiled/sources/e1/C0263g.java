package e1;

import T.C0094o;
import T.C0095p;
import java.util.concurrent.atomic.AtomicInteger;
import y0.C0618a;

/* renamed from: e1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final W.r f5200a;

    /* renamed from: c, reason: collision with root package name */
    public final String f5202c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5203d;

    /* renamed from: e, reason: collision with root package name */
    public String f5204e;

    /* renamed from: f, reason: collision with root package name */
    public y0.F f5205f;

    /* renamed from: h, reason: collision with root package name */
    public int f5207h;

    /* renamed from: i, reason: collision with root package name */
    public int f5208i;

    /* renamed from: j, reason: collision with root package name */
    public long f5209j;

    /* renamed from: k, reason: collision with root package name */
    public C0095p f5210k;

    /* renamed from: l, reason: collision with root package name */
    public int f5211l;

    /* renamed from: m, reason: collision with root package name */
    public int f5212m;

    /* renamed from: g, reason: collision with root package name */
    public int f5206g = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f5215p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f5201b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public int f5213n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f5214o = -1;

    public C0263g(int i4, int i5, String str) {
        this.f5200a = new W.r(new byte[i5]);
        this.f5202c = str;
        this.f5203d = i4;
    }

    public final boolean a(W.r rVar, byte[] bArr, int i4) {
        int min = Math.min(rVar.a(), i4 - this.f5207h);
        rVar.f(bArr, this.f5207h, min);
        int i5 = this.f5207h + min;
        this.f5207h = i5;
        return i5 == i4;
    }

    @Override // e1.i
    public final void b() {
        this.f5206g = 0;
        this.f5207h = 0;
        this.f5208i = 0;
        this.f5215p = -9223372036854775807L;
        this.f5201b.set(0);
    }

    public final void c(C0618a c0618a) {
        int i4;
        int i5 = c0618a.f9012b;
        if (i5 == -2147483647 || (i4 = c0618a.f9013c) == -1) {
            return;
        }
        C0095p c0095p = this.f5210k;
        String str = c0618a.f9011a;
        if (c0095p != null && i4 == c0095p.f2303A && i5 == c0095p.f2304B && str.equals(c0095p.f2325m)) {
            return;
        }
        C0095p c0095p2 = this.f5210k;
        C0094o c0094o = c0095p2 == null ? new C0094o() : c0095p2.a();
        c0094o.f2279a = this.f5204e;
        c0094o.f2290l = T.H.l(str);
        c0094o.f2302z = i4;
        c0094o.f2270A = i5;
        c0094o.f2282d = this.f5202c;
        c0094o.f2284f = this.f5203d;
        C0095p c0095p3 = new C0095p(c0094o);
        this.f5210k = c0095p3;
        this.f5205f.c(c0095p3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04a0  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [y0.F] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // e1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(W.r r38) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0263g.d(W.r):void");
    }

    @Override // e1.i
    public final void e(boolean z4) {
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        g4.a();
        g4.c();
        this.f5204e = (String) g4.f5144e;
        g4.c();
        this.f5205f = qVar.v(g4.f5142c, 1);
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        this.f5215p = j4;
    }
}
