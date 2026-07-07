package p010B3;

/* renamed from: B3.q */
/* loaded from: classes.dex */
public final class C0086q {

    /* renamed from: a */
    public final byte[] f265a;

    /* renamed from: b */
    public int f266b;

    /* renamed from: c */
    public int f267c;

    /* renamed from: d */
    public boolean f268d;

    /* renamed from: e */
    public final boolean f269e;

    /* renamed from: f */
    public p010B3.C0086q f270f;

    /* renamed from: g */
    public p010B3.C0086q f271g;

    public C0086q() {
        this.f265a = new byte[8192];
        this.f269e = true;
        this.f268d = false;
    }

    /* renamed from: a */
    public final p010B3.C0086q m347a() {
        p010B3.C0086q c0086q = this.f270f;
        if (c0086q == this) {
            c0086q = null;
        }
        p010B3.C0086q c0086q2 = this.f271g;
        p154k3.AbstractC1803h.m3776b(c0086q2);
        c0086q2.f270f = this.f270f;
        p010B3.C0086q c0086q3 = this.f270f;
        p154k3.AbstractC1803h.m3776b(c0086q3);
        c0086q3.f271g = this.f271g;
        this.f270f = null;
        this.f271g = null;
        return c0086q;
    }

    /* renamed from: b */
    public final void m348b(p010B3.C0086q c0086q) {
        p154k3.AbstractC1803h.m3779e(c0086q, "segment");
        c0086q.f271g = this;
        c0086q.f270f = this.f270f;
        p010B3.C0086q c0086q2 = this.f270f;
        p154k3.AbstractC1803h.m3776b(c0086q2);
        c0086q2.f271g = c0086q;
        this.f270f = c0086q;
    }

    /* renamed from: c */
    public final p010B3.C0086q m349c() {
        this.f268d = true;
        return new p010B3.C0086q(this.f265a, this.f266b, this.f267c, true);
    }

    /* renamed from: d */
    public final void m350d(p010B3.C0086q c0086q, int i4) {
        p154k3.AbstractC1803h.m3779e(c0086q, "sink");
        if (!c0086q.f269e) {
            throw new java.lang.IllegalStateException("only owner can write");
        }
        int i5 = c0086q.f267c;
        int i6 = i5 + i4;
        byte[] bArr = c0086q.f265a;
        if (i6 > 8192) {
            if (c0086q.f268d) {
                throw new java.lang.IllegalArgumentException();
            }
            int i7 = c0086q.f266b;
            if (i6 - i7 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            p105a3.AbstractC1020c.m2045g0(0, i7, i5, bArr, bArr);
            c0086q.f267c -= c0086q.f266b;
            c0086q.f266b = 0;
        }
        int i8 = c0086q.f267c;
        int i9 = this.f266b;
        p105a3.AbstractC1020c.m2045g0(i8, i9, i9 + i4, this.f265a, bArr);
        c0086q.f267c += i4;
        this.f266b += i4;
    }

    public C0086q(byte[] bArr, int i4, int i5, boolean z4) {
        p154k3.AbstractC1803h.m3779e(bArr, "data");
        this.f265a = bArr;
        this.f266b = i4;
        this.f267c = i5;
        this.f268d = z4;
        this.f269e = false;
    }
}
