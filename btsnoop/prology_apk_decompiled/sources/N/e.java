package N;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f1189a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1190b;

    public e(long j4, long j5) {
        if (j5 == 0) {
            this.f1189a = 0L;
            this.f1190b = 1L;
        } else {
            this.f1189a = j4;
            this.f1190b = j5;
        }
    }

    public final String toString() {
        return this.f1189a + "/" + this.f1190b;
    }
}
