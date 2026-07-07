package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class DialogTitle extends p145j.C1687u {
    public DialogTitle(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p145j.C1687u, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int lineCount;
        super.onMeasure(i4, i5);
        android.text.Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, p121e.AbstractC1299a.f5203s, android.R.attr.textAppearanceMedium, android.R.style.TextAppearance.Medium);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        super.onMeasure(i4, i5);
    }
}
