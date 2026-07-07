package p161m0;

/* renamed from: m0.i */
/* loaded from: classes.dex */
public final class C1852i {

    /* renamed from: g */
    public static final byte[] f7501g = new byte[0];

    /* renamed from: a */
    public final boolean f7502a;

    /* renamed from: b */
    public final byte f7503b;

    /* renamed from: c */
    public final int f7504c;

    /* renamed from: d */
    public final long f7505d;

    /* renamed from: e */
    public final int f7506e;

    /* renamed from: f */
    public final byte[] f7507f;

    public C1852i(p161m0.C1851h c1851h) {
        this.f7502a = c1851h.f7495a;
        this.f7503b = c1851h.f7496b;
        this.f7504c = c1851h.f7497c;
        this.f7505d = c1851h.f7498d;
        this.f7506e = c1851h.f7499e;
        this.f7507f = c1851h.f7500f;
    }

    /* renamed from: a */
    public static int m3811a(int i4) {
        return p176p1.AbstractC1949a.m3905F(i4 + 1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p161m0.C1852i.class != obj.getClass()) {
            return false;
        }
        p161m0.C1852i c1852i = (p161m0.C1852i) obj;
        return this.f7503b == c1852i.f7503b && this.f7504c == c1852i.f7504c && this.f7502a == c1852i.f7502a && this.f7505d == c1852i.f7505d && this.f7506e == c1852i.f7506e;
    }

    public final int hashCode() {
        int i4 = (((((527 + this.f7503b) * 31) + this.f7504c) * 31) + (this.f7502a ? 1 : 0)) * 31;
        long j4 = this.f7505d;
        return ((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f7506e;
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = {java.lang.Byte.valueOf(this.f7503b), java.lang.Integer.valueOf(this.f7504c), java.lang.Long.valueOf(this.f7505d), java.lang.Integer.valueOf(this.f7506e), java.lang.Boolean.valueOf(this.f7502a)};
        int i4 = p086W.AbstractC0805y.f2801a;
        return java.lang.String.format(java.util.Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
