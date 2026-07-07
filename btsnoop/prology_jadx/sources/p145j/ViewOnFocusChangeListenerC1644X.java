package p145j;

/* renamed from: j.X */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC1644X implements android.view.View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f6889a;

    public ViewOnFocusChangeListenerC1644X(androidx.appcompat.widget.SearchView searchView) {
        this.f6889a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z4) {
        androidx.appcompat.widget.SearchView searchView = this.f6889a;
        android.view.View.OnFocusChangeListener onFocusChangeListener = searchView.f3980V;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z4);
        }
    }
}
