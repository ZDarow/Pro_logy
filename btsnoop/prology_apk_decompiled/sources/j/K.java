package j;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class K implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f6587a;

    public K(M m4) {
        this.f6587a = m4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 1) {
            M m4 = this.f6587a;
            if (m4.f6597G.getInputMethodMode() == 2 || m4.f6597G.getContentView() == null) {
                return;
            }
            Handler handler = m4.f6593C;
            J j4 = m4.f6609y;
            handler.removeCallbacks(j4);
            j4.run();
        }
    }
}
