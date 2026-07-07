package r0;

import java.util.NoSuchElementException;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0500b implements n {

    /* renamed from: l, reason: collision with root package name */
    public final long f8001l;

    /* renamed from: m, reason: collision with root package name */
    public final long f8002m;

    /* renamed from: n, reason: collision with root package name */
    public long f8003n;

    public AbstractC0500b(long j4, long j5) {
        this.f8001l = j4;
        this.f8002m = j5;
        this.f8003n = j4 - 1;
    }

    public final void a() {
        long j4 = this.f8003n;
        if (j4 < this.f8001l || j4 > this.f8002m) {
            throw new NoSuchElementException();
        }
    }

    @Override // r0.n
    public final boolean next() {
        long j4 = this.f8003n + 1;
        this.f8003n = j4;
        return !(j4 > this.f8002m);
    }
}
