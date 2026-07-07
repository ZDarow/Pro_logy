package p184r0;

/* renamed from: r0.b */
/* loaded from: classes.dex */
public abstract class AbstractC2044b implements p184r0.InterfaceC2056n {

    /* renamed from: l */
    public final long f8311l;

    /* renamed from: m */
    public final long f8312m;

    /* renamed from: n */
    public long f8313n;

    public AbstractC2044b(long j4, long j5) {
        this.f8311l = j4;
        this.f8312m = j5;
        this.f8313n = j4 - 1;
    }

    /* renamed from: a */
    public final void m4101a() {
        long j4 = this.f8313n;
        if (j4 < this.f8311l || j4 > this.f8312m) {
            throw new java.util.NoSuchElementException();
        }
    }

    @Override // p184r0.InterfaceC2056n
    public final boolean next() {
        long j4 = this.f8313n + 1;
        this.f8313n = j4;
        return !(j4 > this.f8312m);
    }
}
