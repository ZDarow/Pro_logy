package j;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0348c implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6641l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f6642m;

    public /* synthetic */ RunnableC0348c(ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.f6641l = i4;
        this.f6642m = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6641l) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6642m;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f3784E = actionBarOverlayLayout.f3791n.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3785F);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6642m;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f3784E = actionBarOverlayLayout2.f3791n.animate().translationY(-actionBarOverlayLayout2.f3791n.getHeight()).setListener(actionBarOverlayLayout2.f3785F);
                return;
        }
    }
}
