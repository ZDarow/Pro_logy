package p206w0;

/* renamed from: w0.h */
/* loaded from: classes.dex */
public final class C2312h {

    /* renamed from: a */
    public long f9136a;

    /* renamed from: b */
    public long f9137b;

    /* renamed from: c */
    public long f9138c;

    /* renamed from: d */
    public long f9139d;

    /* renamed from: e */
    public long f9140e;

    /* renamed from: f */
    public long f9141f;

    /* renamed from: g */
    public final boolean[] f9142g = new boolean[15];

    /* renamed from: h */
    public int f9143h;

    /* renamed from: a */
    public final boolean m4494a() {
        return this.f9139d > 15 && this.f9143h == 0;
    }

    /* renamed from: b */
    public final void m4495b(long j4) {
        long j5 = this.f9139d;
        if (j5 == 0) {
            this.f9136a = j4;
        } else if (j5 == 1) {
            long j6 = j4 - this.f9136a;
            this.f9137b = j6;
            this.f9141f = j6;
            this.f9140e = 1L;
        } else {
            long j7 = j4 - this.f9138c;
            int i4 = (int) (j5 % 15);
            long abs = java.lang.Math.abs(j7 - this.f9137b);
            boolean[] zArr = this.f9142g;
            if (abs <= 1000000) {
                this.f9140e++;
                this.f9141f += j7;
                if (zArr[i4]) {
                    zArr[i4] = false;
                    this.f9143h--;
                }
            } else if (!zArr[i4]) {
                zArr[i4] = true;
                this.f9143h++;
            }
        }
        this.f9139d++;
        this.f9138c = j4;
    }

    /* renamed from: c */
    public final void m4496c() {
        this.f9139d = 0L;
        this.f9140e = 0L;
        this.f9141f = 0L;
        this.f9143h = 0;
        java.util.Arrays.fill(this.f9142g, false);
    }
}
