package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1066b implements android.view.View.OnKeyListener {

    /* renamed from: l */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f4085l;

    public ViewOnKeyListenerC1066b(androidx.appcompat.widget.SearchView searchView) {
        this.f4085l = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i4, android.view.KeyEvent keyEvent) {
        androidx.appcompat.widget.SearchView searchView = this.f4085l;
        if (searchView.f3994m0 == null) {
            return false;
        }
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f3959A;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (android.text.TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.m2295h("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.f3994m0 == null || searchView.f3984c0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i4 == 66 || i4 == 84 || i4 == 61) {
            searchView.m2299l(searchAutoComplete.getListSelection());
        } else {
            if (i4 != 21 && i4 != 22) {
                if (i4 != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(i4 == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            searchAutoComplete.m2309a();
        }
        return true;
    }
}
