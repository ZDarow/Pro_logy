package m0;

import java.util.Locale;
import p1.AbstractC0462a;

/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428i {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f7228g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7229a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f7230b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7231c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7232d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7233e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f7234f;

    public C0428i(C0427h c0427h) {
        this.f7229a = c0427h.f7222a;
        this.f7230b = c0427h.f7223b;
        this.f7231c = c0427h.f7224c;
        this.f7232d = c0427h.f7225d;
        this.f7233e = c0427h.f7226e;
        this.f7234f = c0427h.f7227f;
    }

    public static int a(int i4) {
        return AbstractC0462a.F(i4 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0428i.class != obj.getClass()) {
            return false;
        }
        C0428i c0428i = (C0428i) obj;
        return this.f7230b == c0428i.f7230b && this.f7231c == c0428i.f7231c && this.f7229a == c0428i.f7229a && this.f7232d == c0428i.f7232d && this.f7233e == c0428i.f7233e;
    }

    public final int hashCode() {
        int i4 = (((((527 + this.f7230b) * 31) + this.f7231c) * 31) + (this.f7229a ? 1 : 0)) * 31;
        long j4 = this.f7232d;
        return ((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f7233e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f7230b), Integer.valueOf(this.f7231c), Long.valueOf(this.f7232d), Integer.valueOf(this.f7233e), Boolean.valueOf(this.f7229a)};
        int i4 = W.y.f2709a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
