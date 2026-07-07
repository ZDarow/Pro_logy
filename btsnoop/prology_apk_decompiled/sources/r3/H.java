package r3;

/* loaded from: classes.dex */
public abstract class H extends AbstractC0531s {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f8116q = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f8117n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8118o;

    /* renamed from: p, reason: collision with root package name */
    public a3.b f8119p;

    public final void g(boolean z4) {
        long j4 = this.f8117n - (z4 ? 4294967296L : 1L);
        this.f8117n = j4;
        if (j4 <= 0 && this.f8118o) {
            o();
        }
    }

    public abstract Thread h();

    public final void i(boolean z4) {
        this.f8117n = (z4 ? 4294967296L : 1L) + this.f8117n;
        if (z4) {
            return;
        }
        this.f8118o = true;
    }

    public abstract long l();

    public final boolean n() {
        a3.b bVar = this.f8119p;
        if (bVar == null) {
            return false;
        }
        A a4 = (A) (bVar.isEmpty() ? null : bVar.removeFirst());
        if (a4 == null) {
            return false;
        }
        a4.run();
        return true;
    }

    public abstract void o();
}
