package a2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f3616a;

    /* renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f3617b;

    static {
        Locale locale = Locale.ROOT;
        f3616a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f3617b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
