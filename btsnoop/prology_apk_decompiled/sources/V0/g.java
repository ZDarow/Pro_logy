package V0;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public final long f2606l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f2607m;

    public g(long j4, byte[] bArr) {
        this.f2606l = j4;
        this.f2607m = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f2606l, ((g) obj).f2606l);
    }
}
