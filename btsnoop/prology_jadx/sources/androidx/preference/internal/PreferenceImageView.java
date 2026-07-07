package androidx.preference.internal;

@android.annotation.SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class PreferenceImageView extends android.widget.ImageView {

    /* renamed from: l */
    public int f4387l;

    /* renamed from: m */
    public int f4388m;

    public PreferenceImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4387l = Integer.MAX_VALUE;
        this.f4388m = Integer.MAX_VALUE;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p137h1.AbstractC1502b.f6213h, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f4388m;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f4387l;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int mode = android.view.View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = android.view.View.MeasureSpec.getSize(i4);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i4 = android.view.View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i5);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = android.view.View.MeasureSpec.getSize(i5);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i5 = android.view.View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i4) {
        this.f4388m = i4;
        super.setMaxHeight(i4);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i4) {
        this.f4387l = i4;
        super.setMaxWidth(i4);
    }
}
