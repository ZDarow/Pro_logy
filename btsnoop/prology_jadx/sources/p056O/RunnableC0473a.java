package p056O;

/* renamed from: O.a */
/* loaded from: classes.dex */
public final class RunnableC0473a implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f1375l;

    /* renamed from: m */
    public final /* synthetic */ p056O.DialogInterfaceOnCancelListenerC0476d f1376m;

    public /* synthetic */ RunnableC0473a(p056O.DialogInterfaceOnCancelListenerC0476d dialogInterfaceOnCancelListenerC0476d, int i4) {
        this.f1375l = i4;
        this.f1376m = dialogInterfaceOnCancelListenerC0476d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1375l) {
            case 0:
                this.f1376m.f1389u.onDismiss(null);
                return;
            default:
                p056O.DialogInterfaceOnCancelListenerC0476d dialogInterfaceOnCancelListenerC0476d = this.f1376m;
                if (dialogInterfaceOnCancelListenerC0476d.f1383o != null) {
                    if (dialogInterfaceOnCancelListenerC0476d.f1383o == null) {
                        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(8, false);
                        java.lang.Object obj = p056O.DialogInterfaceOnCancelListenerC0476d.f1379y;
                        c1061t.f3861m = obj;
                        c1061t.f3862n = obj;
                        c1061t.f3863o = obj;
                        dialogInterfaceOnCancelListenerC0476d.f1383o = c1061t;
                    }
                    dialogInterfaceOnCancelListenerC0476d.f1383o.getClass();
                    return;
                }
                return;
        }
    }
}
