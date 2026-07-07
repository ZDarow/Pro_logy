package j;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a0 implements AdapterView.OnItemClickListener {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchView f6639l;

    public a0(SearchView searchView) {
        this.f6639l = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        this.f6639l.l(i4);
    }
}
