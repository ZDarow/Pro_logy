package p197u0;

/* renamed from: u0.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C2219f {

    /* renamed from: a */
    public final /* synthetic */ p197u0.C2220g f8846a;

    /* renamed from: a */
    public final void m4424a(int i4) {
        p197u0.C2220g c2220g = this.f8846a;
        synchronized (c2220g) {
            int i5 = c2220g.f8866m;
            if (i5 == 0 || c2220g.f8857d) {
                if (i5 == i4) {
                    return;
                }
                c2220g.f8866m = i4;
                if (i4 != 1 && i4 != 0 && i4 != 8) {
                    c2220g.f8864k = c2220g.m4426b(i4);
                    c2220g.f8856c.getClass();
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    c2220g.m4427c(c2220g.f8859f > 0 ? (int) (elapsedRealtime - c2220g.f8860g) : 0, c2220g.f8861h, c2220g.f8864k);
                    c2220g.f8860g = elapsedRealtime;
                    c2220g.f8861h = 0L;
                    c2220g.f8863j = 0L;
                    c2220g.f8862i = 0L;
                    p197u0.C2232s c2232s = c2220g.f8858e;
                    c2232s.f8899b.clear();
                    c2232s.f8901d = -1;
                    c2232s.f8902e = 0;
                    c2232s.f8903f = 0;
                }
            }
        }
    }
}
