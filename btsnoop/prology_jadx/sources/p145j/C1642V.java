package p145j;

/* renamed from: j.V */
/* loaded from: classes.dex */
public final class C1642V implements android.text.TextWatcher {

    /* renamed from: l */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f6886l;

    public C1642V(androidx.appcompat.widget.SearchView searchView) {
        this.f6886l = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i4, int i5, int i6) {
        androidx.appcompat.widget.SearchView searchView = this.f6886l;
        android.text.Editable text = searchView.f3959A.getText();
        searchView.f3991j0 = text;
        boolean isEmpty = android.text.TextUtils.isEmpty(text);
        searchView.m2307t(!isEmpty);
        int i7 = 8;
        if (searchView.f3990i0 && !searchView.f3983b0 && isEmpty) {
            searchView.f3964F.setVisibility(8);
            i7 = 0;
        }
        searchView.f3966H.setVisibility(i7);
        searchView.m2303p();
        searchView.m2306s();
        charSequence.toString();
    }
}
