package p001A;

/* renamed from: A.b */
/* loaded from: classes.dex */
public final class C0001b {

    /* renamed from: a */
    public final android.text.TextPaint f0a;

    /* renamed from: b */
    public final android.text.TextDirectionHeuristic f1b;

    /* renamed from: c */
    public final int f2c;

    /* renamed from: d */
    public final int f3d;

    public C0001b(android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
        android.text.PrecomputedText.Params.Builder breakStrategy;
        android.text.PrecomputedText.Params.Builder hyphenationFrequency;
        android.text.PrecomputedText.Params.Builder textDirection;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            breakStrategy = p001A.AbstractC0000a.m12i(textPaint).setBreakStrategy(i4);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i5);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f0a = textPaint;
        this.f1b = textDirectionHeuristic;
        this.f2c = i4;
        this.f3d = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p001A.C0001b)) {
            return false;
        }
        p001A.C0001b c0001b = (p001A.C0001b) obj;
        if (this.f2c == c0001b.f2c && this.f3d == c0001b.f3d) {
            android.text.TextPaint textPaint = this.f0a;
            float textSize = textPaint.getTextSize();
            android.text.TextPaint textPaint2 = c0001b.f0a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && android.text.TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f1b == c0001b.f1b;
        }
        return false;
    }

    public final int hashCode() {
        android.text.TextPaint textPaint = this.f0a;
        return java.util.Objects.hash(java.lang.Float.valueOf(textPaint.getTextSize()), java.lang.Float.valueOf(textPaint.getTextScaleX()), java.lang.Float.valueOf(textPaint.getTextSkewX()), java.lang.Float.valueOf(textPaint.getLetterSpacing()), java.lang.Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), java.lang.Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1b, java.lang.Integer.valueOf(this.f2c), java.lang.Integer.valueOf(this.f3d));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("textSize=");
        android.text.TextPaint textPaint = this.f0a;
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

    public C0001b(android.text.PrecomputedText.Params params) {
        android.text.TextPaint textPaint;
        android.text.TextDirectionHeuristic textDirection;
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
