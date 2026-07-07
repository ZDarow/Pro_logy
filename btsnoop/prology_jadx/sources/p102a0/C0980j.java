package p102a0;

/* renamed from: a0.j */
/* loaded from: classes.dex */
public final class C0980j {

    /* renamed from: a */
    public final p197u0.C2218e f3634a;

    /* renamed from: b */
    public final long f3635b;

    /* renamed from: c */
    public final long f3636c;

    /* renamed from: d */
    public final long f3637d;

    /* renamed from: e */
    public final long f3638e;

    /* renamed from: f */
    public final int f3639f;

    /* renamed from: g */
    public final boolean f3640g;

    /* renamed from: h */
    public final long f3641h;

    /* renamed from: i */
    public final java.util.HashMap f3642i;

    /* renamed from: j */
    public long f3643j;

    public C0980j(p197u0.C2218e c2218e, int i4, int i5, int i6, int i7, int i8, boolean z4, int i9) {
        m2024a(i6, 0, "bufferForPlaybackMs", "0");
        m2024a(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m2024a(i4, i6, "minBufferMs", "bufferForPlaybackMs");
        m2024a(i4, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m2024a(i5, i4, "maxBufferMs", "minBufferMs");
        m2024a(i9, 0, "backBufferDurationMs", "0");
        this.f3634a = c2218e;
        this.f3635b = p086W.AbstractC0805y.m1592M(i4);
        this.f3636c = p086W.AbstractC0805y.m1592M(i5);
        this.f3637d = p086W.AbstractC0805y.m1592M(i6);
        this.f3638e = p086W.AbstractC0805y.m1592M(i7);
        this.f3639f = i8;
        this.f3640g = z4;
        this.f3641h = p086W.AbstractC0805y.m1592M(i9);
        this.f3642i = new java.util.HashMap();
        this.f3643j = -1L;
    }

    /* renamed from: a */
    public static void m2024a(int i4, int i5, java.lang.String str, java.lang.String str2) {
        p086W.AbstractC0781a.m1415d(str + " cannot be less than " + str2, i4 >= i5);
    }

    /* renamed from: b */
    public final int m2025b() {
        java.util.Iterator it = this.f3642i.values().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((p102a0.C0978i) it.next()).f3624b;
        }
        return i4;
    }

    /* renamed from: c */
    public final boolean m2026c(p102a0.C0951O c0951o) {
        int i4;
        p102a0.C0978i c0978i = (p102a0.C0978i) this.f3642i.get(c0951o.f3444a);
        c0978i.getClass();
        p197u0.C2218e c2218e = this.f3634a;
        synchronized (c2218e) {
            i4 = c2218e.f8843d * c2218e.f8841b;
        }
        boolean z4 = true;
        boolean z5 = i4 >= m2025b();
        float f4 = c0951o.f3446c;
        long j4 = this.f3636c;
        long j5 = this.f3635b;
        if (f4 > 1.0f) {
            j5 = java.lang.Math.min(p086W.AbstractC0805y.m1630y(j5, f4), j4);
        }
        long max = java.lang.Math.max(j5, 500000L);
        long j6 = c0951o.f3445b;
        if (j6 < max) {
            if (!this.f3640g && z5) {
                z4 = false;
            }
            c0978i.f3623a = z4;
            if (!z4 && j6 < 500000) {
                p086W.AbstractC0781a.m1410A("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j6 >= j4 || z5) {
            c0978i.f3623a = false;
        }
        return c0978i.f3623a;
    }

    /* renamed from: d */
    public final void m2027d() {
        if (!this.f3642i.isEmpty()) {
            this.f3634a.m4422a(m2025b());
            return;
        }
        p197u0.C2218e c2218e = this.f3634a;
        synchronized (c2218e) {
            if (c2218e.f8840a) {
                c2218e.m4422a(0);
            }
        }
    }
}
