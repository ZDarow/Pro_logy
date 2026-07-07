package h2;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5999a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d4) {
        if (Math.getExponent(d4) > 1023) {
            return false;
        }
        if (d4 != 0.0d) {
            if (!(Math.getExponent(d4) <= 1023)) {
                throw new IllegalArgumentException("not a normal value");
            }
            int exponent = Math.getExponent(d4);
            long doubleToRawLongBits = Double.doubleToRawLongBits(d4) & 4503599627370495L;
            if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L) > Math.getExponent(d4)) {
                return false;
            }
        }
        return true;
    }
}
