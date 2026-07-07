package p187r3;

/* renamed from: r3.H */
/* loaded from: classes.dex */
public abstract class AbstractC2080H extends p187r3.AbstractC2128s {

    /* renamed from: q */
    public static final /* synthetic */ int f8432q = 0;

    /* renamed from: n */
    public long f8433n;

    /* renamed from: o */
    public boolean f8434o;

    /* renamed from: p */
    public p105a3.C1019b f8435p;

    /* renamed from: g */
    public final void m4164g(boolean z4) {
        long j4 = this.f8433n - (z4 ? 4294967296L : 1L);
        this.f8433n = j4;
        if (j4 <= 0 && this.f8434o) {
            mo4161o();
        }
    }

    /* renamed from: h */
    public abstract java.lang.Thread mo4165h();

    /* renamed from: i */
    public final void m4166i(boolean z4) {
        this.f8433n = (z4 ? 4294967296L : 1L) + this.f8433n;
        if (z4) {
            return;
        }
        this.f8434o = true;
    }

    /* renamed from: l */
    public abstract long mo4160l();

    /* renamed from: n */
    public final boolean m4167n() {
        p105a3.C1019b c1019b = this.f8435p;
        if (c1019b == null) {
            return false;
        }
        p187r3.AbstractC2073A abstractC2073A = (p187r3.AbstractC2073A) (c1019b.isEmpty() ? null : c1019b.removeFirst());
        if (abstractC2073A == null) {
            return false;
        }
        abstractC2073A.run();
        return true;
    }

    /* renamed from: o */
    public abstract void mo4161o();
}
