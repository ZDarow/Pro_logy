package b0;

import T.U;
import a.AbstractC0110a;
import java.util.Arrays;
import q0.F;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4326a;

    /* renamed from: b, reason: collision with root package name */
    public final U f4327b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4328c;

    /* renamed from: d, reason: collision with root package name */
    public final F f4329d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4330e;

    /* renamed from: f, reason: collision with root package name */
    public final U f4331f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4332g;

    /* renamed from: h, reason: collision with root package name */
    public final F f4333h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4334i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4335j;

    public C0177a(long j4, U u4, int i4, F f4, long j5, U u5, int i5, F f5, long j6, long j7) {
        this.f4326a = j4;
        this.f4327b = u4;
        this.f4328c = i4;
        this.f4329d = f4;
        this.f4330e = j5;
        this.f4331f = u5;
        this.f4332g = i5;
        this.f4333h = f5;
        this.f4334i = j6;
        this.f4335j = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0177a.class != obj.getClass()) {
            return false;
        }
        C0177a c0177a = (C0177a) obj;
        return this.f4326a == c0177a.f4326a && this.f4328c == c0177a.f4328c && this.f4330e == c0177a.f4330e && this.f4332g == c0177a.f4332g && this.f4334i == c0177a.f4334i && this.f4335j == c0177a.f4335j && AbstractC0110a.v(this.f4327b, c0177a.f4327b) && AbstractC0110a.v(this.f4329d, c0177a.f4329d) && AbstractC0110a.v(this.f4331f, c0177a.f4331f) && AbstractC0110a.v(this.f4333h, c0177a.f4333h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4326a), this.f4327b, Integer.valueOf(this.f4328c), this.f4329d, Long.valueOf(this.f4330e), this.f4331f, Integer.valueOf(this.f4332g), this.f4333h, Long.valueOf(this.f4334i), Long.valueOf(this.f4335j)});
    }
}
