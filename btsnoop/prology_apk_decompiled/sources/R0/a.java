package R0;

import y0.k;

/* loaded from: classes.dex */
public final class a extends k implements f {

    /* renamed from: h, reason: collision with root package name */
    public final int f1714h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1715i;

    public a(long j4, long j5, int i4, int i5, boolean z4) {
        super(j4, j5, i4, i5, z4);
        this.f1714h = i4;
        this.f1715i = j4 == -1 ? -1L : j4;
    }

    @Override // R0.f
    public final long a(long j4) {
        return (Math.max(0L, j4 - this.f9080b) * 8000000) / this.f9083e;
    }

    @Override // R0.f
    public final long e() {
        return this.f1715i;
    }

    @Override // R0.f
    public final int h() {
        return this.f1714h;
    }
}
