package p138h2;

/* renamed from: h2.c */
/* loaded from: classes.dex */
public abstract class AbstractC1505c {

    /* renamed from: a */
    public static final /* synthetic */ int f6219a = 0;

    static {
        java.lang.Math.log(2.0d);
    }

    /* renamed from: a */
    public static boolean m3333a(double d4) {
        if (java.lang.Math.getExponent(d4) > 1023) {
            return false;
        }
        if (d4 != 0.0d) {
            if (!(java.lang.Math.getExponent(d4) <= 1023)) {
                throw new java.lang.IllegalArgumentException("not a normal value");
            }
            int exponent = java.lang.Math.getExponent(d4);
            long doubleToRawLongBits = java.lang.Double.doubleToRawLongBits(d4) & 4503599627370495L;
            if (52 - java.lang.Long.numberOfTrailingZeros(exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L) > java.lang.Math.getExponent(d4)) {
                return false;
            }
        }
        return true;
    }
}
