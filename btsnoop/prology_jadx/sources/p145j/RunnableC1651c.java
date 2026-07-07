package p145j;

/* renamed from: j.c */
/* loaded from: classes.dex */
public final class RunnableC1651c implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f6895l;

    /* renamed from: m */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f6896m;

    public /* synthetic */ RunnableC1651c(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.f6895l = i4;
        this.f6896m = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6895l) {
            case 0:
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f6896m;
                actionBarOverlayLayout.m2285h();
                actionBarOverlayLayout.f3919E = actionBarOverlayLayout.f3926n.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3920F);
                return;
            default:
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6896m;
                actionBarOverlayLayout2.m2285h();
                actionBarOverlayLayout2.f3919E = actionBarOverlayLayout2.f3926n.animate().translationY(-actionBarOverlayLayout2.f3926n.getHeight()).setListener(actionBarOverlayLayout2.f3920F);
                return;
        }
    }
}
