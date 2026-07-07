package T;

import B2.AbstractC0007h;
import a.AbstractC0110a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2131a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2132b;

    /* renamed from: c, reason: collision with root package name */
    public final B f2133c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2134d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2135e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2136f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2137g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2138h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2139i;

    static {
        AbstractC0007h.n(0, 1, 2, 3, 4);
        W.y.H(5);
        W.y.H(6);
    }

    public N(Object obj, int i4, B b4, Object obj2, int i5, long j4, long j5, int i6, int i7) {
        this.f2131a = obj;
        this.f2132b = i4;
        this.f2133c = b4;
        this.f2134d = obj2;
        this.f2135e = i5;
        this.f2136f = j4;
        this.f2137g = j5;
        this.f2138h = i6;
        this.f2139i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        N n4 = (N) obj;
        return this.f2132b == n4.f2132b && this.f2135e == n4.f2135e && this.f2136f == n4.f2136f && this.f2137g == n4.f2137g && this.f2138h == n4.f2138h && this.f2139i == n4.f2139i && AbstractC0110a.v(this.f2133c, n4.f2133c) && AbstractC0110a.v(this.f2131a, n4.f2131a) && AbstractC0110a.v(this.f2134d, n4.f2134d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2131a, Integer.valueOf(this.f2132b), this.f2133c, this.f2134d, Integer.valueOf(this.f2135e), Long.valueOf(this.f2136f), Long.valueOf(this.f2137g), Integer.valueOf(this.f2138h), Integer.valueOf(this.f2139i)});
    }
}
