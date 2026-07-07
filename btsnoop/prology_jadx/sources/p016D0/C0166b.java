package p016D0;

/* renamed from: D0.b */
/* loaded from: classes.dex */
public final class C0166b {

    /* renamed from: a */
    public final p215y0.C2393e f429a;

    /* renamed from: b */
    public final p215y0.InterfaceC2397i f430b;

    /* renamed from: c */
    public p215y0.C2394f f431c;

    /* renamed from: d */
    public final int f432d;

    public C0166b(p215y0.InterfaceC2395g interfaceC2395g, p215y0.InterfaceC2397i interfaceC2397i, long j4, long j5, long j6, long j7, long j8, int i4) {
        this.f430b = interfaceC2397i;
        this.f432d = i4;
        this.f429a = new p215y0.C2393e(interfaceC2395g, j4, j5, j6, j7, j8);
    }

    /* renamed from: a */
    public static int m525a(byte[] bArr, int i4) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    /* renamed from: c */
    public static int m526c(p215y0.C2400l c2400l, long j4, p076T.C0706t c0706t) {
        if (j4 == c2400l.f9450o) {
            return 0;
        }
        c0706t.f2437a = j4;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        return m526c(r28, r8, r29);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m527b(p215y0.C2400l r28, p076T.C0706t r29) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p016D0.C0166b.m527b(y0.l, T.t):int");
    }

    /* renamed from: d */
    public final void m528d(long j4) {
        p215y0.C2394f c2394f = this.f431c;
        if (c2394f == null || c2394f.f9422a != j4) {
            p215y0.C2393e c2393e = this.f429a;
            this.f431c = new p215y0.C2394f(j4, c2393e.f9416a.mo284a(j4), c2393e.f9418c, c2393e.f9419d, c2393e.f9420e, c2393e.f9421f);
        }
    }
}
