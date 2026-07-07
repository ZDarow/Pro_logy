package p076T;

/* renamed from: T.K */
/* loaded from: classes.dex */
public final class C0668K {

    /* renamed from: d */
    public static final p076T.C0668K f2206d = new p076T.C0668K(1.0f);

    /* renamed from: a */
    public final float f2207a;

    /* renamed from: b */
    public final float f2208b;

    /* renamed from: c */
    public final int f2209c;

    static {
        p086W.AbstractC0805y.m1587H(0);
        p086W.AbstractC0805y.m1587H(1);
    }

    public C0668K(float f4) {
        this(f4, 1.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0668K.class != obj.getClass()) {
            return false;
        }
        p076T.C0668K c0668k = (p076T.C0668K) obj;
        return this.f2207a == c0668k.f2207a && this.f2208b == c0668k.f2208b;
    }

    public final int hashCode() {
        return java.lang.Float.floatToRawIntBits(this.f2208b) + ((java.lang.Float.floatToRawIntBits(this.f2207a) + 527) * 31);
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = {java.lang.Float.valueOf(this.f2207a), java.lang.Float.valueOf(this.f2208b)};
        int i4 = p086W.AbstractC0805y.f2801a;
        return java.lang.String.format(java.util.Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public C0668K(float f4, float f5) {
        p086W.AbstractC0781a.m1416e(f4 > 0.0f);
        p086W.AbstractC0781a.m1416e(f5 > 0.0f);
        this.f2207a = f4;
        this.f2208b = f5;
        this.f2209c = java.lang.Math.round(f4 * 1000.0f);
    }
}
