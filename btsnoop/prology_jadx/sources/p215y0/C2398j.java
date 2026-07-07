package p215y0;

/* renamed from: y0.j */
/* loaded from: classes.dex */
public final class C2398j implements p215y0.InterfaceC2414z {

    /* renamed from: a */
    public final int f9434a;

    /* renamed from: b */
    public final int[] f9435b;

    /* renamed from: c */
    public final long[] f9436c;

    /* renamed from: d */
    public final long[] f9437d;

    /* renamed from: e */
    public final long[] f9438e;

    /* renamed from: f */
    public final long f9439f;

    public C2398j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f9435b = iArr;
        this.f9436c = jArr;
        this.f9437d = jArr2;
        this.f9438e = jArr3;
        int length = iArr.length;
        this.f9434a = length;
        if (length > 0) {
            this.f9439f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f9439f = 0L;
        }
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return true;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        long[] jArr = this.f9438e;
        int m1611f = p086W.AbstractC0805y.m1611f(jArr, j4, true);
        long j5 = jArr[m1611f];
        long[] jArr2 = this.f9436c;
        p215y0.C2382A c2382a = new p215y0.C2382A(j5, jArr2[m1611f]);
        if (j5 >= j4 || m1611f == this.f9434a - 1) {
            return new p215y0.C2413y(c2382a, c2382a);
        }
        int i4 = m1611f + 1;
        return new p215y0.C2413y(c2382a, new p215y0.C2382A(jArr[i4], jArr2[i4]));
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return this.f9439f;
    }

    public final java.lang.String toString() {
        return "ChunkIndex(length=" + this.f9434a + ", sizes=" + java.util.Arrays.toString(this.f9435b) + ", offsets=" + java.util.Arrays.toString(this.f9436c) + ", timeUs=" + java.util.Arrays.toString(this.f9438e) + ", durationsUs=" + java.util.Arrays.toString(this.f9437d) + ")";
    }
}
