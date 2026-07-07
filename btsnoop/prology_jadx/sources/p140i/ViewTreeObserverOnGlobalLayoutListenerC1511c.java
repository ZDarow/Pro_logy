package p140i;

/* renamed from: i.c */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1511c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: l */
    public final /* synthetic */ int f6233l;

    /* renamed from: m */
    public final /* synthetic */ p140i.AbstractC1519k f6234m;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1511c(p140i.AbstractC1519k abstractC1519k, int i4) {
        this.f6233l = i4;
        this.f6234m = abstractC1519k;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f6233l) {
            case 0:
                p140i.ViewOnKeyListenerC1514f viewOnKeyListenerC1514f = (p140i.ViewOnKeyListenerC1514f) this.f6234m;
                if (viewOnKeyListenerC1514f.mo3345i()) {
                    java.util.ArrayList arrayList = viewOnKeyListenerC1514f.f6257s;
                    if (arrayList.size() <= 0 || ((p140i.C1513e) arrayList.get(0)).f6237a.f6847F) {
                        return;
                    }
                    android.view.View view = viewOnKeyListenerC1514f.f6264z;
                    if (view == null || !view.isShown()) {
                        viewOnKeyListenerC1514f.dismiss();
                        return;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((p140i.C1513e) it.next()).f6237a.mo3341c();
                    }
                    return;
                }
                return;
            default:
                p140i.ViewOnKeyListenerC1526r viewOnKeyListenerC1526r = (p140i.ViewOnKeyListenerC1526r) this.f6234m;
                if (viewOnKeyListenerC1526r.mo3345i()) {
                    p145j.C1637P c1637p = viewOnKeyListenerC1526r.f6344s;
                    if (c1637p.f6847F) {
                        return;
                    }
                    android.view.View view2 = viewOnKeyListenerC1526r.f6349x;
                    if (view2 == null || !view2.isShown()) {
                        viewOnKeyListenerC1526r.dismiss();
                        return;
                    } else {
                        c1637p.mo3341c();
                        return;
                    }
                }
                return;
        }
    }
}
