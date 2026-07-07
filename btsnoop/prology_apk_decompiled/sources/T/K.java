package T;

import java.util.Locale;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: d, reason: collision with root package name */
    public static final K f2126d = new K(1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f2127a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2129c;

    static {
        W.y.H(0);
        W.y.H(1);
    }

    public K(float f4) {
        this(f4, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k4 = (K) obj;
        return this.f2127a == k4.f2127a && this.f2128b == k4.f2128b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2128b) + ((Float.floatToRawIntBits(this.f2127a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f2127a), Float.valueOf(this.f2128b)};
        int i4 = W.y.f2709a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public K(float f4, float f5) {
        W.a.e(f4 > 0.0f);
        W.a.e(f5 > 0.0f);
        this.f2127a = f4;
        this.f2128b = f5;
        this.f2129c = Math.round(f4 * 1000.0f);
    }
}
