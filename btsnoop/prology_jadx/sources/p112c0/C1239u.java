package p112c0;

/* renamed from: c0.u */
/* loaded from: classes.dex */
public final class C1239u {

    /* renamed from: a */
    public final p112c0.C1238t f4812a;

    /* renamed from: b */
    public int f4813b;

    /* renamed from: c */
    public long f4814c;

    /* renamed from: d */
    public long f4815d;

    /* renamed from: e */
    public long f4816e;

    /* renamed from: f */
    public long f4817f;

    public C1239u(android.media.AudioTrack audioTrack) {
        this.f4812a = new p112c0.C1238t(audioTrack);
        m2914a();
    }

    /* renamed from: a */
    public final void m2914a() {
        if (this.f4812a != null) {
            m2915b(0);
        }
    }

    /* renamed from: b */
    public final void m2915b(int i4) {
        this.f4813b = i4;
        if (i4 == 0) {
            this.f4816e = 0L;
            this.f4817f = -1L;
            this.f4814c = java.lang.System.nanoTime() / 1000;
            this.f4815d = 10000L;
            return;
        }
        if (i4 == 1) {
            this.f4815d = 10000L;
            return;
        }
        if (i4 == 2 || i4 == 3) {
            this.f4815d = 10000000L;
        } else {
            if (i4 != 4) {
                throw new java.lang.IllegalStateException();
            }
            this.f4815d = 500000L;
        }
    }
}
