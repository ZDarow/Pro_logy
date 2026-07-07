package j;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6633l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SearchView f6634m;

    public /* synthetic */ W(SearchView searchView, int i4) {
        this.f6633l = i4;
        this.f6634m = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6633l) {
            case 0:
                this.f6634m.q();
                return;
            default:
                G.b bVar = this.f6634m.f3846c0;
                if (bVar instanceof h0) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
