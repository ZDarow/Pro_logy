package p002A0;

/* renamed from: A0.b */
/* loaded from: classes.dex */
public class C0004b implements p215y0.InterfaceC2414z {

    /* renamed from: a */
    public final /* synthetic */ int f4a;

    /* renamed from: b */
    public final long f5b;

    /* renamed from: c */
    public final java.lang.Object f6c;

    public /* synthetic */ C0004b(java.lang.Object obj, long j4, int i4) {
        this.f4a = i4;
        this.f6c = obj;
        this.f5b = j4;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        switch (this.f4a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        switch (this.f4a) {
            case 0:
                p002A0.C0006d c0006d = (p002A0.C0006d) this.f6c;
                p215y0.C2413y m39b = c0006d.f18i[0].m39b(j4);
                int i4 = 1;
                while (true) {
                    p002A0.C0009g[] c0009gArr = c0006d.f18i;
                    if (i4 >= c0009gArr.length) {
                        return m39b;
                    }
                    p215y0.C2413y m39b2 = c0009gArr[i4].m39b(j4);
                    if (m39b2.f9503a.f9351b < m39b.f9503a.f9351b) {
                        m39b = m39b2;
                    }
                    i4++;
                }
            case 1:
                p215y0.C2407s c2407s = (p215y0.C2407s) this.f6c;
                p086W.AbstractC0781a.m1422k(c2407s.f9476k);
                p200u3.C2259m c2259m = c2407s.f9476k;
                long[] jArr = (long[]) c2259m.f8980l;
                int m1611f = p086W.AbstractC0805y.m1611f(jArr, p086W.AbstractC0805y.m1616k((c2407s.f9470e * j4) / 1000000, 0L, c2407s.f9475j - 1), false);
                long j5 = m1611f == -1 ? 0L : jArr[m1611f];
                long[] jArr2 = (long[]) c2259m.f8981m;
                long j6 = m1611f != -1 ? jArr2[m1611f] : 0L;
                int i5 = c2407s.f9470e;
                long j7 = (j5 * 1000000) / i5;
                long j8 = this.f5b;
                p215y0.C2382A c2382a = new p215y0.C2382A(j7, j6 + j8);
                if (j7 == j4 || m1611f == jArr.length - 1) {
                    return new p215y0.C2413y(c2382a, c2382a);
                }
                int i6 = m1611f + 1;
                return new p215y0.C2413y(c2382a, new p215y0.C2382A((jArr[i6] * 1000000) / i5, j8 + jArr2[i6]));
            default:
                return (p215y0.C2413y) this.f6c;
        }
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        switch (this.f4a) {
            case 0:
                return this.f5b;
            case 1:
                return ((p215y0.C2407s) this.f6c).m4641b();
            default:
                return this.f5b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0004b(long j4) {
        this(j4, 0L);
        this.f4a = 2;
    }

    public C0004b(long j4, long j5) {
        this.f4a = 2;
        this.f5b = j4;
        p215y0.C2382A c2382a = j5 == 0 ? p215y0.C2382A.f9349c : new p215y0.C2382A(0L, j5);
        this.f6c = new p215y0.C2413y(c2382a, c2382a);
    }
}
