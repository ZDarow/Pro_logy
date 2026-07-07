package p104a2;

/* renamed from: a2.h */
/* loaded from: classes.dex */
public abstract class AbstractC1010h {

    /* renamed from: a */
    public static final java.text.DecimalFormat f3740a;

    /* renamed from: b */
    public static final java.text.DecimalFormat f3741b;

    static {
        java.util.Locale locale = java.util.Locale.ROOT;
        f3740a = new java.text.DecimalFormat(".000000", java.text.DecimalFormatSymbols.getInstance(locale));
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat(".##", java.text.DecimalFormatSymbols.getInstance(locale));
        f3741b = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.DOWN);
    }
}
