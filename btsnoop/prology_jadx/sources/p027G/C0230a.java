package p027G;

/* renamed from: G.a */
/* loaded from: classes.dex */
public final class C0230a extends android.database.DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ int f660a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f661b;

    public /* synthetic */ C0230a(int i4, java.lang.Object obj) {
        this.f660a = i4;
        this.f661b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f660a) {
            case 0:
                p145j.ViewOnClickListenerC1662h0 viewOnClickListenerC1662h0 = (p145j.ViewOnClickListenerC1662h0) this.f661b;
                viewOnClickListenerC1662h0.f662l = true;
                viewOnClickListenerC1662h0.notifyDataSetChanged();
                return;
            default:
                p145j.AbstractC1634M abstractC1634M = (p145j.AbstractC1634M) this.f661b;
                if (abstractC1634M.f6848G.isShowing()) {
                    abstractC1634M.mo3341c();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f660a) {
            case 0:
                p145j.ViewOnClickListenerC1662h0 viewOnClickListenerC1662h0 = (p145j.ViewOnClickListenerC1662h0) this.f661b;
                viewOnClickListenerC1662h0.f662l = false;
                viewOnClickListenerC1662h0.notifyDataSetInvalidated();
                return;
            default:
                ((p145j.AbstractC1634M) this.f661b).dismiss();
                return;
        }
    }
}
