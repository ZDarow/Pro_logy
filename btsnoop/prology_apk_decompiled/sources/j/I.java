package j;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class I implements AdapterView.OnItemSelectedListener {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6583l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6584m;

    public /* synthetic */ I(int i4, Object obj) {
        this.f6583l = i4;
        this.f6584m = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
        O o2;
        switch (this.f6583l) {
            case 0:
                if (i4 == -1 || (o2 = ((M) this.f6584m).f6600n) == null) {
                    return;
                }
                o2.setListSelectionHidden(false);
                return;
            default:
                ((SearchView) this.f6584m).m(i4);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i4 = this.f6583l;
    }
}
