package i;

import android.widget.PopupWindow;

/* renamed from: i.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331l implements PopupWindow.OnDismissListener {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0332m f6095l;

    public C0331l(C0332m c0332m) {
        this.f6095l = c0332m;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f6095l.c();
    }
}
