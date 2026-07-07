package j;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class V implements TextWatcher {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchView f6632l;

    public V(SearchView searchView) {
        this.f6632l = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        SearchView searchView = this.f6632l;
        Editable text = searchView.f3822A.getText();
        searchView.f3853j0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i7 = 8;
        if (searchView.f3852i0 && !searchView.f3845b0 && isEmpty) {
            searchView.f3827F.setVisibility(8);
            i7 = 0;
        }
        searchView.f3829H.setVisibility(i7);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }
}
