package y0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f9073a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9074b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f9075c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f9076d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f9077e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9078f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f9074b = iArr;
        this.f9075c = jArr;
        this.f9076d = jArr2;
        this.f9077e = jArr3;
        int length = iArr.length;
        this.f9073a = length;
        if (length > 0) {
            this.f9078f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f9078f = 0L;
        }
    }

    @Override // y0.z
    public final boolean c() {
        return true;
    }

    @Override // y0.z
    public final y f(long j4) {
        long[] jArr = this.f9077e;
        int f4 = W.y.f(jArr, j4, true);
        long j5 = jArr[f4];
        long[] jArr2 = this.f9075c;
        C0617A c0617a = new C0617A(j5, jArr2[f4]);
        if (j5 >= j4 || f4 == this.f9073a - 1) {
            return new y(c0617a, c0617a);
        }
        int i4 = f4 + 1;
        return new y(c0617a, new C0617A(jArr[i4], jArr2[i4]));
    }

    @Override // y0.z
    public final long i() {
        return this.f9078f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f9073a + ", sizes=" + Arrays.toString(this.f9074b) + ", offsets=" + Arrays.toString(this.f9075c) + ", timeUs=" + Arrays.toString(this.f9077e) + ", durationsUs=" + Arrays.toString(this.f9076d) + ")";
    }
}
