package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends android.widget.LinearLayout {

    /* renamed from: l */
    public static final int[] f3948l = {android.R.attr.background};

    public ActivityChooserView$InnerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3948l);
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : p126f.AbstractC1367a.m3116a(context, resourceId));
        obtainStyledAttributes.recycle();
    }
}
