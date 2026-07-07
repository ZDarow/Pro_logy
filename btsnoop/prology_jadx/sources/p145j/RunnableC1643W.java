package p145j;

/* renamed from: j.W */
/* loaded from: classes.dex */
public final class RunnableC1643W implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f6887l;

    /* renamed from: m */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f6888m;

    public /* synthetic */ RunnableC1643W(androidx.appcompat.widget.SearchView searchView, int i4) {
        this.f6887l = i4;
        this.f6888m = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6887l) {
            case 0:
                this.f6888m.m2304q();
                return;
            default:
                p027G.AbstractC0231b abstractC0231b = this.f6888m.f3984c0;
                if (abstractC0231b instanceof p145j.ViewOnClickListenerC1662h0) {
                    abstractC0231b.mo613b(null);
                    return;
                }
                return;
        }
    }
}
