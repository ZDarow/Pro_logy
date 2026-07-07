package p102a0;

/* renamed from: a0.U */
/* loaded from: classes.dex */
public final class C0956U {

    /* renamed from: a */
    public final p179q0.C1964F f3468a;

    /* renamed from: b */
    public final long f3469b;

    /* renamed from: c */
    public final long f3470c;

    /* renamed from: d */
    public final long f3471d;

    /* renamed from: e */
    public final long f3472e;

    /* renamed from: f */
    public final boolean f3473f;

    /* renamed from: g */
    public final boolean f3474g;

    /* renamed from: h */
    public final boolean f3475h;

    /* renamed from: i */
    public final boolean f3476i;

    public C0956U(p179q0.C1964F c1964f, long j4, long j5, long j6, long j7, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z8 = true;
        p086W.AbstractC0781a.m1416e(!z7 || z5);
        p086W.AbstractC0781a.m1416e(!z6 || z5);
        if (z4 && (z5 || z6 || z7)) {
            z8 = false;
        }
        p086W.AbstractC0781a.m1416e(z8);
        this.f3468a = c1964f;
        this.f3469b = j4;
        this.f3470c = j5;
        this.f3471d = j6;
        this.f3472e = j7;
        this.f3473f = z4;
        this.f3474g = z5;
        this.f3475h = z6;
        this.f3476i = z7;
    }

    /* renamed from: a */
    public final p102a0.C0956U m1944a(long j4) {
        if (j4 == this.f3470c) {
            return this;
        }
        return new p102a0.C0956U(this.f3468a, this.f3469b, j4, this.f3471d, this.f3472e, this.f3473f, this.f3474g, this.f3475h, this.f3476i);
    }

    /* renamed from: b */
    public final p102a0.C0956U m1945b(long j4) {
        if (j4 == this.f3469b) {
            return this;
        }
        return new p102a0.C0956U(this.f3468a, j4, this.f3470c, this.f3471d, this.f3472e, this.f3473f, this.f3474g, this.f3475h, this.f3476i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p102a0.C0956U.class != obj.getClass()) {
            return false;
        }
        p102a0.C0956U c0956u = (p102a0.C0956U) obj;
        return this.f3469b == c0956u.f3469b && this.f3470c == c0956u.f3470c && this.f3471d == c0956u.f3471d && this.f3472e == c0956u.f3472e && this.f3473f == c0956u.f3473f && this.f3474g == c0956u.f3474g && this.f3475h == c0956u.f3475h && this.f3476i == c0956u.f3476i && p086W.AbstractC0805y.m1606a(this.f3468a, c0956u.f3468a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f3468a.hashCode() + 527) * 31) + ((int) this.f3469b)) * 31) + ((int) this.f3470c)) * 31) + ((int) this.f3471d)) * 31) + ((int) this.f3472e)) * 31) + (this.f3473f ? 1 : 0)) * 31) + (this.f3474g ? 1 : 0)) * 31) + (this.f3475h ? 1 : 0)) * 31) + (this.f3476i ? 1 : 0);
    }
}
