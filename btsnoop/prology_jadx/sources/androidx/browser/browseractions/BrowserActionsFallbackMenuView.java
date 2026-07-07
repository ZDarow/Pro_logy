package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {

    /* renamed from: l */
    public final int f4087l;

    /* renamed from: m */
    public final int f4088m;

    public BrowserActionsFallbackMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4087l = getResources().getDimensionPixelOffset(com.prology.R.dimen.browser_actions_context_menu_min_padding);
        this.f4088m = getResources().getDimensionPixelOffset(com.prology.R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4087l * 2), this.f4088m), 1073741824), i5);
    }
}
