package p145j;

/* renamed from: j.K */
/* loaded from: classes.dex */
public final class C1632K implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ p145j.AbstractC1634M f6838a;

    public C1632K(p145j.AbstractC1634M abstractC1634M) {
        this.f6838a = abstractC1634M;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i4) {
        if (i4 == 1) {
            p145j.AbstractC1634M abstractC1634M = this.f6838a;
            if (abstractC1634M.f6848G.getInputMethodMode() == 2 || abstractC1634M.f6848G.getContentView() == null) {
                return;
            }
            android.os.Handler handler = abstractC1634M.f6844C;
            p145j.RunnableC1631J runnableC1631J = abstractC1634M.f6862y;
            handler.removeCallbacks(runnableC1631J);
            runnableC1631J.run();
        }
    }
}
