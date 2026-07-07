package w0;

import java.util.Arrays;

/* renamed from: w0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598h {

    /* renamed from: a, reason: collision with root package name */
    public long f8781a;

    /* renamed from: b, reason: collision with root package name */
    public long f8782b;

    /* renamed from: c, reason: collision with root package name */
    public long f8783c;

    /* renamed from: d, reason: collision with root package name */
    public long f8784d;

    /* renamed from: e, reason: collision with root package name */
    public long f8785e;

    /* renamed from: f, reason: collision with root package name */
    public long f8786f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f8787g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f8788h;

    public final boolean a() {
        return this.f8784d > 15 && this.f8788h == 0;
    }

    public final void b(long j4) {
        long j5 = this.f8784d;
        if (j5 == 0) {
            this.f8781a = j4;
        } else if (j5 == 1) {
            long j6 = j4 - this.f8781a;
            this.f8782b = j6;
            this.f8786f = j6;
            this.f8785e = 1L;
        } else {
            long j7 = j4 - this.f8783c;
            int i4 = (int) (j5 % 15);
            long abs = Math.abs(j7 - this.f8782b);
            boolean[] zArr = this.f8787g;
            if (abs <= 1000000) {
                this.f8785e++;
                this.f8786f += j7;
                if (zArr[i4]) {
                    zArr[i4] = false;
                    this.f8788h--;
                }
            } else if (!zArr[i4]) {
                zArr[i4] = true;
                this.f8788h++;
            }
        }
        this.f8784d++;
        this.f8783c = j4;
    }

    public final void c() {
        this.f8784d = 0L;
        this.f8785e = 0L;
        this.f8786f = 0L;
        this.f8788h = 0;
        Arrays.fill(this.f8787g, false);
    }
}
