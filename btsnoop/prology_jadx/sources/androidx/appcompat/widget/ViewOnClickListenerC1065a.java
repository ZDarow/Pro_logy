package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1065a implements android.view.View.OnClickListener {

    /* renamed from: l */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f4084l;

    public ViewOnClickListenerC1065a(androidx.appcompat.widget.SearchView searchView) {
        this.f4084l = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.appcompat.widget.SearchView searchView = this.f4084l;
        android.widget.ImageView imageView = searchView.f3963E;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f3959A;
        if (view == imageView) {
            searchView.m2308u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            android.view.View.OnClickListener onClickListener = searchView.f3981W;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f3965G) {
            searchView.m2298k();
            return;
        }
        if (view == searchView.f3964F) {
            searchView.m2302o();
            return;
        }
        if (view != searchView.f3966H) {
            if (view == searchAutoComplete) {
                searchView.m2297j();
                return;
            }
            return;
        }
        android.app.SearchableInfo searchableInfo = searchView.f3994m0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m2296i(searchView.f3978T, searchableInfo));
                }
            } else {
                android.content.Intent intent = new android.content.Intent(searchView.f3977S);
                android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (android.content.ActivityNotFoundException unused) {
            android.util.Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
