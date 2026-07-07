package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public final class RunnableC1067c implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete f4086l;

    public RunnableC1067c(androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete) {
        this.f4086l = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f4086l;
        if (searchAutoComplete.f4001q) {
            ((android.view.inputmethod.InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f4001q = false;
        }
    }
}
