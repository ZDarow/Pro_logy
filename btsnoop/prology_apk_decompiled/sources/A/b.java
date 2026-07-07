package A;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f0a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f1b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3d;

    public b(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = a.i(textPaint).setBreakStrategy(i4);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i5);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f0a = textPaint;
        this.f1b = textDirectionHeuristic;
        this.f2c = i4;
        this.f3d = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2c == bVar.f2c && this.f3d == bVar.f3d) {
            TextPaint textPaint = this.f0a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = bVar.f0a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f1b == bVar.f1b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f0a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1b, Integer.valueOf(this.f2c), Integer.valueOf(this.f3d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f0a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f1b);
        sb.append(", breakStrategy=" + this.f2c);
        sb.append(", hyphenationFrequency=" + this.f3d);
        sb.append("}");
        return sb.toString();
    }

    public b(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f0a = textPaint;
        textDirection = params.getTextDirection();
        this.f1b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f2c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f3d = hyphenationFrequency;
    }
}
