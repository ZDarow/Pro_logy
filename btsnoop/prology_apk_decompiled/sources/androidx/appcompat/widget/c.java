package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f3942l;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f3942l = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f3942l;
        if (searchAutoComplete.f3863q) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f3863q = false;
        }
    }
}
