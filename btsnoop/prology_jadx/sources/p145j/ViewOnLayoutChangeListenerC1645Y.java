package p145j;

/* renamed from: j.Y */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1645Y implements android.view.View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f6890a;

    public ViewOnLayoutChangeListenerC1645Y(androidx.appcompat.widget.SearchView searchView) {
        this.f6890a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        androidx.appcompat.widget.SearchView searchView = this.f6890a;
        android.view.View view2 = searchView.f3967I;
        if (view2.getWidth() > 1) {
            android.content.res.Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f3961C.getPaddingLeft();
            android.graphics.Rect rect = new android.graphics.Rect();
            boolean m3632a = p145j.AbstractC1690v0.m3632a(searchView);
            int dimensionPixelSize = searchView.f3982a0 ? resources.getDimensionPixelSize(com.prology.R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(com.prology.R.dimen.abc_dropdownitem_icon_width) : 0;
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f3959A;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(m3632a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
