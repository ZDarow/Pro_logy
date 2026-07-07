package p069R0;

/* renamed from: R0.c */
/* loaded from: classes.dex */
public final class C0573c implements p069R0.InterfaceC0576f {

    /* renamed from: a */
    public final long[] f1780a;

    /* renamed from: b */
    public final long[] f1781b;

    /* renamed from: c */
    public final long f1782c;

    public C0573c(long j4, long[] jArr, long[] jArr2) {
        this.f1780a = jArr;
        this.f1781b = jArr2;
        this.f1782c = j4 == -9223372036854775807L ? p086W.AbstractC0805y.m1592M(jArr2[jArr2.length - 1]) : j4;
    }

    /* renamed from: b */
    public static android.util.Pair m1096b(long j4, long[] jArr, long[] jArr2) {
        int m1611f = p086W.AbstractC0805y.m1611f(jArr, j4, true);
        long j5 = jArr[m1611f];
        long j6 = jArr2[m1611f];
        int i4 = m1611f + 1;
        if (i4 == jArr.length) {
            return android.util.Pair.create(java.lang.Long.valueOf(j5), java.lang.Long.valueOf(j6));
        }
        return android.util.Pair.create(java.lang.Long.valueOf(j4), java.lang.Long.valueOf(((long) ((jArr[i4] == j5 ? 0.0d : (j4 - j5) / (r6 - j5)) * (jArr2[i4] - j6))) + j6));
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: a */
    public final long mo1092a(long j4) {
        return p086W.AbstractC0805y.m1592M(((java.lang.Long) m1096b(j4, this.f1780a, this.f1781b).second).longValue());
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return true;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: e */
    public final long mo1093e() {
        return -1L;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        android.util.Pair m1096b = m1096b(p086W.AbstractC0805y.m1605Z(p086W.AbstractC0805y.m1616k(j4, 0L, this.f1782c)), this.f1781b, this.f1780a);
        p215y0.C2382A c2382a = new p215y0.C2382A(p086W.AbstractC0805y.m1592M(((java.lang.Long) m1096b.first).longValue()), ((java.lang.Long) m1096b.second).longValue());
        return new p215y0.C2413y(c2382a, c2382a);
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: h */
    public final int mo1094h() {
        return -2147483647;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return this.f1782c;
    }
}
