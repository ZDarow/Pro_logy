package i;

import android.view.View;
import android.view.ViewTreeObserver;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0322c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6013l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0330k f6014m;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0322c(AbstractC0330k abstractC0330k, int i4) {
        this.f6013l = i4;
        this.f6014m = abstractC0330k;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f6013l) {
            case 0:
                ViewOnKeyListenerC0325f viewOnKeyListenerC0325f = (ViewOnKeyListenerC0325f) this.f6014m;
                if (viewOnKeyListenerC0325f.i()) {
                    ArrayList arrayList = viewOnKeyListenerC0325f.s;
                    if (arrayList.size() <= 0 || ((C0324e) arrayList.get(0)).f6017a.f6596F) {
                        return;
                    }
                    View view = viewOnKeyListenerC0325f.f6041z;
                    if (view == null || !view.isShown()) {
                        viewOnKeyListenerC0325f.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0324e) it.next()).f6017a.c();
                    }
                    return;
                }
                return;
            default:
                ViewOnKeyListenerC0337r viewOnKeyListenerC0337r = (ViewOnKeyListenerC0337r) this.f6014m;
                if (viewOnKeyListenerC0337r.i()) {
                    P p2 = viewOnKeyListenerC0337r.s;
                    if (p2.f6596F) {
                        return;
                    }
                    View view2 = viewOnKeyListenerC0337r.f6121x;
                    if (view2 == null || !view2.isShown()) {
                        viewOnKeyListenerC0337r.dismiss();
                        return;
                    } else {
                        p2.c();
                        return;
                    }
                }
                return;
        }
    }
}
